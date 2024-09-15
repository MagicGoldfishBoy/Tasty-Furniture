package com.goldfish.goldfishmod02tastyfurniture.block;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.appleSignEntity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.potatoSignEntity;
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

public class potatoSign extends StandingSignBlock {
    public potatoSign(BlockBehaviour.Properties properties, WoodType woodType) {
        super(woodType, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
    }

     @Override
     public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
         return createTickerHelper(type, foodblockregistry.POTATO_SIGN_ENTITY.get(), appleSignEntity::tick);
     }

     @Override
     public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new potatoSignEntity(pos, state);
     }
}
