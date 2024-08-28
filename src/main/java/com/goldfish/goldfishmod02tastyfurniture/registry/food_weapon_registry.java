package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.goldfish.goldfishmod02tastyfurniture.item.apple_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.potato_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.beetroot_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.carrot_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.chorus_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.glow_berry_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.melon_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.sweet_berry_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.brown_mushroom_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.red_mushroom_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.pumpkin_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.chicken_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.cod_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.salmon_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.tropical_fish_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.mutton_sword;
import com.google.common.base.Supplier;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class food_weapon_registry {
    public static final Tier APPLE_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            150,
            3f,
            1.3f,
            22,
            () -> Ingredient.of(ingotregistry.APPLE_INGOT.get())
    );
    public static final Tier POTATO_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            160,
            4f,
            1.3f,
            22,
            () -> Ingredient.of(ingotregistry.POTATO_INGOT.get())
    );
    public static final Tier BEETROOT_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            5f,
            1.3f,
            22,
            () -> Ingredient.of(ingotregistry.BEETROOT_INGOT.get())
    );
    public static final Tier CARROT_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.CARROT_INGOT.get())
    );
    public static final Tier CHORUS_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            190,
            5f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.CHORUS_INGOT.get())
    );
    public static final Tier GLOW_BERRY_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.GLOW_BERRY_INGOT.get())
    );
    public static final Tier MELON_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.MELON_INGOT.get())
    );
    public static final Tier SWEET_BERRY_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.SWEET_BERRY_INGOT.get())
    );
    public static final Tier BROWN_MUSHROOM_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.BROWN_MUSHROOM_INGOT.get())
    );
    public static final Tier RED_MUSHROOM_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.RED_MUSHROOM_INGOT.get())
    );
    public static final Tier PUMPKIN_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.PUMPKIN_INGOT.get())
    );
    public static final Tier CHICKEN_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.CHICKEN_INGOT.get())
    );
    public static final Tier COD_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.COD_INGOT.get())
    );
    public static final Tier SALMON_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.SALMON_INGOT.get())
    );
    public static final Tier TROPICAL_FISH_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.TROPICAL_FISH_INGOT.get())
    );
    public static final Tier MUTTON_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4f,
            1.0f,
            22,
            () -> Ingredient.of(ingotregistry.MUTTON_INGOT.get())
    );

    public static final DeferredRegister<Item> FOODWEAPON = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurniture.MODID);

//==============================================================================================================================================================================================
//                                                                                          Swords
//==============================================================================================================================================================================================

  //.........apple 
    public static final DeferredHolder<Item, apple_sword> APPLE_SWORD = FOODWEAPON.register("apple_sword", () -> new apple_sword(APPLE_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            APPLE_TIER,
            3,
            -2.4f))));
  //.........potato 
    public static final DeferredHolder<Item, potato_sword> POTATO_SWORD = FOODWEAPON.register("potato_sword", () -> new potato_sword(POTATO_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            POTATO_TIER,
            3,
            -2.4f))));
  //.........beetroot 
    public static final DeferredHolder<Item, beetroot_sword> BEETROOT_SWORD = FOODWEAPON.register("beetroot_sword", () -> new beetroot_sword(BEETROOT_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            BEETROOT_TIER,
            3,
            -2.4f))));
  //.........carrot 
    public static final DeferredHolder<Item, carrot_sword> CARROT_SWORD = FOODWEAPON.register("carrot_sword", () -> new carrot_sword(CARROT_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            CARROT_TIER,
            3,
            -2.4f))));
  //.........chorus 
    public static final DeferredHolder<Item, chorus_sword> CHORUS_SWORD = FOODWEAPON.register("chorus_sword", () -> new chorus_sword(CHORUS_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            CHORUS_TIER,
            5,
            -2.0f))));
  //.........glow_berry 
    public static final DeferredHolder<Item, glow_berry_sword> GLOW_BERRY_SWORD = FOODWEAPON.register("glow_berry_sword", () -> new glow_berry_sword(GLOW_BERRY_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            GLOW_BERRY_TIER,
            3,
            -2.4f))));
  //.........melon 
    public static final DeferredHolder<Item, melon_sword> MELON_SWORD = FOODWEAPON.register("melon_sword", () -> new melon_sword(MELON_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            MELON_TIER,
            3,
            -2.4f))));
  //.........sweet_berry 
    public static final DeferredHolder<Item, sweet_berry_sword> SWEET_BERRY_SWORD = FOODWEAPON.register("sweet_berry_sword", () -> new sweet_berry_sword(SWEET_BERRY_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            SWEET_BERRY_TIER,
            3,
            -2.4f))));
  //.........brown_mushroom 
    public static final DeferredHolder<Item, brown_mushroom_sword> BROWN_MUSHROOM_SWORD = FOODWEAPON.register("brown_mushroom_sword", () -> new brown_mushroom_sword(BROWN_MUSHROOM_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            BROWN_MUSHROOM_TIER,
            3,
            -2.4f))));
  //.........red_mushroom 
    public static final DeferredHolder<Item, red_mushroom_sword> RED_MUSHROOM_SWORD = FOODWEAPON.register("red_mushroom_sword", () -> new red_mushroom_sword(RED_MUSHROOM_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            RED_MUSHROOM_TIER,
            3,
            -2.4f))));
  //.........pumpkin 
    public static final DeferredHolder<Item, pumpkin_sword> PUMPKIN_SWORD = FOODWEAPON.register("pumpkin_sword", () -> new pumpkin_sword(PUMPKIN_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            PUMPKIN_TIER,
            3,
            -2.4f))));
  //.........chicken 
    public static final DeferredHolder<Item, chicken_sword> CHICKEN_SWORD = FOODWEAPON.register("chicken_sword", () -> new chicken_sword(CHICKEN_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            CHICKEN_TIER,
            3,
            -2.4f))));
  //.........cod 
    public static final DeferredHolder<Item, cod_sword> COD_SWORD = FOODWEAPON.register("cod_sword", () -> new cod_sword(COD_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            COD_TIER,
            3,
            -2.4f))));
  //.........salmon 
    public static final DeferredHolder<Item, salmon_sword> SALMON_SWORD = FOODWEAPON.register("salmon_sword", () -> new salmon_sword(SALMON_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            SALMON_TIER,
            3,
            -2.4f))));
  //.........tropical_fish 
    public static final DeferredHolder<Item, tropical_fish_sword> TROPICAL_FISH_SWORD = FOODWEAPON.register("tropical_fish_sword", () -> new tropical_fish_sword(TROPICAL_FISH_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            TROPICAL_FISH_TIER,
            3,
            -2.4f))));
  //.........mutton 
    public static final DeferredHolder<Item, mutton_sword> MUTTON_SWORD = FOODWEAPON.register("mutton_sword", () -> new mutton_sword(MUTTON_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            MUTTON_TIER,
            3,
            -2.4f))));

    // public static final DeferredHolder<Item, SwordItem> APPLE_SWORD = FOODWEAPON.register(
    //     "apple_sword", 
    //     () -> new SwordItem(
    //     APPLE_TIER,
    //     new Item.Properties().attributes(
    //         SwordItem.createAttributes(
    //             APPLE_TIER,
    //             3,
    //             -2.4f        
    //     ))));
}
