package com.goldfish.goldfishmod02tastyfurniture.datagen;

import net.minecraft.data.BlockFamily;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelBuilder;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.client.model.generators.VariantBlockStateBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.core.Cloner;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.registries.RegistriesDatapackGenerator;
import net.minecraft.resources.RegistryDataLoader;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import com.google.common.collect.Maps;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamily;

import java.util.Map;
import java.util.stream.Stream;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;
import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

public class GM1BlockStateProvider extends BlockStateProvider 
{

     public GM1BlockStateProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
         super(output, "goldfishmod02tastyfurniture", existingFileHelper);
     }

     @Override
     public void registerStatesAndModels() {
       // ModelFile apple_button_model = models().withExistingParent("door_bottom_left", "minecraft:block/door_bottom_left");

    //-------------------------------------------------------------doors---------------------------------------------------------------------
      //.........glow berry
        DoorBlock glow_berry_door_block = foodblockregistry.GLOW_BERRY_DOOR_BLOCK.get();
        ResourceLocation glow_berry_door_bottom_texture = modLoc("block/glow_berry_door_bottom");
        ResourceLocation glow_berry_door_top_texture = modLoc("block/glow_berry_door_top");
        doorBlockWithRenderType(glow_berry_door_block, glow_berry_door_bottom_texture, glow_berry_door_top_texture, "cutout_mipped_all");
      //...........melon
        DoorBlock melon_door_block = foodblockregistry.MELON_DOOR_BLOCK.get();
        ResourceLocation melon_door_bottom_texture = modLoc("block/melon_door_bottom");
        ResourceLocation melon_door_top_texture = modLoc("block/melon_door_top");
        doorBlockWithRenderType(melon_door_block, melon_door_bottom_texture, melon_door_top_texture, "translucent");
      //.........sweet berry
        DoorBlock sweet_berry_door_block = foodblockregistry.SWEET_BERRY_DOOR_BLOCK.get();
        ResourceLocation sweet_berry_door_bottom_texture = modLoc("block/sweet_berry_door_bottom");
        ResourceLocation sweet_berry_door_top_texture = modLoc("block/sweet_berry_door_top");
        doorBlockWithRenderType(sweet_berry_door_block, sweet_berry_door_bottom_texture, sweet_berry_door_top_texture, "translucent");
      //........brown mushroom
        DoorBlock brown_mushroom_door_block = foodblockregistry.BROWN_MUSHROOM_DOOR_BLOCK.get();
        ResourceLocation brown_mushroom_door_bottom_texture = modLoc("block/brown_mushroom_door_bottom");
        ResourceLocation brown_mushroom_door_top_texture = modLoc("block/brown_mushroom_door_top");
        doorBlockWithRenderType(brown_mushroom_door_block, brown_mushroom_door_bottom_texture, brown_mushroom_door_top_texture, "translucent");
      //.........red mushroom
        DoorBlock red_mushroom_door_block = foodblockregistry.RED_MUSHROOM_DOOR_BLOCK.get();
        ResourceLocation red_mushroom_door_bottom_texture = modLoc("block/red_mushroom_door_bottom");
        ResourceLocation red_mushroom_door_top_texture = modLoc("block/red_mushroom_door_top");
        doorBlockWithRenderType(red_mushroom_door_block, red_mushroom_door_bottom_texture, red_mushroom_door_top_texture, "translucent");
      //...........pumpkin
        DoorBlock pumpkin_door_block = foodblockregistry.PUMPKIN_DOOR_BLOCK.get();
        ResourceLocation pumpkin_door_bottom_texture = modLoc("block/pumpkin_door_bottom");
        ResourceLocation pumpkin_door_top_texture = modLoc("block/pumpkin_door_top");
        doorBlockWithRenderType(pumpkin_door_block, pumpkin_door_bottom_texture, pumpkin_door_top_texture, "cutout_mipped_all");
      //...........chicken
        DoorBlock chicken_door_block = foodblockregistry.CHICKEN_DOOR_BLOCK.get();
        ResourceLocation chicken_door_bottom_texture = modLoc("block/chicken_door_bottom");
        ResourceLocation chicken_door_top_texture = modLoc("block/chicken_door_top");
        doorBlockWithRenderType(chicken_door_block, chicken_door_bottom_texture, chicken_door_top_texture, "cutout_mipped_all");
      //.............cod
        DoorBlock cod_door_block = foodblockregistry.COD_DOOR_BLOCK.get();
        ResourceLocation cod_door_bottom_texture = modLoc("block/cod_door_bottom");
        ResourceLocation cod_door_top_texture = modLoc("block/cod_door_top");
        doorBlockWithRenderType(cod_door_block, cod_door_bottom_texture, cod_door_top_texture, "cutout_mipped_all");
      //............salmon
        DoorBlock salmon_door_block = foodblockregistry.SALMON_DOOR_BLOCK.get();
        ResourceLocation salmon_door_bottom_texture = modLoc("block/salmon_door_bottom");
        ResourceLocation salmon_door_top_texture = modLoc("block/salmon_door_top");
        doorBlockWithRenderType(salmon_door_block, salmon_door_bottom_texture, salmon_door_top_texture, "cutout_mipped_all");
      //.........tropical_fish
        DoorBlock tropical_fish_door_block = foodblockregistry.TROPICAL_FISH_DOOR_BLOCK.get();
        ResourceLocation tropical_fish_door_bottom_texture = modLoc("block/tropical_fish_door_bottom");
        ResourceLocation tropical_fish_door_top_texture = modLoc("block/tropical_fish_door_top");
        doorBlockWithRenderType(tropical_fish_door_block, tropical_fish_door_bottom_texture, tropical_fish_door_top_texture, "translucent");
      //.............mutton
        DoorBlock mutton_door_block = foodblockregistry.MUTTON_DOOR_BLOCK.get();
        ResourceLocation mutton_door_bottom_texture = modLoc("block/mutton_door_bottom");
        ResourceLocation mutton_door_top_texture = modLoc("block/mutton_door_top");
        doorBlockWithRenderType(mutton_door_block, mutton_door_bottom_texture, mutton_door_top_texture, "cutout_mipped_all");
      //.............beef
        DoorBlock beef_door_block = foodblockregistry.BEEF_DOOR_BLOCK.get();
        ResourceLocation beef_door_bottom_texture = modLoc("block/beef_door_bottom");
        ResourceLocation beef_door_top_texture = modLoc("block/beef_door_top");
        doorBlockWithRenderType(beef_door_block, beef_door_bottom_texture, beef_door_top_texture, "translucent");
      //.............pork
        DoorBlock pork_door_block = foodblockregistry.PORK_DOOR_BLOCK.get();
        ResourceLocation pork_door_bottom_texture = modLoc("block/pork_door_bottom");
        ResourceLocation pork_door_top_texture = modLoc("block/pork_door_top");
        doorBlockWithRenderType(pork_door_block, pork_door_bottom_texture, pork_door_top_texture, "translucent");
      //.............rabbit
        DoorBlock rabbit_door_block = foodblockregistry.RABBIT_DOOR_BLOCK.get();
        ResourceLocation rabbit_door_bottom_texture = modLoc("block/rabbit_door_bottom");
        ResourceLocation rabbit_door_top_texture = modLoc("block/rabbit_door_top");
        doorBlockWithRenderType(rabbit_door_block, rabbit_door_bottom_texture, rabbit_door_top_texture, "cutout_mipped_all");
        
      //-------------------------------------------------------------------buttons---------------------------------------------------------------------------
        //.............apple
          ButtonBlock apple_button = foodblockregistry.APPLE_BUTTON.get();
          ResourceLocation apple_button_texture = modLoc("block/apple_block");
          buttonBlock(apple_button, apple_button_texture);
        //.............potato
          ButtonBlock potato_button = foodblockregistry.POTATO_BUTTON.get();
          ResourceLocation potato_button_texture = modLoc("block/potato_block");
          buttonBlock(potato_button, potato_button_texture);
        //.............beetroot
          ButtonBlock beetroot_button = foodblockregistry.BEETROOT_BUTTON.get();
          ResourceLocation beetroot_button_texture = modLoc("block/beetroot_block");
          buttonBlock(beetroot_button, beetroot_button_texture);
        //..............carrot
          ButtonBlock carrot_button = foodblockregistry.CARROT_BUTTON.get();
          ResourceLocation carrot_button_texture = modLoc("block/carrot_block");
          buttonBlock(carrot_button, carrot_button_texture);
        //..............chorus
          ButtonBlock chorus_button = foodblockregistry.CHORUS_BUTTON.get();
          ResourceLocation chorus_button_texture = modLoc("block/chorus_block");
          buttonBlock(chorus_button, chorus_button_texture);
        //..............glow_berry
          ButtonBlock glow_berry_button = foodblockregistry.GLOW_BERRY_BUTTON.get();
          ResourceLocation glow_berry_button_texture = modLoc("block/glow_berry_block");
          buttonBlock(glow_berry_button, glow_berry_button_texture);
        //................melon
          ButtonBlock melon_button = foodblockregistry.MELON_BUTTON.get();
          ResourceLocation melon_button_texture = modLoc("block/melon_block");
          buttonBlock(melon_button, melon_button_texture);
        //..............sweet_berry
          ButtonBlock sweet_berry_button = foodblockregistry.SWEET_BERRY_BUTTON.get();
          ResourceLocation sweet_berry_button_texture = modLoc("block/sweet_berry_block");
          buttonBlock(sweet_berry_button, sweet_berry_button_texture);
        //.............brown_mushroom
          ButtonBlock brown_mushroom_button = foodblockregistry.BROWN_MUSHROOM_BUTTON.get();
          ResourceLocation brown_mushroom_button_texture = modLoc("block/brown_mushroom_block");
          buttonBlock(brown_mushroom_button, brown_mushroom_button_texture);
        //.............red_mushroom
          ButtonBlock red_mushroom_button = foodblockregistry.RED_MUSHROOM_BUTTON.get();
          ResourceLocation red_mushroom_button_texture = modLoc("block/red_mushroom_block");
          buttonBlock(red_mushroom_button, red_mushroom_button_texture);
        //...............pumpkin
          ButtonBlock pumpkin_button = foodblockregistry.PUMPKIN_BUTTON.get();
          ResourceLocation pumpkin_button_texture = modLoc("block/pumpkin_block");
          buttonBlock(pumpkin_button, pumpkin_button_texture);
        //...............chicken
          ButtonBlock chicken_button = foodblockregistry.CHICKEN_BUTTON.get();
          ResourceLocation chicken_button_texture = modLoc("block/chicken_block");
          buttonBlock(chicken_button, chicken_button_texture);
        //.................cod
          ButtonBlock cod_button = foodblockregistry.COD_BUTTON.get();
          ResourceLocation cod_button_texture = modLoc("block/cod_block");
          buttonBlock(cod_button, cod_button_texture);
        //................salmon
          ButtonBlock salmon_button = foodblockregistry.SALMON_BUTTON.get();
          ResourceLocation salmon_button_texture = modLoc("block/salmon_block");
          buttonBlock(salmon_button, salmon_button_texture);
        //................tropical_fish
          ButtonBlock tropical_fish_button = foodblockregistry.TROPICAL_FISH_BUTTON.get();
          ResourceLocation tropical_fish_button_texture = modLoc("block/tropical_fish_block");
          buttonBlock(tropical_fish_button, tropical_fish_button_texture);
        //...................mutton
          ButtonBlock mutton_button = foodblockregistry.MUTTON_BUTTON.get();
          ResourceLocation mutton_button_texture = modLoc("block/mutton_block");
          buttonBlock(mutton_button, mutton_button_texture);
        //...................beef
          ButtonBlock beef_button = foodblockregistry.BEEF_BUTTON.get();
          ResourceLocation beef_button_texture = modLoc("block/beef_block");
          buttonBlock(beef_button, beef_button_texture);
        //...................pork
          ButtonBlock pork_button = foodblockregistry.PORK_BUTTON.get();
          ResourceLocation pork_button_texture = modLoc("block/pork_block");
          buttonBlock(pork_button, pork_button_texture);
        //..................rabbit
          ButtonBlock rabbit_button = foodblockregistry.RABBIT_BUTTON.get();
          ResourceLocation rabbit_button_texture = modLoc("block/rabbit_block");
          buttonBlock(rabbit_button, rabbit_button_texture);
      //-------------------------------------------------------------------fences---------------------------------------------------------------------------
        //.............apple
          FenceBlock apple_fence = foodblockregistry.APPLE_FENCE.get();
          ResourceLocation apple_fence_texture = modLoc("block/apple_block");
          fenceBlock(apple_fence, apple_fence_texture);
        //.............potato
          FenceBlock potato_fence = foodblockregistry.POTATO_FENCE.get();
          ResourceLocation potato_fence_texture = modLoc("block/potato_block");
          fenceBlock(potato_fence, potato_fence_texture);
        //.............beetroot
          FenceBlock beetroot_fence = foodblockregistry.BEETROOT_FENCE.get();
          ResourceLocation beetroot_fence_texture = modLoc("block/beetroot_block");
          fenceBlock(beetroot_fence, beetroot_fence_texture);
        //.............carrot
          FenceBlock carrot_fence = foodblockregistry.CARROT_FENCE.get();
          ResourceLocation carrot_fence_texture = modLoc("block/carrot_block");
          fenceBlock(carrot_fence, carrot_fence_texture);
        //.............chorus
          FenceBlock chorus_fence = foodblockregistry.CHORUS_FENCE.get();
          ResourceLocation chorus_fence_texture = modLoc("block/chorus_block");
          fenceBlock(chorus_fence, chorus_fence_texture);
        //.............glow_berry
          FenceBlock glow_berry_fence = foodblockregistry.GLOW_BERRY_FENCE.get();
          ResourceLocation glow_berry_fence_texture = modLoc("block/glow_berry_block");
          fenceBlock(glow_berry_fence, glow_berry_fence_texture);
        //.............melon
          FenceBlock melon_fence = foodblockregistry.MELON_FENCE.get();
          ResourceLocation melon_fence_texture = modLoc("block/melon_block");
          fenceBlock(melon_fence, melon_fence_texture);
        //.............sweet_berry
          FenceBlock sweet_berry_fence = foodblockregistry.SWEET_BERRY_FENCE.get();
          ResourceLocation sweet_berry_fence_texture = modLoc("block/sweet_berry_block");
          fenceBlock(sweet_berry_fence, sweet_berry_fence_texture);
        //.............brown_mushroom
          FenceBlock brown_mushroom_fence = foodblockregistry.BROWN_MUSHROOM_FENCE.get();
          ResourceLocation brown_mushroom_fence_texture = modLoc("block/brown_mushroom_block");
          fenceBlock(brown_mushroom_fence, brown_mushroom_fence_texture);
        //.............red_mushroom
          FenceBlock red_mushroom_fence = foodblockregistry.RED_MUSHROOM_FENCE.get();
          ResourceLocation red_mushroom_fence_texture = modLoc("block/red_mushroom_block");
          fenceBlock(red_mushroom_fence, red_mushroom_fence_texture);
        //.............pumpkin
          FenceBlock pumpkin_fence = foodblockregistry.PUMPKIN_FENCE.get();
          ResourceLocation pumpkin_fence_texture = modLoc("block/pumpkin_block");
          fenceBlock(pumpkin_fence, pumpkin_fence_texture);
        //.............chicken
          FenceBlock chicken_fence = foodblockregistry.CHICKEN_FENCE.get();
          ResourceLocation chicken_fence_texture = modLoc("block/chicken_block");
          fenceBlock(chicken_fence, chicken_fence_texture);
        //.............cod
          FenceBlock cod_fence = foodblockregistry.COD_FENCE.get();
          ResourceLocation cod_fence_texture = modLoc("block/cod_block");
          fenceBlock(cod_fence, cod_fence_texture);
        //.............salmon
          FenceBlock salmon_fence = foodblockregistry.SALMON_FENCE.get();
          ResourceLocation salmon_fence_texture = modLoc("block/salmon_block");
          fenceBlock(salmon_fence, salmon_fence_texture);
        //.............tropical_fish
          FenceBlock tropical_fish_fence = foodblockregistry.TROPICAL_FISH_FENCE.get();
          ResourceLocation tropical_fish_fence_texture = modLoc("block/tropical_fish_block");
          fenceBlock(tropical_fish_fence, tropical_fish_fence_texture);
        //.............mutton
          FenceBlock mutton_fence = foodblockregistry.MUTTON_FENCE.get();
          ResourceLocation mutton_fence_texture = modLoc("block/mutton_block");
          fenceBlock(mutton_fence, mutton_fence_texture);
        //.............beef
          FenceBlock beef_fence = foodblockregistry.BEEF_FENCE.get();
          ResourceLocation beef_fence_texture = modLoc("block/beef_block");
          fenceBlock(beef_fence, beef_fence_texture);
        //.............pork
          FenceBlock pork_fence = foodblockregistry.PORK_FENCE.get();
          ResourceLocation pork_fence_texture = modLoc("block/pork_block");
          fenceBlock(pork_fence, pork_fence_texture);
        //.............rabbit
          FenceBlock rabbit_fence = foodblockregistry.RABBIT_FENCE.get();
          ResourceLocation rabbit_fence_texture = modLoc("block/rabbit_block");
          fenceBlock(rabbit_fence, rabbit_fence_texture);

      //---------------------------------------------------------------pressure plates---------------------------------------------------------------------------
        //.............apple
          PressurePlateBlock apple_pressure_plate = foodblockregistry.APPLE_PRESSURE_PLATE.get();
          ResourceLocation apple_pressure_plate_texture = modLoc("block/apple_block");
          pressurePlateBlock(apple_pressure_plate, apple_pressure_plate_texture);
        //.............potato
          PressurePlateBlock potato_pressure_plate = foodblockregistry.POTATO_PRESSURE_PLATE.get();
          ResourceLocation potato_pressure_plate_texture = modLoc("block/potato_block");
          pressurePlateBlock(potato_pressure_plate, potato_pressure_plate_texture);
        //.............beetroot
          PressurePlateBlock beetroot_pressure_plate = foodblockregistry.BEETROOT_PRESSURE_PLATE.get();
          ResourceLocation beetroot_pressure_plate_texture = modLoc("block/beetroot_block");
          pressurePlateBlock(beetroot_pressure_plate, beetroot_pressure_plate_texture);
        //.............carrot
          PressurePlateBlock carrot_pressure_plate = foodblockregistry.CARROT_PRESSURE_PLATE.get();
          ResourceLocation carrot_pressure_plate_texture = modLoc("block/carrot_block");
          pressurePlateBlock(carrot_pressure_plate, carrot_pressure_plate_texture);
        //.............chorus
          PressurePlateBlock chorus_pressure_plate = foodblockregistry.CHORUS_PRESSURE_PLATE.get();
          ResourceLocation chorus_pressure_plate_texture = modLoc("block/chorus_block");
          pressurePlateBlock(chorus_pressure_plate, chorus_pressure_plate_texture);
        //.............glow_berry
          PressurePlateBlock glow_berry_pressure_plate = foodblockregistry.GLOW_BERRY_PRESSURE_PLATE.get();
          ResourceLocation glow_berry_pressure_plate_texture = modLoc("block/glow_berry_block");
          pressurePlateBlock(glow_berry_pressure_plate, glow_berry_pressure_plate_texture);
        //.............melon
          PressurePlateBlock melon_pressure_plate = foodblockregistry.MELON_PRESSURE_PLATE.get();
          ResourceLocation melon_pressure_plate_texture = modLoc("block/melon_block");
          pressurePlateBlock(melon_pressure_plate, melon_pressure_plate_texture);
        //.............sweet_berry
          PressurePlateBlock sweet_berry_pressure_plate = foodblockregistry.SWEET_BERRY_PRESSURE_PLATE.get();
          ResourceLocation sweet_berry_pressure_plate_texture = modLoc("block/sweet_berry_block");
          pressurePlateBlock(sweet_berry_pressure_plate, sweet_berry_pressure_plate_texture);
        //.............brown_mushroom
          PressurePlateBlock brown_mushroom_pressure_plate = foodblockregistry.BROWN_MUSHROOM_PRESSURE_PLATE.get();
          ResourceLocation brown_mushroom_pressure_plate_texture = modLoc("block/brown_mushroom_block");
          pressurePlateBlock(brown_mushroom_pressure_plate, brown_mushroom_pressure_plate_texture);
        //.............red_mushroom
          PressurePlateBlock red_mushroom_pressure_plate = foodblockregistry.RED_MUSHROOM_PRESSURE_PLATE.get();
          ResourceLocation red_mushroom_pressure_plate_texture = modLoc("block/red_mushroom_block");
          pressurePlateBlock(red_mushroom_pressure_plate, red_mushroom_pressure_plate_texture);
        //.............pumpkin
          PressurePlateBlock pumpkin_pressure_plate = foodblockregistry.PUMPKIN_PRESSURE_PLATE.get();
          ResourceLocation pumpkin_pressure_plate_texture = modLoc("block/pumpkin_block");
          pressurePlateBlock(pumpkin_pressure_plate, pumpkin_pressure_plate_texture);
        //.............chicken
          PressurePlateBlock chicken_pressure_plate = foodblockregistry.CHICKEN_PRESSURE_PLATE.get();
          ResourceLocation chicken_pressure_plate_texture = modLoc("block/chicken_block");
          pressurePlateBlock(chicken_pressure_plate, chicken_pressure_plate_texture);
        //.............cod
          PressurePlateBlock cod_pressure_plate = foodblockregistry.COD_PRESSURE_PLATE.get();
          ResourceLocation cod_pressure_plate_texture = modLoc("block/cod_block");
          pressurePlateBlock(cod_pressure_plate, cod_pressure_plate_texture);
        //.............salmon
          PressurePlateBlock salmon_pressure_plate = foodblockregistry.SALMON_PRESSURE_PLATE.get();
          ResourceLocation salmon_pressure_plate_texture = modLoc("block/salmon_block");
          pressurePlateBlock(salmon_pressure_plate, salmon_pressure_plate_texture);
        //.............tropical_fish
          PressurePlateBlock tropical_fish_pressure_plate = foodblockregistry.TROPICAL_FISH_PRESSURE_PLATE.get();
          ResourceLocation tropical_fish_pressure_plate_texture = modLoc("block/tropical_fish_block");
          pressurePlateBlock(tropical_fish_pressure_plate, tropical_fish_pressure_plate_texture);
        //.............mutton
          PressurePlateBlock mutton_pressure_plate = foodblockregistry.MUTTON_PRESSURE_PLATE.get();
          ResourceLocation mutton_pressure_plate_texture = modLoc("block/mutton_block");
          pressurePlateBlock(mutton_pressure_plate, mutton_pressure_plate_texture);
        //.............beef
          PressurePlateBlock beef_pressure_plate = foodblockregistry.BEEF_PRESSURE_PLATE.get();
          ResourceLocation beef_pressure_plate_texture = modLoc("block/beef_block");
          pressurePlateBlock(beef_pressure_plate, beef_pressure_plate_texture);
        //.............pork
          PressurePlateBlock pork_pressure_plate = foodblockregistry.PORK_PRESSURE_PLATE.get();
          ResourceLocation pork_pressure_plate_texture = modLoc("block/pork_block");
          pressurePlateBlock(pork_pressure_plate, pork_pressure_plate_texture);
        //.............rabbit
          PressurePlateBlock rabbit_pressure_plate = foodblockregistry.RABBIT_PRESSURE_PLATE.get();
          ResourceLocation rabbit_pressure_plate_texture = modLoc("block/rabbit_block");
          pressurePlateBlock(rabbit_pressure_plate, rabbit_pressure_plate_texture);

      //-----------------------------------------------------------------signs-----------------------------------------------------------------------------
        //.............apple
           StandingSignBlock apple_sign = foodblockregistry.APPLE_SIGN.get();
           WallSignBlock apple_wall_sign = foodblockregistry.APPLE_WALL_SIGN.get();
           ResourceLocation apple_sign_texture = modLoc("block/apple_block");
           signBlock(apple_sign, apple_wall_sign, apple_sign_texture);
        //.........potato
        //.........beetroot
        //.........carrot
        //.........chorus
        //.........glow_berry
        //.........melon
        //.........sweet_berry
        //.........brown_mushroom
        //.........red_mushroom
        //.........pumpkin
        //.........chicken
        //.........cod
        //.........salmon
        //.........tropical_fish
        //.........mutton
        //.........beef
        //.........pork
        //.........rabbit

      //-----------------------------------------------------------------slabs-----------------------------------------------------------------------------
        //............apple
          SlabBlock apple_slab = foodblockregistry.APPLE_SLAB.get();
          ResourceLocation  apple_slab_texture = modLoc("block/apple_block");
          slabBlock(apple_slab, apple_slab_texture, apple_slab_texture);
        //.........potato
          SlabBlock potato_slab = foodblockregistry.POTATO_SLAB.get();
          ResourceLocation  potato_slab_texture = modLoc("block/potato_block");
          slabBlock(potato_slab, potato_slab_texture, potato_slab_texture);
        //.........beetroot
          SlabBlock beetroot_slab = foodblockregistry.BEETROOT_SLAB.get();
          ResourceLocation  beetroot_slab_texture = modLoc("block/beetroot_block");
          slabBlock(beetroot_slab, beetroot_slab_texture, beetroot_slab_texture);
        //.........carrot
          SlabBlock carrot_slab = foodblockregistry.CARROT_SLAB.get();
          ResourceLocation  carrot_slab_texture = modLoc("block/carrot_block");
          slabBlock(carrot_slab, carrot_slab_texture, carrot_slab_texture);
        //.........chorus
          SlabBlock chorus_slab = foodblockregistry.CHORUS_SLAB.get();
          ResourceLocation  chorus_slab_texture = modLoc("block/chorus_block");
          slabBlock(chorus_slab, chorus_slab_texture, chorus_slab_texture);
        //.........glow_berry
          SlabBlock glow_berry_slab = foodblockregistry.GLOW_BERRY_SLAB.get();
          ResourceLocation  glow_berry_slab_texture = modLoc("block/glow_berry_block");
          slabBlock(glow_berry_slab, glow_berry_slab_texture, glow_berry_slab_texture);
        //.........melon
          SlabBlock melon_slab = foodblockregistry.MELON_SLAB.get();
          ResourceLocation  melon_slab_texture = modLoc("block/melon_block");
          slabBlock(melon_slab, melon_slab_texture, melon_slab_texture);
        //.........sweet_berry
          SlabBlock sweet_berry_slab = foodblockregistry.SWEET_BERRY_SLAB.get();
          ResourceLocation  sweet_berry_slab_texture = modLoc("block/sweet_berry_block");
          slabBlock(sweet_berry_slab, sweet_berry_slab_texture, sweet_berry_slab_texture);
        //.........brown_mushroom
          SlabBlock brown_mushroom_slab = foodblockregistry.BROWN_MUSHROOM_SLAB.get();
          ResourceLocation  brown_mushroom_slab_texture = modLoc("block/brown_mushroom_block");
          slabBlock(brown_mushroom_slab, brown_mushroom_slab_texture, brown_mushroom_slab_texture);
        //.........red_mushroom
          SlabBlock red_mushroom_slab = foodblockregistry.RED_MUSHROOM_SLAB.get();
          ResourceLocation  red_mushroom_slab_texture = modLoc("block/red_mushroom_block");
          slabBlock(red_mushroom_slab, red_mushroom_slab_texture, red_mushroom_slab_texture);
        //.........pumpkin
          SlabBlock pumpkin_slab = foodblockregistry.PUMPKIN_SLAB.get();
          ResourceLocation  pumpkin_slab_texture = modLoc("block/pumpkin_block");
          slabBlock(pumpkin_slab, pumpkin_slab_texture, pumpkin_slab_texture);
        //.........chicken
          SlabBlock chicken_slab = foodblockregistry.CHICKEN_SLAB.get();
          ResourceLocation  chicken_slab_texture = modLoc("block/chicken_block");
          slabBlock(chicken_slab, chicken_slab_texture, chicken_slab_texture);
        //.........cod
          SlabBlock cod_slab = foodblockregistry.COD_SLAB.get();
          ResourceLocation  cod_slab_texture = modLoc("block/cod_block");
          slabBlock(cod_slab, cod_slab_texture, cod_slab_texture);
        //.........salmon
          SlabBlock salmon_slab = foodblockregistry.SALMON_SLAB.get();
          ResourceLocation  salmon_slab_texture = modLoc("block/salmon_block");
          slabBlock(salmon_slab, salmon_slab_texture, salmon_slab_texture);
        //.........tropical_fish
          SlabBlock tropical_fish_slab = foodblockregistry.TROPICAL_FISH_SLAB.get();
          ResourceLocation  tropical_fish_slab_texture = modLoc("block/tropical_fish_block");
          slabBlock(tropical_fish_slab, tropical_fish_slab_texture, tropical_fish_slab_texture);
        //.........mutton
          SlabBlock mutton_slab = foodblockregistry.MUTTON_SLAB.get();
          ResourceLocation  mutton_slab_texture = modLoc("block/mutton_block");
          slabBlock(mutton_slab, mutton_slab_texture, mutton_slab_texture);
        //.........beef
          SlabBlock beef_slab = foodblockregistry.BEEF_SLAB.get();
          ResourceLocation  beef_slab_texture = modLoc("block/beef_block");
          slabBlock(beef_slab, beef_slab_texture, beef_slab_texture);
        //.........pork
          SlabBlock pork_slab = foodblockregistry.PORK_SLAB.get();
          ResourceLocation  pork_slab_texture = modLoc("block/pork_block");
          slabBlock(pork_slab, pork_slab_texture, pork_slab_texture);
        //.........rabbit
          SlabBlock rabbit_slab = foodblockregistry.RABBIT_SLAB.get();
          ResourceLocation  rabbit_slab_texture = modLoc("block/rabbit_block");
          slabBlock(rabbit_slab, rabbit_slab_texture, rabbit_slab_texture);

      //-----------------------------------------------------------------stairs-----------------------------------------------------------------------------
        //............apple
          StairBlock apple_stairs = foodblockregistry.APPLE_STAIRS.get();
          ResourceLocation  apple_stair_texture = modLoc("block/apple_block");
          stairsBlock(apple_stairs, apple_stair_texture);
        //............potato
          StairBlock potato_stairs = foodblockregistry.POTATO_STAIRS.get();
          ResourceLocation  potato_stair_texture = modLoc("block/potato_block");
          stairsBlock(potato_stairs, potato_stair_texture);
        //............beetroot
          StairBlock beetroot_stairs = foodblockregistry.BEETROOT_STAIRS.get();
          ResourceLocation  beetroot_stair_texture = modLoc("block/beetroot_block");
          stairsBlock(beetroot_stairs, beetroot_stair_texture);
        //............carrot
          StairBlock carrot_stairs = foodblockregistry.CARROT_STAIRS.get();
          ResourceLocation  carrot_stair_texture = modLoc("block/carrot_block");
          stairsBlock(carrot_stairs, carrot_stair_texture);
        //............chorus
          StairBlock chorus_stairs = foodblockregistry.CHORUS_STAIRS.get();
          ResourceLocation  chorus_stair_texture = modLoc("block/chorus_block");
          stairsBlock(chorus_stairs, chorus_stair_texture);
        //............glow_berry
          StairBlock glow_berry_stairs = foodblockregistry.GLOW_BERRY_STAIRS.get();
          ResourceLocation  glow_berry_stair_texture = modLoc("block/glow_berry_block");
          stairsBlock(glow_berry_stairs, glow_berry_stair_texture);
        //............melon
          StairBlock melon_stairs = foodblockregistry.MELON_STAIRS.get();
          ResourceLocation  melon_stair_texture = modLoc("block/melon_block");
          stairsBlock(melon_stairs, melon_stair_texture);
        //............sweet_berry
          StairBlock sweet_berry_stairs = foodblockregistry.SWEET_BERRY_STAIRS.get();
          ResourceLocation  sweet_berry_stair_texture = modLoc("block/sweet_berry_block");
          stairsBlock(sweet_berry_stairs, sweet_berry_stair_texture);
        //............brown_mushroom
          StairBlock brown_mushroom_stairs = foodblockregistry.BROWN_MUSHROOM_STAIRS.get();
          ResourceLocation  brown_mushroom_stair_texture = modLoc("block/brown_mushroom_block");
          stairsBlock(brown_mushroom_stairs, brown_mushroom_stair_texture);
        //............red_mushroom
          StairBlock red_mushroom_stairs = foodblockregistry.RED_MUSHROOM_STAIRS.get();
          ResourceLocation  red_mushroom_stair_texture = modLoc("block/red_mushroom_block");
          stairsBlock(red_mushroom_stairs, red_mushroom_stair_texture);
        //............pumpkin
          StairBlock pumpkin_stairs = foodblockregistry.PUMPKIN_STAIRS.get();
          ResourceLocation  pumpkin_stair_texture = modLoc("block/pumpkin_block");
          stairsBlock(pumpkin_stairs, pumpkin_stair_texture);
        //............chicken
          StairBlock chicken_stairs = foodblockregistry.CHICKEN_STAIRS.get();
          ResourceLocation chicken_stair_texture = modLoc("block/chicken_block");
          stairsBlock(chicken_stairs, chicken_stair_texture);
        //............cod
          StairBlock cod_stairs = foodblockregistry.COD_STAIRS.get();
          ResourceLocation cod_stair_texture = modLoc("block/cod_block");
          stairsBlock(cod_stairs, cod_stair_texture);
        //............salmon
          StairBlock salmon_stairs = foodblockregistry.SALMON_STAIRS.get();
          ResourceLocation salmon_stair_texture = modLoc("block/salmon_block");
          stairsBlock(salmon_stairs, salmon_stair_texture);
        //............tropical_fish
          StairBlock tropical_fish_stairs = foodblockregistry.TROPICAL_FISH_STAIRS.get();
          ResourceLocation tropical_fish_stair_texture = modLoc("block/tropical_fish_block");
          stairsBlock(tropical_fish_stairs, tropical_fish_stair_texture);
        //............mutton
          StairBlock mutton_stairs = foodblockregistry.MUTTON_STAIRS.get();
          ResourceLocation mutton_stair_texture = modLoc("block/mutton_block");
          stairsBlock(mutton_stairs, mutton_stair_texture);
        //............beef
          StairBlock beef_stairs = foodblockregistry.BEEF_STAIRS.get();
          ResourceLocation beef_stair_texture = modLoc("block/beef_block");
          stairsBlock(beef_stairs, beef_stair_texture);
        //............pork
          StairBlock pork_stairs = foodblockregistry.PORK_STAIRS.get();
          ResourceLocation pork_stair_texture = modLoc("block/pork_block");
          stairsBlock(pork_stairs, pork_stair_texture);
        //............rabbit
          StairBlock rabbit_stairs = foodblockregistry.RABBIT_STAIRS.get();
          ResourceLocation rabbit_stair_texture = modLoc("block/rabbit_block");
          stairsBlock(rabbit_stairs, rabbit_stair_texture);

      //---------------------------------------------------------------trapdoors-----------------------------------------------------------------------------
        //............apple
          TrapDoorBlock apple_trapdoor = foodblockregistry.APPLE_TRAPDOOR.get(); 
          ResourceLocation apple_trapdoor_texture = modLoc("block/apple_block");
          trapdoorBlockWithRenderType(apple_trapdoor, "apple_trapdoor", apple_trapdoor_texture, false, apple_trapdoor_texture);
        //............potato
          TrapDoorBlock potato_trapdoor = foodblockregistry.POTATO_TRAPDOOR.get(); 
          ResourceLocation potato_trapdoor_texture = modLoc("block/potato_block");
          trapdoorBlockWithRenderType(potato_trapdoor, "potato_trapdoor", potato_trapdoor_texture, false, potato_trapdoor_texture);
        //............beetroot
          TrapDoorBlock beetroot_trapdoor = foodblockregistry.BEETROOT_TRAPDOOR.get(); 
          ResourceLocation beetroot_trapdoor_texture = modLoc("block/beetroot_block");
          trapdoorBlockWithRenderType(beetroot_trapdoor, "beetroot_trapdoor", beetroot_trapdoor_texture, false, beetroot_trapdoor_texture);
        //............carrot
          TrapDoorBlock carrot_trapdoor = foodblockregistry.CARROT_TRAPDOOR.get(); 
          ResourceLocation carrot_trapdoor_texture = modLoc("block/carrot_block");
          trapdoorBlockWithRenderType(carrot_trapdoor, "carrot_trapdoor", carrot_trapdoor_texture, false, carrot_trapdoor_texture);
        //............chorus
          TrapDoorBlock chorus_trapdoor = foodblockregistry.CHORUS_TRAPDOOR.get(); 
          ResourceLocation chorus_trapdoor_texture = modLoc("block/chorus_block");
          trapdoorBlockWithRenderType(chorus_trapdoor, "chorus_trapdoor", chorus_trapdoor_texture, false, chorus_trapdoor_texture);
        //............glow_berry
          TrapDoorBlock glow_berry_trapdoor = foodblockregistry.GLOW_BERRY_TRAPDOOR.get(); 
          ResourceLocation glow_berry_trapdoor_texture = modLoc("block/glow_berry_block");
          trapdoorBlockWithRenderType(glow_berry_trapdoor, "glow_berry_trapdoor", glow_berry_trapdoor_texture, false, glow_berry_trapdoor_texture);
        //............melon
          TrapDoorBlock melon_trapdoor = foodblockregistry.MELON_TRAPDOOR.get(); 
          ResourceLocation melon_trapdoor_texture = modLoc("block/melon_block");
          trapdoorBlockWithRenderType(melon_trapdoor, "melon_trapdoor", melon_trapdoor_texture, false, melon_trapdoor_texture);
        //............sweet_berry
          TrapDoorBlock sweet_berry_trapdoor = foodblockregistry.SWEET_BERRY_TRAPDOOR.get(); 
          ResourceLocation sweet_berry_trapdoor_texture = modLoc("block/sweet_berry_block");
          trapdoorBlockWithRenderType(sweet_berry_trapdoor, "sweet_berry_trapdoor", sweet_berry_trapdoor_texture, false, sweet_berry_trapdoor_texture);
        //............brown_mushroom
          TrapDoorBlock brown_mushroom_trapdoor = foodblockregistry.BROWN_MUSHROOM_TRAPDOOR.get(); 
          ResourceLocation brown_mushroom_trapdoor_texture = modLoc("block/brown_mushroom_block");
          trapdoorBlockWithRenderType(brown_mushroom_trapdoor, "brown_mushroom_trapdoor", brown_mushroom_trapdoor_texture, false, brown_mushroom_trapdoor_texture);
        //............red_mushroom
          TrapDoorBlock red_mushroom_trapdoor = foodblockregistry.RED_MUSHROOM_TRAPDOOR.get(); 
          ResourceLocation red_mushroom_trapdoor_texture = modLoc("block/red_mushroom_block");
          trapdoorBlockWithRenderType(red_mushroom_trapdoor, "red_mushroom_trapdoor", red_mushroom_trapdoor_texture, false, red_mushroom_trapdoor_texture);
        //............pumpkin
          TrapDoorBlock pumpkin_trapdoor = foodblockregistry.PUMPKIN_TRAPDOOR.get(); 
          ResourceLocation pumpkin_trapdoor_texture = modLoc("block/pumpkin_block");
          trapdoorBlockWithRenderType(pumpkin_trapdoor, "pumpkin_trapdoor", pumpkin_trapdoor_texture, false, pumpkin_trapdoor_texture);
        //............chicken
          TrapDoorBlock chicken_trapdoor = foodblockregistry.CHICKEN_TRAPDOOR.get(); 
          ResourceLocation chicken_trapdoor_texture = modLoc("block/chicken_block");
          trapdoorBlockWithRenderType(chicken_trapdoor, "chicken_trapdoor", chicken_trapdoor_texture, false, chicken_trapdoor_texture);
        //............cod
          TrapDoorBlock cod_trapdoor = foodblockregistry.COD_TRAPDOOR.get(); 
          ResourceLocation cod_trapdoor_texture = modLoc("block/cod_block");
          trapdoorBlockWithRenderType(cod_trapdoor, "cod_trapdoor", cod_trapdoor_texture, false, cod_trapdoor_texture);
        //............salmon
          TrapDoorBlock salmon_trapdoor = foodblockregistry.SALMON_TRAPDOOR.get(); 
          ResourceLocation salmon_trapdoor_texture = modLoc("block/salmon_block");
          trapdoorBlockWithRenderType(salmon_trapdoor, "salmon_trapdoor", salmon_trapdoor_texture, false, salmon_trapdoor_texture);
        //............tropical_fish
          TrapDoorBlock tropical_fish_trapdoor = foodblockregistry.TROPICAL_FISH_TRAPDOOR.get(); 
          ResourceLocation tropical_fish_trapdoor_texture = modLoc("block/tropical_fish_block");
          trapdoorBlockWithRenderType(tropical_fish_trapdoor, "tropical_fish_trapdoor", tropical_fish_trapdoor_texture, false, tropical_fish_trapdoor_texture);
        //............mutton
          TrapDoorBlock mutton_trapdoor = foodblockregistry.MUTTON_TRAPDOOR.get(); 
          ResourceLocation mutton_trapdoor_texture = modLoc("block/mutton_block");
          trapdoorBlockWithRenderType(mutton_trapdoor, "mutton_trapdoor", mutton_trapdoor_texture, false, mutton_trapdoor_texture);
        //............beef
          TrapDoorBlock beef_trapdoor = foodblockregistry.BEEF_TRAPDOOR.get(); 
          ResourceLocation beef_trapdoor_texture = modLoc("block/beef_block");
          trapdoorBlockWithRenderType(beef_trapdoor, "beef_trapdoor", beef_trapdoor_texture, false, beef_trapdoor_texture);
        //............pork
          TrapDoorBlock pork_trapdoor = foodblockregistry.PORK_TRAPDOOR.get(); 
          ResourceLocation pork_trapdoor_texture = modLoc("block/pork_block");
          trapdoorBlockWithRenderType(pork_trapdoor, "pork_trapdoor", pork_trapdoor_texture, false, pork_trapdoor_texture);
        //............rabbit
          TrapDoorBlock rabbit_trapdoor = foodblockregistry.RABBIT_TRAPDOOR.get(); 
          ResourceLocation rabbit_trapdoor_texture = modLoc("block/rabbit_block");
          trapdoorBlockWithRenderType(rabbit_trapdoor, "rabbit_trapdoor", rabbit_trapdoor_texture, false, rabbit_trapdoor_texture);

      //------------------------------------------------------------------bars-----------------------------------------------------------------------------
        //............apple
          IronBarsBlock apple_bars = foodblockregistry.APPLE_BARS.get(); 
          ResourceLocation apple_bars_texture = modLoc("block/apple_bars");
          ResourceLocation apple_bars_rim_texture = modLoc("block/apple_block");
          paneBlockWithRenderType(apple_bars, "apple_bars", apple_bars_texture, apple_bars_rim_texture, "cutout_mipped_all");    
        //............potato
          IronBarsBlock potato_bars = foodblockregistry.POTATO_BARS.get(); 
          ResourceLocation potato_bars_texture = modLoc("block/potato_bars");
          ResourceLocation potato_bars_rim_texture = modLoc("block/potato_block");
          paneBlockWithRenderType(potato_bars, "potato_bars", potato_bars_texture, potato_bars_rim_texture, "cutout_mipped_all");    
        //............beetroot
          IronBarsBlock beetroot_bars = foodblockregistry.BEETROOT_BARS.get(); 
          ResourceLocation beetroot_bars_texture = modLoc("block/beetroot_bars");
          ResourceLocation beetroot_bars_rim_texture = modLoc("block/beetroot_block");
          paneBlockWithRenderType(beetroot_bars, "beetroot_bars", beetroot_bars_texture, beetroot_bars_rim_texture, "cutout_mipped_all");    
        //............carrot
          IronBarsBlock carrot_bars = foodblockregistry.CARROT_BARS.get(); 
          ResourceLocation carrot_bars_texture = modLoc("block/carrot_bars");
          ResourceLocation carrot_bars_rim_texture = modLoc("block/carrot_block");
          paneBlockWithRenderType(carrot_bars, "carrot_bars", carrot_bars_texture, carrot_bars_rim_texture, "cutout_mipped_all");    
        //............chorus
          IronBarsBlock chorus_bars = foodblockregistry.CHORUS_BARS.get(); 
          ResourceLocation chorus_bars_texture = modLoc("block/chorus_bars");
          ResourceLocation chorus_bars_rim_texture = modLoc("block/chorus_block");
          paneBlockWithRenderType(chorus_bars, "chorus_bars", chorus_bars_texture, chorus_bars_rim_texture, "cutout_mipped_all");    
        //............glow_berry
          IronBarsBlock glow_berry_bars = foodblockregistry.GLOW_BERRY_BARS.get(); 
          ResourceLocation glow_berry_bars_texture = modLoc("block/glow_berry_bars");
          ResourceLocation glow_berry_bars_rim_texture = modLoc("block/glow_berry_block");
          paneBlockWithRenderType(glow_berry_bars, "glow_berry_bars", glow_berry_bars_texture, glow_berry_bars_rim_texture, "cutout_mipped_all");    
        //............melon
          IronBarsBlock melon_bars = foodblockregistry.MELON_BARS.get(); 
          ResourceLocation melon_bars_texture = modLoc("block/melon_bars");
          ResourceLocation melon_bars_rim_texture = modLoc("block/melon_block");
          paneBlockWithRenderType(melon_bars, "melon_bars", melon_bars_texture, melon_bars_rim_texture, "cutout_mipped_all");    
        //............sweet_berry
          IronBarsBlock sweet_berry_bars = foodblockregistry.SWEET_BERRY_BARS.get(); 
          ResourceLocation sweet_berry_bars_texture = modLoc("block/sweet_berry_bars");
          ResourceLocation sweet_berry_bars_rim_texture = modLoc("block/sweet_berry_block");
          paneBlockWithRenderType(sweet_berry_bars, "sweet_berry_bars", sweet_berry_bars_texture, sweet_berry_bars_rim_texture, "cutout_mipped_all");    
        //............brown_mushroom
          IronBarsBlock brown_mushroom_bars = foodblockregistry.BROWN_MUSHROOM_BARS.get(); 
          ResourceLocation brown_mushroom_bars_texture = modLoc("block/brown_mushroom_bars");
          ResourceLocation brown_mushroom_bars_rim_texture = modLoc("block/brown_mushroom_block");
          paneBlockWithRenderType(brown_mushroom_bars, "brown_mushroom_bars", brown_mushroom_bars_texture, brown_mushroom_bars_rim_texture, "cutout_mipped_all");    
        //............red_mushroom
          IronBarsBlock red_mushroom_bars = foodblockregistry.RED_MUSHROOM_BARS.get(); 
          ResourceLocation red_mushroom_bars_texture = modLoc("block/red_mushroom_bars");
          ResourceLocation red_mushroom_bars_rim_texture = modLoc("block/red_mushroom_block");
          paneBlockWithRenderType(red_mushroom_bars, "red_mushroom_bars", red_mushroom_bars_texture, red_mushroom_bars_rim_texture, "cutout_mipped_all");    
        //............pumpkin
          IronBarsBlock pumpkin_bars = foodblockregistry.PUMPKIN_BARS.get(); 
          ResourceLocation pumpkin_bars_texture = modLoc("block/pumpkin_bars");
          ResourceLocation pumpkin_bars_rim_texture = modLoc("block/pumpkin_block");
          paneBlockWithRenderType(pumpkin_bars, "pumpkin_bars", pumpkin_bars_texture, pumpkin_bars_rim_texture, "cutout_mipped_all");    
        //............chicken
          IronBarsBlock chicken_bars = foodblockregistry.CHICKEN_BARS.get(); 
          ResourceLocation chicken_bars_texture = modLoc("block/chicken_bars");
          ResourceLocation chicken_bars_rim_texture = modLoc("block/chicken_block");
          paneBlockWithRenderType(chicken_bars, "chicken_bars", chicken_bars_texture, chicken_bars_rim_texture, "cutout_mipped_all");    
        //............cod
          IronBarsBlock cod_bars = foodblockregistry.COD_BARS.get(); 
          ResourceLocation cod_bars_texture = modLoc("block/cod_bars");
          ResourceLocation cod_bars_rim_texture = modLoc("block/cod_block");
          paneBlockWithRenderType(cod_bars, "cod_bars", cod_bars_texture, cod_bars_rim_texture, "cutout_mipped_all");    
        //............salmon
          IronBarsBlock salmon_bars = foodblockregistry.SALMON_BARS.get(); 
          ResourceLocation salmon_bars_texture = modLoc("block/salmon_bars");
          ResourceLocation salmon_bars_rim_texture = modLoc("block/salmon_block");
          paneBlockWithRenderType(salmon_bars, "salmon_bars", salmon_bars_texture, salmon_bars_rim_texture, "cutout_mipped_all");    
        //............tropical_fish
          IronBarsBlock tropical_fish_bars = foodblockregistry.TROPICAL_FISH_BARS.get(); 
          ResourceLocation tropical_fish_bars_texture = modLoc("block/tropical_fish_bars");
          ResourceLocation tropical_fish_bars_rim_texture = modLoc("block/tropical_fish_block");
          paneBlockWithRenderType(tropical_fish_bars, "tropical_fish_bars", tropical_fish_bars_texture, tropical_fish_bars_rim_texture, "cutout_mipped_all");    
        //............mutton
          IronBarsBlock mutton_bars = foodblockregistry.MUTTON_BARS.get(); 
          ResourceLocation mutton_bars_texture = modLoc("block/mutton_bars");
          ResourceLocation mutton_bars_rim_texture = modLoc("block/mutton_block");
          paneBlockWithRenderType(mutton_bars, "mutton_bars", mutton_bars_texture, mutton_bars_rim_texture, "cutout_mipped_all");    
        //............beef
          IronBarsBlock beef_bars = foodblockregistry.BEEF_BARS.get(); 
          ResourceLocation beef_bars_texture = modLoc("block/beef_bars");
          ResourceLocation beef_bars_rim_texture = modLoc("block/beef_block");
          paneBlockWithRenderType(beef_bars, "beef_bars", beef_bars_texture, beef_bars_rim_texture, "cutout_mipped_all");    
        //............pork
          IronBarsBlock pork_bars = foodblockregistry.PORK_BARS.get(); 
          ResourceLocation pork_bars_texture = modLoc("block/pork_bars");
          ResourceLocation pork_bars_rim_texture = modLoc("block/pork_block");
          paneBlockWithRenderType(pork_bars, "pork_bars", pork_bars_texture, pork_bars_rim_texture, "cutout_mipped_all");    
        //............rabbit
          IronBarsBlock rabbit_bars = foodblockregistry.RABBIT_BARS.get(); 
          ResourceLocation rabbit_bars_texture = modLoc("block/rabbit_bars");
          ResourceLocation rabbit_bars_rim_texture = modLoc("block/rabbit_block");
          paneBlockWithRenderType(rabbit_bars, "rabbit_bars", rabbit_bars_texture, rabbit_bars_rim_texture, "cutout_mipped_all");    

      //-----------------------------------------------------------------lamps-----------------------------------------------------------------------------
        //............apple
          net.minecraft.world.level.block.Block apple_lamp = foodblockregistry.APPLE_LAMP.get();
          ResourceLocation apple_lamp_texture = modLoc("block/apple_lamp");
          simpleBlock(apple_lamp);
        //............potato
          net.minecraft.world.level.block.Block potato_lamp = foodblockregistry.POTATO_LAMP.get();
          ResourceLocation potato_lamp_texture = modLoc("block/potato_lamp");
          simpleBlock(potato_lamp);
        //............beetroot
          net.minecraft.world.level.block.Block beetroot_lamp = foodblockregistry.BEETROOT_LAMP.get();
          ResourceLocation beetroot_lamp_texture = modLoc("block/beetroot_lamp");
          simpleBlock(beetroot_lamp);
        //............carrot
          net.minecraft.world.level.block.Block carrot_lamp = foodblockregistry.CARROT_LAMP.get();
          ResourceLocation carrot_lamp_texture = modLoc("block/carrot_lamp");
          simpleBlock(carrot_lamp);
        //............chorus
          net.minecraft.world.level.block.Block chorus_lamp = foodblockregistry.CHORUS_LAMP.get();
          ResourceLocation chorus_lamp_texture = modLoc("block/chorus_lamp");
          ResourceLocation chorus_lamp_top_texture = modLoc("block/chorus_block");
          horizontalBlock(chorus_lamp, chorus_lamp_texture, chorus_lamp_texture, chorus_lamp_top_texture);
        //............glow_berry
          net.minecraft.world.level.block.Block glow_berry_lamp = foodblockregistry.GLOW_BERRY_LAMP.get();
          ResourceLocation glow_berry_lamp_texture = modLoc("block/glow_berry_lamp");
          simpleBlock(glow_berry_lamp);
        //............melon
          net.minecraft.world.level.block.Block melon_lamp = foodblockregistry.MELON_LAMP.get();
          ResourceLocation melon_lamp_texture = modLoc("block/melon_lamp");
          simpleBlock(melon_lamp);
        //............sweet_berry
          net.minecraft.world.level.block.Block sweet_berry_lamp = foodblockregistry.SWEET_BERRY_LAMP.get();
          ResourceLocation sweet_berry_lamp_texture = modLoc("block/sweet_berry_lamp");
          simpleBlock(sweet_berry_lamp);
        //............brown_mushroom
          net.minecraft.world.level.block.Block brown_mushroom_lamp = foodblockregistry.BROWN_MUSHROOM_LAMP.get();
          ResourceLocation brown_mushroom_lamp_texture = modLoc("block/brown_mushroom_lamp");
          simpleBlock(brown_mushroom_lamp);
        //............red_mushroom
          net.minecraft.world.level.block.Block red_mushroom_lamp = foodblockregistry.RED_MUSHROOM_LAMP.get();
          ResourceLocation red_mushroom_lamp_texture = modLoc("block/red_mushroom_lamp");
          simpleBlock(red_mushroom_lamp);
        //............pumpkin
          net.minecraft.world.level.block.Block pumpkin_lamp = foodblockregistry.PUMPKIN_LAMP.get();
          ResourceLocation pumpkin_lamp_texture = modLoc("block/pumpkin_lamp");
          ResourceLocation pumpkin_lamp_top_texture = modLoc("block/pumpkin_block");
          horizontalBlock(pumpkin_lamp, pumpkin_lamp_texture, pumpkin_lamp_texture, pumpkin_lamp_top_texture);
        //............chicken
          net.minecraft.world.level.block.Block chicken_lamp = foodblockregistry.CHICKEN_LAMP.get();
          ResourceLocation chicken_lamp_texture = modLoc("block/chicken_lamp");
          simpleBlock(chicken_lamp);
        //............cod
          net.minecraft.world.level.block.Block cod_lamp = foodblockregistry.COD_LAMP.get();
          ResourceLocation cod_lamp_texture = modLoc("block/cod_lamp");
          ResourceLocation cod_lamp_top_texture = modLoc("block/cod_lamp_top");
          horizontalBlock(cod_lamp, cod_lamp_texture, cod_lamp_texture, cod_lamp_top_texture);
        //............salmon
          net.minecraft.world.level.block.Block salmon_lamp = foodblockregistry.SALMON_LAMP.get();
          ResourceLocation salmon_lamp_side_texture = modLoc("block/salmon_lamp");
          ResourceLocation salmon_lamp_top_texture = modLoc("block/salmon_block");
          ResourceLocation salmon_lamp_bottom_texture = modLoc("block/glow_berry_block");

          BlockModelBuilder model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(salmon_lamp).getPath(), mcLoc("block/cube_bottom_top"))
              .texture("side", salmon_lamp_side_texture)
              .texture("top", salmon_lamp_top_texture)
              .texture("bottom", salmon_lamp_bottom_texture);

          simpleBlock(salmon_lamp, new ModelFile.UncheckedModelFile(model.getLocation()));
        //............tropical_fish
          net.minecraft.world.level.block.Block tropical_fish_lamp = foodblockregistry.TROPICAL_FISH_LAMP.get();
          ResourceLocation tropical_fish_lamp_texture = modLoc("block/tropical_fish_lamp");
          ResourceLocation tropical_fish_lamp_top_texture = modLoc("block/tropical_fish_lamp_top");
          horizontalBlock(tropical_fish_lamp, tropical_fish_lamp_texture, tropical_fish_lamp_texture, tropical_fish_lamp_top_texture);
        //............mutton
          net.minecraft.world.level.block.Block mutton_lamp = foodblockregistry.MUTTON_LAMP.get();
          ResourceLocation mutton_lamp_texture = modLoc("block/mutton_lamp");
          ResourceLocation mutton_lamp_top_texture = modLoc("block/mutton_lamp_top");
          horizontalBlock(mutton_lamp, mutton_lamp_texture, mutton_lamp_texture, mutton_lamp_top_texture);
        //............beef
          net.minecraft.world.level.block.Block beef_lamp = foodblockregistry.BEEF_LAMP.get();
          ResourceLocation beef_lamp_texture = modLoc("block/beef_lamp");
          ResourceLocation beef_lamp_top_texture = modLoc("block/beef_lamp_top");
          horizontalBlock(beef_lamp, beef_lamp_texture, beef_lamp_texture, beef_lamp_top_texture);
        //............pork
          net.minecraft.world.level.block.Block pork_lamp = foodblockregistry.PORK_LAMP.get();
          ResourceLocation pork_lamp_texture = modLoc("block/pork_lamp");
          ResourceLocation pork_lamp_top_texture = modLoc("block/pork_lamp_top");
          horizontalBlock(pork_lamp, pork_lamp_texture, pork_lamp_texture, pork_lamp_top_texture);
        //............rabbit
          net.minecraft.world.level.block.Block rabbit_lamp = foodblockregistry.RABBIT_LAMP.get();
          ResourceLocation rabbit_lamp_texture = modLoc("block/rabbit_lamp");
          ResourceLocation rabbit_lamp_top_texture = modLoc("block/rabbit_lamp_top");
          horizontalBlock(rabbit_lamp, rabbit_lamp_texture, rabbit_lamp_texture, rabbit_lamp_top_texture);

      //-----------------------------------------------------------------carpets-----------------------------------------------------------------------------
        //.............apple
          CarpetBlock apple_carpet = foodblockregistry.APPLE_CARPET.get();
          ResourceLocation apple_carpet_texture = modLoc("block/apple_carpet");
          BlockModelBuilder apple_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(apple_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", apple_carpet_texture);
          simpleBlock(apple_carpet, new ModelFile.UncheckedModelFile(apple_carpet_model.getLocation()));
        //.............potato
          CarpetBlock potato_carpet = foodblockregistry.POTATO_CARPET.get();
          ResourceLocation potato_carpet_texture = modLoc("block/potato_carpet");
          BlockModelBuilder potato_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(potato_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", potato_carpet_texture);
          simpleBlock(potato_carpet, new ModelFile.UncheckedModelFile(potato_carpet_model.getLocation()));
        //.............beetroot
          CarpetBlock beetroot_carpet = foodblockregistry.BEETROOT_CARPET.get();
          ResourceLocation beetroot_carpet_texture = modLoc("block/beetroot_carpet");
          BlockModelBuilder beetroot_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(beetroot_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", beetroot_carpet_texture);
          simpleBlock(beetroot_carpet, new ModelFile.UncheckedModelFile(beetroot_carpet_model.getLocation()));
        //.............carrot
          CarpetBlock carrot_carpet = foodblockregistry.CARROT_CARPET.get();
          ResourceLocation carrot_carpet_texture = modLoc("block/carrot_carpet");
          BlockModelBuilder carrot_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(carrot_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", carrot_carpet_texture);
          simpleBlock(carrot_carpet, new ModelFile.UncheckedModelFile(carrot_carpet_model.getLocation()));
        //.............chorus
          CarpetBlock chorus_carpet = foodblockregistry.CHORUS_CARPET.get();
          ResourceLocation chorus_carpet_texture = modLoc("block/chorus_carpet");
          BlockModelBuilder chorus_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(chorus_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", chorus_carpet_texture);
          simpleBlock(chorus_carpet, new ModelFile.UncheckedModelFile(chorus_carpet_model.getLocation()));
        //.............glow_berry
          CarpetBlock glow_berry_carpet = foodblockregistry.GLOW_BERRY_CARPET.get();
          ResourceLocation glow_berry_carpet_texture = modLoc("block/glow_berry_carpet");
          BlockModelBuilder glow_berry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(glow_berry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", glow_berry_carpet_texture);
          simpleBlock(glow_berry_carpet, new ModelFile.UncheckedModelFile(glow_berry_carpet_model.getLocation()));
        //.............melon
          CarpetBlock melon_carpet = foodblockregistry.MELON_CARPET.get();
          ResourceLocation melon_carpet_texture = modLoc("block/melon_carpet");
          BlockModelBuilder melon_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(melon_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", melon_carpet_texture);
          simpleBlock(melon_carpet, new ModelFile.UncheckedModelFile(melon_carpet_model.getLocation()));
        //.............sweet_berry
          CarpetBlock sweet_berry_carpet = foodblockregistry.SWEET_BERRY_CARPET.get();
          ResourceLocation sweet_berry_carpet_texture = modLoc("block/sweet_berry_carpet");
          BlockModelBuilder sweet_berry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(sweet_berry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", sweet_berry_carpet_texture);
          simpleBlock(sweet_berry_carpet, new ModelFile.UncheckedModelFile(sweet_berry_carpet_model.getLocation()));
        //.............brown_mushroom
          CarpetBlock brown_mushroom_carpet = foodblockregistry.BROWN_MUSHROOM_CARPET.get();
          ResourceLocation brown_mushroom_carpet_texture = modLoc("block/brown_mushroom_carpet");
          BlockModelBuilder brown_mushroom_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(brown_mushroom_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", brown_mushroom_carpet_texture);
          simpleBlock(brown_mushroom_carpet, new ModelFile.UncheckedModelFile(brown_mushroom_carpet_model.getLocation()));
        //.............red_mushroom
          CarpetBlock red_mushroom_carpet = foodblockregistry.RED_MUSHROOM_CARPET.get();
          ResourceLocation red_mushroom_carpet_texture = modLoc("block/red_mushroom_carpet");
          BlockModelBuilder red_mushroom_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(red_mushroom_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", red_mushroom_carpet_texture);
          simpleBlock(red_mushroom_carpet, new ModelFile.UncheckedModelFile(red_mushroom_carpet_model.getLocation()));
        //.............pumpkin
          CarpetBlock pumpkin_carpet = foodblockregistry.PUMPKIN_CARPET.get();
          ResourceLocation pumpkin_carpet_texture = modLoc("block/pumpkin_carpet");
          BlockModelBuilder pumpkin_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(pumpkin_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", pumpkin_carpet_texture);
          simpleBlock(pumpkin_carpet, new ModelFile.UncheckedModelFile(pumpkin_carpet_model.getLocation()));
        //.............chicken
          CarpetBlock chicken_carpet = foodblockregistry.CHICKEN_CARPET.get();
          ResourceLocation chicken_carpet_texture = modLoc("block/chicken_carpet");
          BlockModelBuilder chicken_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(chicken_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", chicken_carpet_texture);
          simpleBlock(chicken_carpet, new ModelFile.UncheckedModelFile(chicken_carpet_model.getLocation()));
        //.............cod
          CarpetBlock cod_carpet = foodblockregistry.COD_CARPET.get();
          ResourceLocation cod_carpet_texture = modLoc("block/cod_carpet");
          BlockModelBuilder cod_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(cod_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", cod_carpet_texture);
          simpleBlock(cod_carpet, new ModelFile.UncheckedModelFile(cod_carpet_model.getLocation()));
        //.............salmon
          CarpetBlock salmon_carpet = foodblockregistry.SALMON_CARPET.get();
          ResourceLocation salmon_carpet_texture = modLoc("block/salmon_carpet");
          BlockModelBuilder salmon_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(salmon_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", salmon_carpet_texture);
          simpleBlock(salmon_carpet, new ModelFile.UncheckedModelFile(salmon_carpet_model.getLocation()));
        //.............tropical_fish
          CarpetBlock tropical_fish_carpet = foodblockregistry.TROPICAL_FISH_CARPET.get();
          ResourceLocation tropical_fish_carpet_texture = modLoc("block/tropical_fish_carpet");
          BlockModelBuilder tropical_fish_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(tropical_fish_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", tropical_fish_carpet_texture);
          simpleBlock(tropical_fish_carpet, new ModelFile.UncheckedModelFile(tropical_fish_carpet_model.getLocation()));
        //.............mutton
          CarpetBlock mutton_carpet = foodblockregistry.MUTTON_CARPET.get();
          ResourceLocation mutton_carpet_texture = modLoc("block/mutton_carpet");
          BlockModelBuilder mutton_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(mutton_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", mutton_carpet_texture);
          simpleBlock(mutton_carpet, new ModelFile.UncheckedModelFile(mutton_carpet_model.getLocation()));
        //.............beef
          CarpetBlock beef_carpet = foodblockregistry.BEEF_CARPET.get();
          ResourceLocation beef_carpet_texture = modLoc("block/beef_carpet");
          BlockModelBuilder beef_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(beef_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", beef_carpet_texture);
          simpleBlock(beef_carpet, new ModelFile.UncheckedModelFile(beef_carpet_model.getLocation()));
        //.............pork
          CarpetBlock pork_carpet = foodblockregistry.PORK_CARPET.get();
          ResourceLocation pork_carpet_texture = modLoc("block/pork_carpet");
          BlockModelBuilder pork_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(pork_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", pork_carpet_texture);
          simpleBlock(pork_carpet, new ModelFile.UncheckedModelFile(pork_carpet_model.getLocation()));
        //.............rabbit
          CarpetBlock rabbit_carpet = foodblockregistry.RABBIT_CARPET.get();
          ResourceLocation rabbit_carpet_texture = modLoc("block/rabbit_carpet");
          BlockModelBuilder rabbit_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(rabbit_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", rabbit_carpet_texture);
          simpleBlock(rabbit_carpet, new ModelFile.UncheckedModelFile(rabbit_carpet_model.getLocation()));
}}
    
