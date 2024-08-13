package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class foodsign extends StandingSignBlock {
    public foodsign(BlockBehaviour.Properties properties, WoodType woodType) {
        super(woodType, properties);
    }
}
