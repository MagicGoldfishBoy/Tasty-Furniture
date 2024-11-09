package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

public class foodblockitemregistry {
    
    public static DeferredRegister<Item> FOODBLOCKITEM = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurniture.MODID);


//==============================================================================================================================================================================================
//                                                                                         Blocks
//==============================================================================================================================================================================================

 //------------------------------------------------------------------------------------Regular Blocks-------------------------------------------------------------------------------------------
  //.........apple
     public static final DeferredHolder<Item, BlockItem> APPLE_BLOCK_ITEM = FOODBLOCKITEM.register("apple_block_item",
     () -> new BlockItem(foodblockregistry.APPLE_BLOCK.get(), new BlockItem.Properties()));
  //.........potato
     public static final DeferredHolder<Item, BlockItem> POTATO_BLOCK_ITEM = FOODBLOCKITEM.register("potato_block_item",
     () -> new BlockItem(foodblockregistry.POTATO_BLOCK.get(), new BlockItem.Properties()));
  //.........beetroot
     public static final DeferredHolder<Item, BlockItem> BEETROOT_BLOCK_ITEM = FOODBLOCKITEM.register("beetroot_block_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_BLOCK.get(), new BlockItem.Properties()));
  //.........carrot
     public static final DeferredHolder<Item, BlockItem> CARROT_BLOCK_ITEM = FOODBLOCKITEM.register("carrot_block_item",
     () -> new BlockItem(foodblockregistry.CARROT_BLOCK.get(), new BlockItem.Properties()));
  //.........chorus
     public static final DeferredHolder<Item, BlockItem> CHORUS_BLOCK_ITEM = FOODBLOCKITEM.register("chorus_block_item",
     () -> new BlockItem(foodblockregistry.CHORUS_BLOCK.get(), new BlockItem.Properties()));
  //.........glow_berry
     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_BLOCK_ITEM = FOODBLOCKITEM.register("glow_berry_block_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........melon
     public static final DeferredHolder<Item, BlockItem> MELON_BLOCK_ITEM = FOODBLOCKITEM.register("melon_block_item",
     () -> new BlockItem(foodblockregistry.MELON_BLOCK.get(), new BlockItem.Properties()));
  //.........sweet_berry
     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_BLOCK_ITEM = FOODBLOCKITEM.register("sweet_berry_block_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........brown_mushroom
     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_BLOCK_ITEM = FOODBLOCKITEM.register("brown_mushroom_block_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_BLOCK.get(), new BlockItem.Properties()));
  //.........red_mushroom
     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_BLOCK_ITEM = FOODBLOCKITEM.register("red_mushroom_block_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_BLOCK.get(), new BlockItem.Properties()));
  //.........pumpkin
     public static final DeferredHolder<Item, BlockItem> PUMPKIN_BLOCK_ITEM = FOODBLOCKITEM.register("pumpkin_block_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_BLOCK.get(), new BlockItem.Properties()));
  //.........chicken
     public static final DeferredHolder<Item, BlockItem> CHICKEN_BLOCK_ITEM = FOODBLOCKITEM.register("chicken_block_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_BLOCK.get(), new BlockItem.Properties()));
  //.........cod
     public static final DeferredHolder<Item, BlockItem> COD_BLOCK_ITEM = FOODBLOCKITEM.register("cod_block_item",
     () -> new BlockItem(foodblockregistry.COD_BLOCK.get(), new BlockItem.Properties()));
  //.........salmon
     public static final DeferredHolder<Item, BlockItem> SALMON_BLOCK_ITEM = FOODBLOCKITEM.register("salmon_block_item",
     () -> new BlockItem(foodblockregistry.SALMON_BLOCK.get(), new BlockItem.Properties()));
  //.........tropical_fish
     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_BLOCK_ITEM = FOODBLOCKITEM.register("tropical_fish_block_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_BLOCK.get(), new BlockItem.Properties()));
  //.........mutton
     public static final DeferredHolder<Item, BlockItem> MUTTON_BLOCK_ITEM = FOODBLOCKITEM.register("mutton_block_item",
     () -> new BlockItem(foodblockregistry.MUTTON_BLOCK.get(), new BlockItem.Properties()));
  //.........beef
     public static final DeferredHolder<Item, BlockItem> BEEF_BLOCK_ITEM = FOODBLOCKITEM.register("beef_block_item",
     () -> new BlockItem(foodblockregistry.BEEF_BLOCK.get(), new BlockItem.Properties()));
  //.........pork
     public static final DeferredHolder<Item, BlockItem> PORK_BLOCK_ITEM = FOODBLOCKITEM.register("pork_block_item",
     () -> new BlockItem(foodblockregistry.PORK_BLOCK.get(), new BlockItem.Properties()));
  //.........rabbit
     public static final DeferredHolder<Item, BlockItem> RABBIT_BLOCK_ITEM = FOODBLOCKITEM.register("rabbit_block_item",
     () -> new BlockItem(foodblockregistry.RABBIT_BLOCK.get(), new BlockItem.Properties()));
  //.........sugar
     public static final DeferredHolder<Item, BlockItem> SUGAR_BLOCK_ITEM = FOODBLOCKITEM.register("sugar_block_item",
     () -> new BlockItem(foodblockregistry.SUGAR_BLOCK.get(), new BlockItem.Properties()));
  //.........honeycomb
     public static final DeferredHolder<Item, BlockItem> PROCESSED_HONEYCOMB_BLOCK_ITEM = FOODBLOCKITEM.register("processed_honeycomb_block_item",
     () -> new BlockItem(foodblockregistry.PROCESSED_HONEYCOMB_BLOCK.get(), new BlockItem.Properties()));
    
 // -------------------------------------------------------------------------------------Brick Blocks--------------------------------------------------------------------------------------------
  //.........apple
     public static final DeferredHolder<Item, BlockItem> APPLE_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("apple_bricks_block_item",
     () -> new BlockItem(foodblockregistry.APPLE_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........potato
     public static final DeferredHolder<Item, BlockItem> POTATO_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("potato_bricks_block_item",
     () -> new BlockItem(foodblockregistry.POTATO_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........beetroot
     public static final DeferredHolder<Item, BlockItem> BEETROOT_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("beetroot_bricks_block_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........carrot
     public static final DeferredHolder<Item, BlockItem> CARROT_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("carrot_bricks_block_item",
     () -> new BlockItem(foodblockregistry.CARROT_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chorus
     public static final DeferredHolder<Item, BlockItem> CHORUS_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("chorus_bricks_block_item",
     () -> new BlockItem(foodblockregistry.CHORUS_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........glow_berry
     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("glow_berry_bricks_block_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........melon
     public static final DeferredHolder<Item, BlockItem> MELON_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("melon_bricks_block_item",
     () -> new BlockItem(foodblockregistry.MELON_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........sweet_berry
     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("sweet_berry_bricks_block_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........brown_mushroom
     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("brown_mushroom_bricks_block_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........red_mushroom
     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("red_mushroom_bricks_block_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........pumpkin
     public static final DeferredHolder<Item, BlockItem> PUMPKIN_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("pumpkin_bricks_block_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chicken
     public static final DeferredHolder<Item, BlockItem> CHICKEN_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("chicken_bricks_block_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........cod
     public static final DeferredHolder<Item, BlockItem> COD_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("cod_bricks_block_item",
     () -> new BlockItem(foodblockregistry.COD_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........salmon
     public static final DeferredHolder<Item, BlockItem> SALMON_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("salmon_bricks_block_item",
     () -> new BlockItem(foodblockregistry.SALMON_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........tropical_fish
     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("tropical_fish_bricks_block_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........mutton
     public static final DeferredHolder<Item, BlockItem> MUTTON_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("mutton_bricks_block_item",
     () -> new BlockItem(foodblockregistry.MUTTON_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........beef
     public static final DeferredHolder<Item, BlockItem> BEEF_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("beef_bricks_block_item",
     () -> new BlockItem(foodblockregistry.BEEF_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........pork
     public static final DeferredHolder<Item, BlockItem> PORK_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("pork_bricks_block_item",
     () -> new BlockItem(foodblockregistry.PORK_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........rabbit
     public static final DeferredHolder<Item, BlockItem> RABBIT_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("rabbit_bricks_block_item",
     () -> new BlockItem(foodblockregistry.RABBIT_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........sugar
     public static final DeferredHolder<Item, BlockItem> SUGAR_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("sugar_bricks_block_item",
     () -> new BlockItem(foodblockregistry.SUGAR_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........honeycomb
     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("honeycomb_bricks_block_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_BRICKS_BLOCK.get(), new BlockItem.Properties()));
 //-----------------------------------------------------------------------------------Chiseled Blocks-------------------------------------------------------------------------------------------
  //.........apple
     public static final DeferredHolder<Item, BlockItem> APPLE_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("apple_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.APPLE_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........potato
     public static final DeferredHolder<Item, BlockItem> POTATO_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("potato_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.POTATO_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........beetroot
     public static final DeferredHolder<Item, BlockItem> BEETROOT_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("beetroot_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........carrot
     public static final DeferredHolder<Item, BlockItem> CARROT_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("carrot_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.CARROT_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........chorus
     public static final DeferredHolder<Item, BlockItem> CHORUS_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("chorus_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.CHORUS_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........glow_berry
     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("glow_berry_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........melon
     public static final DeferredHolder<Item, BlockItem> MELON_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("melon_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.MELON_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........sweet_berry
     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("sweet_berry_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........brown_mushroom
     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("brown_mushroom_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........red_mushroom
     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("red_mushroom_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........pumpkin
     public static final DeferredHolder<Item, BlockItem> PUMPKIN_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("pumpkin_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........chicken
     public static final DeferredHolder<Item, BlockItem> CHICKEN_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("chicken_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........cod
     public static final DeferredHolder<Item, BlockItem> COD_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("cod_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.COD_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........salmon
     public static final DeferredHolder<Item, BlockItem> SALMON_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("salmon_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.SALMON_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tropical_fish
     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("tropical_fish_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........mutton
     public static final DeferredHolder<Item, BlockItem> MUTTON_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("mutton_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.MUTTON_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........beef
     public static final DeferredHolder<Item, BlockItem> BEEF_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("beef_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.BEEF_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........pork
     public static final DeferredHolder<Item, BlockItem> PORK_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("pork_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.PORK_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........rabbit
     public static final DeferredHolder<Item, BlockItem> RABBIT_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("rabbit_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.RABBIT_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........sugar
     public static final DeferredHolder<Item, BlockItem> SUGAR_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("sugar_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.SUGAR_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........honeycomb
     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("honeycomb_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_CHISELED_BLOCK.get(), new BlockItem.Properties()));

 //------------------------------------------------------------------------------------Tile Blocks-------------------------------------------------------------------------------------------
  //.........apple
     public static final DeferredHolder<Item, BlockItem> APPLE_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("apple_tile_block_item",
     () -> new BlockItem(foodblockregistry.APPLE_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........potato
     public static final DeferredHolder<Item, BlockItem> POTATO_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("potato_tile_block_item",
     () -> new BlockItem(foodblockregistry.POTATO_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........beetroot
     public static final DeferredHolder<Item, BlockItem> BEETROOT_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("beetroot_tile_block_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........carrot
     public static final DeferredHolder<Item, BlockItem> CARROT_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("carrot_tile_block_item",
     () -> new BlockItem(foodblockregistry.CARROT_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........chorus
     public static final DeferredHolder<Item, BlockItem> CHORUS_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("chorus_tile_block_item",
     () -> new BlockItem(foodblockregistry.CHORUS_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........glow_berry
     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("glow_berry_tile_block_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........melon
     public static final DeferredHolder<Item, BlockItem> MELON_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("melon_tile_block_item",
     () -> new BlockItem(foodblockregistry.MELON_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........sweet_berry
     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("sweet_berry_tile_block_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........brown_mushroom
     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("brown_mushroom_tile_block_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........red_mushroom
     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("red_mushroom_tile_block_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........pumpkin
     public static final DeferredHolder<Item, BlockItem> PUMPKIN_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("pumpkin_tile_block_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........chicken
     public static final DeferredHolder<Item, BlockItem> CHICKEN_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("chicken_tile_block_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........cod
     public static final DeferredHolder<Item, BlockItem> COD_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("cod_tile_block_item",
     () -> new BlockItem(foodblockregistry.COD_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........salmon
     public static final DeferredHolder<Item, BlockItem> SALMON_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("salmon_tile_block_item",
     () -> new BlockItem(foodblockregistry.SALMON_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........tropical_fish
     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("tropical_fish_tile_block_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........mutton
     public static final DeferredHolder<Item, BlockItem> MUTTON_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("mutton_tile_block_item",
     () -> new BlockItem(foodblockregistry.MUTTON_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........beef
     public static final DeferredHolder<Item, BlockItem> BEEF_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("beef_tile_block_item",
     () -> new BlockItem(foodblockregistry.BEEF_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........pork
     public static final DeferredHolder<Item, BlockItem> PORK_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("pork_tile_block_item",
     () -> new BlockItem(foodblockregistry.PORK_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........rabbit
     public static final DeferredHolder<Item, BlockItem> RABBIT_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("rabbit_tile_block_item",
     () -> new BlockItem(foodblockregistry.RABBIT_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........sugar
     public static final DeferredHolder<Item, BlockItem> SUGAR_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("sugar_tile_block_item",
     () -> new BlockItem(foodblockregistry.SUGAR_TILE_BLOCK.get(), new BlockItem.Properties()));
  //.........honeycomb
     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_TILE_BLOCK_ITEM = FOODBLOCKITEM.register("honeycomb_tile_block_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_TILE_BLOCK.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Doors
//==============================================================================================================================================================================================

     public static final DeferredHolder<Item, BlockItem> APPLE_DOOR_ITEM = FOODBLOCKITEM.register("apple_door_item",
     () -> new BlockItem(foodblockregistry.APPLE_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> POTATO_DOOR_ITEM = FOODBLOCKITEM.register("potato_door_item",
     () -> new BlockItem(foodblockregistry.POTATO_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEETROOT_DOOR_ITEM = FOODBLOCKITEM.register("beetroot_door_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CARROT_DOOR_ITEM = FOODBLOCKITEM.register("carrot_door_item",
     () -> new BlockItem(foodblockregistry.CARROT_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHORUS_DOOR_ITEM = FOODBLOCKITEM.register("chorus_door_item",
     () -> new BlockItem(foodblockregistry.CHORUS_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_DOOR_ITEM = FOODBLOCKITEM.register("glow_berry_door_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MELON_DOOR_ITEM = FOODBLOCKITEM.register("melon_door_item",
     () -> new BlockItem(foodblockregistry.MELON_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_DOOR_ITEM = FOODBLOCKITEM.register("sweet_berry_door_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_DOOR_ITEM = FOODBLOCKITEM.register("brown_mushroom_door_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_DOOR_ITEM = FOODBLOCKITEM.register("red_mushroom_door_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PUMPKIN_DOOR_ITEM = FOODBLOCKITEM.register("pumpkin_door_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHICKEN_DOOR_ITEM = FOODBLOCKITEM.register("chicken_door_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> COD_DOOR_ITEM = FOODBLOCKITEM.register("cod_door_item",
     () -> new BlockItem(foodblockregistry.COD_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SALMON_DOOR_ITEM = FOODBLOCKITEM.register("salmon_door_item",
     () -> new BlockItem(foodblockregistry.SALMON_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_DOOR_ITEM = FOODBLOCKITEM.register("tropical_fish_door_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MUTTON_DOOR_ITEM = FOODBLOCKITEM.register("mutton_door_item",
     () -> new BlockItem(foodblockregistry.MUTTON_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEEF_DOOR_ITEM = FOODBLOCKITEM.register("beef_door_item",
     () -> new BlockItem(foodblockregistry.BEEF_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PORK_DOOR_ITEM = FOODBLOCKITEM.register("pork_door_item",
     () -> new BlockItem(foodblockregistry.PORK_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RABBIT_DOOR_ITEM = FOODBLOCKITEM.register("rabbit_door_item",
     () -> new BlockItem(foodblockregistry.RABBIT_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SUGAR_DOOR_ITEM = FOODBLOCKITEM.register("sugar_door_item",
     () -> new BlockItem(foodblockregistry.SUGAR_DOOR_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_DOOR_ITEM = FOODBLOCKITEM.register("honeycomb_door_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_DOOR_BLOCK.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Buttons
//==============================================================================================================================================================================================

     public static final DeferredHolder<Item, BlockItem> APPLE_BUTTON_ITEM = FOODBLOCKITEM.register("apple_button_item",
     () -> new BlockItem(foodblockregistry.APPLE_BUTTON.get(), new BlockItem.Properties()));
     
     public static final DeferredHolder<Item, BlockItem> POTATO_BUTTON_ITEM = FOODBLOCKITEM.register("potato_button_item",
     () -> new BlockItem(foodblockregistry.POTATO_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEETROOT_BUTTON_ITEM = FOODBLOCKITEM.register("beetroot_button_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CARROT_BUTTON_ITEM = FOODBLOCKITEM.register("carrot_button_item",
     () -> new BlockItem(foodblockregistry.CARROT_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHORUS_BUTTON_ITEM = FOODBLOCKITEM.register("chorus_button_item",
     () -> new BlockItem(foodblockregistry.CHORUS_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_BUTTON_ITEM = FOODBLOCKITEM.register("glow_berry_button_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MELON_BUTTON_ITEM = FOODBLOCKITEM.register("melon_button_item",
     () -> new BlockItem(foodblockregistry.MELON_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_BUTTON_ITEM = FOODBLOCKITEM.register("sweet_berry_button_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_BUTTON_ITEM = FOODBLOCKITEM.register("brown_mushroom_button_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_BUTTON_ITEM = FOODBLOCKITEM.register("red_mushroom_button_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PUMPKIN_BUTTON_ITEM = FOODBLOCKITEM.register("pumpkin_button_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHICKEN_BUTTON_ITEM = FOODBLOCKITEM.register("chicken_button_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> COD_BUTTON_ITEM = FOODBLOCKITEM.register("cod_button_item",
     () -> new BlockItem(foodblockregistry.COD_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SALMON_BUTTON_ITEM = FOODBLOCKITEM.register("salmon_button_item",
     () -> new BlockItem(foodblockregistry.SALMON_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_BUTTON_ITEM = FOODBLOCKITEM.register("tropical_fish_button_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MUTTON_BUTTON_ITEM = FOODBLOCKITEM.register("mutton_button_item",
     () -> new BlockItem(foodblockregistry.MUTTON_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEEF_BUTTON_ITEM = FOODBLOCKITEM.register("beef_button_item",
     () -> new BlockItem(foodblockregistry.BEEF_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PORK_BUTTON_ITEM = FOODBLOCKITEM.register("pork_button_item",
     () -> new BlockItem(foodblockregistry.PORK_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RABBIT_BUTTON_ITEM = FOODBLOCKITEM.register("rabbit_button_item",
     () -> new BlockItem(foodblockregistry.RABBIT_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SUGAR_BUTTON_ITEM = FOODBLOCKITEM.register("sugar_button_item",
     () -> new BlockItem(foodblockregistry.SUGAR_BUTTON.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_BUTTON_ITEM = FOODBLOCKITEM.register("honeycomb_button_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_BUTTON.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Fences
//==============================================================================================================================================================================================

     public static final DeferredHolder<Item, BlockItem> APPLE_FENCE_ITEM = FOODBLOCKITEM.register("apple_fence_item",
     () -> new BlockItem(foodblockregistry.APPLE_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> POTATO_FENCE_ITEM = FOODBLOCKITEM.register("potato_fence_item",
     () -> new BlockItem(foodblockregistry.POTATO_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEETROOT_FENCE_ITEM = FOODBLOCKITEM.register("beetroot_fence_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CARROT_FENCE_ITEM = FOODBLOCKITEM.register("carrot_fence_item",
     () -> new BlockItem(foodblockregistry.CARROT_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHORUS_FENCE_ITEM = FOODBLOCKITEM.register("chorus_fence_item",
     () -> new BlockItem(foodblockregistry.CHORUS_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_FENCE_ITEM = FOODBLOCKITEM.register("glow_berry_fence_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MELON_FENCE_ITEM = FOODBLOCKITEM.register("melon_fence_item",
     () -> new BlockItem(foodblockregistry.MELON_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_FENCE_ITEM = FOODBLOCKITEM.register("sweet_berry_fence_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_FENCE_ITEM = FOODBLOCKITEM.register("brown_mushroom_fence_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_FENCE_ITEM = FOODBLOCKITEM.register("red_mushroom_fence_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PUMPKIN_FENCE_ITEM = FOODBLOCKITEM.register("pumpkin_fence_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHICKEN_FENCE_ITEM = FOODBLOCKITEM.register("chicken_fence_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> COD_FENCE_ITEM = FOODBLOCKITEM.register("cod_fence_item",
     () -> new BlockItem(foodblockregistry.COD_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SALMON_FENCE_ITEM = FOODBLOCKITEM.register("salmon_fence_item",
     () -> new BlockItem(foodblockregistry.SALMON_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_FENCE_ITEM = FOODBLOCKITEM.register("tropical_fish_fence_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MUTTON_FENCE_ITEM = FOODBLOCKITEM.register("mutton_fence_item",
     () -> new BlockItem(foodblockregistry.MUTTON_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEEF_FENCE_ITEM = FOODBLOCKITEM.register("beef_fence_item",
     () -> new BlockItem(foodblockregistry.BEEF_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PORK_FENCE_ITEM = FOODBLOCKITEM.register("pork_fence_item",
     () -> new BlockItem(foodblockregistry.PORK_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RABBIT_FENCE_ITEM = FOODBLOCKITEM.register("rabbit_fence_item",
     () -> new BlockItem(foodblockregistry.RABBIT_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SUGAR_FENCE_ITEM = FOODBLOCKITEM.register("sugar_fence_item",
     () -> new BlockItem(foodblockregistry.SUGAR_FENCE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_FENCE_ITEM = FOODBLOCKITEM.register("honeycomb_fence_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_FENCE.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Gates
//==============================================================================================================================================================================================

     public static final DeferredHolder<Item, BlockItem> APPLE_GATE_ITEM = FOODBLOCKITEM.register("apple_gate_item",
     () -> new BlockItem(foodblockregistry.APPLE_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> POTATO_GATE_ITEM = FOODBLOCKITEM.register("potato_gate_item",
     () -> new BlockItem(foodblockregistry.POTATO_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEETROOT_GATE_ITEM = FOODBLOCKITEM.register("beetroot_gate_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CARROT_GATE_ITEM = FOODBLOCKITEM.register("carrot_gate_item",
     () -> new BlockItem(foodblockregistry.CARROT_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHORUS_GATE_ITEM = FOODBLOCKITEM.register("chorus_gate_item",
     () -> new BlockItem(foodblockregistry.CHORUS_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_GATE_ITEM = FOODBLOCKITEM.register("glow_berry_gate_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MELON_GATE_ITEM = FOODBLOCKITEM.register("melon_gate_item",
     () -> new BlockItem(foodblockregistry.MELON_GATE.get(), new BlockItem.Properties()));
     
     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_GATE_ITEM = FOODBLOCKITEM.register("sweet_berry_gate_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_GATE_ITEM = FOODBLOCKITEM.register("brown_mushroom_gate_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_GATE_ITEM = FOODBLOCKITEM.register("red_mushroom_gate_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PUMPKIN_GATE_ITEM = FOODBLOCKITEM.register("pumpkin_gate_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHICKEN_GATE_ITEM = FOODBLOCKITEM.register("chicken_gate_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> COD_GATE_ITEM = FOODBLOCKITEM.register("cod_gate_item",
     () -> new BlockItem(foodblockregistry.COD_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SALMON_GATE_ITEM = FOODBLOCKITEM.register("salmon_gate_item",
     () -> new BlockItem(foodblockregistry.SALMON_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_GATE_ITEM = FOODBLOCKITEM.register("tropical_fish_gate_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MUTTON_GATE_ITEM = FOODBLOCKITEM.register("mutton_gate_item",
     () -> new BlockItem(foodblockregistry.MUTTON_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEEF_GATE_ITEM = FOODBLOCKITEM.register("beef_gate_item",
     () -> new BlockItem(foodblockregistry.BEEF_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PORK_GATE_ITEM = FOODBLOCKITEM.register("pork_gate_item",
     () -> new BlockItem(foodblockregistry.PORK_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RABBIT_GATE_ITEM = FOODBLOCKITEM.register("rabbit_gate_item",
     () -> new BlockItem(foodblockregistry.RABBIT_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SUGAR_GATE_ITEM = FOODBLOCKITEM.register("sugar_gate_item",
     () -> new BlockItem(foodblockregistry.SUGAR_GATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_GATE_ITEM = FOODBLOCKITEM.register("honeycomb_gate_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_GATE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                      Pressure Plates
//==============================================================================================================================================================================================

     public static final DeferredHolder<Item, BlockItem> APPLE_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("apple_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.APPLE_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> POTATO_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("potato_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.POTATO_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEETROOT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("beetroot_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CARROT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("carrot_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.CARROT_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHORUS_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("chorus_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.CHORUS_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("glow_berry_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MELON_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("melon_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.MELON_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("sweet_berry_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("brown_mushroom_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("red_mushroom_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PUMPKIN_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("pumpkin_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHICKEN_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("chicken_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> COD_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("cod_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.COD_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SALMON_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("salmon_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.SALMON_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("tropical_fish_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MUTTON_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("mutton_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.MUTTON_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEEF_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("beef_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.BEEF_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PORK_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("pork_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.PORK_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RABBIT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("rabbit_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.RABBIT_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SUGAR_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("sugar_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.SUGAR_PRESSURE_PLATE.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("honeycomb_pressure_plate_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_PRESSURE_PLATE.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                          Signs
//==============================================================================================================================================================================================

  //apple
     public static final DeferredHolder<Item, SignItem> APPLE_SIGN_ITEM = FOODBLOCKITEM.register("apple_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.APPLE_STANDING_SIGN.get(), foodblockregistry.APPLE_WALL_SIGN.get()));
  //potato
     public static final DeferredHolder<Item, SignItem> POTATO_SIGN_ITEM = FOODBLOCKITEM.register("potato_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.POTATO_STANDING_SIGN.get(), foodblockregistry.POTATO_WALL_SIGN.get()));
  //beetroot
     public static final DeferredHolder<Item, SignItem> BEETROOT_SIGN_ITEM = FOODBLOCKITEM.register("beetroot_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.BEETROOT_STANDING_SIGN.get(), foodblockregistry.BEETROOT_WALL_SIGN.get()));
  //carrot
     public static final DeferredHolder<Item, SignItem> CARROT_SIGN_ITEM = FOODBLOCKITEM.register("carrot_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.CARROT_STANDING_SIGN.get(), foodblockregistry.CARROT_WALL_SIGN.get()));
  //chorus
     public static final DeferredHolder<Item, SignItem> CHORUS_SIGN_ITEM = FOODBLOCKITEM.register("chorus_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.CHORUS_STANDING_SIGN.get(), foodblockregistry.CHORUS_WALL_SIGN.get()));
  //glowberry
     public static final DeferredHolder<Item, SignItem> GLOWBERRY_SIGN_ITEM = FOODBLOCKITEM.register("glowberry_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.GLOWBERRY_STANDING_SIGN.get(), foodblockregistry.GLOWBERRY_WALL_SIGN.get()));
  //melon
     public static final DeferredHolder<Item, SignItem> MELON_SIGN_ITEM = FOODBLOCKITEM.register("melon_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.MELON_STANDING_SIGN.get(), foodblockregistry.MELON_WALL_SIGN.get()));
  //sweetberry
     public static final DeferredHolder<Item, SignItem> SWEETBERRY_SIGN_ITEM = FOODBLOCKITEM.register("sweetberry_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.SWEETBERRY_STANDING_SIGN.get(), foodblockregistry.SWEETBERRY_WALL_SIGN.get()));
  //brownmushroom
     public static final DeferredHolder<Item, SignItem> BROWNMUSHROOM_SIGN_ITEM = FOODBLOCKITEM.register("brownmushroom_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.BROWNMUSHROOM_STANDING_SIGN.get(), foodblockregistry.BROWNMUSHROOM_WALL_SIGN.get()));
  //redmushroom
     public static final DeferredHolder<Item, SignItem> REDMUSHROOM_SIGN_ITEM = FOODBLOCKITEM.register("redmushroom_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.REDMUSHROOM_STANDING_SIGN.get(), foodblockregistry.REDMUSHROOM_WALL_SIGN.get()));
  //pumpkin
     public static final DeferredHolder<Item, SignItem> PUMPKIN_SIGN_ITEM = FOODBLOCKITEM.register("pumpkin_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.PUMPKIN_STANDING_SIGN.get(), foodblockregistry.PUMPKIN_WALL_SIGN.get()));
  //chicken
     public static final DeferredHolder<Item, SignItem> CHICKEN_SIGN_ITEM = FOODBLOCKITEM.register("chicken_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.CHICKEN_STANDING_SIGN.get(), foodblockregistry.CHICKEN_WALL_SIGN.get()));
  //cod
     public static final DeferredHolder<Item, SignItem> COD_SIGN_ITEM = FOODBLOCKITEM.register("cod_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.COD_STANDING_SIGN.get(), foodblockregistry.COD_WALL_SIGN.get()));
  //salmon
     public static final DeferredHolder<Item, SignItem> SALMON_SIGN_ITEM = FOODBLOCKITEM.register("salmon_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.SALMON_STANDING_SIGN.get(), foodblockregistry.SALMON_WALL_SIGN.get()));
  //tropicalfish
     public static final DeferredHolder<Item, SignItem> TROPICALFISH_SIGN_ITEM = FOODBLOCKITEM.register("tropicalfish_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.TROPICALFISH_STANDING_SIGN.get(), foodblockregistry.TROPICALFISH_WALL_SIGN.get()));
  //mutton
     public static final DeferredHolder<Item, SignItem> MUTTON_SIGN_ITEM = FOODBLOCKITEM.register("mutton_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.MUTTON_STANDING_SIGN.get(), foodblockregistry.MUTTON_WALL_SIGN.get()));
  //beef
     public static final DeferredHolder<Item, SignItem> BEEF_SIGN_ITEM = FOODBLOCKITEM.register("beef_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.BEEF_STANDING_SIGN.get(), foodblockregistry.BEEF_WALL_SIGN.get()));
  //pork
     public static final DeferredHolder<Item, SignItem> PORK_SIGN_ITEM = FOODBLOCKITEM.register("pork_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.PORK_STANDING_SIGN.get(), foodblockregistry.PORK_WALL_SIGN.get()));
  //rabbit
     public static final DeferredHolder<Item, SignItem> RABBIT_SIGN_ITEM = FOODBLOCKITEM.register("rabbit_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.RABBIT_STANDING_SIGN.get(), foodblockregistry.RABBIT_WALL_SIGN.get()));
  //sugar
     public static final DeferredHolder<Item, SignItem> SUGAR_SIGN_ITEM = FOODBLOCKITEM.register("sugar_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.SUGAR_STANDING_SIGN.get(), foodblockregistry.SUGAR_WALL_SIGN.get()));
  //honeycomb
     public static final DeferredHolder<Item, SignItem> HONEYCOMB_SIGN_ITEM = FOODBLOCKITEM.register("honeycomb_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.HONEYCOMB_STANDING_SIGN.get(), foodblockregistry.HONEYCOMB_WALL_SIGN.get()));

//==============================================================================================================================================================================================
//                                                                                          Slabs
//==============================================================================================================================================================================================
 //------------------------------------------------------------------------------------Regular Slabs-------------------------------------------------------------------------------------------
   //.........apple
     public static final DeferredHolder<Item, BlockItem> APPLE_SLAB_ITEM = FOODBLOCKITEM.register("apple_slab_item",
     () -> new BlockItem(foodblockregistry.APPLE_SLAB.get(), new BlockItem.Properties()));
   //.........potato
     public static final DeferredHolder<Item, BlockItem> POTATO_SLAB_ITEM = FOODBLOCKITEM.register("potato_slab_item",
     () -> new BlockItem(foodblockregistry.POTATO_SLAB.get(), new BlockItem.Properties()));
   //.........beetroot
     public static final DeferredHolder<Item, BlockItem> BEETROOT_SLAB_ITEM = FOODBLOCKITEM.register("beetroot_slab_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_SLAB.get(), new BlockItem.Properties()));
   //.........carrot
     public static final DeferredHolder<Item, BlockItem> CARROT_SLAB_ITEM = FOODBLOCKITEM.register("carrot_slab_item",
     () -> new BlockItem(foodblockregistry.CARROT_SLAB.get(), new BlockItem.Properties()));
   //.........chorus
     public static final DeferredHolder<Item, BlockItem> CHORUS_SLAB_ITEM = FOODBLOCKITEM.register("chorus_slab_item",
     () -> new BlockItem(foodblockregistry.CHORUS_SLAB.get(), new BlockItem.Properties()));
   //.........glow_berry
     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_SLAB_ITEM = FOODBLOCKITEM.register("glow_berry_slab_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_SLAB.get(), new BlockItem.Properties()));
   //.........melon
     public static final DeferredHolder<Item, BlockItem> MELON_SLAB_ITEM = FOODBLOCKITEM.register("melon_slab_item",
     () -> new BlockItem(foodblockregistry.MELON_SLAB.get(), new BlockItem.Properties()));
   //.........sweet_berry
     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_SLAB_ITEM = FOODBLOCKITEM.register("sweet_berry_slab_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_SLAB.get(), new BlockItem.Properties()));
   //.........brown_mushroom
     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_SLAB_ITEM = FOODBLOCKITEM.register("brown_mushroom_slab_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_SLAB.get(), new BlockItem.Properties()));
   //.........red_mushroom
     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_SLAB_ITEM = FOODBLOCKITEM.register("red_mushroom_slab_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_SLAB.get(), new BlockItem.Properties()));
   //.........pumpkin
     public static final DeferredHolder<Item, BlockItem> PUMPKIN_SLAB_ITEM = FOODBLOCKITEM.register("pumpkin_slab_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_SLAB.get(), new BlockItem.Properties()));
   //.........chicken
     public static final DeferredHolder<Item, BlockItem> CHICKEN_SLAB_ITEM = FOODBLOCKITEM.register("chicken_slab_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_SLAB.get(), new BlockItem.Properties()));
   //.........cod
     public static final DeferredHolder<Item, BlockItem> COD_SLAB_ITEM = FOODBLOCKITEM.register("cod_slab_item",
     () -> new BlockItem(foodblockregistry.COD_SLAB.get(), new BlockItem.Properties()));
   //.........salmon
     public static final DeferredHolder<Item, BlockItem> SALMON_SLAB_ITEM = FOODBLOCKITEM.register("salmon_slab_item",
     () -> new BlockItem(foodblockregistry.SALMON_SLAB.get(), new BlockItem.Properties()));
   //.........tropical_fish
     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_SLAB_ITEM = FOODBLOCKITEM.register("tropical_fish_slab_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_SLAB.get(), new BlockItem.Properties()));
   //.........mutton
     public static final DeferredHolder<Item, BlockItem> MUTTON_SLAB_ITEM = FOODBLOCKITEM.register("mutton_slab_item",
     () -> new BlockItem(foodblockregistry.MUTTON_SLAB.get(), new BlockItem.Properties()));
   //.........beef
     public static final DeferredHolder<Item, BlockItem> BEEF_SLAB_ITEM = FOODBLOCKITEM.register("beef_slab_item",
     () -> new BlockItem(foodblockregistry.BEEF_SLAB.get(), new BlockItem.Properties()));
   //.........pork
     public static final DeferredHolder<Item, BlockItem> PORK_SLAB_ITEM = FOODBLOCKITEM.register("pork_slab_item",
     () -> new BlockItem(foodblockregistry.PORK_SLAB.get(), new BlockItem.Properties()));
   //.........rabbit
     public static final DeferredHolder<Item, BlockItem> RABBIT_SLAB_ITEM = FOODBLOCKITEM.register("rabbit_slab_item",
     () -> new BlockItem(foodblockregistry.RABBIT_SLAB.get(), new BlockItem.Properties()));
   //.........sugar
     public static final DeferredHolder<Item, BlockItem> SUGAR_SLAB_ITEM = FOODBLOCKITEM.register("sugar_slab_item",
     () -> new BlockItem(foodblockregistry.SUGAR_SLAB.get(), new BlockItem.Properties()));
   //.........honeycomb
     public static final DeferredHolder<Item, BlockItem> PROCESSED_HONEYCOMB_SLAB_ITEM = FOODBLOCKITEM.register("processed_honeycomb_slab_item",
     () -> new BlockItem(foodblockregistry.PROCESSED_HONEYCOMB_SLAB.get(), new BlockItem.Properties()));

 //------------------------------------------------------------------------------------Bricks Slabs-------------------------------------------------------------------------------------------
   //.........apple
      public static final DeferredHolder<Item, BlockItem> APPLE_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("apple_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.APPLE_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........potato
      public static final DeferredHolder<Item, BlockItem> POTATO_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("potato_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.POTATO_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........beetroot
      public static final DeferredHolder<Item, BlockItem> BEETROOT_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("beetroot_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.BEETROOT_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........carrot
      public static final DeferredHolder<Item, BlockItem> CARROT_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("carrot_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.CARROT_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........chorus
      public static final DeferredHolder<Item, BlockItem> CHORUS_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("chorus_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.CHORUS_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........glow_berry
      public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("glow_berry_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.GLOW_BERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........melon
      public static final DeferredHolder<Item, BlockItem> MELON_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("melon_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.MELON_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........sweet_berry
      public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("sweet_berry_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.SWEET_BERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........brown_mushroom
      public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("brown_mushroom_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........red_mushroom
      public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("red_mushroom_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.RED_MUSHROOM_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........pumpkin
      public static final DeferredHolder<Item, BlockItem> PUMPKIN_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("pumpkin_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.PUMPKIN_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........chicken
      public static final DeferredHolder<Item, BlockItem> CHICKEN_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("chicken_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.CHICKEN_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........cod
      public static final DeferredHolder<Item, BlockItem> COD_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("cod_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.COD_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........salmon
      public static final DeferredHolder<Item, BlockItem> SALMON_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("salmon_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.SALMON_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........tropical_fish
      public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("tropical_fish_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.TROPICAL_FISH_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........mutton
      public static final DeferredHolder<Item, BlockItem> MUTTON_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("mutton_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.MUTTON_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........beef
      public static final DeferredHolder<Item, BlockItem> BEEF_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("beef_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.BEEF_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........pork
      public static final DeferredHolder<Item, BlockItem> PORK_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("pork_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.PORK_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........rabbit
      public static final DeferredHolder<Item, BlockItem> RABBIT_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("rabbit_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.RABBIT_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........sugar
      public static final DeferredHolder<Item, BlockItem> SUGAR_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("sugar_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.SUGAR_BRICKS_SLAB.get(), new BlockItem.Properties()));
   //.........honeycomb
      public static final DeferredHolder<Item, BlockItem> HONEYCOMB_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("honeycomb_bricks_slab_item",
      () -> new BlockItem(foodblockregistry.HONEYCOMB_BRICKS_SLAB.get(), new BlockItem.Properties()));


//==============================================================================================================================================================================================
//                                                                                          Stairs
//==============================================================================================================================================================================================

 //------------------------------------------------------------------------------------Regular Stairs-------------------------------------------------------------------------------------------
   //.........apple
     public static final DeferredHolder<Item, BlockItem> APPLE_STAIRS_ITEM = FOODBLOCKITEM.register("apple_stairs_item",
     () -> new BlockItem(foodblockregistry.APPLE_STAIRS.get(), new BlockItem.Properties()));
   //.........potato
     public static final DeferredHolder<Item, BlockItem> POTATO_STAIRS_ITEM = FOODBLOCKITEM.register("potato_stairs_item",
     () -> new BlockItem(foodblockregistry.POTATO_STAIRS.get(), new BlockItem.Properties()));
   //.........beetroot
     public static final DeferredHolder<Item, BlockItem> BEETROOT_STAIRS_ITEM = FOODBLOCKITEM.register("beetroot_stairs_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_STAIRS.get(), new BlockItem.Properties()));
   //.........carrot
     public static final DeferredHolder<Item, BlockItem> CARROT_STAIRS_ITEM = FOODBLOCKITEM.register("carrot_stairs_item",
     () -> new BlockItem(foodblockregistry.CARROT_STAIRS.get(), new BlockItem.Properties()));
   //.........chorus
     public static final DeferredHolder<Item, BlockItem> CHORUS_STAIRS_ITEM = FOODBLOCKITEM.register("chorus_stairs_item",
     () -> new BlockItem(foodblockregistry.CHORUS_STAIRS.get(), new BlockItem.Properties()));
   //.........glow_berry
     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_STAIRS_ITEM = FOODBLOCKITEM.register("glow_berry_stairs_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_STAIRS.get(), new BlockItem.Properties()));
   //.........melon
     public static final DeferredHolder<Item, BlockItem> MELON_STAIRS_ITEM = FOODBLOCKITEM.register("melon_stairs_item",
     () -> new BlockItem(foodblockregistry.MELON_STAIRS.get(), new BlockItem.Properties()));
   //.........sweet_berry
     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_STAIRS_ITEM = FOODBLOCKITEM.register("sweet_berry_stairs_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_STAIRS.get(), new BlockItem.Properties()));
   //.........brown_mushroom
     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_STAIRS_ITEM = FOODBLOCKITEM.register("brown_mushroom_stairs_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_STAIRS.get(), new BlockItem.Properties()));
   //.........red_mushroom
     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_STAIRS_ITEM = FOODBLOCKITEM.register("red_mushroom_stairs_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_STAIRS.get(), new BlockItem.Properties()));
   //.........pumpkin
     public static final DeferredHolder<Item, BlockItem> PUMPKIN_STAIRS_ITEM = FOODBLOCKITEM.register("pumpkin_stairs_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_STAIRS.get(), new BlockItem.Properties()));
   //.........chicken
     public static final DeferredHolder<Item, BlockItem> CHICKEN_STAIRS_ITEM = FOODBLOCKITEM.register("chicken_stairs_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_STAIRS.get(), new BlockItem.Properties()));
   //.........cod
     public static final DeferredHolder<Item, BlockItem> COD_STAIRS_ITEM = FOODBLOCKITEM.register("cod_stairs_item",
     () -> new BlockItem(foodblockregistry.COD_STAIRS.get(), new BlockItem.Properties()));
   //.........salmon
     public static final DeferredHolder<Item, BlockItem> SALMON_STAIRS_ITEM = FOODBLOCKITEM.register("salmon_stairs_item",
     () -> new BlockItem(foodblockregistry.SALMON_STAIRS.get(), new BlockItem.Properties()));
   //.........tropical_fish
     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_STAIRS_ITEM = FOODBLOCKITEM.register("tropical_fish_stairs_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_STAIRS.get(), new BlockItem.Properties()));
   //.........mutton
     public static final DeferredHolder<Item, BlockItem> MUTTON_STAIRS_ITEM = FOODBLOCKITEM.register("mutton_stairs_item",
     () -> new BlockItem(foodblockregistry.MUTTON_STAIRS.get(), new BlockItem.Properties()));
   //.........beef
     public static final DeferredHolder<Item, BlockItem> BEEF_STAIRS_ITEM = FOODBLOCKITEM.register("beef_stairs_item",
     () -> new BlockItem(foodblockregistry.BEEF_STAIRS.get(), new BlockItem.Properties()));
   //.........pork
     public static final DeferredHolder<Item, BlockItem> PORK_STAIRS_ITEM = FOODBLOCKITEM.register("pork_stairs_item",
     () -> new BlockItem(foodblockregistry.PORK_STAIRS.get(), new BlockItem.Properties()));
   //.........rabbit
     public static final DeferredHolder<Item, BlockItem> RABBIT_STAIRS_ITEM = FOODBLOCKITEM.register("rabbit_stairs_item",
     () -> new BlockItem(foodblockregistry.RABBIT_STAIRS.get(), new BlockItem.Properties()));
   //.........sugar
     public static final DeferredHolder<Item, BlockItem> SUGAR_STAIRS_ITEM = FOODBLOCKITEM.register("sugar_stairs_item",
     () -> new BlockItem(foodblockregistry.SUGAR_STAIRS.get(), new BlockItem.Properties()));
   //.........honeycomb
     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_STAIRS_ITEM = FOODBLOCKITEM.register("honeycomb_stairs_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_STAIRS.get(), new BlockItem.Properties()));

 //-------------------------------------------------------------------------------------Bricks Stairs-------------------------------------------------------------------------------------------
   //.........apple
      public static final DeferredHolder<Item, BlockItem> APPLE_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("apple_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.APPLE_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........potato
      public static final DeferredHolder<Item, BlockItem> POTATO_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("potato_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.POTATO_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........beetroot
      public static final DeferredHolder<Item, BlockItem> BEETROOT_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("beetroot_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.BEETROOT_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........carrot
      public static final DeferredHolder<Item, BlockItem> CARROT_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("carrot_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.CARROT_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........chorus
      public static final DeferredHolder<Item, BlockItem> CHORUS_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("chorus_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.CHORUS_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........glow_berry
      public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("glow_berry_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.GLOW_BERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........melon
      public static final DeferredHolder<Item, BlockItem> MELON_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("melon_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.MELON_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........sweet_berry
      public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("sweet_berry_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.SWEET_BERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........brown_mushroom
      public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("brown_mushroom_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........red_mushroom
      public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("red_mushroom_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.RED_MUSHROOM_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........pumpkin
      public static final DeferredHolder<Item, BlockItem> PUMPKIN_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("pumpkin_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.PUMPKIN_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........chicken
      public static final DeferredHolder<Item, BlockItem> CHICKEN_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("chicken_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.CHICKEN_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........cod
      public static final DeferredHolder<Item, BlockItem> COD_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("cod_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.COD_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........salmon
      public static final DeferredHolder<Item, BlockItem> SALMON_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("salmon_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.SALMON_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........tropical_fish
      public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("tropical_fish_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.TROPICAL_FISH_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........mutton
      public static final DeferredHolder<Item, BlockItem> MUTTON_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("mutton_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.MUTTON_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........beef
      public static final DeferredHolder<Item, BlockItem> BEEF_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("beef_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.BEEF_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........pork
      public static final DeferredHolder<Item, BlockItem> PORK_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("pork_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.PORK_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........rabbit
      public static final DeferredHolder<Item, BlockItem> RABBIT_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("rabbit_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.RABBIT_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........sugar
      public static final DeferredHolder<Item, BlockItem> SUGAR_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("sugar_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.SUGAR_BRICKS_STAIRS.get(), new BlockItem.Properties()));
   //.........honeycomb
      public static final DeferredHolder<Item, BlockItem> HONEYCOMB_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("honeycomb_bricks_stairs_item",
      () -> new BlockItem(foodblockregistry.HONEYCOMB_BRICKS_STAIRS.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Trapdoors
//==============================================================================================================================================================================================

   //.........apple
     public static final DeferredHolder<Item, BlockItem> APPLE_TRAPDOOR_ITEM = FOODBLOCKITEM.register("apple_trapdoor_item",
     () -> new BlockItem(foodblockregistry.APPLE_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........potato
     public static final DeferredHolder<Item, BlockItem> POTATO_TRAPDOOR_ITEM = FOODBLOCKITEM.register("potato_trapdoor_item",
     () -> new BlockItem(foodblockregistry.POTATO_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........beetroot
     public static final DeferredHolder<Item, BlockItem> BEETROOT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("beetroot_trapdoor_item",
     () -> new BlockItem(foodblockregistry.BEETROOT_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........carrot
     public static final DeferredHolder<Item, BlockItem> CARROT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("carrot_trapdoor_item",
     () -> new BlockItem(foodblockregistry.CARROT_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........chorus
     public static final DeferredHolder<Item, BlockItem> CHORUS_TRAPDOOR_ITEM = FOODBLOCKITEM.register("chorus_trapdoor_item",
     () -> new BlockItem(foodblockregistry.CHORUS_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........glow_berry
     public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("glow_berry_trapdoor_item",
     () -> new BlockItem(foodblockregistry.GLOW_BERRY_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........melon
     public static final DeferredHolder<Item, BlockItem> MELON_TRAPDOOR_ITEM = FOODBLOCKITEM.register("melon_trapdoor_item",
     () -> new BlockItem(foodblockregistry.MELON_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........sweet_berry
     public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("sweet_berry_trapdoor_item",
     () -> new BlockItem(foodblockregistry.SWEET_BERRY_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........brown_mushroom
     public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_TRAPDOOR_ITEM = FOODBLOCKITEM.register("brown_mushroom_trapdoor_item",
     () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........red_mushroom
     public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_TRAPDOOR_ITEM = FOODBLOCKITEM.register("red_mushroom_trapdoor_item",
     () -> new BlockItem(foodblockregistry.RED_MUSHROOM_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........pumpkin
     public static final DeferredHolder<Item, BlockItem> PUMPKIN_TRAPDOOR_ITEM = FOODBLOCKITEM.register("pumpkin_trapdoor_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........chicken
     public static final DeferredHolder<Item, BlockItem> CHICKEN_TRAPDOOR_ITEM = FOODBLOCKITEM.register("chicken_trapdoor_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........cod
     public static final DeferredHolder<Item, BlockItem> COD_TRAPDOOR_ITEM = FOODBLOCKITEM.register("cod_trapdoor_item",
     () -> new BlockItem(foodblockregistry.COD_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........salmon
     public static final DeferredHolder<Item, BlockItem> SALMON_TRAPDOOR_ITEM = FOODBLOCKITEM.register("salmon_trapdoor_item",
     () -> new BlockItem(foodblockregistry.SALMON_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........tropical_fish
     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_TRAPDOOR_ITEM = FOODBLOCKITEM.register("tropical_fish_trapdoor_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........mutton
     public static final DeferredHolder<Item, BlockItem> MUTTON_TRAPDOOR_ITEM = FOODBLOCKITEM.register("mutton_trapdoor_item",
     () -> new BlockItem(foodblockregistry.MUTTON_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........beef
     public static final DeferredHolder<Item, BlockItem> BEEF_TRAPDOOR_ITEM = FOODBLOCKITEM.register("beef_trapdoor_item",
     () -> new BlockItem(foodblockregistry.BEEF_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........pork
     public static final DeferredHolder<Item, BlockItem> PORK_TRAPDOOR_ITEM = FOODBLOCKITEM.register("pork_trapdoor_item",
     () -> new BlockItem(foodblockregistry.PORK_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........rabbit
     public static final DeferredHolder<Item, BlockItem> RABBIT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("rabbit_trapdoor_item",
     () -> new BlockItem(foodblockregistry.RABBIT_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........sugar
     public static final DeferredHolder<Item, BlockItem> SUGAR_TRAPDOOR_ITEM = FOODBLOCKITEM.register("sugar_trapdoor_item",
     () -> new BlockItem(foodblockregistry.SUGAR_TRAPDOOR.get(), new BlockItem.Properties()));
   //.........honeycomb
     public static final DeferredHolder<Item, BlockItem> HONEYCOMB_TRAPDOOR_ITEM = FOODBLOCKITEM.register("honeycomb_trapdoor_item",
     () -> new BlockItem(foodblockregistry.HONEYCOMB_TRAPDOOR.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Sugar Glass
//==============================================================================================================================================================================================
  //..........plain
   //block
    public static final DeferredHolder<Item, BlockItem> PLAIN_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("plain_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.PLAIN_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> PLAIN_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("plain_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.PLAIN_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........red
   //block
    public static final DeferredHolder<Item, BlockItem> RED_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("red_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.RED_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> RED_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("red_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.RED_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........orange
   //block
    public static final DeferredHolder<Item, BlockItem> ORANGE_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("orange_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.ORANGE_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> ORANGE_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("orange_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.ORANGE_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........yellow
   //block
    public static final DeferredHolder<Item, BlockItem> YELLOW_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("yellow_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.YELLOW_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> YELLOW_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("yellow_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.YELLOW_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........lime_green
   //block
    public static final DeferredHolder<Item, BlockItem> LIME_GREEN_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("lime_green_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.LIME_GREEN_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> LIME_GREEN_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("lime_green_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.LIME_GREEN_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........green
   //block
    public static final DeferredHolder<Item, BlockItem> GREEN_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("green_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.GREEN_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> GREEN_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("green_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.GREEN_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........cyan
   //block
    public static final DeferredHolder<Item, BlockItem> CYAN_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("cyan_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.CYAN_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> CYAN_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("cyan_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.CYAN_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........light_blue
   //block
    public static final DeferredHolder<Item, BlockItem> LIGHT_BLUE_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("light_blue_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.LIGHT_BLUE_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> LIGHT_BLUE_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("light_blue_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.LIGHT_BLUE_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........blue
   //block
    public static final DeferredHolder<Item, BlockItem> BLUE_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("blue_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.BLUE_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> BLUE_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("blue_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.BLUE_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........purple
   //block
    public static final DeferredHolder<Item, BlockItem> PURPLE_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("purple_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.PURPLE_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> PURPLE_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("purple_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.PURPLE_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........magenta
   //block
    public static final DeferredHolder<Item, BlockItem> MAGENTA_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("magenta_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.MAGENTA_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> MAGENTA_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("magenta_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.MAGENTA_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........pink
   //block
    public static final DeferredHolder<Item, BlockItem> PINK_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("pink_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.PINK_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> PINK_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("pink_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.PINK_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........white
   //block
    public static final DeferredHolder<Item, BlockItem> WHITE_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("white_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.WHITE_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> WHITE_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("white_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.WHITE_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........light_gray
   //block
    public static final DeferredHolder<Item, BlockItem> LIGHT_GRAY_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("light_gray_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.LIGHT_GRAY_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> LIGHT_GRAY_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("light_gray_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.LIGHT_GRAY_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........gray
   //block
    public static final DeferredHolder<Item, BlockItem> GRAY_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("gray_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.GRAY_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> GRAY_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("gray_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.GRAY_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........black
   //block
    public static final DeferredHolder<Item, BlockItem> BLACK_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("black_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.BLACK_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> BLACK_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("black_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.BLACK_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
  //..........brown
   //block
    public static final DeferredHolder<Item, BlockItem> BROWN_SUGAR_GLASS_ITEM = FOODBLOCKITEM.register("brown_sugar_glass_item", 
    () -> new BlockItem(foodblockregistry.BROWN_SUGAR_GLASS_BLOCK.get(), new BlockItem.Properties()));
   //pane
    public static final DeferredHolder<Item, BlockItem> BROWN_SUGAR_GLASS_PANE_ITEM = FOODBLOCKITEM.register("brown_sugar_glass_pane_item", 
    () -> new BlockItem(foodblockregistry.BROWN_SUGAR_GLASS_PANE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                           Bars
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_BARS_ITEM = FOODBLOCKITEM.register("apple_bars_item",
    () -> new BlockItem(foodblockregistry.APPLE_BARS.get(), new BlockItem.Properties()));
   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_BARS_ITEM = FOODBLOCKITEM.register("potato_bars_item",
    () -> new BlockItem(foodblockregistry.POTATO_BARS.get(), new BlockItem.Properties()));
   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_BARS_ITEM = FOODBLOCKITEM.register("beetroot_bars_item",
    () -> new BlockItem(foodblockregistry.BEETROOT_BARS.get(), new BlockItem.Properties()));
   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_BARS_ITEM = FOODBLOCKITEM.register("carrot_bars_item",
    () -> new BlockItem(foodblockregistry.CARROT_BARS.get(), new BlockItem.Properties()));
   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_BARS_ITEM = FOODBLOCKITEM.register("chorus_bars_item",
    () -> new BlockItem(foodblockregistry.CHORUS_BARS.get(), new BlockItem.Properties()));
   //.........glow_berry
    public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_BARS_ITEM = FOODBLOCKITEM.register("glow_berry_bars_item",
    () -> new BlockItem(foodblockregistry.GLOW_BERRY_BARS.get(), new BlockItem.Properties()));
   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_BARS_ITEM = FOODBLOCKITEM.register("melon_bars_item",
    () -> new BlockItem(foodblockregistry.MELON_BARS.get(), new BlockItem.Properties()));
   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_BARS_ITEM = FOODBLOCKITEM.register("sweet_berry_bars_item",
    () -> new BlockItem(foodblockregistry.SWEET_BERRY_BARS.get(), new BlockItem.Properties()));
   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_BARS_ITEM = FOODBLOCKITEM.register("brown_mushroom_bars_item",
    () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_BARS.get(), new BlockItem.Properties()));
   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_BARS_ITEM = FOODBLOCKITEM.register("red_mushroom_bars_item",
    () -> new BlockItem(foodblockregistry.RED_MUSHROOM_BARS.get(), new BlockItem.Properties()));
   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_BARS_ITEM = FOODBLOCKITEM.register("pumpkin_bars_item",
    () -> new BlockItem(foodblockregistry.PUMPKIN_BARS.get(), new BlockItem.Properties()));
   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_BARS_ITEM = FOODBLOCKITEM.register("chicken_bars_item",
    () -> new BlockItem(foodblockregistry.CHICKEN_BARS.get(), new BlockItem.Properties()));
   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_BARS_ITEM = FOODBLOCKITEM.register("cod_bars_item",
    () -> new BlockItem(foodblockregistry.COD_BARS.get(), new BlockItem.Properties()));
   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_BARS_ITEM = FOODBLOCKITEM.register("salmon_bars_item",
    () -> new BlockItem(foodblockregistry.SALMON_BARS.get(), new BlockItem.Properties()));
   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_BARS_ITEM = FOODBLOCKITEM.register("tropical_fish_bars_item",
    () -> new BlockItem(foodblockregistry.TROPICAL_FISH_BARS.get(), new BlockItem.Properties()));
   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_BARS_ITEM = FOODBLOCKITEM.register("mutton_bars_item",
    () -> new BlockItem(foodblockregistry.MUTTON_BARS.get(), new BlockItem.Properties()));
   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_BARS_ITEM = FOODBLOCKITEM.register("beef_bars_item",
    () -> new BlockItem(foodblockregistry.BEEF_BARS.get(), new BlockItem.Properties()));
   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_BARS_ITEM = FOODBLOCKITEM.register("pork_bars_item",
    () -> new BlockItem(foodblockregistry.PORK_BARS.get(), new BlockItem.Properties()));
   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_BARS_ITEM = FOODBLOCKITEM.register("rabbit_bars_item",
    () -> new BlockItem(foodblockregistry.RABBIT_BARS.get(), new BlockItem.Properties()));
   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_BARS_ITEM = FOODBLOCKITEM.register("sugar_bars_item",
    () -> new BlockItem(foodblockregistry.SUGAR_BARS.get(), new BlockItem.Properties()));
   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_BARS_ITEM = FOODBLOCKITEM.register("honeycomb_bars_item",
    () -> new BlockItem(foodblockregistry.HONEYCOMB_BARS.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                           Lamps
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_LAMP_ITEM = FOODBLOCKITEM.register("apple_lamp_item",
    () -> new BlockItem(foodblockregistry.APPLE_LAMP.get(), new BlockItem.Properties()));
   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_LAMP_ITEM = FOODBLOCKITEM.register("potato_lamp_item",
    () -> new BlockItem(foodblockregistry.POTATO_LAMP.get(), new BlockItem.Properties()));
   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_LAMP_ITEM = FOODBLOCKITEM.register("beetroot_lamp_item",
    () -> new BlockItem(foodblockregistry.BEETROOT_LAMP.get(), new BlockItem.Properties()));
   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_LAMP_ITEM = FOODBLOCKITEM.register("carrot_lamp_item",
    () -> new BlockItem(foodblockregistry.CARROT_LAMP.get(), new BlockItem.Properties()));
   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_LAMP_ITEM = FOODBLOCKITEM.register("chorus_lamp_item",
    () -> new BlockItem(foodblockregistry.CHORUS_LAMP.get(), new BlockItem.Properties()));
   //.........glow_berry
    public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_LAMP_ITEM = FOODBLOCKITEM.register("glow_berry_lamp_item",
    () -> new BlockItem(foodblockregistry.GLOW_BERRY_LAMP.get(), new BlockItem.Properties()));
   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_LAMP_ITEM = FOODBLOCKITEM.register("melon_lamp_item",
    () -> new BlockItem(foodblockregistry.MELON_LAMP.get(), new BlockItem.Properties()));
   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_LAMP_ITEM = FOODBLOCKITEM.register("sweet_berry_lamp_item",
    () -> new BlockItem(foodblockregistry.SWEET_BERRY_LAMP.get(), new BlockItem.Properties()));
   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_LAMP_ITEM = FOODBLOCKITEM.register("brown_mushroom_lamp_item",
    () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_LAMP.get(), new BlockItem.Properties()));
   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_LAMP_ITEM = FOODBLOCKITEM.register("red_mushroom_lamp_item",
    () -> new BlockItem(foodblockregistry.RED_MUSHROOM_LAMP.get(), new BlockItem.Properties()));
   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_LAMP_ITEM = FOODBLOCKITEM.register("pumpkin_lamp_item",
    () -> new BlockItem(foodblockregistry.PUMPKIN_LAMP.get(), new BlockItem.Properties()));
   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_LAMP_ITEM = FOODBLOCKITEM.register("chicken_lamp_item",
    () -> new BlockItem(foodblockregistry.CHICKEN_LAMP.get(), new BlockItem.Properties()));
   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_LAMP_ITEM = FOODBLOCKITEM.register("cod_lamp_item",
    () -> new BlockItem(foodblockregistry.COD_LAMP.get(), new BlockItem.Properties()));
   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_LAMP_ITEM = FOODBLOCKITEM.register("salmon_lamp_item",
    () -> new BlockItem(foodblockregistry.SALMON_LAMP.get(), new BlockItem.Properties()));
   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_LAMP_ITEM = FOODBLOCKITEM.register("tropical_fish_lamp_item",
    () -> new BlockItem(foodblockregistry.TROPICAL_FISH_LAMP.get(), new BlockItem.Properties()));
   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_LAMP_ITEM = FOODBLOCKITEM.register("mutton_lamp_item",
    () -> new BlockItem(foodblockregistry.MUTTON_LAMP.get(), new BlockItem.Properties()));
   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_LAMP_ITEM = FOODBLOCKITEM.register("beef_lamp_item",
    () -> new BlockItem(foodblockregistry.BEEF_LAMP.get(), new BlockItem.Properties()));
   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_LAMP_ITEM = FOODBLOCKITEM.register("pork_lamp_item",
    () -> new BlockItem(foodblockregistry.PORK_LAMP.get(), new BlockItem.Properties()));
   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_LAMP_ITEM = FOODBLOCKITEM.register("rabbit_lamp_item",
    () -> new BlockItem(foodblockregistry.RABBIT_LAMP.get(), new BlockItem.Properties()));
   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_LAMP_ITEM = FOODBLOCKITEM.register("sugar_lamp_item",
    () -> new BlockItem(foodblockregistry.SUGAR_LAMP.get(), new BlockItem.Properties()));
   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_LAMP_ITEM = FOODBLOCKITEM.register("honeycomb_lamp_item",
    () -> new BlockItem(foodblockregistry.HONEYCOMB_LAMP.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                           Carpets
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_CARPET_ITEM = FOODBLOCKITEM.register("apple_carpet_item",
    () -> new BlockItem(foodblockregistry.APPLE_CARPET.get(), new BlockItem.Properties())); 
   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_CARPET_ITEM = FOODBLOCKITEM.register("potato_carpet_item",
    () -> new BlockItem(foodblockregistry.POTATO_CARPET.get(), new BlockItem.Properties())); 
   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_CARPET_ITEM = FOODBLOCKITEM.register("beetroot_carpet_item",
    () -> new BlockItem(foodblockregistry.BEETROOT_CARPET.get(), new BlockItem.Properties())); 
   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_CARPET_ITEM = FOODBLOCKITEM.register("carrot_carpet_item",
    () -> new BlockItem(foodblockregistry.CARROT_CARPET.get(), new BlockItem.Properties())); 
   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_CARPET_ITEM = FOODBLOCKITEM.register("chorus_carpet_item",
    () -> new BlockItem(foodblockregistry.CHORUS_CARPET.get(), new BlockItem.Properties())); 
   //.........glow_berry
    public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_CARPET_ITEM = FOODBLOCKITEM.register("glow_berry_carpet_item",
    () -> new BlockItem(foodblockregistry.GLOW_BERRY_CARPET.get(), new BlockItem.Properties())); 
   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_CARPET_ITEM = FOODBLOCKITEM.register("melon_carpet_item",
    () -> new BlockItem(foodblockregistry.MELON_CARPET.get(), new BlockItem.Properties())); 
   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_CARPET_ITEM = FOODBLOCKITEM.register("sweet_berry_carpet_item",
    () -> new BlockItem(foodblockregistry.SWEET_BERRY_CARPET.get(), new BlockItem.Properties())); 
   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_CARPET_ITEM = FOODBLOCKITEM.register("brown_mushroom_carpet_item",
    () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_CARPET.get(), new BlockItem.Properties())); 
   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_CARPET_ITEM = FOODBLOCKITEM.register("red_mushroom_carpet_item",
    () -> new BlockItem(foodblockregistry.RED_MUSHROOM_CARPET.get(), new BlockItem.Properties())); 
   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_CARPET_ITEM = FOODBLOCKITEM.register("pumpkin_carpet_item",
    () -> new BlockItem(foodblockregistry.PUMPKIN_CARPET.get(), new BlockItem.Properties())); 
   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_CARPET_ITEM = FOODBLOCKITEM.register("chicken_carpet_item",
    () -> new BlockItem(foodblockregistry.CHICKEN_CARPET.get(), new BlockItem.Properties())); 
   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_CARPET_ITEM = FOODBLOCKITEM.register("cod_carpet_item",
    () -> new BlockItem(foodblockregistry.COD_CARPET.get(), new BlockItem.Properties())); 
   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_CARPET_ITEM = FOODBLOCKITEM.register("salmon_carpet_item",
    () -> new BlockItem(foodblockregistry.SALMON_CARPET.get(), new BlockItem.Properties())); 
   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_CARPET_ITEM = FOODBLOCKITEM.register("tropical_fish_carpet_item",
    () -> new BlockItem(foodblockregistry.TROPICAL_FISH_CARPET.get(), new BlockItem.Properties())); 
   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_CARPET_ITEM = FOODBLOCKITEM.register("mutton_carpet_item",
    () -> new BlockItem(foodblockregistry.MUTTON_CARPET.get(), new BlockItem.Properties())); 
   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_CARPET_ITEM = FOODBLOCKITEM.register("beef_carpet_item",
    () -> new BlockItem(foodblockregistry.BEEF_CARPET.get(), new BlockItem.Properties())); 
   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_CARPET_ITEM = FOODBLOCKITEM.register("pork_carpet_item",
    () -> new BlockItem(foodblockregistry.PORK_CARPET.get(), new BlockItem.Properties())); 
   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_CARPET_ITEM = FOODBLOCKITEM.register("rabbit_carpet_item",
    () -> new BlockItem(foodblockregistry.RABBIT_CARPET.get(), new BlockItem.Properties()));
   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_CARPET_ITEM = FOODBLOCKITEM.register("sugar_carpet_item",
    () -> new BlockItem(foodblockregistry.SUGAR_CARPET.get(), new BlockItem.Properties()));
   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_CARPET_ITEM = FOODBLOCKITEM.register("honeycomb_carpet_item",
    () -> new BlockItem(foodblockregistry.HONEYCOMB_CARPET.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                           Lanterns
//==============================================================================================================================================================================================

   //.........apple
    //regular
      public static final DeferredHolder<Item, BlockItem> APPLE_LANTERN_ITEM = FOODBLOCKITEM.register("apple_lantern_item",
      () -> new BlockItem(foodblockregistry.APPLE_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> APPLE_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("apple_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.APPLE_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........potato
    //regular
      public static final DeferredHolder<Item, BlockItem> POTATO_LANTERN_ITEM = FOODBLOCKITEM.register("potato_lantern_item",
      () -> new BlockItem(foodblockregistry.POTATO_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> POTATO_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("potato_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.POTATO_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........beetroot
    //regular
      public static final DeferredHolder<Item, BlockItem> BEETROOT_LANTERN_ITEM = FOODBLOCKITEM.register("beetroot_lantern_item",
      () -> new BlockItem(foodblockregistry.BEETROOT_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> BEETROOT_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("beetroot_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.BEETROOT_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........carrot
    //regular
      public static final DeferredHolder<Item, BlockItem> CARROT_LANTERN_ITEM = FOODBLOCKITEM.register("carrot_lantern_item",
      () -> new BlockItem(foodblockregistry.CARROT_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> CARROT_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("carrot_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.CARROT_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........chorus
    //regular
      public static final DeferredHolder<Item, BlockItem> CHORUS_LANTERN_ITEM = FOODBLOCKITEM.register("chorus_lantern_item",
      () -> new BlockItem(foodblockregistry.CHORUS_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> CHORUS_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("chorus_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.CHORUS_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........glow_berry
    //regular
      public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_LANTERN_ITEM = FOODBLOCKITEM.register("glow_berry_lantern_item",
      () -> new BlockItem(foodblockregistry.GLOW_BERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("glow_berry_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.GLOW_BERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........melon
    //regular
      public static final DeferredHolder<Item, BlockItem> MELON_LANTERN_ITEM = FOODBLOCKITEM.register("melon_lantern_item",
      () -> new BlockItem(foodblockregistry.MELON_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> MELON_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("melon_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.MELON_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........sweet_berry
    //regular
      public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_LANTERN_ITEM = FOODBLOCKITEM.register("sweet_berry_lantern_item",
      () -> new BlockItem(foodblockregistry.SWEET_BERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("sweet_berry_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.SWEET_BERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........brown_mushroom
    //regular
      public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_LANTERN_ITEM = FOODBLOCKITEM.register("brown_mushroom_lantern_item",
      () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("brown_mushroom_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........red_mushroom
    //regular
      public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_LANTERN_ITEM = FOODBLOCKITEM.register("red_mushroom_lantern_item",
      () -> new BlockItem(foodblockregistry.RED_MUSHROOM_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("red_mushroom_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.RED_MUSHROOM_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........pumpkin
    //regular
      public static final DeferredHolder<Item, BlockItem> PUMPKIN_LANTERN_ITEM = FOODBLOCKITEM.register("pumpkin_lantern_item",
      () -> new BlockItem(foodblockregistry.PUMPKIN_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> PUMPKIN_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("pumpkin_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.PUMPKIN_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........chicken
    //regular
      public static final DeferredHolder<Item, BlockItem> CHICKEN_LANTERN_ITEM = FOODBLOCKITEM.register("chicken_lantern_item",
      () -> new BlockItem(foodblockregistry.CHICKEN_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> CHICKEN_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("chicken_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.CHICKEN_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........cod
    //regular
      public static final DeferredHolder<Item, BlockItem> COD_LANTERN_ITEM = FOODBLOCKITEM.register("cod_lantern_item",
      () -> new BlockItem(foodblockregistry.COD_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> COD_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("cod_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.COD_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........salmon
    //regular
      public static final DeferredHolder<Item, BlockItem> SALMON_LANTERN_ITEM = FOODBLOCKITEM.register("salmon_lantern_item",
      () -> new BlockItem(foodblockregistry.SALMON_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> SALMON_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("salmon_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.SALMON_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........tropical_fish
    //regular
      public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_LANTERN_ITEM = FOODBLOCKITEM.register("tropical_fish_lantern_item",
      () -> new BlockItem(foodblockregistry.TROPICAL_FISH_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("tropical_fish_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.TROPICAL_FISH_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........mutton
    //regular
      public static final DeferredHolder<Item, BlockItem> MUTTON_LANTERN_ITEM = FOODBLOCKITEM.register("mutton_lantern_item",
      () -> new BlockItem(foodblockregistry.MUTTON_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> MUTTON_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("mutton_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.MUTTON_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........beef
    //regular
      public static final DeferredHolder<Item, BlockItem> BEEF_LANTERN_ITEM = FOODBLOCKITEM.register("beef_lantern_item",
      () -> new BlockItem(foodblockregistry.BEEF_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> BEEF_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("beef_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.BEEF_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........pork
    //regular
      public static final DeferredHolder<Item, BlockItem> PORK_LANTERN_ITEM = FOODBLOCKITEM.register("pork_lantern_item",
      () -> new BlockItem(foodblockregistry.PORK_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> PORK_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("pork_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.PORK_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........rabbit
    //regular
      public static final DeferredHolder<Item, BlockItem> RABBIT_LANTERN_ITEM = FOODBLOCKITEM.register("rabbit_lantern_item",
      () -> new BlockItem(foodblockregistry.RABBIT_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> RABBIT_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("rabbit_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.RABBIT_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........sugar
    //regular
      public static final DeferredHolder<Item, BlockItem> SUGAR_LANTERN_ITEM = FOODBLOCKITEM.register("sugar_lantern_item",
      () -> new BlockItem(foodblockregistry.SUGAR_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> SUGAR_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("sugar_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.SUGAR_SOUL_LANTERN.get(), new BlockItem.Properties()));
   //.........honeycomb
    //regular
      public static final DeferredHolder<Item, BlockItem> HONEYCOMB_LANTERN_ITEM = FOODBLOCKITEM.register("honeycomb_lantern_item",
      () -> new BlockItem(foodblockregistry.HONEYCOMB_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> HONEYCOMB_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("honeycomb_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.HONEYCOMB_SOUL_LANTERN.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                           Chains
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_CHAIN_ITEM = FOODBLOCKITEM.register("apple_chain_item",
    () -> new BlockItem(foodblockregistry.APPLE_CHAIN.get(), new BlockItem.Properties()));

   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_CHAIN_ITEM = FOODBLOCKITEM.register("potato_chain_item",
    () -> new BlockItem(foodblockregistry.POTATO_CHAIN.get(), new BlockItem.Properties()));

   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_CHAIN_ITEM = FOODBLOCKITEM.register("beetroot_chain_item",
    () -> new BlockItem(foodblockregistry.BEETROOT_CHAIN.get(), new BlockItem.Properties()));

   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_CHAIN_ITEM = FOODBLOCKITEM.register("carrot_chain_item",
    () -> new BlockItem(foodblockregistry.CARROT_CHAIN.get(), new BlockItem.Properties()));

   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_CHAIN_ITEM = FOODBLOCKITEM.register("chorus_chain_item",
    () -> new BlockItem(foodblockregistry.CHORUS_CHAIN.get(), new BlockItem.Properties()));

   //.........glow_berry
    public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_CHAIN_ITEM = FOODBLOCKITEM.register("glow_berry_chain_item",
    () -> new BlockItem(foodblockregistry.GLOW_BERRY_CHAIN.get(), new BlockItem.Properties()));

   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_CHAIN_ITEM = FOODBLOCKITEM.register("melon_chain_item",
    () -> new BlockItem(foodblockregistry.MELON_CHAIN.get(), new BlockItem.Properties()));

   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_CHAIN_ITEM = FOODBLOCKITEM.register("sweet_berry_chain_item",
    () -> new BlockItem(foodblockregistry.SWEET_BERRY_CHAIN.get(), new BlockItem.Properties()));

   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_CHAIN_ITEM = FOODBLOCKITEM.register("brown_mushroom_chain_item",
    () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_CHAIN.get(), new BlockItem.Properties()));

   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_CHAIN_ITEM = FOODBLOCKITEM.register("red_mushroom_chain_item",
    () -> new BlockItem(foodblockregistry.RED_MUSHROOM_CHAIN.get(), new BlockItem.Properties()));

   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_CHAIN_ITEM = FOODBLOCKITEM.register("pumpkin_chain_item",
    () -> new BlockItem(foodblockregistry.PUMPKIN_CHAIN.get(), new BlockItem.Properties()));

   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_CHAIN_ITEM = FOODBLOCKITEM.register("chicken_chain_item",
    () -> new BlockItem(foodblockregistry.CHICKEN_CHAIN.get(), new BlockItem.Properties()));

   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_CHAIN_ITEM = FOODBLOCKITEM.register("cod_chain_item",
    () -> new BlockItem(foodblockregistry.COD_CHAIN.get(), new BlockItem.Properties()));

   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_CHAIN_ITEM = FOODBLOCKITEM.register("salmon_chain_item",
    () -> new BlockItem(foodblockregistry.SALMON_CHAIN.get(), new BlockItem.Properties()));

   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_CHAIN_ITEM = FOODBLOCKITEM.register("tropical_fish_chain_item",
    () -> new BlockItem(foodblockregistry.TROPICAL_FISH_CHAIN.get(), new BlockItem.Properties()));

   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_CHAIN_ITEM = FOODBLOCKITEM.register("mutton_chain_item",
    () -> new BlockItem(foodblockregistry.MUTTON_CHAIN.get(), new BlockItem.Properties()));

   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_CHAIN_ITEM = FOODBLOCKITEM.register("beef_chain_item",
    () -> new BlockItem(foodblockregistry.BEEF_CHAIN.get(), new BlockItem.Properties()));

   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_CHAIN_ITEM = FOODBLOCKITEM.register("pork_chain_item",
    () -> new BlockItem(foodblockregistry.PORK_CHAIN.get(), new BlockItem.Properties()));

   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_CHAIN_ITEM = FOODBLOCKITEM.register("rabbit_chain_item",
    () -> new BlockItem(foodblockregistry.RABBIT_CHAIN.get(), new BlockItem.Properties()));

   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_CHAIN_ITEM = FOODBLOCKITEM.register("sugar_chain_item",
    () -> new BlockItem(foodblockregistry.SUGAR_CHAIN.get(), new BlockItem.Properties()));

   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_CHAIN_ITEM = FOODBLOCKITEM.register("honeycomb_chain_item",
    () -> new BlockItem(foodblockregistry.HONEYCOMB_CHAIN.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                           Tables
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_TABLE_ITEM =  FOODBLOCKITEM.register("apple_table_item",
    () -> new BlockItem(foodblockregistry.APPLE_TABLE.get(), new BlockItem.Properties()));
    
   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_TABLE_ITEM =  FOODBLOCKITEM.register("potato_table_item",
    () -> new BlockItem(foodblockregistry.POTATO_TABLE.get(), new BlockItem.Properties()));

   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_TABLE_ITEM =  FOODBLOCKITEM.register("beetroot_table_item",
    () -> new BlockItem(foodblockregistry.BEETROOT_TABLE.get(), new BlockItem.Properties()));

   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_TABLE_ITEM =  FOODBLOCKITEM.register("carrot_table_item",
    () -> new BlockItem(foodblockregistry.CARROT_TABLE.get(), new BlockItem.Properties()));
    
   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_TABLE_ITEM =  FOODBLOCKITEM.register("chorus_table_item",
    () -> new BlockItem(foodblockregistry.CHORUS_TABLE.get(), new BlockItem.Properties()));

   //.........glow_berry
    public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_TABLE_ITEM =  FOODBLOCKITEM.register("glow_berry_table_item",
    () -> new BlockItem(foodblockregistry.GLOW_BERRY_TABLE.get(), new BlockItem.Properties()));

   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_TABLE_ITEM =  FOODBLOCKITEM.register("melon_table_item",
    () -> new BlockItem(foodblockregistry.MELON_TABLE.get(), new BlockItem.Properties()));

   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_TABLE_ITEM =  FOODBLOCKITEM.register("sweet_berry_table_item",
    () -> new BlockItem(foodblockregistry.SWEET_BERRY_TABLE.get(), new BlockItem.Properties()));

   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_TABLE_ITEM =  FOODBLOCKITEM.register("brown_mushroom_table_item",
    () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_TABLE.get(), new BlockItem.Properties()));

   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_TABLE_ITEM =  FOODBLOCKITEM.register("red_mushroom_table_item",
    () -> new BlockItem(foodblockregistry.RED_MUSHROOM_TABLE.get(), new BlockItem.Properties()));

   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_TABLE_ITEM =  FOODBLOCKITEM.register("pumpkin_table_item",
    () -> new BlockItem(foodblockregistry.PUMPKIN_TABLE.get(), new BlockItem.Properties()));

   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_TABLE_ITEM =  FOODBLOCKITEM.register("chicken_table_item",
    () -> new BlockItem(foodblockregistry.CHICKEN_TABLE.get(), new BlockItem.Properties()));

   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_TABLE_ITEM =  FOODBLOCKITEM.register("cod_table_item",
    () -> new BlockItem(foodblockregistry.COD_TABLE.get(), new BlockItem.Properties()));

   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_TABLE_ITEM =  FOODBLOCKITEM.register("salmon_table_item",
    () -> new BlockItem(foodblockregistry.SALMON_TABLE.get(), new BlockItem.Properties()));

   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_TABLE_ITEM =  FOODBLOCKITEM.register("tropical_fish_table_item",
    () -> new BlockItem(foodblockregistry.TROPICAL_FISH_TABLE.get(), new BlockItem.Properties()));

   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_TABLE_ITEM =  FOODBLOCKITEM.register("mutton_table_item",
    () -> new BlockItem(foodblockregistry.MUTTON_TABLE.get(), new BlockItem.Properties()));

   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_TABLE_ITEM =  FOODBLOCKITEM.register("beef_table_item",
    () -> new BlockItem(foodblockregistry.BEEF_TABLE.get(), new BlockItem.Properties()));

   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_TABLE_ITEM =  FOODBLOCKITEM.register("pork_table_item",
    () -> new BlockItem(foodblockregistry.PORK_TABLE.get(), new BlockItem.Properties()));

   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_TABLE_ITEM =  FOODBLOCKITEM.register("rabbit_table_item",
    () -> new BlockItem(foodblockregistry.RABBIT_TABLE.get(), new BlockItem.Properties()));

   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_TABLE_ITEM =  FOODBLOCKITEM.register("sugar_table_item",
    () -> new BlockItem(foodblockregistry.SUGAR_TABLE.get(), new BlockItem.Properties()));

   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_TABLE_ITEM =  FOODBLOCKITEM.register("honeycomb_table_item",
    () -> new BlockItem(foodblockregistry.HONEYCOMB_TABLE.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                           Ladders
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_LADDER_ITEM =  FOODBLOCKITEM.register("apple_ladder_item",
    () -> new BlockItem(foodblockregistry.APPLE_LADDER.get(), new BlockItem.Properties()));

   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_LADDER_ITEM =  FOODBLOCKITEM.register("potato_ladder_item",
    () -> new BlockItem(foodblockregistry.POTATO_LADDER.get(), new BlockItem.Properties()));

   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_LADDER_ITEM =  FOODBLOCKITEM.register("beetroot_ladder_item",
    () -> new BlockItem(foodblockregistry.BEETROOT_LADDER.get(), new BlockItem.Properties()));

   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_LADDER_ITEM =  FOODBLOCKITEM.register("carrot_ladder_item",
    () -> new BlockItem(foodblockregistry.CARROT_LADDER.get(), new BlockItem.Properties()));

   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_LADDER_ITEM =  FOODBLOCKITEM.register("chorus_ladder_item",
    () -> new BlockItem(foodblockregistry.CHORUS_LADDER.get(), new BlockItem.Properties()));

   //.........glow_berry
    public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_LADDER_ITEM =  FOODBLOCKITEM.register("glow_berry_ladder_item",
    () -> new BlockItem(foodblockregistry.GLOW_BERRY_LADDER.get(), new BlockItem.Properties()));

   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_LADDER_ITEM =  FOODBLOCKITEM.register("melon_ladder_item",
    () -> new BlockItem(foodblockregistry.MELON_LADDER.get(), new BlockItem.Properties()));

   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_LADDER_ITEM =  FOODBLOCKITEM.register("sweet_berry_ladder_item",
    () -> new BlockItem(foodblockregistry.SWEET_BERRY_LADDER.get(), new BlockItem.Properties()));

   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_LADDER_ITEM =  FOODBLOCKITEM.register("brown_mushroom_ladder_item",
    () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_LADDER.get(), new BlockItem.Properties()));

   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_LADDER_ITEM =  FOODBLOCKITEM.register("red_mushroom_ladder_item",
    () -> new BlockItem(foodblockregistry.RED_MUSHROOM_LADDER.get(), new BlockItem.Properties()));

   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_LADDER_ITEM =  FOODBLOCKITEM.register("pumpkin_ladder_item",
    () -> new BlockItem(foodblockregistry.PUMPKIN_LADDER.get(), new BlockItem.Properties()));

   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_LADDER_ITEM =  FOODBLOCKITEM.register("chicken_ladder_item",
    () -> new BlockItem(foodblockregistry.CHICKEN_LADDER.get(), new BlockItem.Properties()));

   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_LADDER_ITEM =  FOODBLOCKITEM.register("cod_ladder_item",
    () -> new BlockItem(foodblockregistry.COD_LADDER.get(), new BlockItem.Properties()));

   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_LADDER_ITEM =  FOODBLOCKITEM.register("salmon_ladder_item",
    () -> new BlockItem(foodblockregistry.SALMON_LADDER.get(), new BlockItem.Properties()));

   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_LADDER_ITEM =  FOODBLOCKITEM.register("tropical_fish_ladder_item",
    () -> new BlockItem(foodblockregistry.TROPICAL_FISH_LADDER.get(), new BlockItem.Properties()));

   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_LADDER_ITEM =  FOODBLOCKITEM.register("mutton_ladder_item",
    () -> new BlockItem(foodblockregistry.MUTTON_LADDER.get(), new BlockItem.Properties()));

   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_LADDER_ITEM =  FOODBLOCKITEM.register("beef_ladder_item",
    () -> new BlockItem(foodblockregistry.BEEF_LADDER.get(), new BlockItem.Properties()));

   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_LADDER_ITEM =  FOODBLOCKITEM.register("pork_ladder_item",
    () -> new BlockItem(foodblockregistry.PORK_LADDER.get(), new BlockItem.Properties()));

   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_LADDER_ITEM =  FOODBLOCKITEM.register("rabbit_ladder_item",
    () -> new BlockItem(foodblockregistry.RABBIT_LADDER.get(), new BlockItem.Properties()));

   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_LADDER_ITEM =  FOODBLOCKITEM.register("sugar_ladder_item",
    () -> new BlockItem(foodblockregistry.SUGAR_LADDER.get(), new BlockItem.Properties()));

   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_LADDER_ITEM =  FOODBLOCKITEM.register("honeycomb_ladder_item",
    () -> new BlockItem(foodblockregistry.HONEYCOMB_LADDER.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                           Torches
//==============================================================================================================================================================================================

   //.........apple
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> APPLE_TORCH_ITEM = FOODBLOCKITEM.register("apple_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.APPLE_TORCH.get(), foodblockregistry.APPLE_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> APPLE_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("apple_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.APPLE_REDSTONE_TORCH.get(), foodblockregistry.APPLE_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> APPLE_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("apple_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.APPLE_SOUL_TORCH.get(), foodblockregistry.APPLE_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........potato
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> POTATO_TORCH_ITEM = FOODBLOCKITEM.register("potato_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.POTATO_TORCH.get(), foodblockregistry.POTATO_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> POTATO_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("potato_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.POTATO_REDSTONE_TORCH.get(), foodblockregistry.POTATO_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> POTATO_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("potato_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.POTATO_SOUL_TORCH.get(), foodblockregistry.POTATO_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........beetroot
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BEETROOT_TORCH_ITEM = FOODBLOCKITEM.register("beetroot_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.BEETROOT_TORCH.get(), foodblockregistry.BEETROOT_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BEETROOT_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("beetroot_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.BEETROOT_REDSTONE_TORCH.get(), foodblockregistry.BEETROOT_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BEETROOT_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("beetroot_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.BEETROOT_SOUL_TORCH.get(), foodblockregistry.BEETROOT_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........carrot
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CARROT_TORCH_ITEM = FOODBLOCKITEM.register("carrot_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.CARROT_TORCH.get(), foodblockregistry.CARROT_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CARROT_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("carrot_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.CARROT_REDSTONE_TORCH.get(), foodblockregistry.CARROT_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CARROT_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("carrot_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.CARROT_SOUL_TORCH.get(), foodblockregistry.CARROT_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........chorus
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHORUS_TORCH_ITEM = FOODBLOCKITEM.register("chorus_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.CHORUS_TORCH.get(), foodblockregistry.CHORUS_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHORUS_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("chorus_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.CHORUS_REDSTONE_TORCH.get(), foodblockregistry.CHORUS_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHORUS_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("chorus_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.CHORUS_SOUL_TORCH.get(), foodblockregistry.CHORUS_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........glow_berry
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> GLOW_BERRY_TORCH_ITEM = FOODBLOCKITEM.register("glow_berry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.GLOW_BERRY_TORCH.get(), foodblockregistry.GLOW_BERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> GLOW_BERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("glow_berry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.GLOW_BERRY_REDSTONE_TORCH.get(), foodblockregistry.GLOW_BERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> GLOW_BERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("glow_berry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.GLOW_BERRY_SOUL_TORCH.get(), foodblockregistry.GLOW_BERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........melon
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> MELON_TORCH_ITEM = FOODBLOCKITEM.register("melon_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.MELON_TORCH.get(), foodblockregistry.MELON_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> MELON_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("melon_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.MELON_REDSTONE_TORCH.get(), foodblockregistry.MELON_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> MELON_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("melon_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.MELON_SOUL_TORCH.get(), foodblockregistry.MELON_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........sweet_berry
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SWEET_BERRY_TORCH_ITEM = FOODBLOCKITEM.register("sweet_berry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.SWEET_BERRY_TORCH.get(), foodblockregistry.SWEET_BERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SWEET_BERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("sweet_berry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.SWEET_BERRY_REDSTONE_TORCH.get(), foodblockregistry.SWEET_BERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SWEET_BERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("sweet_berry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.SWEET_BERRY_SOUL_TORCH.get(), foodblockregistry.SWEET_BERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........brown_mushroom
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BROWN_MUSHROOM_TORCH_ITEM = FOODBLOCKITEM.register("brown_mushroom_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.BROWN_MUSHROOM_TORCH.get(), foodblockregistry.BROWN_MUSHROOM_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BROWN_MUSHROOM_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("brown_mushroom_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.BROWN_MUSHROOM_REDSTONE_TORCH.get(), foodblockregistry.BROWN_MUSHROOM_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BROWN_MUSHROOM_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("brown_mushroom_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.BROWN_MUSHROOM_SOUL_TORCH.get(), foodblockregistry.BROWN_MUSHROOM_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........red_mushroom
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> RED_MUSHROOM_TORCH_ITEM = FOODBLOCKITEM.register("red_mushroom_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.RED_MUSHROOM_TORCH.get(), foodblockregistry.RED_MUSHROOM_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> RED_MUSHROOM_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("red_mushroom_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.RED_MUSHROOM_REDSTONE_TORCH.get(), foodblockregistry.RED_MUSHROOM_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> RED_MUSHROOM_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("red_mushroom_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.RED_MUSHROOM_SOUL_TORCH.get(), foodblockregistry.RED_MUSHROOM_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

   //.........pumpkin
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PUMPKIN_TORCH_ITEM = FOODBLOCKITEM.register("pumpkin_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.PUMPKIN_TORCH.get(), foodblockregistry.PUMPKIN_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PUMPKIN_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("pumpkin_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.PUMPKIN_REDSTONE_TORCH.get(), foodblockregistry.PUMPKIN_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PUMPKIN_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("pumpkin_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.PUMPKIN_SOUL_TORCH.get(), foodblockregistry.PUMPKIN_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........chicken
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHICKEN_TORCH_ITEM = FOODBLOCKITEM.register("chicken_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.CHICKEN_TORCH.get(), foodblockregistry.CHICKEN_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHICKEN_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("chicken_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.CHICKEN_REDSTONE_TORCH.get(), foodblockregistry.CHICKEN_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHICKEN_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("chicken_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.CHICKEN_SOUL_TORCH.get(), foodblockregistry.CHICKEN_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........cod
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> COD_TORCH_ITEM = FOODBLOCKITEM.register("cod_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.COD_TORCH.get(), foodblockregistry.COD_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> COD_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("cod_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.COD_REDSTONE_TORCH.get(), foodblockregistry.COD_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> COD_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("cod_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.COD_SOUL_TORCH.get(), foodblockregistry.COD_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........salmon
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SALMON_TORCH_ITEM = FOODBLOCKITEM.register("salmon_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.SALMON_TORCH.get(), foodblockregistry.SALMON_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SALMON_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("salmon_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.SALMON_REDSTONE_TORCH.get(), foodblockregistry.SALMON_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SALMON_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("salmon_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.SALMON_SOUL_TORCH.get(), foodblockregistry.SALMON_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........tropical_fish
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> TROPICAL_FISH_TORCH_ITEM = FOODBLOCKITEM.register("tropical_fish_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.TROPICAL_FISH_TORCH.get(), foodblockregistry.TROPICAL_FISH_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> TROPICAL_FISH_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("tropical_fish_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.TROPICAL_FISH_REDSTONE_TORCH.get(), foodblockregistry.TROPICAL_FISH_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> TROPICAL_FISH_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("tropical_fish_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.TROPICAL_FISH_SOUL_TORCH.get(), foodblockregistry.TROPICAL_FISH_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........mutton
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> MUTTON_TORCH_ITEM = FOODBLOCKITEM.register("mutton_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.MUTTON_TORCH.get(), foodblockregistry.MUTTON_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> MUTTON_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("mutton_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.MUTTON_REDSTONE_TORCH.get(), foodblockregistry.MUTTON_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> MUTTON_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("mutton_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.MUTTON_SOUL_TORCH.get(), foodblockregistry.MUTTON_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........beef
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BEEF_TORCH_ITEM = FOODBLOCKITEM.register("beef_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.BEEF_TORCH.get(), foodblockregistry.BEEF_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BEEF_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("beef_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.BEEF_REDSTONE_TORCH.get(), foodblockregistry.BEEF_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BEEF_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("beef_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.BEEF_SOUL_TORCH.get(), foodblockregistry.BEEF_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........pork
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PORK_TORCH_ITEM = FOODBLOCKITEM.register("pork_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.PORK_TORCH.get(), foodblockregistry.PORK_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PORK_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("pork_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.PORK_REDSTONE_TORCH.get(), foodblockregistry.PORK_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PORK_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("pork_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.PORK_SOUL_TORCH.get(), foodblockregistry.PORK_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........rabbit
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> RABBIT_TORCH_ITEM = FOODBLOCKITEM.register("rabbit_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.RABBIT_TORCH.get(), foodblockregistry.RABBIT_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> RABBIT_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("rabbit_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.RABBIT_REDSTONE_TORCH.get(), foodblockregistry.RABBIT_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> RABBIT_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("rabbit_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.RABBIT_SOUL_TORCH.get(), foodblockregistry.RABBIT_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........sugar
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SUGAR_TORCH_ITEM = FOODBLOCKITEM.register("sugar_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.SUGAR_TORCH.get(), foodblockregistry.SUGAR_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SUGAR_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("sugar_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.SUGAR_REDSTONE_TORCH.get(), foodblockregistry.SUGAR_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SUGAR_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("sugar_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.SUGAR_SOUL_TORCH.get(), foodblockregistry.SUGAR_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
   //.........honeycomb
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> HONEYCOMB_TORCH_ITEM = FOODBLOCKITEM.register("honeycomb_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.HONEYCOMB_TORCH.get(), foodblockregistry.HONEYCOMB_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> HONEYCOMB_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("honeycomb_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.HONEYCOMB_REDSTONE_TORCH.get(), foodblockregistry.HONEYCOMB_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> HONEYCOMB_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("honeycomb_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.HONEYCOMB_SOUL_TORCH.get(), foodblockregistry.HONEYCOMB_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));

//==============================================================================================================================================================================================
//                                                                                         Furnaces
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_FURNACE_ITEM = FOODBLOCKITEM.register("apple_furnace_item", () -> new BlockItem(foodblockregistry.APPLE_FURNACE.get(), new BlockItem.Properties()));
   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_FURNACE_ITEM = FOODBLOCKITEM.register("potato_furnace_item", () -> new BlockItem(foodblockregistry.POTATO_FURNACE.get(), new BlockItem.Properties()));
   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_FURNACE_ITEM = FOODBLOCKITEM.register("beetroot_furnace_item", () -> new BlockItem(foodblockregistry.BEETROOT_FURNACE.get(), new BlockItem.Properties()));
   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_FURNACE_ITEM = FOODBLOCKITEM.register("carrot_furnace_item", () -> new BlockItem(foodblockregistry.CARROT_FURNACE.get(), new BlockItem.Properties()));
   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_FURNACE_ITEM = FOODBLOCKITEM.register("chorus_furnace_item", () -> new BlockItem(foodblockregistry.CHORUS_FURNACE.get(), new BlockItem.Properties()));
   //.........glowberry
    public static final DeferredHolder<Item, BlockItem> GLOWBERRY_FURNACE_ITEM = FOODBLOCKITEM.register("glowberry_furnace_item", () -> new BlockItem(foodblockregistry.GLOWBERRY_FURNACE.get(), new BlockItem.Properties()));
   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_FURNACE_ITEM = FOODBLOCKITEM.register("melon_furnace_item", () -> new BlockItem(foodblockregistry.MELON_FURNACE.get(), new BlockItem.Properties()));
   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_FURNACE_ITEM = FOODBLOCKITEM.register("sweet_berry_furnace_item", () -> new BlockItem(foodblockregistry.SWEET_BERRY_FURNACE.get(), new BlockItem.Properties()));
   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_FURNACE_ITEM = FOODBLOCKITEM.register("brown_mushroom_furnace_item", () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_FURNACE.get(), new BlockItem.Properties()));
   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_FURNACE_ITEM = FOODBLOCKITEM.register("red_mushroom_furnace_item", () -> new BlockItem(foodblockregistry.RED_MUSHROOM_FURNACE.get(), new BlockItem.Properties()));
   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_FURNACE_ITEM = FOODBLOCKITEM.register("pumpkin_furnace_item", () -> new BlockItem(foodblockregistry.PUMPKIN_FURNACE.get(), new BlockItem.Properties()));
   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_FURNACE_ITEM = FOODBLOCKITEM.register("chicken_furnace_item", () -> new BlockItem(foodblockregistry.CHICKEN_FURNACE.get(), new BlockItem.Properties()));
   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_FURNACE_ITEM = FOODBLOCKITEM.register("cod_furnace_item", () -> new BlockItem(foodblockregistry.COD_FURNACE.get(), new BlockItem.Properties()));
   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_FURNACE_ITEM = FOODBLOCKITEM.register("salmon_furnace_item", () -> new BlockItem(foodblockregistry.SALMON_FURNACE.get(), new BlockItem.Properties()));
   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_FURNACE_ITEM = FOODBLOCKITEM.register("tropical_fish_furnace_item", () -> new BlockItem(foodblockregistry.TROPICAL_FISH_FURNACE.get(), new BlockItem.Properties()));
   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_FURNACE_ITEM = FOODBLOCKITEM.register("mutton_furnace_item", () -> new BlockItem(foodblockregistry.MUTTON_FURNACE.get(), new BlockItem.Properties()));
   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_FURNACE_ITEM = FOODBLOCKITEM.register("beef_furnace_item", () -> new BlockItem(foodblockregistry.BEEF_FURNACE.get(), new BlockItem.Properties()));
   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_FURNACE_ITEM = FOODBLOCKITEM.register("pork_furnace_item", () -> new BlockItem(foodblockregistry.PORK_FURNACE.get(), new BlockItem.Properties()));
   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_FURNACE_ITEM = FOODBLOCKITEM.register("rabbit_furnace_item", () -> new BlockItem(foodblockregistry.RABBIT_FURNACE.get(), new BlockItem.Properties()));
   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_FURNACE_ITEM = FOODBLOCKITEM.register("sugar_furnace_item", () -> new BlockItem(foodblockregistry.SUGAR_FURNACE.get(), new BlockItem.Properties()));
   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_FURNACE_ITEM = FOODBLOCKITEM.register("honeycomb_furnace_item", () -> new BlockItem(foodblockregistry.HONEYCOMB_FURNACE.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Paths
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_STONE_PATH_ITEM = FOODBLOCKITEM.register("apple_stone_path_item", () -> new BlockItem(foodblockregistry.APPLE_STONE_PATH.get(), new BlockItem.Properties()));
   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_STONE_PATH_ITEM = FOODBLOCKITEM.register("potato_stone_path_item", () -> new BlockItem(foodblockregistry.POTATO_STONE_PATH.get(), new BlockItem.Properties()));
   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_STONE_PATH_ITEM = FOODBLOCKITEM.register("beetroot_stone_path_item", () -> new BlockItem(foodblockregistry.BEETROOT_STONE_PATH.get(), new BlockItem.Properties()));
   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_STONE_PATH_ITEM = FOODBLOCKITEM.register("carrot_stone_path_item", () -> new BlockItem(foodblockregistry.CARROT_STONE_PATH.get(), new BlockItem.Properties()));
   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_STONE_PATH_ITEM = FOODBLOCKITEM.register("chorus_stone_path_item", () -> new BlockItem(foodblockregistry.CHORUS_STONE_PATH.get(), new BlockItem.Properties()));
   //.........glow_berry
    public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("glow_berry_stone_path_item", () -> new BlockItem(foodblockregistry.GLOW_BERRY_STONE_PATH.get(), new BlockItem.Properties()));
   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_STONE_PATH_ITEM = FOODBLOCKITEM.register("melon_stone_path_item", () -> new BlockItem(foodblockregistry.MELON_STONE_PATH.get(), new BlockItem.Properties()));
   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("sweet_berry_stone_path_item", () -> new BlockItem(foodblockregistry.SWEET_BERRY_STONE_PATH.get(), new BlockItem.Properties()));
   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_STONE_PATH_ITEM = FOODBLOCKITEM.register("brown_mushroom_stone_path_item", () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_STONE_PATH.get(), new BlockItem.Properties()));
   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_STONE_PATH_ITEM = FOODBLOCKITEM.register("red_mushroom_stone_path_item", () -> new BlockItem(foodblockregistry.RED_MUSHROOM_STONE_PATH.get(), new BlockItem.Properties()));
   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_STONE_PATH_ITEM = FOODBLOCKITEM.register("pumpkin_stone_path_item", () -> new BlockItem(foodblockregistry.PUMPKIN_STONE_PATH.get(), new BlockItem.Properties()));
   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_STONE_PATH_ITEM = FOODBLOCKITEM.register("chicken_stone_path_item", () -> new BlockItem(foodblockregistry.CHICKEN_STONE_PATH.get(), new BlockItem.Properties()));
   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_STONE_PATH_ITEM = FOODBLOCKITEM.register("cod_stone_path_item", () -> new BlockItem(foodblockregistry.COD_STONE_PATH.get(), new BlockItem.Properties()));
   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_STONE_PATH_ITEM = FOODBLOCKITEM.register("salmon_stone_path_item", () -> new BlockItem(foodblockregistry.SALMON_STONE_PATH.get(), new BlockItem.Properties()));
   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_STONE_PATH_ITEM = FOODBLOCKITEM.register("tropical_fish_stone_path_item", () -> new BlockItem(foodblockregistry.TROPICAL_FISH_STONE_PATH.get(), new BlockItem.Properties()));
   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_STONE_PATH_ITEM = FOODBLOCKITEM.register("mutton_stone_path_item", () -> new BlockItem(foodblockregistry.MUTTON_STONE_PATH.get(), new BlockItem.Properties()));
   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_STONE_PATH_ITEM = FOODBLOCKITEM.register("beef_stone_path_item", () -> new BlockItem(foodblockregistry.BEEF_STONE_PATH.get(), new BlockItem.Properties()));
   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_STONE_PATH_ITEM = FOODBLOCKITEM.register("pork_stone_path_item", () -> new BlockItem(foodblockregistry.PORK_STONE_PATH.get(), new BlockItem.Properties()));
   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_STONE_PATH_ITEM = FOODBLOCKITEM.register("rabbit_stone_path_item", () -> new BlockItem(foodblockregistry.RABBIT_STONE_PATH.get(), new BlockItem.Properties()));
   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_STONE_PATH_ITEM = FOODBLOCKITEM.register("sugar_stone_path_item", () -> new BlockItem(foodblockregistry.SUGAR_STONE_PATH.get(), new BlockItem.Properties()));
   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_STONE_PATH_ITEM = FOODBLOCKITEM.register("honeycomb_stone_path_item", () -> new BlockItem(foodblockregistry.HONEYCOMB_STONE_PATH.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Chests
//==============================================================================================================================================================================================

   //.........apple
    //public static final DeferredHolder<Item, BlockItem> APPLE_CHEST_ITEM = FOODBLOCKITEM.register("apple_chest_item", () -> new BlockItem(foodblockregistry.APPLE_CHEST.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Barrels
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_BARREL_ITEM = FOODBLOCKITEM.register("apple_barrel_item", () -> new BlockItem(foodblockregistry.APPLE_BARREL.get(),
    new BlockItem.Properties()));
   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_BARREL_ITEM = FOODBLOCKITEM.register("potato_barrel_item", () -> new BlockItem(foodblockregistry.POTATO_BARREL.get(),
    new BlockItem.Properties()));
   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_BARREL_ITEM = FOODBLOCKITEM.register("beetroot_barrel_item", () -> new BlockItem(foodblockregistry.BEETROOT_BARREL.get(),
    new BlockItem.Properties()));
   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_BARREL_ITEM = FOODBLOCKITEM.register("carrot_barrel_item", () -> new BlockItem(foodblockregistry.CARROT_BARREL.get(),
    new BlockItem.Properties()));
   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_BARREL_ITEM = FOODBLOCKITEM.register("chorus_barrel_item", () -> new BlockItem(foodblockregistry.CHORUS_BARREL.get(),
    new BlockItem.Properties()));
   //.........glowberry
    public static final DeferredHolder<Item, BlockItem> GLOWBERRY_BARREL_ITEM = FOODBLOCKITEM.register("glowberry_barrel_item", () -> new BlockItem(foodblockregistry.GLOWBERRY_BARREL.get(),
    new BlockItem.Properties()));
   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_BARREL_ITEM = FOODBLOCKITEM.register("melon_barrel_item", () -> new BlockItem(foodblockregistry.MELON_BARREL.get(),
    new BlockItem.Properties()));
   //.........sweetberry
    public static final DeferredHolder<Item, BlockItem> SWEETBERRY_BARREL_ITEM = FOODBLOCKITEM.register("sweetberry_barrel_item", () -> new BlockItem(foodblockregistry.SWEETBERRY_BARREL.get(),
    new BlockItem.Properties()));
   //.........brownmushroom
    public static final DeferredHolder<Item, BlockItem> BROWNMUSHROOM_BARREL_ITEM = FOODBLOCKITEM.register("brownmushroom_barrel_item", () -> new BlockItem(foodblockregistry.BROWNMUSHROOM_BARREL.get(),
    new BlockItem.Properties()));
   //.........redmushroom
    public static final DeferredHolder<Item, BlockItem> REDMUSHROOM_BARREL_ITEM = FOODBLOCKITEM.register("redmushroom_barrel_item", () -> new BlockItem(foodblockregistry.REDMUSHROOM_BARREL.get(),
    new BlockItem.Properties()));
   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_BARREL_ITEM = FOODBLOCKITEM.register("pumpkin_barrel_item", () -> new BlockItem(foodblockregistry.PUMPKIN_BARREL.get(),
    new BlockItem.Properties()));
   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_BARREL_ITEM = FOODBLOCKITEM.register("chicken_barrel_item", () -> new BlockItem(foodblockregistry.CHICKEN_BARREL.get(),
    new BlockItem.Properties()));
   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_BARREL_ITEM = FOODBLOCKITEM.register("cod_barrel_item", () -> new BlockItem(foodblockregistry.COD_BARREL.get(),
    new BlockItem.Properties()));
   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_BARREL_ITEM = FOODBLOCKITEM.register("salmon_barrel_item", () -> new BlockItem(foodblockregistry.SALMON_BARREL.get(),
    new BlockItem.Properties()));
   //.........tropicalfish
    public static final DeferredHolder<Item, BlockItem> TROPICALFISH_BARREL_ITEM = FOODBLOCKITEM.register("tropicalfish_barrel_item", () -> new BlockItem(foodblockregistry.TROPICALFISH_BARREL.get(),
    new BlockItem.Properties()));
   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_BARREL_ITEM = FOODBLOCKITEM.register("mutton_barrel_item", () -> new BlockItem(foodblockregistry.MUTTON_BARREL.get(),
    new BlockItem.Properties()));
   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_BARREL_ITEM = FOODBLOCKITEM.register("beef_barrel_item", () -> new BlockItem(foodblockregistry.BEEF_BARREL.get(),
    new BlockItem.Properties()));
   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_BARREL_ITEM = FOODBLOCKITEM.register("pork_barrel_item", () -> new BlockItem(foodblockregistry.PORK_BARREL.get(),
    new BlockItem.Properties()));
   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_BARREL_ITEM = FOODBLOCKITEM.register("rabbit_barrel_item", () -> new BlockItem(foodblockregistry.RABBIT_BARREL.get(),
    new BlockItem.Properties()));
   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_BARREL_ITEM = FOODBLOCKITEM.register("sugar_barrel_item", () -> new BlockItem(foodblockregistry.SUGAR_BARREL.get(),
    new BlockItem.Properties()));
   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_BARREL_ITEM = FOODBLOCKITEM.register("honeycomb_barrel_item", () -> new BlockItem(foodblockregistry.HONEYCOMB_BARREL.get(),
    new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Chairs
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_CHAIR_ITEM = FOODBLOCKITEM.register("apple_chair_item", () -> new BlockItem(foodblockregistry.APPLE_CHAIR.get(),
    new BlockItem.Properties()));

   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_CHAIR_ITEM = FOODBLOCKITEM.register("potato_chair_item", () -> new BlockItem(foodblockregistry.POTATO_CHAIR.get(),
    new BlockItem.Properties()));

   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_CHAIR_ITEM = FOODBLOCKITEM.register("beetroot_chair_item", () -> new BlockItem(foodblockregistry.BEETROOT_CHAIR.get(),
    new BlockItem.Properties()));

   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_CHAIR_ITEM = FOODBLOCKITEM.register("carrot_chair_item", () -> new BlockItem(foodblockregistry.CARROT_CHAIR.get(),
    new BlockItem.Properties()));

   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_CHAIR_ITEM = FOODBLOCKITEM.register("chorus_chair_item", () -> new BlockItem(foodblockregistry.CHORUS_CHAIR.get(),
    new BlockItem.Properties()));

   //.........glow_berry
    public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_CHAIR_ITEM = FOODBLOCKITEM.register("glow_berry_chair_item", () -> new BlockItem(foodblockregistry.GLOW_BERRY_CHAIR.get(),
    new BlockItem.Properties()));

   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_CHAIR_ITEM = FOODBLOCKITEM.register("melon_chair_item", () -> new BlockItem(foodblockregistry.MELON_CHAIR.get(),
    new BlockItem.Properties()));

   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_CHAIR_ITEM = FOODBLOCKITEM.register("sweet_berry_chair_item", () -> new BlockItem(foodblockregistry.SWEET_BERRY_CHAIR.get(),
    new BlockItem.Properties()));

   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_CHAIR_ITEM = FOODBLOCKITEM.register("brown_mushroom_chair_item", () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_CHAIR.get(),
    new BlockItem.Properties()));

   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_CHAIR_ITEM = FOODBLOCKITEM.register("red_mushroom_chair_item", () -> new BlockItem(foodblockregistry.RED_MUSHROOM_CHAIR.get(),
    new BlockItem.Properties()));

   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_CHAIR_ITEM = FOODBLOCKITEM.register("pumpkin_chair_item", () -> new BlockItem(foodblockregistry.PUMPKIN_CHAIR.get(),
    new BlockItem.Properties()));

   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_CHAIR_ITEM = FOODBLOCKITEM.register("chicken_chair_item", () -> new BlockItem(foodblockregistry.CHICKEN_CHAIR.get(),
    new BlockItem.Properties()));

   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_CHAIR_ITEM = FOODBLOCKITEM.register("cod_chair_item", () -> new BlockItem(foodblockregistry.COD_CHAIR.get(),
    new BlockItem.Properties()));

   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_CHAIR_ITEM = FOODBLOCKITEM.register("salmon_chair_item", () -> new BlockItem(foodblockregistry.SALMON_CHAIR.get(),
    new BlockItem.Properties()));

   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_CHAIR_ITEM = FOODBLOCKITEM.register("tropical_fish_chair_item", () -> new BlockItem(foodblockregistry.TROPICAL_FISH_CHAIR.get(),
    new BlockItem.Properties()));

   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_CHAIR_ITEM = FOODBLOCKITEM.register("mutton_chair_item", () -> new BlockItem(foodblockregistry.MUTTON_CHAIR.get(),
    new BlockItem.Properties()));

   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_CHAIR_ITEM = FOODBLOCKITEM.register("beef_chair_item", () -> new BlockItem(foodblockregistry.BEEF_CHAIR.get(),
    new BlockItem.Properties()));

   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_CHAIR_ITEM = FOODBLOCKITEM.register("pork_chair_item", () -> new BlockItem(foodblockregistry.PORK_CHAIR.get(),
    new BlockItem.Properties()));

   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_CHAIR_ITEM = FOODBLOCKITEM.register("rabbit_chair_item", () -> new BlockItem(foodblockregistry.RABBIT_CHAIR.get(),
    new BlockItem.Properties()));

   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_CHAIR_ITEM = FOODBLOCKITEM.register("sugar_chair_item", () -> new BlockItem(foodblockregistry.SUGAR_CHAIR.get(),
    new BlockItem.Properties()));

   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_CHAIR_ITEM = FOODBLOCKITEM.register("honeycomb_chair_item", () -> new BlockItem(foodblockregistry.HONEYCOMB_CHAIR.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Beds
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Item, BlockItem> APPLE_BED_ITEM = FOODBLOCKITEM.register("apple_bed_item", () -> new BlockItem(foodblockregistry.APPLE_BED.get(),
    new BlockItem.Properties()));

   //.........potato
    public static final DeferredHolder<Item, BlockItem> POTATO_BED_ITEM = FOODBLOCKITEM.register("potato_bed_item", () -> new BlockItem(foodblockregistry.POTATO_BED.get(),
    new BlockItem.Properties()));
    
   //.........beetroot
    public static final DeferredHolder<Item, BlockItem> BEETROOT_BED_ITEM = FOODBLOCKITEM.register("beetroot_bed_item", () -> new BlockItem(foodblockregistry.BEETROOT_BED.get(),
    new BlockItem.Properties()));

   //.........carrot
    public static final DeferredHolder<Item, BlockItem> CARROT_BED_ITEM = FOODBLOCKITEM.register("carrot_bed_item", () -> new BlockItem(foodblockregistry.CARROT_BED.get(),
    new BlockItem.Properties()));

   //.........chorus
    public static final DeferredHolder<Item, BlockItem> CHORUS_BED_ITEM = FOODBLOCKITEM.register("chorus_bed_item", () -> new BlockItem(foodblockregistry.CHORUS_BED.get(),
    new BlockItem.Properties()));

   //.........glow_berry
    public static final DeferredHolder<Item, BlockItem> GLOW_BERRY_BED_ITEM = FOODBLOCKITEM.register("glow_berry_bed_item", () -> new BlockItem(foodblockregistry.GLOW_BERRY_BED.get(),
    new BlockItem.Properties()));

   //.........melon
    public static final DeferredHolder<Item, BlockItem> MELON_BED_ITEM = FOODBLOCKITEM.register("melon_bed_item", () -> new BlockItem(foodblockregistry.MELON_BED.get(),
    new BlockItem.Properties()));

   //.........sweet_berry
    public static final DeferredHolder<Item, BlockItem> SWEET_BERRY_BED_ITEM = FOODBLOCKITEM.register("sweet_berry_bed_item", () -> new BlockItem(foodblockregistry.SWEET_BERRY_BED.get(),
    new BlockItem.Properties()));

   //.........brown_mushroom
    public static final DeferredHolder<Item, BlockItem> BROWN_MUSHROOM_BED_ITEM = FOODBLOCKITEM.register("brown_mushroom_bed_item", () -> new BlockItem(foodblockregistry.BROWN_MUSHROOM_BED.get(),
    new BlockItem.Properties()));

   //.........red_mushroom
    public static final DeferredHolder<Item, BlockItem> RED_MUSHROOM_BED_ITEM = FOODBLOCKITEM.register("red_mushroom_bed_item", () -> new BlockItem(foodblockregistry.RED_MUSHROOM_BED.get(),
    new BlockItem.Properties()));

   //.........pumpkin
    public static final DeferredHolder<Item, BlockItem> PUMPKIN_BED_ITEM = FOODBLOCKITEM.register("pumpkin_bed_item", () -> new BlockItem(foodblockregistry.PUMPKIN_BED.get(),
    new BlockItem.Properties()));

   //.........chicken
    public static final DeferredHolder<Item, BlockItem> CHICKEN_BED_ITEM = FOODBLOCKITEM.register("chicken_bed_item", () -> new BlockItem(foodblockregistry.CHICKEN_BED.get(),
    new BlockItem.Properties()));

   //.........cod
    public static final DeferredHolder<Item, BlockItem> COD_BED_ITEM = FOODBLOCKITEM.register("cod_bed_item", () -> new BlockItem(foodblockregistry.COD_BED.get(),
    new BlockItem.Properties()));

   //.........salmon
    public static final DeferredHolder<Item, BlockItem> SALMON_BED_ITEM = FOODBLOCKITEM.register("salmon_bed_item", () -> new BlockItem(foodblockregistry.SALMON_BED.get(),
    new BlockItem.Properties()));

   //.........tropical_fish
    public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_BED_ITEM = FOODBLOCKITEM.register("tropical_fish_bed_item", () -> new BlockItem(foodblockregistry.TROPICAL_FISH_BED.get(),
    new BlockItem.Properties()));

   //.........mutton
    public static final DeferredHolder<Item, BlockItem> MUTTON_BED_ITEM = FOODBLOCKITEM.register("mutton_bed_item", () -> new BlockItem(foodblockregistry.MUTTON_BED.get(),
    new BlockItem.Properties()));

   //.........beef
    public static final DeferredHolder<Item, BlockItem> BEEF_BED_ITEM = FOODBLOCKITEM.register("beef_bed_item", () -> new BlockItem(foodblockregistry.BEEF_BED.get(),
    new BlockItem.Properties()));

   //.........pork
    public static final DeferredHolder<Item, BlockItem> PORK_BED_ITEM = FOODBLOCKITEM.register("pork_bed_item", () -> new BlockItem(foodblockregistry.PORK_BED.get(),
    new BlockItem.Properties()));

   //.........rabbit
    public static final DeferredHolder<Item, BlockItem> RABBIT_BED_ITEM = FOODBLOCKITEM.register("rabbit_bed_item", () -> new BlockItem(foodblockregistry.RABBIT_BED.get(),
    new BlockItem.Properties()));

   //.........sugar
    public static final DeferredHolder<Item, BlockItem> SUGAR_BED_ITEM = FOODBLOCKITEM.register("sugar_bed_item", () -> new BlockItem(foodblockregistry.SUGAR_BED.get(),
    new BlockItem.Properties()));
   //.........honeycomb
    public static final DeferredHolder<Item, BlockItem> HONEYCOMB_BED_ITEM = FOODBLOCKITEM.register("honeycomb_bed_item", () -> new BlockItem(foodblockregistry.HONEYCOMB_BED.get(),
    new BlockItem.Properties()));


//==============================================================================================================================================================================================
//                                                                                         Cabinets
//==============================================================================================================================================================================================

   //.........apple
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_APPLE_CABINET_ITEM = FOODBLOCKITEM.register("small_apple_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_APPLE_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_APPLE_CABINET_ITEM = FOODBLOCKITEM.register("medium_apple_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_APPLE_CABINET.get(),
      new BlockItem.Properties()));
   //.........potato
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_POTATO_CABINET_ITEM = FOODBLOCKITEM.register("small_potato_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_POTATO_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_POTATO_CABINET_ITEM = FOODBLOCKITEM.register("medium_potato_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_POTATO_CABINET.get(),
      new BlockItem.Properties()));
   //.........beetroot
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_BEETROOT_CABINET_ITEM = FOODBLOCKITEM.register("small_beetroot_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_BEETROOT_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_BEETROOT_CABINET_ITEM = FOODBLOCKITEM.register("medium_beetroot_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_BEETROOT_CABINET.get(),
      new BlockItem.Properties()));
   //.........carrot
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_CARROT_CABINET_ITEM = FOODBLOCKITEM.register("small_carrot_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_CARROT_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_CARROT_CABINET_ITEM = FOODBLOCKITEM.register("medium_carrot_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_CARROT_CABINET.get(),
      new BlockItem.Properties()));
   //.........chorus
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_CHORUS_CABINET_ITEM = FOODBLOCKITEM.register("small_chorus_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_CHORUS_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_CHORUS_CABINET_ITEM = FOODBLOCKITEM.register("medium_chorus_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_CHORUS_CABINET.get(),
      new BlockItem.Properties()));
   //.........glow_berry
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_GLOW_BERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_glow_berry_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_GLOW_BERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_GLOW_BERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_glow_berry_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_GLOW_BERRY_CABINET.get(),
      new BlockItem.Properties()));
   //.........melon
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_MELON_CABINET_ITEM = FOODBLOCKITEM.register("small_melon_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_MELON_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_MELON_CABINET_ITEM = FOODBLOCKITEM.register("medium_melon_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_MELON_CABINET.get(),
      new BlockItem.Properties()));
   //.........sweet_berry
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_SWEET_BERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_sweet_berry_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_SWEET_BERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_SWEET_BERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_sweet_berry_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_SWEET_BERRY_CABINET.get(),
      new BlockItem.Properties()));
   //.........brown_mushroom
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_BROWN_MUSHROOM_CABINET_ITEM = FOODBLOCKITEM.register("small_brown_mushroom_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_BROWN_MUSHROOM_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_BROWN_MUSHROOM_CABINET_ITEM = FOODBLOCKITEM.register("medium_brown_mushroom_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_BROWN_MUSHROOM_CABINET.get(),
      new BlockItem.Properties()));
   //.........red_mushroom
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_RED_MUSHROOM_CABINET_ITEM = FOODBLOCKITEM.register("small_red_mushroom_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_RED_MUSHROOM_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_RED_MUSHROOM_CABINET_ITEM = FOODBLOCKITEM.register("medium_red_mushroom_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_RED_MUSHROOM_CABINET.get(),
      new BlockItem.Properties()));
   //.........pumpkin
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_PUMPKIN_CABINET_ITEM = FOODBLOCKITEM.register("small_pumpkin_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_PUMPKIN_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_PUMPKIN_CABINET_ITEM = FOODBLOCKITEM.register("medium_pumpkin_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_PUMPKIN_CABINET.get(),
      new BlockItem.Properties()));
   //.........chicken
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_CHICKEN_CABINET_ITEM = FOODBLOCKITEM.register("small_chicken_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_CHICKEN_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_CHICKEN_CABINET_ITEM = FOODBLOCKITEM.register("medium_chicken_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_CHICKEN_CABINET.get(),
      new BlockItem.Properties()));
   //.........cod
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_COD_CABINET_ITEM = FOODBLOCKITEM.register("small_cod_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_COD_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_COD_CABINET_ITEM = FOODBLOCKITEM.register("medium_cod_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_COD_CABINET.get(),
      new BlockItem.Properties()));
   //.........salmon
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_SALMON_CABINET_ITEM = FOODBLOCKITEM.register("small_salmon_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_SALMON_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_SALMON_CABINET_ITEM = FOODBLOCKITEM.register("medium_salmon_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_SALMON_CABINET.get(),
      new BlockItem.Properties()));
   //.........tropical_fish
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_TROPICAL_FISH_CABINET_ITEM = FOODBLOCKITEM.register("small_tropical_fish_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_TROPICAL_FISH_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_TROPICAL_FISH_CABINET_ITEM = FOODBLOCKITEM.register("medium_tropical_fish_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_TROPICAL_FISH_CABINET.get(),
      new BlockItem.Properties()));
   //.........mutton
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_MUTTON_CABINET_ITEM = FOODBLOCKITEM.register("small_mutton_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_MUTTON_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_MUTTON_CABINET_ITEM = FOODBLOCKITEM.register("medium_mutton_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_MUTTON_CABINET.get(),
      new BlockItem.Properties()));
   //.........beef
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_BEEF_CABINET_ITEM = FOODBLOCKITEM.register("small_beef_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_BEEF_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_BEEF_CABINET_ITEM = FOODBLOCKITEM.register("medium_beef_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_BEEF_CABINET.get(),
      new BlockItem.Properties()));
   //.........pork
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_PORK_CABINET_ITEM = FOODBLOCKITEM.register("small_pork_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_PORK_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_PORK_CABINET_ITEM = FOODBLOCKITEM.register("medium_pork_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_PORK_CABINET.get(),
      new BlockItem.Properties()));
   //.........rabbit
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_RABBIT_CABINET_ITEM = FOODBLOCKITEM.register("small_rabbit_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_RABBIT_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_RABBIT_CABINET_ITEM = FOODBLOCKITEM.register("medium_rabbit_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_RABBIT_CABINET.get(),
      new BlockItem.Properties()));
   //.........sugar
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_SUGAR_CABINET_ITEM = FOODBLOCKITEM.register("small_sugar_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_SUGAR_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_SUGAR_CABINET_ITEM = FOODBLOCKITEM.register("medium_sugar_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_SUGAR_CABINET.get(),
      new BlockItem.Properties()));
   //.........honeycomb
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_HONEYCOMB_CABINET_ITEM = FOODBLOCKITEM.register("small_honeycomb_cabinet_item", () -> new BlockItem(foodblockregistry.SMALL_HONEYCOMB_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_HONEYCOMB_CABINET_ITEM = FOODBLOCKITEM.register("medium_honeycomb_cabinet_item", () -> new BlockItem(foodblockregistry.MEDIUM_HONEYCOMB_CABINET.get(),
      new BlockItem.Properties()));
}
