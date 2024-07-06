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

import com.goldfish.goldfishmod02tastyfurniture.*;
import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

import java.util.function.Supplier;

public class ingotregistry {
    public static final DeferredRegister<Item> FOODINGOT = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurniture.MODID);
    
    public static final DeferredHolder<Item, Item> APPLE_INGOT = FOODINGOT.register("apple_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> POTATO_INGOT = FOODINGOT.register("potato_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> BEETROOT_INGOT = FOODINGOT.register("beetroot_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> CARROT_INGOT = FOODINGOT.register("carrot_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> CHORUS_INGOT = FOODINGOT.register("chorus_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> GLOW_BERRY_INGOT = FOODINGOT.register("glow_berry_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> MELON_INGOT = FOODINGOT.register("melon_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> SWEET_BERRY_INGOT = FOODINGOT.register("sweet_berry_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> BROWN_MUSHROOM_INGOT = FOODINGOT.register("brown_mushroom_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> RED_MUSHROOM_INGOT = FOODINGOT.register("red_mushroom_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> PUMPKIN_INGOT = FOODINGOT.register("pumpkin_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> CHICKEN_INGOT = FOODINGOT.register("chicken_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> COD_INGOT = FOODINGOT.register("cod_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> SALMON_INGOT = FOODINGOT.register("salmon_ingot",
    () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> TROPICAL_FISH_INGOT = FOODINGOT.register("tropical_fish_ingot",
    () -> new Item(new Item.Properties()));
}
