package com.goldfish.goldfishmod02tastyfurniture.registry;

import java.rmi.registry.Registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsign;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsign.foodstandingsign;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsign.foodwallsign;
// import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsign.foodwallsign.foodstandingsign;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsignentity;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;
import com.google.common.base.Supplier;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.behavior.GateBehavior;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Block.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.vault.*;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.obj.ObjMaterialLibrary.Material;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Blocks.*;
import net.neoforged.neoforge.registries.datamaps.builtin.*;
import net.neoforged.neoforge.registries.callback.*;
import net.neoforged.neoforge.registries.holdersets.*;



public class foodblockregistry {
    public static final DeferredRegister<Block> FOODBLOCK = DeferredRegister.create(BuiltInRegistries.BLOCK, TastyFurniture.MODID);
    public static final DeferredRegister<BlockEntityType<?>> FOODBLOCKENTITY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, TastyFurniture.MODID);
    
//==============================================================================================================================================================================================
//                                                                                          Blocks
//==============================================================================================================================================================================================
    public static final DeferredHolder<Block, Block> APPLE_BLOCK = FOODBLOCK.register("apple_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> POTATO_BLOCK = FOODBLOCK.register("potato_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> BEETROOT_BLOCK = FOODBLOCK.register("beetroot_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> CARROT_BLOCK = FOODBLOCK.register("carrot_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> CHORUS_BLOCK = FOODBLOCK.register("chorus_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> GLOW_BERRY_BLOCK = FOODBLOCK.register("glow_berry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 15)
         ));
    public static final DeferredHolder<Block, Block> MELON_BLOCK = FOODBLOCK.register("melon_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(1.5f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> SWEET_BERRY_BLOCK = FOODBLOCK.register("sweet_berry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(1.5f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> BROWN_MUSHROOM_BLOCK = FOODBLOCK.register("brown_mushroom_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(1.75f)
         .explosionResistance(9.75f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> RED_MUSHROOM_BLOCK = FOODBLOCK.register("red_mushroom_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(1.75f)
         .explosionResistance(9.75f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> PUMPKIN_BLOCK = FOODBLOCK.register("pumpkin_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(3.25f)
         .explosionResistance(11.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> CHICKEN_BLOCK = FOODBLOCK.register("chicken_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> COD_BLOCK = FOODBLOCK.register("cod_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> SALMON_BLOCK = FOODBLOCK.register("salmon_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> TROPICAL_FISH_BLOCK = FOODBLOCK.register("tropical_fish_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> MUTTON_BLOCK = FOODBLOCK.register("mutton_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> BEEF_BLOCK = FOODBLOCK.register("beef_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> PORK_BLOCK = FOODBLOCK.register("pork_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
    public static final DeferredHolder<Block, Block> RABBIT_BLOCK = FOODBLOCK.register("rabbit_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));

//==============================================================================================================================================================================================
//                                                                                         Doors
//==============================================================================================================================================================================================
         
    public static final DeferredHolder<Block, Block> APPLE_DOOR_BLOCK = FOODBLOCK.register("apple_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(1.75f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         ));
    public static final DeferredHolder<Block, Block> POTATO_DOOR_BLOCK = FOODBLOCK.register("potato_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
    public static final DeferredHolder<Block, Block> BEETROOT_DOOR_BLOCK = FOODBLOCK.register("beetroot_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, Block> CARROT_DOOR_BLOCK = FOODBLOCK.register("carrot_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, Block> CHORUS_DOOR_BLOCK = FOODBLOCK.register("chorus_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> GLOW_BERRY_DOOR_BLOCK = FOODBLOCK.register("glow_berry_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         .lightLevel(state -> 10)
         ));
     public static final DeferredHolder<Block, DoorBlock> MELON_DOOR_BLOCK = FOODBLOCK.register("melon_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> SWEET_BERRY_DOOR_BLOCK = FOODBLOCK.register("sweet_berry_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> BROWN_MUSHROOM_DOOR_BLOCK = FOODBLOCK.register("brown_mushroom_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> RED_MUSHROOM_DOOR_BLOCK = FOODBLOCK.register("red_mushroom_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> PUMPKIN_DOOR_BLOCK = FOODBLOCK.register("pumpkin_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> CHICKEN_DOOR_BLOCK = FOODBLOCK.register("chicken_door", () -> new DoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> COD_DOOR_BLOCK = FOODBLOCK.register("cod_door", () -> new DoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> SALMON_DOOR_BLOCK = FOODBLOCK.register("salmon_door", () -> new DoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> TROPICAL_FISH_DOOR_BLOCK = FOODBLOCK.register("tropical_fish_door", () -> new DoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> MUTTON_DOOR_BLOCK = FOODBLOCK.register("mutton_door", () -> new DoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> BEEF_DOOR_BLOCK = FOODBLOCK.register("beef_door", () -> new DoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> PORK_DOOR_BLOCK = FOODBLOCK.register("pork_door", () -> new DoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> RABBIT_DOOR_BLOCK = FOODBLOCK.register("rabbit_door", () -> new DoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));

//==============================================================================================================================================================================================
//                                                                                         Buttons
//==============================================================================================================================================================================================

    public static final DeferredHolder<Block, ButtonBlock> APPLE_BUTTON = FOODBLOCK.register("apple_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> POTATO_BUTTON = FOODBLOCK.register("potato_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> BEETROOT_BUTTON = FOODBLOCK.register("beetroot_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> CARROT_BUTTON = FOODBLOCK.register("carrot_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> CHORUS_BUTTON = FOODBLOCK.register("chorus_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> GLOW_BERRY_BUTTON = FOODBLOCK.register("glow_berry_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .lightLevel(state -> 5)
    ));
    public static final DeferredHolder<Block, ButtonBlock> MELON_BUTTON = FOODBLOCK.register("melon_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> SWEET_BERRY_BUTTON = FOODBLOCK.register("sweet_berry_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> BROWN_MUSHROOM_BUTTON = FOODBLOCK.register("brown_mushroom_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> RED_MUSHROOM_BUTTON = FOODBLOCK.register("red_mushroom_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> PUMPKIN_BUTTON = FOODBLOCK.register("pumpkin_button", () -> new ButtonBlock(foodmaterialtyperegistry.PLANT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> CHICKEN_BUTTON = FOODBLOCK.register("chicken_button", () -> new ButtonBlock(foodmaterialtyperegistry.MEAT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> COD_BUTTON = FOODBLOCK.register("cod_button", () -> new ButtonBlock(foodmaterialtyperegistry.MEAT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> SALMON_BUTTON = FOODBLOCK.register("salmon_button", () -> new ButtonBlock(foodmaterialtyperegistry.MEAT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> TROPICAL_FISH_BUTTON = FOODBLOCK.register("tropical_fish_button", () -> new ButtonBlock(foodmaterialtyperegistry.MEAT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> MUTTON_BUTTON = FOODBLOCK.register("mutton_button", () -> new ButtonBlock(foodmaterialtyperegistry.MEAT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> BEEF_BUTTON = FOODBLOCK.register("beef_button", () -> new ButtonBlock(foodmaterialtyperegistry.MEAT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> PORK_BUTTON = FOODBLOCK.register("pork_button", () -> new ButtonBlock(foodmaterialtyperegistry.MEAT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> RABBIT_BUTTON = FOODBLOCK.register("rabbit_button", () -> new ButtonBlock(foodmaterialtyperegistry.MEAT, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));

//==============================================================================================================================================================================================
//                                                                                         Fences
//==============================================================================================================================================================================================

    public static final DeferredHolder<Block, FenceBlock> APPLE_FENCE = FOODBLOCK.register("apple_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.5f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> POTATO_FENCE = FOODBLOCK.register("potato_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.75f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> BEETROOT_FENCE = FOODBLOCK.register("beetroot_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.75f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> CARROT_FENCE = FOODBLOCK.register("carrot_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.75f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> CHORUS_FENCE = FOODBLOCK.register("chorus_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.5f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> GLOW_BERRY_FENCE = FOODBLOCK.register("glow_berry_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.5f)
    .explosionResistance(8.0f)
    .lightLevel(state -> 5)
    ));
    public static final DeferredHolder<Block, FenceBlock> MELON_FENCE = FOODBLOCK.register("melon_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.5f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> SWEET_BERRY_FENCE = FOODBLOCK.register("sweet_berry_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.5f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> BROWN_MUSHROOM_FENCE = FOODBLOCK.register("brown_mushroom_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.5f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> RED_MUSHROOM_FENCE = FOODBLOCK.register("red_mushroom_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.5f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> PUMPKIN_FENCE = FOODBLOCK.register("pumpkin_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(1.5f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> CHICKEN_FENCE = FOODBLOCK.register("chicken_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(1.25f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> COD_FENCE = FOODBLOCK.register("cod_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(1.25f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> SALMON_FENCE = FOODBLOCK.register("salmon_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(1.25f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> TROPICAL_FISH_FENCE = FOODBLOCK.register("tropical_fish_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(1.25f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> MUTTON_FENCE = FOODBLOCK.register("mutton_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(1.25f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> BEEF_FENCE = FOODBLOCK.register("beef_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(1.25f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> PORK_FENCE = FOODBLOCK.register("pork_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(1.25f)
    .explosionResistance(8.0f)
    ));
    public static final DeferredHolder<Block, FenceBlock> RABBIT_FENCE = FOODBLOCK.register("rabbit_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(1.25f)
    .explosionResistance(8.0f)
    ));

//==============================================================================================================================================================================================
//                                                                                      Pressure Plates
//==============================================================================================================================================================================================

    public static final DeferredHolder<Block, PressurePlateBlock> APPLE_PRESSURE_PLATE = FOODBLOCK.register("apple_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> POTATO_PRESSURE_PLATE = FOODBLOCK.register("potato_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> BEETROOT_PRESSURE_PLATE = FOODBLOCK.register("beetroot_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> CARROT_PRESSURE_PLATE = FOODBLOCK.register("carrot_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> CHORUS_PRESSURE_PLATE = FOODBLOCK.register("chorus_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> GLOW_BERRY_PRESSURE_PLATE = FOODBLOCK.register("glow_berry_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> MELON_PRESSURE_PLATE = FOODBLOCK.register("melon_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> SWEET_BERRY_PRESSURE_PLATE = FOODBLOCK.register("sweet_berry_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> BROWN_MUSHROOM_PRESSURE_PLATE = FOODBLOCK.register("brown_mushroom_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> RED_MUSHROOM_PRESSURE_PLATE = FOODBLOCK.register("red_mushroom_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> PUMPKIN_PRESSURE_PLATE = FOODBLOCK.register("pumpkin_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> CHICKEN_PRESSURE_PLATE = FOODBLOCK.register("chicken_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> COD_PRESSURE_PLATE = FOODBLOCK.register("cod_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> SALMON_PRESSURE_PLATE = FOODBLOCK.register("salmon_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> TROPICAL_FISH_PRESSURE_PLATE = FOODBLOCK.register("tropical_fish_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> MUTTON_PRESSURE_PLATE = FOODBLOCK.register("mutton_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> BEEF_PRESSURE_PLATE = FOODBLOCK.register("beef_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> PORK_PRESSURE_PLATE = FOODBLOCK.register("pork_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
    public static final DeferredHolder<Block, PressurePlateBlock> RABBIT_PRESSURE_PLATE = FOODBLOCK.register("rabbit_pressure_plate", () -> new PressurePlateBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));

//==============================================================================================================================================================================================
//                                                                                          Signs
//==============================================================================================================================================================================================

  //.........apple
   public static final DeferredHolder<Block, foodsign> APPLE_SIGN = FOODBLOCK.register("apple_sign",
   () -> new foodsign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         WoodType.OAK
         //foodmaterialtyperegistry.APPLEWOODMAT
   ));
   public static final DeferredHolder<Block, foodwallsign> APPLE_WALL_SIGN = FOODBLOCK.register("apple_wall_sign",
   () -> new foodsign.foodwallsign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       WoodType.OAK
       //foodmaterialtyperegistry.APPLEWOODMAT
   ));
   public static final DeferredHolder<Block, foodstandingsign> APPLE_STANDING_SIGN = FOODBLOCK.register("apple_standing_sign",
   () -> new foodsign.foodstandingsign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       WoodType.OAK
       //foodmaterialtyperegistry.APPLEWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<foodsignentity>> APPLE_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "apple_sign_entity",
     () -> BlockEntityType.Builder.of(
         foodsignentity::new,
         foodblockregistry.APPLE_SIGN.get(),
         foodblockregistry.APPLE_WALL_SIGN.get(),
         foodblockregistry.APPLE_STANDING_SIGN.get()
     ).build(null)
 );
   //.........potato

//==============================================================================================================================================================================================
//                                                                                          Slabs
//==============================================================================================================================================================================================

   //.........apple
     public static final DeferredHolder<Block, SlabBlock> APPLE_SLAB = FOODBLOCK.register("apple_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........potato
     public static final DeferredHolder<Block, SlabBlock> POTATO_SLAB = FOODBLOCK.register("potato_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........beetroot
     public static final DeferredHolder<Block, SlabBlock> BEETROOT_SLAB = FOODBLOCK.register("beetroot_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........carrot
     public static final DeferredHolder<Block, SlabBlock> CARROT_SLAB = FOODBLOCK.register("carrot_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........chorus
     public static final DeferredHolder<Block, SlabBlock> CHORUS_SLAB = FOODBLOCK.register("chorus_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........glow_berry
     public static final DeferredHolder<Block, SlabBlock> GLOW_BERRY_SLAB = FOODBLOCK.register("glow_berry_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     .lightLevel(state -> 15)
     ));
   //.........melon
     public static final DeferredHolder<Block, SlabBlock> MELON_SLAB = FOODBLOCK.register("melon_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........sweet_berry
     public static final DeferredHolder<Block, SlabBlock> SWEET_BERRY_SLAB = FOODBLOCK.register("sweet_berry_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........brown_mushroom
     public static final DeferredHolder<Block, SlabBlock> BROWN_MUSHROOM_SLAB = FOODBLOCK.register("brown_mushroom_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........red_mushroom
     public static final DeferredHolder<Block, SlabBlock> RED_MUSHROOM_SLAB = FOODBLOCK.register("red_mushroom_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........pumpkin
     public static final DeferredHolder<Block, SlabBlock> PUMPKIN_SLAB = FOODBLOCK.register("pumpkin_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........chicken
     public static final DeferredHolder<Block, SlabBlock> CHICKEN_SLAB = FOODBLOCK.register("chicken_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........cod
     public static final DeferredHolder<Block, SlabBlock> COD_SLAB = FOODBLOCK.register("cod_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........salmon
     public static final DeferredHolder<Block, SlabBlock> SALMON_SLAB = FOODBLOCK.register("salmon_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........tropical_fish
     public static final DeferredHolder<Block, SlabBlock> TROPICAL_FISH_SLAB = FOODBLOCK.register("tropical_fish_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........mutton
     public static final DeferredHolder<Block, SlabBlock> MUTTON_SLAB = FOODBLOCK.register("mutton_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........beef
     public static final DeferredHolder<Block, SlabBlock> BEEF_SLAB = FOODBLOCK.register("beef_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........pork
     public static final DeferredHolder<Block, SlabBlock> PORK_SLAB = FOODBLOCK.register("pork_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........rabbit
     public static final DeferredHolder<Block, SlabBlock> RABBIT_SLAB = FOODBLOCK.register("rabbit_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
     
//==============================================================================================================================================================================================
//                                                                                          Stairs
//==============================================================================================================================================================================================

   //.........apple
     public static final DeferredHolder<Block, StairBlock> APPLE_STAIRS = FOODBLOCK.register("apple_stairs", () -> new StairBlock(
          APPLE_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........potato
     public static final DeferredHolder<Block, StairBlock> POTATO_STAIRS = FOODBLOCK.register("potato_stairs", () -> new StairBlock(
          POTATO_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........beetroot
     public static final DeferredHolder<Block, StairBlock> BEETROOT_STAIRS = FOODBLOCK.register("beetroot_stairs", () -> new StairBlock(
          BEETROOT_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........carrot
     public static final DeferredHolder<Block, StairBlock> CARROT_STAIRS = FOODBLOCK.register("carrot_stairs", () -> new StairBlock(
          CARROT_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........chorus
     public static final DeferredHolder<Block, StairBlock> CHORUS_STAIRS = FOODBLOCK.register("chorus_stairs", () -> new StairBlock(
          CHORUS_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........glow_berry
     public static final DeferredHolder<Block, StairBlock> GLOW_BERRY_STAIRS = FOODBLOCK.register("glow_berry_stairs", () -> new StairBlock(
          GLOW_BERRY_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
          .lightLevel(state -> 15)
      ));
   //.........melon
     public static final DeferredHolder<Block, StairBlock> MELON_STAIRS = FOODBLOCK.register("melon_stairs", () -> new StairBlock(
          MELON_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........sweet_berry
     public static final DeferredHolder<Block, StairBlock> SWEET_BERRY_STAIRS = FOODBLOCK.register("sweet_berry_stairs", () -> new StairBlock(
          SWEET_BERRY_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........brown_mushroom
     public static final DeferredHolder<Block, StairBlock> BROWN_MUSHROOM_STAIRS = FOODBLOCK.register("brown_mushroom_stairs", () -> new StairBlock(
          BROWN_MUSHROOM_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........red_mushroom
     public static final DeferredHolder<Block, StairBlock> RED_MUSHROOM_STAIRS = FOODBLOCK.register("red_mushroom_stairs", () -> new StairBlock(
          RED_MUSHROOM_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........pumpkin
     public static final DeferredHolder<Block, StairBlock> PUMPKIN_STAIRS = FOODBLOCK.register("pumpkin_stairs", () -> new StairBlock(
          PUMPKIN_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........chicken
     public static final DeferredHolder<Block, StairBlock> CHICKEN_STAIRS = FOODBLOCK.register("chicken_stairs", () -> new StairBlock(
          CHICKEN_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........cod
     public static final DeferredHolder<Block, StairBlock> COD_STAIRS = FOODBLOCK.register("cod_stairs", () -> new StairBlock(
          COD_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........salmon
     public static final DeferredHolder<Block, StairBlock> SALMON_STAIRS = FOODBLOCK.register("salmon_stairs", () -> new StairBlock(
          SALMON_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........tropical_fish
     public static final DeferredHolder<Block, StairBlock> TROPICAL_FISH_STAIRS = FOODBLOCK.register("tropical_fish_stairs", () -> new StairBlock(
          TROPICAL_FISH_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........mutton
     public static final DeferredHolder<Block, StairBlock> MUTTON_STAIRS = FOODBLOCK.register("mutton_stairs", () -> new StairBlock(
          MUTTON_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........beef
     public static final DeferredHolder<Block, StairBlock> BEEF_STAIRS = FOODBLOCK.register("beef_stairs", () -> new StairBlock(
          BEEF_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........pork
     public static final DeferredHolder<Block, StairBlock> PORK_STAIRS = FOODBLOCK.register("pork_stairs", () -> new StairBlock(
          PORK_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
   //.........rabbit
     public static final DeferredHolder<Block, StairBlock> RABBIT_STAIRS = FOODBLOCK.register("rabbit_stairs", () -> new StairBlock(
          RABBIT_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
  
//==============================================================================================================================================================================================
//                                                                                         Trapdoors
//==============================================================================================================================================================================================

   //.........apple
     public static final DeferredHolder<Block, TrapDoorBlock> APPLE_TRAPDOOR = FOODBLOCK.register("apple_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........potato
   //.........beetroot
   //.........carrot
   //.........chorus
   //.........glow_berry
   //.........melon
   //.........sweet_berry
   //.........brown_mushroom
   //.........red_mushroom
   //.........pumpkin
   //.........chicken
   //.........cod
   //.........salmon
   //.........tropical_fish
   //.........mutton
   //.........beef
   //.........pork
   //.........rabbit
//==============================================================================================================================================================================================
//                                                                                           Bars
//==============================================================================================================================================================================================

   //.........apple
   //.........potato
   //.........beetroot
   //.........carrot
   //.........chorus
   //.........glow_berry
   //.........melon
   //.........sweet_berry
   //.........brown_mushroom
   //.........red_mushroom
   //.........pumpkin
   //.........chicken
   //.........cod
   //.........salmon
   //.........tropical_fish
   //.........mutton
   //.........beef
   //.........pork
   //.........rabbit
//==============================================================================================================================================================================================
//                                                                                           Lamps
//==============================================================================================================================================================================================

   //.........apple
   //.........potato
   //.........beetroot
   //.........carrot
   //.........chorus
   //.........glow_berry
   //.........melon
   //.........sweet_berry
   //.........brown_mushroom
   //.........red_mushroom
   //.........pumpkin
   //.........chicken
   //.........cod
   //.........salmon
   //.........tropical_fish
   //.........mutton
   //.........beef
   //.........pork
   //.........rabbit

//==============================================================================================================================================================================================
//                                                                                           Carpets
//==============================================================================================================================================================================================

   //.........apple
   //.........potato
   //.........beetroot
   //.........carrot
   //.........chorus
   //.........glow_berry
   //.........melon
   //.........sweet_berry
   //.........brown_mushroom
   //.........red_mushroom
   //.........pumpkin
   //.........chicken
   //.........cod
   //.........salmon
   //.........tropical_fish
   //.........mutton
   //.........beef
   //.........pork
   //.........rabbit
}
