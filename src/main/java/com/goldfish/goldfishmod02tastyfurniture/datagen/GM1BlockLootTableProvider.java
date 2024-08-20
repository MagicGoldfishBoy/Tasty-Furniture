package com.goldfish.goldfishmod02tastyfurniture.datagen;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.mojang.logging.LogUtils;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.data.DataProvider;
import net.minecraft.data.loot.BlockLootSubProvider;

import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;

public class GM1BlockLootTableProvider extends BlockLootSubProvider {

    public GM1BlockLootTableProvider(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }
    private static final Logger LOGGER = LogUtils.getLogger();

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return foodblockregistry.FOODBLOCK.getEntries()
                .stream()
                .map(entry -> entry.get())
                .collect(Collectors.toList());
    }

    @Override
    protected void generate() {
       dropSelf(foodblockregistry.POTATO_SLAB.get());
    }

}

