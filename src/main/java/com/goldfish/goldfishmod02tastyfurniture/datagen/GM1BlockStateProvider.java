package com.goldfish.goldfishmod02tastyfurniture.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

public class GM1BlockStateProvider //extends BlockStateProvider 
{

    // public GM1BlockStateProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
    //     super(output, modid, exFileHelper);
    // }

    // @Override
    // protected void registerModels() {

    //     withExistingParent(foodblockregistry.BEETROOT_DOOR_BLOCK.get(), modLoc("block/example_block"));

    //     withExistingParent(foodblockregistry.BEETROOT_DOOR_BLOCK.get(), mcLoc("item/generated")).texture("layer0", "item/example_item");

    //     basicItem(foodblockregistry.BEETROOT_DOOR_BLOCK.get());
    // }

    // private void withExistingParent(net.minecraft.world.level.block.Block block, ResourceLocation modLoc) {

    //     throw new UnsupportedOperationException("Unimplemented method 'withExistingParent'");
    // }
}
    
