package com.goldfish.goldfishmod02tastyfurniture.datagen;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class GM1ItemModelProvider extends ItemModelProvider {

        public GM1ItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, "goldfishmod02tastyfurniture", existingFileHelper);
    }

        @Override
        protected void registerModels() {
          //withExistingParent("apple_button_item", modLoc("block/apple_button"));
          buttonInventory("apple_button_item", modLoc("block/apple_block"));
          buttonInventory("potato_button_item", modLoc("block/potato_block"));
          //withExistingParent("apple_button_item", mcLoc("item/generated")).texture("layer0", "item/example_item");

    //-------------------------------------------------------------doors---------------------------------------------------------------------
      //.........glow berry
        withExistingParent("glow_berry_door_item", mcLoc("item/generated")).texture("layer0", "item/glow_berry_door");
      //...........melon
        withExistingParent("melon_door_item", mcLoc("item/generated")).texture("layer0", "item/melon_door");
      //.........sweet berry
        withExistingParent("sweet_berry_door_item", mcLoc("item/generated")).texture("layer0", "item/sweet_berry_door");
      //.........brown mushroom
        withExistingParent("brown_mushroom_door_item", mcLoc("item/generated")).texture("layer0", "item/brown_mushroom_door");
      //..........red mushroom
        withExistingParent("red_mushroom_door_item", mcLoc("item/generated")).texture("layer0", "item/red_mushroom_door");
      //.............pumpkin
        withExistingParent("pumpkin_door_item", mcLoc("item/generated")).texture("layer0", "item/pumpkin_door");
      //.............chicken
        withExistingParent("chicken_door_item", mcLoc("item/generated")).texture("layer0", "item/chicken_door");
      //...............cod
        withExistingParent("cod_door_item", mcLoc("item/generated")).texture("layer0", "item/cod_door");

        }
    
}
