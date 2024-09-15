package com.goldfish.goldfishmod02tastyfurniture.datagen;

import net.minecraft.data.BlockFamily;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TorchBlock;
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
import net.neoforged.neoforge.client.model.generators.ModelFile.UncheckedModelFile;
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
import net.minecraft.core.Direction;
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
import com.goldfish.goldfishmod02tastyfurniture.datagen.Custom_Datagen_Methods.DataGenHelper;

public class GM1BlockStateProvider extends BlockStateProvider 
{

     private final PackOutput output;
     private final ExistingFileHelper existingFileHelper;

     public GM1BlockStateProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
         super(output, "goldfishmod02tastyfurniture", existingFileHelper);
         this.output = output;
         this.existingFileHelper = existingFileHelper;
     }

     public PackOutput getOutput() {
      return output;
    }

     @Override
     public void registerStatesAndModels() {
       // ModelFile apple_button_model = models().withExistingParent("door_bottom_left", "minecraft:block/door_bottom_left");

    //----------------------------------------------------------------blocks------------------------------------------------------------------------------
     //____________________________________________________________bricks_____________________________________________________________________
      //.........apple
          net.minecraft.world.level.block.Block apple_bricks_block = foodblockregistry.APPLE_BRICKS_BLOCK.get();
          ResourceLocation apple_bricks_texture = modLoc("block/apple_bricks_block");
          simpleBlock(apple_bricks_block);
      //.........potato
          net.minecraft.world.level.block.Block potato_bricks_block = foodblockregistry.POTATO_BRICKS_BLOCK.get();
          ResourceLocation potato_bricks_texture = modLoc("block/potato_bricks_block");
          simpleBlock(potato_bricks_block);
      //.........beetroot
          net.minecraft.world.level.block.Block beetroot_bricks_block = foodblockregistry.BEETROOT_BRICKS_BLOCK.get();
          ResourceLocation beetroot_bricks_texture = modLoc("block/beetroot_bricks_block");
          simpleBlock(beetroot_bricks_block);
      //.........carrot
          net.minecraft.world.level.block.Block carrot_bricks_block = foodblockregistry.CARROT_BRICKS_BLOCK.get();
          ResourceLocation carrot_bricks_texture = modLoc("block/carrot_bricks_block");
          simpleBlock(carrot_bricks_block);
      //.........chorus
          net.minecraft.world.level.block.Block chorus_bricks_block = foodblockregistry.CHORUS_BRICKS_BLOCK.get();
          ResourceLocation chorus_bricks_texture = modLoc("block/chorus_bricks_block");
          simpleBlock(chorus_bricks_block);
      //.........glow_berry
          net.minecraft.world.level.block.Block glow_berry_bricks_block = foodblockregistry.GLOW_BERRY_BRICKS_BLOCK.get();
          ResourceLocation glow_berry_bricks_texture = modLoc("block/glow_berry_bricks_block");
          simpleBlock(glow_berry_bricks_block);
      //.........melon
          net.minecraft.world.level.block.Block melon_bricks_block = foodblockregistry.MELON_BRICKS_BLOCK.get();
          ResourceLocation melon_bricks_texture = modLoc("block/melon_bricks_block");
          simpleBlock(melon_bricks_block);
      //.........sweet_berry
          net.minecraft.world.level.block.Block sweet_berry_bricks_block = foodblockregistry.SWEET_BERRY_BRICKS_BLOCK.get();
          ResourceLocation sweet_berry_bricks_texture = modLoc("block/sweet_berry_bricks_block");
          simpleBlock(sweet_berry_bricks_block);
      //.........brown_mushroom
          net.minecraft.world.level.block.Block brown_mushroom_bricks_block = foodblockregistry.BROWN_MUSHROOM_BRICKS_BLOCK.get();
          ResourceLocation brown_mushroom_bricks_texture = modLoc("block/brown_mushroom_bricks_block");
          simpleBlock(brown_mushroom_bricks_block);
      //.........red_mushroom
          net.minecraft.world.level.block.Block red_mushroom_bricks_block = foodblockregistry.RED_MUSHROOM_BRICKS_BLOCK.get();
          ResourceLocation red_mushroom_bricks_texture = modLoc("block/red_mushroom_bricks_block");
          simpleBlock(red_mushroom_bricks_block);
      //.........pumpkin
          net.minecraft.world.level.block.Block pumpkin_bricks_block = foodblockregistry.PUMPKIN_BRICKS_BLOCK.get();
          ResourceLocation pumpkin_bricks_texture = modLoc("block/pumpkin_bricks_block");
          simpleBlock(pumpkin_bricks_block);
      //.........chicken
          net.minecraft.world.level.block.Block chicken_bricks_block = foodblockregistry.CHICKEN_BRICKS_BLOCK.get();
          ResourceLocation chicken_bricks_texture = modLoc("block/chicken_bricks_block");
          simpleBlock(chicken_bricks_block);
      //.........cod
          net.minecraft.world.level.block.Block cod_bricks_block = foodblockregistry.COD_BRICKS_BLOCK.get();
          ResourceLocation cod_bricks_texture = modLoc("block/cod_bricks_block");
          simpleBlock(cod_bricks_block);
      //.........salmon
          net.minecraft.world.level.block.Block salmon_bricks_block = foodblockregistry.SALMON_BRICKS_BLOCK.get();
          ResourceLocation salmon_bricks_texture = modLoc("block/salmon_bricks_block");
          simpleBlock(salmon_bricks_block);
      //.........tropical_fish
          net.minecraft.world.level.block.Block tropical_fish_bricks_block = foodblockregistry.TROPICAL_FISH_BRICKS_BLOCK.get();
          ResourceLocation tropical_fish_bricks_texture = modLoc("block/tropical_fish_bricks_block");
          simpleBlock(tropical_fish_bricks_block);
      //.........mutton
          net.minecraft.world.level.block.Block mutton_bricks_block = foodblockregistry.MUTTON_BRICKS_BLOCK.get();
          ResourceLocation mutton_bricks_texture = modLoc("block/mutton_bricks_block");
          simpleBlock(mutton_bricks_block);
      //.........beef
          net.minecraft.world.level.block.Block beef_bricks_block = foodblockregistry.BEEF_BRICKS_BLOCK.get();
          ResourceLocation beef_bricks_texture = modLoc("block/beef_bricks_block");
          simpleBlock(beef_bricks_block);
      //.........pork
          net.minecraft.world.level.block.Block pork_bricks_block = foodblockregistry.PORK_BRICKS_BLOCK.get();
          ResourceLocation pork_bricks_texture = modLoc("block/pork_bricks_block");
          simpleBlock(pork_bricks_block);
      //.........rabbit
          net.minecraft.world.level.block.Block rabbit_bricks_block = foodblockregistry.RABBIT_BRICKS_BLOCK.get();
          ResourceLocation rabbit_bricks_texture = modLoc("block/rabbit_bricks_block");
          simpleBlock(rabbit_bricks_block);
     //___________________________________________________________chiseled____________________________________________________________________
      //.........apple
          net.minecraft.world.level.block.Block apple_chiseled_block = foodblockregistry.APPLE_CHISELED_BLOCK.get();
          ResourceLocation apple_chiseled_texture = modLoc("block/apple_chiseled_block");
          simpleBlock(apple_chiseled_block);
      //.........potato
          net.minecraft.world.level.block.Block potato_chiseled_block = foodblockregistry.POTATO_CHISELED_BLOCK.get();
          ResourceLocation potato_chiseled_texture = modLoc("block/potato_chiseled_block");
          simpleBlock(potato_chiseled_block);
      //.........beetroot
          net.minecraft.world.level.block.Block beetroot_chiseled_block = foodblockregistry.BEETROOT_CHISELED_BLOCK.get();
          ResourceLocation beetroot_chiseled_texture = modLoc("block/beetroot_chiseled_block");
          simpleBlock(beetroot_chiseled_block);
      //.........carrot
          net.minecraft.world.level.block.Block carrot_chiseled_block = foodblockregistry.CARROT_CHISELED_BLOCK.get();
          ResourceLocation carrot_chiseled_texture = modLoc("block/carrot_chiseled_block");
          simpleBlock(carrot_chiseled_block);
      //.........chorus
          net.minecraft.world.level.block.Block chorus_chiseled_block = foodblockregistry.CHORUS_CHISELED_BLOCK.get();
          ResourceLocation chorus_chiseled_texture = modLoc("block/chorus_chiseled_block");
          simpleBlock(chorus_chiseled_block);
      //.........glow_berry
          net.minecraft.world.level.block.Block glow_berry_chiseled_block = foodblockregistry.GLOW_BERRY_CHISELED_BLOCK.get();
          ResourceLocation glow_berry_chiseled_texture = modLoc("block/glow_berry_chiseled_block");
          simpleBlock(glow_berry_chiseled_block);
      //.........melon
          net.minecraft.world.level.block.Block melon_chiseled_block = foodblockregistry.MELON_CHISELED_BLOCK.get();
          ResourceLocation melon_chiseled_texture = modLoc("block/melon_chiseled_block");
          simpleBlock(melon_chiseled_block);
      //.........sweet_berry
          net.minecraft.world.level.block.Block sweet_berry_chiseled_block = foodblockregistry.SWEET_BERRY_CHISELED_BLOCK.get();
          ResourceLocation sweet_berry_chiseled_texture = modLoc("block/sweet_berry_chiseled_block");
          simpleBlock(sweet_berry_chiseled_block);
      //.........brown_mushroom
          net.minecraft.world.level.block.Block brown_mushroom_chiseled_block = foodblockregistry.BROWN_MUSHROOM_CHISELED_BLOCK.get();
          ResourceLocation brown_mushroom_chiseled_texture = modLoc("block/brown_mushroom_chiseled_block");
          simpleBlock(brown_mushroom_chiseled_block);
      //.........red_mushroom
          net.minecraft.world.level.block.Block red_mushroom_chiseled_block = foodblockregistry.RED_MUSHROOM_CHISELED_BLOCK.get();
          ResourceLocation red_mushroom_chiseled_texture = modLoc("block/red_mushroom_chiseled_block");
          simpleBlock(red_mushroom_chiseled_block);
      //.........pumpkin
          net.minecraft.world.level.block.Block pumpkin_chiseled_block = foodblockregistry.PUMPKIN_CHISELED_BLOCK.get();
          ResourceLocation pumpkin_chiseled_texture = modLoc("block/pumpkin_chiseled_block");
          simpleBlock(pumpkin_chiseled_block);
      //.........chicken
          net.minecraft.world.level.block.Block chicken_chiseled_block = foodblockregistry.CHICKEN_CHISELED_BLOCK.get();
          ResourceLocation chicken_chiseled_texture = modLoc("block/chicken_chiseled_block");
          simpleBlock(chicken_chiseled_block);
      //.........cod
          net.minecraft.world.level.block.Block cod_chiseled_block = foodblockregistry.COD_CHISELED_BLOCK.get();
          ResourceLocation cod_chiseled_texture = modLoc("block/cod_chiseled_block");
          simpleBlock(cod_chiseled_block);
      //.........salmon
          net.minecraft.world.level.block.Block salmon_chiseled_block = foodblockregistry.SALMON_CHISELED_BLOCK.get();
          ResourceLocation salmon_chiseled_texture = modLoc("block/salmon_chiseled_block");
          simpleBlock(salmon_chiseled_block);
      //.........tropical_fish
          net.minecraft.world.level.block.Block tropical_fish_chiseled_block = foodblockregistry.TROPICAL_FISH_CHISELED_BLOCK.get();
          ResourceLocation tropical_fish_chiseled_texture = modLoc("block/tropical_fish_chiseled_block");
          simpleBlock(tropical_fish_chiseled_block);
      //.........mutton
          net.minecraft.world.level.block.Block mutton_chiseled_block = foodblockregistry.MUTTON_CHISELED_BLOCK.get();
          ResourceLocation mutton_chiseled_texture = modLoc("block/mutton_chiseled_block");
          simpleBlock(mutton_chiseled_block);
      //.........beef
          net.minecraft.world.level.block.Block beef_chiseled_block = foodblockregistry.BEEF_CHISELED_BLOCK.get();
          ResourceLocation beef_chiseled_texture = modLoc("block/beef_chiseled_block");
          simpleBlock(beef_chiseled_block);
      //.........pork
          net.minecraft.world.level.block.Block pork_chiseled_block = foodblockregistry.PORK_CHISELED_BLOCK.get();
          ResourceLocation pork_chiseled_texture = modLoc("block/pork_chiseled_block");
          simpleBlock(pork_chiseled_block);
      //.........rabbit
          net.minecraft.world.level.block.Block rabbit_chiseled_block = foodblockregistry.RABBIT_CHISELED_BLOCK.get();
          ResourceLocation rabbit_chiseled_texture = modLoc("block/rabbit_chiseled_block");
          simpleBlock(rabbit_chiseled_block);

     //_____________________________________________________________tile____________________________________________________________________
      //.........apple
          net.minecraft.world.level.block.Block apple_tile_block = foodblockregistry.APPLE_TILE_BLOCK.get();
          ResourceLocation apple_tile_texture = modLoc("block/apple_tile_block");
          horizontalBlock(apple_tile_block, apple_tile_texture, apple_tile_texture, apple_tile_texture);
      //.........potato
          net.minecraft.world.level.block.Block potato_tile_block = foodblockregistry.POTATO_TILE_BLOCK.get();
          ResourceLocation potato_tile_texture = modLoc("block/potato_tile_block");
          horizontalBlock(potato_tile_block, potato_tile_texture, potato_tile_texture, potato_tile_texture);
      //.........beetroot
          net.minecraft.world.level.block.Block beetroot_tile_block = foodblockregistry.BEETROOT_TILE_BLOCK.get();
          ResourceLocation beetroot_tile_texture = modLoc("block/beetroot_tile_block");
          horizontalBlock(beetroot_tile_block, beetroot_tile_texture, beetroot_tile_texture, beetroot_tile_texture);
      //.........carrot
          net.minecraft.world.level.block.Block carrot_tile_block = foodblockregistry.CARROT_TILE_BLOCK.get();
          ResourceLocation carrot_tile_texture = modLoc("block/carrot_tile_block");
          horizontalBlock(carrot_tile_block, carrot_tile_texture, carrot_tile_texture, carrot_tile_texture);
      //.........chorus
          net.minecraft.world.level.block.Block chorus_tile_block = foodblockregistry.CHORUS_TILE_BLOCK.get();
          ResourceLocation chorus_tile_texture = modLoc("block/chorus_tile_block");
          horizontalBlock(chorus_tile_block, chorus_tile_texture, chorus_tile_texture, chorus_tile_texture);
      //.........glow_berry
          net.minecraft.world.level.block.Block glow_berry_tile_block = foodblockregistry.GLOW_BERRY_TILE_BLOCK.get();
          ResourceLocation glow_berry_tile_texture = modLoc("block/glow_berry_tile_block");
          horizontalBlock(glow_berry_tile_block, glow_berry_tile_texture, glow_berry_tile_texture, glow_berry_tile_texture);
      //.........melon
          net.minecraft.world.level.block.Block melon_tile_block = foodblockregistry.MELON_TILE_BLOCK.get();
          ResourceLocation melon_tile_texture = modLoc("block/melon_tile_block");
          horizontalBlock(melon_tile_block, melon_tile_texture, melon_tile_texture, melon_tile_texture);
      //.........sweet_berry
          net.minecraft.world.level.block.Block sweet_berry_tile_block = foodblockregistry.SWEET_BERRY_TILE_BLOCK.get();
          ResourceLocation sweet_berry_tile_texture = modLoc("block/sweet_berry_tile_block");
          horizontalBlock(sweet_berry_tile_block, sweet_berry_tile_texture, sweet_berry_tile_texture, sweet_berry_tile_texture);
      //.........brown_mushroom
          net.minecraft.world.level.block.Block brown_mushroom_tile_block = foodblockregistry.BROWN_MUSHROOM_TILE_BLOCK.get();
          ResourceLocation brown_mushroom_tile_texture = modLoc("block/brown_mushroom_tile_block");
          horizontalBlock(brown_mushroom_tile_block, brown_mushroom_tile_texture, brown_mushroom_tile_texture, brown_mushroom_tile_texture);
      //.........red_mushroom
          net.minecraft.world.level.block.Block red_mushroom_tile_block = foodblockregistry.RED_MUSHROOM_TILE_BLOCK.get();
          ResourceLocation red_mushroom_tile_texture = modLoc("block/red_mushroom_tile_block");
          horizontalBlock(red_mushroom_tile_block, red_mushroom_tile_texture, red_mushroom_tile_texture, red_mushroom_tile_texture);
      //.........pumpkin
          net.minecraft.world.level.block.Block pumpkin_tile_block = foodblockregistry.PUMPKIN_TILE_BLOCK.get();
          ResourceLocation pumpkin_tile_texture = modLoc("block/pumpkin_tile_block");
          horizontalBlock(pumpkin_tile_block, pumpkin_tile_texture, pumpkin_tile_texture, pumpkin_tile_texture);
      //.........chicken
          net.minecraft.world.level.block.Block chicken_tile_block = foodblockregistry.CHICKEN_TILE_BLOCK.get();
          ResourceLocation chicken_tile_texture = modLoc("block/chicken_tile_block");
          horizontalBlock(chicken_tile_block, chicken_tile_texture, chicken_tile_texture, chicken_tile_texture);
      //.........cod
          net.minecraft.world.level.block.Block cod_tile_block = foodblockregistry.COD_TILE_BLOCK.get();
          ResourceLocation cod_tile_texture = modLoc("block/cod_tile_block");
          horizontalBlock(cod_tile_block, cod_tile_texture, cod_tile_texture, cod_tile_texture);
      //.........salmon
          net.minecraft.world.level.block.Block salmon_tile_block = foodblockregistry.SALMON_TILE_BLOCK.get();
          ResourceLocation salmon_tile_texture = modLoc("block/salmon_tile_block");
          horizontalBlock(salmon_tile_block, salmon_tile_texture, salmon_tile_texture, salmon_tile_texture);
      //.........tropical_fish
          net.minecraft.world.level.block.Block tropical_fish_tile_block = foodblockregistry.TROPICAL_FISH_TILE_BLOCK.get();
          ResourceLocation tropical_fish_tile_texture = modLoc("block/tropical_fish_tile_block");
          horizontalBlock(tropical_fish_tile_block, tropical_fish_tile_texture, tropical_fish_tile_texture, tropical_fish_tile_texture);
      //.........mutton
          net.minecraft.world.level.block.Block mutton_tile_block = foodblockregistry.MUTTON_TILE_BLOCK.get();
          ResourceLocation mutton_tile_texture = modLoc("block/mutton_tile_block");
          horizontalBlock(mutton_tile_block, mutton_tile_texture, mutton_tile_texture, mutton_tile_texture);
      //.........beef
          net.minecraft.world.level.block.Block beef_tile_block = foodblockregistry.BEEF_TILE_BLOCK.get();
          ResourceLocation beef_tile_texture = modLoc("block/beef_tile_block");
          horizontalBlock(beef_tile_block, beef_tile_texture, beef_tile_texture, beef_tile_texture);
      //.........pork
          net.minecraft.world.level.block.Block pork_tile_block = foodblockregistry.PORK_TILE_BLOCK.get();
          ResourceLocation pork_tile_texture = modLoc("block/pork_tile_block");
          horizontalBlock(pork_tile_block, pork_tile_texture, pork_tile_texture, pork_tile_texture);
      //.........rabbit
          net.minecraft.world.level.block.Block rabbit_tile_block = foodblockregistry.RABBIT_TILE_BLOCK.get();
          ResourceLocation rabbit_tile_texture = modLoc("block/rabbit_tile_block");
          horizontalBlock(rabbit_tile_block, rabbit_tile_texture, rabbit_tile_texture, rabbit_tile_texture);

    //----------------------------------------------------------------doors-------------------------------------------------------------------------------
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
        
    //---------------------------------------------------------------buttons------------------------------------------------------------------------------
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
    //----------------------------------------------------------------fences------------------------------------------------------------------------------
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

    //------------------------------------------------------------pressure plates-------------------------------------------------------------------------
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

    //----------------------------------------------------------------signs-------------------------------------------------------------------------------
        //.............apple
           StandingSignBlock apple_sign = foodblockregistry.APPLE_STANDING_SIGN.get();
           WallSignBlock apple_wall_sign = foodblockregistry.APPLE_WALL_SIGN.get();
           ResourceLocation apple_sign_texture = modLoc("block/apple_block");
           signBlock(apple_sign, apple_wall_sign, apple_sign_texture);
        //.........potato
           StandingSignBlock potato_sign = foodblockregistry.POTATO_STANDING_SIGN.get();
           WallSignBlock potato_wall_sign = foodblockregistry.POTATO_WALL_SIGN.get();
           ResourceLocation potato_sign_texture = modLoc("block/potato_block");
           signBlock(potato_sign, potato_wall_sign, potato_sign_texture);
        //.........beetroot
           StandingSignBlock beetroot_sign = foodblockregistry.BEETROOT_STANDING_SIGN.get();
           WallSignBlock beetroot_wall_sign = foodblockregistry.BEETROOT_WALL_SIGN.get();
           ResourceLocation beetroot_sign_texture = modLoc("block/beetroot_block");
           signBlock(beetroot_sign, beetroot_wall_sign, beetroot_sign_texture);
        //.........carrot
           StandingSignBlock carrot_sign = foodblockregistry.CARROT_STANDING_SIGN.get();
           WallSignBlock carrot_wall_sign = foodblockregistry.CARROT_WALL_SIGN.get();
           ResourceLocation carrot_sign_texture = modLoc("block/carrot_block");
           signBlock(carrot_sign, carrot_wall_sign, carrot_sign_texture);
        //.........chorus
           StandingSignBlock chorus_sign = foodblockregistry.CHORUS_STANDING_SIGN.get();
           WallSignBlock chorus_wall_sign = foodblockregistry.CHORUS_WALL_SIGN.get();
           ResourceLocation chorus_sign_texture = modLoc("block/chorus_block");
           signBlock(chorus_sign, chorus_wall_sign, chorus_sign_texture);
        //.........glow_berry
           StandingSignBlock glowberry_sign = foodblockregistry.GLOWBERRY_STANDING_SIGN.get();
           WallSignBlock glowberry_wall_sign = foodblockregistry.GLOWBERRY_WALL_SIGN.get();
           ResourceLocation glowberry_sign_texture = modLoc("block/glow_berry_block");
           signBlock(glowberry_sign, glowberry_wall_sign, glowberry_sign_texture);
        //.........melon
           StandingSignBlock melon_sign = foodblockregistry.MELON_STANDING_SIGN.get();
           WallSignBlock melon_wall_sign = foodblockregistry.MELON_WALL_SIGN.get();
           ResourceLocation melon_sign_texture = modLoc("block/melon_block");
           signBlock(melon_sign, melon_wall_sign, melon_sign_texture);
        //.........sweet_berry
           StandingSignBlock sweetberry_sign = foodblockregistry.SWEETBERRY_STANDING_SIGN.get();
           WallSignBlock sweetberry_wall_sign = foodblockregistry.SWEETBERRY_WALL_SIGN.get();
           ResourceLocation sweetberry_sign_texture = modLoc("block/sweet_berry_block");
           signBlock(sweetberry_sign, sweetberry_wall_sign, sweetberry_sign_texture);
        //.........brown_mushroom
           StandingSignBlock brownmushroom_sign = foodblockregistry.BROWNMUSHROOM_STANDING_SIGN.get();
           WallSignBlock brownmushroom_wall_sign = foodblockregistry.BROWNMUSHROOM_WALL_SIGN.get();
           ResourceLocation brownmushroom_sign_texture = modLoc("block/brown_mushroom_block");
           signBlock(brownmushroom_sign, brownmushroom_wall_sign, brownmushroom_sign_texture);
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

    //----------------------------------------------------------------slabs-------------------------------------------------------------------------------
      //_______________________________________________________Regular Slabs_________________________________________________________________
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

      //_______________________________________________________Bricks Slabs__________________________________________________________________
        //............apple
          SlabBlock apple_bricks_slab = foodblockregistry.APPLE_BRICKS_SLAB.get();
          ResourceLocation  apple_bricks_slab_texture = modLoc("block/apple_bricks_block");
          slabBlock(apple_bricks_slab, apple_bricks_slab_texture, apple_bricks_slab_texture);
        //.........potato
          SlabBlock potato_bricks_slab = foodblockregistry.POTATO_BRICKS_SLAB.get();
          ResourceLocation  potato_bricks_slab_texture = modLoc("block/potato_bricks_block");
          slabBlock(potato_bricks_slab, potato_bricks_slab_texture, potato_bricks_slab_texture);
        //.........beetroot
          SlabBlock beetroot_bricks_slab = foodblockregistry.BEETROOT_BRICKS_SLAB.get();
          ResourceLocation  beetroot_bricks_slab_texture = modLoc("block/beetroot_bricks_block");
          slabBlock(beetroot_bricks_slab, beetroot_bricks_slab_texture, beetroot_bricks_slab_texture);
        //.........carrot
          SlabBlock carrot_bricks_slab = foodblockregistry.CARROT_BRICKS_SLAB.get();
          ResourceLocation  carrot_bricks_slab_texture = modLoc("block/carrot_bricks_block");
          slabBlock(carrot_bricks_slab, carrot_bricks_slab_texture, carrot_bricks_slab_texture);
        //.........chorus
          SlabBlock chorus_bricks_slab = foodblockregistry.CHORUS_BRICKS_SLAB.get();
          ResourceLocation  chorus_bricks_slab_texture = modLoc("block/chorus_bricks_block");
          slabBlock(chorus_bricks_slab, chorus_bricks_slab_texture, chorus_bricks_slab_texture);
        //.........glow_berry
          SlabBlock glow_berry_bricks_slab = foodblockregistry.GLOW_BERRY_BRICKS_SLAB.get();
          ResourceLocation  glow_berry_bricks_slab_texture = modLoc("block/glow_berry_bricks_block");
          slabBlock(glow_berry_bricks_slab, glow_berry_bricks_slab_texture, glow_berry_bricks_slab_texture);
        //.........melon
          SlabBlock melon_bricks_slab = foodblockregistry.MELON_BRICKS_SLAB.get();
          ResourceLocation  melon_bricks_slab_texture = modLoc("block/melon_bricks_block");
          slabBlock(melon_bricks_slab, melon_bricks_slab_texture, melon_bricks_slab_texture);
        //.........sweet_berry
          SlabBlock sweet_berry_bricks_slab = foodblockregistry.SWEET_BERRY_BRICKS_SLAB.get();
          ResourceLocation  sweet_berry_bricks_slab_texture = modLoc("block/sweet_berry_bricks_block");
          slabBlock(sweet_berry_bricks_slab, sweet_berry_bricks_slab_texture, sweet_berry_bricks_slab_texture);
        //.........brown_mushroom
          SlabBlock brown_mushroom_bricks_slab = foodblockregistry.BROWN_MUSHROOM_BRICKS_SLAB.get();
          ResourceLocation  brown_mushroom_bricks_slab_texture = modLoc("block/brown_mushroom_bricks_block");
          slabBlock(brown_mushroom_bricks_slab, brown_mushroom_bricks_slab_texture, brown_mushroom_bricks_slab_texture);
        //.........red_mushroom
          SlabBlock red_mushroom_bricks_slab = foodblockregistry.RED_MUSHROOM_BRICKS_SLAB.get();
          ResourceLocation  red_mushroom_bricks_slab_texture = modLoc("block/red_mushroom_bricks_block");
          slabBlock(red_mushroom_bricks_slab, red_mushroom_bricks_slab_texture, red_mushroom_bricks_slab_texture);
        //.........pumpkin
          SlabBlock pumpkin_bricks_slab = foodblockregistry.PUMPKIN_BRICKS_SLAB.get();
          ResourceLocation  pumpkin_bricks_slab_texture = modLoc("block/pumpkin_bricks_block");
          slabBlock(pumpkin_bricks_slab, pumpkin_bricks_slab_texture, pumpkin_bricks_slab_texture);
        //.........chicken
          SlabBlock chicken_bricks_slab = foodblockregistry.CHICKEN_BRICKS_SLAB.get();
          ResourceLocation  chicken_bricks_slab_texture = modLoc("block/chicken_bricks_block");
          slabBlock(chicken_bricks_slab, chicken_bricks_slab_texture, chicken_bricks_slab_texture);
        //.........cod
          SlabBlock cod_bricks_slab = foodblockregistry.COD_BRICKS_SLAB.get();
          ResourceLocation  cod_bricks_slab_texture = modLoc("block/cod_bricks_block");
          slabBlock(cod_bricks_slab, cod_bricks_slab_texture, cod_bricks_slab_texture);
        //.........salmon
          SlabBlock salmon_bricks_slab = foodblockregistry.SALMON_BRICKS_SLAB.get();
          ResourceLocation  salmon_bricks_slab_texture = modLoc("block/salmon_bricks_block");
          slabBlock(salmon_bricks_slab, salmon_bricks_slab_texture, salmon_bricks_slab_texture);
        //.........tropical_fish
          SlabBlock tropical_fish_bricks_slab = foodblockregistry.TROPICAL_FISH_BRICKS_SLAB.get();
          ResourceLocation  tropical_fish_bricks_slab_texture = modLoc("block/tropical_fish_bricks_block");
          slabBlock(tropical_fish_bricks_slab, tropical_fish_bricks_slab_texture, tropical_fish_bricks_slab_texture);
        //.........mutton
          SlabBlock mutton_bricks_slab = foodblockregistry.MUTTON_BRICKS_SLAB.get();
          ResourceLocation  mutton_bricks_slab_texture = modLoc("block/mutton_bricks_block");
          slabBlock(mutton_bricks_slab, mutton_bricks_slab_texture, mutton_bricks_slab_texture);
        //.........beef
          SlabBlock beef_bricks_slab = foodblockregistry.BEEF_BRICKS_SLAB.get();
          ResourceLocation  beef_bricks_slab_texture = modLoc("block/beef_bricks_block");
          slabBlock(beef_bricks_slab, beef_bricks_slab_texture, beef_bricks_slab_texture);
        //.........pork
          SlabBlock pork_bricks_slab = foodblockregistry.PORK_BRICKS_SLAB.get();
          ResourceLocation  pork_bricks_slab_texture = modLoc("block/pork_bricks_block");
          slabBlock(pork_bricks_slab, pork_bricks_slab_texture, pork_bricks_slab_texture);
        //.........rabbit
          SlabBlock rabbit_bricks_slab = foodblockregistry.RABBIT_BRICKS_SLAB.get();
          ResourceLocation  rabbit_bricks_slab_texture = modLoc("block/rabbit_bricks_block");
          slabBlock(rabbit_bricks_slab, rabbit_bricks_slab_texture, rabbit_bricks_slab_texture);

    //---------------------------------------------------------------stairs-------------------------------------------------------------------------------
      //___________________________________________________________Regular Stairs_________________________________________________________________________
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

      //___________________________________________________________Bricks Stairs__________________________________________________________________________
        //............apple
          StairBlock apple_bricks_stairs = foodblockregistry.APPLE_BRICKS_STAIRS.get();
          ResourceLocation  apple_bricks_stair_texture = modLoc("block/apple_bricks_block");
          stairsBlock(apple_bricks_stairs, apple_bricks_stair_texture);
        //............potato
          StairBlock potato_bricks_stairs = foodblockregistry.POTATO_BRICKS_STAIRS.get();
          ResourceLocation  potato_bricks_stair_texture = modLoc("block/potato_bricks_block");
          stairsBlock(potato_bricks_stairs, potato_bricks_stair_texture);
        //............beetroot
          StairBlock beetroot_bricks_stairs = foodblockregistry.BEETROOT_BRICKS_STAIRS.get();
          ResourceLocation  beetroot_bricks_stair_texture = modLoc("block/beetroot_bricks_block");
          stairsBlock(beetroot_bricks_stairs, beetroot_bricks_stair_texture);
        //............carrot
          StairBlock carrot_bricks_stairs = foodblockregistry.CARROT_BRICKS_STAIRS.get();
          ResourceLocation  carrot_bricks_stair_texture = modLoc("block/carrot_bricks_block");
          stairsBlock(carrot_bricks_stairs, carrot_bricks_stair_texture);
        //............chorus
          StairBlock chorus_bricks_stairs = foodblockregistry.CHORUS_BRICKS_STAIRS.get();
          ResourceLocation  chorus_bricks_stair_texture = modLoc("block/chorus_bricks_block");
          stairsBlock(chorus_bricks_stairs, chorus_bricks_stair_texture);
        //............glow_berry
          StairBlock glow_berry_bricks_stairs = foodblockregistry.GLOW_BERRY_BRICKS_STAIRS.get();
          ResourceLocation  glow_berry_bricks_stair_texture = modLoc("block/glow_berry_bricks_block");
          stairsBlock(glow_berry_bricks_stairs, glow_berry_bricks_stair_texture);
        //............melon
          StairBlock melon_bricks_stairs = foodblockregistry.MELON_BRICKS_STAIRS.get();
          ResourceLocation  melon_bricks_stair_texture = modLoc("block/melon_bricks_block");
          stairsBlock(melon_bricks_stairs, melon_bricks_stair_texture);
        //............sweet_berry
          StairBlock sweet_berry_bricks_stairs = foodblockregistry.SWEET_BERRY_BRICKS_STAIRS.get();
          ResourceLocation  sweet_berry_bricks_stair_texture = modLoc("block/sweet_berry_bricks_block");
          stairsBlock(sweet_berry_bricks_stairs, sweet_berry_bricks_stair_texture);
        //............brown_mushroom
          StairBlock brown_mushroom_bricks_stairs = foodblockregistry.BROWN_MUSHROOM_BRICKS_STAIRS.get();
          ResourceLocation  brown_mushroom_bricks_stair_texture = modLoc("block/brown_mushroom_bricks_block");
          stairsBlock(brown_mushroom_bricks_stairs, brown_mushroom_bricks_stair_texture);
        //............red_mushroom
          StairBlock red_mushroom_bricks_stairs = foodblockregistry.RED_MUSHROOM_BRICKS_STAIRS.get();
          ResourceLocation  red_mushroom_bricks_stair_texture = modLoc("block/red_mushroom_bricks_block");
          stairsBlock(red_mushroom_bricks_stairs, red_mushroom_bricks_stair_texture);
        //............pumpkin
          StairBlock pumpkin_bricks_stairs = foodblockregistry.PUMPKIN_BRICKS_STAIRS.get();
          ResourceLocation  pumpkin_bricks_stair_texture = modLoc("block/pumpkin_bricks_block");
          stairsBlock(pumpkin_bricks_stairs, pumpkin_bricks_stair_texture);
        //............chicken
          StairBlock chicken_bricks_stairs = foodblockregistry.CHICKEN_BRICKS_STAIRS.get();
          ResourceLocation chicken_bricks_stair_texture = modLoc("block/chicken_bricks_block");
          stairsBlock(chicken_bricks_stairs, chicken_bricks_stair_texture);
        //............cod
          StairBlock cod_bricks_stairs = foodblockregistry.COD_BRICKS_STAIRS.get();
          ResourceLocation cod_bricks_stair_texture = modLoc("block/cod_bricks_block");
          stairsBlock(cod_bricks_stairs, cod_bricks_stair_texture);
        //............salmon
          StairBlock salmon_bricks_stairs = foodblockregistry.SALMON_BRICKS_STAIRS.get();
          ResourceLocation salmon_bricks_stair_texture = modLoc("block/salmon_bricks_block");
          stairsBlock(salmon_bricks_stairs, salmon_bricks_stair_texture);
        //............tropical_fish
          StairBlock tropical_fish_bricks_stairs = foodblockregistry.TROPICAL_FISH_BRICKS_STAIRS.get();
          ResourceLocation tropical_fish_bricks_stair_texture = modLoc("block/tropical_fish_bricks_block");
          stairsBlock(tropical_fish_bricks_stairs, tropical_fish_bricks_stair_texture);
        //............mutton
          StairBlock mutton_bricks_stairs = foodblockregistry.MUTTON_BRICKS_STAIRS.get();
          ResourceLocation mutton_bricks_stair_texture = modLoc("block/mutton_bricks_block");
          stairsBlock(mutton_bricks_stairs, mutton_bricks_stair_texture);
        //............beef
          StairBlock beef_bricks_stairs = foodblockregistry.BEEF_BRICKS_STAIRS.get();
          ResourceLocation beef_bricks_stair_texture = modLoc("block/beef_bricks_block");
          stairsBlock(beef_bricks_stairs, beef_bricks_stair_texture);
        //............pork
          StairBlock pork_bricks_stairs = foodblockregistry.PORK_BRICKS_STAIRS.get();
          ResourceLocation pork_bricks_stair_texture = modLoc("block/pork_bricks_block");
          stairsBlock(pork_bricks_stairs, pork_bricks_stair_texture);
        //............rabbit
          StairBlock rabbit_bricks_stairs = foodblockregistry.RABBIT_BRICKS_STAIRS.get();
          ResourceLocation rabbit_bricks_stair_texture = modLoc("block/rabbit_bricks_block");
          stairsBlock(rabbit_bricks_stairs, rabbit_bricks_stair_texture);

    //--------------------------------------------------------------trapdoors-----------------------------------------------------------------------------
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

    //----------------------------------------------------------------bars--------------------------------------------------------------------------------
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

    //---------------------------------------------------------------lamps--------------------------------------------------------------------------------
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

    //--------------------------------------------------------------carpets-------------------------------------------------------------------------------
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

    //--------------------------------------------------------------lanterns------------------------------------------------------------------------------
        //.............apple
         //regular
          LanternBlock apple_lantern = foodblockregistry.APPLE_LANTERN.get();
          ResourceLocation apple_lantern_texture = modLoc("block/apple_lantern");
  
          BlockModelBuilder apple_lantern_model = models()
              .withExistingParent("apple_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", apple_lantern_texture);
  
          BlockModelBuilder hanging_apple_lantern_model = models()
              .withExistingParent("apple_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", apple_lantern_texture);
  
          getVariantBuilder(apple_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_apple_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(apple_lantern_model).addModel();
         //soul
         LanternBlock apple_soul_lantern = foodblockregistry.APPLE_SOUL_LANTERN.get();
         ResourceLocation apple_soul_lantern_texture = modLoc("block/apple_soul_lantern");
 
         BlockModelBuilder apple_soul_lantern_model = models()
             .withExistingParent("apple_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", apple_soul_lantern_texture);
 
         BlockModelBuilder hanging_apple_soul_lantern_model = models()
             .withExistingParent("apple_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", apple_soul_lantern_texture);
 
         getVariantBuilder(apple_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_apple_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(apple_soul_lantern_model).addModel();
             
        //.............potato
         //regular
          LanternBlock potato_lantern = foodblockregistry.POTATO_LANTERN.get();
          ResourceLocation potato_lantern_texture = modLoc("block/potato_lantern");
  
          BlockModelBuilder potato_lantern_model = models()
              .withExistingParent("potato_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", potato_lantern_texture);
  
          BlockModelBuilder hanging_potato_lantern_model = models()
              .withExistingParent("potato_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", potato_lantern_texture);
  
          getVariantBuilder(potato_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_potato_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(potato_lantern_model).addModel();
         //soul
          LanternBlock potato_soul_lantern = foodblockregistry.POTATO_SOUL_LANTERN.get();
          ResourceLocation potato_soul_lantern_texture = modLoc("block/potato_soul_lantern");
  
          BlockModelBuilder potato_soul_lantern_model = models()
              .withExistingParent("potato_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", potato_soul_lantern_texture);
  
          BlockModelBuilder hanging_potato_soul_lantern_model = models()
              .withExistingParent("potato_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", potato_soul_lantern_texture);
  
          getVariantBuilder(potato_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_potato_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(potato_soul_lantern_model).addModel();

        //.............beetroot
         //regular
          LanternBlock beetroot_lantern = foodblockregistry.BEETROOT_LANTERN.get();
          ResourceLocation beetroot_lantern_texture = modLoc("block/beetroot_lantern");
  
          BlockModelBuilder beetroot_lantern_model = models()
              .withExistingParent("beetroot_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", beetroot_lantern_texture);
  
          BlockModelBuilder hanging_beetroot_lantern_model = models()
              .withExistingParent("beetroot_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", beetroot_lantern_texture);
  
          getVariantBuilder(beetroot_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_beetroot_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(beetroot_lantern_model).addModel();
         //soul
          LanternBlock beetroot_soul_lantern = foodblockregistry.BEETROOT_SOUL_LANTERN.get();
          ResourceLocation beetroot_soul_lantern_texture = modLoc("block/beetroot_soul_lantern");
  
          BlockModelBuilder beetroot_soul_lantern_model = models()
              .withExistingParent("beetroot_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", beetroot_soul_lantern_texture);
  
          BlockModelBuilder hanging_beetroot_soul_lantern_model = models()
              .withExistingParent("beetroot_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", beetroot_soul_lantern_texture);
  
          getVariantBuilder(beetroot_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_beetroot_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(beetroot_soul_lantern_model).addModel();

        //.............carrot
         //regular
          LanternBlock carrot_lantern = foodblockregistry.CARROT_LANTERN.get();
          ResourceLocation carrot_lantern_texture = modLoc("block/carrot_lantern");
  
          BlockModelBuilder carrot_lantern_model = models()
              .withExistingParent("carrot_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", carrot_lantern_texture);
  
          BlockModelBuilder hanging_carrot_lantern_model = models()
              .withExistingParent("carrot_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", carrot_lantern_texture);
  
          getVariantBuilder(carrot_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_carrot_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(carrot_lantern_model).addModel();
         //soul
          LanternBlock carrot_soul_lantern = foodblockregistry.CARROT_SOUL_LANTERN.get();
          ResourceLocation carrot_soul_lantern_texture = modLoc("block/carrot_soul_lantern");
  
          BlockModelBuilder carrot_soul_lantern_model = models()
              .withExistingParent("carrot_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", carrot_soul_lantern_texture);
  
          BlockModelBuilder hanging_carrot_soul_lantern_model = models()
              .withExistingParent("carrot_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", carrot_soul_lantern_texture);
  
          getVariantBuilder(carrot_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_carrot_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(carrot_soul_lantern_model).addModel();

        //.............chorus
         //regular
          LanternBlock chorus_lantern = foodblockregistry.CHORUS_LANTERN.get();
          ResourceLocation chorus_lantern_texture = modLoc("block/chorus_lantern");
  
          BlockModelBuilder chorus_lantern_model = models()
              .withExistingParent("chorus_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", chorus_lantern_texture);
  
          BlockModelBuilder hanging_chorus_lantern_model = models()
              .withExistingParent("chorus_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", chorus_lantern_texture);
  
          getVariantBuilder(chorus_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_chorus_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(chorus_lantern_model).addModel();
         //soul
          LanternBlock chorus_soul_lantern = foodblockregistry.CHORUS_SOUL_LANTERN.get();
          ResourceLocation chorus_soul_lantern_texture = modLoc("block/chorus_soul_lantern");
  
          BlockModelBuilder chorus_soul_lantern_model = models()
              .withExistingParent("chorus_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", chorus_soul_lantern_texture);
  
          BlockModelBuilder hanging_chorus_soul_lantern_model = models()
              .withExistingParent("chorus_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", chorus_soul_lantern_texture);
  
          getVariantBuilder(chorus_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_chorus_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(chorus_soul_lantern_model).addModel();

        //.............glow_berry
         //regular
          LanternBlock glow_berry_lantern = foodblockregistry.GLOW_BERRY_LANTERN.get();
          ResourceLocation glow_berry_lantern_texture = modLoc("block/glow_berry_lantern");
  
          BlockModelBuilder glow_berry_lantern_model = models()
              .withExistingParent("glow_berry_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", glow_berry_lantern_texture);
  
          BlockModelBuilder hanging_glow_berry_lantern_model = models()
              .withExistingParent("glow_berry_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", glow_berry_lantern_texture);
  
          getVariantBuilder(glow_berry_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_glow_berry_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(glow_berry_lantern_model).addModel();
         //soul
          LanternBlock glow_berry_soul_lantern = foodblockregistry.GLOW_BERRY_SOUL_LANTERN.get();
          ResourceLocation glow_berry_soul_lantern_texture = modLoc("block/glow_berry_soul_lantern");
  
          BlockModelBuilder glow_berry_soul_lantern_model = models()
              .withExistingParent("glow_berry_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", glow_berry_soul_lantern_texture);
  
          BlockModelBuilder hanging_glow_berry_soul_lantern_model = models()
              .withExistingParent("glow_berry_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", glow_berry_soul_lantern_texture);
  
          getVariantBuilder(glow_berry_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_glow_berry_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(glow_berry_soul_lantern_model).addModel();
              
        //.............melon
         //regular
          LanternBlock melon_lantern = foodblockregistry.MELON_LANTERN.get();
          ResourceLocation melon_lantern_texture = modLoc("block/melon_lantern");
  
          BlockModelBuilder melon_lantern_model = models()
              .withExistingParent("melon_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", melon_lantern_texture);
  
          BlockModelBuilder hanging_melon_lantern_model = models()
              .withExistingParent("melon_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", melon_lantern_texture);
  
          getVariantBuilder(melon_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_melon_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(melon_lantern_model).addModel();
         //soul
          LanternBlock melon_soul_lantern = foodblockregistry.MELON_SOUL_LANTERN.get();
          ResourceLocation melon_soul_lantern_texture = modLoc("block/melon_soul_lantern");
  
          BlockModelBuilder melon_soul_lantern_model = models()
              .withExistingParent("melon_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", melon_soul_lantern_texture);
  
          BlockModelBuilder hanging_melon_soul_lantern_model = models()
              .withExistingParent("melon_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", melon_soul_lantern_texture);
  
          getVariantBuilder(melon_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_melon_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(melon_soul_lantern_model).addModel();

        //.............sweet_berry
         //regular
          LanternBlock sweet_berry_lantern = foodblockregistry.SWEET_BERRY_LANTERN.get();
          ResourceLocation sweet_berry_lantern_texture = modLoc("block/sweet_berry_lantern");
  
          BlockModelBuilder sweet_berry_lantern_model = models()
              .withExistingParent("sweet_berry_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", sweet_berry_lantern_texture);
  
          BlockModelBuilder hanging_sweet_berry_lantern_model = models()
              .withExistingParent("sweet_berry_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", sweet_berry_lantern_texture);
  
          getVariantBuilder(sweet_berry_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_sweet_berry_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(sweet_berry_lantern_model).addModel();
         //soul
          LanternBlock sweet_berry_soul_lantern = foodblockregistry.SWEET_BERRY_SOUL_LANTERN.get();
          ResourceLocation sweet_berry_soul_lantern_texture = modLoc("block/sweet_berry_soul_lantern");
  
          BlockModelBuilder sweet_berry_soul_lantern_model = models()
              .withExistingParent("sweet_berry_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", sweet_berry_soul_lantern_texture);
  
          BlockModelBuilder hanging_sweet_berry_soul_lantern_model = models()
              .withExistingParent("sweet_berry_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", sweet_berry_soul_lantern_texture);
  
          getVariantBuilder(sweet_berry_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_sweet_berry_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(sweet_berry_soul_lantern_model).addModel();

        //.............brown_mushroom
         //regular
          LanternBlock brown_mushroom_lantern = foodblockregistry.BROWN_MUSHROOM_LANTERN.get();
          ResourceLocation brown_mushroom_lantern_texture = modLoc("block/brown_mushroom_lantern");
  
          BlockModelBuilder brown_mushroom_lantern_model = models()
              .withExistingParent("brown_mushroom_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", brown_mushroom_lantern_texture);
  
          BlockModelBuilder hanging_brown_mushroom_lantern_model = models()
              .withExistingParent("brown_mushroom_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", brown_mushroom_lantern_texture);
  
          getVariantBuilder(brown_mushroom_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_brown_mushroom_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(brown_mushroom_lantern_model).addModel();
         //soul
          LanternBlock brown_mushroom_soul_lantern = foodblockregistry.BROWN_MUSHROOM_SOUL_LANTERN.get();
          ResourceLocation brown_mushroom_soul_lantern_texture = modLoc("block/brown_mushroom_soul_lantern");
  
          BlockModelBuilder brown_mushroom_soul_lantern_model = models()
              .withExistingParent("brown_mushroom_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", brown_mushroom_soul_lantern_texture);
  
          BlockModelBuilder hanging_brown_mushroom_soul_lantern_model = models()
              .withExistingParent("brown_mushroom_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", brown_mushroom_soul_lantern_texture);
  
          getVariantBuilder(brown_mushroom_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_brown_mushroom_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(brown_mushroom_soul_lantern_model).addModel();

        //.............red_mushroom
         //regular
          LanternBlock red_mushroom_lantern = foodblockregistry.RED_MUSHROOM_LANTERN.get();
          ResourceLocation red_mushroom_lantern_texture = modLoc("block/red_mushroom_lantern");
  
          BlockModelBuilder red_mushroom_lantern_model = models()
              .withExistingParent("red_mushroom_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", red_mushroom_lantern_texture);
  
          BlockModelBuilder hanging_red_mushroom_lantern_model = models()
              .withExistingParent("red_mushroom_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", red_mushroom_lantern_texture);
  
          getVariantBuilder(red_mushroom_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_red_mushroom_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(red_mushroom_lantern_model).addModel();
         //soul
          LanternBlock red_mushroom_soul_lantern = foodblockregistry.RED_MUSHROOM_SOUL_LANTERN.get();
          ResourceLocation red_mushroom_soul_lantern_texture = modLoc("block/red_mushroom_soul_lantern");
  
          BlockModelBuilder red_mushroom_soul_lantern_model = models()
              .withExistingParent("red_mushroom_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", red_mushroom_soul_lantern_texture);
  
          BlockModelBuilder hanging_red_mushroom_soul_lantern_model = models()
              .withExistingParent("red_mushroom_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", red_mushroom_soul_lantern_texture);
  
          getVariantBuilder(red_mushroom_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_red_mushroom_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(red_mushroom_soul_lantern_model).addModel();

        //.............pumpkin
         //regular
          LanternBlock pumpkin_lantern = foodblockregistry.PUMPKIN_LANTERN.get();
          ResourceLocation pumpkin_lantern_texture = modLoc("block/pumpkin_lantern");
  
          BlockModelBuilder pumpkin_lantern_model = models()
              .withExistingParent("pumpkin_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pumpkin_lantern_texture);
  
          BlockModelBuilder hanging_pumpkin_lantern_model = models()
              .withExistingParent("pumpkin_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pumpkin_lantern_texture);
  
          getVariantBuilder(pumpkin_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_pumpkin_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(pumpkin_lantern_model).addModel();
         //soul
          LanternBlock pumpkin_soul_lantern = foodblockregistry.PUMPKIN_SOUL_LANTERN.get();
          ResourceLocation pumpkin_soul_lantern_texture = modLoc("block/pumpkin_soul_lantern");
  
          BlockModelBuilder pumpkin_soul_lantern_model = models()
              .withExistingParent("pumpkin_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pumpkin_soul_lantern_texture);
  
          BlockModelBuilder hanging_pumpkin_soul_lantern_model = models()
              .withExistingParent("pumpkin_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pumpkin_soul_lantern_texture);
  
          getVariantBuilder(pumpkin_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_pumpkin_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(pumpkin_soul_lantern_model).addModel();

        //.............chicken
         //regular
          LanternBlock chicken_lantern = foodblockregistry.CHICKEN_LANTERN.get();
          ResourceLocation chicken_lantern_texture = modLoc("block/chicken_lantern");
  
          BlockModelBuilder chicken_lantern_model = models()
              .withExistingParent("chicken_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", chicken_lantern_texture);
  
          BlockModelBuilder hanging_chicken_lantern_model = models()
              .withExistingParent("chicken_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", chicken_lantern_texture);
  
          getVariantBuilder(chicken_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_chicken_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(chicken_lantern_model).addModel();
         //soul
          LanternBlock chicken_soul_lantern = foodblockregistry.CHICKEN_SOUL_LANTERN.get();
          ResourceLocation chicken_soul_lantern_texture = modLoc("block/chicken_soul_lantern");
  
          BlockModelBuilder chicken_soul_lantern_model = models()
              .withExistingParent("chicken_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", chicken_soul_lantern_texture);
  
          BlockModelBuilder hanging_chicken_soul_lantern_model = models()
              .withExistingParent("chicken_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", chicken_soul_lantern_texture);
  
          getVariantBuilder(chicken_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_chicken_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(chicken_soul_lantern_model).addModel();

        //.............cod
         //regular
          LanternBlock cod_lantern = foodblockregistry.COD_LANTERN.get();
          ResourceLocation cod_lantern_texture = modLoc("block/cod_lantern");
  
          BlockModelBuilder cod_lantern_model = models()
              .withExistingParent("cod_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", cod_lantern_texture);
  
          BlockModelBuilder hanging_cod_lantern_model = models()
              .withExistingParent("cod_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", cod_lantern_texture);
  
          getVariantBuilder(cod_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_cod_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(cod_lantern_model).addModel();
         //soul
          LanternBlock cod_soul_lantern = foodblockregistry.COD_SOUL_LANTERN.get();
          ResourceLocation cod_soul_lantern_texture = modLoc("block/cod_soul_lantern");
  
          BlockModelBuilder cod_soul_lantern_model = models()
              .withExistingParent("cod_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", cod_soul_lantern_texture);
  
          BlockModelBuilder hanging_cod_soul_lantern_model = models()
              .withExistingParent("cod_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", cod_soul_lantern_texture);
  
          getVariantBuilder(cod_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_cod_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(cod_soul_lantern_model).addModel();

        //.............salmon
         //regular
          LanternBlock salmon_lantern = foodblockregistry.SALMON_LANTERN.get();
          ResourceLocation salmon_lantern_texture = modLoc("block/salmon_lantern");
  
          BlockModelBuilder salmon_lantern_model = models()
              .withExistingParent("salmon_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", salmon_lantern_texture);
  
          BlockModelBuilder hanging_salmon_lantern_model = models()
              .withExistingParent("salmon_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", salmon_lantern_texture);
  
          getVariantBuilder(salmon_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_salmon_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(salmon_lantern_model).addModel();
         //soul
          LanternBlock salmon_soul_lantern = foodblockregistry.SALMON_SOUL_LANTERN.get();
          ResourceLocation salmon_soul_lantern_texture = modLoc("block/salmon_soul_lantern");
  
          BlockModelBuilder salmon_soul_lantern_model = models()
              .withExistingParent("salmon_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", salmon_soul_lantern_texture);
  
          BlockModelBuilder hanging_salmon_soul_lantern_model = models()
              .withExistingParent("salmon_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", salmon_soul_lantern_texture);
  
          getVariantBuilder(salmon_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_salmon_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(salmon_soul_lantern_model).addModel();

        //.............tropical_fish
         //regular
          LanternBlock tropical_fish_lantern = foodblockregistry.TROPICAL_FISH_LANTERN.get();
          ResourceLocation tropical_fish_lantern_texture = modLoc("block/tropical_fish_lantern");
  
          BlockModelBuilder tropical_fish_lantern_model = models()
              .withExistingParent("tropical_fish_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", tropical_fish_lantern_texture);
  
          BlockModelBuilder hanging_tropical_fish_lantern_model = models()
              .withExistingParent("tropical_fish_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", tropical_fish_lantern_texture);
  
          getVariantBuilder(tropical_fish_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_tropical_fish_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(tropical_fish_lantern_model).addModel();
         //soul
          LanternBlock tropical_fish_soul_lantern = foodblockregistry.TROPICAL_FISH_SOUL_LANTERN.get();
          ResourceLocation tropical_fish_soul_lantern_texture = modLoc("block/tropical_fish_soul_lantern");
  
          BlockModelBuilder tropical_fish_soul_lantern_model = models()
              .withExistingParent("tropical_fish_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", tropical_fish_soul_lantern_texture);
  
          BlockModelBuilder hanging_tropical_fish_soul_lantern_model = models()
              .withExistingParent("tropical_fish_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", tropical_fish_soul_lantern_texture);
  
          getVariantBuilder(tropical_fish_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_tropical_fish_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(tropical_fish_soul_lantern_model).addModel();

        //.............mutton
         //regular
          LanternBlock mutton_lantern = foodblockregistry.MUTTON_LANTERN.get();
          ResourceLocation mutton_lantern_texture = modLoc("block/mutton_lantern");
  
          BlockModelBuilder mutton_lantern_model = models()
              .withExistingParent("mutton_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", mutton_lantern_texture);
  
          BlockModelBuilder hanging_mutton_lantern_model = models()
              .withExistingParent("mutton_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", mutton_lantern_texture);
  
          getVariantBuilder(mutton_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_mutton_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(mutton_lantern_model).addModel();
         //soul
          LanternBlock mutton_soul_lantern = foodblockregistry.MUTTON_SOUL_LANTERN.get();
          ResourceLocation mutton_soul_lantern_texture = modLoc("block/mutton_soul_lantern");
  
          BlockModelBuilder mutton_soul_lantern_model = models()
              .withExistingParent("mutton_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", mutton_soul_lantern_texture);
  
          BlockModelBuilder hanging_mutton_soul_lantern_model = models()
              .withExistingParent("mutton_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", mutton_soul_lantern_texture);
  
          getVariantBuilder(mutton_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_mutton_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(mutton_soul_lantern_model).addModel();

        //.............beef
         //regular
          LanternBlock beef_lantern = foodblockregistry.BEEF_LANTERN.get();
          ResourceLocation beef_lantern_texture = modLoc("block/beef_lantern");
  
          BlockModelBuilder beef_lantern_model = models()
              .withExistingParent("beef_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", beef_lantern_texture);
  
          BlockModelBuilder hanging_beef_lantern_model = models()
              .withExistingParent("beef_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", beef_lantern_texture);
  
          getVariantBuilder(beef_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_beef_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(beef_lantern_model).addModel();
         //soul
          LanternBlock beef_soul_lantern = foodblockregistry.BEEF_SOUL_LANTERN.get();
          ResourceLocation beef_soul_lantern_texture = modLoc("block/beef_soul_lantern");
  
          BlockModelBuilder beef_soul_lantern_model = models()
              .withExistingParent("beef_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", beef_soul_lantern_texture);
  
          BlockModelBuilder hanging_beef_soul_lantern_model = models()
              .withExistingParent("beef_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", beef_soul_lantern_texture);
  
          getVariantBuilder(beef_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_beef_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(beef_soul_lantern_model).addModel();

        //.............pork
         //regular
          LanternBlock pork_lantern = foodblockregistry.PORK_LANTERN.get();
          ResourceLocation pork_lantern_texture = modLoc("block/pork_lantern");
  
          BlockModelBuilder pork_lantern_model = models()
              .withExistingParent("pork_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pork_lantern_texture);
  
          BlockModelBuilder hanging_pork_lantern_model = models()
              .withExistingParent("pork_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pork_lantern_texture);
  
          getVariantBuilder(pork_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_pork_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(pork_lantern_model).addModel();
         //soul
          LanternBlock pork_soul_lantern = foodblockregistry.PORK_SOUL_LANTERN.get();
          ResourceLocation pork_soul_lantern_texture = modLoc("block/pork_soul_lantern");
  
          BlockModelBuilder pork_soul_lantern_model = models()
              .withExistingParent("pork_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pork_soul_lantern_texture);
  
          BlockModelBuilder hanging_pork_soul_lantern_model = models()
              .withExistingParent("pork_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pork_soul_lantern_texture);
  
          getVariantBuilder(pork_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_pork_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(pork_soul_lantern_model).addModel();

        //.............rabbit
         //regular
          LanternBlock rabbit_lantern = foodblockregistry.RABBIT_LANTERN.get();
          ResourceLocation rabbit_lantern_texture = modLoc("block/rabbit_lantern");
  
          BlockModelBuilder rabbit_lantern_model = models()
              .withExistingParent("rabbit_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", rabbit_lantern_texture);
  
          BlockModelBuilder hanging_rabbit_lantern_model = models()
              .withExistingParent("rabbit_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", rabbit_lantern_texture);
  
          getVariantBuilder(rabbit_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_rabbit_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(rabbit_lantern_model).addModel();
         //soul
          LanternBlock rabbit_soul_lantern = foodblockregistry.RABBIT_SOUL_LANTERN.get();
          ResourceLocation rabbit_soul_lantern_texture = modLoc("block/rabbit_soul_lantern");
  
          BlockModelBuilder rabbit_soul_lantern_model = models()
              .withExistingParent("rabbit_soul_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", rabbit_soul_lantern_texture);
  
          BlockModelBuilder hanging_rabbit_soul_lantern_model = models()
              .withExistingParent("rabbit_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", rabbit_soul_lantern_texture);
  
          getVariantBuilder(rabbit_soul_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_rabbit_soul_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(rabbit_soul_lantern_model).addModel();

    //---------------------------------------------------------------chains-------------------------------------------------------------------------------
      //.............apple
         ChainBlock apple_chain = foodblockregistry.APPLE_CHAIN.get();
         ResourceLocation apple_chain_texture = modLoc("block/apple_chain");
         BlockModelBuilder apple_chain_model = models()
          .withExistingParent("apple_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", apple_chain_texture)
          .texture("particle", apple_chain_texture);

          getVariantBuilder(apple_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(apple_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(apple_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(apple_chain_model).rotationX(90).addModel(); 
              
      //.............potato
         ChainBlock potato_chain = foodblockregistry.POTATO_CHAIN.get();
         ResourceLocation potato_chain_texture = modLoc("block/potato_chain");
         BlockModelBuilder potato_chain_model = models()
          .withExistingParent("potato_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", potato_chain_texture)
          .texture("particle", potato_chain_texture);

          getVariantBuilder(potato_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(potato_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(potato_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(potato_chain_model).rotationX(90).addModel();     

      //.............beetroot
         ChainBlock beetroot_chain = foodblockregistry.BEETROOT_CHAIN.get();
         ResourceLocation beetroot_chain_texture = modLoc("block/beetroot_chain");
         BlockModelBuilder beetroot_chain_model = models()
          .withExistingParent("beetroot_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", beetroot_chain_texture)
          .texture("particle", beetroot_chain_texture);

          getVariantBuilder(beetroot_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(beetroot_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(beetroot_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(beetroot_chain_model).rotationX(90).addModel();     

      //.............carrot
         ChainBlock carrot_chain = foodblockregistry.CARROT_CHAIN.get();
         ResourceLocation carrot_chain_texture = modLoc("block/carrot_chain");
         BlockModelBuilder carrot_chain_model = models()
          .withExistingParent("carrot_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", carrot_chain_texture)
          .texture("particle", carrot_chain_texture);

          getVariantBuilder(carrot_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(carrot_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(carrot_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(carrot_chain_model).rotationX(90).addModel();     

      //.............chorus
         ChainBlock chorus_chain = foodblockregistry.CHORUS_CHAIN.get();
         ResourceLocation chorus_chain_texture = modLoc("block/chorus_chain");
         BlockModelBuilder chorus_chain_model = models()
          .withExistingParent("chorus_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", chorus_chain_texture)
          .texture("particle", chorus_chain_texture);

          getVariantBuilder(chorus_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(chorus_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(chorus_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(chorus_chain_model).rotationX(90).addModel();     

      //.............glow_berry
         ChainBlock glow_berry_chain = foodblockregistry.GLOW_BERRY_CHAIN.get();
         ResourceLocation glow_berry_chain_texture = modLoc("block/glow_berry_chain");
         BlockModelBuilder glow_berry_chain_model = models()
          .withExistingParent("glow_berry_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", glow_berry_chain_texture)
          .texture("particle", glow_berry_chain_texture);

          getVariantBuilder(glow_berry_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(glow_berry_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(glow_berry_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(glow_berry_chain_model).rotationX(90).addModel();     

      //.............melon
         ChainBlock melon_chain = foodblockregistry.MELON_CHAIN.get();
         ResourceLocation melon_chain_texture = modLoc("block/melon_chain");
         BlockModelBuilder melon_chain_model = models()
          .withExistingParent("melon_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", melon_chain_texture)
          .texture("particle", melon_chain_texture);

          getVariantBuilder(melon_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(melon_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(melon_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(melon_chain_model).rotationX(90).addModel();     

      //.............sweet_berry
         ChainBlock sweet_berry_chain = foodblockregistry.SWEET_BERRY_CHAIN.get();
         ResourceLocation sweet_berry_chain_texture = modLoc("block/sweet_berry_chain");
         BlockModelBuilder sweet_berry_chain_model = models()
          .withExistingParent("sweet_berry_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", sweet_berry_chain_texture)
          .texture("particle", sweet_berry_chain_texture);

          getVariantBuilder(sweet_berry_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(sweet_berry_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(sweet_berry_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(sweet_berry_chain_model).rotationX(90).addModel();     

      //.............brown_mushroom
         ChainBlock brown_mushroom_chain = foodblockregistry.BROWN_MUSHROOM_CHAIN.get();
         ResourceLocation brown_mushroom_chain_texture = modLoc("block/brown_mushroom_chain");
         BlockModelBuilder brown_mushroom_chain_model = models()
          .withExistingParent("brown_mushroom_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", brown_mushroom_chain_texture)
          .texture("particle", brown_mushroom_chain_texture);

          getVariantBuilder(brown_mushroom_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(brown_mushroom_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(brown_mushroom_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(brown_mushroom_chain_model).rotationX(90).addModel();     

      //.............red_mushroom
         ChainBlock red_mushroom_chain = foodblockregistry.RED_MUSHROOM_CHAIN.get();
         ResourceLocation red_mushroom_chain_texture = modLoc("block/red_mushroom_chain");
         BlockModelBuilder red_mushroom_chain_model = models()
          .withExistingParent("red_mushroom_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", red_mushroom_chain_texture)
          .texture("particle", red_mushroom_chain_texture);

          getVariantBuilder(red_mushroom_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(red_mushroom_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(red_mushroom_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(red_mushroom_chain_model).rotationX(90).addModel();     

      //.............pumpkin
         ChainBlock pumpkin_chain = foodblockregistry.PUMPKIN_CHAIN.get();
         ResourceLocation pumpkin_chain_texture = modLoc("block/pumpkin_chain");
         BlockModelBuilder pumpkin_chain_model = models()
          .withExistingParent("pumpkin_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", pumpkin_chain_texture)
          .texture("particle", pumpkin_chain_texture);

          getVariantBuilder(pumpkin_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(pumpkin_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(pumpkin_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(pumpkin_chain_model).rotationX(90).addModel();     

      //.............chicken
         ChainBlock chicken_chain = foodblockregistry.CHICKEN_CHAIN.get();
         ResourceLocation chicken_chain_texture = modLoc("block/chicken_chain");
         BlockModelBuilder chicken_chain_model = models()
          .withExistingParent("chicken_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", chicken_chain_texture)
          .texture("particle", chicken_chain_texture);

          getVariantBuilder(chicken_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(chicken_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(chicken_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(chicken_chain_model).rotationX(90).addModel();     

      //.............cod
         ChainBlock cod_chain = foodblockregistry.COD_CHAIN.get();
         ResourceLocation cod_chain_texture = modLoc("block/cod_chain");
         BlockModelBuilder cod_chain_model = models()
          .withExistingParent("cod_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", cod_chain_texture)
          .texture("particle", cod_chain_texture);

          getVariantBuilder(cod_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(cod_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(cod_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(cod_chain_model).rotationX(90).addModel();     

      //.............salmon
         ChainBlock salmon_chain = foodblockregistry.SALMON_CHAIN.get();
         ResourceLocation salmon_chain_texture = modLoc("block/salmon_chain");
         BlockModelBuilder salmon_chain_model = models()
          .withExistingParent("salmon_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", salmon_chain_texture)
          .texture("particle", salmon_chain_texture);

          getVariantBuilder(salmon_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(salmon_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(salmon_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(salmon_chain_model).rotationX(90).addModel();     

      //.............tropical_fish
         ChainBlock tropical_fish_chain = foodblockregistry.TROPICAL_FISH_CHAIN.get();
         ResourceLocation tropical_fish_chain_texture = modLoc("block/tropical_fish_chain");
         BlockModelBuilder tropical_fish_chain_model = models()
          .withExistingParent("tropical_fish_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", tropical_fish_chain_texture)
          .texture("particle", tropical_fish_chain_texture);

          getVariantBuilder(tropical_fish_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(tropical_fish_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(tropical_fish_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(tropical_fish_chain_model).rotationX(90).addModel();     

      //.............mutton
         ChainBlock mutton_chain = foodblockregistry.MUTTON_CHAIN.get();
         ResourceLocation mutton_chain_texture = modLoc("block/mutton_chain");
         BlockModelBuilder mutton_chain_model = models()
          .withExistingParent("mutton_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", mutton_chain_texture)
          .texture("particle", mutton_chain_texture);

          getVariantBuilder(mutton_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(mutton_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(mutton_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(mutton_chain_model).rotationX(90).addModel();     

      //.............beef
         ChainBlock beef_chain = foodblockregistry.BEEF_CHAIN.get();
         ResourceLocation beef_chain_texture = modLoc("block/beef_chain");
         BlockModelBuilder beef_chain_model = models()
          .withExistingParent("beef_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", beef_chain_texture)
          .texture("particle", beef_chain_texture);

          getVariantBuilder(beef_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(beef_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(beef_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(beef_chain_model).rotationX(90).addModel();     

      //.............pork
         ChainBlock pork_chain = foodblockregistry.PORK_CHAIN.get();
         ResourceLocation pork_chain_texture = modLoc("block/pork_chain");
         BlockModelBuilder pork_chain_model = models()
          .withExistingParent("pork_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", pork_chain_texture)
          .texture("particle", pork_chain_texture);

          getVariantBuilder(pork_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(pork_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(pork_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(pork_chain_model).rotationX(90).addModel();     

      //.............rabbit
         ChainBlock rabbit_chain = foodblockregistry.RABBIT_CHAIN.get();
         ResourceLocation rabbit_chain_texture = modLoc("block/rabbit_chain");
         BlockModelBuilder rabbit_chain_model = models()
          .withExistingParent("rabbit_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", rabbit_chain_texture)
          .texture("particle", rabbit_chain_texture);

          getVariantBuilder(rabbit_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(rabbit_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(rabbit_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(rabbit_chain_model).rotationX(90).addModel();     

    //---------------------------------------------------------------torches------------------------------------------------------------------------------
      //.............apple
       //regular
        TorchBlock apple_torch = foodblockregistry.APPLE_TORCH.get();
        ResourceLocation apple_torch_texture = modLoc("block/apple_torch");
        BlockModelBuilder apple_torch_model = models()
        .withExistingParent("apple_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", apple_torch_texture)
        .texture("particle", apple_torch_texture);

        simpleBlock(apple_torch, apple_torch_model);

        TorchBlock apple_wall_torch = foodblockregistry.APPLE_WALL_TORCH.get();
        BlockModelBuilder apple_wall_torch_model = models()
        .withExistingParent("apple_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", apple_torch_texture)
        .texture("particle", apple_torch_texture);
        getVariantBuilder(apple_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 0;
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("apple_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", apple_torch_texture)
                    .texture("particle", apple_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock apple_redstone_torch = foodblockregistry.APPLE_REDSTONE_TORCH.get();
        ResourceLocation apple_redstone_torch_texture = modLoc("block/apple_redstone_torch");
        BlockModelBuilder apple_redstone_torch_model = models()
        .withExistingParent("apple_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", apple_redstone_torch_texture)
        .texture("particle", apple_redstone_torch_texture);
        

        simpleBlock(apple_redstone_torch, apple_redstone_torch_model);

        ResourceLocation apple_redstone_wall_torch_texture = modLoc("block/apple_redstone_torch");

        RedstoneTorchBlock apple_redstone_wall_torch = foodblockregistry.APPLE_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder apple_redstone_wall_torch_model = models()
        .withExistingParent("apple_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", apple_redstone_wall_torch_texture)
        .texture("particle", apple_redstone_wall_torch_texture);
        getVariantBuilder(apple_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("apple_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", apple_redstone_wall_torch_texture)
                    .texture("particle", apple_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock apple_soul_torch = foodblockregistry.APPLE_SOUL_TORCH.get();
        ResourceLocation apple_soul_torch_texture = modLoc("block/apple_soul_torch");
        BlockModelBuilder apple_soul_torch_model = models()
        .withExistingParent("apple_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", apple_soul_torch_texture)
        .texture("particle", apple_soul_torch_texture);
        

        simpleBlock(apple_soul_torch, apple_soul_torch_model);

        ResourceLocation apple_soul_wall_torch_texture = modLoc("block/apple_soul_torch");
        TorchBlock apple_soul_wall_torch = foodblockregistry.APPLE_SOUL_WALL_TORCH.get();
        BlockModelBuilder apple_soul_wall_torch_model = models()
        .withExistingParent("apple_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", apple_soul_wall_torch_texture)
        .texture("particle", apple_soul_wall_torch_texture);
        getVariantBuilder(apple_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("apple_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", apple_soul_wall_torch_texture)
                    .texture("particle", apple_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............potato
       //regular
        TorchBlock potato_torch = foodblockregistry.POTATO_TORCH.get();
        ResourceLocation potato_torch_texture = modLoc("block/potato_torch");
        BlockModelBuilder potato_torch_model = models()
        .withExistingParent("potato_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", potato_torch_texture)
        .texture("particle", potato_torch_texture);

        simpleBlock(potato_torch, potato_torch_model);

        TorchBlock potato_wall_torch = foodblockregistry.POTATO_WALL_TORCH.get();
        BlockModelBuilder potato_wall_torch_model = models()
        .withExistingParent("potato_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", potato_torch_texture)
        .texture("particle", potato_torch_texture);
        getVariantBuilder(potato_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("potato_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", potato_torch_texture)
                    .texture("particle", potato_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock potato_redstone_torch = foodblockregistry.POTATO_REDSTONE_TORCH.get();
        ResourceLocation potato_redstone_torch_texture = modLoc("block/potato_redstone_torch");
        BlockModelBuilder potato_redstone_torch_model = models()
        .withExistingParent("potato_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", potato_redstone_torch_texture)
        .texture("particle", potato_redstone_torch_texture);
        

        simpleBlock(potato_redstone_torch, potato_redstone_torch_model);

        ResourceLocation potato_redstone_wall_torch_texture = modLoc("block/potato_redstone_torch");

        RedstoneTorchBlock potato_redstone_wall_torch = foodblockregistry.POTATO_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder potato_redstone_wall_torch_model = models()
        .withExistingParent("potato_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", potato_redstone_wall_torch_texture)
        .texture("particle", potato_redstone_wall_torch_texture);
        getVariantBuilder(potato_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("potato_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", potato_redstone_wall_torch_texture)
                    .texture("particle", potato_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock potato_soul_torch = foodblockregistry.POTATO_SOUL_TORCH.get();
        ResourceLocation potato_soul_torch_texture = modLoc("block/potato_soul_torch");
        BlockModelBuilder potato_soul_torch_model = models()
        .withExistingParent("potato_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", potato_soul_torch_texture)
        .texture("particle", potato_soul_torch_texture);
        

        simpleBlock(potato_soul_torch, potato_soul_torch_model);

        ResourceLocation potato_soul_wall_torch_texture = modLoc("block/potato_soul_torch");
        TorchBlock potato_soul_wall_torch = foodblockregistry.POTATO_SOUL_WALL_TORCH.get();
        BlockModelBuilder potato_soul_wall_torch_model = models()
        .withExistingParent("potato_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", potato_soul_wall_torch_texture)
        .texture("particle", potato_soul_wall_torch_texture);
        getVariantBuilder(potato_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("potato_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", potato_soul_wall_torch_texture)
                    .texture("particle", potato_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............beetroot
       //regular
        TorchBlock beetroot_torch = foodblockregistry.BEETROOT_TORCH.get();
        ResourceLocation beetroot_torch_texture = modLoc("block/beetroot_torch");
        BlockModelBuilder beetroot_torch_model = models()
        .withExistingParent("beetroot_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beetroot_torch_texture)
        .texture("particle", beetroot_torch_texture);

        simpleBlock(beetroot_torch, beetroot_torch_model);

        TorchBlock beetroot_wall_torch = foodblockregistry.BEETROOT_WALL_TORCH.get();
        BlockModelBuilder beetroot_wall_torch_model = models()
        .withExistingParent("beetroot_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beetroot_torch_texture)
        .texture("particle", beetroot_torch_texture);
        getVariantBuilder(beetroot_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("beetroot_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", beetroot_torch_texture)
                    .texture("particle", beetroot_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock beetroot_redstone_torch = foodblockregistry.BEETROOT_REDSTONE_TORCH.get();
        ResourceLocation beetroot_redstone_torch_texture = modLoc("block/beetroot_redstone_torch");
        BlockModelBuilder beetroot_redstone_torch_model = models()
        .withExistingParent("beetroot_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beetroot_redstone_torch_texture)
        .texture("particle", beetroot_redstone_torch_texture);
        

        simpleBlock(beetroot_redstone_torch, beetroot_redstone_torch_model);

        ResourceLocation beetroot_redstone_wall_torch_texture = modLoc("block/beetroot_redstone_torch");

        RedstoneTorchBlock beetroot_redstone_wall_torch = foodblockregistry.BEETROOT_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder beetroot_redstone_wall_torch_model = models()
        .withExistingParent("beetroot_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beetroot_redstone_wall_torch_texture)
        .texture("particle", beetroot_redstone_wall_torch_texture);
        getVariantBuilder(beetroot_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("beetroot_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", beetroot_redstone_wall_torch_texture)
                    .texture("particle", beetroot_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock beetroot_soul_torch = foodblockregistry.BEETROOT_SOUL_TORCH.get();
        ResourceLocation beetroot_soul_torch_texture = modLoc("block/beetroot_soul_torch");
        BlockModelBuilder beetroot_soul_torch_model = models()
        .withExistingParent("beetroot_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beetroot_soul_torch_texture)
        .texture("particle", beetroot_soul_torch_texture);
        

        simpleBlock(beetroot_soul_torch, beetroot_soul_torch_model);

        ResourceLocation beetroot_soul_wall_torch_texture = modLoc("block/beetroot_soul_torch");
        TorchBlock beetroot_soul_wall_torch = foodblockregistry.BEETROOT_SOUL_WALL_TORCH.get();
        BlockModelBuilder beetroot_soul_wall_torch_model = models()
        .withExistingParent("beetroot_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beetroot_soul_wall_torch_texture)
        .texture("particle", beetroot_soul_wall_torch_texture);
        getVariantBuilder(beetroot_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("beetroot_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", beetroot_soul_wall_torch_texture)
                    .texture("particle", beetroot_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............carrot
       //regular
        TorchBlock carrot_torch = foodblockregistry.CARROT_TORCH.get();
        ResourceLocation carrot_torch_texture = modLoc("block/carrot_torch");
        BlockModelBuilder carrot_torch_model = models()
        .withExistingParent("carrot_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", carrot_torch_texture)
        .texture("particle", carrot_torch_texture);

        simpleBlock(carrot_torch, carrot_torch_model);

        TorchBlock carrot_wall_torch = foodblockregistry.CARROT_WALL_TORCH.get();
        BlockModelBuilder carrot_wall_torch_model = models()
        .withExistingParent("carrot_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", carrot_torch_texture)
        .texture("particle", carrot_torch_texture);
        getVariantBuilder(carrot_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("carrot_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", carrot_torch_texture)
                    .texture("particle", carrot_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock carrot_redstone_torch = foodblockregistry.CARROT_REDSTONE_TORCH.get();
        ResourceLocation carrot_redstone_torch_texture = modLoc("block/carrot_redstone_torch");
        BlockModelBuilder carrot_redstone_torch_model = models()
        .withExistingParent("carrot_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", carrot_redstone_torch_texture)
        .texture("particle", carrot_redstone_torch_texture);
        

        simpleBlock(carrot_redstone_torch, carrot_redstone_torch_model);

        ResourceLocation carrot_redstone_wall_torch_texture = modLoc("block/carrot_redstone_torch");

        RedstoneTorchBlock carrot_redstone_wall_torch = foodblockregistry.CARROT_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder carrot_redstone_wall_torch_model = models()
        .withExistingParent("carrot_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", carrot_redstone_wall_torch_texture)
        .texture("particle", carrot_redstone_wall_torch_texture);
        getVariantBuilder(carrot_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("carrot_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", carrot_redstone_wall_torch_texture)
                    .texture("particle", carrot_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock carrot_soul_torch = foodblockregistry.CARROT_SOUL_TORCH.get();
        ResourceLocation carrot_soul_torch_texture = modLoc("block/carrot_soul_torch");
        BlockModelBuilder carrot_soul_torch_model = models()
        .withExistingParent("carrot_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", carrot_soul_torch_texture)
        .texture("particle", carrot_soul_torch_texture);
        

        simpleBlock(carrot_soul_torch, carrot_soul_torch_model);

        ResourceLocation carrot_soul_wall_torch_texture = modLoc("block/carrot_soul_torch");
        TorchBlock carrot_soul_wall_torch = foodblockregistry.CARROT_SOUL_WALL_TORCH.get();
        BlockModelBuilder carrot_soul_wall_torch_model = models()
        .withExistingParent("carrot_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", carrot_soul_wall_torch_texture)
        .texture("particle", carrot_soul_wall_torch_texture);
        getVariantBuilder(carrot_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("carrot_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", carrot_soul_wall_torch_texture)
                    .texture("particle", carrot_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............chorus
       //regular
        TorchBlock chorus_torch = foodblockregistry.CHORUS_TORCH.get();
        ResourceLocation chorus_torch_texture = modLoc("block/chorus_torch");
        BlockModelBuilder chorus_torch_model = models()
        .withExistingParent("chorus_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chorus_torch_texture)
        .texture("particle", chorus_torch_texture);

        simpleBlock(chorus_torch, chorus_torch_model);

        TorchBlock chorus_wall_torch = foodblockregistry.CHORUS_WALL_TORCH.get();
        BlockModelBuilder chorus_wall_torch_model = models()
        .withExistingParent("chorus_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chorus_torch_texture)
        .texture("particle", chorus_torch_texture);
        getVariantBuilder(chorus_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("chorus_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", chorus_torch_texture)
                    .texture("particle", chorus_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock chorus_redstone_torch = foodblockregistry.CHORUS_REDSTONE_TORCH.get();
        ResourceLocation chorus_redstone_torch_texture = modLoc("block/chorus_redstone_torch");
        BlockModelBuilder chorus_redstone_torch_model = models()
        .withExistingParent("chorus_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chorus_redstone_torch_texture)
        .texture("particle", chorus_redstone_torch_texture);
        

        simpleBlock(chorus_redstone_torch, chorus_redstone_torch_model);

        ResourceLocation chorus_redstone_wall_torch_texture = modLoc("block/chorus_redstone_torch");

        RedstoneTorchBlock chorus_redstone_wall_torch = foodblockregistry.CHORUS_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder chorus_redstone_wall_torch_model = models()
        .withExistingParent("chorus_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chorus_redstone_wall_torch_texture)
        .texture("particle", chorus_redstone_wall_torch_texture);
        getVariantBuilder(chorus_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("chorus_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", chorus_redstone_wall_torch_texture)
                    .texture("particle", chorus_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock chorus_soul_torch = foodblockregistry.CHORUS_SOUL_TORCH.get();
        ResourceLocation chorus_soul_torch_texture = modLoc("block/chorus_soul_torch");
        BlockModelBuilder chorus_soul_torch_model = models()
        .withExistingParent("chorus_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chorus_soul_torch_texture)
        .texture("particle", chorus_soul_torch_texture);
        

        simpleBlock(chorus_soul_torch, chorus_soul_torch_model);

        ResourceLocation chorus_soul_wall_torch_texture = modLoc("block/chorus_soul_torch");
        TorchBlock chorus_soul_wall_torch = foodblockregistry.CHORUS_SOUL_WALL_TORCH.get();
        BlockModelBuilder chorus_soul_wall_torch_model = models()
        .withExistingParent("chorus_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chorus_soul_wall_torch_texture)
        .texture("particle", chorus_soul_wall_torch_texture);
        getVariantBuilder(chorus_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("chorus_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", chorus_soul_wall_torch_texture)
                    .texture("particle", chorus_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............glow_berry
       //regular
        TorchBlock glow_berry_torch = foodblockregistry.GLOW_BERRY_TORCH.get();
        ResourceLocation glow_berry_torch_texture = modLoc("block/glow_berry_torch");
        BlockModelBuilder glow_berry_torch_model = models()
        .withExistingParent("glow_berry_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", glow_berry_torch_texture)
        .texture("particle", glow_berry_torch_texture);

        simpleBlock(glow_berry_torch, glow_berry_torch_model);

        TorchBlock glow_berry_wall_torch = foodblockregistry.GLOW_BERRY_WALL_TORCH.get();
        BlockModelBuilder glow_berry_wall_torch_model = models()
        .withExistingParent("glow_berry_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", glow_berry_torch_texture)
        .texture("particle", glow_berry_torch_texture);
        getVariantBuilder(glow_berry_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("glow_berry_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", glow_berry_torch_texture)
                    .texture("particle", glow_berry_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock glow_berry_redstone_torch = foodblockregistry.GLOW_BERRY_REDSTONE_TORCH.get();
        ResourceLocation glow_berry_redstone_torch_texture = modLoc("block/glow_berry_redstone_torch");
        BlockModelBuilder glow_berry_redstone_torch_model = models()
        .withExistingParent("glow_berry_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", glow_berry_redstone_torch_texture)
        .texture("particle", glow_berry_redstone_torch_texture);
        

        simpleBlock(glow_berry_redstone_torch, glow_berry_redstone_torch_model);

        ResourceLocation glow_berry_redstone_wall_torch_texture = modLoc("block/glow_berry_redstone_torch");

        RedstoneTorchBlock glow_berry_redstone_wall_torch = foodblockregistry.GLOW_BERRY_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder glow_berry_redstone_wall_torch_model = models()
        .withExistingParent("glow_berry_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", glow_berry_redstone_wall_torch_texture)
        .texture("particle", glow_berry_redstone_wall_torch_texture);
        getVariantBuilder(glow_berry_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("glow_berry_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", glow_berry_redstone_wall_torch_texture)
                    .texture("particle", glow_berry_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock glow_berry_soul_torch = foodblockregistry.GLOW_BERRY_SOUL_TORCH.get();
        ResourceLocation glow_berry_soul_torch_texture = modLoc("block/glow_berry_soul_torch");
        BlockModelBuilder glow_berry_soul_torch_model = models()
        .withExistingParent("glow_berry_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", glow_berry_soul_torch_texture)
        .texture("particle", glow_berry_soul_torch_texture);
        

        simpleBlock(glow_berry_soul_torch, glow_berry_soul_torch_model);

        ResourceLocation glow_berry_soul_wall_torch_texture = modLoc("block/glow_berry_soul_torch");
        TorchBlock glow_berry_soul_wall_torch = foodblockregistry.GLOW_BERRY_SOUL_WALL_TORCH.get();
        BlockModelBuilder glow_berry_soul_wall_torch_model = models()
        .withExistingParent("glow_berry_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", glow_berry_soul_wall_torch_texture)
        .texture("particle", glow_berry_soul_wall_torch_texture);
        getVariantBuilder(glow_berry_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("glow_berry_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", glow_berry_soul_wall_torch_texture)
                    .texture("particle", glow_berry_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............melon
       //regular
        TorchBlock melon_torch = foodblockregistry.MELON_TORCH.get();
        ResourceLocation melon_torch_texture = modLoc("block/melon_torch");
        BlockModelBuilder melon_torch_model = models()
        .withExistingParent("melon_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", melon_torch_texture)
        .texture("particle", melon_torch_texture);

        simpleBlock(melon_torch, melon_torch_model);

        TorchBlock melon_wall_torch = foodblockregistry.MELON_WALL_TORCH.get();
        BlockModelBuilder melon_wall_torch_model = models()
        .withExistingParent("melon_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", melon_torch_texture)
        .texture("particle", melon_torch_texture);
        getVariantBuilder(melon_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("melon_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", melon_torch_texture)
                    .texture("particle", melon_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock melon_redstone_torch = foodblockregistry.MELON_REDSTONE_TORCH.get();
        ResourceLocation melon_redstone_torch_texture = modLoc("block/melon_redstone_torch");
        BlockModelBuilder melon_redstone_torch_model = models()
        .withExistingParent("melon_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", melon_redstone_torch_texture)
        .texture("particle", melon_redstone_torch_texture);
        

        simpleBlock(melon_redstone_torch, melon_redstone_torch_model);

        ResourceLocation melon_redstone_wall_torch_texture = modLoc("block/melon_redstone_torch");

        RedstoneTorchBlock melon_redstone_wall_torch = foodblockregistry.MELON_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder melon_redstone_wall_torch_model = models()
        .withExistingParent("melon_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", melon_redstone_wall_torch_texture)
        .texture("particle", melon_redstone_wall_torch_texture);
        getVariantBuilder(melon_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("melon_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", melon_redstone_wall_torch_texture)
                    .texture("particle", melon_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock melon_soul_torch = foodblockregistry.MELON_SOUL_TORCH.get();
        ResourceLocation melon_soul_torch_texture = modLoc("block/melon_soul_torch");
        BlockModelBuilder melon_soul_torch_model = models()
        .withExistingParent("melon_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", melon_soul_torch_texture)
        .texture("particle", melon_soul_torch_texture);
        

        simpleBlock(melon_soul_torch, melon_soul_torch_model);

        ResourceLocation melon_soul_wall_torch_texture = modLoc("block/melon_soul_torch");
        TorchBlock melon_soul_wall_torch = foodblockregistry.MELON_SOUL_WALL_TORCH.get();
        BlockModelBuilder melon_soul_wall_torch_model = models()
        .withExistingParent("melon_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", melon_soul_wall_torch_texture)
        .texture("particle", melon_soul_wall_torch_texture);
        getVariantBuilder(melon_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("melon_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", melon_soul_wall_torch_texture)
                    .texture("particle", melon_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............sweet_berry
       //regular
        TorchBlock sweet_berry_torch = foodblockregistry.SWEET_BERRY_TORCH.get();
        ResourceLocation sweet_berry_torch_texture = modLoc("block/sweet_berry_torch");
        BlockModelBuilder sweet_berry_torch_model = models()
        .withExistingParent("sweet_berry_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", sweet_berry_torch_texture)
        .texture("particle", sweet_berry_torch_texture);

        simpleBlock(sweet_berry_torch, sweet_berry_torch_model);

        TorchBlock sweet_berry_wall_torch = foodblockregistry.SWEET_BERRY_WALL_TORCH.get();
        BlockModelBuilder sweet_berry_wall_torch_model = models()
        .withExistingParent("sweet_berry_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", sweet_berry_torch_texture)
        .texture("particle", sweet_berry_torch_texture);
        getVariantBuilder(sweet_berry_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("sweet_berry_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", sweet_berry_torch_texture)
                    .texture("particle", sweet_berry_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock sweet_berry_redstone_torch = foodblockregistry.SWEET_BERRY_REDSTONE_TORCH.get();
        ResourceLocation sweet_berry_redstone_torch_texture = modLoc("block/sweet_berry_redstone_torch");
        BlockModelBuilder sweet_berry_redstone_torch_model = models()
        .withExistingParent("sweet_berry_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", sweet_berry_redstone_torch_texture)
        .texture("particle", sweet_berry_redstone_torch_texture);
        

        simpleBlock(sweet_berry_redstone_torch, sweet_berry_redstone_torch_model);

        ResourceLocation sweet_berry_redstone_wall_torch_texture = modLoc("block/sweet_berry_redstone_torch");

        RedstoneTorchBlock sweet_berry_redstone_wall_torch = foodblockregistry.SWEET_BERRY_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder sweet_berry_redstone_wall_torch_model = models()
        .withExistingParent("sweet_berry_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", sweet_berry_redstone_wall_torch_texture)
        .texture("particle", sweet_berry_redstone_wall_torch_texture);
        getVariantBuilder(sweet_berry_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("sweet_berry_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", sweet_berry_redstone_wall_torch_texture)
                    .texture("particle", sweet_berry_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock sweet_berry_soul_torch = foodblockregistry.SWEET_BERRY_SOUL_TORCH.get();
        ResourceLocation sweet_berry_soul_torch_texture = modLoc("block/sweet_berry_soul_torch");
        BlockModelBuilder sweet_berry_soul_torch_model = models()
        .withExistingParent("sweet_berry_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", sweet_berry_soul_torch_texture)
        .texture("particle", sweet_berry_soul_torch_texture);
        

        simpleBlock(sweet_berry_soul_torch, sweet_berry_soul_torch_model);

        ResourceLocation sweet_berry_soul_wall_torch_texture = modLoc("block/sweet_berry_soul_torch");
        TorchBlock sweet_berry_soul_wall_torch = foodblockregistry.SWEET_BERRY_SOUL_WALL_TORCH.get();
        BlockModelBuilder sweet_berry_soul_wall_torch_model = models()
        .withExistingParent("sweet_berry_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", sweet_berry_soul_wall_torch_texture)
        .texture("particle", sweet_berry_soul_wall_torch_texture);
        getVariantBuilder(sweet_berry_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("sweet_berry_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", sweet_berry_soul_wall_torch_texture)
                    .texture("particle", sweet_berry_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............brown_mushroom
       //regular
        TorchBlock brown_mushroom_torch = foodblockregistry.BROWN_MUSHROOM_TORCH.get();
        ResourceLocation brown_mushroom_torch_texture = modLoc("block/brown_mushroom_torch");
        BlockModelBuilder brown_mushroom_torch_model = models()
        .withExistingParent("brown_mushroom_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", brown_mushroom_torch_texture)
        .texture("particle", brown_mushroom_torch_texture);

        simpleBlock(brown_mushroom_torch, brown_mushroom_torch_model);

        TorchBlock brown_mushroom_wall_torch = foodblockregistry.BROWN_MUSHROOM_WALL_TORCH.get();
        BlockModelBuilder brown_mushroom_wall_torch_model = models()
        .withExistingParent("brown_mushroom_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", brown_mushroom_torch_texture)
        .texture("particle", brown_mushroom_torch_texture);
        getVariantBuilder(brown_mushroom_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("brown_mushroom_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", brown_mushroom_torch_texture)
                    .texture("particle", brown_mushroom_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock brown_mushroom_redstone_torch = foodblockregistry.BROWN_MUSHROOM_REDSTONE_TORCH.get();
        ResourceLocation brown_mushroom_redstone_torch_texture = modLoc("block/brown_mushroom_redstone_torch");
        BlockModelBuilder brown_mushroom_redstone_torch_model = models()
        .withExistingParent("brown_mushroom_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", brown_mushroom_redstone_torch_texture)
        .texture("particle", brown_mushroom_redstone_torch_texture);
        

        simpleBlock(brown_mushroom_redstone_torch, brown_mushroom_redstone_torch_model);

        ResourceLocation brown_mushroom_redstone_wall_torch_texture = modLoc("block/brown_mushroom_redstone_torch");

        RedstoneTorchBlock brown_mushroom_redstone_wall_torch = foodblockregistry.BROWN_MUSHROOM_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder brown_mushroom_redstone_wall_torch_model = models()
        .withExistingParent("brown_mushroom_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", brown_mushroom_redstone_wall_torch_texture)
        .texture("particle", brown_mushroom_redstone_wall_torch_texture);
        getVariantBuilder(brown_mushroom_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("brown_mushroom_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", brown_mushroom_redstone_wall_torch_texture)
                    .texture("particle", brown_mushroom_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock brown_mushroom_soul_torch = foodblockregistry.BROWN_MUSHROOM_SOUL_TORCH.get();
        ResourceLocation brown_mushroom_soul_torch_texture = modLoc("block/brown_mushroom_soul_torch");
        BlockModelBuilder brown_mushroom_soul_torch_model = models()
        .withExistingParent("brown_mushroom_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", brown_mushroom_soul_torch_texture)
        .texture("particle", brown_mushroom_soul_torch_texture);
        

        simpleBlock(brown_mushroom_soul_torch, brown_mushroom_soul_torch_model);

        ResourceLocation brown_mushroom_soul_wall_torch_texture = modLoc("block/brown_mushroom_soul_torch");
        TorchBlock brown_mushroom_soul_wall_torch = foodblockregistry.BROWN_MUSHROOM_SOUL_WALL_TORCH.get();
        BlockModelBuilder brown_mushroom_soul_wall_torch_model = models()
        .withExistingParent("brown_mushroom_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", brown_mushroom_soul_wall_torch_texture)
        .texture("particle", brown_mushroom_soul_wall_torch_texture);
        getVariantBuilder(brown_mushroom_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("brown_mushroom_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", brown_mushroom_soul_wall_torch_texture)
                    .texture("particle", brown_mushroom_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............red_mushroom
       //regular
        TorchBlock red_mushroom_torch = foodblockregistry.RED_MUSHROOM_TORCH.get();
        ResourceLocation red_mushroom_torch_texture = modLoc("block/red_mushroom_torch");
        BlockModelBuilder red_mushroom_torch_model = models()
        .withExistingParent("red_mushroom_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", red_mushroom_torch_texture)
        .texture("particle", red_mushroom_torch_texture);

        simpleBlock(red_mushroom_torch, red_mushroom_torch_model);

        TorchBlock red_mushroom_wall_torch = foodblockregistry.RED_MUSHROOM_WALL_TORCH.get();
        BlockModelBuilder red_mushroom_wall_torch_model = models()
        .withExistingParent("red_mushroom_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", red_mushroom_torch_texture)
        .texture("particle", red_mushroom_torch_texture);
        getVariantBuilder(red_mushroom_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("red_mushroom_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", red_mushroom_torch_texture)
                    .texture("particle", red_mushroom_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock red_mushroom_redstone_torch = foodblockregistry.RED_MUSHROOM_REDSTONE_TORCH.get();
        ResourceLocation red_mushroom_redstone_torch_texture = modLoc("block/red_mushroom_redstone_torch");
        BlockModelBuilder red_mushroom_redstone_torch_model = models()
        .withExistingParent("red_mushroom_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", red_mushroom_redstone_torch_texture)
        .texture("particle", red_mushroom_redstone_torch_texture);
        

        simpleBlock(red_mushroom_redstone_torch, red_mushroom_redstone_torch_model);

        ResourceLocation red_mushroom_redstone_wall_torch_texture = modLoc("block/red_mushroom_redstone_torch");

        RedstoneTorchBlock red_mushroom_redstone_wall_torch = foodblockregistry.RED_MUSHROOM_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder red_mushroom_redstone_wall_torch_model = models()
        .withExistingParent("red_mushroom_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", red_mushroom_redstone_wall_torch_texture)
        .texture("particle", red_mushroom_redstone_wall_torch_texture);
        getVariantBuilder(red_mushroom_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("red_mushroom_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", red_mushroom_redstone_wall_torch_texture)
                    .texture("particle", red_mushroom_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock red_mushroom_soul_torch = foodblockregistry.RED_MUSHROOM_SOUL_TORCH.get();
        ResourceLocation red_mushroom_soul_torch_texture = modLoc("block/red_mushroom_soul_torch");
        BlockModelBuilder red_mushroom_soul_torch_model = models()
        .withExistingParent("red_mushroom_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", red_mushroom_soul_torch_texture)
        .texture("particle", red_mushroom_soul_torch_texture);
        

        simpleBlock(red_mushroom_soul_torch, red_mushroom_soul_torch_model);

        ResourceLocation red_mushroom_soul_wall_torch_texture = modLoc("block/red_mushroom_soul_torch");
        TorchBlock red_mushroom_soul_wall_torch = foodblockregistry.RED_MUSHROOM_SOUL_WALL_TORCH.get();
        BlockModelBuilder red_mushroom_soul_wall_torch_model = models()
        .withExistingParent("red_mushroom_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", red_mushroom_soul_wall_torch_texture)
        .texture("particle", red_mushroom_soul_wall_torch_texture);
        getVariantBuilder(red_mushroom_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("red_mushroom_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", red_mushroom_soul_wall_torch_texture)
                    .texture("particle", red_mushroom_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............pumpkin
       //regular
        TorchBlock pumpkin_torch = foodblockregistry.PUMPKIN_TORCH.get();
        ResourceLocation pumpkin_torch_texture = modLoc("block/pumpkin_torch");
        BlockModelBuilder pumpkin_torch_model = models()
        .withExistingParent("pumpkin_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pumpkin_torch_texture)
        .texture("particle", pumpkin_torch_texture);

        simpleBlock(pumpkin_torch, pumpkin_torch_model);

        TorchBlock pumpkin_wall_torch = foodblockregistry.PUMPKIN_WALL_TORCH.get();
        BlockModelBuilder pumpkin_wall_torch_model = models()
        .withExistingParent("pumpkin_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pumpkin_torch_texture)
        .texture("particle", pumpkin_torch_texture);
        getVariantBuilder(pumpkin_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pumpkin_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pumpkin_torch_texture)
                    .texture("particle", pumpkin_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock pumpkin_redstone_torch = foodblockregistry.PUMPKIN_REDSTONE_TORCH.get();
        ResourceLocation pumpkin_redstone_torch_texture = modLoc("block/pumpkin_redstone_torch");
        BlockModelBuilder pumpkin_redstone_torch_model = models()
        .withExistingParent("pumpkin_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pumpkin_redstone_torch_texture)
        .texture("particle", pumpkin_redstone_torch_texture);
        

        simpleBlock(pumpkin_redstone_torch, pumpkin_redstone_torch_model);

        ResourceLocation pumpkin_redstone_wall_torch_texture = modLoc("block/pumpkin_redstone_torch");

        RedstoneTorchBlock pumpkin_redstone_wall_torch = foodblockregistry.PUMPKIN_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder pumpkin_redstone_wall_torch_model = models()
        .withExistingParent("pumpkin_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pumpkin_redstone_wall_torch_texture)
        .texture("particle", pumpkin_redstone_wall_torch_texture);
        getVariantBuilder(pumpkin_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pumpkin_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pumpkin_redstone_wall_torch_texture)
                    .texture("particle", pumpkin_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock pumpkin_soul_torch = foodblockregistry.PUMPKIN_SOUL_TORCH.get();
        ResourceLocation pumpkin_soul_torch_texture = modLoc("block/pumpkin_soul_torch");
        BlockModelBuilder pumpkin_soul_torch_model = models()
        .withExistingParent("pumpkin_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pumpkin_soul_torch_texture)
        .texture("particle", pumpkin_soul_torch_texture);
        

        simpleBlock(pumpkin_soul_torch, pumpkin_soul_torch_model);

        ResourceLocation pumpkin_soul_wall_torch_texture = modLoc("block/pumpkin_soul_torch");
        TorchBlock pumpkin_soul_wall_torch = foodblockregistry.PUMPKIN_SOUL_WALL_TORCH.get();
        BlockModelBuilder pumpkin_soul_wall_torch_model = models()
        .withExistingParent("pumpkin_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pumpkin_soul_wall_torch_texture)
        .texture("particle", pumpkin_soul_wall_torch_texture);
        getVariantBuilder(pumpkin_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pumpkin_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pumpkin_soul_wall_torch_texture)
                    .texture("particle", pumpkin_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
            
      //.............chicken
       //regular
        TorchBlock chicken_torch = foodblockregistry.CHICKEN_TORCH.get();
        ResourceLocation chicken_torch_texture = modLoc("block/chicken_torch");
        BlockModelBuilder chicken_torch_model = models()
        .withExistingParent("chicken_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chicken_torch_texture)
        .texture("particle", chicken_torch_texture);

        simpleBlock(chicken_torch, chicken_torch_model);

        TorchBlock chicken_wall_torch = foodblockregistry.CHICKEN_WALL_TORCH.get();
        BlockModelBuilder chicken_wall_torch_model = models()
        .withExistingParent("chicken_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chicken_torch_texture)
        .texture("particle", chicken_torch_texture);
        getVariantBuilder(chicken_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("chicken_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", chicken_torch_texture)
                    .texture("particle", chicken_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock chicken_redstone_torch = foodblockregistry.CHICKEN_REDSTONE_TORCH.get();
        ResourceLocation chicken_redstone_torch_texture = modLoc("block/chicken_redstone_torch");
        BlockModelBuilder chicken_redstone_torch_model = models()
        .withExistingParent("chicken_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chicken_redstone_torch_texture)
        .texture("particle", chicken_redstone_torch_texture);
        

        simpleBlock(chicken_redstone_torch, chicken_redstone_torch_model);

        ResourceLocation chicken_redstone_wall_torch_texture = modLoc("block/chicken_redstone_torch");

        RedstoneTorchBlock chicken_redstone_wall_torch = foodblockregistry.CHICKEN_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder chicken_redstone_wall_torch_model = models()
        .withExistingParent("chicken_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chicken_redstone_wall_torch_texture)
        .texture("particle", chicken_redstone_wall_torch_texture);
        getVariantBuilder(chicken_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("chicken_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", chicken_redstone_wall_torch_texture)
                    .texture("particle", chicken_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock chicken_soul_torch = foodblockregistry.CHICKEN_SOUL_TORCH.get();
        ResourceLocation chicken_soul_torch_texture = modLoc("block/chicken_soul_torch");
        BlockModelBuilder chicken_soul_torch_model = models()
        .withExistingParent("chicken_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chicken_soul_torch_texture)
        .texture("particle", chicken_soul_torch_texture);
        

        simpleBlock(chicken_soul_torch, chicken_soul_torch_model);

        ResourceLocation chicken_soul_wall_torch_texture = modLoc("block/chicken_soul_torch");
        TorchBlock chicken_soul_wall_torch = foodblockregistry.CHICKEN_SOUL_WALL_TORCH.get();
        BlockModelBuilder chicken_soul_wall_torch_model = models()
        .withExistingParent("chicken_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", chicken_soul_wall_torch_texture)
        .texture("particle", chicken_soul_wall_torch_texture);
        getVariantBuilder(chicken_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("chicken_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", chicken_soul_wall_torch_texture)
                    .texture("particle", chicken_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............cod
       //regular
        TorchBlock cod_torch = foodblockregistry.COD_TORCH.get();
        ResourceLocation cod_torch_texture = modLoc("block/cod_torch");
        BlockModelBuilder cod_torch_model = models()
        .withExistingParent("cod_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cod_torch_texture)
        .texture("particle", cod_torch_texture);

        simpleBlock(cod_torch, cod_torch_model);

        TorchBlock cod_wall_torch = foodblockregistry.COD_WALL_TORCH.get();
        BlockModelBuilder cod_wall_torch_model = models()
        .withExistingParent("cod_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cod_torch_texture)
        .texture("particle", cod_torch_texture);
        getVariantBuilder(cod_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("cod_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", cod_torch_texture)
                    .texture("particle", cod_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock cod_redstone_torch = foodblockregistry.COD_REDSTONE_TORCH.get();
        ResourceLocation cod_redstone_torch_texture = modLoc("block/cod_redstone_torch");
        BlockModelBuilder cod_redstone_torch_model = models()
        .withExistingParent("cod_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cod_redstone_torch_texture)
        .texture("particle", cod_redstone_torch_texture);
        

        simpleBlock(cod_redstone_torch, cod_redstone_torch_model);

        ResourceLocation cod_redstone_wall_torch_texture = modLoc("block/cod_redstone_torch");

        RedstoneTorchBlock cod_redstone_wall_torch = foodblockregistry.COD_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder cod_redstone_wall_torch_model = models()
        .withExistingParent("cod_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cod_redstone_wall_torch_texture)
        .texture("particle", cod_redstone_wall_torch_texture);
        getVariantBuilder(cod_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("cod_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", cod_redstone_wall_torch_texture)
                    .texture("particle", cod_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock cod_soul_torch = foodblockregistry.COD_SOUL_TORCH.get();
        ResourceLocation cod_soul_torch_texture = modLoc("block/cod_soul_torch");
        BlockModelBuilder cod_soul_torch_model = models()
        .withExistingParent("cod_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cod_soul_torch_texture)
        .texture("particle", cod_soul_torch_texture);
        

        simpleBlock(cod_soul_torch, cod_soul_torch_model);

        ResourceLocation cod_soul_wall_torch_texture = modLoc("block/cod_soul_torch");
        TorchBlock cod_soul_wall_torch = foodblockregistry.COD_SOUL_WALL_TORCH.get();
        BlockModelBuilder cod_soul_wall_torch_model = models()
        .withExistingParent("cod_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cod_soul_wall_torch_texture)
        .texture("particle", cod_soul_wall_torch_texture);
        getVariantBuilder(cod_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("cod_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", cod_soul_wall_torch_texture)
                    .texture("particle", cod_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............salmon
       //regular
        TorchBlock salmon_torch = foodblockregistry.SALMON_TORCH.get();
        ResourceLocation salmon_torch_texture = modLoc("block/salmon_torch");
        BlockModelBuilder salmon_torch_model = models()
        .withExistingParent("salmon_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", salmon_torch_texture)
        .texture("particle", salmon_torch_texture);

        simpleBlock(salmon_torch, salmon_torch_model);

        TorchBlock salmon_wall_torch = foodblockregistry.SALMON_WALL_TORCH.get();
        BlockModelBuilder salmon_wall_torch_model = models()
        .withExistingParent("salmon_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", salmon_torch_texture)
        .texture("particle", salmon_torch_texture);
        getVariantBuilder(salmon_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("salmon_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", salmon_torch_texture)
                    .texture("particle", salmon_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock salmon_redstone_torch = foodblockregistry.SALMON_REDSTONE_TORCH.get();
        ResourceLocation salmon_redstone_torch_texture = modLoc("block/salmon_redstone_torch");
        BlockModelBuilder salmon_redstone_torch_model = models()
        .withExistingParent("salmon_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", salmon_redstone_torch_texture)
        .texture("particle", salmon_redstone_torch_texture);
        

        simpleBlock(salmon_redstone_torch, salmon_redstone_torch_model);

        ResourceLocation salmon_redstone_wall_torch_texture = modLoc("block/salmon_redstone_torch");

        RedstoneTorchBlock salmon_redstone_wall_torch = foodblockregistry.SALMON_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder salmon_redstone_wall_torch_model = models()
        .withExistingParent("salmon_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", salmon_redstone_wall_torch_texture)
        .texture("particle", salmon_redstone_wall_torch_texture);
        getVariantBuilder(salmon_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("salmon_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", salmon_redstone_wall_torch_texture)
                    .texture("particle", salmon_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock salmon_soul_torch = foodblockregistry.SALMON_SOUL_TORCH.get();
        ResourceLocation salmon_soul_torch_texture = modLoc("block/salmon_soul_torch");
        BlockModelBuilder salmon_soul_torch_model = models()
        .withExistingParent("salmon_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", salmon_soul_torch_texture)
        .texture("particle", salmon_soul_torch_texture);
        

        simpleBlock(salmon_soul_torch, salmon_soul_torch_model);

        ResourceLocation salmon_soul_wall_torch_texture = modLoc("block/salmon_soul_torch");
        TorchBlock salmon_soul_wall_torch = foodblockregistry.SALMON_SOUL_WALL_TORCH.get();
        BlockModelBuilder salmon_soul_wall_torch_model = models()
        .withExistingParent("salmon_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", salmon_soul_wall_torch_texture)
        .texture("particle", salmon_soul_wall_torch_texture);
        getVariantBuilder(salmon_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("salmon_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", salmon_soul_wall_torch_texture)
                    .texture("particle", salmon_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............tropical_fish
       //regular
        TorchBlock tropical_fish_torch = foodblockregistry.TROPICAL_FISH_TORCH.get();
        ResourceLocation tropical_fish_torch_texture = modLoc("block/tropical_fish_torch");
        BlockModelBuilder tropical_fish_torch_model = models()
        .withExistingParent("tropical_fish_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tropical_fish_torch_texture)
        .texture("particle", tropical_fish_torch_texture);

        simpleBlock(tropical_fish_torch, tropical_fish_torch_model);

        TorchBlock tropical_fish_wall_torch = foodblockregistry.TROPICAL_FISH_WALL_TORCH.get();
        BlockModelBuilder tropical_fish_wall_torch_model = models()
        .withExistingParent("tropical_fish_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tropical_fish_torch_texture)
        .texture("particle", tropical_fish_torch_texture);
        getVariantBuilder(tropical_fish_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("tropical_fish_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", tropical_fish_torch_texture)
                    .texture("particle", tropical_fish_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock tropical_fish_redstone_torch = foodblockregistry.TROPICAL_FISH_REDSTONE_TORCH.get();
        ResourceLocation tropical_fish_redstone_torch_texture = modLoc("block/tropical_fish_redstone_torch");
        BlockModelBuilder tropical_fish_redstone_torch_model = models()
        .withExistingParent("tropical_fish_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tropical_fish_redstone_torch_texture)
        .texture("particle", tropical_fish_redstone_torch_texture);
        

        simpleBlock(tropical_fish_redstone_torch, tropical_fish_redstone_torch_model);

        ResourceLocation tropical_fish_redstone_wall_torch_texture = modLoc("block/tropical_fish_redstone_torch");

        RedstoneTorchBlock tropical_fish_redstone_wall_torch = foodblockregistry.TROPICAL_FISH_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder tropical_fish_redstone_wall_torch_model = models()
        .withExistingParent("tropical_fish_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tropical_fish_redstone_wall_torch_texture)
        .texture("particle", tropical_fish_redstone_wall_torch_texture);
        getVariantBuilder(tropical_fish_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("tropical_fish_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", tropical_fish_redstone_wall_torch_texture)
                    .texture("particle", tropical_fish_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock tropical_fish_soul_torch = foodblockregistry.TROPICAL_FISH_SOUL_TORCH.get();
        ResourceLocation tropical_fish_soul_torch_texture = modLoc("block/tropical_fish_soul_torch");
        BlockModelBuilder tropical_fish_soul_torch_model = models()
        .withExistingParent("tropical_fish_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tropical_fish_soul_torch_texture)
        .texture("particle", tropical_fish_soul_torch_texture);
        

        simpleBlock(tropical_fish_soul_torch, tropical_fish_soul_torch_model);

        ResourceLocation tropical_fish_soul_wall_torch_texture = modLoc("block/tropical_fish_soul_torch");
        TorchBlock tropical_fish_soul_wall_torch = foodblockregistry.TROPICAL_FISH_SOUL_WALL_TORCH.get();
        BlockModelBuilder tropical_fish_soul_wall_torch_model = models()
        .withExistingParent("tropical_fish_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tropical_fish_soul_wall_torch_texture)
        .texture("particle", tropical_fish_soul_wall_torch_texture);
        getVariantBuilder(tropical_fish_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("tropical_fish_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", tropical_fish_soul_wall_torch_texture)
                    .texture("particle", tropical_fish_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............mutton
       //regular
        TorchBlock mutton_torch = foodblockregistry.MUTTON_TORCH.get();
        ResourceLocation mutton_torch_texture = modLoc("block/mutton_torch");
        BlockModelBuilder mutton_torch_model = models()
        .withExistingParent("mutton_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mutton_torch_texture)
        .texture("particle", mutton_torch_texture);

        simpleBlock(mutton_torch, mutton_torch_model);

        TorchBlock mutton_wall_torch = foodblockregistry.MUTTON_WALL_TORCH.get();
        BlockModelBuilder mutton_wall_torch_model = models()
        .withExistingParent("mutton_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mutton_torch_texture)
        .texture("particle", mutton_torch_texture);
        getVariantBuilder(mutton_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("mutton_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", mutton_torch_texture)
                    .texture("particle", mutton_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock mutton_redstone_torch = foodblockregistry.MUTTON_REDSTONE_TORCH.get();
        ResourceLocation mutton_redstone_torch_texture = modLoc("block/mutton_redstone_torch");
        BlockModelBuilder mutton_redstone_torch_model = models()
        .withExistingParent("mutton_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mutton_redstone_torch_texture)
        .texture("particle", mutton_redstone_torch_texture);
        

        simpleBlock(mutton_redstone_torch, mutton_redstone_torch_model);

        ResourceLocation mutton_redstone_wall_torch_texture = modLoc("block/mutton_redstone_torch");

        RedstoneTorchBlock mutton_redstone_wall_torch = foodblockregistry.MUTTON_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder mutton_redstone_wall_torch_model = models()
        .withExistingParent("mutton_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mutton_redstone_wall_torch_texture)
        .texture("particle", mutton_redstone_wall_torch_texture);
        getVariantBuilder(mutton_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("mutton_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", mutton_redstone_wall_torch_texture)
                    .texture("particle", mutton_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock mutton_soul_torch = foodblockregistry.MUTTON_SOUL_TORCH.get();
        ResourceLocation mutton_soul_torch_texture = modLoc("block/mutton_soul_torch");
        BlockModelBuilder mutton_soul_torch_model = models()
        .withExistingParent("mutton_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mutton_soul_torch_texture)
        .texture("particle", mutton_soul_torch_texture);
        

        simpleBlock(mutton_soul_torch, mutton_soul_torch_model);

        ResourceLocation mutton_soul_wall_torch_texture = modLoc("block/mutton_soul_torch");
        TorchBlock mutton_soul_wall_torch = foodblockregistry.MUTTON_SOUL_WALL_TORCH.get();
        BlockModelBuilder mutton_soul_wall_torch_model = models()
        .withExistingParent("mutton_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mutton_soul_wall_torch_texture)
        .texture("particle", mutton_soul_wall_torch_texture);
        getVariantBuilder(mutton_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("mutton_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", mutton_soul_wall_torch_texture)
                    .texture("particle", mutton_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............beef
       //regular
        TorchBlock beef_torch = foodblockregistry.BEEF_TORCH.get();
        ResourceLocation beef_torch_texture = modLoc("block/beef_torch");
        BlockModelBuilder beef_torch_model = models()
        .withExistingParent("beef_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beef_torch_texture)
        .texture("particle", beef_torch_texture);

        simpleBlock(beef_torch, beef_torch_model);

        TorchBlock beef_wall_torch = foodblockregistry.BEEF_WALL_TORCH.get();
        BlockModelBuilder beef_wall_torch_model = models()
        .withExistingParent("beef_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beef_torch_texture)
        .texture("particle", beef_torch_texture);
        getVariantBuilder(beef_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("beef_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", beef_torch_texture)
                    .texture("particle", beef_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock beef_redstone_torch = foodblockregistry.BEEF_REDSTONE_TORCH.get();
        ResourceLocation beef_redstone_torch_texture = modLoc("block/beef_redstone_torch");
        BlockModelBuilder beef_redstone_torch_model = models()
        .withExistingParent("beef_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beef_redstone_torch_texture)
        .texture("particle", beef_redstone_torch_texture);
        

        simpleBlock(beef_redstone_torch, beef_redstone_torch_model);

        ResourceLocation beef_redstone_wall_torch_texture = modLoc("block/beef_redstone_torch");

        RedstoneTorchBlock beef_redstone_wall_torch = foodblockregistry.BEEF_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder beef_redstone_wall_torch_model = models()
        .withExistingParent("beef_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beef_redstone_wall_torch_texture)
        .texture("particle", beef_redstone_wall_torch_texture);
        getVariantBuilder(beef_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("beef_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", beef_redstone_wall_torch_texture)
                    .texture("particle", beef_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock beef_soul_torch = foodblockregistry.BEEF_SOUL_TORCH.get();
        ResourceLocation beef_soul_torch_texture = modLoc("block/beef_soul_torch");
        BlockModelBuilder beef_soul_torch_model = models()
        .withExistingParent("beef_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beef_soul_torch_texture)
        .texture("particle", beef_soul_torch_texture);
        

        simpleBlock(beef_soul_torch, beef_soul_torch_model);

        ResourceLocation beef_soul_wall_torch_texture = modLoc("block/beef_soul_torch");
        TorchBlock beef_soul_wall_torch = foodblockregistry.BEEF_SOUL_WALL_TORCH.get();
        BlockModelBuilder beef_soul_wall_torch_model = models()
        .withExistingParent("beef_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", beef_soul_wall_torch_texture)
        .texture("particle", beef_soul_wall_torch_texture);
        getVariantBuilder(beef_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("beef_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", beef_soul_wall_torch_texture)
                    .texture("particle", beef_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

      //.............pork
       //regular
        TorchBlock pork_torch = foodblockregistry.PORK_TORCH.get();
        ResourceLocation pork_torch_texture = modLoc("block/pork_torch");
        BlockModelBuilder pork_torch_model = models()
        .withExistingParent("pork_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pork_torch_texture)
        .texture("particle", pork_torch_texture);

        simpleBlock(pork_torch, pork_torch_model);

        TorchBlock pork_wall_torch = foodblockregistry.PORK_WALL_TORCH.get();
        BlockModelBuilder pork_wall_torch_model = models()
        .withExistingParent("pork_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pork_torch_texture)
        .texture("particle", pork_torch_texture);
        getVariantBuilder(pork_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pork_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pork_torch_texture)
                    .texture("particle", pork_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock pork_redstone_torch = foodblockregistry.PORK_REDSTONE_TORCH.get();
        ResourceLocation pork_redstone_torch_texture = modLoc("block/pork_redstone_torch");
        BlockModelBuilder pork_redstone_torch_model = models()
        .withExistingParent("pork_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pork_redstone_torch_texture)
        .texture("particle", pork_redstone_torch_texture);
        

        simpleBlock(pork_redstone_torch, pork_redstone_torch_model);

        ResourceLocation pork_redstone_wall_torch_texture = modLoc("block/pork_redstone_torch");

        RedstoneTorchBlock pork_redstone_wall_torch = foodblockregistry.PORK_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder pork_redstone_wall_torch_model = models()
        .withExistingParent("pork_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pork_redstone_wall_torch_texture)
        .texture("particle", pork_redstone_wall_torch_texture);
        getVariantBuilder(pork_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pork_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pork_redstone_wall_torch_texture)
                    .texture("particle", pork_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock pork_soul_torch = foodblockregistry.PORK_SOUL_TORCH.get();
        ResourceLocation pork_soul_torch_texture = modLoc("block/pork_soul_torch");
        BlockModelBuilder pork_soul_torch_model = models()
        .withExistingParent("pork_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pork_soul_torch_texture)
        .texture("particle", pork_soul_torch_texture);
        

        simpleBlock(pork_soul_torch, pork_soul_torch_model);

        ResourceLocation pork_soul_wall_torch_texture = modLoc("block/pork_soul_torch");
        TorchBlock pork_soul_wall_torch = foodblockregistry.PORK_SOUL_WALL_TORCH.get();
        BlockModelBuilder pork_soul_wall_torch_model = models()
        .withExistingParent("pork_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pork_soul_wall_torch_texture)
        .texture("particle", pork_soul_wall_torch_texture);
        getVariantBuilder(pork_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pork_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pork_soul_wall_torch_texture)
                    .texture("particle", pork_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
            
      //.............rabbit
       //regular
        TorchBlock rabbit_torch = foodblockregistry.RABBIT_TORCH.get();
        ResourceLocation rabbit_torch_texture = modLoc("block/rabbit_torch");
        BlockModelBuilder rabbit_torch_model = models()
        .withExistingParent("rabbit_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", rabbit_torch_texture)
        .texture("particle", rabbit_torch_texture);

        simpleBlock(rabbit_torch, rabbit_torch_model);

        TorchBlock rabbit_wall_torch = foodblockregistry.RABBIT_WALL_TORCH.get();
        BlockModelBuilder rabbit_wall_torch_model = models()
        .withExistingParent("rabbit_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", rabbit_torch_texture)
        .texture("particle", rabbit_torch_texture);
        getVariantBuilder(rabbit_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("rabbit_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", rabbit_torch_texture)
                    .texture("particle", rabbit_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock rabbit_redstone_torch = foodblockregistry.RABBIT_REDSTONE_TORCH.get();
        ResourceLocation rabbit_redstone_torch_texture = modLoc("block/rabbit_redstone_torch");
        BlockModelBuilder rabbit_redstone_torch_model = models()
        .withExistingParent("rabbit_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", rabbit_redstone_torch_texture)
        .texture("particle", rabbit_redstone_torch_texture);
        

        simpleBlock(rabbit_redstone_torch, rabbit_redstone_torch_model);

        ResourceLocation rabbit_redstone_wall_torch_texture = modLoc("block/rabbit_redstone_torch");

        RedstoneTorchBlock rabbit_redstone_wall_torch = foodblockregistry.RABBIT_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder rabbit_redstone_wall_torch_model = models()
        .withExistingParent("rabbit_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", rabbit_redstone_wall_torch_texture)
        .texture("particle", rabbit_redstone_wall_torch_texture);
        getVariantBuilder(rabbit_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("rabbit_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", rabbit_redstone_wall_torch_texture)
                    .texture("particle", rabbit_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock rabbit_soul_torch = foodblockregistry.RABBIT_SOUL_TORCH.get();
        ResourceLocation rabbit_soul_torch_texture = modLoc("block/rabbit_soul_torch");
        BlockModelBuilder rabbit_soul_torch_model = models()
        .withExistingParent("rabbit_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", rabbit_soul_torch_texture)
        .texture("particle", rabbit_soul_torch_texture);
        

        simpleBlock(rabbit_soul_torch, rabbit_soul_torch_model);

        ResourceLocation rabbit_soul_wall_torch_texture = modLoc("block/rabbit_soul_torch");
        TorchBlock rabbit_soul_wall_torch = foodblockregistry.RABBIT_SOUL_WALL_TORCH.get();
        BlockModelBuilder rabbit_soul_wall_torch_model = models()
        .withExistingParent("rabbit_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", rabbit_soul_wall_torch_texture)
        .texture("particle", rabbit_soul_wall_torch_texture);
        getVariantBuilder(rabbit_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("rabbit_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", rabbit_soul_wall_torch_texture)
                    .texture("particle", rabbit_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
    //--------------------------------------------------------------furnaces------------------------------------------------------------------------------
        //.............apple
          FurnaceBlock apple_furnace = foodblockregistry.APPLE_FURNACE.get();
          ResourceLocation apple_furnace_unlit_texture = modLoc("block/apple_furnace_front_unlit");
          ResourceLocation apple_furnace_lit_texture = modLoc("block/apple_furnace_front_lit");
          ResourceLocation apple_furnace_side = modLoc("block/apple_block");
          
          // Define the model for the unlit state
          BlockModelBuilder apple_furnace_model_unlit = models()
              .withExistingParent("apple_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", apple_furnace_side)
              .texture("top", apple_furnace_side)
              .texture("front", apple_furnace_unlit_texture)
              .texture("particle", apple_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder apple_furnace_model_lit = models()
              .withExistingParent("apple_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", apple_furnace_side)
              .texture("top", apple_furnace_side)
              .texture("front", apple_furnace_lit_texture)
              .texture("particle", apple_furnace_side);
          
          // Configure variants for the apple_furnace block
          getVariantBuilder(apple_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/apple_furnace_model_lit") : modLoc("block/apple_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............potato
          FurnaceBlock potato_furnace = foodblockregistry.POTATO_FURNACE.get();
          ResourceLocation potato_furnace_unlit_texture = modLoc("block/potato_furnace_front_unlit");
          ResourceLocation potato_furnace_lit_texture = modLoc("block/potato_furnace_front_lit");
          ResourceLocation potato_furnace_side = modLoc("block/potato_block");
          
          // Define the model for the unlit state
          BlockModelBuilder potato_furnace_model_unlit = models()
              .withExistingParent("potato_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", potato_furnace_side)
              .texture("top", potato_furnace_side)
              .texture("front", potato_furnace_unlit_texture)
              .texture("particle", potato_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder potato_furnace_model_lit = models()
              .withExistingParent("potato_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", potato_furnace_side)
              .texture("top", potato_furnace_side)
              .texture("front", potato_furnace_lit_texture)
              .texture("particle", potato_furnace_side);
          
          // Configure variants for the potato_furnace block
          getVariantBuilder(potato_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/potato_furnace_model_lit") : modLoc("block/potato_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............beetroot
          FurnaceBlock beetroot_furnace = foodblockregistry.BEETROOT_FURNACE.get();
          ResourceLocation beetroot_furnace_unlit_texture = modLoc("block/beetroot_furnace_front_unlit");
          ResourceLocation beetroot_furnace_lit_texture = modLoc("block/beetroot_furnace_front_lit");
          ResourceLocation beetroot_furnace_side = modLoc("block/beetroot_block");
          
          // Define the model for the unlit state
          BlockModelBuilder beetroot_furnace_model_unlit = models()
              .withExistingParent("beetroot_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", beetroot_furnace_side)
              .texture("top", beetroot_furnace_side)
              .texture("front", beetroot_furnace_unlit_texture)
              .texture("particle", beetroot_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder beetroot_furnace_model_lit = models()
              .withExistingParent("beetroot_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", beetroot_furnace_side)
              .texture("top", beetroot_furnace_side)
              .texture("front", beetroot_furnace_lit_texture)
              .texture("particle", beetroot_furnace_side);
          
          // Configure variants for the beetroot_furnace block
          getVariantBuilder(beetroot_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/beetroot_furnace_model_lit") : modLoc("block/beetroot_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............carrot
          FurnaceBlock carrot_furnace = foodblockregistry.CARROT_FURNACE.get();
          ResourceLocation carrot_furnace_unlit_texture = modLoc("block/carrot_furnace_front_unlit");
          ResourceLocation carrot_furnace_lit_texture = modLoc("block/carrot_furnace_front_lit");
          ResourceLocation carrot_furnace_side = modLoc("block/carrot_block");
          
          // Define the model for the unlit state
          BlockModelBuilder carrot_furnace_model_unlit = models()
              .withExistingParent("carrot_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", carrot_furnace_side)
              .texture("top", carrot_furnace_side)
              .texture("front", carrot_furnace_unlit_texture)
              .texture("particle", carrot_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder carrot_furnace_model_lit = models()
              .withExistingParent("carrot_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", carrot_furnace_side)
              .texture("top", carrot_furnace_side)
              .texture("front", carrot_furnace_lit_texture)
              .texture("particle", carrot_furnace_side);
          
          // Configure variants for the carrot_furnace block
          getVariantBuilder(carrot_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/carrot_furnace_model_lit") : modLoc("block/carrot_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............chorus
          FurnaceBlock chorus_furnace = foodblockregistry.CHORUS_FURNACE.get();
          ResourceLocation chorus_furnace_unlit_texture = modLoc("block/chorus_furnace_front_unlit");
          ResourceLocation chorus_furnace_lit_texture = modLoc("block/chorus_furnace_front_lit");
          ResourceLocation chorus_furnace_side = modLoc("block/chorus_block");
          
          // Define the model for the unlit state
          BlockModelBuilder chorus_furnace_model_unlit = models()
              .withExistingParent("chorus_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", chorus_furnace_side)
              .texture("top", chorus_furnace_side)
              .texture("front", chorus_furnace_unlit_texture)
              .texture("particle", chorus_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder chorus_furnace_model_lit = models()
              .withExistingParent("chorus_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", chorus_furnace_side)
              .texture("top", chorus_furnace_side)
              .texture("front", chorus_furnace_lit_texture)
              .texture("particle", chorus_furnace_side);
          
          // Configure variants for the chorus_furnace block
          getVariantBuilder(chorus_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/chorus_furnace_model_lit") : modLoc("block/chorus_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............glowberry
          FurnaceBlock glowberry_furnace = foodblockregistry.GLOWBERRY_FURNACE.get();
          ResourceLocation glowberry_furnace_unlit_texture = modLoc("block/glow_berry_furnace_front_unlit");
          ResourceLocation glowberry_furnace_lit_texture = modLoc("block/glow_berry_furnace_front_lit");
          ResourceLocation glowberry_furnace_side = modLoc("block/glow_berry_block");
          
          // Define the model for the unlit state
          BlockModelBuilder glowberry_furnace_model_unlit = models()
              .withExistingParent("glowberry_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", glowberry_furnace_side)
              .texture("top", glowberry_furnace_side)
              .texture("front", glowberry_furnace_unlit_texture)
              .texture("particle", glowberry_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder glowberry_furnace_model_lit = models()
              .withExistingParent("glowberry_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", glowberry_furnace_side)
              .texture("top", glowberry_furnace_side)
              .texture("front", glowberry_furnace_lit_texture)
              .texture("particle", glowberry_furnace_side);
          
          // Configure variants for the glowberry_furnace block
          getVariantBuilder(glowberry_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/glowberry_furnace_model_lit") : modLoc("block/glowberry_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............melon
          FurnaceBlock melon_furnace = foodblockregistry.MELON_FURNACE.get();
          ResourceLocation melon_furnace_unlit_texture = modLoc("block/melon_furnace_front_unlit");
          ResourceLocation melon_furnace_lit_texture = modLoc("block/melon_furnace_front_lit");
          ResourceLocation melon_furnace_side = modLoc("block/melon_block");
          
          // Define the model for the unlit state
          BlockModelBuilder melon_furnace_model_unlit = models()
              .withExistingParent("melon_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", melon_furnace_side)
              .texture("top", melon_furnace_side)
              .texture("front", melon_furnace_unlit_texture)
              .texture("particle", melon_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder melon_furnace_model_lit = models()
              .withExistingParent("melon_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", melon_furnace_side)
              .texture("top", melon_furnace_side)
              .texture("front", melon_furnace_lit_texture)
              .texture("particle", melon_furnace_side);
          
          // Configure variants for the melon_furnace block
          getVariantBuilder(melon_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/melon_furnace_model_lit") : modLoc("block/melon_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............sweet_berry
          FurnaceBlock sweet_berry_furnace = foodblockregistry.SWEET_BERRY_FURNACE.get();
          ResourceLocation sweet_berry_furnace_unlit_texture = modLoc("block/sweet_berry_furnace_front_unlit");
          ResourceLocation sweet_berry_furnace_lit_texture = modLoc("block/sweet_berry_furnace_front_lit");
          ResourceLocation sweet_berry_furnace_side = modLoc("block/sweet_berry_block");
          
          // Define the model for the unlit state
          BlockModelBuilder sweet_berry_furnace_model_unlit = models()
              .withExistingParent("sweet_berry_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", sweet_berry_furnace_side)
              .texture("top", sweet_berry_furnace_side)
              .texture("front", sweet_berry_furnace_unlit_texture)
              .texture("particle", sweet_berry_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder sweet_berry_furnace_model_lit = models()
              .withExistingParent("sweet_berry_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", sweet_berry_furnace_side)
              .texture("top", sweet_berry_furnace_side)
              .texture("front", sweet_berry_furnace_lit_texture)
              .texture("particle", sweet_berry_furnace_side);
          
          // Configure variants for the sweet_berry_furnace block
          getVariantBuilder(sweet_berry_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/sweet_berry_furnace_model_lit") : modLoc("block/sweet_berry_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
              
        //.............brown_mushroom
          FurnaceBlock brown_mushroom_furnace = foodblockregistry.BROWN_MUSHROOM_FURNACE.get();
          ResourceLocation brown_mushroom_furnace_unlit_texture = modLoc("block/brown_mushroom_furnace_front_unlit");
          ResourceLocation brown_mushroom_furnace_lit_texture = modLoc("block/brown_mushroom_furnace_front_lit");
          ResourceLocation brown_mushroom_furnace_side = modLoc("block/brown_mushroom_block");
          
          // Define the model for the unlit state
          BlockModelBuilder brown_mushroom_furnace_model_unlit = models()
              .withExistingParent("brown_mushroom_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", brown_mushroom_furnace_side)
              .texture("top", brown_mushroom_furnace_side)
              .texture("front", brown_mushroom_furnace_unlit_texture)
              .texture("particle", brown_mushroom_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder brown_mushroom_furnace_model_lit = models()
              .withExistingParent("brown_mushroom_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", brown_mushroom_furnace_side)
              .texture("top", brown_mushroom_furnace_side)
              .texture("front", brown_mushroom_furnace_lit_texture)
              .texture("particle", brown_mushroom_furnace_side);
          
          // Configure variants for the brown_mushroom_furnace block
          getVariantBuilder(brown_mushroom_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/brown_mushroom_furnace_model_lit") : modLoc("block/brown_mushroom_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
        //.............red_mushroom
          FurnaceBlock red_mushroom_furnace = foodblockregistry.RED_MUSHROOM_FURNACE.get();
          ResourceLocation red_mushroom_furnace_unlit_texture = modLoc("block/red_mushroom_furnace_front_unlit");
          ResourceLocation red_mushroom_furnace_lit_texture = modLoc("block/red_mushroom_furnace_front_lit");
          ResourceLocation red_mushroom_furnace_side = modLoc("block/red_mushroom_block");
          
          // Define the model for the unlit state
          BlockModelBuilder red_mushroom_furnace_model_unlit = models()
              .withExistingParent("red_mushroom_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", red_mushroom_furnace_side)
              .texture("top", red_mushroom_furnace_side)
              .texture("front", red_mushroom_furnace_unlit_texture)
              .texture("particle", red_mushroom_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder red_mushroom_furnace_model_lit = models()
              .withExistingParent("red_mushroom_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", red_mushroom_furnace_side)
              .texture("top", red_mushroom_furnace_side)
              .texture("front", red_mushroom_furnace_lit_texture)
              .texture("particle", red_mushroom_furnace_side);
          
          // Configure variants for the red_mushroom_furnace block
          getVariantBuilder(red_mushroom_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/red_mushroom_furnace_model_lit") : modLoc("block/red_mushroom_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............pumpkin
          FurnaceBlock pumpkin_furnace = foodblockregistry.PUMPKIN_FURNACE.get();
          ResourceLocation pumpkin_furnace_unlit_texture = modLoc("block/pumpkin_furnace_front_unlit");
          ResourceLocation pumpkin_furnace_lit_texture = modLoc("block/pumpkin_furnace_front_lit");
          ResourceLocation pumpkin_furnace_side = modLoc("block/pumpkin_block");
          
          // Define the model for the unlit state
          BlockModelBuilder pumpkin_furnace_model_unlit = models()
              .withExistingParent("pumpkin_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", pumpkin_furnace_side)
              .texture("top", pumpkin_furnace_side)
              .texture("front", pumpkin_furnace_unlit_texture)
              .texture("particle", pumpkin_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder pumpkin_furnace_model_lit = models()
              .withExistingParent("pumpkin_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", pumpkin_furnace_side)
              .texture("top", pumpkin_furnace_side)
              .texture("front", pumpkin_furnace_lit_texture)
              .texture("particle", pumpkin_furnace_side);
          
          // Configure variants for the pumpkin_furnace block
          getVariantBuilder(pumpkin_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/pumpkin_furnace_model_lit") : modLoc("block/pumpkin_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............chicken
          FurnaceBlock chicken_furnace = foodblockregistry.CHICKEN_FURNACE.get();
          ResourceLocation chicken_furnace_unlit_texture = modLoc("block/chicken_furnace_front_unlit");
          ResourceLocation chicken_furnace_lit_texture = modLoc("block/chicken_furnace_front_lit");
          ResourceLocation chicken_furnace_side = modLoc("block/chicken_block");
          
          // Define the model for the unlit state
          BlockModelBuilder chicken_furnace_model_unlit = models()
              .withExistingParent("chicken_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", chicken_furnace_side)
              .texture("top", chicken_furnace_side)
              .texture("front", chicken_furnace_unlit_texture)
              .texture("particle", chicken_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder chicken_furnace_model_lit = models()
              .withExistingParent("chicken_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", chicken_furnace_side)
              .texture("top", chicken_furnace_side)
              .texture("front", chicken_furnace_lit_texture)
              .texture("particle", chicken_furnace_side);
          
          // Configure variants for the chicken_furnace block
          getVariantBuilder(chicken_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/chicken_furnace_model_lit") : modLoc("block/chicken_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............cod
          FurnaceBlock cod_furnace = foodblockregistry.COD_FURNACE.get();
          ResourceLocation cod_furnace_unlit_texture = modLoc("block/cod_furnace_front_unlit");
          ResourceLocation cod_furnace_lit_texture = modLoc("block/cod_furnace_front_lit");
          ResourceLocation cod_furnace_side = modLoc("block/cod_block");
          
          // Define the model for the unlit state
          BlockModelBuilder cod_furnace_model_unlit = models()
              .withExistingParent("cod_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", cod_furnace_side)
              .texture("top", cod_furnace_side)
              .texture("front", cod_furnace_unlit_texture)
              .texture("particle", cod_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder cod_furnace_model_lit = models()
              .withExistingParent("cod_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", cod_furnace_side)
              .texture("top", cod_furnace_side)
              .texture("front", cod_furnace_lit_texture)
              .texture("particle", cod_furnace_side);
          
          // Configure variants for the cod_furnace block
          getVariantBuilder(cod_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/cod_furnace_model_lit") : modLoc("block/cod_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............salmon
          FurnaceBlock salmon_furnace = foodblockregistry.SALMON_FURNACE.get();
          ResourceLocation salmon_furnace_unlit_texture = modLoc("block/salmon_furnace_front_unlit");
          ResourceLocation salmon_furnace_lit_texture = modLoc("block/salmon_furnace_front_lit");
          ResourceLocation salmon_furnace_side = modLoc("block/salmon_block");
          
          // Define the model for the unlit state
          BlockModelBuilder salmon_furnace_model_unlit = models()
              .withExistingParent("salmon_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", salmon_furnace_side)
              .texture("top", salmon_furnace_side)
              .texture("front", salmon_furnace_unlit_texture)
              .texture("particle", salmon_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder salmon_furnace_model_lit = models()
              .withExistingParent("salmon_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", salmon_furnace_side)
              .texture("top", salmon_furnace_side)
              .texture("front", salmon_furnace_lit_texture)
              .texture("particle", salmon_furnace_side);
          
          // Configure variants for the salmon_furnace block
          getVariantBuilder(salmon_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/salmon_furnace_model_lit") : modLoc("block/salmon_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
              
        //.............tropical_fish
          FurnaceBlock tropical_fish_furnace = foodblockregistry.TROPICAL_FISH_FURNACE.get();
          ResourceLocation tropical_fish_furnace_unlit_texture = modLoc("block/tropical_fish_furnace_front_unlit");
          ResourceLocation tropical_fish_furnace_lit_texture = modLoc("block/tropical_fish_furnace_front_lit");
          ResourceLocation tropical_fish_furnace_side = modLoc("block/tropical_fish_block");
          
          // Define the model for the unlit state
          BlockModelBuilder tropical_fish_furnace_model_unlit = models()
              .withExistingParent("tropical_fish_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", tropical_fish_furnace_side)
              .texture("top", tropical_fish_furnace_side)
              .texture("front", tropical_fish_furnace_unlit_texture)
              .texture("particle", tropical_fish_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder tropical_fish_furnace_model_lit = models()
              .withExistingParent("tropical_fish_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", tropical_fish_furnace_side)
              .texture("top", tropical_fish_furnace_side)
              .texture("front", tropical_fish_furnace_lit_texture)
              .texture("particle", tropical_fish_furnace_side);
          
          // Configure variants for the tropical_fish_furnace block
          getVariantBuilder(tropical_fish_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/tropical_fish_furnace_model_lit") : modLoc("block/tropical_fish_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............mutton
          FurnaceBlock mutton_furnace = foodblockregistry.MUTTON_FURNACE.get();
          ResourceLocation mutton_furnace_unlit_texture = modLoc("block/mutton_furnace_front_unlit");
          ResourceLocation mutton_furnace_lit_texture = modLoc("block/mutton_furnace_front_lit");
          ResourceLocation mutton_furnace_side = modLoc("block/mutton_block");
          
          // Define the model for the unlit state
          BlockModelBuilder mutton_furnace_model_unlit = models()
              .withExistingParent("mutton_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", mutton_furnace_side)
              .texture("top", mutton_furnace_side)
              .texture("front", mutton_furnace_unlit_texture)
              .texture("particle", mutton_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder mutton_furnace_model_lit = models()
              .withExistingParent("mutton_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", mutton_furnace_side)
              .texture("top", mutton_furnace_side)
              .texture("front", mutton_furnace_lit_texture)
              .texture("particle", mutton_furnace_side);
          
          // Configure variants for the mutton_furnace block
          getVariantBuilder(mutton_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/mutton_furnace_model_lit") : modLoc("block/mutton_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
              
        //.............beef
          FurnaceBlock beef_furnace = foodblockregistry.BEEF_FURNACE.get();
          ResourceLocation beef_furnace_unlit_texture = modLoc("block/beef_furnace_front_unlit");
          ResourceLocation beef_furnace_lit_texture = modLoc("block/beef_furnace_front_lit");
          ResourceLocation beef_furnace_side = modLoc("block/beef_block");
          
          // Define the model for the unlit state
          BlockModelBuilder beef_furnace_model_unlit = models()
              .withExistingParent("beef_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", beef_furnace_side)
              .texture("top", beef_furnace_side)
              .texture("front", beef_furnace_unlit_texture)
              .texture("particle", beef_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder beef_furnace_model_lit = models()
              .withExistingParent("beef_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", beef_furnace_side)
              .texture("top", beef_furnace_side)
              .texture("front", beef_furnace_lit_texture)
              .texture("particle", beef_furnace_side);
          
          // Configure variants for the beef_furnace block
          getVariantBuilder(beef_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/beef_furnace_model_lit") : modLoc("block/beef_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });

        //.............pork
          FurnaceBlock pork_furnace = foodblockregistry.PORK_FURNACE.get();
          ResourceLocation pork_furnace_unlit_texture = modLoc("block/pork_furnace_front_unlit");
          ResourceLocation pork_furnace_lit_texture = modLoc("block/pork_furnace_front_lit");
          ResourceLocation pork_furnace_side = modLoc("block/pork_block");
          
          // Define the model for the unlit state
          BlockModelBuilder pork_furnace_model_unlit = models()
              .withExistingParent("pork_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", pork_furnace_side)
              .texture("top", pork_furnace_side)
              .texture("front", pork_furnace_unlit_texture)
              .texture("particle", pork_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder pork_furnace_model_lit = models()
              .withExistingParent("pork_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", pork_furnace_side)
              .texture("top", pork_furnace_side)
              .texture("front", pork_furnace_lit_texture)
              .texture("particle", pork_furnace_side);
          
          // Configure variants for the pork_furnace block
          getVariantBuilder(pork_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/pork_furnace_model_lit") : modLoc("block/pork_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
              
        //.............rabbit
          FurnaceBlock rabbit_furnace = foodblockregistry.RABBIT_FURNACE.get();
          ResourceLocation rabbit_furnace_unlit_texture = modLoc("block/rabbit_furnace_front_unlit");
          ResourceLocation rabbit_furnace_lit_texture = modLoc("block/rabbit_furnace_front_lit");
          ResourceLocation rabbit_furnace_side = modLoc("block/rabbit_block");
          
          // Define the model for the unlit state
          BlockModelBuilder rabbit_furnace_model_unlit = models()
              .withExistingParent("rabbit_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", rabbit_furnace_side)
              .texture("top", rabbit_furnace_side)
              .texture("front", rabbit_furnace_unlit_texture)
              .texture("particle", rabbit_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder rabbit_furnace_model_lit = models()
              .withExistingParent("rabbit_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", rabbit_furnace_side)
              .texture("top", rabbit_furnace_side)
              .texture("front", rabbit_furnace_lit_texture)
              .texture("particle", rabbit_furnace_side);
          
          // Configure variants for the rabbit_furnace block
          getVariantBuilder(rabbit_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/rabbit_furnace_model_lit") : modLoc("block/rabbit_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
   };
}
    
