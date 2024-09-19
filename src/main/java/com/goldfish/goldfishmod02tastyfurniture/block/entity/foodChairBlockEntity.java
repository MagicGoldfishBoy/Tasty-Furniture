package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class foodChairBlockEntity extends BlockEntity {

    public foodChairBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(foodblockregistry.SMALL_CHAIR_ENTITY.get(), pPos, pBlockState);
    }
    
}