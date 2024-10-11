package com.goldfish.goldfishmod02tastyfurniture.block;

import java.util.List;

import javax.annotation.Nullable;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.bedEntity;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapDecoder;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Player.BedSleepingProblem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BedBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class foodBed extends HorizontalDirectionalBlock implements EntityBlock {
    public static final MapCodec<foodBed> CODEC = simpleCodec(foodBed::new);
    public static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;
    public static final DirectionProperty HORIZONTALFACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<BedPart> PART = BlockStateProperties.BED_PART;

    public foodBed(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(OCCUPIED, Boolean.valueOf(false)).setValue(HORIZONTALFACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<foodBed> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(OCCUPIED, HORIZONTALFACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        VoxelShape facing = switch (state.getValue(HORIZONTALFACING)) {
            case Direction.NORTH -> Shapes.box(0.0, 0, 0.0, 1.0, 0.5, 2.0);
            case EAST -> Shapes.box(-1.0, 0.0, 0.0, 1.0, 0.5, 1.0); 
            case SOUTH -> Shapes.box(0.0, 0, -1.0, 1.0, 0.5, 1.0);
            case WEST -> Shapes.box(0.0, 0.0, 0.0, 2.0, 0.5, 1.0);
            default -> Shapes.box(0.05, 0.25, 0.0, 0.945, 0.75, 0.50);
        };
        return facing;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
    return this.getShape(state, world, pos, context);
    }

    @Override
    public boolean isCollisionShapeFullBlock(BlockState state, BlockGetter world, BlockPos pos) {
    return false;
    }

// setting respawn location only works when forced, may need to create method to prevent getting stuck
    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
    if (pLevel instanceof ServerLevel serverLevel) {
        Either<BedSleepingProblem, net.minecraft.util.Unit> sleepResult = pPlayer.startSleepInBed(pPos);

        if (sleepResult.left().isPresent()) {
            ServerPlayer serverPlayer = (ServerPlayer) pPlayer;
            BlockPos spawnPos = pPos.above();
            
            serverPlayer.setRespawnPosition(pLevel.dimension(), spawnPos, 0.0F, true, true);
            Player.BedSleepingProblem problem = sleepResult.left().get();
            pPlayer.displayClientMessage(problem.getMessage(), true);
            return InteractionResult.FAIL;
        }

        if (sleepResult.right().isPresent()) {
            if (!pLevel.isClientSide) {
                ServerPlayer serverPlayer = (ServerPlayer) pPlayer;
                BlockPos spawnPos = pPos.above();
                
                serverPlayer.setRespawnPosition(pLevel.dimension(), spawnPos, 0.0F, true, true);
                
                pLevel.playSound(
                    null,
                    pPos,
                    SoundEvents.WOOL_HIT, 
                    SoundSource.BLOCKS,
                    2.0F,
                    1.0F
                );
                
                serverLevel.setDayTime(0);
                serverLevel.resetWeatherCycle();
            }
            return InteractionResult.SUCCESS;
        }
     }
     return InteractionResult.PASS;
    }

    public static boolean canSetSpawn(Level pLevel) {
     return pLevel.dimensionType().bedWorks();
    }

    private boolean kickVillagerOutOfBed(Level pLevel, BlockPos pPos) {
        List<Villager> list = pLevel.getEntitiesOfClass(Villager.class, new AABB(pPos), LivingEntity::isSleeping);
        if (list.isEmpty()) {
            return false;
        } else {
            list.get(0).stopSleeping();
            return true;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public void fallOn(Level pLevel, BlockState pState, BlockPos pPos, Entity pEntity, float pFallDistance) {
        super.fallOn(pLevel, pState, pPos, pEntity, pFallDistance * 0.5F);
    }

    @Override
    public void updateEntityAfterFallOn(BlockGetter pLevel, Entity pEntity) {
        if (pEntity.isSuppressingBounce()) {
            super.updateEntityAfterFallOn(pLevel, pEntity);
        } else {
            this.bounceUp(pEntity);
        }
    }

    private void bounceUp(Entity pEntity) {
        Vec3 vec3 = pEntity.getDeltaMovement();
        if (vec3.y < 0.0) {
            double d0 = pEntity instanceof LivingEntity ? 1.0 : 0.8;
            pEntity.setDeltaMovement(vec3.x, -vec3.y * 0.66F * d0, vec3.z);
        }
    }

    @Override
    protected RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void setPlacedBy(Level pLevel, BlockPos pPos, BlockState pState, @Nullable LivingEntity pPlacer, ItemStack pStack) {
     //   super.setPlacedBy(pLevel, pPos, pState, pPlacer, pStack);
        if (!pLevel.isClientSide) {
            BlockPos blockpos = pPos.relative(pState.getValue(FACING));
           // pLevel.setBlock(blockpos, pState.setValue(PART, BedPart.HEAD), 3);
            pLevel.blockUpdated(blockpos, Blocks.AIR);
            pState.updateNeighbourShapes(pLevel, blockpos, 3);
        }
        super.setPlacedBy(pLevel, pPos, pState, pPlacer, pStack);
    }

    @Override
    @Nullable
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
      return new bedEntity(pPos, pState, null);
        }
        
    @Override
    protected boolean isPathfindable(BlockState pState, PathComputationType pPathComputationType) {
        return false;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
      BlockPos posAbove = switch (state.getValue(HORIZONTALFACING)) {
      case Direction.NORTH -> pos.south();
      case EAST -> pos.west();
      case SOUTH -> pos.north();
      case WEST -> pos.east();
     default -> pos.north();
    };
    //BlockPos posAbove = pos.north();
    BlockState stateAbove = world.getBlockState(posAbove);

    // Check if the block above is air or some other passable block
    return stateAbove.isAir(); //|| stateAbove.getMaterial().isReplaceable();
   }
}

// private boolean checkBedExists() {
//     // Neo: Overwrite the vanilla instanceof BedBlock check with isBed and fire the CanContinueSleepingEvent.
//     boolean hasBed = this.getSleepingPos().map(pos -> this.level().getBlockState(pos).isBed(this.level(), pos, this)).orElse(false);
//     return net.neoforged.neoforge.event.EventHooks.canEntityContinueSleeping(this, hasBed ? null : Player.BedSleepingProblem.NOT_POSSIBLE_HERE);
// }

// @Override
// public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
//     // Define your VoxelShapes based on the model shape
//     VoxelShape part1 = Block.box(0, 0, 0, 2, 3, 2);   // Based on the "from" and "to" values in your model
//     VoxelShape part2 = Block.box(14, 0, 0, 16, 3, 2);
//     VoxelShape part3 = Block.box(14, 0, 29, 16, 3, 31);
//     VoxelShape part4 = Block.box(0, 0, 29, 2, 3, 31);
//     VoxelShape part5 = Block.box(0, 3, 0, 16, 7, 31);
//     VoxelShape part6 = Block.box(0, 7, 11, 16, 8, 31);
//     // Continue for other parts of the model...

//     // Combine the VoxelShapes to form the complete collision shape
//     VoxelShape completeShape = Shapes.or(part1, part2, part3, part4, part5, part6);
    
//     return completeShape;
// }