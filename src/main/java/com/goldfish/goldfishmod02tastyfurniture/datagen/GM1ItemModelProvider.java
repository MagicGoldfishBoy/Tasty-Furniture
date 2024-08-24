package com.goldfish.goldfishmod02tastyfurniture.datagen;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
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
    //------------------------------------------------------pressure plates-------------------------------------------------------------------
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

    //---------------------------------------------------------signs----------------------------------------------------------------------
      //..............apple
       withExistingParent("apple_sign_item", mcLoc("item/generated")).texture("layer0", "block/apple_block");

    //---------------------------------------------------------slabs----------------------------------------------------------------------
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

    //---------------------------------------------------------stairs----------------------------------------------------------------------
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

    //------------------------------------------------------trapdoors----------------------------------------------------------------------
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

    //---------------------------------------------------------bars----------------------------------------------------------------------
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
 }   
}
