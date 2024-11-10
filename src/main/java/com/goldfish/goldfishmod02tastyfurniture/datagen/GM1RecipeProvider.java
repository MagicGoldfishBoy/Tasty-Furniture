package com.goldfish.goldfishmod02tastyfurniture.datagen;

import java.util.concurrent.CompletableFuture;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.ingotregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.mushregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.nuggetregistry;
import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.goldfish.goldfishmod02tastyfurniture.registry.food_weapon_registry;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;

public abstract class GM1RecipeProvider extends RecipeProvider {

    private PackOutput output;
    private CompletableFuture<Provider> lookupProvider;

    public GM1RecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    public static class GM1RecipeProviderConcrete extends GM1RecipeProvider {
        //tags
          public static final TagKey<Item> CHICKEN_TAG = TagKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(TastyFurniture.MODID, "chicken")
          );
          public static final TagKey<Item> COD_TAG = TagKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(TastyFurniture.MODID, "cod")
          );
          public static final TagKey<Item> SALMON_TAG = TagKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(TastyFurniture.MODID, "salmon")
          );
          public static final TagKey<Item> MUTTON_TAG = TagKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(TastyFurniture.MODID, "mutton")
          );
          public static final TagKey<Item> BEEF_TAG = TagKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(TastyFurniture.MODID, "beef")
          );
          public static final TagKey<Item> PORK_TAG = TagKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(TastyFurniture.MODID, "pork")
          );
          public static final TagKey<Item> RABBIT_TAG = TagKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(TastyFurniture.MODID, "rabbit")
          );

        public GM1RecipeProviderConcrete(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected void buildRecipes(RecipeOutput output) {
          buildToolRecipes(output);
          buildMushRecipes(output);
          buildIngotRecipes(output);
          buildNuggetRecipes(output);
          buildBlockRecipes(output);
          buildCabinetRecipes(output);
        //-------------------------------------------------------------doors-----------------------------------------------------------------------
            //apple
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.APPLE_INGOT.get())
              .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
              .save(output);
            //potato
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.POTATO_INGOT.get())
              .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
              .save(output);
            //beetroot
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.BEETROOT_INGOT.get())
              .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
              .save(output);
            //carrot
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.CARROT_INGOT.get())
              .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
              .save(output);
            //chorus
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.CHORUS_INGOT.get())
              .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
              .save(output);
            //glow_berry
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
              .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
              .save(output);
            //melon
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.MELON_INGOT.get())
              .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
              .save(output);
            //sweet_berry
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
              .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
              .save(output);
            //brown_mushroom
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
              .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
              .save(output);
            //red_mushroom
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
              .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
              .save(output);
            //pumpkin
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.PUMPKIN_INGOT.get())
              .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
              .save(output);
            //chicken
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.CHICKEN_INGOT.get())
              .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
              .save(output);
            //cod
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.COD_INGOT.get())
              .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
              .save(output);
            //salmon
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.SALMON_INGOT.get())
              .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
              .save(output);
            //tropical_fish
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
              .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
              .save(output);
            //mutton
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.MUTTON_INGOT.get())
              .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
              .save(output);
            //beef
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.BEEF_INGOT.get())
              .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
              .save(output);
            //pork
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.PORK_INGOT.get())
              .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
              .save(output);
            //rabbit
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.RABBIT_INGOT.get())
              .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
              .save(output);
            //sugar
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.SUGAR_INGOT.get())
              .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
              .save(output);
            //honeycomb
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_DOOR_ITEM.get(), 3)
              .pattern("AA ")
              .pattern("AA ")
              .pattern("AA ")
              .define('A', ingotregistry.HONEYCOMB_INGOT.get())
              .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
              .save(output);
        //-------------------------------------------------------------buttons---------------------------------------------------------------------
            //sugar
              ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.SUGAR_BUTTON_ITEM.get(), 1)
              .requires(nuggetregistry.SUGAR_NUGGET.get())
              .unlockedBy("has_sugar_nugget", has(nuggetregistry.SUGAR_NUGGET.get()))
              .save(output);
            //honeycomb
              ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_BUTTON_ITEM.get(), 1)
              .requires(nuggetregistry.HONEYCOMB_NUGGET.get())
              .unlockedBy("has_honeycomb_nugget", has(nuggetregistry.HONEYCOMB_NUGGET.get()))
              .save(output);
          
        //-------------------------------------------------------------fences----------------------------------------------------------------------
         //apple_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.APPLE_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
           .save(output);
         //potato_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.POTATO_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
           .save(output);
         //beetroot_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.BEETROOT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
           .save(output);
         //carrot_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.CARROT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
           .save(output);
         //chorus_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.CHORUS_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
           .save(output);
         //glow_berry_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
           .save(output);
         //melon_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.MELON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
           .save(output);
         //sweet_berry_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
           .save(output);
         //brown_mushroom_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
           .save(output);
         //red_mushroom_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
           .save(output);
         //pumpkin_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.PUMPKIN_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
           .save(output);
         //chicken_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.CHICKEN_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
           .save(output);
         //cod_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.COD_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
           .save(output);
         //salmon_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.SALMON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
           .save(output);
         //tropical_fish_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
           .save(output);
         //mutton_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.MUTTON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
           .save(output);
         //beef_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.BEEF_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
           .save(output);
         //pork_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.PORK_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
           .save(output);
         //rabbit_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.RABBIT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
           .save(output);
         //sugar_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.SUGAR_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
           .save(output);
         //honeycomb_fence
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_FENCE_ITEM.get(), 3)
           .pattern("ABA")
           .pattern("ABA")
           .pattern("   ")
           .define('A', ingotregistry.HONEYCOMB_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
           .save(output);

        //-------------------------------------------------------------gates----------------------------------------------------------------------
         //apple_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.APPLE_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
           .save(output);
         //potato_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.POTATO_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
           .save(output);
         //beetroot_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.BEETROOT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
           .save(output);
         //carrot_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.CARROT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
           .save(output);
         //chorus_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.CHORUS_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
           .save(output);
         //glow_berry_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
           .save(output);
         //melon_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.MELON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
           .save(output);
         //sweet_berry_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
           .save(output);
         //brown_mushroom_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
           .save(output);
         //red_mushroom_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
           .save(output);
         //pumpkin_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.PUMPKIN_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
           .save(output);
         //chicken_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.CHICKEN_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
           .save(output);
         //cod_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.COD_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
           .save(output);
         //salmon_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.SALMON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
           .save(output);
         //tropical_fish_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
           .save(output);
         //mutton_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.MUTTON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
           .save(output);
         //beef_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.BEEF_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
           .save(output);
         //pork_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.PORK_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
           .save(output);
         //rabbit_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.RABBIT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
           .save(output);
         //sugar_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.SUGAR_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
           .save(output);
         //honeycomb_gate
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_GATE_ITEM.get())
           .pattern("BAB")
           .pattern("BAB")
           .pattern("   ")
           .define('A', ingotregistry.HONEYCOMB_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
           .save(output);

        //-----------------------------------------------------------pressure plates--------------------------------------------------------------
         //sugar
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_PRESSURE_PLATE_ITEM.get())
          .pattern("   ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockitemregistry.SUGAR_BLOCK_ITEM.get())
          .unlockedBy("has_sugar_block",  has(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()))
          .save(output);
         //honeycomb
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_PRESSURE_PLATE_ITEM.get())
          .pattern("   ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get())
          .unlockedBy("has_honeycomb_block",  has(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()))
          .save(output);
        //-------------------------------------------------------------signs----------------------------------------------------------------------
         //apple_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.APPLE_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
           .save(output);
         //potato_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.POTATO_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
           .save(output);
         //beetroot_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.BEETROOT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
           .save(output);
         //carrot_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.CARROT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
           .save(output);
         //chorus_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.CHORUS_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
           .save(output);
         //glowberry_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOWBERRY_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_glowberry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
           .save(output);
         //melon_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.MELON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
           .save(output);
         //sweetberry_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEETBERRY_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_sweetberry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
           .save(output);
         //brownmushroom_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWNMUSHROOM_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_brownmushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
           .save(output);
         //redmushroom_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.REDMUSHROOM_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_redmushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
           .save(output);
         //pumpkin_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.PUMPKIN_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
           .save(output);
         //chicken_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.CHICKEN_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
           .save(output);
         //cod_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.COD_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
           .save(output);
         //salmon_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.SALMON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
           .save(output);
         //tropicalfish_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICALFISH_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_tropicalfish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
           .save(output);
         //mutton_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.MUTTON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
           .save(output);
         //beef_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.BEEF_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
           .save(output);
         //pork_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.PORK_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
           .save(output);
         //rabbit_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.RABBIT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
           .save(output);
         //sugar_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.SUGAR_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
           .save(output);
         //honeycomb_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_SIGN_ITEM.get(), 3)
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.HONEYCOMB_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
           .save(output);



        //-------------------------------------------------------------slabs----------------------------------------------------------------------
         //________________________________________________________Regular Slabs__________________________________________________________________
            //apple
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.APPLE_INGOT.get())
              .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
              .save(output);
            //potato
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.POTATO_INGOT.get())
              .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
              .save(output);
            //beetroot
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.BEETROOT_INGOT.get())
              .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
              .save(output);
            //carrot
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.CARROT_INGOT.get())
              .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
              .save(output);
            //chorus
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.CHORUS_INGOT.get())
              .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
              .save(output);
            //glow_berry
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
              .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
              .save(output);
            //melon
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.MELON_INGOT.get())
              .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
              .save(output);
            //sweet_berry
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
              .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
              .save(output);
            //brown_mushroom
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
              .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
              .save(output);
            //red_mushroom
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
              .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
              .save(output);
            //pumpkin
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.PUMPKIN_INGOT.get())
              .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
              .save(output);
            //chicken
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.CHICKEN_INGOT.get())
              .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
              .save(output);
            //cod
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.COD_INGOT.get())
              .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
              .save(output);
            //salmon
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.SALMON_INGOT.get())
              .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
              .save(output);
            //tropical_fish
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
              .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
              .save(output);
            //mutton
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.MUTTON_INGOT.get())
              .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
              .save(output);
            //beef
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.BEEF_INGOT.get())
              .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
              .save(output);
            //pork
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.PORK_INGOT.get())
              .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
              .save(output);
            //rabbit
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.RABBIT_INGOT.get())
              .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
              .save(output);
            //sugar
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.SUGAR_INGOT.get())
              .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
              .save(output);
            //honeycomb
              ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get())
              .pattern("   ")
              .pattern("   ")
              .pattern("AAA")
              .define('A', ingotregistry.HONEYCOMB_INGOT.get())
              .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
              .save(output);

        //________________________________________________________Bricks Slabs__________________________________________________________________
          //apple
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.APPLE_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.APPLE_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_apple_bricks_block", has(foodblockitemregistry.APPLE_BRICKS_BLOCK_ITEM.get()))
            .save(output, "apple_bricks_slab_from_apple_bricks_block_stonecutting");
          //potato
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.POTATO_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.POTATO_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_potato_bricks_block", has(foodblockitemregistry.POTATO_BRICKS_BLOCK_ITEM.get()))
            .save(output, "potato_bricks_slab_from_potato_bricks_block_stonecutting");
          //beetroot
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEETROOT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.BEETROOT_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_beetroot_bricks_block", has(foodblockitemregistry.BEETROOT_BRICKS_BLOCK_ITEM.get()))
            .save(output, "beetroot_bricks_slab_from_beetroot_bricks_block_stonecutting");
          //carrot
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CARROT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.CARROT_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_carrot_bricks_block", has(foodblockitemregistry.CARROT_BRICKS_BLOCK_ITEM.get()))
            .save(output, "carrot_bricks_slab_from_carrot_bricks_block_stonecutting");
          //chorus
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHORUS_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.CHORUS_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_chorus_bricks_block", has(foodblockitemregistry.CHORUS_BRICKS_BLOCK_ITEM.get()))
            .save(output, "chorus_bricks_slab_from_chorus_bricks_block_stonecutting");
          //glow_berry
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.GLOW_BERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.GLOW_BERRY_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_glow_berry_bricks_block", has(foodblockitemregistry.GLOW_BERRY_BRICKS_BLOCK_ITEM.get()))
            .save(output, "glow_berry_bricks_slab_from_glow_berry_bricks_block_stonecutting");
          //melon
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MELON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.MELON_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_melon_bricks_block", has(foodblockitemregistry.MELON_BRICKS_BLOCK_ITEM.get()))
            .save(output, "melon_bricks_slab_from_melon_bricks_block_stonecutting");
          //sweet_berry
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SWEET_BERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.SWEET_BERRY_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_sweet_berry_bricks_block", has(foodblockitemregistry.SWEET_BERRY_BRICKS_BLOCK_ITEM.get()))
            .save(output, "sweet_berry_bricks_slab_from_sweet_berry_bricks_block_stonecutting");
          //brown_mushroom
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BROWN_MUSHROOM_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.BROWN_MUSHROOM_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_brown_mushroom_bricks_block", has(foodblockitemregistry.BROWN_MUSHROOM_BRICKS_BLOCK_ITEM.get()))
            .save(output, "brown_mushroom_bricks_slab_from_brown_mushroom_bricks_block_stonecutting");
          //red_mushroom
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RED_MUSHROOM_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.RED_MUSHROOM_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_red_mushroom_bricks_block", has(foodblockitemregistry.RED_MUSHROOM_BRICKS_BLOCK_ITEM.get()))
            .save(output, "red_mushroom_bricks_slab_from_red_mushroom_bricks_block_stonecutting");
          //pumpkin
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PUMPKIN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.PUMPKIN_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_pumpkin_bricks_block", has(foodblockitemregistry.PUMPKIN_BRICKS_BLOCK_ITEM.get()))
            .save(output, "pumpkin_bricks_slab_from_pumpkin_bricks_block_stonecutting");
          //chicken
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHICKEN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.CHICKEN_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_chicken_bricks_block", has(foodblockitemregistry.CHICKEN_BRICKS_BLOCK_ITEM.get()))
            .save(output, "chicken_bricks_slab_from_chicken_bricks_block_stonecutting");
          //cod
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.COD_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.COD_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_cod_bricks_block", has(foodblockitemregistry.COD_BRICKS_BLOCK_ITEM.get()))
            .save(output, "cod_bricks_slab_from_cod_bricks_block_stonecutting");
          //salmon
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SALMON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.SALMON_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_salmon_bricks_block", has(foodblockitemregistry.SALMON_BRICKS_BLOCK_ITEM.get()))
            .save(output, "salmon_bricks_slab_from_salmon_bricks_block_stonecutting");
          //tropical_fish
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.TROPICAL_FISH_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.TROPICAL_FISH_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_tropical_fish_bricks_block", has(foodblockitemregistry.TROPICAL_FISH_BRICKS_BLOCK_ITEM.get()))
            .save(output, "tropical_fish_bricks_slab_from_tropical_fish_bricks_block_stonecutting");
          //mutton
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MUTTON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.MUTTON_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_mutton_bricks_block", has(foodblockitemregistry.MUTTON_BRICKS_BLOCK_ITEM.get()))
            .save(output, "mutton_bricks_slab_from_mutton_bricks_block_stonecutting");
          //beef
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEEF_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.BEEF_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_beef_bricks_block", has(foodblockitemregistry.BEEF_BRICKS_BLOCK_ITEM.get()))
            .save(output, "beef_bricks_slab_from_beef_bricks_block_stonecutting");
          //pork
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PORK_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.PORK_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_pork_bricks_block", has(foodblockitemregistry.PORK_BRICKS_BLOCK_ITEM.get()))
            .save(output, "pork_bricks_slab_from_pork_bricks_block_stonecutting");
          //rabbit
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RABBIT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.RABBIT_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_rabbit_bricks_block", has(foodblockitemregistry.RABBIT_BRICKS_BLOCK_ITEM.get()))
            .save(output, "rabbit_bricks_slab_from_rabbit_bricks_block_stonecutting");
          //sugar
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SUGAR_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.SUGAR_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_sugar_bricks_block", has(foodblockitemregistry.SUGAR_BRICKS_BLOCK_ITEM.get()))
            .save(output, "sugar_bricks_slab_from_sugar_bricks_block_stonecutting");
          //honeycomb
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.HONEYCOMB_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.HONEYCOMB_BRICKS_SLAB_ITEM.get(), 2)
            .unlockedBy("has_honeycomb_bricks_block", has(foodblockitemregistry.HONEYCOMB_BRICKS_BLOCK_ITEM.get()))
            .save(output, "honeycomb_bricks_slab_from_honeycomb_bricks_block_stonecutting");

        //------------------------------------------------------------stairs----------------------------------------------------
         //________________________________________________________Regular Stairs__________________________________________________________________
          //apple
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.APPLE_INGOT.get())
            .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
            .save(output);
                    //potato
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.POTATO_INGOT.get())
            .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
            .save(output);
          //beetroot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.BEETROOT_INGOT.get())
            .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
            .save(output);
          //carrot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.CARROT_INGOT.get())
            .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
            .save(output);
          //chorus
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.CHORUS_INGOT.get())
            .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
            .save(output);
          //glow_berry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
            .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
            .save(output);
          //melon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.MELON_INGOT.get())
            .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
            .save(output);
          //sweet_berry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
            .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
            .save(output);
          //brown_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
            .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
            .save(output);
          //red_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
            .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
            .save(output);
          //pumpkin
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.PUMPKIN_INGOT.get())
            .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
            .save(output);
          //chicken
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.CHICKEN_INGOT.get())
            .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
            .save(output);
          //cod
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.COD_INGOT.get())
            .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
            .save(output);
          //salmon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.SALMON_INGOT.get())
            .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
            .save(output);
          //tropical_fish
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
            .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
            .save(output);
          //mutton
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.MUTTON_INGOT.get())
            .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
            .save(output);
          //beef
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.BEEF_INGOT.get())
            .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
            .save(output);
          //pork
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.PORK_INGOT.get())
            .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
            .save(output);
          //rabbit
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.RABBIT_INGOT.get())
            .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
            .save(output);
          //sugar
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.SUGAR_INGOT.get())
            .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
            .save(output);
          //honeycomb
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_STAIRS_ITEM.get())
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', ingotregistry.HONEYCOMB_INGOT.get())
            .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
            .save(output);
         //________________________________________________________Bricks Stairs__________________________________________________________________

          //apple
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.APPLE_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.APPLE_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_apple_bricks_block", has(foodblockitemregistry.APPLE_BRICKS_BLOCK_ITEM.get()))
            .save(output, "apple_bricks_stairs_from_apple_bricks_block_stonecutting");
          //potato
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.POTATO_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.POTATO_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_potato_bricks_block", has(foodblockitemregistry.POTATO_BRICKS_BLOCK_ITEM.get()))
            .save(output, "potato_bricks_stairs_from_potato_bricks_block_stonecutting");
          //beetroot
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEETROOT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.BEETROOT_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_beetroot_bricks_block", has(foodblockitemregistry.BEETROOT_BRICKS_BLOCK_ITEM.get()))
            .save(output, "beetroot_bricks_stairs_from_beetroot_bricks_block_stonecutting");
          //carrot
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CARROT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.CARROT_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_carrot_bricks_block", has(foodblockitemregistry.CARROT_BRICKS_BLOCK_ITEM.get()))
            .save(output, "carrot_bricks_stairs_from_carrot_bricks_block_stonecutting");
          //chorus
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHORUS_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.CHORUS_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_chorus_bricks_block", has(foodblockitemregistry.CHORUS_BRICKS_BLOCK_ITEM.get()))
            .save(output, "chorus_bricks_stairs_from_chorus_bricks_block_stonecutting");
          //glow_berry
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.GLOW_BERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.GLOW_BERRY_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_glow_berry_bricks_block", has(foodblockitemregistry.GLOW_BERRY_BRICKS_BLOCK_ITEM.get()))
            .save(output, "glow_berry_bricks_stairs_from_glow_berry_bricks_block_stonecutting");
          //melon
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MELON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.MELON_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_melon_bricks_block", has(foodblockitemregistry.MELON_BRICKS_BLOCK_ITEM.get()))
            .save(output, "melon_bricks_stairs_from_melon_bricks_block_stonecutting");
          //sweet_berry
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SWEET_BERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.SWEET_BERRY_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_sweet_berry_bricks_block", has(foodblockitemregistry.SWEET_BERRY_BRICKS_BLOCK_ITEM.get()))
            .save(output, "sweet_berry_bricks_stairs_from_sweet_berry_bricks_block_stonecutting");
          //brown_mushroom
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BROWN_MUSHROOM_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.BROWN_MUSHROOM_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_brown_mushroom_bricks_block", has(foodblockitemregistry.BROWN_MUSHROOM_BRICKS_BLOCK_ITEM.get()))
            .save(output, "brown_mushroom_bricks_stairs_from_brown_mushroom_bricks_block_stonecutting");
          //red_mushroom
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RED_MUSHROOM_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.RED_MUSHROOM_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_red_mushroom_bricks_block", has(foodblockitemregistry.RED_MUSHROOM_BRICKS_BLOCK_ITEM.get()))
            .save(output, "red_mushroom_bricks_stairs_from_red_mushroom_bricks_block_stonecutting");
          //pumpkin
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PUMPKIN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.PUMPKIN_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_pumpkin_bricks_block", has(foodblockitemregistry.PUMPKIN_BRICKS_BLOCK_ITEM.get()))
            .save(output, "pumpkin_bricks_stairs_from_pumpkin_bricks_block_stonecutting");
          //chicken
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHICKEN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.CHICKEN_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_chicken_bricks_block", has(foodblockitemregistry.CHICKEN_BRICKS_BLOCK_ITEM.get()))
            .save(output, "chicken_bricks_stairs_from_chicken_bricks_block_stonecutting");
          //cod
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.COD_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.COD_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_cod_bricks_block", has(foodblockitemregistry.COD_BRICKS_BLOCK_ITEM.get()))
            .save(output, "cod_bricks_stairs_from_cod_bricks_block_stonecutting");
          //salmon
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SALMON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.SALMON_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_salmon_bricks_block", has(foodblockitemregistry.SALMON_BRICKS_BLOCK_ITEM.get()))
            .save(output, "salmon_bricks_stairs_from_salmon_bricks_block_stonecutting");
          //tropical_fish
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.TROPICAL_FISH_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.TROPICAL_FISH_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_tropical_fish_bricks_block", has(foodblockitemregistry.TROPICAL_FISH_BRICKS_BLOCK_ITEM.get()))
            .save(output, "tropical_fish_bricks_stairs_from_tropical_fish_bricks_block_stonecutting");
          //mutton
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MUTTON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.MUTTON_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_mutton_bricks_block", has(foodblockitemregistry.MUTTON_BRICKS_BLOCK_ITEM.get()))
            .save(output, "mutton_bricks_stairs_from_mutton_bricks_block_stonecutting");
          //beef
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEEF_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.BEEF_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_beef_bricks_block", has(foodblockitemregistry.BEEF_BRICKS_BLOCK_ITEM.get()))
            .save(output, "beef_bricks_stairs_from_beef_bricks_block_stonecutting");
          //pork
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PORK_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.PORK_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_pork_bricks_block", has(foodblockitemregistry.PORK_BRICKS_BLOCK_ITEM.get()))
            .save(output, "pork_bricks_stairs_from_pork_bricks_block_stonecutting");
          //rabbit
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RABBIT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.RABBIT_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_rabbit_bricks_block", has(foodblockitemregistry.RABBIT_BRICKS_BLOCK_ITEM.get()))
            .save(output, "rabbit_bricks_stairs_from_rabbit_bricks_block_stonecutting");
          //sugar
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SUGAR_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.SUGAR_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_sugar_bricks_block", has(foodblockitemregistry.SUGAR_BRICKS_BLOCK_ITEM.get()))
            .save(output, "sugar_bricks_stairs_from_sugar_bricks_block_stonecutting");
          //honeycomb
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.HONEYCOMB_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
            foodblockitemregistry.HONEYCOMB_BRICKS_STAIRS_ITEM.get())
            .unlockedBy("has_honeycomb_bricks_block", has(foodblockitemregistry.HONEYCOMB_BRICKS_BLOCK_ITEM.get()))
            .save(output, "honeycomb_bricks_stairs_from_honeycomb_bricks_block_stonecutting");

        //----------------------------------------------------------trap doors--------------------------------------------------
         //apple
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.APPLE_INGOT.get())
         .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
         .save(output);
         //potato
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.POTATO_INGOT.get())
         .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
         .save(output);
         //beetroot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.BEETROOT_INGOT.get())
         .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
         .save(output);
         //carrot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.CARROT_INGOT.get())
         .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
         .save(output);
         //chorus
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.CHORUS_INGOT.get())
         .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
         .save(output);
         //glow_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
         .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
         .save(output);
         //melon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.MELON_INGOT.get())
         .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
         .save(output);
         //sweet_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
         .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
         .save(output);
         //brown_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
         .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
         .save(output);
         //red_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
         .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
         .save(output);
         //pumpkin
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.PUMPKIN_INGOT.get())
         .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
         .save(output);
         //chicken
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.CHICKEN_INGOT.get())
         .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
         .save(output);
         //cod
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.COD_INGOT.get())
         .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
         .save(output);
         //salmon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.SALMON_INGOT.get())
         .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
         .save(output);
         //tropical_fish
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
         .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
         .save(output);
         //mutton
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.MUTTON_INGOT.get())
         .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
         .save(output);
         //beef
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.BEEF_INGOT.get())
         .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
         .save(output);
         //pork
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.PORK_INGOT.get())
         .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
         .save(output);
         //rabbit
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.RABBIT_INGOT.get())
         .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
         .save(output);
         //sugar
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.SUGAR_INGOT.get())
         .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
         .save(output);
         //honeycomb
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_TRAPDOOR_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', ingotregistry.HONEYCOMB_INGOT.get())
         .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
         .save(output);
        //-------------------------------------------------------------sugar glass-----------------------------------------------------
         //plain
          //block
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()),
            RecipeCategory.MISC,
            foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get(),
             1.0f,
            200
            )
            .unlockedBy("has_sugar_block", has(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()))
            .save(output);
          //pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_plain_sugar_glass_block_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
         //red
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_RED)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.RED_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_red_sugar_glass_block_item", has(foodblockitemregistry.RED_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_RED)
            .unlockedBy("has_red_dye", has(Tags.Items.DYES_RED))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "red_sugar_glass_panes_from_panes");
         //orange
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.ORANGE_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_ORANGE)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.ORANGE_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.ORANGE_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_orange_sugar_glass_block_item", has(foodblockitemregistry.ORANGE_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.ORANGE_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_ORANGE)
            .unlockedBy("has_orange_dye", has(Tags.Items.DYES_ORANGE))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "orange_sugar_glass_panes_from_panes");
         //yellow
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.YELLOW_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_YELLOW)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.YELLOW_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.YELLOW_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_yellow_sugar_glass_block_item", has(foodblockitemregistry.YELLOW_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.YELLOW_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_YELLOW)
            .unlockedBy("has_yellow_dye", has(Tags.Items.DYES_YELLOW))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "yellow_sugar_glass_panes_from_panes");
         //lime_green
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.LIME_GREEN_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_LIME)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.LIME_GREEN_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.LIME_GREEN_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_lime_green_sugar_glass_block_item", has(foodblockitemregistry.LIME_GREEN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.LIME_GREEN_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_LIME)
            .unlockedBy("has_lime_green_dye", has(Tags.Items.DYES_LIME))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "lime_green_sugar_glass_panes_from_panes");
         //green
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GREEN_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_GREEN)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GREEN_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.GREEN_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_green_sugar_glass_block_item", has(foodblockitemregistry.GREEN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GREEN_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_GREEN)
            .unlockedBy("has_green_dye", has(Tags.Items.DYES_GREEN))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "green_sugar_glass_panes_from_panes");
         //cyan
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CYAN_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_CYAN)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CYAN_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.CYAN_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_cyan_sugar_glass_block_item", has(foodblockitemregistry.CYAN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CYAN_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_CYAN)
            .unlockedBy("has_cyan_dye", has(Tags.Items.DYES_CYAN))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "cyan_sugar_glass_panes_from_panes");
         //light_blue
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.LIGHT_BLUE_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_LIGHT_BLUE)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.LIGHT_BLUE_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.LIGHT_BLUE_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_light_blue_sugar_glass_block_item", has(foodblockitemregistry.LIGHT_BLUE_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.LIGHT_BLUE_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_LIGHT_BLUE)
            .unlockedBy("has_light_blue_dye", has(Tags.Items.DYES_LIGHT_BLUE))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "light_blue_sugar_glass_panes_from_panes");
         //blue
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BLUE_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_BLUE)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BLUE_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.BLUE_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_blue_sugar_glass_block_item", has(foodblockitemregistry.BLUE_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BLUE_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_BLUE)
            .unlockedBy("has_blue_dye", has(Tags.Items.DYES_BLUE))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "blue_sugar_glass_panes_from_panes");
         //purple
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PURPLE_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_PURPLE)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PURPLE_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PURPLE_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_purple_sugar_glass_block_item", has(foodblockitemregistry.PURPLE_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PURPLE_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_PURPLE)
            .unlockedBy("has_purple_dye", has(Tags.Items.DYES_PURPLE))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "purple_sugar_glass_panes_from_panes");
         //magenta
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MAGENTA_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_MAGENTA)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MAGENTA_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.MAGENTA_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_magenta_sugar_glass_block_item", has(foodblockitemregistry.MAGENTA_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MAGENTA_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_MAGENTA)
            .unlockedBy("has_magenta_dye", has(Tags.Items.DYES_MAGENTA))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "magenta_sugar_glass_panes_from_panes");
         //pink
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PINK_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_PINK)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PINK_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PINK_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_pink_sugar_glass_block_item", has(foodblockitemregistry.PINK_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PINK_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_PINK)
            .unlockedBy("has_pink_dye", has(Tags.Items.DYES_PINK))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "pink_sugar_glass_panes_from_panes");
         //white
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.WHITE_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_WHITE)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.WHITE_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.WHITE_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_white_sugar_glass_block_item", has(foodblockitemregistry.WHITE_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.WHITE_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_WHITE)
            .unlockedBy("has_white_dye", has(Tags.Items.DYES_WHITE))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "white_sugar_glass_panes_from_panes");
         //light_gray
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.LIGHT_GRAY_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_LIGHT_GRAY)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.LIGHT_GRAY_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.LIGHT_GRAY_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_light_gray_sugar_glass_block_item", has(foodblockitemregistry.LIGHT_GRAY_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.LIGHT_GRAY_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_LIGHT_GRAY)
            .unlockedBy("has_light_gray_dye", has(Tags.Items.DYES_LIGHT_GRAY))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "light_gray_sugar_glass_panes_from_panes");
         //gray
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GRAY_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_GRAY)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GRAY_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.GRAY_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_gray_sugar_glass_block_item", has(foodblockitemregistry.GRAY_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GRAY_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_GRAY)
            .unlockedBy("has_gray_dye", has(Tags.Items.DYES_GRAY))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "gray_sugar_glass_panes_from_panes");
         //black
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BLACK_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_BLACK)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BLACK_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.BLACK_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_black_sugar_glass_block_item", has(foodblockitemregistry.BLACK_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BLACK_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_BLACK)
            .unlockedBy("has_black_dye", has(Tags.Items.DYES_BLACK))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "black_sugar_glass_panes_from_panes");
         //brown
          //block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_SUGAR_GLASS_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get())
            .define('B', Tags.Items.DYES_BROWN)
            .unlockedBy("has_sugar_glass_item", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_SUGAR_GLASS_PANE_ITEM.get(), 16)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.BROWN_SUGAR_GLASS_ITEM.get())
            .unlockedBy("has_brown_sugar_glass_block_item", has(foodblockitemregistry.BROWN_SUGAR_GLASS_ITEM.get()))
            .save(output);
          //pane from pane
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_SUGAR_GLASS_PANE_ITEM.get(), 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get())
            .define('B', Tags.Items.DYES_BROWN)
            .unlockedBy("has_brown_dye", has(Tags.Items.DYES_BROWN))
            .unlockedBy("has_plain_sugar_glass_pane", has(foodblockitemregistry.PLAIN_SUGAR_GLASS_PANE_ITEM.get()))
            .save(output, "brown_sugar_glass_panes_from_panes");
        //-------------------------------------------------------------bars-----------------------------------------------------
         //apple
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.APPLE_NUGGET.get())
         .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
         .save(output);
         //potato
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.POTATO_NUGGET.get())
         .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
         .save(output);
         //beetroot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.BEETROOT_NUGGET.get())
         .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
         .save(output);
         //carrot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.CARROT_NUGGET.get())
         .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
         .save(output);
         //chorus
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.CHORUS_NUGGET.get())
         .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
         .save(output);
         //glow_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.GLOW_BERRY_NUGGET.get())
         .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
         .save(output);        
         //melon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.MELON_NUGGET.get())
         .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
         .save(output);
         //sweet_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.SWEET_BERRY_NUGGET.get())
         .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
         .save(output);
         //brown_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
         .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
         .save(output);
         //red_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.RED_MUSHROOM_NUGGET.get())
         .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
         .save(output);
         //pumpkin
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.PUMPKIN_NUGGET.get())
         .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
         .save(output);
         //chicken
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.CHICKEN_NUGGET.get())
         .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
         .save(output);
         //cod
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.COD_NUGGET.get())
         .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
         .save(output);
         //salmon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.SALMON_NUGGET.get())
         .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
         .save(output);
         //tropical_fish
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.TROPICAL_FISH_NUGGET.get())
         .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
         .save(output);
         //mutton
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.MUTTON_NUGGET.get())
         .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
         .save(output);
         //beef
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.BEEF_NUGGET.get())
         .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
         .save(output);
         //pork
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.PORK_NUGGET.get())
         .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
         .save(output);
         //rabbit
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.RABBIT_NUGGET.get())
         .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
         .save(output);
         //sugar
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.SUGAR_NUGGET.get())
         .unlockedBy("has_sugar_nugget", has(nuggetregistry.SUGAR_NUGGET.get()))
         .save(output);
         //honeycomb
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.HONEYCOMB_NUGGET.get())
         .unlockedBy("has_honeycomb_nugget", has(nuggetregistry.HONEYCOMB_NUGGET.get()))
         .save(output);

        //------------------------------------------------------------lamps-----------------------------------------------------
         //apple
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.APPLE_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //potato
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.POTATO_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //beetroot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.BEETROOT_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //carrot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.CARROT_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //chorus
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.CHORUS_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //glow_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //melon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.MELON_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //sweet_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //brown_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //red_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //pumpkin
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.PUMPKIN_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //chicken
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.CHICKEN_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //cod
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.COD_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //salmon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.SALMON_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //tropical_fish
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //mutton
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.MUTTON_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //beef
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.BEEF_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //pork
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.PORK_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //rabbit
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.RABBIT_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //sugar
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.SUGAR_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);
         //honeycomb
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_LAMP_ITEM.get())
         .pattern("AAA")
         .pattern("ABA")
         .pattern("AAA")
         .define('A', ingotregistry.HONEYCOMB_INGOT.get())
         .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
         .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
         .save(output);

        //------------------------------------------------------------carpet----------------------------------------------------
         //apple
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.APPLE_NUGGET.get())
         .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
         .save(output);
         //potato
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.POTATO_NUGGET.get())
         .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
         .save(output);
         //beetroot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.BEETROOT_NUGGET.get())
         .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
         .save(output);
         //carrot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.CARROT_NUGGET.get())
         .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
         .save(output);
         //chorus
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.CHORUS_NUGGET.get())
         .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
         .save(output);
         //glow_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.GLOW_BERRY_NUGGET.get())
         .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
         .save(output);
         //melon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.MELON_NUGGET.get())
         .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
         .save(output);
         //sweet_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.SWEET_BERRY_NUGGET.get())
         .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
         .save(output);
         //brown_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
         .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
         .save(output);
         //red_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.RED_MUSHROOM_NUGGET.get())
         .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
         .save(output);
         //pumpkin
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.PUMPKIN_NUGGET.get())
         .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
         .save(output);
         //chicken
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.CHICKEN_NUGGET.get())
         .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
         .save(output);
         //cod
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.COD_NUGGET.get())
         .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
         .save(output);
         //salmon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.SALMON_NUGGET.get())
         .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
         .save(output);
         //tropical_fish
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.TROPICAL_FISH_NUGGET.get())
         .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
         .save(output);
         //mutton
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.MUTTON_NUGGET.get())
         .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
         .save(output);
         //beef
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.BEEF_NUGGET.get())
         .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
         .save(output);
         //pork
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.PORK_NUGGET.get())
         .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
         .save(output);
         //rabbit
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.RABBIT_NUGGET.get())
         .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
         .save(output);
         //sugar
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.SUGAR_NUGGET.get())
         .unlockedBy("has_sugar_nugget", has(nuggetregistry.SUGAR_NUGGET.get()))
         .save(output);
         //honeycomb
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_CARPET_ITEM.get(), 3)
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.HONEYCOMB_NUGGET.get())
         .unlockedBy("has_honeycomb_nugget", has(nuggetregistry.HONEYCOMB_NUGGET.get()))
         .save(output);
        //------------------------------------------------------------sword-----------------------------------------------------
         //apple_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.APPLE_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.APPLE_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
         .save(output);
         //potato_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.POTATO_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.POTATO_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
         .save(output);
         //beetroot_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.BEETROOT_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.BEETROOT_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
         .save(output);
         //carrot_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.CARROT_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.CARROT_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
         .save(output);
         //chorus_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.CHORUS_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.CHORUS_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
         .save(output);
         //glow_berry_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.GLOW_BERRY_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
         .save(output);
         //melon_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.MELON_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.MELON_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
         .save(output);
         //sweet_berry_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.SWEET_BERRY_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
         .save(output);
         //brown_mushroom_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.BROWN_MUSHROOM_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
         .save(output);
         //red_mushroom_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.RED_MUSHROOM_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
         .save(output);
         //pumpkin_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.PUMPKIN_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.PUMPKIN_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
         .save(output);
         //chicken_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.CHICKEN_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.CHICKEN_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
         .save(output);
         //cod_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.COD_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.COD_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
         .save(output);
         //salmon_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.SALMON_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.SALMON_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
         .save(output);
         //tropical_fish_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.TROPICAL_FISH_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
         .save(output);
         //mutton_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.MUTTON_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.MUTTON_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
         .save(output);
         //beef_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.BEEF_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.BEEF_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
         .save(output);
         //pork_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.PORK_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.PORK_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
         .save(output);
         //rabbit_sword
         ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, food_weapon_registry.RABBIT_SWORD.get())
         .pattern(" A ")
         .pattern(" A ")
         .pattern(" B ")
         .define('A', ingotregistry.RABBIT_INGOT.get())
         .define('B', Items.STICK)
         .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
         .save(output);

        //-----------------------------------------------------------lanterns---------------------------------------------------
         //apple_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.APPLE_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.APPLE_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
            .save(output);
            
         //potato_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.POTATO_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.POTATO_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
            .save(output);

         //beetroot_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.BEETROOT_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.BEETROOT_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
            .save(output);

         //carrot_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.CARROT_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.CARROT_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
            .save(output);

         //chorus_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.CHORUS_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.CHORUS_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
            .save(output);

         //glow_berry_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.GLOW_BERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.GLOW_BERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
            .save(output);

         //melon_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.MELON_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.MELON_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
            .save(output);

         //sweet_berry_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.SWEET_BERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.SWEET_BERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
            .save(output);

         //brown_mushroom_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
            .save(output);

         //red_mushroom_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.RED_MUSHROOM_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.RED_MUSHROOM_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
            .save(output);

         //pumpkin_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.PUMPKIN_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.PUMPKIN_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
            .save(output);

         //chicken_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.CHICKEN_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.CHICKEN_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
            .save(output);

         //cod_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.COD_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.COD_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
            .save(output);

         //salmon_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.SALMON_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.SALMON_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
            .save(output);

         //tropical_fish_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.TROPICAL_FISH_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.TROPICAL_FISH_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
            .save(output);

         //mutton_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.MUTTON_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.MUTTON_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
            .save(output);

         //beef_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.BEEF_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.BEEF_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
            .save(output);

         //pork_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.PORK_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.PORK_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
            .save(output);

         //rabbit_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.RABBIT_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.RABBIT_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
            .save(output);

         //sugar_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.SUGAR_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_sugar_nugget", has(nuggetregistry.SUGAR_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.SUGAR_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_sugar_nugget", has(nuggetregistry.SUGAR_NUGGET.get()))
            .save(output);

         //honeycomb_lantern
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.HONEYCOMB_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_honeycomb_nugget", has(nuggetregistry.HONEYCOMB_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.HONEYCOMB_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_honeycomb_nugget", has(nuggetregistry.HONEYCOMB_NUGGET.get()))
            .save(output);
      
        //------------------------------------------------------------chains----------------------------------------------------
         //apple
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.APPLE_NUGGET.get())
          .define('B', ingotregistry.APPLE_INGOT.get())
          .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
          .save(output);
          
         //potato
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.POTATO_NUGGET.get())
          .define('B', ingotregistry.POTATO_INGOT.get())
          .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
          .save(output);

         //beetroot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.BEETROOT_NUGGET.get())
          .define('B', ingotregistry.BEETROOT_INGOT.get())
          .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
          .save(output);

         //carrot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.CARROT_NUGGET.get())
          .define('B', ingotregistry.CARROT_INGOT.get())
          .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
          .save(output);

         //chorus
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.CHORUS_NUGGET.get())
          .define('B', ingotregistry.CHORUS_INGOT.get())
          .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
          .save(output);

         //glow_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.GLOW_BERRY_NUGGET.get())
          .define('B', ingotregistry.GLOW_BERRY_INGOT.get())
          .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
          .save(output);

         //melon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.MELON_NUGGET.get())
          .define('B', ingotregistry.MELON_INGOT.get())
          .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
          .save(output);

         //sweet_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.SWEET_BERRY_NUGGET.get())
          .define('B', ingotregistry.SWEET_BERRY_INGOT.get())
          .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
          .save(output);

         //brown_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
          .define('B', ingotregistry.BROWN_MUSHROOM_INGOT.get())
          .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
          .save(output);

         //red_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.RED_MUSHROOM_NUGGET.get())
          .define('B', ingotregistry.RED_MUSHROOM_INGOT.get())
          .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
          .save(output);

         //pumpkin
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.PUMPKIN_NUGGET.get())
          .define('B', ingotregistry.PUMPKIN_INGOT.get())
          .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
          .save(output);

         //chicken
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.CHICKEN_NUGGET.get())
          .define('B', ingotregistry.CHICKEN_INGOT.get())
          .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
          .save(output);

         //cod
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.COD_NUGGET.get())
          .define('B', ingotregistry.COD_INGOT.get())
          .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
          .save(output);

         //salmon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.SALMON_NUGGET.get())
          .define('B', ingotregistry.SALMON_INGOT.get())
          .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
          .save(output);

         //tropical_fish
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.TROPICAL_FISH_NUGGET.get())
          .define('B', ingotregistry.TROPICAL_FISH_INGOT.get())
          .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
          .save(output);

         //mutton
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.MUTTON_NUGGET.get())
          .define('B', ingotregistry.MUTTON_INGOT.get())
          .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
          .save(output);

         //beef
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.BEEF_NUGGET.get())
          .define('B', ingotregistry.BEEF_INGOT.get())
          .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
          .save(output);

         //pork
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.PORK_NUGGET.get())
          .define('B', ingotregistry.PORK_INGOT.get())
          .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
          .save(output);

         //rabbit
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.RABBIT_NUGGET.get())
          .define('B', ingotregistry.RABBIT_INGOT.get())
          .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
          .save(output);

         //sugar
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.SUGAR_NUGGET.get())
          .define('B', ingotregistry.SUGAR_INGOT.get())
          .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
          .save(output);

         //honeycomb
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_CHAIN_ITEM.get())
          .pattern(" A ")
          .pattern(" B ")
          .pattern(" A ")
          .define('A', nuggetregistry.HONEYCOMB_NUGGET.get())
          .define('B', ingotregistry.HONEYCOMB_INGOT.get())
          .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
          .save(output);

        //------------------------------------------------------------tables----------------------------------------------------
         //apple
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.APPLE_SLAB_ITEM.get())
          .define('B', ingotregistry.APPLE_INGOT.get())
          .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
          .save(output);
          
         //potato
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.POTATO_SLAB_ITEM.get())
          .define('B', ingotregistry.POTATO_INGOT.get())
          .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
          .save(output);

         //beetroot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.BEETROOT_SLAB_ITEM.get())
          .define('B', ingotregistry.BEETROOT_INGOT.get())
          .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
          .save(output);

         //carrot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.CARROT_SLAB_ITEM.get())
          .define('B', ingotregistry.CARROT_INGOT.get())
          .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
          .save(output);

         //chorus
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.CHORUS_SLAB_ITEM.get())
          .define('B', ingotregistry.CHORUS_INGOT.get())
          .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
          .save(output);

         //glow_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get())
          .define('B', ingotregistry.GLOW_BERRY_INGOT.get())
          .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
          .save(output);

         //melon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.MELON_SLAB_ITEM.get())
          .define('B', ingotregistry.MELON_INGOT.get())
          .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
          .save(output);

         //sweet_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get())
          .define('B', ingotregistry.SWEET_BERRY_INGOT.get())
          .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
          .save(output);

         //brown_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get())
          .define('B', ingotregistry.BROWN_MUSHROOM_INGOT.get())
          .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
          .save(output);

         //red_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get())
          .define('B', ingotregistry.RED_MUSHROOM_INGOT.get())
          .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
          .save(output);

         //pumpkin
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.PUMPKIN_SLAB_ITEM.get())
          .define('B', ingotregistry.PUMPKIN_INGOT.get())
          .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
          .save(output);

         //chicken
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.CHICKEN_SLAB_ITEM.get())
          .define('B', ingotregistry.CHICKEN_INGOT.get())
          .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
          .save(output);

         //cod
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.COD_SLAB_ITEM.get())
          .define('B', ingotregistry.COD_INGOT.get())
          .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
          .save(output);

         //salmon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.SALMON_SLAB_ITEM.get())
          .define('B', ingotregistry.SALMON_INGOT.get())
          .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
          .save(output);

         //tropical_fish
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get())
          .define('B', ingotregistry.TROPICAL_FISH_INGOT.get())
          .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
          .save(output);

         //mutton
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.MUTTON_SLAB_ITEM.get())
          .define('B', ingotregistry.MUTTON_INGOT.get())
          .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
          .save(output);

         //beef
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.BEEF_SLAB_ITEM.get())
          .define('B', ingotregistry.BEEF_INGOT.get())
          .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
          .save(output);

         //pork
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.PORK_SLAB_ITEM.get())
          .define('B', ingotregistry.PORK_INGOT.get())
          .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
          .save(output);

         //rabbit
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.RABBIT_SLAB_ITEM.get())
          .define('B', ingotregistry.RABBIT_INGOT.get())
          .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
          .save(output);

         //sugar
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.SUGAR_SLAB_ITEM.get())
          .define('B', ingotregistry.SUGAR_INGOT.get())
          .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
          .save(output);

         //honeycomb
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_TABLE_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("B B")
          .define('A', foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get())
          .define('B', ingotregistry.HONEYCOMB_INGOT.get())
          .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
          .save(output);

        //------------------------------------------------------------ladders----------------------------------------------------
         //apple
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.APPLE_INGOT.get())
          .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
          .save(output);
          
         //potato
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.POTATO_INGOT.get())
          .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
          .save(output);

         //beetroot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.BEETROOT_INGOT.get())
          .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
          .save(output);

         //carrot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.CARROT_INGOT.get())
          .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
          .save(output);

         //chorus
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.CHORUS_INGOT.get())
          .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
          .save(output);

         //glow_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.GLOW_BERRY_INGOT.get())
          .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
          .save(output);

         //melon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.MELON_INGOT.get())
          .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
          .save(output);

         //sweet_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.SWEET_BERRY_INGOT.get())
          .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
          .save(output);

         //brown_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.BROWN_MUSHROOM_INGOT.get())
          .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
          .save(output);

         //red_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.RED_MUSHROOM_INGOT.get())
          .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
          .save(output);

         //pumpkin
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.PUMPKIN_INGOT.get())
          .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
          .save(output);

         //chicken
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.CHICKEN_INGOT.get())
          .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
          .save(output);

         //cod
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.COD_INGOT.get())
          .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
          .save(output);

         //salmon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.SALMON_INGOT.get())
          .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
          .save(output);

         //tropical_fish
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.TROPICAL_FISH_INGOT.get())
          .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
          .save(output);

         //mutton
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.MUTTON_INGOT.get())
          .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
          .save(output);

         //beef
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.BEEF_INGOT.get())
          .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
          .save(output);

         //pork
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.PORK_INGOT.get())
          .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
          .save(output);

         //rabbit
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.RABBIT_INGOT.get())
          .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
          .save(output);

         //sugar
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.SUGAR_INGOT.get())
          .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
          .save(output);
         //honeycomb
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_LADDER_ITEM.get(), 3)
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.HONEYCOMB_INGOT.get())
          .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
          .save(output);

        //------------------------------------------------------------torches----------------------------------------------------
         //.....apple
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.APPLE_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.APPLE_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.APPLE_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
            .save(output);
            
         //.....potato
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.POTATO_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.POTATO_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.POTATO_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
            .save(output);

         //.....beetroot
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.BEETROOT_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.BEETROOT_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.BEETROOT_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
            .save(output);

         //.....carrot
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CARROT_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CARROT_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CARROT_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
            .save(output);

         //.....chorus
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CHORUS_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CHORUS_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CHORUS_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
            .save(output);

         //.....glow_berry
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.GLOW_BERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.GLOW_BERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.GLOW_BERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
            .save(output);

         //.....melon
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.MELON_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.MELON_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.MELON_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
            .save(output);

         //.....sweet_berry
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.SWEET_BERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.SWEET_BERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.SWEET_BERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
            .save(output);

         //.....brown_mushroom
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
            .save(output);
         //.....red_mushroom
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.RED_MUSHROOM_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.RED_MUSHROOM_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.RED_MUSHROOM_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
            .save(output);
            
         //.....pumpkin
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.PUMPKIN_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.PUMPKIN_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.PUMPKIN_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
            .save(output);

         //.....chicken
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CHICKEN_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CHICKEN_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CHICKEN_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
            .save(output);

         //.....cod
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.COD_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.COD_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.COD_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
            .save(output);
         //.....salmon
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.SALMON_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.SALMON_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.SALMON_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
            .save(output);

         //.....tropical_fish
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.TROPICAL_FISH_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.TROPICAL_FISH_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.TROPICAL_FISH_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
            .save(output);

         //.....mutton
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.MUTTON_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.MUTTON_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.MUTTON_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
            .save(output);
            
         //.....beef
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.BEEF_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.BEEF_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.BEEF_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
            .save(output);

         //.....pork
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.PORK_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.PORK_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.PORK_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
            .save(output);

         //.....rabbit
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.RABBIT_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.RABBIT_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.RABBIT_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
            .save(output);
         //.....sugar
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.SUGAR_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_sugar_nugget", has(nuggetregistry.SUGAR_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.SUGAR_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_sugar_nugget", has(nuggetregistry.SUGAR_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.SUGAR_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_sugar_nugget", has(nuggetregistry.SUGAR_NUGGET.get()))
            .save(output);
         //.....honeycomb
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.HONEYCOMB_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_honeycomb_nugget", has(nuggetregistry.HONEYCOMB_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.HONEYCOMB_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_honeycomb_nugget", has(nuggetregistry.HONEYCOMB_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.HONEYCOMB_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_honeycomb_nugget", has(nuggetregistry.HONEYCOMB_NUGGET.get()))
            .save(output);

        //------------------------------------------------------------furnaces----------------------------------------------------
         //.....apple
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.APPLE_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
            .save(output);
         //.....potato
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.POTATO_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
            .save(output);
         //.....beetroot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.BEETROOT_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
            .save(output);
         //.....carrot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.CARROT_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
            .save(output);
         //.....chorus
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.CHORUS_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
            .save(output);
         //.....glowberry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOWBERRY_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_glowberry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
            .save(output);
         //.....melon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.MELON_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
            .save(output);
         //.....sweet_berry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
            .save(output);
         //.....brown_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
            .save(output);
         //.....red_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
            .save(output);
         //.....pumpkin
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.PUMPKIN_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
            .save(output);
         //.....chicken
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.CHICKEN_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
            .save(output);
         //.....cod
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.COD_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
            .save(output);
         //.....salmon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.SALMON_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
            .save(output);
         //.....tropical_fish
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
            .save(output);
         //.....mutton
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.MUTTON_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
            .save(output);
         //.....beef
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.BEEF_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
            .save(output);
         //.....pork
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.PORK_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
            .save(output);
         //.....rabbit
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.RABBIT_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
            .save(output);
         //.....sugar
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.SUGAR_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
            .save(output);
         //.....honeycomb
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_FURNACE_ITEM.get())
            .pattern("ABA")
            .pattern("B B")
            .pattern("ABA")
            .define('A', ingotregistry.HONEYCOMB_INGOT.get())
            .define('B', Items.COBBLESTONE)
            .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
            .save(output);
  
        //------------------------------------------------------------paths----------------------------------------------------
         //.....apple
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.APPLE_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.APPLE_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_apple_block", has(foodblockitemregistry.APPLE_BLOCK_ITEM.get()))
            .save(output);
         //.....potato
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.POTATO_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.POTATO_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_potato_block", has(foodblockitemregistry.POTATO_BLOCK_ITEM.get()))
            .save(output);
         //.....beetroot
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_beetroot_block", has(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()))
            .save(output);
         //.....carrot
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.CARROT_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.CARROT_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_carrot_block", has(foodblockitemregistry.CARROT_BLOCK_ITEM.get()))
            .save(output);
         //.....chorus
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.CHORUS_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.CHORUS_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_chorus_block", has(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()))
            .save(output);
         //.....glow_berry
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
            .save(output);
         //.....melon
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.MELON_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.MELON_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_melon_block", has(foodblockitemregistry.MELON_BLOCK_ITEM.get()))
            .save(output);
         //.....sweet_berry
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_sweet_berry_block", has(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()))
            .save(output);
         //.....brown_mushroom
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_brown_mushroom_block", has(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()))
            .save(output);
         //.....red_mushroom
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_red_mushroom_block", has(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()))
            .save(output);
         //.....pumpkin
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_pumpkin_block", has(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()))
            .save(output);
         //.....chicken
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_chicken_block", has(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()))
            .save(output);
         //.....cod
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.COD_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.COD_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_cod_block", has(foodblockitemregistry.COD_BLOCK_ITEM.get()))
            .save(output);
         //.....salmon
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.SALMON_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.SALMON_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_salmon_block", has(foodblockitemregistry.SALMON_BLOCK_ITEM.get()))
            .save(output);
         //.....tropical_fish
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_tropical_fish_block", has(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()))
            .save(output);
         //.....mutton
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.MUTTON_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.MUTTON_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_mutton_block", has(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()))
            .save(output);
         //.....beef
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.BEEF_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.BEEF_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_beef_block", has(foodblockitemregistry.BEEF_BLOCK_ITEM.get()))
            .save(output);
         //.....pork
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.PORK_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.PORK_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_pork_block", has(foodblockitemregistry.PORK_BLOCK_ITEM.get()))
            .save(output);
         //.....rabbit
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.RABBIT_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.RABBIT_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_rabbit_block", has(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()))
            .save(output);
         //.....sugar
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.SUGAR_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.SUGAR_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_sugar_block", has(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()))
            .save(output);
         //.....honeycomb
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_STONE_PATH_ITEM.get(), 6)
            .requires(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get())
            .requires(Items.STONE)
            .unlockedBy("has_honeycomb_block", has(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()))
            .save(output);
        //-----------------------------------------------------------barrels----------------------------------------------------------------------
         //apple
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.APPLE_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.APPLE_SLAB_ITEM.get())
           .unlockedBy("has_apple_block", has(foodblockitemregistry.APPLE_BLOCK_ITEM.get()))
           .save(output);
         //potato
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.POTATO_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.POTATO_SLAB_ITEM.get())
           .unlockedBy("has_potato_block", has(foodblockitemregistry.POTATO_BLOCK_ITEM.get()))
           .save(output);
         //beetroot
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.BEETROOT_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.BEETROOT_SLAB_ITEM.get())
           .unlockedBy("has_beetroot_block", has(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()))
           .save(output);
         //carrot
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.CARROT_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.CARROT_SLAB_ITEM.get())
           .unlockedBy("has_carrot_block", has(foodblockitemregistry.CARROT_BLOCK_ITEM.get()))
           .save(output);
         //chorus
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.CHORUS_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.CHORUS_SLAB_ITEM.get())
           .unlockedBy("has_chorus_block", has(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()))
           .save(output);
         //glowberry
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOWBERRY_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get())
           .unlockedBy("has_glowberry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
           .save(output);
         //melon
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.MELON_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.MELON_SLAB_ITEM.get())
           .unlockedBy("has_melon_block", has(foodblockitemregistry.MELON_BLOCK_ITEM.get()))
           .save(output);
         //sweetberry
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEETBERRY_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get())
           .unlockedBy("has_sweetberry_block", has(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()))
           .save(output);
         //brownmushroom
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWNMUSHROOM_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get())
           .unlockedBy("has_brownmushroom_block", has(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()))
           .save(output);
         //redmushroom
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.REDMUSHROOM_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get())
           .unlockedBy("has_redmushroom_block", has(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()))
           .save(output);
         //pumpkin
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.PUMPKIN_SLAB_ITEM.get())
           .unlockedBy("has_pumpkin_block", has(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()))
           .save(output);
         //chicken
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.CHICKEN_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.CHICKEN_SLAB_ITEM.get())
           .unlockedBy("has_chicken_block", has(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()))
           .save(output);
         //cod
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.COD_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.COD_SLAB_ITEM.get())
           .unlockedBy("has_cod_block", has(foodblockitemregistry.COD_BLOCK_ITEM.get()))
           .save(output);
         //salmon
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.SALMON_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.SALMON_SLAB_ITEM.get())
           .unlockedBy("has_salmon_block", has(foodblockitemregistry.SALMON_BLOCK_ITEM.get()))
           .save(output);
         //tropicalfish
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICALFISH_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get())
           .unlockedBy("has_tropicalfish_block", has(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()))
           .save(output);
         //mutton
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.MUTTON_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.MUTTON_SLAB_ITEM.get())
           .unlockedBy("has_mutton_block", has(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()))
           .save(output);
         //beef
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.BEEF_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.BEEF_SLAB_ITEM.get())
           .unlockedBy("has_beef_block", has(foodblockitemregistry.BEEF_BLOCK_ITEM.get()))
           .save(output);
         //pork
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.PORK_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.PORK_SLAB_ITEM.get())
           .unlockedBy("has_pork_block", has(foodblockitemregistry.PORK_BLOCK_ITEM.get()))
           .save(output);
         //rabbit
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.RABBIT_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.RABBIT_SLAB_ITEM.get())
           .unlockedBy("has_rabbit_block", has(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()))
           .save(output);
         //sugar
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.SUGAR_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.SUGAR_SLAB_ITEM.get())
           .unlockedBy("has_sugar_block", has(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()))
           .save(output);
         //honeycomb
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_BARREL_ITEM.get())
           .pattern("ABA")
           .pattern("A A")
           .pattern("ABA")
           .define('A', foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get())
           .define('B', foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get())
           .unlockedBy("has_honeycomb_block", has(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()))
           .unlockedBy("has_honeycomb_block", has(foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get()))
           .save(output);
        //-----------------------------------------------------------chairs----------------------------------------------------------------------
         //apple
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.APPLE_INGOT.get())
           .define('B', foodblockitemregistry.APPLE_SLAB_ITEM.get())
           .unlockedBy("has_apple_slab", has(foodblockitemregistry.APPLE_SLAB_ITEM.get()))
           .save(output);
         //potato
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.POTATO_INGOT.get())
           .define('B', foodblockitemregistry.POTATO_SLAB_ITEM.get())
           .unlockedBy("has_potato_slab", has(foodblockitemregistry.POTATO_SLAB_ITEM.get()))
           .save(output);
         //beetroot
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.BEETROOT_INGOT.get())
           .define('B', foodblockitemregistry.BEETROOT_SLAB_ITEM.get())
           .unlockedBy("has_beetroot_slab", has(foodblockitemregistry.BEETROOT_SLAB_ITEM.get()))
           .save(output);
         //carrot
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.CARROT_INGOT.get())
           .define('B', foodblockitemregistry.CARROT_SLAB_ITEM.get())
           .unlockedBy("has_carrot_slab", has(foodblockitemregistry.CARROT_SLAB_ITEM.get()))
           .save(output);
         //chorus
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.CHORUS_INGOT.get())
           .define('B', foodblockitemregistry.CHORUS_SLAB_ITEM.get())
           .unlockedBy("has_chorus_slab", has(foodblockitemregistry.CHORUS_SLAB_ITEM.get()))
           .save(output);
         //glow_berry
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
           .define('B', foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get())
           .unlockedBy("has_glow_berry_slab", has(foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get()))
           .save(output);
         //melon
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.MELON_INGOT.get())
           .define('B', foodblockitemregistry.MELON_SLAB_ITEM.get())
           .unlockedBy("has_melon_slab", has(foodblockitemregistry.MELON_SLAB_ITEM.get()))
           .save(output);
         //sweet_berry
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
           .define('B', foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get())
           .unlockedBy("has_sweet_berry_slab", has(foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get()))
           .save(output);
         //brown_mushroom
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
           .define('B', foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get())
           .unlockedBy("has_brown_mushroom_slab", has(foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get()))
           .save(output);
         //red_mushroom
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
           .define('B', foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get())
           .unlockedBy("has_red_mushroom_slab", has(foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get()))
           .save(output);
         //pumpkin
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.PUMPKIN_INGOT.get())
           .define('B', foodblockitemregistry.PUMPKIN_SLAB_ITEM.get())
           .unlockedBy("has_pumpkin_slab", has(foodblockitemregistry.PUMPKIN_SLAB_ITEM.get()))
           .save(output);
         //chicken
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.CHICKEN_INGOT.get())
           .define('B', foodblockitemregistry.CHICKEN_SLAB_ITEM.get())
           .unlockedBy("has_chicken_slab", has(foodblockitemregistry.CHICKEN_SLAB_ITEM.get()))
           .save(output);
         //cod
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.COD_INGOT.get())
           .define('B', foodblockitemregistry.COD_SLAB_ITEM.get())
           .unlockedBy("has_cod_slab", has(foodblockitemregistry.COD_SLAB_ITEM.get()))
           .save(output);
         //salmon
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.SALMON_INGOT.get())
           .define('B', foodblockitemregistry.SALMON_SLAB_ITEM.get())
           .unlockedBy("has_salmon_slab", has(foodblockitemregistry.SALMON_SLAB_ITEM.get()))
           .save(output);
         //tropical_fish
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
           .define('B', foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get())
           .unlockedBy("has_tropical_fish_slab", has(foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get()))
           .save(output);
         //mutton
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.MUTTON_INGOT.get())
           .define('B', foodblockitemregistry.MUTTON_SLAB_ITEM.get())
           .unlockedBy("has_mutton_slab", has(foodblockitemregistry.MUTTON_SLAB_ITEM.get()))
           .save(output);
         //beef
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.BEEF_INGOT.get())
           .define('B', foodblockitemregistry.BEEF_SLAB_ITEM.get())
           .unlockedBy("has_beef_slab", has(foodblockitemregistry.BEEF_SLAB_ITEM.get()))
           .save(output);
         //pork
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.PORK_INGOT.get())
           .define('B', foodblockitemregistry.PORK_SLAB_ITEM.get())
           .unlockedBy("has_pork_slab", has(foodblockitemregistry.PORK_SLAB_ITEM.get()))
           .save(output);
         //rabbit
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.RABBIT_INGOT.get())
           .define('B', foodblockitemregistry.RABBIT_SLAB_ITEM.get())
           .unlockedBy("has_rabbit_slab", has(foodblockitemregistry.RABBIT_SLAB_ITEM.get()))
           .save(output);
         //sugar
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.SUGAR_INGOT.get())
           .define('B', foodblockitemregistry.SUGAR_SLAB_ITEM.get())
           .unlockedBy("has_sugar_slab", has(foodblockitemregistry.SUGAR_SLAB_ITEM.get()))
           .save(output);
         //honeycomb
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_CHAIR_ITEM.get())
           .pattern("AAA")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.HONEYCOMB_INGOT.get())
           .define('B', foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get())
           .unlockedBy("has_honeycomb_slab", has(foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get()))
           .save(output);
        //-----------------------------------------------------------beds----------------------------------------------------------------------
         //apple
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.APPLE_INGOT.get())
           .define('B', foodblockitemregistry.APPLE_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.APPLE_CARPET_ITEM.get())
           .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
           .save(output);
         //potato
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.POTATO_INGOT.get())
           .define('B', foodblockitemregistry.POTATO_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.POTATO_CARPET_ITEM.get())
           .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
           .save(output);
         //beetroot
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.BEETROOT_INGOT.get())
           .define('B', foodblockitemregistry.BEETROOT_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.BEETROOT_CARPET_ITEM.get())
           .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
           .save(output);
         //carrot
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.CARROT_INGOT.get())
           .define('B', foodblockitemregistry.CARROT_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.CARROT_CARPET_ITEM.get())
           .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
           .save(output);
         //chorus
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.CHORUS_INGOT.get())
           .define('B', foodblockitemregistry.CHORUS_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.CHORUS_CARPET_ITEM.get())
           .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
           .save(output);
         //glow_berry
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
           .define('B', foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.GLOW_BERRY_CARPET_ITEM.get())
           .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
           .save(output);
         //melon
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.MELON_INGOT.get())
           .define('B', foodblockitemregistry.MELON_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.MELON_CARPET_ITEM.get())
           .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
           .save(output);
         //sweet_berry
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
           .define('B', foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.SWEET_BERRY_CARPET_ITEM.get())
           .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
           .save(output);
         //brown_mushroom
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
           .define('B', foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.BROWN_MUSHROOM_CARPET_ITEM.get())
           .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
           .save(output);
         //red_mushroom
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
           .define('B', foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.RED_MUSHROOM_CARPET_ITEM.get())
           .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
           .save(output);
         //pumpkin
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.PUMPKIN_INGOT.get())
           .define('B', foodblockitemregistry.PUMPKIN_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.PUMPKIN_CARPET_ITEM.get())
           .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
           .save(output);
         //chicken
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.CHICKEN_INGOT.get())
           .define('B', foodblockitemregistry.CHICKEN_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.CHICKEN_CARPET_ITEM.get())
           .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
           .save(output);
         //cod
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.COD_INGOT.get())
           .define('B', foodblockitemregistry.COD_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.COD_CARPET_ITEM.get())
           .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
           .save(output);
         //salmon
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.SALMON_INGOT.get())
           .define('B', foodblockitemregistry.SALMON_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.SALMON_CARPET_ITEM.get())
           .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
           .save(output);
         //tropical_fish
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
           .define('B', foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.TROPICAL_FISH_CARPET_ITEM.get())
           .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
           .save(output);
         //mutton
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.MUTTON_INGOT.get())
           .define('B', foodblockitemregistry.MUTTON_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.MUTTON_CARPET_ITEM.get())
           .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
           .save(output);
         //beef
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.BEEF_INGOT.get())
           .define('B', foodblockitemregistry.BEEF_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.BEEF_CARPET_ITEM.get())
           .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
           .save(output);
         //pork
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.PORK_INGOT.get())
           .define('B', foodblockitemregistry.PORK_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.PORK_CARPET_ITEM.get())
           .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
           .save(output);
         //rabbit
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.RABBIT_INGOT.get())
           .define('B', foodblockitemregistry.RABBIT_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.RABBIT_CARPET_ITEM.get())
           .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
           .save(output);
         //sugar
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.SUGAR_INGOT.get())
           .define('B', foodblockitemregistry.SUGAR_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.SUGAR_CARPET_ITEM.get())
           .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
           .save(output);
         //honeycomb
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.HONEYCOMB_INGOT.get())
           .define('B', foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get())
           .define('C', foodblockitemregistry.HONEYCOMB_CARPET_ITEM.get())
           .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
           .save(output);
        //-----------------------------------------------------------cabinets----------------------------------------------------------------------
        }
     protected void buildToolRecipes(RecipeOutput output) {
          //advanced mushhammer
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.advanced_mushhammer.get(), 1)
          .pattern("AA ")
          .pattern("AB ")
          .pattern("  B")
          .define('A', Items.GOLD_INGOT)
          .define('B', Items.STICK)
          .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
          .save(output);

         //advanced meatgrinder
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.advanced_meatgrinder.get(), 1)
          .pattern("BA ")
          .pattern("A A")
          .pattern(" A ")
          .define('A', Items.GOLD_INGOT)
          .define('B', Items.STICK)
          .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
          .save(output);

          //more advanced mushhammer
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.more_advanced_mushhammer.get(), 1)
          .pattern("AA ")
          .pattern("AB ")
          .pattern("  B")
          .define('A', Items.DIAMOND)
          .define('B', Items.STICK)
          .unlockedBy("has_diamond", has(Items.DIAMOND))
          .save(output);

        //more advanced meatgrinder
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.more_advanced_meatgrinder.get(), 1)
          .pattern("BA ")
          .pattern("A A")
          .pattern(" A ")
          .define('A', Items.DIAMOND)
          .define('B', Items.STICK)
          .unlockedBy("has_diamond", has(Items.DIAMOND))
          .save(output);

        //most advanced mushhammer
          SmithingTransformRecipeBuilder.smithing(
          Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
          Ingredient.of(mushregistry.more_advanced_mushhammer.get()),
          Ingredient.of(Items.NETHERITE_INGOT),
          RecipeCategory.MISC,
          mushregistry.most_advanced_mushhammer.get())
          .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
          .save(output, "most_advanced_mushhammer_smithing");

        //most advanced meatgrinder
          SmithingTransformRecipeBuilder.smithing(
          Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
          Ingredient.of(mushregistry.more_advanced_meatgrinder.get()),
          Ingredient.of(Items.NETHERITE_INGOT),
          RecipeCategory.MISC,
          mushregistry.most_advanced_meatgrinder.get())
          .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
          .save(output, "most_advanced_meatgrinder_smithing");
       };
     protected void buildMushRecipes(RecipeOutput output) {
      //apple
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.APPLE_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.APPLE)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced apple
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.APPLE_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.APPLE)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "apple_mush_by_advanced_mush_hammer");
       //more advanced apple
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.APPLE_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.APPLE)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "apple_mush_by_more_advanced_mush_hammer");
       //most advanced apple
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.APPLE_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.APPLE)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "apple_mush_by_most_advanced_mush_hammer");

      //potato
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.POTATO_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.POTATO)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced potato
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.POTATO_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.POTATO)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "potato_mush_by_advanced_mush_hammer");
       //more advanced potato
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.POTATO_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.POTATO)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "potato_more_advanced_mush_hammer");
       //most advanced potato
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.POTATO_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.POTATO)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "potato_most_advanced_mush_hammer");

      //beetroot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.BEETROOT_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.BEETROOT)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced beetroot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.BEETROOT_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.BEETROOT)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "beetroot_mush_by_advanced_mush_hammer");
       //more advanced beetroot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.BEETROOT_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.BEETROOT)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "beetroot_mush_by_more_advanced_mush_hammer");
       //most advanced beetroot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.BEETROOT_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.BEETROOT)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "beetroot_mush_by_most_advanced_mush_hammer");

      //carrot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.CARROT_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.CARROT)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced carrot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.CARROT_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.CARROT)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "carrot_mush_by_advanced_mush_hammer");
       //more advanced carrot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.CARROT_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.CARROT)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "carrot_mush_by_more_advanced_mush_hammer");
       //most advanced carrot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.CARROT_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.CARROT)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "carrot_mush_by_most_advanced_mush_hammer");

      //chorus
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.CHORUS_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.CHORUS_FRUIT)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced chorus
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.CHORUS_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.CHORUS_FRUIT)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "chorus_mush_by_advanced_mush_hammer");
       //more advanced chorus
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.CHORUS_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.CHORUS_FRUIT)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "chorus_mush_by_more_advanced_mush_hammer");
       //most advanced chorus
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.CHORUS_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.CHORUS_FRUIT)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "chorus_mush_by_most_advanced_mush_hammer");

      //glow_berry
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GLOWBERRY_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.GLOW_BERRIES)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced glow_berry
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GLOWBERRY_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.GLOW_BERRIES)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "glow_berry_mush_by_advanced_mush_hammer");
       //more advanced glow_berry
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GLOWBERRY_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.GLOW_BERRIES)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "glow_berry_mush_by_more_advanced_mush_hammer");
       //most advanced glow_berry
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GLOWBERRY_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.GLOW_BERRIES)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "glow_berry_mush_by_most_advanced_mush_hammer");

      //melon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.MELON_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.MELON_SLICE)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced melon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.MELON_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.MELON_SLICE)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "melon_mush_by_advanced_mush_hammer");
       //more advanced melon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.MELON_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.MELON_SLICE)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "melon_mush_by_more_advanced_mush_hammer");
       //most advanced melon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.MELON_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.MELON_SLICE)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "melon_mush_by_most_advanced_mush_hammer");

      //sweetberry
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.SWEETBERRY_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.SWEET_BERRIES)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced sweetberry
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.SWEETBERRY_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.SWEET_BERRIES)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "sweet_berry_mush_by_advanced_mush_hammer");
       //more advanced sweetberry
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.SWEETBERRY_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.SWEET_BERRIES)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "sweet_berry_mush_by_more_advanced_mush_hammer");
       //most advanced sweetberry
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.SWEETBERRY_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.SWEET_BERRIES)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "sweet_berry_mush_by_most_advanced_mush_hammer");

      //brown_mushroom
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.BROWN_MUSHROOM_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.BROWN_MUSHROOM)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced brown_mushroom
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.BROWN_MUSHROOM_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.BROWN_MUSHROOM)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "brown_mushroom_mush_by_advanced_mush_hammer");
       //more advanced brown_mushroom
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.BROWN_MUSHROOM_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.BROWN_MUSHROOM)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "brown_mushroom_mush_by_more_advanced_mush_hammer");
       //most advanced brown_mushroom
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.BROWN_MUSHROOM_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.BROWN_MUSHROOM)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "brown_mushroom_mush_by_most_advanced_mush_hammer");

      //red mushroom
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.RED_MUSHROOM_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.RED_MUSHROOM)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced red mushroom
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.RED_MUSHROOM_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.RED_MUSHROOM)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "red_mushroom_mush_by_advanced_mush_hammer");
       //more advanced red mushroom
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.RED_MUSHROOM_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.RED_MUSHROOM)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "red_mushroom_mush_by_more_advanced_mush_hammer");
       //most advanced red mushroom
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.RED_MUSHROOM_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.RED_MUSHROOM)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "red_mushroom_mush_by_most_advanced_mush_hammer");

      //pumpkin
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.PUMPKIN_MUSH.get(), 1)
        .pattern("ABB")
        .pattern("   ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.PUMPKIN)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output);
       //advanced pumpkin
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.PUMPKIN_MUSH.get(), 2)
        .pattern("ABB")
        .pattern("   ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.PUMPKIN)
        .unlockedBy("has_advanced_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "pumpkin_mush_by_advanced_mush_hammer");
       //more advanced pumpkin
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.PUMPKIN_MUSH.get(), 4)
        .pattern("ABB")
        .pattern("   ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.PUMPKIN)
        .unlockedBy("has_more_advanced_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "pumpkin_mush_by_more_advanced_mush_hammer");
       //most advanced pumpkin
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.PUMPKIN_MUSH.get(), 8)
        .pattern("ABB")
        .pattern("   ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.PUMPKIN)
        .unlockedBy("has_most_advanced_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "pumpkin_mush_by_most_advanced_mush_hammer");

      //chicken
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_CHICKEN.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.meatgrinder.get())
        .define('B', CHICKEN_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.meatgrinder.get()))
        .save(output);
       //advanced chicken
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_CHICKEN.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_meatgrinder.get())
        .define('B', CHICKEN_TAG)
        .unlockedBy("has_advanced_meat_grinder", has(mushregistry.advanced_meatgrinder.get()))
        .save(output, "ground_chicken_by_advanced_meatgrinder");
       //more advanced chicken
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_CHICKEN.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_meatgrinder.get())
        .define('B', CHICKEN_TAG)
        .unlockedBy("has_more_advanced_meat_grinder", has(mushregistry.more_advanced_meatgrinder.get()))
        .save(output, "ground_chicken_by_more_advanced_meatgrinder");
       //most advanced chicken
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_CHICKEN.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_meatgrinder.get())
        .define('B', CHICKEN_TAG)
        .unlockedBy("has_most_advanced_meat_grinder", has(mushregistry.most_advanced_meatgrinder.get()))
        .save(output, "ground_chicken_by_most_advanced_meatgrinder");

      //cod
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_COD.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.meatgrinder.get())
        .define('B', COD_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.meatgrinder.get()))
        .save(output);
       //advanced cod
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_COD.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_meatgrinder.get())
        .define('B', COD_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.advanced_meatgrinder.get()))
        .save(output, "ground_cod_by_advanced_meatgrinder");
       //more advanced cod
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_COD.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_meatgrinder.get())
        .define('B', COD_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.more_advanced_meatgrinder.get()))
        .save(output, "ground_cod_by_more_advanced_meatgrinder");
       //most advanced cod
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_COD.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_meatgrinder.get())
        .define('B', COD_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.most_advanced_meatgrinder.get()))
        .save(output, "ground_cod_by_most_advanced_meatgrinder");

      //salmon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_SALMON.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.meatgrinder.get())
        .define('B', SALMON_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.meatgrinder.get()))
        .save(output);
       //advanced salmon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_SALMON.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_meatgrinder.get())
        .define('B', SALMON_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.advanced_meatgrinder.get()))
        .save(output, "ground_salmon_by_advanced_meatgrinder");
       //more advanced salmon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_SALMON.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_meatgrinder.get())
        .define('B', SALMON_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.more_advanced_meatgrinder.get()))
        .save(output, "ground_salmon_by_more_advanced_meatgrinder");
       //most advanced salmon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_SALMON.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_meatgrinder.get())
        .define('B', SALMON_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.most_advanced_meatgrinder.get()))
        .save(output, "ground_salmon_by_most_advanced_meatgrinder");

      //tropical_fish
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_TROPICAL_FISH.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.meatgrinder.get())
        .define('B', Items.TROPICAL_FISH)
        .unlockedBy("has_meat_grinder", has(mushregistry.meatgrinder.get()))
        .save(output);
       //advanced tropical_fish
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_TROPICAL_FISH.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_meatgrinder.get())
        .define('B', Items.TROPICAL_FISH)
        .unlockedBy("has_meat_grinder", has(mushregistry.advanced_meatgrinder.get()))
        .save(output, "ground_tropical_fish_by_advanced_meatgrinder");
       //more advanced tropical_fish
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_TROPICAL_FISH.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_meatgrinder.get())
        .define('B', Items.TROPICAL_FISH)
        .unlockedBy("has_meat_grinder", has(mushregistry.more_advanced_meatgrinder.get()))
        .save(output, "ground_tropical_fish_by_more_advanced_meatgrinder");
       //most advanced tropical_fish
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_TROPICAL_FISH.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_meatgrinder.get())
        .define('B', Items.TROPICAL_FISH)
        .unlockedBy("has_meat_grinder", has(mushregistry.most_advanced_meatgrinder.get()))
        .save(output, "ground_tropical_fish_by_most_advanced_meatgrinder");

      //mutton
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_MUTTON.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.meatgrinder.get())
        .define('B', MUTTON_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.meatgrinder.get()))
        .save(output);
       //advanced mutton
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_MUTTON.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_meatgrinder.get())
        .define('B', MUTTON_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.advanced_meatgrinder.get()))
        .save(output, "ground_mutton_by_advanced_meatgrinder");
       //more advanced mutton
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_MUTTON.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_meatgrinder.get())
        .define('B', MUTTON_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.more_advanced_meatgrinder.get()))
        .save(output, "ground_mutton_by_more_advanced_meatgrinder");
       //most advanced mutton
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_MUTTON.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_meatgrinder.get())
        .define('B', MUTTON_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.most_advanced_meatgrinder.get()))
        .save(output, "ground_mutton_by_most_advanced_meatgrinder");

      //beef
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_BEEF.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.meatgrinder.get())
        .define('B', BEEF_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.meatgrinder.get()))
        .save(output);
       //advanced beef
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_BEEF.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_meatgrinder.get())
        .define('B', BEEF_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.advanced_meatgrinder.get()))
        .save(output, "ground_beef_by_advanced_meatgrinder");
       //more advanced beef
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_BEEF.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_meatgrinder.get())
        .define('B', BEEF_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.more_advanced_meatgrinder.get()))
        .save(output, "ground_beef_by_more_advanced_meatgrinder");
       //most advanced beef
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_BEEF.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_meatgrinder.get())
        .define('B', BEEF_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.most_advanced_meatgrinder.get()))
        .save(output, "ground_beef_by_most_advanced_meatgrinder");

      //pork
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_PORK.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.meatgrinder.get())
        .define('B', PORK_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.meatgrinder.get()))
        .save(output);
       //advanced pork
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_PORK.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_meatgrinder.get())
        .define('B', PORK_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.advanced_meatgrinder.get()))
        .save(output, "ground_pork_by_advanced_meatgrinder");
       //more advanced pork
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_PORK.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_meatgrinder.get())
        .define('B', PORK_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.more_advanced_meatgrinder.get()))
        .save(output, "ground_pork_by_more_advanced_meatgrinder");
       //most advanced pork
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_PORK.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_meatgrinder.get())
        .define('B', PORK_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.most_advanced_meatgrinder.get()))
        .save(output, "ground_pork_by_most_advanced_meatgrinder");

      //rabbit
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_RABBIT.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.meatgrinder.get())
        .define('B', RABBIT_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.meatgrinder.get()))
        .save(output);
       //advanced rabbit
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_RABBIT.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_meatgrinder.get())
        .define('B', RABBIT_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.advanced_meatgrinder.get()))
        .save(output, "ground_rabbit_by_advanced_meatgrinder");
       //more advanced rabbit
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_RABBIT.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_meatgrinder.get())
        .define('B', RABBIT_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.more_advanced_meatgrinder.get()))
        .save(output, "ground_rabbit_by_more_advanced_meatgrinder");
       //most advanced rabbit
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.GROUND_RABBIT.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_meatgrinder.get())
        .define('B', RABBIT_TAG)
        .unlockedBy("has_meat_grinder", has(mushregistry.most_advanced_meatgrinder.get()))
        .save(output, "ground_rabbit_by_most_advanced_meatgrinder");

      //sugar
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 3)
        .requires(mushregistry.mushhammer.get())
        .requires(Items.SUGAR_CANE)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .save(output, "sugar_from_mushhammer");
       //advanced sugar
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 6)
        .requires(mushregistry.advanced_mushhammer.get())
        .requires(Items.SUGAR_CANE)
        .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .save(output, "sugar_from_advanced_mushhammer");
       //more advanced sugar
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 12)
        .requires(mushregistry.more_advanced_mushhammer.get())
        .requires(Items.SUGAR_CANE)
        .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .save(output, "sugar_from_more_advanced_mushhammer");
       //most advanced sugar
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 24)
        .requires(mushregistry.most_advanced_mushhammer.get())
        .requires(Items.SUGAR_CANE)
        .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .save(output, "sugar_from_most_advanced_mushhammer");

      //sugar_paste
       //one
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.SUGAR_PASTE.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', Items.WATER_BUCKET)
        .define('B', Items.SUGAR)
        .unlockedBy("has_sugar", has(Items.SUGAR))
        .save(output);
       //two
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.SUGAR_PASTE.get(), 2)
        .pattern("BBB")
        .pattern("BAB")
        .pattern("BBB")
        .define('A', Items.WATER_BUCKET)
        .define('B', Items.SUGAR)
        .unlockedBy("has_sugar", has(Items.SUGAR))
        .save(output, "two_sugar_pastes_recipe");
      //honeycomb_powder
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.HONEYCOMB_POWDER.get(), 1)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.mushhammer.get())
        .define('B', Items.HONEYCOMB)
        .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
        .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
        .save(output);
      //honeycomb_powder_advanced
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.HONEYCOMB_POWDER.get(), 2)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.advanced_mushhammer.get())
        .define('B', Items.HONEYCOMB)
        .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
        .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
        .save(output, "honeycomb_powder_advanced");
      //honeycomb_powder_more_advanced
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.HONEYCOMB_POWDER.get(), 4)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.more_advanced_mushhammer.get())
        .define('B', Items.HONEYCOMB)
        .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
        .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
        .save(output, "honeycomb_powder_more_advanced");
      //honeycomb_powder_most_advanced
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.HONEYCOMB_POWDER.get(), 8)
        .pattern("ABB")
        .pattern("BB ")
        .pattern("   ")
        .define('A', mushregistry.most_advanced_mushhammer.get())
        .define('B', Items.HONEYCOMB)
        .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
        .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
        .save(output, "honeycomb_powder_most_advanced");
      };
     protected void buildIngotRecipes(RecipeOutput output) {
      //apple
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.APPLE_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.APPLE_NUGGET.get())
        .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
        .save(output, "apple_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.APPLE_INGOT.get(), 9)
        .requires(foodblockitemregistry.APPLE_BLOCK_ITEM.get())
        .unlockedBy("has_apple_block", has(foodblockitemregistry.APPLE_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.APPLE_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.APPLE_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_apple_mush", has(mushregistry.APPLE_MUSH.get()))
        .save(output, "apple_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.APPLE_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.APPLE_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_apple_mush", has(mushregistry.APPLE_MUSH.get()))
        .save(output, "apple_ingot_from_blasting");
      //potato
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.POTATO_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.POTATO_NUGGET.get())
        .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
        .save(output, "potato_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.POTATO_INGOT.get(), 9)
        .requires(foodblockitemregistry.POTATO_BLOCK_ITEM.get())
        .unlockedBy("has_potato_block", has(foodblockitemregistry.POTATO_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.POTATO_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.POTATO_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_potato_mush", has(mushregistry.POTATO_MUSH.get()))
        .save(output, "potato_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.POTATO_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.POTATO_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_potato_mush", has(mushregistry.POTATO_MUSH.get()))
        .save(output, "potato_ingot_from_blasting");
      //beetroot
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.BEETROOT_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.BEETROOT_NUGGET.get())
        .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
        .save(output, "beetroot_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.BEETROOT_INGOT.get(), 9)
        .requires(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get())
        .unlockedBy("has_beetroot_block", has(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.BEETROOT_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.BEETROOT_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_beetroot_mush", has(mushregistry.BEETROOT_MUSH.get()))
        .save(output, "beetroot_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.BEETROOT_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.BEETROOT_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_beetroot_mush", has(mushregistry.BEETROOT_MUSH.get()))
        .save(output, "beetroot_ingot_from_blasting");
      //carrot
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.CARROT_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.CARROT_NUGGET.get())
        .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
        .save(output, "carrot_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.CARROT_INGOT.get(), 9)
        .requires(foodblockitemregistry.CARROT_BLOCK_ITEM.get())
        .unlockedBy("has_carrot_block", has(foodblockitemregistry.CARROT_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.CARROT_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.CARROT_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_carrot_mush", has(mushregistry.CARROT_MUSH.get()))
        .save(output, "carrot_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.CARROT_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.CARROT_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_carrot_mush", has(mushregistry.CARROT_MUSH.get()))
        .save(output, "carrot_ingot_from_blasting");
      //chorus
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.CHORUS_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.CHORUS_NUGGET.get())
        .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
        .save(output, "chorus_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.CHORUS_INGOT.get(), 9)
        .requires(foodblockitemregistry.CHORUS_BLOCK_ITEM.get())
        .unlockedBy("has_chorus_block", has(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.CHORUS_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.CHORUS_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_chorus_mush", has(mushregistry.CHORUS_MUSH.get()))
        .save(output, "chorus_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.CHORUS_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.CHORUS_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_chorus_mush", has(mushregistry.CHORUS_MUSH.get()))
        .save(output, "chorus_ingot_from_blasting");
      //glow_berry
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.GLOW_BERRY_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.GLOW_BERRY_NUGGET.get())
        .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
        .save(output, "glow_berry_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.GLOW_BERRY_INGOT.get(), 9)
        .requires(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.GLOWBERRY_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.GLOW_BERRY_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_glow_berry_mush", has(mushregistry.GLOWBERRY_MUSH.get()))
        .save(output, "glow_berry_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.GLOWBERRY_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.GLOW_BERRY_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_glow_berry_mush", has(mushregistry.GLOWBERRY_MUSH.get()))
        .save(output, "glow_berry_ingot_from_blasting");
      //melon
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.MELON_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.MELON_NUGGET.get())
        .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
        .save(output, "melon_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.MELON_INGOT.get(), 9)
        .requires(foodblockitemregistry.MELON_BLOCK_ITEM.get())
        .unlockedBy("has_melon_block", has(foodblockitemregistry.MELON_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.MELON_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.MELON_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_melon_mush", has(mushregistry.MELON_MUSH.get()))
        .save(output, "melon_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.MELON_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.MELON_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_melon_mush", has(mushregistry.MELON_MUSH.get()))
        .save(output, "melon_ingot_from_blasting");
      //sweet_berry
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.SWEET_BERRY_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.SWEET_BERRY_NUGGET.get())
        .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
        .save(output, "sweet_berry_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.SWEET_BERRY_INGOT.get(), 9)
        .requires(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_sweet_berry_block", has(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.SWEETBERRY_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.SWEET_BERRY_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_sweet_berry_mush", has(mushregistry.SWEETBERRY_MUSH.get()))
        .save(output, "sweet_berry_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.SWEETBERRY_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.SWEET_BERRY_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_sweet_berry_mush", has(mushregistry.SWEETBERRY_MUSH.get()))
        .save(output, "sweet_berry_ingot_from_blasting");
      //brown_mushroom
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.BROWN_MUSHROOM_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
        .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
        .save(output, "brown_mushroom_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.BROWN_MUSHROOM_INGOT.get(), 9)
        .requires(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get())
        .unlockedBy("has_brown_mushroom_block", has(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.BROWN_MUSHROOM_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.BROWN_MUSHROOM_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_brown_mushroom_mush", has(mushregistry.BROWN_MUSHROOM_MUSH.get()))
        .save(output, "brown_mushroom_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.BROWN_MUSHROOM_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.BROWN_MUSHROOM_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_brown_mushroom_mush", has(mushregistry.BROWN_MUSHROOM_MUSH.get()))
        .save(output, "brown_mushroom_ingot_from_blasting");
      //red_mushroom
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.RED_MUSHROOM_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.RED_MUSHROOM_NUGGET.get())
        .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
        .save(output, "red_mushroom_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.RED_MUSHROOM_INGOT.get(), 9)
        .requires(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get())
        .unlockedBy("has_red_mushroom_block", has(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.RED_MUSHROOM_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.RED_MUSHROOM_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_red_mushroom_mush", has(mushregistry.RED_MUSHROOM_MUSH.get()))
        .save(output, "red_mushroom_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.RED_MUSHROOM_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.RED_MUSHROOM_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_red_mushroom_mush", has(mushregistry.RED_MUSHROOM_MUSH.get()))
        .save(output, "red_mushroom_ingot_from_blasting");
      //pumpkin
        //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.PUMPKIN_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.PUMPKIN_NUGGET.get())
        .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
        .save(output, "pumpkin_ingot_from_crafting");
        //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.PUMPKIN_INGOT.get(), 9)
        .requires(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get())
        .unlockedBy("has_pumpkin_block", has(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()))
        .save(output);
        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.PUMPKIN_MUSH.get()),
        RecipeCategory.MISC,
        ingotregistry.PUMPKIN_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_pumpkin_mush", has(mushregistry.PUMPKIN_MUSH.get()))
        .save(output, "pumpkin_ingot_from_smelting");
        //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.PUMPKIN_MUSH.get()),
        RecipeCategory.MISC, 
        ingotregistry.PUMPKIN_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_pumpkin_mush", has(mushregistry.PUMPKIN_MUSH.get()))
        .save(output, "pumpkin_ingot_from_blasting");
      //chicken
       //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.CHICKEN_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.CHICKEN_NUGGET.get())
        .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
        .save(output, "chicken_ingot_from_crafting");
       //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.CHICKEN_INGOT.get(), 9)
        .requires(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get())
        .unlockedBy("has_chicken_block", has(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()))
        .save(output);
       //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.GROUND_CHICKEN.get()),
        RecipeCategory.MISC,
        ingotregistry.CHICKEN_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_ground_chicken", has(mushregistry.GROUND_CHICKEN.get()))
        .save(output, "chicken_ingot_from_smelting");
       //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.GROUND_CHICKEN.get()),
        RecipeCategory.MISC, 
        ingotregistry.CHICKEN_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_ground_chicken", has(mushregistry.GROUND_CHICKEN.get()))
        .save(output, "chicken_ingot_from_blasting");
      //cod
       //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.COD_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.COD_NUGGET.get())
        .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
        .save(output, "cod_ingot_from_crafting");
       //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.COD_INGOT.get(), 9)
        .requires(foodblockitemregistry.COD_BLOCK_ITEM.get())
        .unlockedBy("has_cod_block", has(foodblockitemregistry.COD_BLOCK_ITEM.get()))
        .save(output);
       //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.GROUND_COD.get()),
        RecipeCategory.MISC,
        ingotregistry.COD_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_ground_cod", has(mushregistry.GROUND_COD.get()))
        .save(output, "cod_ingot_from_smelting");
       //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.GROUND_COD.get()),
        RecipeCategory.MISC, 
        ingotregistry.COD_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_ground_cod", has(mushregistry.GROUND_COD.get()))
        .save(output, "cod_ingot_from_blasting");
      //salmon
       //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.SALMON_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.SALMON_NUGGET.get())
        .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
        .save(output, "salmon_ingot_from_crafting");
       //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.SALMON_INGOT.get(), 9)
        .requires(foodblockitemregistry.SALMON_BLOCK_ITEM.get())
        .unlockedBy("has_salmon_block", has(foodblockitemregistry.SALMON_BLOCK_ITEM.get()))
        .save(output);
       //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.GROUND_SALMON.get()),
        RecipeCategory.MISC,
        ingotregistry.SALMON_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_ground_salmon", has(mushregistry.GROUND_SALMON.get()))
        .save(output, "salmon_ingot_from_smelting");
       //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.GROUND_SALMON.get()),
        RecipeCategory.MISC, 
        ingotregistry.SALMON_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_ground_salmon", has(mushregistry.GROUND_SALMON.get()))
        .save(output, "salmon_ingot_from_blasting");
      //tropical_fish
       //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.TROPICAL_FISH_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.TROPICAL_FISH_NUGGET.get())
        .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
        .save(output, "tropical_fish_ingot_from_crafting");
       //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.TROPICAL_FISH_INGOT.get(), 9)
        .requires(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get())
        .unlockedBy("has_tropical_fish_block", has(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()))
        .save(output);
       //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.GROUND_TROPICAL_FISH.get()),
        RecipeCategory.MISC,
        ingotregistry.TROPICAL_FISH_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_ground_tropical_fish", has(mushregistry.GROUND_TROPICAL_FISH.get()))
        .save(output, "tropical_fish_ingot_from_smelting");
       //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.GROUND_TROPICAL_FISH.get()),
        RecipeCategory.MISC, 
        ingotregistry.TROPICAL_FISH_INGOT.get(), 
        1.0f, 
        100
       )
       .unlockedBy("has_ground_tropical_fish", has(mushregistry.GROUND_TROPICAL_FISH.get()))
       .save(output, "tropical_fish_ingot_from_blasting");
      //mutton
       //packing
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.MUTTON_INGOT.get())
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', nuggetregistry.MUTTON_NUGGET.get())
        .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
        .save(output, "mutton_ingot_from_crafting");
       //unpacking
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.MUTTON_INGOT.get(), 9)
        .requires(foodblockitemregistry.MUTTON_BLOCK_ITEM.get())
        .unlockedBy("has_mutton_block", has(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()))
        .save(output);
       //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.GROUND_MUTTON.get()),
        RecipeCategory.MISC,
        ingotregistry.MUTTON_INGOT.get(),
        1.0f,
        200
        )
        .unlockedBy("has_ground_mutton", has(mushregistry.GROUND_MUTTON.get()))
        .save(output, "mutton_ingot_from_smelting");
       //blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.GROUND_MUTTON.get()),
        RecipeCategory.MISC, 
        ingotregistry.MUTTON_INGOT.get(), 
        1.0f, 
        100
        )
        .unlockedBy("has_ground_mutton", has(mushregistry.GROUND_MUTTON.get()))
        .save(output, "mutton_ingot_from_blasting");
      //beef
        //packing
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.BEEF_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.BEEF_NUGGET.get())
          .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
          .save(output, "beef_ingot_from_crafting");
        //unpacking
          ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.BEEF_INGOT.get(), 9)
          .requires(foodblockitemregistry.BEEF_BLOCK_ITEM.get())
          .unlockedBy("has_beef_block", has(foodblockitemregistry.BEEF_BLOCK_ITEM.get()))
          .save(output);
        //smelting
          SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.GROUND_BEEF.get()),
          RecipeCategory.MISC,
          ingotregistry.BEEF_INGOT.get(),
          1.0f,
          200
          )
          .unlockedBy("has_ground_beef", has(mushregistry.GROUND_BEEF.get()))
          .save(output, "beef_ingot_from_smelting");
        //blasting
          SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.GROUND_BEEF.get()),
          RecipeCategory.MISC, 
          ingotregistry.BEEF_INGOT.get(), 
          1.0f, 
          100
          )
          .unlockedBy("has_ground_beef", has(mushregistry.GROUND_BEEF.get()))
          .save(output, "beef_ingot_from_blasting");
      //pork
       //packing
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.PORK_INGOT.get())
         .pattern("AAA")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.PORK_NUGGET.get())
         .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
         .save(output, "pork_ingot_from_crafting");
       //unpacking
         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.PORK_INGOT.get(), 9)
         .requires(foodblockitemregistry.PORK_BLOCK_ITEM.get())
         .unlockedBy("has_pork_block", has(foodblockitemregistry.PORK_BLOCK_ITEM.get()))
         .save(output);
       //smelting
         SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.GROUND_PORK.get()),
         RecipeCategory.MISC,
         ingotregistry.PORK_INGOT.get(),
         1.0f,
         200
         )
         .unlockedBy("has_ground_pork", has(mushregistry.GROUND_PORK.get()))
         .save(output, "pork_ingot_from_smelting");
       //blasting
         SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.GROUND_PORK.get()),
         RecipeCategory.MISC, 
         ingotregistry.PORK_INGOT.get(), 
         1.0f, 
         100
         )
         .unlockedBy("has_ground_pork", has(mushregistry.GROUND_PORK.get()))
         .save(output, "pork_ingot_from_blasting");
      //rabbit
       //packing
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.RABBIT_INGOT.get())
         .pattern("AAA")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.RABBIT_NUGGET.get())
         .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
         .save(output, "rabbit_ingot_from_crafting");
       //unpacking
         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.RABBIT_INGOT.get(), 9)
         .requires(foodblockitemregistry.RABBIT_BLOCK_ITEM.get())
         .unlockedBy("has_rabbit_block", has(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()))
         .save(output);
       //smelting
         SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.GROUND_RABBIT.get()),
         RecipeCategory.MISC,
         ingotregistry.RABBIT_INGOT.get(),
         1.0f,
         200
         )
         .unlockedBy("has_ground_rabbit", has(mushregistry.GROUND_RABBIT.get()))
         .save(output, "rabbit_ingot_from_smelting");
       //blasting
         SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.GROUND_RABBIT.get()),
         RecipeCategory.MISC, 
         ingotregistry.RABBIT_INGOT.get(), 
         1.0f, 
         100
         )
         .unlockedBy("has_ground_rabbit", has(mushregistry.GROUND_RABBIT.get()))
         .save(output, "rabbit_ingot_from_blasting");
      //sugar
       //packing
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.SUGAR_INGOT.get())
         .pattern("AAA")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.SUGAR_NUGGET.get())
         .unlockedBy("has_sugar_nugget", has(nuggetregistry.SUGAR_NUGGET.get()))
         .save(output, "sugar_ingot_from_crafting");
       //unpacking
         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.SUGAR_INGOT.get(), 9)
         .requires(foodblockitemregistry.SUGAR_BLOCK_ITEM.get())
         .unlockedBy("has_sugar_block", has(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()))
         .save(output);
       //smelting
         SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.SUGAR_PASTE.get()),
         RecipeCategory.MISC,
         ingotregistry.SUGAR_INGOT.get(),
         1.0f,
         200
         )
         .unlockedBy("has_sugar_paste", has(mushregistry.SUGAR_PASTE.get()))
         .save(output, "sugar_ingot_from_smelting");
       //blasting
         SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.SUGAR_PASTE.get()),
         RecipeCategory.MISC, 
         ingotregistry.SUGAR_INGOT.get(), 
         1.0f, 
         100
         )
         .unlockedBy("has_sugar_paste", has(mushregistry.SUGAR_PASTE.get()))
         .save(output, "sugar_ingot_from_blasting");
      //honeycomb
       //packing
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.HONEYCOMB_INGOT.get())
         .pattern("AAA")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.HONEYCOMB_NUGGET.get())
         .unlockedBy("has_honeycomb_nugget", has(nuggetregistry.HONEYCOMB_NUGGET.get()))
         .save(output, "honeycomb_ingot_from_crafting");
       //unpacking
         ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.HONEYCOMB_INGOT.get(), 9)
         .requires(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get())
         .unlockedBy("has_processed_honeycomb_block", has(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()))
         .save(output);
       //smelting
         SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.HONEYCOMB_POWDER.get()),
         RecipeCategory.MISC,
         ingotregistry.HONEYCOMB_INGOT.get(),
         1.0f,
         200
         )
         .unlockedBy("has_honeycomb_powder", has(mushregistry.HONEYCOMB_POWDER.get()))
         .save(output, "honeycomb_ingot_from_smelting");
       //blasting
         SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.HONEYCOMB_POWDER.get()),
         RecipeCategory.MISC, 
         ingotregistry.HONEYCOMB_INGOT.get(), 
         1.0f, 
         100
         )
         .unlockedBy("has_honeycomb_powder", has(mushregistry.HONEYCOMB_POWDER.get()))
         .save(output, "honeycomb_ingot_from_blasting");
      };
     protected void buildNuggetRecipes(RecipeOutput output) {
      //sugar_nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetregistry.SUGAR_NUGGET.get(), 9)
        .requires(ingotregistry.SUGAR_INGOT.get())
        .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
        .save(output);
      //honeycomb_nugget
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetregistry.HONEYCOMB_NUGGET.get(), 9)
        .requires(ingotregistry.HONEYCOMB_INGOT.get())
        .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
        .save(output);
      };
     protected void buildBlockRecipes(RecipeOutput output) {
         //___________________________________________________________regular_____________________________________________________________________
          //sugar block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_BLOCK_ITEM.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', ingotregistry.SUGAR_INGOT.get())
            .unlockedBy("has_sugar_ingot", has(ingotregistry.SUGAR_INGOT.get()))
            .save(output);
          //processed_honeycomb block
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', ingotregistry.HONEYCOMB_INGOT.get())
            .unlockedBy("has_honeycomb_ingot", has(ingotregistry.HONEYCOMB_INGOT.get()))
            .save(output);
         //____________________________________________________________bricks_____________________________________________________________________
          //.........apple
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.APPLE_BLOCK_ITEM.get())
            .unlockedBy("has_apple_block", has(foodblockitemregistry.APPLE_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.APPLE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.APPLE_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_apple_block", has(foodblockitemregistry.APPLE_BLOCK_ITEM.get()))
           .save(output, "apple_bricks_block_from_apple_block_stonecutting");

          //.........potato
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.POTATO_BLOCK_ITEM.get())
            .unlockedBy("has_potato_block", has(foodblockitemregistry.POTATO_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.POTATO_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.POTATO_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_potato_block", has(foodblockitemregistry.POTATO_BLOCK_ITEM.get()))
           .save(output, "potato_bricks_block_from_potato_block_stonecutting");

          //.........beetroot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.BEETROOT_BLOCK_ITEM.get())
            .unlockedBy("has_beetroot_block", has(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.BEETROOT_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_beetroot_block", has(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()))
           .save(output, "beetroot_bricks_block_from_beetroot_block_stonecutting");

          //.........carrot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.CARROT_BLOCK_ITEM.get())
            .unlockedBy("has_carrot_block", has(foodblockitemregistry.CARROT_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CARROT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.CARROT_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_carrot_block", has(foodblockitemregistry.CARROT_BLOCK_ITEM.get()))
           .save(output, "carrot_bricks_block_from_carrot_block_stonecutting");

          //.........chorus
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.CHORUS_BLOCK_ITEM.get())
            .unlockedBy("has_chorus_block", has(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.CHORUS_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_chorus_block", has(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()))
           .save(output, "chorus_bricks_block_from_chorus_block_stonecutting");

          //.........glow_berry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
            .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.GLOW_BERRY_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
           .save(output, "glow_berry_bricks_block_from_glow_berry_block_stonecutting");

          //.........melon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.MELON_BLOCK_ITEM.get())
            .unlockedBy("has_melon_block", has(foodblockitemregistry.MELON_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MELON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.MELON_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_melon_block", has(foodblockitemregistry.MELON_BLOCK_ITEM.get()))
           .save(output, "melon_bricks_block_from_melon_block_stonecutting");

          //.........sweet_berry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get())
            .unlockedBy("has_sweet_berry_block", has(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.SWEET_BERRY_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_sweet_berry_block", has(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()))
           .save(output, "sweet_berry_bricks_block_from_sweet_berry_block_stonecutting");

          //.........brown_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get())
            .unlockedBy("has_brown_mushroom_block", has(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.BROWN_MUSHROOM_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_brown_mushroom_block", has(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()))
           .save(output, "brown_mushroom_bricks_block_from_brown_mushroom_block_stonecutting");
           
          //.........red_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get())
            .unlockedBy("has_red_mushroom_block", has(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.RED_MUSHROOM_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_red_mushroom_block", has(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()))
           .save(output, "red_mushroom_bricks_block_from_red_mushroom_block_stonecutting");

          //.........pumpkin
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get())
            .unlockedBy("has_pumpkin_block", has(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.PUMPKIN_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_pumpkin_block", has(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()))
           .save(output, "pumpkin_bricks_block_from_pumpkin_block_stonecutting");

          //.........chicken
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.CHICKEN_BLOCK_ITEM.get())
            .unlockedBy("has_chicken_block", has(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.CHICKEN_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_chicken_block", has(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()))
           .save(output, "chicken_bricks_block_from_chicken_block_stonecutting");

          //.........cod
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.COD_BLOCK_ITEM.get())
            .unlockedBy("has_cod_block", has(foodblockitemregistry.COD_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.COD_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.COD_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_cod_block", has(foodblockitemregistry.COD_BLOCK_ITEM.get()))
           .save(output, "cod_bricks_block_from_cod_block_stonecutting");

          //.........salmon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.SALMON_BLOCK_ITEM.get())
            .unlockedBy("has_salmon_block", has(foodblockitemregistry.SALMON_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SALMON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.SALMON_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_salmon_block", has(foodblockitemregistry.SALMON_BLOCK_ITEM.get()))
           .save(output, "salmon_bricks_block_from_salmon_block_stonecutting");

          //.........tropical_fish
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get())
            .unlockedBy("has_tropical_fish_block", has(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.TROPICAL_FISH_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_tropical_fish_block", has(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()))
           .save(output, "tropical_fish_bricks_block_from_tropical_fish_block_stonecutting");

          //.........mutton
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.MUTTON_BLOCK_ITEM.get())
            .unlockedBy("has_mutton_block", has(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.MUTTON_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_mutton_block", has(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()))
           .save(output, "mutton_bricks_block_from_mutton_block_stonecutting");

          //.........beef
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.BEEF_BLOCK_ITEM.get())
            .unlockedBy("has_beef_block", has(foodblockitemregistry.BEEF_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEEF_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.BEEF_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_beef_block", has(foodblockitemregistry.BEEF_BLOCK_ITEM.get()))
           .save(output, "beef_bricks_block_from_beef_block_stonecutting");

          //.........pork
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.PORK_BLOCK_ITEM.get())
            .unlockedBy("has_pork_block", has(foodblockitemregistry.PORK_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PORK_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.PORK_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_pork_block", has(foodblockitemregistry.PORK_BLOCK_ITEM.get()))
           .save(output, "pork_bricks_block_from_pork_block_stonecutting");

          //.........rabbit
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.RABBIT_BLOCK_ITEM.get())
            .unlockedBy("has_rabbit_block", has(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.RABBIT_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_rabbit_block", has(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()))
           .save(output, "rabbit_bricks_block_from_rabbit_block_stonecutting");

          //.........sugar
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.SUGAR_BLOCK_ITEM.get())
            .unlockedBy("has_sugar_block", has(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.SUGAR_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_sugar_block", has(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()))
           .save(output, "sugar_bricks_block_from_sugar_block_stonecutting");

          //.........honeycomb
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_BRICKS_BLOCK_ITEM.get(), 4)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get())
            .unlockedBy("has_honeycomb_block", has(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.HONEYCOMB_BRICKS_BLOCK_ITEM.get())
           .unlockedBy("has_honeycomb_block", has(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()))
           .save(output, "honeycomb_bricks_block_from_honeycomb_block_stonecutting");
         //___________________________________________________________chiseled____________________________________________________________________

          //.........apple
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.APPLE_SLAB_ITEM.get())
            .unlockedBy("has_apple_slab", has(foodblockitemregistry.APPLE_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.APPLE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.APPLE_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_apple_block", has(foodblockitemregistry.APPLE_BLOCK_ITEM.get()))
            .save(output, "apple_chiseled_block_from_apple_block_stonecutting");

          //.........potato
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.POTATO_SLAB_ITEM.get())
            .unlockedBy("has_potato_slab", has(foodblockitemregistry.POTATO_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.POTATO_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.POTATO_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_potato_block", has(foodblockitemregistry.POTATO_BLOCK_ITEM.get()))
            .save(output, "potato_chiseled_block_from_potato_block_stonecutting");

          //.........beetroot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.BEETROOT_SLAB_ITEM.get())
            .unlockedBy("has_beetroot_slab", has(foodblockitemregistry.BEETROOT_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.BEETROOT_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_beetroot_block", has(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()))
            .save(output, "beetroot_chiseled_block_from_beetroot_block_stonecutting");

          //.........carrot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.CARROT_SLAB_ITEM.get())
            .unlockedBy("has_carrot_slab", has(foodblockitemregistry.CARROT_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CARROT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.CARROT_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_carrot_block", has(foodblockitemregistry.CARROT_BLOCK_ITEM.get()))
            .save(output, "carrot_chiseled_block_from_carrot_block_stonecutting");

          //.........chorus
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.CHORUS_SLAB_ITEM.get())
            .unlockedBy("has_chorus_slab", has(foodblockitemregistry.CHORUS_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.CHORUS_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_chorus_block", has(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()))
            .save(output, "chorus_chiseled_block_from_chorus_block_stonecutting");

          //.........glow_berry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get())
            .unlockedBy("has_glow_berry_slab", has(foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.GLOW_BERRY_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
            .save(output, "glow_berry_chiseled_block_from_glow_berry_block_stonecutting");

          //.........melon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.MELON_SLAB_ITEM.get())
            .unlockedBy("has_melon_slab", has(foodblockitemregistry.MELON_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MELON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.MELON_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_melon_block", has(foodblockitemregistry.MELON_BLOCK_ITEM.get()))
            .save(output, "melon_chiseled_block_from_melon_block_stonecutting");
            
          //.........sweet_berry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get())
            .unlockedBy("has_sweet_berry_slab", has(foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.SWEET_BERRY_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_sweet_berry_block", has(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()))
            .save(output, "sweet_berry_chiseled_block_from_sweet_berry_block_stonecutting");

          //.........brown_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get())
            .unlockedBy("has_brown_mushroom_slab", has(foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.BROWN_MUSHROOM_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_brown_mushroom_block", has(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()))
            .save(output, "brown_mushroom_chiseled_block_from_brown_mushroom_block_stonecutting");

          //.........red_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get())
            .unlockedBy("has_red_mushroom_slab", has(foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.RED_MUSHROOM_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_red_mushroom_block", has(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()))
            .save(output, "red_mushroom_chiseled_block_from_red_mushroom_block_stonecutting");
          //.........pumpkin
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.PUMPKIN_SLAB_ITEM.get())
            .unlockedBy("has_pumpkin_slab", has(foodblockitemregistry.PUMPKIN_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.PUMPKIN_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_pumpkin_block", has(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()))
            .save(output, "pumpkin_chiseled_block_from_pumpkin_block_stonecutting");
          //.........chicken
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.CHICKEN_SLAB_ITEM.get())
            .unlockedBy("has_chicken_slab", has(foodblockitemregistry.CHICKEN_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.CHICKEN_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_chicken_block", has(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()))
            .save(output, "chicken_chiseled_block_from_chicken_block_stonecutting");
          //.........cod
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.COD_SLAB_ITEM.get())
            .unlockedBy("has_cod_slab", has(foodblockitemregistry.COD_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.COD_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.COD_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_cod_block", has(foodblockitemregistry.COD_BLOCK_ITEM.get()))
            .save(output, "cod_chiseled_block_from_cod_block_stonecutting");
          //.........salmon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.SALMON_SLAB_ITEM.get())
            .unlockedBy("has_salmon_slab", has(foodblockitemregistry.SALMON_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SALMON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.SALMON_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_salmon_block", has(foodblockitemregistry.SALMON_BLOCK_ITEM.get()))
            .save(output, "salmon_chiseled_block_from_salmon_block_stonecutting");
          //.........tropical_fish
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get())
            .unlockedBy("has_tropical_fish_slab", has(foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.TROPICAL_FISH_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_tropical_fish_block", has(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()))
            .save(output, "tropical_fish_chiseled_block_from_tropical_fish_block_stonecutting");
          //.........mutton
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.MUTTON_SLAB_ITEM.get())
            .unlockedBy("has_mutton_slab", has(foodblockitemregistry.MUTTON_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.MUTTON_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_mutton_block", has(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()))
            .save(output, "mutton_chiseled_block_from_mutton_block_stonecutting");
          //.........beef
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.BEEF_SLAB_ITEM.get())
            .unlockedBy("has_beef_slab", has(foodblockitemregistry.BEEF_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEEF_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.BEEF_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_beef_block", has(foodblockitemregistry.BEEF_BLOCK_ITEM.get()))
            .save(output, "beef_chiseled_block_from_beef_block_stonecutting");
          //.........pork
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.PORK_SLAB_ITEM.get())
            .unlockedBy("has_pork_slab", has(foodblockitemregistry.PORK_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PORK_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.PORK_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_pork_block", has(foodblockitemregistry.PORK_BLOCK_ITEM.get()))
            .save(output, "pork_chiseled_block_from_pork_block_stonecutting");
          //.........rabbit
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.RABBIT_SLAB_ITEM.get())
            .unlockedBy("has_rabbit_slab", has(foodblockitemregistry.RABBIT_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.RABBIT_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_rabbit_block", has(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()))
            .save(output, "rabbit_chiseled_block_from_rabbit_block_stonecutting");
          //.........sugar
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.SUGAR_SLAB_ITEM.get())
            .unlockedBy("has_sugar_slab", has(foodblockitemregistry.SUGAR_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.SUGAR_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_sugar_block", has(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()))
            .save(output, "sugar_chiseled_block_from_sugar_block_stonecutting");
          //.........honeycomb
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_CHISELED_BLOCK_ITEM.get())
            .pattern("   ")
            .pattern(" A ")
            .pattern(" A ")
            .define('A', foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get())
            .unlockedBy("has_honeycomb_slab", has(foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.HONEYCOMB_CHISELED_BLOCK_ITEM.get())
            .unlockedBy("has_honeycomb_block", has(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()))
            .save(output, "honeycomb_chiseled_block_from_honeycomb_block_stonecutting");

         //_____________________________________________________________tile______________________________________________________________________

          //.........apple
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.APPLE_SLAB_ITEM.get())
            .unlockedBy("has_apple_slab", has(foodblockitemregistry.APPLE_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.APPLE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.APPLE_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_apple_block", has(foodblockitemregistry.APPLE_BLOCK_ITEM.get()))
            .save(output, "apple_tile_block_from_apple_block_stonecutting");

          //.........potato
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.POTATO_SLAB_ITEM.get())
            .unlockedBy("has_potato_slab", has(foodblockitemregistry.POTATO_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.POTATO_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.POTATO_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_potato_block", has(foodblockitemregistry.POTATO_BLOCK_ITEM.get()))
            .save(output, "potato_tile_block_from_potato_block_stonecutting");

          //.........beetroot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.BEETROOT_SLAB_ITEM.get())
            .unlockedBy("has_beetroot_slab", has(foodblockitemregistry.BEETROOT_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.BEETROOT_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_beetroot_block", has(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()))
            .save(output, "beetroot_tile_block_from_beetroot_block_stonecutting");

          //.........carrot
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.CARROT_SLAB_ITEM.get())
            .unlockedBy("has_carrot_slab", has(foodblockitemregistry.CARROT_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CARROT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.CARROT_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_carrot_block", has(foodblockitemregistry.CARROT_BLOCK_ITEM.get()))
            .save(output, "carrot_tile_block_from_carrot_block_stonecutting");

          //.........chorus
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.CHORUS_SLAB_ITEM.get())
            .unlockedBy("has_chorus_slab", has(foodblockitemregistry.CHORUS_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.CHORUS_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_chorus_block", has(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()))
            .save(output, "chorus_tile_block_from_chorus_block_stonecutting");

          //.........glow_berry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get())
            .unlockedBy("has_glow_berry_slab", has(foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.GLOW_BERRY_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
            .save(output, "glow_berry_tile_block_from_glow_berry_block_stonecutting");

          //.........melon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.MELON_SLAB_ITEM.get())
            .unlockedBy("has_melon_slab", has(foodblockitemregistry.MELON_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MELON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.MELON_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_melon_block", has(foodblockitemregistry.MELON_BLOCK_ITEM.get()))
            .save(output, "melon_tile_block_from_melon_block_stonecutting");

          //.........sweet_berry
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get())
            .unlockedBy("has_sweet_berry_slab", has(foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.SWEET_BERRY_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_sweet_berry_block", has(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()))
            .save(output, "sweet_berry_tile_block_from_sweet_berry_block_stonecutting");

          //.........brown_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get())
            .unlockedBy("has_brown_mushroom_slab", has(foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.BROWN_MUSHROOM_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_brown_mushroom_block", has(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()))
            .save(output, "brown_mushroom_tile_block_from_brown_mushroom_block_stonecutting");

          //.........red_mushroom
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get())
            .unlockedBy("has_red_mushroom_slab", has(foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.RED_MUSHROOM_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_red_mushroom_block", has(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()))
            .save(output, "red_mushroom_tile_block_from_red_mushroom_block_stonecutting");

          //.........pumpkin
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.PUMPKIN_SLAB_ITEM.get())
            .unlockedBy("has_pumpkin_slab", has(foodblockitemregistry.PUMPKIN_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.PUMPKIN_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_pumpkin_block", has(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()))
            .save(output, "pumpkin_tile_block_from_pumpkin_block_stonecutting");

          //.........chicken
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.CHICKEN_SLAB_ITEM.get())
            .unlockedBy("has_chicken_slab", has(foodblockitemregistry.CHICKEN_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.CHICKEN_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_chicken_block", has(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()))
            .save(output, "chicken_tile_block_from_chicken_block_stonecutting");

          //.........cod
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.COD_SLAB_ITEM.get())
            .unlockedBy("has_cod_slab", has(foodblockitemregistry.COD_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.COD_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.COD_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_cod_block", has(foodblockitemregistry.COD_BLOCK_ITEM.get()))
            .save(output, "cod_tile_block_from_cod_block_stonecutting");

          //.........salmon
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.SALMON_SLAB_ITEM.get())
            .unlockedBy("has_salmon_slab", has(foodblockitemregistry.SALMON_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SALMON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.SALMON_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_salmon_block", has(foodblockitemregistry.SALMON_BLOCK_ITEM.get()))
            .save(output, "salmon_tile_block_from_salmon_block_stonecutting");
            
          //.........tropical_fish
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get())
            .unlockedBy("has_tropical_fish_slab", has(foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.TROPICAL_FISH_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_tropical_fish_block", has(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()))
            .save(output, "tropical_fish_tile_block_from_tropical_fish_block_stonecutting");

          //.........mutton
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.MUTTON_SLAB_ITEM.get())
            .unlockedBy("has_mutton_slab", has(foodblockitemregistry.MUTTON_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.MUTTON_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_mutton_block", has(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()))
            .save(output, "mutton_tile_block_from_mutton_block_stonecutting");

          //.........beef
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.BEEF_SLAB_ITEM.get())
            .unlockedBy("has_beef_slab", has(foodblockitemregistry.BEEF_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.BEEF_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.BEEF_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_beef_block", has(foodblockitemregistry.BEEF_BLOCK_ITEM.get()))
            .save(output, "beef_tile_block_from_beef_block_stonecutting");

          //.........pork
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.PORK_SLAB_ITEM.get())
            .unlockedBy("has_pork_slab", has(foodblockitemregistry.PORK_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PORK_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.PORK_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_pork_block", has(foodblockitemregistry.PORK_BLOCK_ITEM.get()))
            .save(output, "pork_tile_block_from_pork_block_stonecutting");

          //.........rabbit
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.RABBIT_SLAB_ITEM.get())
            .unlockedBy("has_rabbit_slab", has(foodblockitemregistry.RABBIT_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.RABBIT_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_rabbit_block", has(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()))
            .save(output, "rabbit_tile_block_from_rabbit_block_stonecutting");

          //.........sugar
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SUGAR_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.SUGAR_SLAB_ITEM.get())
            .unlockedBy("has_sugar_slab", has(foodblockitemregistry.SUGAR_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.SUGAR_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_sugar_block", has(foodblockitemregistry.SUGAR_BLOCK_ITEM.get()))
            .save(output, "sugar_tile_block_from_sugar_block_stonecutting");

          //.........honeycomb
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.HONEYCOMB_TILE_BLOCK_ITEM.get(),2)
            .pattern("   ")
            .pattern("AA ")
            .pattern("AA ")
            .define('A', foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get())
            .unlockedBy("has_honeycomb_slab", has(foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get()))
            .save(output);

            SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockitemregistry.HONEYCOMB_TILE_BLOCK_ITEM.get())
            .unlockedBy("has_honeycomb_block", has(foodblockitemregistry.PROCESSED_HONEYCOMB_BLOCK_ITEM.get()))
            .save(output, "honeycomb_tile_block_from_honeycomb_block_stonecutting");
      };
     protected void buildCabinetRecipes(RecipeOutput output) {
      //apple
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_APPLE_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockitemregistry.APPLE_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_apple_slab", has(foodblockitemregistry.APPLE_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_APPLE_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockitemregistry.APPLE_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockitemregistry.SMALL_APPLE_CABINET_ITEM.get())
         .unlockedBy("has_apple_slab", has(foodblockitemregistry.APPLE_SLAB_ITEM.get()))
         .save(output);
      //potato
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_POTATO_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockitemregistry.POTATO_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_potato_slab", has(foodblockitemregistry.POTATO_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_POTATO_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockitemregistry.POTATO_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockitemregistry.SMALL_POTATO_CABINET_ITEM.get())
         .unlockedBy("has_potato_slab", has(foodblockitemregistry.POTATO_SLAB_ITEM.get()))
         .save(output);
      //beetroot
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_BEETROOT_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.BEETROOT_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_beetroot_slab", has(foodblockitemregistry.BEETROOT_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_BEETROOT_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.BEETROOT_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_BEETROOT_CABINET_ITEM.get())
          .unlockedBy("has_beetroot_slab", has(foodblockitemregistry.BEETROOT_SLAB_ITEM.get()))
          .save(output);
      //carrot
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_CARROT_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.CARROT_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_carrot_slab", has(foodblockitemregistry.CARROT_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_CARROT_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.CARROT_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_CARROT_CABINET_ITEM.get())
          .unlockedBy("has_carrot_slab", has(foodblockitemregistry.CARROT_SLAB_ITEM.get()))
          .save(output);
      //chorus
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_CHORUS_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.CHORUS_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_chorus_slab", has(foodblockitemregistry.CHORUS_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_CHORUS_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.CHORUS_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_CHORUS_CABINET_ITEM.get())
          .unlockedBy("has_chorus_slab", has(foodblockitemregistry.CHORUS_SLAB_ITEM.get()))
          .save(output);
      //glow_berry
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_GLOW_BERRY_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_glow_berry_slab", has(foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_GLOW_BERRY_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_GLOW_BERRY_CABINET_ITEM.get())
          .unlockedBy("has_glow_berry_slab", has(foodblockitemregistry.GLOW_BERRY_SLAB_ITEM.get()))
          .save(output);
      //melon
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_MELON_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.MELON_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_melon_slab", has(foodblockitemregistry.MELON_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_MELON_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.MELON_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_MELON_CABINET_ITEM.get())
          .unlockedBy("has_melon_slab", has(foodblockitemregistry.MELON_SLAB_ITEM.get()))
          .save(output);
      //sweet_berry
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_SWEET_BERRY_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_sweet_berry_slab", has(foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_SWEET_BERRY_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_SWEET_BERRY_CABINET_ITEM.get())
          .unlockedBy("has_sweet_berry_slab", has(foodblockitemregistry.SWEET_BERRY_SLAB_ITEM.get()))
          .save(output);
      //brown_mushroom
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_BROWN_MUSHROOM_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_brown_mushroom_slab", has(foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_BROWN_MUSHROOM_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_BROWN_MUSHROOM_CABINET_ITEM.get())
          .unlockedBy("has_brown_mushroom_slab", has(foodblockitemregistry.BROWN_MUSHROOM_SLAB_ITEM.get()))
          .save(output);
      //red_mushroom
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_RED_MUSHROOM_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_red_mushroom_slab", has(foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_RED_MUSHROOM_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_RED_MUSHROOM_CABINET_ITEM.get())
          .unlockedBy("has_red_mushroom_slab", has(foodblockitemregistry.RED_MUSHROOM_SLAB_ITEM.get()))
          .save(output);
      //pumpkin
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_PUMPKIN_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.PUMPKIN_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_pumpkin_slab", has(foodblockitemregistry.PUMPKIN_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_PUMPKIN_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.PUMPKIN_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_PUMPKIN_CABINET_ITEM.get())
          .unlockedBy("has_pumpkin_slab", has(foodblockitemregistry.PUMPKIN_SLAB_ITEM.get()))
          .save(output);
      //chicken
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_CHICKEN_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.CHICKEN_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_chicken_slab", has(foodblockitemregistry.CHICKEN_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_CHICKEN_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.CHICKEN_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_CHICKEN_CABINET_ITEM.get())
          .unlockedBy("has_chicken_slab", has(foodblockitemregistry.CHICKEN_SLAB_ITEM.get()))
          .save(output);
      //cod
       //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_COD_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.COD_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_cod_slab", has(foodblockitemregistry.COD_SLAB_ITEM.get()))
          .save(output);
       //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_COD_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.COD_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_COD_CABINET_ITEM.get())
          .unlockedBy("has_cod_slab", has(foodblockitemregistry.COD_SLAB_ITEM.get()))
          .save(output);
      //salmon
        //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_SALMON_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.SALMON_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_salmon_slab", has(foodblockitemregistry.SALMON_SLAB_ITEM.get()))
          .save(output);
        //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_SALMON_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.SALMON_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_SALMON_CABINET_ITEM.get())
          .unlockedBy("has_salmon_slab", has(foodblockitemregistry.SALMON_SLAB_ITEM.get()))
          .save(output);
      //tropical_fish
        //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_TROPICAL_FISH_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_tropical_fish_slab", has(foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get()))
          .save(output);
        //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_TROPICAL_FISH_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_TROPICAL_FISH_CABINET_ITEM.get())
          .unlockedBy("has_tropical_fish_slab", has(foodblockitemregistry.TROPICAL_FISH_SLAB_ITEM.get()))
          .save(output);
      //mutton
        //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_MUTTON_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.MUTTON_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_mutton_slab", has(foodblockitemregistry.MUTTON_SLAB_ITEM.get()))
          .save(output);
        //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_MUTTON_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.MUTTON_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_MUTTON_CABINET_ITEM.get())
          .unlockedBy("has_mutton_slab", has(foodblockitemregistry.MUTTON_SLAB_ITEM.get()))
          .save(output);
      //beef
        //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_BEEF_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.BEEF_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_beef_slab", has(foodblockitemregistry.BEEF_SLAB_ITEM.get()))
          .save(output);
        //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_BEEF_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.BEEF_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_BEEF_CABINET_ITEM.get())
          .unlockedBy("has_beef_slab", has(foodblockitemregistry.BEEF_SLAB_ITEM.get()))
          .save(output);
      //pork
        //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_PORK_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.PORK_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_pork_slab", has(foodblockitemregistry.PORK_SLAB_ITEM.get()))
          .save(output);
        //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_PORK_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.PORK_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_PORK_CABINET_ITEM.get())
          .unlockedBy("has_pork_slab", has(foodblockitemregistry.PORK_SLAB_ITEM.get()))
          .save(output);
      //rabbit
        //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_RABBIT_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.RABBIT_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_rabbit_slab", has(foodblockitemregistry.RABBIT_SLAB_ITEM.get()))
          .save(output);
        //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_RABBIT_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.RABBIT_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_RABBIT_CABINET_ITEM.get())
          .unlockedBy("has_rabbit_slab", has(foodblockitemregistry.RABBIT_SLAB_ITEM.get()))
          .save(output);
      //sugar
        //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_SUGAR_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.SUGAR_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_sugar_slab", has(foodblockitemregistry.SUGAR_SLAB_ITEM.get()))
          .save(output);
        //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_SUGAR_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.SUGAR_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_SUGAR_CABINET_ITEM.get())
          .unlockedBy("has_sugar_slab", has(foodblockitemregistry.SUGAR_SLAB_ITEM.get()))
          .save(output);
      //honeycomb
        //small
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SMALL_HONEYCOMB_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("B B")
          .pattern("AAA")
          .define('A', foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .unlockedBy("has_honeycomb_slab", has(foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get()))
          .save(output);
        //medium
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MEDIUM_HONEYCOMB_CABINET_ITEM.get())
          .pattern("AAA")
          .pattern("BCB")
          .pattern("AAA")
          .define('A', foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get())
          .define('B', Items.IRON_INGOT)
          .define('C', foodblockitemregistry.SMALL_HONEYCOMB_CABINET_ITEM.get())
          .unlockedBy("has_honeycomb_slab", has(foodblockitemregistry.PROCESSED_HONEYCOMB_SLAB_ITEM.get()))
          .save(output);
      };
    }
}
