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

        public static final DeferredHolder<Item, Item> CARROT_NUGGET = FOODNUGGET.register("carrot_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> CHORUS_NUGGET = FOODNUGGET.register("chorus_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> GLOW_BERRY_NUGGET = FOODNUGGET.register("glow_berry_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> MELON_NUGGET = FOODNUGGET.register("melon_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> SWEET_BERRY_NUGGET = FOODNUGGET.register("sweet_berry_nugget",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> BROWN_MUSHROOM_NUGGET = FOODNUGGET.register("brown_mushroom_nugget",
    () -> new Item(new Item.Properties()));
}
