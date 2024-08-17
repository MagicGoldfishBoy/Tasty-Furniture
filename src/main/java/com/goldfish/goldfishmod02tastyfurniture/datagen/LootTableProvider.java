package com.goldfish.goldfishmod02tastyfurniture.datagen;

import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.util.BiConsumer;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.WeatherCheck;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataProvider;

public class LootTableProvider implements LootTableSubProvider {
    // The parameter is provided by the lambda (see below). It can be stored and used to lookup other registry entries.
    public LootTableProvider(HolderLookup.Provider lookupProvider) {
        super();
    }

    //@Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
        // LootTable.lootTable() returns a loot table builder we can add loot tables to.
        consumer.accept(ResourceLocation.fromNamespaceAndPath("goldfishmod02tastyfurniture", "GM1BlockLootTableProvider"), LootTable.lootTable()
                // Add a loot table-level loot function. This example uses a number provider (see below).
                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(5)))
                // Add a loot pool.
                .withPool(LootPool.lootPool()
                        // Add a loot pool-level function, similar to above.
                        .apply(null)
                        // Add a loot pool-level condition. This example only rolls the pool if it is raining.
                        .when(WeatherCheck.weather().setRaining(true))
                // Set the amount of rolls and bonus rolls, respectively.
                // Both of these methods utilize a number provider.
                .setRolls(UniformGenerator.between(5, 9))
                .setBonusRolls(ConstantValue.exactly(1))
                // Add a loot entry. This example returns an item loot entry. See below for more loot entries.
                .add(LootItem.lootTableItem(foodblockregistry.APPLE_SIGN.get()))
                )
        );
    }

    @Override
    public void generate(java.util.function.BiConsumer<ResourceKey<LootTable>, Builder> p_249643_) {
        //dropSelf(foodblockregistry.APPLE_SIGN.get());
    }
}
//  public LootTableProvider(PackOutput output, Set<DataProvider> requiredProviders, List<GM1BlockLootTableProvider> subProviders) {
//  super();
//     }

//     @SubscribeEvent
//     public static void onGatherData(GatherDataEvent event) {
//         PackOutput output = event.getGenerator().getPackOutput();
//         boolean includeServer = event.includeServer();
        
//         LootTableProvider.Factory<DataProvider> providerFactory = (PackOutput packOutput) ->
//             new GM1LootTableProvider(
//                 packOutput,
//                 Set.of(), // Adjust if you have required providers
//                 List.of(new GM1BlockLootTableProvider(event.getLookupProvider()))
//             );

//         event.getGenerator().addProvider(includeServer, providerFactory);
//     }
//}

