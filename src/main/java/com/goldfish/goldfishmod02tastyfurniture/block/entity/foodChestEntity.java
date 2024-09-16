package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import org.checkerframework.checker.units.qual.A;
import org.jetbrains.annotations.NotNull;

import com.goldfish.goldfishmod02tastyfurniture.block.foodChest;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class foodChestEntity extends ChestBlockEntity {
    public foodChestEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockEntityType.CHEST, blockPos, blockState);
    }

    @Override
    protected Component getDefaultName() {
        foodChest block = getBlock();
        if (block != null) {
            return Component.translatable(block.chestType + "_chest");
        }
        return Component.translatable("container.generic_chest"); 
    }

    public foodChest getBlock() {
        return foodblockregistry.APPLE_CHEST.get();
        // Block block = getBlockState().getBlock();
        // if (block instanceof foodChest) {
        //     return (foodChest) block;
        // }
        // return null; 
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return foodblockregistry.APPLE_CHEST_ENTITY.get();
    }

  public static void tick(Level level, BlockPos pos, BlockState state, foodChestEntity entity) {
      //    System.out.println("Preparing to tick at " + pos);
          if (level instanceof ServerLevel) {
      //      System.out.println("Ticking at " + pos);
          }
        }
}
// return foodblockregistry.APPLE_CHEST.get();