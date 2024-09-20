package com.goldfish.goldfishmod02tastyfurniture.block;

import javax.annotation.Nullable;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodChairEntity;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodEntityRegistry;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class foodChairBlock extends HorizontalDirectionalBlock {

    public static final MapCodec<foodChairBlock> CODEC = simpleCodec(foodChairBlock::new);
    public static final DirectionProperty HORIZONTALFACING = BlockStateProperties.HORIZONTAL_FACING;
    private static final VoxelShape SHAPE = Shapes.box(0.0, 0.0, 0.0, 1.0, 0.6, 1.0);

    @Override
    public MapCodec<foodChairBlock> codec() {
        return CODEC;
    }

    public foodChairBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(HORIZONTALFACING, Direction.NORTH));
    }

        @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult result) //trying to sit sends player under map for some reason only computer cthulu knows
    {
        if(player.isCrouching())
        {
            level.playSound(player, pos, SoundEvents.MUD_BRICKS_HIT, SoundSource.BLOCKS, 1.0F, 0.9F + 0.1F * level.random.nextFloat());
            Direction blockDirection = state.getValue(FACING);
            Direction newDirection = blockDirection.getClockWise();
            BlockState newState = state.setValue(FACING, newDirection);
    
            level.setBlock(pos, newState, Block.UPDATE_ALL);
    
            return InteractionResult.CONSUME; 
        }
        else if (!level.isClientSide()) {
          return player.startRiding(this.getChairEntity(level)) ? InteractionResult.CONSUME : InteractionResult.PASS;}
        else //state.getValue(BlockStateProperties.HORIZONTAL_FACING).getOpposite();
        {
            //return InteractionResult.CONSUME;
            return InteractionResult.SUCCESS;
        }
      //  return InteractionResult.SUCCESS;
    }

    public Entity getChairEntity(Level level) {
        return new foodChairEntity(foodEntityRegistry.CHAIR_ENTITY.get(), level);
    }
    // @Override
    // @Nullable
    // public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
    //     return new foodChairBlockEntity(pPos, pState);
    // }

        @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(HORIZONTALFACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        return SHAPE;
    }

    // public static void sitDown(Level level, BlockPos pos, Entity entity) {
    //     if (level.isClientSide) return;

    //     foodChairBlockEntity chair = new foodChairBlockEntity(level, pos);
    //     level.addFreshEntity(chair);
    //     entity.startRiding(chair);

    //     level.updateNeighbourForOutputSignal(pos, level.getBlockState(pos).getBlock());

    //     if (entity instanceof TamableAnimal ta) ta.setInSittingPose(true);
    // }
    
}
