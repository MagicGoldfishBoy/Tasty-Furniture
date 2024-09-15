package com.goldfish.goldfishmod02tastyfurniture.datagen;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelBuilder;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


public class GM1ItemModelProvider extends ItemModelProvider {

        public GM1ItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, "goldfishmod02tastyfurniture", existingFileHelper);
    }

        @Override
        protected void registerModels() {
          //withExistingParent("apple_button_item", modLoc("block/apple_button"));
          //withExistingParent("apple_button_item", mcLoc("item/generated")).texture("layer0", "item/example_item");

    //-------------------------------------------------------------blocks--------------------------------------------------------------------
     //____________________________________________________________bricks_____________________________________________________________________
      //.........apple
        withExistingParent("apple_bricks_block_item", modLoc("block/apple_bricks_block"));
      //.........potato
        withExistingParent("potato_bricks_block_item", modLoc("block/potato_bricks_block"));
      //.........beetroot
        withExistingParent("beetroot_bricks_block_item", modLoc("block/beetroot_bricks_block"));
      //.........carrot
        withExistingParent("carrot_bricks_block_item", modLoc("block/carrot_bricks_block"));
      //.........chorus
        withExistingParent("chorus_bricks_block_item", modLoc("block/chorus_bricks_block"));
      //.........glow_berry
        withExistingParent("glow_berry_bricks_block_item", modLoc("block/glow_berry_bricks_block"));
      //.........melon
        withExistingParent("melon_bricks_block_item", modLoc("block/melon_bricks_block"));
      //.........sweet_berry
        withExistingParent("sweet_berry_bricks_block_item", modLoc("block/sweet_berry_bricks_block"));
      //.........brown_mushroom
        withExistingParent("brown_mushroom_bricks_block_item", modLoc("block/brown_mushroom_bricks_block"));
      //.........red_mushroom
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
  }   
}

// .rootTransforms().scale(0.5f).translation(-0.25f, -0.25f, -0.25f)
//        .end();