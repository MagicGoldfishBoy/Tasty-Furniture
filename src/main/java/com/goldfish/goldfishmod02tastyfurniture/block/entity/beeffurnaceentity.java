package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import org.jetbrains.annotations.NotNull;

import com.goldfish.goldfishmod02tastyfurniture.block.beeffurnace;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class beeffurnaceentity extends AbstractFurnaceBlockEntity {
    public beeffurnaceentity(BlockPos pos, BlockState state) {
        super(foodblockregistry.BEEF_FURNACE_ENTITY.get(), pos, state, RecipeType.SMELTING);
    }

    @Override
    protected @NotNull Component getDefaultName() {
        return Component.translatable("container.beef_furnace");
    }

    @Override
    protected @NotNull AbstractContainerMenu createMenu(int syncId, @NotNull Inventory playerInventory) {
        return new FurnaceMenu(syncId, playerInventory, this, this.dataAccess);
    }

    protected beeffurnace getBlock() {
        return (foodblockregistry.BEEF_FURNACE.get());
    }
}