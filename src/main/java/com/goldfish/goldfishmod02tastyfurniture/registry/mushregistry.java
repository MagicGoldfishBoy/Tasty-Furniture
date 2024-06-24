package com.goldfish.goldfishmod02tastyfurniture.registry;

import org.slf4j.Logger;

import com.mojang.datafixers.types.templates.List;
import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

import net.neoforged.neoforge.registries.DeferredHolder;

import com.goldfish.goldfishmod02tastyfurniture.item.mushhammer;
import com.goldfish.goldfishmod02tastyfurniture.*;
import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

import java.util.function.Supplier;

public class mushregistry {

    public static final DeferredRegister<Item> MUSH = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurniture.MODID);

    public static final Supplier<Item> mushhammer = MUSH.register("mush_hammer", () -> new mushhammer((new Item.Properties().stacksTo(1))));

    public static final DeferredHolder<Item, Item> APPLE_MUSH = MUSH.register("apple_mush",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
    
    public static final DeferredHolder<Item, Item> POTATO_MUSH = MUSH.register("potato_mush",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

    public static final DeferredHolder<Item, Item> BEETROOT_MUSH = MUSH.register("beetroot_mush",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
  
            
    }

