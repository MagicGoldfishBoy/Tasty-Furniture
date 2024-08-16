package com.goldfish.goldfishmod02tastyfurniture.datagen;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import javax.annotation.Nullable;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.ingotregistry;

import net.minecraft.advancements.Criterion;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
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
        }
        

    }
}
