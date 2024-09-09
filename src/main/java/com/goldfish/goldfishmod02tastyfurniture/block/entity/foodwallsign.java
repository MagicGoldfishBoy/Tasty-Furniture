package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class foodwallsign extends WallSignBlock {
     public foodwallsign(BlockBehaviour.Properties properties, WoodType woodType) {
         super(woodType, properties);
         this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
     }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
         return createTickerHelper(type, foodblockregistry.APPLE_SIGN_ENTITY.get(), foodsignentity::tick);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        if (this.getName().toString().matches(".*apple.*")) {return new foodsignentity(pos, state);}
       else if (this.getName().toString().matches(".*potato.*")) {return new potato_sign_entity(pos, state);}
         else return new foodsignentity(pos, state);
     }

    @Override
    protected boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
    return pLevel.getBlockState(pPos.relative(pState.getValue(FACING).getOpposite())) != null;
    }

    @Override
    public String getDescriptionId() {
    return "apple_wall_sign";
    }
    
}