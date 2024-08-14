package com.goldfish.goldfishmod02tastyfurniture.datagen;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.mojang.logging.LogUtils;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class GM1Datagen {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static ExistingFileHelper ExistingFileHelper;

    public static void gatherData(GatherDataEvent event) {
        
        try {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            generator.addProvider(
                event.includeClient(),
                new GM1BlockStateProvider(output, "goldfishmod02tastyfurniture", existingFileHelper));
                
        } catch (RuntimeException e) {
            LOGGER.error("failed to generate blockstates");
        }

        try {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(
            event.includeClient(),
            new GM1ItemModelProvider(output, "goldfishmod02tastyfurniture", existingFileHelper));
            
        } catch (Exception e) {
            LOGGER.error("failed to generate item models");
        }
        
    }

}

            // PackOutput output = event.getGenerator().getPackOutput();
            // new GM1BlockStateProvider(output, TastyFurniture.MODID, ExistingFileHelper);