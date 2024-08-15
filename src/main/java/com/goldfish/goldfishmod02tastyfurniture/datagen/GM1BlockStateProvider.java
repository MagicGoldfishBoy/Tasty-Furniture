package com.goldfish.goldfishmod02tastyfurniture.datagen;

import net.minecraft.data.BlockFamily;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
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
        ButtonBlock apple_button = foodblockregistry.APPLE_BUTTON.get();
        ResourceLocation apple_button_texture = modLoc("block/apple_block");

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
        
        //buttons
        buttonBlock(apple_button, apple_button_texture);
}}
    
