package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import org.jetbrains.annotations.NotNull;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class salmonSignEntity extends SignBlockEntity {
    public salmonSignEntity(BlockPos pos, BlockState state) {
      super(pos, state);
    }
    @Override
    public @NotNull BlockEntityType<?> getType() {
        return foodblockregistry.SALMON_SIGN_ENTITY.get();
    }
    
  
  public static void tick(Level level, BlockPos pos, BlockState state, salmonSignEntity entity) {
          if (level instanceof ServerLevel) {
          //System.out.println("Ticking at " + pos);
          }
  
  }}
