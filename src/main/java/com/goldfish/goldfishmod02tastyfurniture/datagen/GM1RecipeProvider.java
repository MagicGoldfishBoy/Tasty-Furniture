package com.goldfish.goldfishmod02tastyfurniture.datagen;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import javax.annotation.Nullable;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.ingotregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.nuggetregistry;

import net.minecraft.advancements.Criterion;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
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

        //-----------------------------------signs----------------------------------------------------
         //apple_sign
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.APPLE_SIGN_ITEM.get())
           .pattern("AAA")
           .pattern("AAA")
           .pattern(" B ")
           .define('A', ingotregistry.APPLE_INGOT.get())
           .define('B', Items.STICK)
           .unlockedBy("has_apple_ingot", has(ingotregistry.APPLE_INGOT.get()))
           .save(output);

        //-----------------------------------slabs----------------------------------------------------
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

        //-----------------------------------stairs----------------------------------------------------
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

        //-----------------------------------trap doors----------------------------------------------------
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
        //---------------------------------------bars----------------------------------------------------
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
        
        }
    }
}
