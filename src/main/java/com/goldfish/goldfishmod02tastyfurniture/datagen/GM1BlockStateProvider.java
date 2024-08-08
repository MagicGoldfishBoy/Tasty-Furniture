package com.goldfish.goldfishmod02tastyfurniture.datagen;

import net.minecraft.data.BlockFamily;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
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

     public GM1BlockStateProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
         super(output, modid, exFileHelper);
     }

     @Override
     protected void registerStatesAndModels() {
        ModelFile door_bottom_left_model = models().withExistingParent("minecraft:block/door_bottom_left", "minecraft:block/door_bottom_left");
        ResourceLocation beetTexture = modLoc("block/beetroot_block");
        final Map<Block, BlockFamily> MAP = Maps.newHashMap();
    //     final BlockFamily APPLE_BLOCK = familyBuilder(foodblockregistry.APPLE_BLOCK).button(foodblockregistry.APPLE_BUTTON).fence(foodblockregistry.APPLE_FENCE).fenceGate(foodblockregistry.APPLE_FENCE_GATE).pressurePlate(foodblockregistry.APPLE_PRESSURE_PLATE).sign(foodblockregistry.APPLE_SIGN, foodblockregistry.APPLE_WALL_SIGN).slab(foodblockregistry.APPLE_SLAB).stairs(foodblockregistry.APPLE_STAIRS).door(foodblockregistry.APPLE_DOOR_BLOCK).trapdoor(foodblockregistry.APPLE_TRAPDOOR).recipeGroupPrefix("apple").recipeUnlockedBy("has_planks").getFamily();
    //  }

    // private Object familyBuilder(
    //         DeferredHolder<net.minecraft.world.level.block.Block, net.minecraft.world.level.block.Block> appleBlock) {
    //     throw new UnsupportedOperationException("Unimplemented method 'familyBuilder'");
    // }
}}
    
