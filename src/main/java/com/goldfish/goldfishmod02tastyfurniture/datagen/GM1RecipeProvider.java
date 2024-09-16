package com.goldfish.goldfishmod02tastyfurniture.datagen;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import javax.annotation.Nullable;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.ingotregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.nuggetregistry;
import com.mojang.datafixers.types.templates.Tag;
import com.goldfish.goldfishmod02tastyfurniture.registry.food_weapon_registry;

import net.minecraft.advancements.Criterion;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.block.Blocks;

import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.crafting.*;

public abstract class GM1RecipeProvider extends RecipeProvider {

    private PackOutput output;
    private CompletableFuture<Provider> lookupProvider;

    public GM1RecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    // sample from the docs for easy reference. only recipes in the concrete class will be created
    @Override
    protected void buildRecipes(RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MUSHROOM_STEW)
        .requires(Blocks.BROWN_MUSHROOM)
        .requires(Blocks.RED_MUSHROOM)
        .requires(Items.BOWL)
        // Creates the recipe advancement. While not mandated by the consuming background systems,
        // the recipe builder will crash if you omit this. The first parameter is the advancement name,
        // and the second one is the condition. Normally, you want to use the has() shortcut for the condition.
        // Multiple advancement requirements can be added by calling #unlockedBy multiple times.
        .unlockedBy("has_mushroom_stew", has(Items.MUSHROOM_STEW))
        .unlockedBy("has_bowl", has(Items.BOWL))
        .unlockedBy("has_brown_mushroom", has(Blocks.BROWN_MUSHROOM))
        .unlockedBy("has_red_mushroom", has(Blocks.RED_MUSHROOM))
        // Stores the recipe in the passed RecipeOutput, to be written to disk.
        // If you want to add conditions to the recipe, those can be set on the output.
        .save(output);
    }

    public static class GM1RecipeProviderConcrete extends GM1RecipeProvider {

        public GM1RecipeProviderConcrete(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected void buildRecipes(RecipeOutput output) {
        //-------------------------------------------------------------blocks---------------------------------------------------------------------
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

        //---------------------------------------------------------unpack blocks------------------------------------------------------------------
         //apple_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.APPLE_INGOT.get(), 9)
            .requires(foodblockitemregistry.APPLE_BLOCK_ITEM.get())
            .unlockedBy("has_apple_block", has(foodblockitemregistry.APPLE_BLOCK_ITEM.get()))
            .save(output);
         //potato_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.POTATO_INGOT.get(), 9)
            .requires(foodblockitemregistry.POTATO_BLOCK_ITEM.get())
            .unlockedBy("has_potato_block", has(foodblockitemregistry.POTATO_BLOCK_ITEM.get()))
            .save(output);
         //beetroot_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.BEETROOT_INGOT.get(), 9)
            .requires(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get())
            .unlockedBy("has_beetroot_block", has(foodblockitemregistry.BEETROOT_BLOCK_ITEM.get()))
            .save(output);
         //carrot_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.CARROT_INGOT.get(), 9)
            .requires(foodblockitemregistry.CARROT_BLOCK_ITEM.get())
            .unlockedBy("has_carrot_block", has(foodblockitemregistry.CARROT_BLOCK_ITEM.get()))
            .save(output);
         //chorus_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.CHORUS_INGOT.get(), 9)
            .requires(foodblockitemregistry.CHORUS_BLOCK_ITEM.get())
            .unlockedBy("has_chorus_block", has(foodblockitemregistry.CHORUS_BLOCK_ITEM.get()))
            .save(output);
         //glow_berry_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.GLOW_BERRY_INGOT.get(), 9)
            .requires(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
            .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
            .save(output);
         //melon_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.MELON_INGOT.get(), 9)
            .requires(foodblockitemregistry.MELON_BLOCK_ITEM.get())
            .unlockedBy("has_melon_block", has(foodblockitemregistry.MELON_BLOCK_ITEM.get()))
            .save(output);
         //sweet_berry_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.SWEET_BERRY_INGOT.get(), 9)
            .requires(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get())
            .unlockedBy("has_sweet_berry_block", has(foodblockitemregistry.SWEET_BERRY_BLOCK_ITEM.get()))
            .save(output);
         //brown_mushroom_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.BROWN_MUSHROOM_INGOT.get(), 9)
            .requires(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get())
            .unlockedBy("has_brown_mushroom_block", has(foodblockitemregistry.BROWN_MUSHROOM_BLOCK_ITEM.get()))
            .save(output);
         //red_mushroom_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.RED_MUSHROOM_INGOT.get(), 9)
            .requires(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get())
            .unlockedBy("has_red_mushroom_block", has(foodblockitemregistry.RED_MUSHROOM_BLOCK_ITEM.get()))
            .save(output);
         //pumpkin_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.PUMPKIN_INGOT.get(), 9)
            .requires(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get())
            .unlockedBy("has_pumpkin_block", has(foodblockitemregistry.PUMPKIN_BLOCK_ITEM.get()))
            .save(output);
         //chicken_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.CHICKEN_INGOT.get(), 9)
            .requires(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get())
            .unlockedBy("has_chicken_block", has(foodblockitemregistry.CHICKEN_BLOCK_ITEM.get()))
            .save(output);
         //cod_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.COD_INGOT.get(), 9)
            .requires(foodblockitemregistry.COD_BLOCK_ITEM.get())
            .unlockedBy("has_cod_block", has(foodblockitemregistry.COD_BLOCK_ITEM.get()))
            .save(output);
         //salmon_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.SALMON_INGOT.get(), 9)
            .requires(foodblockitemregistry.SALMON_BLOCK_ITEM.get())
            .unlockedBy("has_salmon_block", has(foodblockitemregistry.SALMON_BLOCK_ITEM.get()))
            .save(output);
         //tropical_fish_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.TROPICAL_FISH_INGOT.get(), 9)
            .requires(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get())
            .unlockedBy("has_tropical_fish_block", has(foodblockitemregistry.TROPICAL_FISH_BLOCK_ITEM.get()))
            .save(output);
         //mutton_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.MUTTON_INGOT.get(), 9)
            .requires(foodblockitemregistry.MUTTON_BLOCK_ITEM.get())
            .unlockedBy("has_mutton_block", has(foodblockitemregistry.MUTTON_BLOCK_ITEM.get()))
            .save(output);
         //beef_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.BEEF_INGOT.get(), 9)
            .requires(foodblockitemregistry.BEEF_BLOCK_ITEM.get())
            .unlockedBy("has_beef_block", has(foodblockitemregistry.BEEF_BLOCK_ITEM.get()))
            .save(output);
         //pork_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.PORK_INGOT.get(), 9)
            .requires(foodblockitemregistry.PORK_BLOCK_ITEM.get())
            .unlockedBy("has_pork_block", has(foodblockitemregistry.PORK_BLOCK_ITEM.get()))
            .save(output);
         //rabbit_block
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.RABBIT_INGOT.get(), 9)
            .requires(foodblockitemregistry.RABBIT_BLOCK_ITEM.get())
            .unlockedBy("has_rabbit_block", has(foodblockitemregistry.RABBIT_BLOCK_ITEM.get()))
            .save(output);

        //----------------------------------------------------------pack ingots-------------------------------------------------------------------
         //apple
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.APPLE_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.APPLE_NUGGET.get())
          .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
          .save(output, "apple_ingot_from_crafting");
         //potato
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.POTATO_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.POTATO_NUGGET.get())
          .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
          .save(output, "potato_ingot_from_crafting");
         //beetroot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.BEETROOT_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.BEETROOT_NUGGET.get())
          .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
          .save(output, "beetroot_ingot_from_crafting");
         //carrot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.CARROT_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.CARROT_NUGGET.get())
          .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
          .save(output, "carrot_ingot_from_crafting");
         //chorus
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.CHORUS_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.CHORUS_NUGGET.get())
          .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
          .save(output, "chorus_ingot_from_crafting");
         //glow_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.GLOW_BERRY_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.GLOW_BERRY_NUGGET.get())
          .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
          .save(output, "glow_berry_ingot_from_crafting");
         //melon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.MELON_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.MELON_NUGGET.get())
          .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
          .save(output, "melon_ingot_from_crafting");
         //sweet_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.SWEET_BERRY_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.SWEET_BERRY_NUGGET.get())
          .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
          .save(output, "sweet_berry_ingot_from_crafting");
         //brown_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.BROWN_MUSHROOM_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
          .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
          .save(output, "brown_mushroom_ingot_from_crafting");
         //red_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.RED_MUSHROOM_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.RED_MUSHROOM_NUGGET.get())
          .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
          .save(output, "red_mushroom_ingot_from_crafting");
         //pumpkin
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.PUMPKIN_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.PUMPKIN_NUGGET.get())
          .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
          .save(output, "pumpkin_ingot_from_crafting");
         //chicken
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.CHICKEN_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.CHICKEN_NUGGET.get())
          .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
          .save(output, "chicken_ingot_from_crafting");
         //cod
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.COD_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.COD_NUGGET.get())
          .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
          .save(output, "cod_ingot_from_crafting");
         //salmon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.SALMON_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.SALMON_NUGGET.get())
          .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
          .save(output, "salmon_ingot_from_crafting");
         //tropical_fish
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.TROPICAL_FISH_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.TROPICAL_FISH_NUGGET.get())
          .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
          .save(output, "tropical_fish_ingot_from_crafting");
         //mutton
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.MUTTON_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.MUTTON_NUGGET.get())
          .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
          .save(output, "mutton_ingot_from_crafting");
         //beef
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.BEEF_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.BEEF_NUGGET.get())
          .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
          .save(output, "beef_ingot_from_crafting");
         //pork
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.PORK_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.PORK_NUGGET.get())
          .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
          .save(output, "pork_ingot_from_crafting");
         //rabbit
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.RABBIT_INGOT.get())
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', nuggetregistry.RABBIT_NUGGET.get())
          .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
          .save(output, "rabbit_ingot_from_crafting");

        //-------------------------------------------------------------signs----------------------------------------------------------------------
         //apple_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.APPLE_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
           .save(output);
         //potato_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.POTATO_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
           .save(output);
         //beetroot_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.BEETROOT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
           .save(output);
         //carrot_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.CARROT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
           .save(output);
         //chorus_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.CHORUS_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
           .save(output);
         //glowberry_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOWBERRY_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.GLOW_BERRY_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_glowberry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
           .save(output);
         //melon_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.MELON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
           .save(output);
         //sweetberry_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEETBERRY_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.SWEET_BERRY_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_sweetberry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
           .save(output);
         //brownmushroom_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWNMUSHROOM_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.BROWN_MUSHROOM_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_brownmushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
           .save(output);
         //redmushroom_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.REDMUSHROOM_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.RED_MUSHROOM_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_redmushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
           .save(output);
         //pumpkin_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.PUMPKIN_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
           .save(output);
         //chicken_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.CHICKEN_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
           .save(output);
         //cod_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.COD_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
           .save(output);
         //salmon_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.SALMON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
           .save(output);
         //tropicalfish_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICALFISH_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.TROPICAL_FISH_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_tropicalfish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
           .save(output);
         //mutton_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.MUTTON_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
           .save(output);
         //beef_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.BEEF_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
           .save(output);
         //pork_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.PORK_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
           .save(output);
         //rabbit_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.RABBIT_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
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
        //-------------------------------------------------------------bars-----------------------------------------------------
         //apple
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.APPLE_NUGGET.get())
         .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
         .save(output);
         //potato
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.POTATO_NUGGET.get())
         .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
         .save(output);
         //beetroot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.BEETROOT_NUGGET.get())
         .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
         .save(output);
         //carrot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.CARROT_NUGGET.get())
         .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
         .save(output);
         //chorus
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.CHORUS_NUGGET.get())
         .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
         .save(output);
         //glow_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.GLOW_BERRY_NUGGET.get())
         .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
         .save(output);        
         //melon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.MELON_NUGGET.get())
         .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
         .save(output);
         //sweet_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.SWEET_BERRY_NUGGET.get())
         .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
         .save(output);
         //brown_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
         .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
         .save(output);
         //red_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.RED_MUSHROOM_NUGGET.get())
         .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
         .save(output);
         //pumpkin
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.PUMPKIN_NUGGET.get())
         .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
         .save(output);
         //chicken
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.CHICKEN_NUGGET.get())
         .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
         .save(output);
         //cod
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.COD_NUGGET.get())
         .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
         .save(output);
         //salmon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.SALMON_NUGGET.get())
         .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
         .save(output);
         //tropical_fish
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.TROPICAL_FISH_NUGGET.get())
         .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
         .save(output);
         //mutton
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.MUTTON_NUGGET.get())
         .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
         .save(output);
         //beef
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.BEEF_NUGGET.get())
         .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
         .save(output);
         //pork
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.PORK_NUGGET.get())
         .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
         .save(output);
         //rabbit
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_BARS_ITEM.get())
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.RABBIT_NUGGET.get())
         .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
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

        //------------------------------------------------------------carpet----------------------------------------------------
         //apple
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.APPLE_NUGGET.get())
         .unlockedBy("has_apple_nugget", has(nuggetregistry.APPLE_NUGGET.get()))
         .save(output);
         //potato
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.POTATO_NUGGET.get())
         .unlockedBy("has_potato_nugget", has(nuggetregistry.POTATO_NUGGET.get()))
         .save(output);
         //beetroot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.BEETROOT_NUGGET.get())
         .unlockedBy("has_beetroot_nugget", has(nuggetregistry.BEETROOT_NUGGET.get()))
         .save(output);
         //carrot
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.CARROT_NUGGET.get())
         .unlockedBy("has_carrot_nugget", has(nuggetregistry.CARROT_NUGGET.get()))
         .save(output);
         //chorus
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.CHORUS_NUGGET.get())
         .unlockedBy("has_chorus_nugget", has(nuggetregistry.CHORUS_NUGGET.get()))
         .save(output);
         //glow_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.GLOW_BERRY_NUGGET.get())
         .unlockedBy("has_glow_berry_nugget", has(nuggetregistry.GLOW_BERRY_NUGGET.get()))
         .save(output);
         //melon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.MELON_NUGGET.get())
         .unlockedBy("has_melon_nugget", has(nuggetregistry.MELON_NUGGET.get()))
         .save(output);
         //sweet_berry
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.SWEET_BERRY_NUGGET.get())
         .unlockedBy("has_sweet_berry_nugget", has(nuggetregistry.SWEET_BERRY_NUGGET.get()))
         .save(output);
         //brown_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.BROWN_MUSHROOM_NUGGET.get())
         .unlockedBy("has_brown_mushroom_nugget", has(nuggetregistry.BROWN_MUSHROOM_NUGGET.get()))
         .save(output);
         //red_mushroom
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.RED_MUSHROOM_NUGGET.get())
         .unlockedBy("has_red_mushroom_nugget", has(nuggetregistry.RED_MUSHROOM_NUGGET.get()))
         .save(output);
         //pumpkin
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.PUMPKIN_NUGGET.get())
         .unlockedBy("has_pumpkin_nugget", has(nuggetregistry.PUMPKIN_NUGGET.get()))
         .save(output);
         //chicken
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.CHICKEN_NUGGET.get())
         .unlockedBy("has_chicken_nugget", has(nuggetregistry.CHICKEN_NUGGET.get()))
         .save(output);
         //cod
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.COD_NUGGET.get())
         .unlockedBy("has_cod_nugget", has(nuggetregistry.COD_NUGGET.get()))
         .save(output);
         //salmon
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.SALMON_NUGGET.get())
         .unlockedBy("has_salmon_nugget", has(nuggetregistry.SALMON_NUGGET.get()))
         .save(output);
         //tropical_fish
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.TROPICAL_FISH_NUGGET.get())
         .unlockedBy("has_tropical_fish_nugget", has(nuggetregistry.TROPICAL_FISH_NUGGET.get()))
         .save(output);
         //mutton
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.MUTTON_NUGGET.get())
         .unlockedBy("has_mutton_nugget", has(nuggetregistry.MUTTON_NUGGET.get()))
         .save(output);
         //beef
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.BEEF_NUGGET.get())
         .unlockedBy("has_beef_nugget", has(nuggetregistry.BEEF_NUGGET.get()))
         .save(output);
         //pork
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.PORK_NUGGET.get())
         .unlockedBy("has_pork_nugget", has(nuggetregistry.PORK_NUGGET.get()))
         .save(output);
         //rabbit
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_CARPET_ITEM.get())
         .pattern("   ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', nuggetregistry.RABBIT_NUGGET.get())
         .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
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

        //------------------------------------------------------------ladders----------------------------------------------------
         //apple
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.APPLE_INGOT.get())
          .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
          .save(output);
          
         //potato
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.POTATO_INGOT.get())
          .unlockedBy("has_potato_ingot", has(ingotregistry.POTATO_INGOT.get()))
          .save(output);

         //beetroot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.BEETROOT_INGOT.get())
          .unlockedBy("has_beetroot_ingot", has(ingotregistry.BEETROOT_INGOT.get()))
          .save(output);

         //carrot
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.CARROT_INGOT.get())
          .unlockedBy("has_carrot_ingot", has(ingotregistry.CARROT_INGOT.get()))
          .save(output);

         //chorus
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.CHORUS_INGOT.get())
          .unlockedBy("has_chorus_ingot", has(ingotregistry.CHORUS_INGOT.get()))
          .save(output);

         //glow_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.GLOW_BERRY_INGOT.get())
          .unlockedBy("has_glow_berry_ingot", has(ingotregistry.GLOW_BERRY_INGOT.get()))
          .save(output);

         //melon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.MELON_INGOT.get())
          .unlockedBy("has_melon_ingot", has(ingotregistry.MELON_INGOT.get()))
          .save(output);

         //sweet_berry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.SWEET_BERRY_INGOT.get())
          .unlockedBy("has_sweet_berry_ingot", has(ingotregistry.SWEET_BERRY_INGOT.get()))
          .save(output);

         //brown_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.BROWN_MUSHROOM_INGOT.get())
          .unlockedBy("has_brown_mushroom_ingot", has(ingotregistry.BROWN_MUSHROOM_INGOT.get()))
          .save(output);

         //red_mushroom
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.RED_MUSHROOM_INGOT.get())
          .unlockedBy("has_red_mushroom_ingot", has(ingotregistry.RED_MUSHROOM_INGOT.get()))
          .save(output);

         //pumpkin
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.PUMPKIN_INGOT.get())
          .unlockedBy("has_pumpkin_ingot", has(ingotregistry.PUMPKIN_INGOT.get()))
          .save(output);

         //chicken
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.CHICKEN_INGOT.get())
          .unlockedBy("has_chicken_ingot", has(ingotregistry.CHICKEN_INGOT.get()))
          .save(output);

         //cod
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.COD_INGOT.get())
          .unlockedBy("has_cod_ingot", has(ingotregistry.COD_INGOT.get()))
          .save(output);

         //salmon
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.SALMON_INGOT.get())
          .unlockedBy("has_salmon_ingot", has(ingotregistry.SALMON_INGOT.get()))
          .save(output);

         //tropical_fish
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.TROPICAL_FISH_INGOT.get())
          .unlockedBy("has_tropical_fish_ingot", has(ingotregistry.TROPICAL_FISH_INGOT.get()))
          .save(output);

         //mutton
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.MUTTON_INGOT.get())
          .unlockedBy("has_mutton_ingot", has(ingotregistry.MUTTON_INGOT.get()))
          .save(output);

         //beef
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.BEEF_INGOT.get())
          .unlockedBy("has_beef_ingot", has(ingotregistry.BEEF_INGOT.get()))
          .save(output);

         //pork
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.PORK_INGOT.get())
          .unlockedBy("has_pork_ingot", has(ingotregistry.PORK_INGOT.get()))
          .save(output);

         //rabbit
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_LADDER_ITEM.get())
          .pattern("A A")
          .pattern("ABA")
          .pattern("A A")
          .define('A', Items.STICK)
          .define('B', ingotregistry.RABBIT_INGOT.get())
          .unlockedBy("has_rabbit_ingot", has(ingotregistry.RABBIT_INGOT.get()))
          .save(output);

        //------------------------------------------------------------torches----------------------------------------------------
         //.....apple
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.POTATO_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEETROOT_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CARROT_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHORUS_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.GLOW_BERRY_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MELON_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SWEET_BERRY_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BROWN_MUSHROOM_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RED_MUSHROOM_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PUMPKIN_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.CHICKEN_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.COD_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.SALMON_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.TROPICAL_FISH_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.MUTTON_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.BEEF_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.PORK_SOUL_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_TORCH_ITEM.get())
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
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.RABBIT_SOUL_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.RABBIT_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_rabbit_nugget", has(nuggetregistry.RABBIT_NUGGET.get()))
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

        }
    }
}
