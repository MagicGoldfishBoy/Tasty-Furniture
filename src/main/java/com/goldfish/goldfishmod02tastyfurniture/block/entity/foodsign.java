package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import java.util.Random;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class foodsign extends StandingSignBlock {
    public foodsign(BlockBehaviour.Properties properties, WoodType woodType) {
        super(woodType, properties);
    }

     @Override
     public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
         return createTickerHelper(type, foodblockregistry.FOODSIGNBLOCKENTITIES.get(), foodsignentity::tick);
     }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new foodsignentity(pos, state);
    }

    public static class foodwallsign extends WallSignBlock {
        public foodwallsign(BlockBehaviour.Properties properties, WoodType woodType) {
            super(woodType, properties);
        }

        @Override
        public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
            return new foodsignentity(pos, state);
        }
    }

    public static class foodstandingsign extends StandingSignBlock {
        public foodstandingsign(BlockBehaviour.Properties properties, WoodType woodType) {
            super(woodType, properties);
        }

        @Override
        public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
            return new foodsignentity(pos, state);
        }
    }
}
