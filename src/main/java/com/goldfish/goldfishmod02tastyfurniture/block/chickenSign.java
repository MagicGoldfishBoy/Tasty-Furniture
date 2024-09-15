package com.goldfish.goldfishmod02tastyfurniture.block;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.chickenSignEntity;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class chickenSign extends StandingSignBlock {
    public chickenSign(BlockBehaviour.Properties properties, WoodType woodType) {
        super(woodType, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
    }

     @Override
     public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
         return createTickerHelper(type, foodblockregistry.CHICKEN_SIGN_ENTITY.get(), chickenSignEntity::tick);
     }

     @Override
     public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new chickenSignEntity(pos, state);
     }
}
