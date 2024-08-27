package com.goldfish.goldfishmod02tastyfurniture;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider.SubProviderEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NewRegistryEvent;

import com.goldfish.goldfishmod02tastyfurniture.item.mushhammer;
import com.goldfish.goldfishmod02tastyfurniture.registry.mushregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.ingotregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.nuggetregistry;
import com.google.common.base.Supplier;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsignentity;
import com.goldfish.goldfishmod02tastyfurniture.datagen.GM1BlockLootTableProvider;
import com.goldfish.goldfishmod02tastyfurniture.datagen.GM1BlockStateProvider;
import com.goldfish.goldfishmod02tastyfurniture.datagen.GM1Datagen;
import com.goldfish.goldfishmod02tastyfurniture.datagen.GM1LootTableProvider;


@Mod(TastyFurniture.MODID)
public class TastyFurniture
{
    public static final String MODID = "goldfishmod02tastyfurniture";

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Blocks FOODBLOCK = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Blocks FOODSIGNBLOCKENTITY = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredRegister.Items MUSH = DeferredRegister.createItems(MODID);

    public static final DeferredRegister.Items FOODINGOT = DeferredRegister.createItems(MODID);

    public static final DeferredRegister.Items FOODNUGGET = DeferredRegister.createItems(MODID);

    public static final DeferredRegister.Items FOODBLOCKITEM = DeferredRegister.createItems(MODID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TASTY_FURNITURE_TAB = CREATIVE_MODE_TABS.register("tasty_furniture_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tastyfurniture"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> mushregistry.mushhammer.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.acceptAll(mushregistry.MUSH.getEntries().stream().map(sup -> {
                    return sup.get().getDefaultInstance();
                }).toList());
                output.acceptAll(ingotregistry.FOODINGOT.getEntries().stream().map(sup -> {
                    return sup.get().getDefaultInstance();
                }).toList());
                output.acceptAll(nuggetregistry.FOODNUGGET.getEntries().stream().map(sup -> {
                    return sup.get().getDefaultInstance();
                }).toList());
                output.acceptAll(foodblockitemregistry.FOODBLOCKITEM.getEntries().stream().map(sup -> {
                    return sup.get().getDefaultInstance();
                }).toList());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> gettab(){
              return TASTY_FURNITURE_TAB;
    }

    public TastyFurniture(IEventBus modEventBus, ModContainer modContainer)
    {

        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(GM1Datagen::gatherData);

        modEventBus.addListener(datagathering::onGatherData);

        BLOCKS.register(modEventBus);

        WoodType.register(foodmaterialtyperegistry.APPLEWOODMAT);

        foodblockregistry.FOODBLOCK.register(modEventBus);

        foodblockregistry.FOODSIGNBLOCKENTITY.register(modEventBus);

        ITEMS.register(modEventBus);

        mushregistry.MUSH.register(modEventBus);

        ingotregistry.FOODINGOT.register(modEventBus);

        nuggetregistry.FOODNUGGET.register(modEventBus);

        foodblockitemregistry.FOODBLOCKITEM.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);


        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from the VOID");
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());      
        }

        @SubscribeEvent
        public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(foodblockregistry.APPLE_SIGN_ENTITY.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(foodblockregistry.POTATO_SIGN_ENTITY.get(), SignRenderer::new);
        }
    }


public class datagathering {
     @SubscribeEvent
     public static void onGatherData(GatherDataEvent event) {

        try {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        generator.addProvider(event.includeClient(), new GM1LootTableProvider(output, lookupProvider));
        new SubProviderEntry(
            GM1BlockLootTableProvider::new,
            LootContextParamSets.EMPTY
        );
        LOGGER.info("hello from robot heck");
        } catch (RuntimeException e) {
            LOGGER.error("failed to generate blockstates");
        }
        
 }
}}

//Note to self: "recipes" is now "recipe" in 1.21.

//command to reinstall java 17 below. It likes to uninstall itself for some reason, only computer jesus knows why
//sudo apt install openjdk-17-jdk openjdk-17-jre