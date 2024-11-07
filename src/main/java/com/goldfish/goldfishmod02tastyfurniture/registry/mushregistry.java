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
import com.goldfish.goldfishmod02tastyfurniture.item.meatgrinder;
import com.goldfish.goldfishmod02tastyfurniture.*;
import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

import java.util.function.Supplier;

public class mushregistry {

    public static final DeferredRegister<Item> MUSH = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurniture.MODID);

      public static final Supplier<Item> mushhammer = MUSH.register("mush_hammer", () -> new mushhammer((new Item.Properties().stacksTo(1))));

      public static final Supplier<Item> advanced_mushhammer = MUSH.register("advanced_mush_hammer", () -> new mushhammer((new Item.Properties().stacksTo(1))));

      public static final Supplier<Item> more_advanced_mushhammer = MUSH.register("more_advanced_mush_hammer", () -> new mushhammer((new Item.Properties().stacksTo(1))));

      public static final Supplier<Item> most_advanced_mushhammer = MUSH.register("most_advanced_mush_hammer", () -> new mushhammer((new Item.Properties().stacksTo(1))));

        public static final DeferredHolder<Item, Item> APPLE_MUSH = MUSH.register("apple_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
        
        public static final DeferredHolder<Item, Item> POTATO_MUSH = MUSH.register("potato_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> BEETROOT_MUSH = MUSH.register("beetroot_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> CARROT_MUSH = MUSH.register("carrot_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> CHORUS_MUSH = MUSH.register("chorus_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> GLOWBERRY_MUSH = MUSH.register("glow_berry_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
        
        public static final DeferredHolder<Item, Item> MELON_MUSH = MUSH.register("melon_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
                
        public static final DeferredHolder<Item, Item> SWEETBERRY_MUSH = MUSH.register("sweet_berry_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> BROWN_MUSHROOM_MUSH = MUSH.register("brown_mushroom_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> RED_MUSHROOM_MUSH = MUSH.register("red_mushroom_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> PUMPKIN_MUSH = MUSH.register("pumpkin_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> HONEYCOMB_POWDER = MUSH.register("honeycomb_powder",
               () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
               .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

       public static final Supplier<Item> meatgrinder = MUSH.register("meatgrinder", () -> new meatgrinder((new Item.Properties().stacksTo(1))));

       public static final Supplier<Item> advanced_meatgrinder = MUSH.register("advanced_meatgrinder", () -> new meatgrinder((new Item.Properties().stacksTo(1))));

       public static final Supplier<Item> more_advanced_meatgrinder = MUSH.register("more_advanced_meatgrinder", () -> new meatgrinder((new Item.Properties().stacksTo(1))));

       public static final Supplier<Item> most_advanced_meatgrinder = MUSH.register("most_advanced_meatgrinder", () -> new meatgrinder((new Item.Properties().stacksTo(1))));

        public static final DeferredHolder<Item, Item> GROUND_CHICKEN = MUSH.register("ground_chicken",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> GROUND_COD = MUSH.register("ground_cod",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> GROUND_SALMON = MUSH.register("ground_salmon",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> GROUND_TROPICAL_FISH = MUSH.register("ground_tropical_fish",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> GROUND_MUTTON = MUSH.register("ground_mutton",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> GROUND_BEEF = MUSH.register("ground_beef",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> GROUND_PORK = MUSH.register("ground_pork",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

        public static final DeferredHolder<Item, Item> GROUND_RABBIT = MUSH.register("ground_rabbit",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

      //---------------------------------------------non tool mushes-----------------------------------------------
      
        public static final DeferredHolder<Item, Item> SUGAR_PASTE = MUSH.register("sugar_paste", 
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
        .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
    }//class

