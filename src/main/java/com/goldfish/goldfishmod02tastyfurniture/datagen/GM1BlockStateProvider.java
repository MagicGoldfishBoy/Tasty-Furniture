package com.goldfish.goldfishmod02tastyfurniture.datagen;

import net.minecraft.data.BlockFamily;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelBuilder;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
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
}}
    
