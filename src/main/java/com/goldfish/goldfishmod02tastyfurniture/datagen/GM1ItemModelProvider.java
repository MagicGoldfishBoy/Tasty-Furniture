package com.goldfish.goldfishmod02tastyfurniture.datagen;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class GM1ItemModelProvider extends ItemModelProvider {

        public GM1ItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, "goldfishmod02tastyfurniture", existingFileHelper);
    }

        @Override
        protected void registerModels() {
          //withExistingParent("apple_button_item", modLoc("block/apple_button"));
          //withExistingParent("apple_button_item", mcLoc("item/generated")).texture("layer0", "item/example_item");

    //-------------------------------------------------------------doors---------------------------------------------------------------------
      //.........glow berry
        withExistingParent("glow_berry_door_item", mcLoc("item/generated")).texture("layer0", "item/glow_berry_door");
      //...........melon
        withExistingParent("melon_door_item", mcLoc("item/generated")).texture("layer0", "item/melon_door");
      //.........sweet berry
        withExistingParent("sweet_berry_door_item", mcLoc("item/generated")).texture("layer0", "item/sweet_berry_door");
      //.........brown mushroom
        withExistingParent("brown_mushroom_door_item", mcLoc("item/generated")).texture("layer0", "item/brown_mushroom_door");
      //..........red mushroom
        withExistingParent("red_mushroom_door_item", mcLoc("item/generated")).texture("layer0", "item/red_mushroom_door");
      //.............pumpkin
        withExistingParent("pumpkin_door_item", mcLoc("item/generated")).texture("layer0", "item/pumpkin_door");
      //.............chicken
        withExistingParent("chicken_door_item", mcLoc("item/generated")).texture("layer0", "item/chicken_door");
      //...............cod
        withExistingParent("cod_door_item", mcLoc("item/generated")).texture("layer0", "item/cod_door");
      //..............salmon
        withExistingParent("salmon_door_item", mcLoc("item/generated")).texture("layer0", "item/salmon_door");
      //..............tropical_fish
        withExistingParent("tropical_fish_door_item", mcLoc("item/generated")).texture("layer0", "item/tropical_fish_door");
      //..............mutton
        withExistingParent("mutton_door_item", mcLoc("item/generated")).texture("layer0", "item/mutton_door");
      //...............beef
        withExistingParent("beef_door_item", mcLoc("item/generated")).texture("layer0", "item/beef_door");
      //...............pork
        withExistingParent("pork_door_item", mcLoc("item/generated")).texture("layer0", "item/pork_door");
      //...............rabbit
        withExistingParent("rabbit_door_item", mcLoc("item/generated")).texture("layer0", "item/rabbit_door");

    //-----------------------------------------------------------buttons-------------------------------------------------------------------
      //..............apple
        buttonInventory("apple_button_item", modLoc("block/apple_block"));
      //.............potato
        buttonInventory("potato_button_item", modLoc("block/potato_block"));
      //.............beetroot
        buttonInventory("beetroot_button_item", modLoc("block/beetroot_block"));
      //.............carrot
        buttonInventory("carrot_button_item", modLoc("block/carrot_block"));
      //.............chorus
        buttonInventory("chorus_button_item", modLoc("block/chorus_block"));
      //............glow_berry
        buttonInventory("glow_berry_button_item", modLoc("block/glow_berry_block"));
      //.............melon
        buttonInventory("melon_button_item", modLoc("block/melon_block"));
      //..........sweet_berry
        buttonInventory("sweet_berry_button_item", modLoc("block/sweet_berry_block"));
      //..........brown_mushroom
        buttonInventory("brown_mushroom_button_item", modLoc("block/brown_mushroom_block"));
      //..........red_mushroom
        buttonInventory("red_mushroom_button_item", modLoc("block/red_mushroom_block"));
      //..........pumpkin
        buttonInventory("pumpkin_button_item", modLoc("block/pumpkin_block"));
      //..........chicken
        buttonInventory("chicken_button_item", modLoc("block/chicken_block"));
      //............cod
        buttonInventory("cod_button_item", modLoc("block/cod_block"));
      //...........salmon
        buttonInventory("salmon_button_item", modLoc("block/salmon_block"));
      //.........tropical_fish
        buttonInventory("tropical_fish_button_item", modLoc("block/tropical_fish_block"));
      //...........mutton
        buttonInventory("mutton_button_item", modLoc("block/mutton_block"));
      //............beef
        buttonInventory("beef_button_item", modLoc("block/beef_block"));
      //............pork
        buttonInventory("pork_button_item", modLoc("block/pork_block"));
      //............rabbit
        buttonInventory("rabbit_button_item", modLoc("block/rabbit_block"));

    //-----------------------------------------------------------fences-------------------------------------------------------------------
      //..............apple
        fenceInventory("apple_fence_item", modLoc("block/apple_block"));

        }
    
}
