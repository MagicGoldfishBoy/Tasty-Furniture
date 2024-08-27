package com.goldfish.goldfishmod02tastyfurniture.item;

import org.slf4j.Logger;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.mojang.logging.LogUtils;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class meatgrinder extends Item{

    public meatgrinder(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack)
    {
            return stack.copy();
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack)
    {
            return true;
    }
    
}
