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

     public static final DeferredHolder<Item, BlockItem> PUMPKIN_BLOCK_ITEM = FOODBLOCKITEM.register("pumpkin_block_item",
     () -> new BlockItem(foodblockregistry.PUMPKIN_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> CHICKEN_BLOCK_ITEM = FOODBLOCKITEM.register("chicken_block_item",
     () -> new BlockItem(foodblockregistry.CHICKEN_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> COD_BLOCK_ITEM = FOODBLOCKITEM.register("cod_block_item",
     () -> new BlockItem(foodblockregistry.COD_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> SALMON_BLOCK_ITEM = FOODBLOCKITEM.register("salmon_block_item",
     () -> new BlockItem(foodblockregistry.SALMON_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> TROPICAL_FISH_BLOCK_ITEM = FOODBLOCKITEM.register("tropical_fish_block_item",
     () -> new BlockItem(foodblockregistry.TROPICAL_FISH_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> MUTTON_BLOCK_ITEM = FOODBLOCKITEM.register("mutton_block_item",
     () -> new BlockItem(foodblockregistry.MUTTON_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> BEEF_BLOCK_ITEM = FOODBLOCKITEM.register("beef_block_item",
     () -> new BlockItem(foodblockregistry.BEEF_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> PORK_BLOCK_ITEM = FOODBLOCKITEM.register("pork_block_item",
     () -> new BlockItem(foodblockregistry.PORK_BLOCK.get(), new BlockItem.Properties()));

     public static final DeferredHolder<Item, BlockItem> RABBIT_BLOCK_ITEM = FOODBLOCKITEM.register("rabbit_block_item",
     () -> new BlockItem(foodblockregistry.RABBIT_BLOCK.get(), new BlockItem.Properties()));

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

     // public static final DeferredHolder<Item, BlockItem> APPLE_SIGN_ITEM = FOODBLOCKITEM.register("apple_sign_item",
     // () -> new BlockItem(foodblockregistry.APPLE_SIGN.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                          Slabs
//==============================================================================================================================================================================================

     public static final DeferredHolder<Item, BlockItem> APPLE_SLAB_ITEM = FOODBLOCKITEM.register("apple_slab_item",
     () -> new BlockItem(foodblockregistry.APPLE_SLAB.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                          Stairs
//==============================================================================================================================================================================================

     public static final DeferredHolder<Item, BlockItem> APPLE_STAIRS_ITEM = FOODBLOCKITEM.register("apple_stairs_item",
     () -> new BlockItem(foodblockregistry.APPLE_STAIRS.get(), new BlockItem.Properties()));

//==============================================================================================================================================================================================
//                                                                                         Trapdoors
//==============================================================================================================================================================================================

     public static final DeferredHolder<Item, BlockItem> APPLE_TRAPDOOR_ITEM = FOODBLOCKITEM.register("apple_trapdoor_item",
     () -> new BlockItem(foodblockregistry.APPLE_TRAPDOOR.get(), new BlockItem.Properties()));

}
