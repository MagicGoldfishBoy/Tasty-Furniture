package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;
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
import com.goldfish.goldfishmod02tastyfurniture.item.beef_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.pork_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.rabbit_sword;
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

    public static final DeferredRegister<Item> FOODWEAPON = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurniture.MODID);

//==============================================================================================================================================================================================
//                                                                                          Swords
//==============================================================================================================================================================================================

  //.........apple 
    public static final DeferredHolder<Item, apple_sword> APPLE_SWORD = FOODWEAPON.register("apple_sword", () -> new apple_sword(foodmaterialtyperegistry.APPLE_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.APPLE_TIER,
            3,
            -2.4f))));
  //.........potato 
    public static final DeferredHolder<Item, potato_sword> POTATO_SWORD = FOODWEAPON.register("potato_sword", () -> new potato_sword(foodmaterialtyperegistry.POTATO_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.POTATO_TIER,
            3,
            -2.4f))));
  //.........beetroot 
    public static final DeferredHolder<Item, beetroot_sword> BEETROOT_SWORD = FOODWEAPON.register("beetroot_sword", () -> new beetroot_sword(foodmaterialtyperegistry.BEETROOT_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.BEETROOT_TIER,
            3,
            -2.4f))));
  //.........carrot 
    public static final DeferredHolder<Item, carrot_sword> CARROT_SWORD = FOODWEAPON.register("carrot_sword", () -> new carrot_sword(foodmaterialtyperegistry.CARROT_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.CARROT_TIER,
            3,
            -2.4f))));
  //.........chorus 
    public static final DeferredHolder<Item, chorus_sword> CHORUS_SWORD = FOODWEAPON.register("chorus_sword", () -> new chorus_sword(foodmaterialtyperegistry.CHORUS_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.CHORUS_TIER,
            5,
            -2.0f))));
  //.........glow_berry 
    public static final DeferredHolder<Item, glow_berry_sword> GLOW_BERRY_SWORD = FOODWEAPON.register("glow_berry_sword", () -> new glow_berry_sword(foodmaterialtyperegistry.GLOW_BERRY_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.GLOW_BERRY_TIER,
            3,
            -2.4f))));
  //.........melon 
    public static final DeferredHolder<Item, melon_sword> MELON_SWORD = FOODWEAPON.register("melon_sword", () -> new melon_sword(foodmaterialtyperegistry.MELON_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.MELON_TIER,
            3,
            -2.4f))));
  //.........sweet_berry 
    public static final DeferredHolder<Item, sweet_berry_sword> SWEET_BERRY_SWORD = FOODWEAPON.register("sweet_berry_sword", () -> new sweet_berry_sword(foodmaterialtyperegistry.SWEET_BERRY_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.SWEET_BERRY_TIER,
            3,
            -2.4f))));
  //.........brown_mushroom 
    public static final DeferredHolder<Item, brown_mushroom_sword> BROWN_MUSHROOM_SWORD = FOODWEAPON.register("brown_mushroom_sword", () -> new brown_mushroom_sword(foodmaterialtyperegistry.BROWN_MUSHROOM_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.BROWN_MUSHROOM_TIER,
            3,
            -2.4f))));
  //.........red_mushroom 
    public static final DeferredHolder<Item, red_mushroom_sword> RED_MUSHROOM_SWORD = FOODWEAPON.register("red_mushroom_sword", () -> new red_mushroom_sword(foodmaterialtyperegistry.RED_MUSHROOM_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.RED_MUSHROOM_TIER,
            3,
            -2.4f))));
  //.........pumpkin 
    public static final DeferredHolder<Item, pumpkin_sword> PUMPKIN_SWORD = FOODWEAPON.register("pumpkin_sword", () -> new pumpkin_sword(foodmaterialtyperegistry.PUMPKIN_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.PUMPKIN_TIER,
            3,
            -2.4f))));
  //.........chicken 
    public static final DeferredHolder<Item, chicken_sword> CHICKEN_SWORD = FOODWEAPON.register("chicken_sword", () -> new chicken_sword(foodmaterialtyperegistry.CHICKEN_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.CHICKEN_TIER,
            3,
            -2.4f))));
  //.........cod 
    public static final DeferredHolder<Item, cod_sword> COD_SWORD = FOODWEAPON.register("cod_sword", () -> new cod_sword(foodmaterialtyperegistry.COD_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.COD_TIER,
            3,
            -2.4f))));
  //.........salmon 
    public static final DeferredHolder<Item, salmon_sword> SALMON_SWORD = FOODWEAPON.register("salmon_sword", () -> new salmon_sword(foodmaterialtyperegistry.SALMON_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.SALMON_TIER,
            3,
            -2.4f))));
  //.........tropical_fish 
    public static final DeferredHolder<Item, tropical_fish_sword> TROPICAL_FISH_SWORD = FOODWEAPON.register("tropical_fish_sword", () -> new tropical_fish_sword(foodmaterialtyperegistry.TROPICAL_FISH_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.TROPICAL_FISH_TIER,
            3,
            -2.4f))));
  //.........mutton 
    public static final DeferredHolder<Item, mutton_sword> MUTTON_SWORD = FOODWEAPON.register("mutton_sword", () -> new mutton_sword(foodmaterialtyperegistry.MUTTON_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.MUTTON_TIER,
            3,
            -2.4f))));
  //.........beef 
    public static final DeferredHolder<Item, beef_sword> BEEF_SWORD = FOODWEAPON.register("beef_sword", () -> new beef_sword(foodmaterialtyperegistry.BEEF_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.BEEF_TIER,
            3,
            -2.4f))));
  //.........pork 
    public static final DeferredHolder<Item, pork_sword> PORK_SWORD = FOODWEAPON.register("pork_sword", () -> new pork_sword(foodmaterialtyperegistry.PORK_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.PORK_TIER,
            3,
            -2.4f))));
  //.........rabbit 
    public static final DeferredHolder<Item, rabbit_sword> RABBIT_SWORD = FOODWEAPON.register("rabbit_sword", () -> new rabbit_sword(foodmaterialtyperegistry.RABBIT_TIER, new Item.Properties().attributes(
        SwordItem.createAttributes(
            foodmaterialtyperegistry.RABBIT_TIER,
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
