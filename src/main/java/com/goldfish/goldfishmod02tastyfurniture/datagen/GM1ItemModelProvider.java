package com.goldfish.goldfishmod02tastyfurniture.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


public class GM1ItemModelProvider extends ItemModelProvider {

        public GM1ItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, "goldfishmod02tastyfurniture", existingFileHelper);
    }

        @Override
        protected void registerModels() {
          buildToolModels();
          buildPasteModels();
          buildPowderModels();
          buildIngotModels();
          buildNuggetModels();
          buildRegularBlockModels();
          buildBricksBlockModels();
    //-------------------------------------------------------------blocks--------------------------------------------------------------------
     //____________________________________________________________bricks_____________________________________________________________________

     //___________________________________________________________chiseled____________________________________________________________________
      //.........apple
        withExistingParent("apple_chiseled_block_item", modLoc("block/apple_chiseled_block"));
      //.........potato
        withExistingParent("potato_chiseled_block_item", modLoc("block/potato_chiseled_block"));
      //.........beetroot
        withExistingParent("beetroot_chiseled_block_item", modLoc("block/beetroot_chiseled_block"));
      //.........carrot
        withExistingParent("carrot_chiseled_block_item", modLoc("block/carrot_chiseled_block"));
      //.........chorus
        withExistingParent("chorus_chiseled_block_item", modLoc("block/chorus_chiseled_block"));
      //.........glow_berry
        withExistingParent("glow_berry_chiseled_block_item", modLoc("block/glow_berry_chiseled_block"));
      //.........melon
        withExistingParent("melon_chiseled_block_item", modLoc("block/melon_chiseled_block"));
      //.........sweet_berry
        withExistingParent("sweet_berry_chiseled_block_item", modLoc("block/sweet_berry_chiseled_block"));
      //.........brown_mushroom
        withExistingParent("brown_mushroom_chiseled_block_item", modLoc("block/brown_mushroom_chiseled_block"));
      //.........red_mushroom
        withExistingParent("red_mushroom_chiseled_block_item", modLoc("block/red_mushroom_chiseled_block"));
      //.........pumpkin
        withExistingParent("pumpkin_chiseled_block_item", modLoc("block/pumpkin_chiseled_block"));
      //.........chicken
        withExistingParent("chicken_chiseled_block_item", modLoc("block/chicken_chiseled_block"));
      //.........cod
        withExistingParent("cod_chiseled_block_item", modLoc("block/cod_chiseled_block"));
      //.........salmon
        withExistingParent("salmon_chiseled_block_item", modLoc("block/salmon_chiseled_block"));
      //.........tropical_fish
        withExistingParent("tropical_fish_chiseled_block_item", modLoc("block/tropical_fish_chiseled_block"));
      //.........mutton
        withExistingParent("mutton_chiseled_block_item", modLoc("block/mutton_chiseled_block"));
      //.........beef
        withExistingParent("beef_chiseled_block_item", modLoc("block/beef_chiseled_block"));
      //.........pork
        withExistingParent("pork_chiseled_block_item", modLoc("block/pork_chiseled_block"));
      //.........rabbit
        withExistingParent("rabbit_chiseled_block_item", modLoc("block/rabbit_chiseled_block"));
      //.........sugar
        withExistingParent("sugar_chiseled_block_item", modLoc("block/sugar_chiseled_block"));
      //.........honeycomb
        withExistingParent("honeycomb_chiseled_block_item", modLoc("block/honeycomb_chiseled_block"));

     //___________________________________________________________tile____________________________________________________________________
      //.........apple
        withExistingParent("apple_tile_block_item", modLoc("block/apple_tile_block"));
      //.........potato
        withExistingParent("potato_tile_block_item", modLoc("block/potato_tile_block"));
      //.........beetroot
        withExistingParent("beetroot_tile_block_item", modLoc("block/beetroot_tile_block"));
      //.........carrot
        withExistingParent("carrot_tile_block_item", modLoc("block/carrot_tile_block"));
      //.........chorus
        withExistingParent("chorus_tile_block_item", modLoc("block/chorus_tile_block"));
      //.........glow_berry
        withExistingParent("glow_berry_tile_block_item", modLoc("block/glow_berry_tile_block"));
      //.........melon
        withExistingParent("melon_tile_block_item", modLoc("block/melon_tile_block"));
      //.........sweet_berry
        withExistingParent("sweet_berry_tile_block_item", modLoc("block/sweet_berry_tile_block"));
      //.........brown_mushroom
        withExistingParent("brown_mushroom_tile_block_item", modLoc("block/brown_mushroom_tile_block"));
      //.........red_mushroom
        withExistingParent("red_mushroom_tile_block_item", modLoc("block/red_mushroom_tile_block"));
      //.........pumpkin
        withExistingParent("pumpkin_tile_block_item", modLoc("block/pumpkin_tile_block"));
      //.........chicken
        withExistingParent("chicken_tile_block_item", modLoc("block/chicken_tile_block"));
      //.........cod
        withExistingParent("cod_tile_block_item", modLoc("block/cod_tile_block"));
      //.........salmon
        withExistingParent("salmon_tile_block_item", modLoc("block/salmon_tile_block"));
      //.........tropical_fish
        withExistingParent("tropical_fish_tile_block_item", modLoc("block/tropical_fish_tile_block"));
      //.........mutton
        withExistingParent("mutton_tile_block_item", modLoc("block/mutton_tile_block"));
      //.........beef
        withExistingParent("beef_tile_block_item", modLoc("block/beef_tile_block"));
      //.........pork
        withExistingParent("pork_tile_block_item", modLoc("block/pork_tile_block"));
      //.........rabbit
        withExistingParent("rabbit_tile_block_item", modLoc("block/rabbit_tile_block"));
      //.........sugar
        withExistingParent("sugar_tile_block_item", modLoc("block/sugar_tile_block"));
      //.........honeycomb
        withExistingParent("honeycomb_tile_block_item", modLoc("block/honeycomb_tile_block"));

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
      //...............sugar
        withExistingParent("sugar_door_item", mcLoc("item/generated")).texture("layer0", "item/sugar_door");
      //...............honeycomb
        withExistingParent("honeycomb_door_item", mcLoc("item/generated")).texture("layer0", "item/honeycomb_door");

    //------------------------------------------------------------buttons--------------------------------------------------------------------
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
      //............sugar
        buttonInventory("sugar_button_item", modLoc("block/sugar_block"));
      //............honeycomb
        buttonInventory("honeycomb_button_item", modLoc("block/processed_honeycomb_block"));

    //------------------------------------------------------------fences---------------------------------------------------------------------
      //..............apple
        fenceInventory("apple_fence_item", modLoc("block/apple_block"));
      //..............potato
       fenceInventory("potato_fence_item", modLoc("block/potato_block"));
      //..............beetroot
       fenceInventory("beetroot_fence_item", modLoc("block/beetroot_block"));
      //..............carrot
       fenceInventory("carrot_fence_item", modLoc("block/carrot_block"));
      //..............chorus
       fenceInventory("chorus_fence_item", modLoc("block/chorus_block"));
      //..............glow_berry
       fenceInventory("glow_berry_fence_item", modLoc("block/glow_berry_block"));
      //..............melon
       fenceInventory("melon_fence_item", modLoc("block/melon_block"));
      //..............sweet_berry
       fenceInventory("sweet_berry_fence_item", modLoc("block/sweet_berry_block"));
      //..............brown_mushroom
       fenceInventory("brown_mushroom_fence_item", modLoc("block/brown_mushroom_block"));
      //..............red_mushroom
       fenceInventory("red_mushroom_fence_item", modLoc("block/red_mushroom_block"));
      //..............pumpkin
       fenceInventory("pumpkin_fence_item", modLoc("block/pumpkin_block"));
      //..............chicken
       fenceInventory("chicken_fence_item", modLoc("block/chicken_block"));
      //..............cod
       fenceInventory("cod_fence_item", modLoc("block/cod_block"));
      //..............salmon
       fenceInventory("salmon_fence_item", modLoc("block/salmon_block"));
      //..............tropical_fish
       fenceInventory("tropical_fish_fence_item", modLoc("block/tropical_fish_block"));
      //..............mutton
       fenceInventory("mutton_fence_item", modLoc("block/mutton_block"));
      //..............beef
       fenceInventory("beef_fence_item", modLoc("block/beef_block"));
      //..............pork
       fenceInventory("pork_fence_item", modLoc("block/pork_block"));
      //..............rabbit
       fenceInventory("rabbit_fence_item", modLoc("block/rabbit_block"));
      //..............sugar
       fenceInventory("sugar_fence_item", modLoc("block/sugar_block"));
      //..............honeycomb
       fenceInventory("honeycomb_fence_item", modLoc("block/processed_honeycomb_block"));
    //------------------------------------------------------------gates---------------------------------------------------------------------
      //..............apple
       withExistingParent("apple_gate_item", modLoc("block/apple_fence_gate"));
      //..............potato
       withExistingParent("potato_gate_item", modLoc("block/potato_fence_gate"));
      //..............beetroot
       withExistingParent("beetroot_gate_item", modLoc("block/beetroot_fence_gate"));
      //..............carrot
       withExistingParent("carrot_gate_item", modLoc("block/carrot_fence_gate"));
      //..............chorus
       withExistingParent("chorus_gate_item", modLoc("block/chorus_fence_gate"));
      //..............glow_berry
       withExistingParent("glow_berry_gate_item", modLoc("block/glow_berry_fence_gate"));
      //..............melon
       withExistingParent("melon_gate_item", modLoc("block/melon_fence_gate"));
      //..............sweet_berry
       withExistingParent("sweet_berry_gate_item", modLoc("block/sweet_berry_fence_gate"));
      //..............brown_mushroom
       withExistingParent("brown_mushroom_gate_item", modLoc("block/brown_mushroom_fence_gate"));
      //..............red_mushroom
       withExistingParent("red_mushroom_gate_item", modLoc("block/red_mushroom_fence_gate"));
      //..............pumpkin
       withExistingParent("pumpkin_gate_item", modLoc("block/pumpkin_fence_gate"));
      //..............chicken
       withExistingParent("chicken_gate_item", modLoc("block/chicken_fence_gate"));
      //..............cod
       withExistingParent("cod_gate_item", modLoc("block/cod_fence_gate"));
      //..............salmon
       withExistingParent("salmon_gate_item", modLoc("block/salmon_fence_gate"));
      //..............tropical_fish
       withExistingParent("tropical_fish_gate_item", modLoc("block/tropical_fish_fence_gate"));
      //..............mutton
       withExistingParent("mutton_gate_item", modLoc("block/mutton_fence_gate"));
      //..............beef
       withExistingParent("beef_gate_item", modLoc("block/beef_fence_gate"));
      //..............pork
       withExistingParent("pork_gate_item", modLoc("block/pork_fence_gate"));
      //..............rabbit
       withExistingParent("rabbit_gate_item", modLoc("block/rabbit_fence_gate"));
      //..............sugar
       withExistingParent("sugar_gate_item", modLoc("block/sugar_fence_gate"));
      //..............honeycomb
       withExistingParent("honeycomb_gate_item", modLoc("block/honeycomb_fence_gate"));
    //-------------------------------------------------------pressure plates-----------------------------------------------------------------
      //..............apple
       pressurePlate("apple_pressure_plate_item", modLoc("block/apple_block"));
      //..............potato
       pressurePlate("potato_pressure_plate_item", modLoc("block/potato_block"));
      //..............beetroot
       pressurePlate("beetroot_pressure_plate_item", modLoc("block/beetroot_block"));
      //..............carrot
       pressurePlate("carrot_pressure_plate_item", modLoc("block/carrot_block"));
      //..............chorus
       pressurePlate("chorus_pressure_plate_item", modLoc("block/chorus_block"));
      //..............glow_berry
       pressurePlate("glow_berry_pressure_plate_item", modLoc("block/glow_berry_block"));
      //..............melon
       pressurePlate("melon_pressure_plate_item", modLoc("block/melon_block"));
      //..............sweet_berry
       pressurePlate("sweet_berry_pressure_plate_item", modLoc("block/sweet_berry_block"));
      //..............brown_mushroom
       pressurePlate("brown_mushroom_pressure_plate_item", modLoc("block/brown_mushroom_block"));
      //..............red_mushroom
       pressurePlate("red_mushroom_pressure_plate_item", modLoc("block/red_mushroom_block"));
      //..............pumpkin
       pressurePlate("pumpkin_pressure_plate_item", modLoc("block/pumpkin_block"));
      //..............chicken
       pressurePlate("chicken_pressure_plate_item", modLoc("block/chicken_block"));
      //..............cod
       pressurePlate("cod_pressure_plate_item", modLoc("block/cod_block"));
      //..............salmon
       pressurePlate("salmon_pressure_plate_item", modLoc("block/salmon_block"));
      //..............tropical_fish
       pressurePlate("tropical_fish_pressure_plate_item", modLoc("block/tropical_fish_block"));
      //..............mutton
       pressurePlate("mutton_pressure_plate_item", modLoc("block/mutton_block"));
      //..............beef
       pressurePlate("beef_pressure_plate_item", modLoc("block/beef_block"));
      //..............pork
       pressurePlate("pork_pressure_plate_item", modLoc("block/pork_block"));
      //..............rabbit
       pressurePlate("rabbit_pressure_plate_item", modLoc("block/rabbit_block"));
      //..............sugar
       pressurePlate("sugar_pressure_plate_item", modLoc("block/sugar_block"));
      //..............honeycomb
       pressurePlate("honeycomb_pressure_plate_item", modLoc("block/processed_honeycomb_block"));

    //-------------------------------------------------------------signs---------------------------------------------------------------------
      //..............apple
       withExistingParent("apple_sign_item", mcLoc("item/generated")).texture("layer0", "item/apple_sign");
      //..............potato
       withExistingParent("potato_sign_item", mcLoc("item/generated")).texture("layer0", "item/potato_sign");
      //..............beetroot
       withExistingParent("beetroot_sign_item", mcLoc("item/generated")).texture("layer0", "item/beetroot_sign");
      //..............carrot
       withExistingParent("carrot_sign_item", mcLoc("item/generated")).texture("layer0", "item/carrot_sign");
      //..............chorus
       withExistingParent("chorus_sign_item", mcLoc("item/generated")).texture("layer0", "item/chorus_sign");
      //..............glowberry
       withExistingParent("glowberry_sign_item", mcLoc("item/generated")).texture("layer0", "item/glowberry_sign");
      //..............melon
       withExistingParent("melon_sign_item", mcLoc("item/generated")).texture("layer0", "item/melon_sign");
      //..............sweetberry
       withExistingParent("sweetberry_sign_item", mcLoc("item/generated")).texture("layer0", "item/sweetberry_sign");
      //..............brownmushroom
       withExistingParent("brownmushroom_sign_item", mcLoc("item/generated")).texture("layer0", "item/brownmushroom_sign");
      //..............redmushroom
       withExistingParent("redmushroom_sign_item", mcLoc("item/generated")).texture("layer0", "item/redmushroom_sign");
      //..............pumpkin
       withExistingParent("pumpkin_sign_item", mcLoc("item/generated")).texture("layer0", "item/pumpkin_sign");
      //..............chicken
       withExistingParent("chicken_sign_item", mcLoc("item/generated")).texture("layer0", "item/chicken_sign");
      //..............cod
       withExistingParent("cod_sign_item", mcLoc("item/generated")).texture("layer0", "item/cod_sign");
      //..............salmon
       withExistingParent("salmon_sign_item", mcLoc("item/generated")).texture("layer0", "item/salmon_sign");
      //..............tropicalfish
       withExistingParent("tropicalfish_sign_item", mcLoc("item/generated")).texture("layer0", "item/tropicalfish_sign");
      //..............mutton
       withExistingParent("mutton_sign_item", mcLoc("item/generated")).texture("layer0", "item/mutton_sign");
      //..............beef
       withExistingParent("beef_sign_item", mcLoc("item/generated")).texture("layer0", "item/beef_sign");
      //..............pork
       withExistingParent("pork_sign_item", mcLoc("item/generated")).texture("layer0", "item/pork_sign");
      //..............rabbit
       withExistingParent("rabbit_sign_item", mcLoc("item/generated")).texture("layer0", "item/rabbit_sign");
      //..............sugar
       withExistingParent("sugar_sign_item", mcLoc("item/generated")).texture("layer0", "item/sugar_sign");
      //..............honeycomb
       withExistingParent("honeycomb_sign_item", mcLoc("item/generated")).texture("layer0", "item/honeycomb_sign");

    //-------------------------------------------------------------slabs---------------------------------------------------------------------
     //________________________________________________________Regular Slabs_________________________________________________________________
      //..............apple
       slab("apple_slab_item", modLoc("block/apple_block"), modLoc("block/apple_block"), modLoc("block/apple_block"));
      //..............potato
       slab("potato_slab_item", modLoc("block/potato_block"), modLoc("block/potato_block"), modLoc("block/potato_block"));
      //..............beetroot
       slab("beetroot_slab_item", modLoc("block/beetroot_block"), modLoc("block/beetroot_block"), modLoc("block/beetroot_block"));
      //..............carrot
       slab("carrot_slab_item", modLoc("block/carrot_block"), modLoc("block/carrot_block"), modLoc("block/carrot_block"));
      //..............chorus
       slab("chorus_slab_item", modLoc("block/chorus_block"), modLoc("block/chorus_block"), modLoc("block/chorus_block"));
      //..............glow_berry
       slab("glow_berry_slab_item", modLoc("block/glow_berry_block"), modLoc("block/glow_berry_block"), modLoc("block/glow_berry_block"));
      //..............melon
       slab("melon_slab_item", modLoc("block/melon_block"), modLoc("block/melon_block"), modLoc("block/melon_block"));
      //..............sweet_berry
       slab("sweet_berry_slab_item", modLoc("block/sweet_berry_block"), modLoc("block/sweet_berry_block"), modLoc("block/sweet_berry_block"));
      //..............brown_mushroom
       slab("brown_mushroom_slab_item", modLoc("block/brown_mushroom_block"), modLoc("block/brown_mushroom_block"), modLoc("block/brown_mushroom_block"));
      //..............red_mushroom
       slab("red_mushroom_slab_item", modLoc("block/red_mushroom_block"), modLoc("block/red_mushroom_block"), modLoc("block/red_mushroom_block"));
      //..............pumpkin
       slab("pumpkin_slab_item", modLoc("block/pumpkin_block"), modLoc("block/pumpkin_block"), modLoc("block/pumpkin_block"));
      //..............chicken
       slab("chicken_slab_item", modLoc("block/chicken_block"), modLoc("block/chicken_block"), modLoc("block/chicken_block"));
      //..............cod
       slab("cod_slab_item", modLoc("block/cod_block"), modLoc("block/cod_block"), modLoc("block/cod_block"));
      //..............salmon
       slab("salmon_slab_item", modLoc("block/salmon_block"), modLoc("block/salmon_block"), modLoc("block/salmon_block"));
      //..............tropical_fish
       slab("tropical_fish_slab_item", modLoc("block/tropical_fish_block"), modLoc("block/tropical_fish_block"), modLoc("block/tropical_fish_block"));
      //..............mutton
       slab("mutton_slab_item", modLoc("block/mutton_block"), modLoc("block/mutton_block"), modLoc("block/mutton_block"));
      //..............beef
       slab("beef_slab_item", modLoc("block/beef_block"), modLoc("block/beef_block"), modLoc("block/beef_block"));
      //..............pork
       slab("pork_slab_item", modLoc("block/pork_block"), modLoc("block/pork_block"), modLoc("block/pork_block"));
      //..............rabbit
       slab("rabbit_slab_item", modLoc("block/rabbit_block"), modLoc("block/rabbit_block"), modLoc("block/rabbit_block"));
      //..............sugar
       slab("sugar_slab_item", modLoc("block/sugar_block"), modLoc("block/sugar_block"), modLoc("block/sugar_block"));
      //..............honeycomb
       slab("processed_honeycomb_slab_item", modLoc("block/processed_honeycomb_block"), modLoc("block/processed_honeycomb_block"), modLoc("block/processed_honeycomb_block"));

     //_________________________________________________________Bricks Slabs_________________________________________________________________
      //..............apple
       slab("apple_bricks_slab_item", modLoc("block/apple_bricks_block"), modLoc("block/apple_bricks_block"), modLoc("block/apple_bricks_block"));
      //..............potato
       slab("potato_bricks_slab_item", modLoc("block/potato_bricks_block"), modLoc("block/potato_bricks_block"), modLoc("block/potato_bricks_block"));
      //..............beetroot
       slab("beetroot_bricks_slab_item", modLoc("block/beetroot_bricks_block"), modLoc("block/beetroot_bricks_block"), modLoc("block/beetroot_bricks_block"));
      //..............carrot
       slab("carrot_bricks_slab_item", modLoc("block/carrot_bricks_block"), modLoc("block/carrot_bricks_block"), modLoc("block/carrot_bricks_block"));
      //..............chorus
       slab("chorus_bricks_slab_item", modLoc("block/chorus_bricks_block"), modLoc("block/chorus_bricks_block"), modLoc("block/chorus_bricks_block"));
      //..............glow_berry
       slab("glow_berry_bricks_slab_item", modLoc("block/glow_berry_bricks_block"), modLoc("block/glow_berry_bricks_block"), modLoc("block/glow_berry_bricks_block"));
      //..............melon
       slab("melon_bricks_slab_item", modLoc("block/melon_bricks_block"), modLoc("block/melon_bricks_block"), modLoc("block/melon_bricks_block"));
      //..............sweet_berry
       slab("sweet_berry_bricks_slab_item", modLoc("block/sweet_berry_bricks_block"), modLoc("block/sweet_berry_bricks_block"), modLoc("block/sweet_berry_bricks_block"));
      //..............brown_mushroom
       slab("brown_mushroom_bricks_slab_item", modLoc("block/brown_mushroom_bricks_block"), modLoc("block/brown_mushroom_bricks_block"), modLoc("block/brown_mushroom_bricks_block"));
      //..............red_mushroom
       slab("red_mushroom_bricks_slab_item", modLoc("block/red_mushroom_bricks_block"), modLoc("block/red_mushroom_bricks_block"), modLoc("block/red_mushroom_bricks_block"));
      //..............pumpkin
       slab("pumpkin_bricks_slab_item", modLoc("block/pumpkin_bricks_block"), modLoc("block/pumpkin_bricks_block"), modLoc("block/pumpkin_bricks_block"));
      //..............chicken
       slab("chicken_bricks_slab_item", modLoc("block/chicken_bricks_block"), modLoc("block/chicken_bricks_block"), modLoc("block/chicken_bricks_block"));
      //..............cod
       slab("cod_bricks_slab_item", modLoc("block/cod_bricks_block"), modLoc("block/cod_bricks_block"), modLoc("block/cod_bricks_block"));
      //..............salmon
       slab("salmon_bricks_slab_item", modLoc("block/salmon_bricks_block"), modLoc("block/salmon_bricks_block"), modLoc("block/salmon_bricks_block"));
      //..............tropical_fish
       slab("tropical_fish_bricks_slab_item", modLoc("block/tropical_fish_bricks_block"), modLoc("block/tropical_fish_bricks_block"), modLoc("block/tropical_fish_bricks_block"));
      //..............mutton
       slab("mutton_bricks_slab_item", modLoc("block/mutton_bricks_block"), modLoc("block/mutton_bricks_block"), modLoc("block/mutton_bricks_block"));
      //..............beef
       slab("beef_bricks_slab_item", modLoc("block/beef_bricks_block"), modLoc("block/beef_bricks_block"), modLoc("block/beef_bricks_block"));
      //..............pork
       slab("pork_bricks_slab_item", modLoc("block/pork_bricks_block"), modLoc("block/pork_bricks_block"), modLoc("block/pork_bricks_block"));
      //..............rabbit
       slab("rabbit_bricks_slab_item", modLoc("block/rabbit_bricks_block"), modLoc("block/rabbit_bricks_block"), modLoc("block/rabbit_bricks_block"));
      //..............sugar
       slab("sugar_bricks_slab_item", modLoc("block/sugar_bricks_block"), modLoc("block/sugar_bricks_block"), modLoc("block/sugar_bricks_block"));
      //..............honeycomb
       slab("honeycomb_bricks_slab_item", modLoc("block/honeycomb_bricks_block"), modLoc("block/honeycomb_bricks_block"), modLoc("block/honeycomb_bricks_block"));

    //-------------------------------------------------------------stairs--------------------------------------------------------------------
     //________________________________________________________Regular Stairs_________________________________________________________________
      //..............apple
       withExistingParent("apple_stairs_item", modLoc("block/apple_stairs"));
      //..............potato
       withExistingParent("potato_stairs_item", modLoc("block/potato_stairs"));
      //..............beetroot
       withExistingParent("beetroot_stairs_item", modLoc("block/beetroot_stairs"));
      //..............carrot
       withExistingParent("carrot_stairs_item", modLoc("block/carrot_stairs"));
      //..............chorus
       withExistingParent("chorus_stairs_item", modLoc("block/chorus_stairs"));
      //..............glow_berry
       withExistingParent("glow_berry_stairs_item", modLoc("block/glow_berry_stairs"));
      //..............melon
       withExistingParent("melon_stairs_item", modLoc("block/melon_stairs"));
      //..............sweet_berry
       withExistingParent("sweet_berry_stairs_item", modLoc("block/sweet_berry_stairs"));
      //..............brown_mushroom
       withExistingParent("brown_mushroom_stairs_item", modLoc("block/brown_mushroom_stairs"));
      //..............red_mushroom
       withExistingParent("red_mushroom_stairs_item", modLoc("block/red_mushroom_stairs"));
      //..............pumpkin
       withExistingParent("pumpkin_stairs_item", modLoc("block/pumpkin_stairs"));
      //..............chicken
       withExistingParent("chicken_stairs_item", modLoc("block/chicken_stairs"));
      //..............cod
       withExistingParent("cod_stairs_item", modLoc("block/cod_stairs"));
      //..............salmon
       withExistingParent("salmon_stairs_item", modLoc("block/salmon_stairs"));
      //..............tropical_fish
       withExistingParent("tropical_fish_stairs_item", modLoc("block/tropical_fish_stairs"));
      //..............mutton
       withExistingParent("mutton_stairs_item", modLoc("block/mutton_stairs"));
      //..............beef
       withExistingParent("beef_stairs_item", modLoc("block/beef_stairs"));
      //..............pork
       withExistingParent("pork_stairs_item", modLoc("block/pork_stairs"));
      //..............rabbit
       withExistingParent("rabbit_stairs_item", modLoc("block/rabbit_stairs"));
      //..............sugar
       withExistingParent("sugar_stairs_item", modLoc("block/sugar_stairs"));
      //..............honeycomb
       withExistingParent("honeycomb_stairs_item", modLoc("block/honeycomb_stairs"));

     //________________________________________________________Bricks Stairs_________________________________________________________________
      //..............apple
       withExistingParent("apple_bricks_stairs_item", modLoc("block/apple_bricks_stairs"));
      //..............potato
       withExistingParent("potato_bricks_stairs_item", modLoc("block/potato_bricks_stairs"));
      //..............beetroot
       withExistingParent("beetroot_bricks_stairs_item", modLoc("block/beetroot_bricks_stairs"));
      //..............carrot
       withExistingParent("carrot_bricks_stairs_item", modLoc("block/carrot_bricks_stairs"));
      //..............chorus
       withExistingParent("chorus_bricks_stairs_item", modLoc("block/chorus_bricks_stairs"));
      //..............glow_berry
       withExistingParent("glow_berry_bricks_stairs_item", modLoc("block/glow_berry_bricks_stairs"));
      //..............melon
       withExistingParent("melon_bricks_stairs_item", modLoc("block/melon_bricks_stairs"));
      //..............sweet_berry
       withExistingParent("sweet_berry_bricks_stairs_item", modLoc("block/sweet_berry_bricks_stairs"));
      //..............brown_mushroom
       withExistingParent("brown_mushroom_bricks_stairs_item", modLoc("block/brown_mushroom_bricks_stairs"));
      //..............red_mushroom
       withExistingParent("red_mushroom_bricks_stairs_item", modLoc("block/red_mushroom_bricks_stairs"));
      //..............pumpkin
       withExistingParent("pumpkin_bricks_stairs_item", modLoc("block/pumpkin_bricks_stairs"));
      //..............chicken
       withExistingParent("chicken_bricks_stairs_item", modLoc("block/chicken_bricks_stairs"));
      //..............cod
       withExistingParent("cod_bricks_stairs_item", modLoc("block/cod_bricks_stairs"));
      //..............salmon
       withExistingParent("salmon_bricks_stairs_item", modLoc("block/salmon_bricks_stairs"));
      //..............tropical_fish
       withExistingParent("tropical_fish_bricks_stairs_item", modLoc("block/tropical_fish_bricks_stairs"));
      //..............mutton
       withExistingParent("mutton_bricks_stairs_item", modLoc("block/mutton_bricks_stairs"));
      //..............beef
       withExistingParent("beef_bricks_stairs_item", modLoc("block/beef_bricks_stairs"));
      //..............pork
       withExistingParent("pork_bricks_stairs_item", modLoc("block/pork_bricks_stairs"));
      //..............rabbit
       withExistingParent("rabbit_bricks_stairs_item", modLoc("block/rabbit_bricks_stairs"));
      //..............sugar
       withExistingParent("sugar_bricks_stairs_item", modLoc("block/sugar_bricks_stairs"));
      //..............honeycomb
       withExistingParent("honeycomb_bricks_stairs_item", modLoc("block/honeycomb_bricks_stairs"));

    //-----------------------------------------------------------trapdoors-------------------------------------------------------------------
      //..............apple
       withExistingParent("apple_trapdoor_item", modLoc("block/apple_trapdoor_trapdoor_bottom"));
      //..............potato
       withExistingParent("potato_trapdoor_item", modLoc("block/potato_trapdoor_trapdoor_bottom"));
      //..............beetroot
       withExistingParent("beetroot_trapdoor_item", modLoc("block/beetroot_trapdoor_trapdoor_bottom"));
      //..............carrot
       withExistingParent("carrot_trapdoor_item", modLoc("block/carrot_trapdoor_trapdoor_bottom"));
      //..............chorus
       withExistingParent("chorus_trapdoor_item", modLoc("block/chorus_trapdoor_trapdoor_bottom"));
      //..............glow_berry
       withExistingParent("glow_berry_trapdoor_item", modLoc("block/glow_berry_trapdoor_trapdoor_bottom"));
      //..............melon
       withExistingParent("melon_trapdoor_item", modLoc("block/melon_trapdoor_trapdoor_bottom"));
      //..............sweet_berry
       withExistingParent("sweet_berry_trapdoor_item", modLoc("block/sweet_berry_trapdoor_trapdoor_bottom"));
      //..............brown_mushroom
       withExistingParent("brown_mushroom_trapdoor_item", modLoc("block/brown_mushroom_trapdoor_trapdoor_bottom"));
      //..............red_mushroom
       withExistingParent("red_mushroom_trapdoor_item", modLoc("block/red_mushroom_trapdoor_trapdoor_bottom"));
      //..............pumpkin
       withExistingParent("pumpkin_trapdoor_item", modLoc("block/pumpkin_trapdoor_trapdoor_bottom"));
      //..............chicken
       withExistingParent("chicken_trapdoor_item", modLoc("block/chicken_trapdoor_trapdoor_bottom"));
      //..............cod
       withExistingParent("cod_trapdoor_item", modLoc("block/cod_trapdoor_trapdoor_bottom"));
      //..............salmon
       withExistingParent("salmon_trapdoor_item", modLoc("block/salmon_trapdoor_trapdoor_bottom"));
      //..............tropical_fish
       withExistingParent("tropical_fish_trapdoor_item", modLoc("block/tropical_fish_trapdoor_trapdoor_bottom"));
      //..............mutton
       withExistingParent("mutton_trapdoor_item", modLoc("block/mutton_trapdoor_trapdoor_bottom"));
      //..............beef
       withExistingParent("beef_trapdoor_item", modLoc("block/beef_trapdoor_trapdoor_bottom"));
      //..............pork
       withExistingParent("pork_trapdoor_item", modLoc("block/pork_trapdoor_trapdoor_bottom"));
      //..............rabbit
       withExistingParent("rabbit_trapdoor_item", modLoc("block/rabbit_trapdoor_trapdoor_bottom"));
      //..............sugar
       withExistingParent("sugar_trapdoor_item", modLoc("block/sugar_trapdoor_trapdoor_bottom"));
      //..............honeycomb
       withExistingParent("honeycomb_trapdoor_item", modLoc("block/honeycomb_trapdoor_trapdoor_bottom"));

    //-----------------------------------------------------------sugar glass-----------------------------------------------------------------
      //..............plain
       //block
        withExistingParent("plain_sugar_glass_item", modLoc("block/plain_sugar_glass_block"));
       //pane
        withExistingParent("plain_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/plain_sugar_glass_block").renderType("translucent");
      //..............red
       //block
        withExistingParent("red_sugar_glass_item", modLoc("block/red_sugar_glass_block"));
       //pane
        withExistingParent("red_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/red_sugar_glass_block").renderType("translucent");
      //..............orange
       //block
        withExistingParent("orange_sugar_glass_item", modLoc("block/orange_sugar_glass_block"));
       //pane
        withExistingParent("orange_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/orange_sugar_glass_block").renderType("translucent");
      //..............yellow
       //block
        withExistingParent("yellow_sugar_glass_item", modLoc("block/yellow_sugar_glass_block"));
       //pane
        withExistingParent("yellow_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/yellow_sugar_glass_block").renderType("translucent");
      //..............lime_green
       //block
        withExistingParent("lime_green_sugar_glass_item", modLoc("block/lime_green_sugar_glass_block"));
       //pane
        withExistingParent("lime_green_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/lime_green_sugar_glass_block").renderType("translucent");
      //..............green
       //block
        withExistingParent("green_sugar_glass_item", modLoc("block/green_sugar_glass_block"));
       //pane
        withExistingParent("green_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/green_sugar_glass_block").renderType("translucent");
      //..............cyan
       //block
        withExistingParent("cyan_sugar_glass_item", modLoc("block/cyan_sugar_glass_block"));
       //pane
        withExistingParent("cyan_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/cyan_sugar_glass_block").renderType("translucent");
      //..............light_blue
       //block
        withExistingParent("light_blue_sugar_glass_item", modLoc("block/light_blue_sugar_glass_block"));
       //pane
        withExistingParent("light_blue_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/light_blue_sugar_glass_block").renderType("translucent");
      //..............blue
       //block
        withExistingParent("blue_sugar_glass_item", modLoc("block/blue_sugar_glass_block"));
       //pane
        withExistingParent("blue_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/blue_sugar_glass_block").renderType("translucent");
      //..............purple
       //block
        withExistingParent("purple_sugar_glass_item", modLoc("block/purple_sugar_glass_block"));
       //pane
        withExistingParent("purple_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/purple_sugar_glass_block").renderType("translucent");
      //..............magenta
       //block
        withExistingParent("magenta_sugar_glass_item", modLoc("block/magenta_sugar_glass_block"));
       //pane
        withExistingParent("magenta_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/magenta_sugar_glass_block").renderType("translucent");
      //..............pink
       //block
        withExistingParent("pink_sugar_glass_item", modLoc("block/pink_sugar_glass_block"));
       //pane
        withExistingParent("pink_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/pink_sugar_glass_block").renderType("translucent");
      //..............white
       //block
        withExistingParent("white_sugar_glass_item", modLoc("block/white_sugar_glass_block"));
       //pane
        withExistingParent("white_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/white_sugar_glass_block").renderType("translucent");
      //..............light_gray
       //block
        withExistingParent("light_gray_sugar_glass_item", modLoc("block/light_gray_sugar_glass_block"));
       //pane
        withExistingParent("light_gray_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/light_gray_sugar_glass_block").renderType("translucent");
      //..............gray
       //block
        withExistingParent("gray_sugar_glass_item", modLoc("block/gray_sugar_glass_block"));
       //pane
        withExistingParent("gray_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/gray_sugar_glass_block").renderType("translucent");
      //..............black
       //block
        withExistingParent("black_sugar_glass_item", modLoc("block/black_sugar_glass_block"));
       //pane
        withExistingParent("black_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/black_sugar_glass_block").renderType("translucent");
      //..............brown
       //block
        withExistingParent("brown_sugar_glass_item", modLoc("block/brown_sugar_glass_block"));
       //pane
        withExistingParent("brown_sugar_glass_pane_item", mcLoc("item/generated")).texture("layer0", "block/brown_sugar_glass_block").renderType("translucent");

    //-------------------------------------------------------------bars----------------------------------------------------------------------
      //..............apple
        withExistingParent("apple_bars_item", mcLoc("item/generated")).texture("layer0", "block/apple_bars");
      //..............potato
        withExistingParent("potato_bars_item", mcLoc("item/generated")).texture("layer0", "block/potato_bars");
      //..............beetroot
        withExistingParent("beetroot_bars_item", mcLoc("item/generated")).texture("layer0", "block/beetroot_bars");
      //..............carrot
        withExistingParent("carrot_bars_item", mcLoc("item/generated")).texture("layer0", "block/carrot_bars");
      //..............chorus
        withExistingParent("chorus_bars_item", mcLoc("item/generated")).texture("layer0", "block/chorus_bars");
      //..............glow_berry
        withExistingParent("glow_berry_bars_item", mcLoc("item/generated")).texture("layer0", "block/glow_berry_bars");
      //..............melon
        withExistingParent("melon_bars_item", mcLoc("item/generated")).texture("layer0", "block/melon_bars");
      //..............sweet_berry
        withExistingParent("sweet_berry_bars_item", mcLoc("item/generated")).texture("layer0", "block/sweet_berry_bars");
      //..............brown_mushroom
        withExistingParent("brown_mushroom_bars_item", mcLoc("item/generated")).texture("layer0", "block/brown_mushroom_bars");
      //..............red_mushroom
        withExistingParent("red_mushroom_bars_item", mcLoc("item/generated")).texture("layer0", "block/red_mushroom_bars");
      //..............pumpkin
        withExistingParent("pumpkin_bars_item", mcLoc("item/generated")).texture("layer0", "block/pumpkin_bars");
      //..............chicken
        withExistingParent("chicken_bars_item", mcLoc("item/generated")).texture("layer0", "block/chicken_bars");
      //..............cod
        withExistingParent("cod_bars_item", mcLoc("item/generated")).texture("layer0", "block/cod_bars");
      //..............salmon
        withExistingParent("salmon_bars_item", mcLoc("item/generated")).texture("layer0", "block/salmon_bars");
      //..............tropical_fish
        withExistingParent("tropical_fish_bars_item", mcLoc("item/generated")).texture("layer0", "block/tropical_fish_bars");
      //..............mutton
        withExistingParent("mutton_bars_item", mcLoc("item/generated")).texture("layer0", "block/mutton_bars");
      //..............beef
        withExistingParent("beef_bars_item", mcLoc("item/generated")).texture("layer0", "block/beef_bars");
      //..............pork
        withExistingParent("pork_bars_item", mcLoc("item/generated")).texture("layer0", "block/pork_bars");
      //..............rabbit
        withExistingParent("rabbit_bars_item", mcLoc("item/generated")).texture("layer0", "block/rabbit_bars");
      //..............sugar
        withExistingParent("sugar_bars_item", mcLoc("item/generated")).texture("layer0", "block/sugar_bars");
      //..............honeycomb
        withExistingParent("honeycomb_bars_item", mcLoc("item/generated")).texture("layer0", "block/honeycomb_bars");
    //------------------------------------------------------------lamps----------------------------------------------------------------------
      //..............apple
        withExistingParent("apple_lamp_item", modLoc("block/apple_lamp"));
      //..............potato
        withExistingParent("potato_lamp_item", modLoc("block/potato_lamp"));
      //..............beetroot
        withExistingParent("beetroot_lamp_item", modLoc("block/beetroot_lamp"));
      //..............carrot
        withExistingParent("carrot_lamp_item", modLoc("block/carrot_lamp"));
      //..............chorus
        withExistingParent("chorus_lamp_item", modLoc("block/chorus_lamp"));
      //..............glow_berry
        withExistingParent("glow_berry_lamp_item", modLoc("block/glow_berry_lamp"));
      //..............melon
        withExistingParent("melon_lamp_item", modLoc("block/melon_lamp"));
      //..............sweet_berry
        withExistingParent("sweet_berry_lamp_item", modLoc("block/sweet_berry_lamp"));
      //..............brown_mushroom
        withExistingParent("brown_mushroom_lamp_item", modLoc("block/brown_mushroom_lamp"));
      //..............red_mushroom
        withExistingParent("red_mushroom_lamp_item", modLoc("block/red_mushroom_lamp"));
      //..............pumpkin
        withExistingParent("pumpkin_lamp_item", modLoc("block/pumpkin_lamp"));
      //..............chicken
        withExistingParent("chicken_lamp_item", modLoc("block/chicken_lamp"));
      //..............cod
        withExistingParent("cod_lamp_item", modLoc("block/cod_lamp"));
      //..............salmon
        withExistingParent("salmon_lamp_item", modLoc("block/salmon_lamp"));
      //..............tropical_fish
        withExistingParent("tropical_fish_lamp_item", modLoc("block/tropical_fish_lamp"));
      //..............mutton
        withExistingParent("mutton_lamp_item", modLoc("block/mutton_lamp"));
      //..............beef
        withExistingParent("beef_lamp_item", modLoc("block/beef_lamp"));
      //..............pork
        withExistingParent("pork_lamp_item", modLoc("block/pork_lamp"));
      //..............rabbit
        withExistingParent("rabbit_lamp_item", modLoc("block/rabbit_lamp"));
      //..............sugar
        withExistingParent("sugar_lamp_item", modLoc("block/sugar_lamp"));
      //..............honeycomb
        withExistingParent("honeycomb_lamp_item", modLoc("block/honeycomb_lamp"));

    //------------------------------------------------------------carpet---------------------------------------------------------------------
      //..............apple
        ResourceLocation apple_carpet_texture = modLoc("block/apple_carpet");
        carpet("apple_carpet_item", apple_carpet_texture);
      //..............potato
        ResourceLocation potato_carpet_texture = modLoc("block/potato_carpet");
        carpet("potato_carpet_item", potato_carpet_texture);
      //..............beetroot
        ResourceLocation beetroot_carpet_texture = modLoc("block/beetroot_carpet");
        carpet("beetroot_carpet_item", beetroot_carpet_texture);
      //..............carrot
        ResourceLocation carrot_carpet_texture = modLoc("block/carrot_carpet");
        carpet("carrot_carpet_item", carrot_carpet_texture);
      //..............chorus
        ResourceLocation chorus_carpet_texture = modLoc("block/chorus_carpet");
        carpet("chorus_carpet_item", chorus_carpet_texture);
      //..............glow_berry
        ResourceLocation glow_berry_carpet_texture = modLoc("block/glow_berry_carpet");
        carpet("glow_berry_carpet_item", glow_berry_carpet_texture);
      //..............melon
        ResourceLocation melon_carpet_texture = modLoc("block/melon_carpet");
        carpet("melon_carpet_item", melon_carpet_texture);
      //..............sweet_berry
        ResourceLocation sweet_berry_carpet_texture = modLoc("block/sweet_berry_carpet");
        carpet("sweet_berry_carpet_item", sweet_berry_carpet_texture);
      //..............brown_mushroom
        ResourceLocation brown_mushroom_carpet_texture = modLoc("block/brown_mushroom_carpet");
        carpet("brown_mushroom_carpet_item", brown_mushroom_carpet_texture);
      //..............red_mushroom
        ResourceLocation red_mushroom_carpet_texture = modLoc("block/red_mushroom_carpet");
        carpet("red_mushroom_carpet_item", red_mushroom_carpet_texture);
      //..............pumpkin
        ResourceLocation pumpkin_carpet_texture = modLoc("block/pumpkin_carpet");
        carpet("pumpkin_carpet_item", pumpkin_carpet_texture);
      //..............chicken
        ResourceLocation chicken_carpet_texture = modLoc("block/chicken_carpet");
        carpet("chicken_carpet_item", chicken_carpet_texture);
      //..............cod
        ResourceLocation cod_carpet_texture = modLoc("block/cod_carpet");
        carpet("cod_carpet_item", cod_carpet_texture);
      //..............salmon
        ResourceLocation salmon_carpet_texture = modLoc("block/salmon_carpet");
        carpet("salmon_carpet_item", salmon_carpet_texture);
      //..............tropical_fish
        ResourceLocation tropical_fish_carpet_texture = modLoc("block/tropical_fish_carpet");
        carpet("tropical_fish_carpet_item", tropical_fish_carpet_texture);
      //..............mutton
        ResourceLocation mutton_carpet_texture = modLoc("block/mutton_carpet");
        carpet("mutton_carpet_item", mutton_carpet_texture);
      //..............beef
        ResourceLocation beef_carpet_texture = modLoc("block/beef_carpet");
        carpet("beef_carpet_item", beef_carpet_texture);
      //..............pork
        ResourceLocation pork_carpet_texture = modLoc("block/pork_carpet");
        carpet("pork_carpet_item", pork_carpet_texture);
      //..............rabbit
        ResourceLocation rabbit_carpet_texture = modLoc("block/rabbit_carpet");
        carpet("rabbit_carpet_item", rabbit_carpet_texture);
      //..............sugar
        ResourceLocation sugar_carpet_texture = modLoc("block/sugar_carpet");
        carpet("sugar_carpet_item", sugar_carpet_texture);
      //..............honeycomb
        ResourceLocation honeycomb_carpet_texture = modLoc("block/honeycomb_carpet");
        carpet("honeycomb_carpet_item", honeycomb_carpet_texture);

    //-----------------------------------------------------------lanterns--------------------------------------------------------------------
      //..............apple
       //regular
        withExistingParent("apple_lantern_item", modLoc("block/apple_lantern"));
       //soul
        withExistingParent("apple_soul_lantern_item", modLoc("block/apple_soul_lantern"));

      //..............potato
       //regular
        withExistingParent("potato_lantern_item", modLoc("block/potato_lantern"));
       //soul
        withExistingParent("potato_soul_lantern_item", modLoc("block/potato_soul_lantern"));
        
      //..............beetroot
       //regular
        withExistingParent("beetroot_lantern_item", modLoc("block/beetroot_lantern"));
       //soul
        withExistingParent("beetroot_soul_lantern_item", modLoc("block/beetroot_soul_lantern"));

      //..............carrot
       //regular
        withExistingParent("carrot_lantern_item", modLoc("block/carrot_lantern"));
       //soul
        withExistingParent("carrot_soul_lantern_item", modLoc("block/carrot_soul_lantern"));

      //..............chorus
       //regular
        withExistingParent("chorus_lantern_item", modLoc("block/chorus_lantern"));
       //soul
        withExistingParent("chorus_soul_lantern_item", modLoc("block/chorus_soul_lantern"));

      //..............glow_berry
       //regular
        withExistingParent("glow_berry_lantern_item", modLoc("block/glow_berry_lantern"));
       //soul
        withExistingParent("glow_berry_soul_lantern_item", modLoc("block/glow_berry_soul_lantern"));

      //..............melon
       //regular
        withExistingParent("melon_lantern_item", modLoc("block/melon_lantern"));
       //soul
        withExistingParent("melon_soul_lantern_item", modLoc("block/melon_soul_lantern"));

      //..............sweet_berry
       //regular
        withExistingParent("sweet_berry_lantern_item", modLoc("block/sweet_berry_lantern"));
       //soul
        withExistingParent("sweet_berry_soul_lantern_item", modLoc("block/sweet_berry_soul_lantern"));

      //..............brown_mushroom
       //regular
        withExistingParent("brown_mushroom_lantern_item", modLoc("block/brown_mushroom_lantern"));
       //soul
        withExistingParent("brown_mushroom_soul_lantern_item", modLoc("block/brown_mushroom_soul_lantern"));

      //..............red_mushroom
       //regular
        withExistingParent("red_mushroom_lantern_item", modLoc("block/red_mushroom_lantern"));
       //soul
        withExistingParent("red_mushroom_soul_lantern_item", modLoc("block/red_mushroom_soul_lantern"));

      //..............pumpkin
       //regular
        withExistingParent("pumpkin_lantern_item", modLoc("block/pumpkin_lantern"));
       //soul
        withExistingParent("pumpkin_soul_lantern_item", modLoc("block/pumpkin_soul_lantern"));

      //..............chicken
       //regular
        withExistingParent("chicken_lantern_item", modLoc("block/chicken_lantern"));
       //soul
        withExistingParent("chicken_soul_lantern_item", modLoc("block/chicken_soul_lantern"));

      //..............cod
       //regular
        withExistingParent("cod_lantern_item", modLoc("block/cod_lantern"));
       //soul
        withExistingParent("cod_soul_lantern_item", modLoc("block/cod_soul_lantern"));

      //..............salmon
       //regular
        withExistingParent("salmon_lantern_item", modLoc("block/salmon_lantern"));
       //soul
        withExistingParent("salmon_soul_lantern_item", modLoc("block/salmon_soul_lantern"));

      //..............tropical_fish
       //regular
        withExistingParent("tropical_fish_lantern_item", modLoc("block/tropical_fish_lantern"));
       //soul
        withExistingParent("tropical_fish_soul_lantern_item", modLoc("block/tropical_fish_soul_lantern"));

      //..............mutton
       //regular
        withExistingParent("mutton_lantern_item", modLoc("block/mutton_lantern"));
       //soul
        withExistingParent("mutton_soul_lantern_item", modLoc("block/mutton_soul_lantern"));

      //..............beef
       //regular
        withExistingParent("beef_lantern_item", modLoc("block/beef_lantern"));
       //soul
        withExistingParent("beef_soul_lantern_item", modLoc("block/beef_soul_lantern"));

      //..............pork
       //regular
        withExistingParent("pork_lantern_item", modLoc("block/pork_lantern"));
       //soul
        withExistingParent("pork_soul_lantern_item", modLoc("block/pork_soul_lantern"));

      //..............rabbit
       //regular
        withExistingParent("rabbit_lantern_item", modLoc("block/rabbit_lantern"));
       //soul
        withExistingParent("rabbit_soul_lantern_item", modLoc("block/rabbit_soul_lantern"));

      //..............sugar
       //regular
        withExistingParent("sugar_lantern_item", modLoc("block/sugar_lantern"));
       //soul
        withExistingParent("sugar_soul_lantern_item", modLoc("block/sugar_soul_lantern"));
      //..............honeycomb
       //regular
        withExistingParent("honeycomb_lantern_item", modLoc("block/honeycomb_lantern"));
       //soul
        withExistingParent("honeycomb_soul_lantern_item", modLoc("block/honeycomb_soul_lantern"));

    //------------------------------------------------------------Chains---------------------------------------------------------------------
      //..............apple
       withExistingParent("apple_chain_item", modLoc("block/apple_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       
      //..............potato
       withExistingParent("potato_chain_item", modLoc("block/potato_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............beetroot
       withExistingParent("beetroot_chain_item", modLoc("block/beetroot_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............carrot
       withExistingParent("carrot_chain_item", modLoc("block/carrot_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............chorus
       withExistingParent("chorus_chain_item", modLoc("block/chorus_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............glow_berry
       withExistingParent("glow_berry_chain_item", modLoc("block/glow_berry_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............melon
       withExistingParent("melon_chain_item", modLoc("block/melon_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............sweet_berry
       withExistingParent("sweet_berry_chain_item", modLoc("block/sweet_berry_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............brown_mushroom
       withExistingParent("brown_mushroom_chain_item", modLoc("block/brown_mushroom_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............red_mushroom
       withExistingParent("red_mushroom_chain_item", modLoc("block/red_mushroom_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............pumpkin
       withExistingParent("pumpkin_chain_item", modLoc("block/pumpkin_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............chicken
       withExistingParent("chicken_chain_item", modLoc("block/chicken_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............cod
       withExistingParent("cod_chain_item", modLoc("block/cod_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............salmon
       withExistingParent("salmon_chain_item", modLoc("block/salmon_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............tropical_fish
       withExistingParent("tropical_fish_chain_item", modLoc("block/tropical_fish_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............mutton
       withExistingParent("mutton_chain_item", modLoc("block/mutton_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............beef
       withExistingParent("beef_chain_item", modLoc("block/beef_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............pork
       withExistingParent("pork_chain_item", modLoc("block/pork_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............rabbit
       withExistingParent("rabbit_chain_item", modLoc("block/rabbit_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............sugar
       withExistingParent("sugar_chain_item", modLoc("block/sugar_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();

      //..............honeycomb
       withExistingParent("honeycomb_chain_item", modLoc("block/honeycomb_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
    //-----------------------------------------------------------ladders---------------------------------------------------------------------
      //..............apple
       withExistingParent("apple_ladder_item", modLoc("block/apple_ladder"));
      //..............potato
       withExistingParent("potato_ladder_item", modLoc("block/potato_ladder"));
      //..............beetroot
       withExistingParent("beetroot_ladder_item", modLoc("block/beetroot_ladder"));
      //..............carrot
       withExistingParent("carrot_ladder_item", modLoc("block/carrot_ladder"));
      //..............chorus
       withExistingParent("chorus_ladder_item", modLoc("block/chorus_ladder"));
      //..............glow_berry
       withExistingParent("glow_berry_ladder_item", modLoc("block/glow_berry_ladder"));
      //..............melon
       withExistingParent("melon_ladder_item", modLoc("block/melon_ladder"));
      //..............sweet_berry
       withExistingParent("sweet_berry_ladder_item", modLoc("block/sweet_berry_ladder"));
      //..............brown_mushroom
       withExistingParent("brown_mushroom_ladder_item", modLoc("block/brown_mushroom_ladder"));
      //..............red_mushroom
       withExistingParent("red_mushroom_ladder_item", modLoc("block/red_mushroom_ladder"));
      //..............pumpkin
       withExistingParent("pumpkin_ladder_item", modLoc("block/pumpkin_ladder"));
      //..............chicken
       withExistingParent("chicken_ladder_item", modLoc("block/chicken_ladder"));
      //..............cod
       withExistingParent("cod_ladder_item", modLoc("block/cod_ladder"));
      //..............salmon
       withExistingParent("salmon_ladder_item", modLoc("block/salmon_ladder"));
      //..............tropical_fish
       withExistingParent("tropical_fish_ladder_item", modLoc("block/tropical_fish_ladder"));
      //..............mutton
       withExistingParent("mutton_ladder_item", modLoc("block/mutton_ladder"));
      //..............beef
       withExistingParent("beef_ladder_item", modLoc("block/beef_ladder"));
      //..............pork
       withExistingParent("pork_ladder_item", modLoc("block/pork_ladder"));
      //..............rabbit
       withExistingParent("rabbit_ladder_item", modLoc("block/rabbit_ladder"));
      //..............sugar
       withExistingParent("sugar_ladder_item", modLoc("block/sugar_ladder"));
      //..............honeycomb
       withExistingParent("honeycomb_ladder_item", modLoc("block/honeycomb_ladder"));

    //------------------------------------------------------------swords---------------------------------------------------------------------
      //..............apple
       withExistingParent("apple_sword", mcLoc("item/handheld")).texture("layer0", "item/apple_sword");
      //..............potato
       withExistingParent("potato_sword", mcLoc("item/handheld")).texture("layer0", "item/potato_sword");
      //..............beetroot
       withExistingParent("beetroot_sword", mcLoc("item/handheld")).texture("layer0", "item/beetroot_sword");
      //..............carrot
       withExistingParent("carrot_sword", mcLoc("item/handheld")).texture("layer0", "item/carrot_sword");
      //..............chorus
       withExistingParent("chorus_sword", mcLoc("item/handheld")).texture("layer0", "item/chorus_sword");
      //..............glow_berry
       withExistingParent("glow_berry_sword", mcLoc("item/handheld")).texture("layer0", "item/glow_berry_sword");
      //..............melon
       withExistingParent("melon_sword", mcLoc("item/handheld")).texture("layer0", "item/melon_sword");
      //..............sweet_berry
       withExistingParent("sweet_berry_sword", mcLoc("item/handheld")).texture("layer0", "item/sweet_berry_sword");
      //..............brown_mushroom
       withExistingParent("brown_mushroom_sword", mcLoc("item/handheld")).texture("layer0", "item/brown_mushroom_sword");
      //..............red_mushroom
       withExistingParent("red_mushroom_sword", mcLoc("item/handheld")).texture("layer0", "item/red_mushroom_sword");
      //..............pumpkin
       withExistingParent("pumpkin_sword", mcLoc("item/handheld")).texture("layer0", "item/pumpkin_sword");
      //..............chicken
       withExistingParent("chicken_sword", mcLoc("item/handheld")).texture("layer0", "item/chicken_sword");
      //..............cod
       withExistingParent("cod_sword", mcLoc("item/handheld")).texture("layer0", "item/cod_sword");
      //..............salmon
       withExistingParent("salmon_sword", mcLoc("item/handheld")).texture("layer0", "item/salmon_sword");
      //..............tropical_fish
       withExistingParent("tropical_fish_sword", mcLoc("item/handheld")).texture("layer0", "item/tropical_fish_sword");
      //..............mutton
       withExistingParent("mutton_sword", mcLoc("item/handheld")).texture("layer0", "item/mutton_sword");
      //..............beef
       withExistingParent("beef_sword", mcLoc("item/handheld")).texture("layer0", "item/beef_sword");
      //..............pork
       withExistingParent("pork_sword", mcLoc("item/handheld")).texture("layer0", "item/pork_sword");
      //..............rabbit
       withExistingParent("rabbit_sword", mcLoc("item/handheld")).texture("layer0", "item/rabbit_sword");

    //------------------------------------------------------------tables---------------------------------------------------------------------
      //..............apple
       withExistingParent("apple_table_item", modLoc("block/apple_table"));
      //..............potato
       withExistingParent("potato_table_item", modLoc("block/potato_table"));
      //..............beetroot
       withExistingParent("beetroot_table_item", modLoc("block/beetroot_table"));
      //..............carrot
       withExistingParent("carrot_table_item", modLoc("block/carrot_table"));
      //..............chorus
       withExistingParent("chorus_table_item", modLoc("block/chorus_table"));
      //..............glow_berry
       withExistingParent("glow_berry_table_item", modLoc("block/glow_berry_table"));
      //..............melon
       withExistingParent("melon_table_item", modLoc("block/melon_table"));
      //..............sweet_berry
       withExistingParent("sweet_berry_table_item", modLoc("block/sweet_berry_table"));
      //..............brown_mushroom
       withExistingParent("brown_mushroom_table_item", modLoc("block/brown_mushroom_table"));
      //..............red_mushroom
       withExistingParent("red_mushroom_table_item", modLoc("block/red_mushroom_table"));
      //..............pumpkin
       withExistingParent("pumpkin_table_item", modLoc("block/pumpkin_table"));
      //..............chicken
       withExistingParent("chicken_table_item", modLoc("block/chicken_table"));
      //..............cod
       withExistingParent("cod_table_item", modLoc("block/cod_table"));
      //..............salmon
       withExistingParent("salmon_table_item", modLoc("block/salmon_table"));
      //..............tropical_fish
       withExistingParent("tropical_fish_table_item", modLoc("block/tropical_fish_table"));
      //..............mutton
       withExistingParent("mutton_table_item", modLoc("block/mutton_table"));
      //..............beef
       withExistingParent("beef_table_item", modLoc("block/beef_table"));
      //..............pork
       withExistingParent("pork_table_item", modLoc("block/pork_table"));
      //..............rabbit
       withExistingParent("rabbit_table_item", modLoc("block/rabbit_table"));
      //.............sugar
        withExistingParent("sugar_table_item", modLoc("block/sugar_table"));
      //.............honeycomb
        withExistingParent("honeycomb_table_item", modLoc("block/honeycomb_table"));

    //-----------------------------------------------------------torches---------------------------------------------------------------------
      //..............apple
       //regular
        withExistingParent("apple_torch_item", modLoc("block/apple_torch"));
       //redstone
        withExistingParent("apple_redstone_torch_item", modLoc("block/apple_redstone_torch"));
       //soul
        withExistingParent("apple_soul_torch_item", modLoc("block/apple_soul_torch"));
      //..............potato
       //regular
        withExistingParent("potato_torch_item", modLoc("block/potato_torch"));
       //redstone
        withExistingParent("potato_redstone_torch_item", modLoc("block/potato_redstone_torch"));
       //soul
        withExistingParent("potato_soul_torch_item", modLoc("block/potato_soul_torch"));
      //..............beetroot
       //regular
        withExistingParent("beetroot_torch_item", modLoc("block/beetroot_torch"));
       //redstone
        withExistingParent("beetroot_redstone_torch_item", modLoc("block/beetroot_redstone_torch"));
       //soul
        withExistingParent("beetroot_soul_torch_item", modLoc("block/beetroot_soul_torch"));
      //..............carrot
       //regular
        withExistingParent("carrot_torch_item", modLoc("block/carrot_torch"));
       //redstone
        withExistingParent("carrot_redstone_torch_item", modLoc("block/carrot_redstone_torch"));
       //soul
        withExistingParent("carrot_soul_torch_item", modLoc("block/carrot_soul_torch"));
      //..............chorus
       //regular
        withExistingParent("chorus_torch_item", modLoc("block/chorus_torch"));
       //redstone
        withExistingParent("chorus_redstone_torch_item", modLoc("block/chorus_redstone_torch"));
       //soul
        withExistingParent("chorus_soul_torch_item", modLoc("block/chorus_soul_torch"));
      //..............glow_berry
       //regular
        withExistingParent("glow_berry_torch_item", modLoc("block/glow_berry_torch"));
       //redstone
        withExistingParent("glow_berry_redstone_torch_item", modLoc("block/glow_berry_redstone_torch"));
       //soul
        withExistingParent("glow_berry_soul_torch_item", modLoc("block/glow_berry_soul_torch"));
      //..............melon
       //regular
        withExistingParent("melon_torch_item", modLoc("block/melon_torch"));
       //redstone
        withExistingParent("melon_redstone_torch_item", modLoc("block/melon_redstone_torch"));
       //soul
        withExistingParent("melon_soul_torch_item", modLoc("block/melon_soul_torch"));
      //..............sweet_berry
       //regular
        withExistingParent("sweet_berry_torch_item", modLoc("block/sweet_berry_torch"));
       //redstone
        withExistingParent("sweet_berry_redstone_torch_item", modLoc("block/sweet_berry_redstone_torch"));
       //soul
        withExistingParent("sweet_berry_soul_torch_item", modLoc("block/sweet_berry_soul_torch"));
      //..............brown_mushroom
       //regular
        withExistingParent("brown_mushroom_torch_item", modLoc("block/brown_mushroom_torch"));
       //redstone
        withExistingParent("brown_mushroom_redstone_torch_item", modLoc("block/brown_mushroom_redstone_torch"));
       //soul
        withExistingParent("brown_mushroom_soul_torch_item", modLoc("block/brown_mushroom_soul_torch"));
      //..............red_mushroom
       //regular
        withExistingParent("red_mushroom_torch_item", modLoc("block/red_mushroom_torch"));
       //redstone
        withExistingParent("red_mushroom_redstone_torch_item", modLoc("block/red_mushroom_redstone_torch"));
       //soul
        withExistingParent("red_mushroom_soul_torch_item", modLoc("block/red_mushroom_soul_torch"));
      //..............pumpkin
       //regular
        withExistingParent("pumpkin_torch_item", modLoc("block/pumpkin_torch"));
       //redstone
        withExistingParent("pumpkin_redstone_torch_item", modLoc("block/pumpkin_redstone_torch"));
       //soul
        withExistingParent("pumpkin_soul_torch_item", modLoc("block/pumpkin_soul_torch"));
      //..............chicken
       //regular
        withExistingParent("chicken_torch_item", modLoc("block/chicken_torch"));
       //redstone
        withExistingParent("chicken_redstone_torch_item", modLoc("block/chicken_redstone_torch"));
       //soul
        withExistingParent("chicken_soul_torch_item", modLoc("block/chicken_soul_torch"));
      //..............cod
       //regular
        withExistingParent("cod_torch_item", modLoc("block/cod_torch"));
       //redstone
        withExistingParent("cod_redstone_torch_item", modLoc("block/cod_redstone_torch"));
       //soul
        withExistingParent("cod_soul_torch_item", modLoc("block/cod_soul_torch"));
      //..............salmon
       //regular
        withExistingParent("salmon_torch_item", modLoc("block/salmon_torch"));
       //redstone
        withExistingParent("salmon_redstone_torch_item", modLoc("block/salmon_redstone_torch"));
       //soul
        withExistingParent("salmon_soul_torch_item", modLoc("block/salmon_soul_torch"));
      //..............tropical_fish
       //regular
        withExistingParent("tropical_fish_torch_item", modLoc("block/tropical_fish_torch"));
       //redstone
        withExistingParent("tropical_fish_redstone_torch_item", modLoc("block/tropical_fish_redstone_torch"));
       //soul
        withExistingParent("tropical_fish_soul_torch_item", modLoc("block/tropical_fish_soul_torch"));
      //..............mutton
       //regular
        withExistingParent("mutton_torch_item", modLoc("block/mutton_torch"));
       //redstone
        withExistingParent("mutton_redstone_torch_item", modLoc("block/mutton_redstone_torch"));
       //soul
        withExistingParent("mutton_soul_torch_item", modLoc("block/mutton_soul_torch"));
      //..............beef
       //regular
        withExistingParent("beef_torch_item", modLoc("block/beef_torch"));
       //redstone
        withExistingParent("beef_redstone_torch_item", modLoc("block/beef_redstone_torch"));
       //soul
        withExistingParent("beef_soul_torch_item", modLoc("block/beef_soul_torch"));
      //..............pork
       //regular
        withExistingParent("pork_torch_item", modLoc("block/pork_torch"));
       //redstone
        withExistingParent("pork_redstone_torch_item", modLoc("block/pork_redstone_torch"));
       //soul
        withExistingParent("pork_soul_torch_item", modLoc("block/pork_soul_torch"));
      //..............rabbit
       //regular
        withExistingParent("rabbit_torch_item", modLoc("block/rabbit_torch"));
       //redstone
        withExistingParent("rabbit_redstone_torch_item", modLoc("block/rabbit_redstone_torch"));
       //soul
        withExistingParent("rabbit_soul_torch_item", modLoc("block/rabbit_soul_torch"));
      //..............sugar
       //regular
        withExistingParent("sugar_torch_item", modLoc("block/sugar_torch"));
       //redstone
        withExistingParent("sugar_redstone_torch_item", modLoc("block/sugar_redstone_torch"));
       //soul
        withExistingParent("sugar_soul_torch_item", modLoc("block/sugar_soul_torch"));
      //..............honeycomb
       //regular
        withExistingParent("honeycomb_torch_item", modLoc("block/honeycomb_torch"));
       //redstone
        withExistingParent("honeycomb_redstone_torch_item", modLoc("block/honeycomb_redstone_torch"));
       //soul
        withExistingParent("honeycomb_soul_torch_item", modLoc("block/honeycomb_soul_torch"));

    //-----------------------------------------------------------furnaces--------------------------------------------------------------------
      //..............apple
        withExistingParent("apple_furnace_item", modLoc("block/apple_furnace_model_unlit"));
      //..............potato
        withExistingParent("potato_furnace_item", modLoc("block/potato_furnace_model_unlit"));
      //..............beetroot
        withExistingParent("beetroot_furnace_item", modLoc("block/beetroot_furnace_model_unlit"));
      //..............carrot
        withExistingParent("carrot_furnace_item", modLoc("block/carrot_furnace_model_unlit"));
      //..............chorus
        withExistingParent("chorus_furnace_item", modLoc("block/chorus_furnace_model_unlit"));
      //..............glowberry
        withExistingParent("glowberry_furnace_item", modLoc("block/glowberry_furnace_model_unlit"));
      //..............melon
        withExistingParent("melon_furnace_item", modLoc("block/melon_furnace_model_unlit"));
      //..............sweet_berry
        withExistingParent("sweet_berry_furnace_item", modLoc("block/sweet_berry_furnace_model_unlit"));
      //..............brown_mushroom
        withExistingParent("brown_mushroom_furnace_item", modLoc("block/brown_mushroom_furnace_model_unlit"));
      //..............red_mushroom
        withExistingParent("red_mushroom_furnace_item", modLoc("block/red_mushroom_furnace_model_unlit"));
      //..............pumpkin
        withExistingParent("pumpkin_furnace_item", modLoc("block/pumpkin_furnace_model_unlit"));
      //..............chicken
        withExistingParent("chicken_furnace_item", modLoc("block/chicken_furnace_model_unlit"));
      //..............cod
        withExistingParent("cod_furnace_item", modLoc("block/cod_furnace_model_unlit"));
      //..............salmon
        withExistingParent("salmon_furnace_item", modLoc("block/salmon_furnace_model_unlit"));
      //..............tropical_fish
        withExistingParent("tropical_fish_furnace_item", modLoc("block/tropical_fish_furnace_model_unlit"));
      //..............mutton
        withExistingParent("mutton_furnace_item", modLoc("block/mutton_furnace_model_unlit"));
      //..............beef
        withExistingParent("beef_furnace_item", modLoc("block/beef_furnace_model_unlit"));
      //..............pork
        withExistingParent("pork_furnace_item", modLoc("block/pork_furnace_model_unlit"));
      //..............rabbit
        withExistingParent("rabbit_furnace_item", modLoc("block/rabbit_furnace_model_unlit"));
      //..............sugar
        withExistingParent("sugar_furnace_item", modLoc("block/sugar_furnace_model_unlit"));
      //..............honeycomb
        withExistingParent("honeycomb_furnace_item", modLoc("block/honeycomb_furnace_model_unlit"));

    //------------------------------------------------------------paths----------------------------------------------------------------------
      //..............apple
        withExistingParent("apple_stone_path_item", modLoc("block/apple_stone_path"));
      //..............potato
        withExistingParent("potato_stone_path_item", modLoc("block/potato_stone_path"));
      //..............beetroot
        withExistingParent("beetroot_stone_path_item", modLoc("block/beetroot_stone_path"));
      //..............carrot
        withExistingParent("carrot_stone_path_item", modLoc("block/carrot_stone_path"));
      //..............chorus
        withExistingParent("chorus_stone_path_item", modLoc("block/chorus_stone_path"));
      //..............glow_berry
        withExistingParent("glow_berry_stone_path_item", modLoc("block/glow_berry_stone_path"));
      //..............melon
        withExistingParent("melon_stone_path_item", modLoc("block/melon_stone_path"));
      //..............sweet_berry
        withExistingParent("sweet_berry_stone_path_item", modLoc("block/sweet_berry_stone_path"));
      //..............brown_mushroom
        withExistingParent("brown_mushroom_stone_path_item", modLoc("block/brown_mushroom_stone_path"));
      //..............red_mushroom
        withExistingParent("red_mushroom_stone_path_item", modLoc("block/red_mushroom_stone_path"));
      //..............pumpkin
        withExistingParent("pumpkin_stone_path_item", modLoc("block/pumpkin_stone_path"));
      //..............chicken
        withExistingParent("chicken_stone_path_item", modLoc("block/chicken_stone_path"));
      //..............cod
        withExistingParent("cod_stone_path_item", modLoc("block/cod_stone_path"));
      //..............salmon
        withExistingParent("salmon_stone_path_item", modLoc("block/salmon_stone_path"));
      //..............tropical_fish
        withExistingParent("tropical_fish_stone_path_item", modLoc("block/tropical_fish_stone_path"));
      //..............mutton
        withExistingParent("mutton_stone_path_item", modLoc("block/mutton_stone_path"));
      //..............beef
        withExistingParent("beef_stone_path_item", modLoc("block/beef_stone_path"));
      //..............pork
        withExistingParent("pork_stone_path_item", modLoc("block/pork_stone_path"));
      //..............rabbit
        withExistingParent("rabbit_stone_path_item", modLoc("block/rabbit_stone_path"));
      //..............sugar
        withExistingParent("sugar_stone_path_item", modLoc("block/sugar_stone_path"));
      //..............honeycomb
        withExistingParent("honeycomb_stone_path_item", modLoc("block/honeycomb_stone_path"));
    //-----------------------------------------------------------chests----------------------------------------------------------------------
      //..............apple
       withExistingParent("apple_chest_item", modLoc("block/apple_chest_model"));
    //-----------------------------------------------------------barrels----------------------------------------------------------------------
      //..............apple
      withExistingParent("apple_barrel_item", modLoc("block/apple_barrel_model_closed"));
      //..............potato
      withExistingParent("potato_barrel_item", modLoc("block/potato_barrel_model_closed"));
      //..............beetroot
      withExistingParent("beetroot_barrel_item", modLoc("block/beetroot_barrel_model_closed"));
      //..............carrot
      withExistingParent("carrot_barrel_item", modLoc("block/carrot_barrel_model_closed"));
      //..............chorus
      withExistingParent("chorus_barrel_item", modLoc("block/chorus_barrel_model_closed"));
      //..............glowberry
      withExistingParent("glowberry_barrel_item", modLoc("block/glowberry_barrel_model_closed"));
      //..............melon
      withExistingParent("melon_barrel_item", modLoc("block/melon_barrel_model_closed"));
      //..............sweetberry
      withExistingParent("sweetberry_barrel_item", modLoc("block/sweetberry_barrel_model_closed"));
      //..............brownmushroom
      withExistingParent("brownmushroom_barrel_item", modLoc("block/brownmushroom_barrel_model_closed"));
      //..............redmushroom
      withExistingParent("redmushroom_barrel_item", modLoc("block/redmushroom_barrel_model_closed"));
      //..............pumpkin
      withExistingParent("pumpkin_barrel_item", modLoc("block/pumpkin_barrel_model_closed"));
      //..............chicken
      withExistingParent("chicken_barrel_item", modLoc("block/chicken_barrel_model_closed"));
      //..............cod
      withExistingParent("cod_barrel_item", modLoc("block/cod_barrel_model_closed"));
      //..............salmon
      withExistingParent("salmon_barrel_item", modLoc("block/salmon_barrel_model_closed"));
      //..............tropicalfish
      withExistingParent("tropicalfish_barrel_item", modLoc("block/tropicalfish_barrel_model_closed"));
      //..............mutton
      withExistingParent("mutton_barrel_item", modLoc("block/mutton_barrel_model_closed"));
      //..............beef
      withExistingParent("beef_barrel_item", modLoc("block/beef_barrel_model_closed"));
      //..............pork
      withExistingParent("pork_barrel_item", modLoc("block/pork_barrel_model_closed"));
      //..............rabbit
      withExistingParent("rabbit_barrel_item", modLoc("block/rabbit_barrel_model_closed"));
      //..............sugar
      withExistingParent("sugar_barrel_item", modLoc("block/sugar_barrel_model_closed"));
      //..............honeycomb
      withExistingParent("honeycomb_barrel_item", modLoc("block/honeycomb_barrel_model_closed"));

    //-----------------------------------------------------------chairs-----------------------------------------------------------------------
        //.............apple
         withExistingParent("apple_chair_item", modLoc("block/apple_chair"));
        //.............potato
         withExistingParent("potato_chair_item", modLoc("block/potato_chair"));
        //.............beetroot
         withExistingParent("beetroot_chair_item", modLoc("block/beetroot_chair"));
        //.............carrot
         withExistingParent("carrot_chair_item", modLoc("block/carrot_chair"));
        //.............chorus
         withExistingParent("chorus_chair_item", modLoc("block/chorus_chair"));
        //.............glow_berry
         withExistingParent("glow_berry_chair_item", modLoc("block/glow_berry_chair"));
        //.............melon
         withExistingParent("melon_chair_item", modLoc("block/melon_chair"));
        //.............sweet_berry
         withExistingParent("sweet_berry_chair_item", modLoc("block/sweet_berry_chair"));
        //.............brown_mushroom
         withExistingParent("brown_mushroom_chair_item", modLoc("block/brown_mushroom_chair"));
        //.............red_mushroom
         withExistingParent("red_mushroom_chair_item", modLoc("block/red_mushroom_chair"));
        //.............pumpkin
         withExistingParent("pumpkin_chair_item", modLoc("block/pumpkin_chair"));
        //.............chicken
         withExistingParent("chicken_chair_item", modLoc("block/chicken_chair"));
        //.............cod
         withExistingParent("cod_chair_item", modLoc("block/cod_chair"));
        //.............salmon
         withExistingParent("salmon_chair_item", modLoc("block/salmon_chair"));
        //.............tropical_fish
         withExistingParent("tropical_fish_chair_item", modLoc("block/tropical_fish_chair"));
        //.............mutton
         withExistingParent("mutton_chair_item", modLoc("block/mutton_chair"));
        //.............beef
         withExistingParent("beef_chair_item", modLoc("block/beef_chair"));
        //.............pork
         withExistingParent("pork_chair_item", modLoc("block/pork_chair"));
        //.............rabbit
         withExistingParent("rabbit_chair_item", modLoc("block/rabbit_chair"));
        //.............sugar
         withExistingParent("sugar_chair_item", modLoc("block/sugar_chair"));
        //.............honeycomb
         withExistingParent("honeycomb_chair_item", modLoc("block/honeycomb_chair"));
    //------------------------------------------------------------beds------------------------------------------------------------------------
        //.............apple
         withExistingParent("apple_bed_item", modLoc("block/apple_bed"));
        //.............potato
         withExistingParent("potato_bed_item", modLoc("block/potato_bed"));
        //.............beetroot
         withExistingParent("beetroot_bed_item", modLoc("block/beetroot_bed"));
        //.............carrot
         withExistingParent("carrot_bed_item", modLoc("block/carrot_bed"));
        //.............chorus
         withExistingParent("chorus_bed_item", modLoc("block/chorus_bed"));
        //.............glow_berry
         withExistingParent("glow_berry_bed_item", modLoc("block/glow_berry_bed"));
        //.............melon
         withExistingParent("melon_bed_item", modLoc("block/melon_bed"));
        //.............sweet_berry
         withExistingParent("sweet_berry_bed_item", modLoc("block/sweet_berry_bed"));
        //.............brown_mushroom
         withExistingParent("brown_mushroom_bed_item", modLoc("block/brown_mushroom_bed"));
        //.............red_mushroom
         withExistingParent("red_mushroom_bed_item", modLoc("block/red_mushroom_bed"));
        //.............pumpkin
         withExistingParent("pumpkin_bed_item", modLoc("block/pumpkin_bed"));
        //.............chicken
         withExistingParent("chicken_bed_item", modLoc("block/chicken_bed"));
        //.............cod
         withExistingParent("cod_bed_item", modLoc("block/cod_bed"));
        //.............salmon
         withExistingParent("salmon_bed_item", modLoc("block/salmon_bed"));
        //.............tropical_fish
         withExistingParent("tropical_fish_bed_item", modLoc("block/tropical_fish_bed"));
        //.............mutton
         withExistingParent("mutton_bed_item", modLoc("block/mutton_bed"));
        //.............beef
         withExistingParent("beef_bed_item", modLoc("block/beef_bed"));
        //.............pork
         withExistingParent("pork_bed_item", modLoc("block/pork_bed"));
        //.............rabbit
         withExistingParent("rabbit_bed_item", modLoc("block/rabbit_bed"));
        //.............sugar
         withExistingParent("sugar_bed_item", modLoc("block/sugar_bed"));
        //.............honeycomb
         withExistingParent("honeycomb_bed_item", modLoc("block/honeycomb_bed"));
    //-----------------------------------------------------------cabinets----------------------------------------------------------------------
      //..............apple
        withExistingParent("small_apple_cabinet_item", modLoc("block/apple_cabinet"));
        withExistingParent("medium_apple_cabinet_item", modLoc("block/medium_apple_cabinet"));
      //..............potato
        withExistingParent("small_potato_cabinet_item", modLoc("block/potato_cabinet"));
        withExistingParent("medium_potato_cabinet_item", modLoc("block/medium_potato_cabinet"));
      //..............beetroot
        withExistingParent("small_beetroot_cabinet_item", modLoc("block/beetroot_cabinet"));
        withExistingParent("medium_beetroot_cabinet_item", modLoc("block/medium_beetroot_cabinet"));
      //..............carrot
        withExistingParent("small_carrot_cabinet_item", modLoc("block/carrot_cabinet"));
        withExistingParent("medium_carrot_cabinet_item", modLoc("block/medium_carrot_cabinet"));
      //..............chorus
        withExistingParent("small_chorus_cabinet_item", modLoc("block/chorus_cabinet"));
        withExistingParent("medium_chorus_cabinet_item", modLoc("block/medium_chorus_cabinet"));
      //..............glow_berry
        withExistingParent("small_glow_berry_cabinet_item", modLoc("block/glow_berry_cabinet"));
        withExistingParent("medium_glow_berry_cabinet_item", modLoc("block/medium_glow_berry_cabinet"));
      //..............melon
        withExistingParent("small_melon_cabinet_item", modLoc("block/melon_cabinet"));
        withExistingParent("medium_melon_cabinet_item", modLoc("block/medium_melon_cabinet"));
      //..............sweet_berry
        withExistingParent("small_sweet_berry_cabinet_item", modLoc("block/sweet_berry_cabinet"));
        withExistingParent("medium_sweet_berry_cabinet_item", modLoc("block/medium_sweet_berry_cabinet"));
      //..............brown_mushroom
        withExistingParent("small_brown_mushroom_cabinet_item", modLoc("block/brown_mushroom_cabinet"));
        withExistingParent("medium_brown_mushroom_cabinet_item", modLoc("block/medium_brown_mushroom_cabinet"));
      //..............red_mushroom
        withExistingParent("small_red_mushroom_cabinet_item", modLoc("block/red_mushroom_cabinet"));
        withExistingParent("medium_red_mushroom_cabinet_item", modLoc("block/medium_red_mushroom_cabinet"));
      //..............pumpkin
        withExistingParent("small_pumpkin_cabinet_item", modLoc("block/pumpkin_cabinet"));
        withExistingParent("medium_pumpkin_cabinet_item", modLoc("block/medium_pumpkin_cabinet"));
      //..............chicken
        withExistingParent("small_chicken_cabinet_item", modLoc("block/chicken_cabinet"));
        withExistingParent("medium_chicken_cabinet_item", modLoc("block/medium_chicken_cabinet"));
      //..............cod
        withExistingParent("small_cod_cabinet_item", modLoc("block/cod_cabinet"));
        withExistingParent("medium_cod_cabinet_item", modLoc("block/medium_cod_cabinet"));
      //..............salmon
        withExistingParent("small_salmon_cabinet_item", modLoc("block/salmon_cabinet"));
        withExistingParent("medium_salmon_cabinet_item", modLoc("block/medium_salmon_cabinet"));
      //..............tropical_fish
        withExistingParent("small_tropical_fish_cabinet_item", modLoc("block/tropical_fish_cabinet"));
        withExistingParent("medium_tropical_fish_cabinet_item", modLoc("block/medium_tropical_fish_cabinet"));
      //..............mutton
        withExistingParent("small_mutton_cabinet_item", modLoc("block/mutton_cabinet"));
        withExistingParent("medium_mutton_cabinet_item", modLoc("block/medium_mutton_cabinet"));
      //..............beef
        withExistingParent("small_beef_cabinet_item", modLoc("block/beef_cabinet"));
        withExistingParent("medium_beef_cabinet_item", modLoc("block/medium_beef_cabinet"));
      //..............pork
        withExistingParent("small_pork_cabinet_item", modLoc("block/pork_cabinet"));
        withExistingParent("medium_pork_cabinet_item", modLoc("block/medium_pork_cabinet"));
      //..............rabbit
        withExistingParent("small_rabbit_cabinet_item", modLoc("block/rabbit_cabinet"));
        withExistingParent("medium_rabbit_cabinet_item", modLoc("block/medium_rabbit_cabinet"));
      //..............sugar
        withExistingParent("small_sugar_cabinet_item", modLoc("block/sugar_cabinet"));
        withExistingParent("medium_sugar_cabinet_item", modLoc("block/medium_sugar_cabinet"));
      //..............honeycomb
        withExistingParent("small_honeycomb_cabinet_item", modLoc("block/honeycomb_cabinet"));
        withExistingParent("medium_honeycomb_cabinet_item", modLoc("block/medium_honeycomb_cabinet"));
  } 
 protected void buildToolModels() {
      withExistingParent("advanced_mush_hammer", mcLoc("item/generated")).texture("layer0", "item/advanced_mush_hammer");
      withExistingParent("advanced_meatgrinder", mcLoc("item/generated")).texture("layer0", "item/advanced_meatgrinder");
      withExistingParent("more_advanced_mush_hammer", mcLoc("item/generated")).texture("layer0", "item/more_advanced_mush_hammer");
      withExistingParent("more_advanced_meatgrinder", mcLoc("item/generated")).texture("layer0", "item/more_advanced_meatgrinder");
      withExistingParent("most_advanced_mush_hammer", mcLoc("item/generated")).texture("layer0", "item/most_advanced_mush_hammer");
      withExistingParent("most_advanced_meatgrinder", mcLoc("item/generated")).texture("layer0", "item/most_advanced_meatgrinder");
  }  
 protected void buildPasteModels() {
      withExistingParent("sugar_paste", mcLoc("item/generated")).texture("layer0", "item/sugar_paste");
  }
 protected void buildPowderModels() {
      withExistingParent("honeycomb_powder", mcLoc("item/generated")).texture("layer0", "item/honeycomb_powder");
  }
 protected void buildIngotModels() {
      //sugar
       withExistingParent("sugar_ingot", mcLoc("item/generated")).texture("layer0", "item/sugar_ingot");
      //honeycomb
       withExistingParent("honeycomb_ingot", mcLoc("item/generated")).texture("layer0", "item/honeycomb_ingot");
  }
 protected void buildNuggetModels() {
      //sugar
       withExistingParent("sugar_nugget", mcLoc("item/generated")).texture("layer0", "item/sugar_nugget");
      //honeycomb
       withExistingParent("honeycomb_nugget", mcLoc("item/generated")).texture("layer0", "item/honeycomb_nugget");
  }
 protected void buildRegularBlockModels() {
      //sugar
       withExistingParent("sugar_block_item", modLoc("block/sugar_block"));
      //honeycomb
       withExistingParent("processed_honeycomb_block_item", modLoc("block/processed_honeycomb_block"));
  }
 protected void buildBricksBlockModels() {
      //apple
       withExistingParent("apple_bricks_block_item", modLoc("block/apple_bricks_block"));
      //potato
       withExistingParent("potato_bricks_block_item", modLoc("block/potato_bricks_block"));
      //beetroot
       withExistingParent("beetroot_bricks_block_item", modLoc("block/beetroot_bricks_block"));
      //carrot
       withExistingParent("carrot_bricks_block_item", modLoc("block/carrot_bricks_block"));
      //chorus
       withExistingParent("chorus_bricks_block_item", modLoc("block/chorus_bricks_block"));
      //glow_berry
       withExistingParent("glow_berry_bricks_block_item", modLoc("block/glow_berry_bricks_block"));
      //melon
       withExistingParent("melon_bricks_block_item", modLoc("block/melon_bricks_block"));
      //sweet_berry
       withExistingParent("sweet_berry_bricks_block_item", modLoc("block/sweet_berry_bricks_block"));
      //brown_mushroom
       withExistingParent("brown_mushroom_bricks_block_item", modLoc("block/brown_mushroom_bricks_block"));
      //red_mushroom
       withExistingParent("red_mushroom_bricks_block_item", modLoc("block/red_mushroom_bricks_block"));
      //.........pumpkin
        withExistingParent("pumpkin_bricks_block_item", modLoc("block/pumpkin_bricks_block"));
      //.........chicken
        withExistingParent("chicken_bricks_block_item", modLoc("block/chicken_bricks_block"));
      //.........cod
        withExistingParent("cod_bricks_block_item", modLoc("block/cod_bricks_block"));
      //.........salmon
        withExistingParent("salmon_bricks_block_item", modLoc("block/salmon_bricks_block"));
      //.........tropical_fish
        withExistingParent("tropical_fish_bricks_block_item", modLoc("block/tropical_fish_bricks_block"));
      //.........mutton
        withExistingParent("mutton_bricks_block_item", modLoc("block/mutton_bricks_block"));
      //.........beef
        withExistingParent("beef_bricks_block_item", modLoc("block/beef_bricks_block"));
      //.........pork
        withExistingParent("pork_bricks_block_item", modLoc("block/pork_bricks_block"));
      //.........rabbit
        withExistingParent("rabbit_bricks_block_item", modLoc("block/rabbit_bricks_block"));
      //.........sugar
        withExistingParent("sugar_bricks_block_item", modLoc("block/sugar_bricks_block"));
      //.........honeycomb
        withExistingParent("honeycomb_bricks_block_item", modLoc("block/honeycomb_bricks_block"));
  }
}

// .rootTransforms().scale(0.5f).translation(-0.25f, -0.25f, -0.25f)
//        .end();