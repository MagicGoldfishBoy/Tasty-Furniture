package com.goldfish.goldfishmod02tastyfurniture.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class Custom_Datagen_Methods extends BlockStateProvider {
         public Custom_Datagen_Methods(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
         super(output, "goldfishmod02tastyfurniture", existingFileHelper);
     }

    //  public CustomDatagenMethods(BlockStateProvider provider) {
    //     this.provider = provider;
    // }
    //  protected PackOutput getPackOutput() {
    //     // Return or use the output
    //     return this.output; // This assumes you can access `output` directly.
    // }

     @Override
     public void registerStatesAndModels() {
        //PackOutput output = getOutput();
     };
     public void wall_torch(TorchBlock torchblock, BlockModelBuilder model, ResourceLocation texture, String name) {

        TorchBlock torch = torchblock;
        ResourceLocation torch_texture = texture;
        BlockModelBuilder torch_model = models()
        .withExistingParent("apple_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", texture)
        .texture("particle", texture);
        getVariantBuilder(torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 0;
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent(name, mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", texture)
                    .texture("particle", texture))
                .rotationY(rotation)
                .build();
     });}

     public class DataGenHelper {
        public static void createRedstoneWallTorch(PackOutput output, String modid, ExistingFileHelper existingFileHelper,
                                                   RedstoneTorchBlock redstoneTorchBlock, ResourceLocation texture, String name) {
            Custom_Datagen_Methods methods = new Custom_Datagen_Methods(output, modid, existingFileHelper);
            methods.redstone_wall_torch(redstoneTorchBlock, texture, name);
        }
    }

    //  public static void create_redstone_wall_torch(RedstoneTorchBlock redstone_torchblock, ResourceLocation texture, String name) {
    //    new Custom_Datagen_Methods().redstone_wall_torch(redstone_torchblock, texture, name);
    //  }

     public void redstone_wall_torch(RedstoneTorchBlock redstone_torchblock, ResourceLocation texture, String name) {

        RedstoneTorchBlock torch = redstone_torchblock;
        ResourceLocation torch_texture = texture;
        BlockModelBuilder torch_model = models()
        .withExistingParent("apple_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", texture)
        .texture("particle", texture);
        getVariantBuilder(torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 0;
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent(name, mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", texture)
                    .texture("particle", texture))
                .rotationY(rotation)
                .build();
        });}
}
