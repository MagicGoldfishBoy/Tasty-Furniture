package com.goldfish.goldfishmod02tastyfurniture.block;

import java.util.List;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class foodBed extends HorizontalDirectionalBlock {
    public static final MapCodec<foodBed> CODEC = simpleCodec(foodBed::new);
    public static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;
    public static final DirectionProperty HORIZONTALFACING = BlockStateProperties.HORIZONTAL_FACING;

    public foodBed(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(OCCUPIED, Boolean.valueOf(false)).setValue(HORIZONTALFACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(OCCUPIED, HORIZONTALFACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        VoxelShape facing = switch (state.getValue(HORIZONTALFACING)) {
            case Direction.NORTH -> Shapes.box(0.0, 0, -1.0, 1.0, 0.5, 1.0);
            case EAST -> Shapes.box(0.0, 0.0, 0.0, 2.0, 0.5, 1.0); 
            case SOUTH -> Shapes.box(0.0, 0, 0, 1.0, 0.5, 2.0);
            case WEST -> Shapes.box(-1.0, 0.0, 0.0, 1.0, 0.5, 1.0);
            default -> Shapes.box(0.05, 0.25, 0.0, 0.945, 0.75, 0.50);
        };
        return facing;
    }
@Override
protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
    if (pLevel.isClientSide) {
        return InteractionResult.CONSUME;
    } else {
        if (!canSetSpawn(pLevel)) {
            pLevel.removeBlock(pPos, false);
            BlockPos blockpos = pPos.relative(pState.getValue(FACING).getOpposite());
            if (pLevel.getBlockState(blockpos).is(this)) {
                pLevel.removeBlock(blockpos, false);
            }

            Vec3 vec3 = pPos.getCenter();
            pLevel.explode(null, pLevel.damageSources().badRespawnPointExplosion(vec3), null, vec3, 5.0F, true, Level.ExplosionInteraction.BLOCK);
            return InteractionResult.SUCCESS;
        } else if (pState.getValue(OCCUPIED)) {
            if (!this.kickVillagerOutOfBed(pLevel, pPos)) {
                pPlayer.displayClientMessage(Component.translatable("block.minecraft.bed.occupied"), true);
            }
            return InteractionResult.SUCCESS;
        } else {
            pPlayer.startSleepInBed(pPos).ifLeft(sleepResult -> {
                if (sleepResult.getMessage() != null) {
                    pPlayer.displayClientMessage(sleepResult.getMessage(), true);
                }
            });

            // Manually advance the time to day
            if (pLevel instanceof ServerLevel serverLevel) {
                serverLevel.setDayTime(0);  // Set time to day
            }

            return InteractionResult.SUCCESS;
        }
    }
}
 

    // @Override
    // protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
    //     if (pLevel.isClientSide) {
    //         return InteractionResult.CONSUME;
    //     } else {

    //         if (!canSetSpawn(pLevel)) {
    //             pLevel.removeBlock(pPos, false);
    //             BlockPos blockpos = pPos.relative(pState.getValue(FACING).getOpposite());
    //             if (pLevel.getBlockState(blockpos).is(this)) {
    //                 pLevel.removeBlock(blockpos, false);
    //             }

    //             Vec3 vec3 = pPos.getCenter();
    //             pLevel.explode(null, pLevel.damageSources().badRespawnPointExplosion(vec3), null, vec3, 5.0F, true, Level.ExplosionInteraction.BLOCK);
    //             return InteractionResult.SUCCESS;
    //         } else if (pState.getValue(OCCUPIED)) {
    //             if (!this.kickVillagerOutOfBed(pLevel, pPos)) {
    //                 pPlayer.displayClientMessage(Component.translatable("block.minecraft.bed.occupied"), true);
    //             }

    //             return InteractionResult.SUCCESS;
    //         } else {
    //             pPlayer.startSleepInBed(pPos).ifLeft(p_49477_ -> {
    //                 System.out.println(pState);
    //                 if (p_49477_.getMessage() != null) {
    //                     pPlayer.displayClientMessage(p_49477_.getMessage(), true);
    //                 }
    //             });
    //             return InteractionResult.SUCCESS;
    //         }
    //     }
    // }

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
    
}
