package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
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
    
     // -------------------------------------------------------------------------------------Brick
     // Blocks--------------------------------------------------------------------------------------------
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

//==============================================================================================================================================================================================
//                                                                                          Signs
//==============================================================================================================================================================================================

  //apple
     public static final DeferredHolder<Item, SignItem> APPLE_SIGN_ITEM = FOODBLOCKITEM.register("apple_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.APPLE_STANDING_SIGN.get(), foodblockregistry.APPLE_WALL_SIGN.get()));
  //potato
     public static final DeferredHolder<Item, SignItem> POTATO_SIGN_ITEM = FOODBLOCKITEM.register("potato_sign_item",
     () -> new SignItem(new SignItem.Properties(), foodblockregistry.POTATO_STANDING_SIGN.get(), foodblockregistry.POTATO_WALL_SIGN.get()));

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

}
