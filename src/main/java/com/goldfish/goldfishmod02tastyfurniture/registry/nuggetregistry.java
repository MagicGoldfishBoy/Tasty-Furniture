package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class nuggetregistry {
    public static final DeferredRegister<Item> FOODNUGGET = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurniture.MODID);

        public static final DeferredHolder<Item, Item> APPLE_NUGGET = FOODNUGGET.register("apple_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> POTATO_NUGGET = FOODNUGGET.register("potato_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> BEETROOT_NUGGET = FOODNUGGET.register("beetroot_nugget",
    () -> new Item(new Item.Properties()));
}
