package com.goldfish.goldfishmod02tastyfurniture.datagen;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.mojang.logging.LogUtils;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
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
     foodblockregistry.FOODBLOCK.getEntries().forEach((a) -> {if (a.get().getName().toString().matches(".*slab.*")) {this.add(a.get(), this::createSlabItemTable);}
     else if (a.get().getName().toString().matches(".*door.*") && (!a.get().getName().toString().matches(".*trap.*"))) {this.add(a.get(), this::createDoorTable);} 
     else {dropSelf(a.get());} });
     }

}

