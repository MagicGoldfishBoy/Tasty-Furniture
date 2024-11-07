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

        public static final DeferredHolder<Item, Item> RED_MUSHROOM_NUGGET = FOODNUGGET.register("red_mushroom_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> PUMPKIN_NUGGET = FOODNUGGET.register("pumpkin_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> CHICKEN_NUGGET = FOODNUGGET.register("chicken_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> COD_NUGGET = FOODNUGGET.register("cod_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> SALMON_NUGGET = FOODNUGGET.register("salmon_nugget",
    () -> new Item(new Item.Properties()));
    
        public static final DeferredHolder<Item, Item> TROPICAL_FISH_NUGGET = FOODNUGGET.register("tropical_fish_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> MUTTON_NUGGET = FOODNUGGET.register("mutton_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> BEEF_NUGGET = FOODNUGGET.register("beef_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> PORK_NUGGET = FOODNUGGET.register("pork_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> RABBIT_NUGGET = FOODNUGGET.register("rabbit_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> SUGAR_NUGGET = FOODNUGGET.register("sugar_nugget",
    () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> HONEYCOMB_NUGGET = FOODNUGGET.register("honeycomb_nugget",
    () -> new Item(new Item.Properties()));
    
}
