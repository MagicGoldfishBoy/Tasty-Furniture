package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import java.util.Random;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class foodsign extends StandingSignBlock {
    public foodsign(BlockBehaviour.Properties properties, WoodType woodType) {
        super(woodType, properties);
        //this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
    }

    //  @Override
    //  public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
    //      return createTickerHelper(type, foodblockregistry.FOODSIGNBLOCKENTITIES.get(), foodsignentity::tick);
    //  }

     @Override
     public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
         return new foodsignentity(pos, state);
 }

     public static class foodwallsign extends WallSignBlock {
         public foodwallsign(BlockBehaviour.Properties properties, WoodType woodType) {
             super(woodType, properties);
         }

    //     @Override
    //     public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
    //         return new foodsignentity(pos, state);
    //     }
    // }

     public static class foodstandingsign extends StandingSignBlock {
         public foodstandingsign(BlockBehaviour.Properties properties, WoodType woodType) {
             super(woodType, properties);
         }

         @Override
         public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
             return new foodsignentity(pos, state);
         }
     }

    // @Override
    // protected MapCodec<? extends SignBlock> codec() {
    //     throw new UnsupportedOperationException("Unimplemented method 'codec'");
    // }

    // @Override
    // public float getYRotationDegrees(BlockState pState) {
    //     throw new UnsupportedOperationException("Unimplemented method 'getYRotationDegrees'");
    // }

    //     @Override
    // protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    //     builder.add(WATERLOGGED);
    // }

    // @Override
    // public BlockState getStateForPlacement(BlockPlaceContext context) {
    //     FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
    //     return this.defaultBlockState().setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
    // }

    // @Override
    // public FluidState getFluidState(BlockState state) {
    //     return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    // }

    // @Override
    // public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
    //     if (state.getValue(WATERLOGGED)) {
    //         world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
    //     }
    //     super.neighborChanged(state, world, pos, block, fromPos, isMoving);
    // }
}}

