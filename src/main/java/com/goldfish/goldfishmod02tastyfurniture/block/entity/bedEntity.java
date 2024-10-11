package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class bedEntity extends BlockEntity {
    private DyeColor color;

    public bedEntity(BlockPos pPos, BlockState pBlockState) {
        super(BlockEntityType.BED, pPos, pBlockState);
        this.color = ((BedBlock)pBlockState.getBlock()).getColor();
    }

    public bedEntity(BlockPos pPos, BlockState pBlockState, DyeColor pColor) {
        super(foodblockregistry.FOOD_BED_ENTITY.get(), pPos, pBlockState);
        this.color = pColor;
    }

    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public DyeColor getColor() {
        return this.color;
    }

    public void setColor(DyeColor pColor) {
        this.color = pColor;
    }
}
