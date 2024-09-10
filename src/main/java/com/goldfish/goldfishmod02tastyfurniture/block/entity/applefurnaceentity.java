package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class applefurnaceentity extends BlockEntity {
    public applefurnaceentity(BlockPos pos, BlockState state) {
        super(foodblockregistry.APPLE_FURNACE_ENTITY.get(), pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, applefurnaceentity entity) {
        if (level instanceof ServerLevel) {
            System.out.println("Ticking on ServerSide at " + pos + "like a good boy");
        } else {
            System.out.println("Ticking on ClientSide even though I'M NOT SUPPOSED TOO!!! >:C ");
        }
    }
    
}
