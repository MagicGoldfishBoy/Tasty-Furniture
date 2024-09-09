package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import java.util.Random;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
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
        if (this.getName().toString().matches(".*apple.*")) {return new foodsignentity(pos, state);}
       else if (this.getName().toString().matches(".*potato.*")) {return new potato_sign_entity(pos, state);}
         else return new foodsignentity(pos, state);
     }

    //  @Override
    //  public String getDescriptionId() {
    //  return "apple_sign";
    //  }

     public static class foodstandingsign extends StandingSignBlock {
         public foodstandingsign(BlockBehaviour.Properties properties, WoodType woodType) {
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

        //  @Override
        //  public String getDescriptionId() {
        //  return "apple_standing_sign";
        //  }
     }
}



