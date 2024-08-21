package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import java.util.Random;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallBlock;
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
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
    }

     @Override
     public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
         return createTickerHelper(type, foodblockregistry.APPLE_SIGN_ENTITY.get(), foodsignentity::tick);
     }

     @Override
     public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
         return new foodsignentity(pos, state);
     }

    //  @Override
    //  public BlockState getStateForPlacement(BlockPlaceContext context) {
    //      FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
    //      return this.defaultBlockState().setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
    //  }

     public static class foodwallsign extends WallSignBlock {
         public foodwallsign(BlockBehaviour.Properties properties, WoodType woodType) {
             super(woodType, properties);
             this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
         }

        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
             return createTickerHelper(type, foodblockregistry.APPLE_SIGN_ENTITY.get(), foodsignentity::tick);
        }

        // @Override
        // public BlockState getStateForPlacement(BlockPlaceContext context) {
        // FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        // Direction facing = context.getClickedFace();
    
        // if (facing.getAxis().isHorizontal()) {
        //     return this.defaultBlockState()
        //                .setValue(FACING, facing)
        //                .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        // } else { 
        //     return this.defaultBlockState()
        //                .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        // }
        // }

        @Override
        public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
            return new foodsignentity(pos, state);
        }

        @Override
        protected boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return pLevel.getBlockState(pPos.relative(pState.getValue(FACING).getOpposite())) != null;
        }
    }

     public static class foodstandingsign extends StandingSignBlock {
         public foodstandingsign(BlockBehaviour.Properties properties, WoodType woodType) {
             super(woodType, properties);
             this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
         }

         @Override
         public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
              return createTickerHelper(type, foodblockregistry.APPLE_SIGN_ENTITY.get(), foodsignentity::tick);
         }

        //  @Override
        //  public BlockState getStateForPlacement(BlockPlaceContext context) {
        //      FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        //      return this.defaultBlockState().setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        //  }

         @Override
         public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
             return new foodsignentity(pos, state);
         }
     }
}



