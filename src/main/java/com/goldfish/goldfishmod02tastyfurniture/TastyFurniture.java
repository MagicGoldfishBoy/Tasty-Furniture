package com.goldfish.goldfishmod02tastyfurniture;

import java.util.Collection;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import com.goldfish.goldfishmod02tastyfurniture.item.mushhammer;
import com.goldfish.goldfishmod02tastyfurniture.registry.mushregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.ingotregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.nuggetregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;


@Mod(TastyFurniture.MODID)
public class TastyFurniture
{
    public static final String MODID = "goldfishmod02tastyfurniture";

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Blocks FOODBLOCK = DeferredRegister.createBlocks(MODID);

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

        BLOCKS.register(modEventBus);

        foodblockregistry.FOODBLOCK.register(modEventBus);

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

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}

//Note to self: "recipes" is now "recipe" in 1.21.