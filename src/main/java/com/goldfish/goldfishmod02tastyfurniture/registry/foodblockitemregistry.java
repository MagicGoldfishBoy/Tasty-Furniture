package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

public class foodblockitemregistry {
    
    public static DeferredRegister<Item> FOODBLOCKITEM = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurniture.MODID);

     public static final DeferredHolder<Item, BlockItem> APPLE_BLOCK_ITEM = FOODBLOCKITEM.register("apple_block_item",
     () -> new BlockItem(foodblockregistry.APPLE_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> POTATO_BLOCK_ITEM = FOODBLOCKITEM.register("potato_block_item",
     () -> new BlockItem(foodblockregistry.POTATO_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEETROOT_BLOCK_ITEM = FOODBLOCKITEM.register("beetroot_block_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CARROT_BLOCK_ITEM = FOODBLOCKITEM.register("carrot_block_item",
     () -> new BlockItem(foodblockregistry.CARROT_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHORUS_BLOCK_ITEM = FOODBLOCKITEM.register("chorus_block_item",
     () -> new BlockItem(foodblockregistry.CHORUS_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_BLOCK_ITEM = FOODBLOCKITEM.register("glow_berry_block_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MELON_BLOCK_ITEM = FOODBLOCKITEM.register("melon_block_item",
     () -> new BlockItem(foodblockregistry.MELON_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_BLOCK_ITEM = FOODBLOCKITEM.register("sweet_berry_block_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_BLOCK_ITEM = FOODBLOCKITEM.register("brown_mushroom_block_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_BLOCK_ITEM = FOODBLOCKITEM.register("red_mushroom_block_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_BLOCK.get(), new BlockItem.Properties()));
}
