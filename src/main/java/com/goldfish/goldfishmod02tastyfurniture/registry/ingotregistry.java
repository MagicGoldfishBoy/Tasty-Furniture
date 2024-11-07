package com.goldfish.goldfishmod02tastyfurniture.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

public class ingotregistry {
    public static final DeferredRegister<Item> FOODINGOT = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurniture.MODID);
    
    public static final DeferredHolder<Item, Item> APPLE_INGOT = FOODINGOT.register("apple_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> POTATO_INGOT = FOODINGOT.register("potato_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> BEETROOT_INGOT = FOODINGOT.register("beetroot_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> CARROT_INGOT = FOODINGOT.register("carrot_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> CHORUS_INGOT = FOODINGOT.register("chorus_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> GLOW_BERRY_INGOT = FOODINGOT.register("glow_berry_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> MELON_INGOT = FOODINGOT.register("melon_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> SWEET_BERRY_INGOT = FOODINGOT.register("sweet_berry_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> BROWN_MUSHROOM_INGOT = FOODINGOT.register("brown_mushroom_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> RED_MUSHROOM_INGOT = FOODINGOT.register("red_mushroom_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> PUMPKIN_INGOT = FOODINGOT.register("pumpkin_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> CHICKEN_INGOT = FOODINGOT.register("chicken_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> COD_INGOT = FOODINGOT.register("cod_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> SALMON_INGOT = FOODINGOT.register("salmon_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> TROPICAL_FISH_INGOT = FOODINGOT.register("tropical_fish_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> MUTTON_INGOT = FOODINGOT.register("mutton_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> BEEF_INGOT = FOODINGOT.register("beef_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> PORK_INGOT = FOODINGOT.register("pork_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> RABBIT_INGOT = FOODINGOT.register("rabbit_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> SUGAR_INGOT = FOODINGOT.register("sugar_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> HONEYCOMB_INGOT = FOODINGOT.register("honeycomb_ingot",
    () -> new Item(new Item.Properties()));
}
