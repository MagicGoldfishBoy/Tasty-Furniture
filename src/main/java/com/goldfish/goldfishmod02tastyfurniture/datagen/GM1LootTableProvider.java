package com.goldfish.goldfishmod02tastyfurniture.datagen;

//;import net.minecraft.data.loot.LootTableProvider.LOGGER;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import org.apache.logging.log4j.util.BiConsumer;
import org.slf4j.Logger;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.mojang.logging.LogUtils;
import com.goldfish.goldfishmod02tastyfurniture.datagen.GM1BlockLootTableProvider;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableProvider.SubProviderEntry;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.WeatherCheck;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;

public class GM1LootTableProvider extends LootTableProvider {
    public GM1LootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, Set.of(), List.of(new SubProviderEntry(GM1BlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider);
    }
    
     private static final Logger LOGGER = LogUtils.getLogger();
}
    


