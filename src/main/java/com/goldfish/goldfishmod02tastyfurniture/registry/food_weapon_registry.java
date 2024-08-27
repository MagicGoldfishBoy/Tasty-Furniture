package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.goldfish.goldfishmod02tastyfurniture.item.apple_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.potato_sword;
import com.goldfish.goldfishmod02tastyfurniture.item.beetroot_sword;
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
            5f,
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
            3f,
            1.3f,
            22,
            () -> Ingredient.of(ingotregistry.BEETROOT_INGOT.get())
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
