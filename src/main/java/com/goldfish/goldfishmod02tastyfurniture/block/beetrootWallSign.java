package com.goldfish.goldfishmod02tastyfurniture.block;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.beetrootSignEntity;
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

public class beetrootWallSign extends WallSignBlock {
    public beetrootWallSign(BlockBehaviour.Properties properties, WoodType woodType) {
        super(woodType, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
    }

   @Override
   public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return createTickerHelper(type, foodblockregistry.BEETROOT_SIGN_ENTITY.get(), beetrootSignEntity::tick);
   }

   @Override
   public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
      return new beetrootSignEntity(pos, state);
    }

   @Override
   protected boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
   return pLevel.getBlockState(pPos.relative(pState.getValue(FACING).getOpposite())) != null;
   }

   @Override
   public String getDescriptionId() {
   return "beetroot_wall_sign";
   }
   
}

