package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class foodsignentity extends SignBlockEntity {
    public foodsignentity(BlockPos pos, BlockState state) {
        super(foodblockregistry.FOODSIGNBLOCKENTITIES.get(), pos, state);
    }


     public static void tick(Level level, BlockPos pos, BlockState state, foodsignentity entity) {
         if (level instanceof ServerLevel) {
         }
     }

    
    
}
