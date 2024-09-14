package com.goldfish.goldfishmod02tastyfurniture.registry;

import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.goldfish.goldfishmod02tastyfurniture.block.applefurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.beeffurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.beetrootfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.brown_mushroomfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.carrotfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.chickenfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.chorusfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.codfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.foodlamp;
import com.goldfish.goldfishmod02tastyfurniture.block.foodpathtypeminislab;
import com.goldfish.goldfishmod02tastyfurniture.block.foodtable;
import com.goldfish.goldfishmod02tastyfurniture.block.glowberryfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.horizontal_food_block;
import com.goldfish.goldfishmod02tastyfurniture.block.melonfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.muttonfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.porkfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.potatofurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.pumpkinfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.rabbitfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.red_mushroomfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.salmonfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.sweet_berryfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.tropical_fishfurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.applefurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.beeffurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.beetrootfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.brown_mushroomfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.carrotfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.chickenfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.chorusfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.codfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsign;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsign.foodstandingsign;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsignentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodwallsign;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.glowberryfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.melonfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.muttonfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.porkfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.potato_sign_entity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.potatofurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.pumpkinfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.rabbitfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.red_mushroomfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.salmonfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.sweet_berryfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.tropical_fishfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;
import com.google.common.base.Supplier;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
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
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.RedstoneWallTorchBlock;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import net.minecraft.world.level.block.entity.vault.*;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

import net.neoforged.fml.ModList;
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

 //------------------------------------------------------------------------------------Regular Blocks-------------------------------------------------------------------------------------------
  //.........apple
    public static final DeferredHolder<Block, Block> APPLE_BLOCK = FOODBLOCK.register("apple_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........potato
    public static final DeferredHolder<Block, Block> POTATO_BLOCK = FOODBLOCK.register("potato_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........beetroot
    public static final DeferredHolder<Block, Block> BEETROOT_BLOCK = FOODBLOCK.register("beetroot_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........carrot
    public static final DeferredHolder<Block, Block> CARROT_BLOCK = FOODBLOCK.register("carrot_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........chorus
    public static final DeferredHolder<Block, Block> CHORUS_BLOCK = FOODBLOCK.register("chorus_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........glow_berry
    public static final DeferredHolder<Block, Block> GLOW_BERRY_BLOCK = FOODBLOCK.register("glow_berry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.5f)
         .explosionResistance(10.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 15)
         ));
  //.........melon
    public static final DeferredHolder<Block, Block> MELON_BLOCK = FOODBLOCK.register("melon_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(1.5f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........sweet_berry
    public static final DeferredHolder<Block, Block> SWEET_BERRY_BLOCK = FOODBLOCK.register("sweet_berry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(1.5f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........brown_mushroom
    public static final DeferredHolder<Block, Block> BROWN_MUSHROOM_BLOCK = FOODBLOCK.register("brown_mushroom_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(1.75f)
         .explosionResistance(9.75f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........red_mushroom
    public static final DeferredHolder<Block, Block> RED_MUSHROOM_BLOCK = FOODBLOCK.register("red_mushroom_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(1.75f)
         .explosionResistance(9.75f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........pumpkin
    public static final DeferredHolder<Block, Block> PUMPKIN_BLOCK = FOODBLOCK.register("pumpkin_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(3.25f)
         .explosionResistance(11.5f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 0)
         ));
  //.........chicken
    public static final DeferredHolder<Block, Block> CHICKEN_BLOCK = FOODBLOCK.register("chicken_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
  //.........cod
    public static final DeferredHolder<Block, Block> COD_BLOCK = FOODBLOCK.register("cod_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
  //.........salmon
    public static final DeferredHolder<Block, Block> SALMON_BLOCK = FOODBLOCK.register("salmon_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
  //.........tropical_fish
    public static final DeferredHolder<Block, Block> TROPICAL_FISH_BLOCK = FOODBLOCK.register("tropical_fish_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
  //.........mutton
    public static final DeferredHolder<Block, Block> MUTTON_BLOCK = FOODBLOCK.register("mutton_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
  //.........beef
    public static final DeferredHolder<Block, Block> BEEF_BLOCK = FOODBLOCK.register("beef_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
  //.........pork
    public static final DeferredHolder<Block, Block> PORK_BLOCK = FOODBLOCK.register("pork_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));
  //.........rabbit
    public static final DeferredHolder<Block, Block> RABBIT_BLOCK = FOODBLOCK.register("rabbit_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD)
         .lightLevel(state -> 0)
         ));

 //-------------------------------------------------------------------------------------Brick Blocks--------------------------------------------------------------------------------------------
  //.........apple
    public static final DeferredHolder<Block, Block> APPLE_BRICKS_BLOCK = FOODBLOCK.register("apple_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........potato
    public static final DeferredHolder<Block, Block> POTATO_BRICKS_BLOCK = FOODBLOCK.register("potato_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........beetroot
    public static final DeferredHolder<Block, Block> BEETROOT_BRICKS_BLOCK = FOODBLOCK.register("beetroot_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........carrot
    public static final DeferredHolder<Block, Block> CARROT_BRICKS_BLOCK = FOODBLOCK.register("carrot_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chorus
    public static final DeferredHolder<Block, Block> CHORUS_BRICKS_BLOCK = FOODBLOCK.register("chorus_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........glow_berry
    public static final DeferredHolder<Block, Block> GLOW_BERRY_BRICKS_BLOCK = FOODBLOCK.register("glow_berry_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 15)
         ));
  //.........melon
    public static final DeferredHolder<Block, Block> MELON_BRICKS_BLOCK = FOODBLOCK.register("melon_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........sweet_berry
    public static final DeferredHolder<Block, Block> SWEET_BERRY_BRICKS_BLOCK = FOODBLOCK.register("sweet_berry_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........brown_mushroom
    public static final DeferredHolder<Block, Block> BROWN_MUSHROOM_BRICKS_BLOCK = FOODBLOCK.register("brown_mushroom_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........red_mushroom
    public static final DeferredHolder<Block, Block> RED_MUSHROOM_BRICKS_BLOCK = FOODBLOCK.register("red_mushroom_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........pumpkin
    public static final DeferredHolder<Block, Block> PUMPKIN_BRICKS_BLOCK = FOODBLOCK.register("pumpkin_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chicken
    public static final DeferredHolder<Block, Block> CHICKEN_BRICKS_BLOCK = FOODBLOCK.register("chicken_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........cod
    public static final DeferredHolder<Block, Block> COD_BRICKS_BLOCK = FOODBLOCK.register("cod_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........salmon
    public static final DeferredHolder<Block, Block> SALMON_BRICKS_BLOCK = FOODBLOCK.register("salmon_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tropical_fish
    public static final DeferredHolder<Block, Block> TROPICAL_FISH_BRICKS_BLOCK = FOODBLOCK.register("tropical_fish_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........mutton
    public static final DeferredHolder<Block, Block> MUTTON_BRICKS_BLOCK = FOODBLOCK.register("mutton_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........beef
    public static final DeferredHolder<Block, Block> BEEF_BRICKS_BLOCK = FOODBLOCK.register("beef_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........pork
    public static final DeferredHolder<Block, Block> PORK_BRICKS_BLOCK = FOODBLOCK.register("pork_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........rabbit
    public static final DeferredHolder<Block, Block> RABBIT_BRICKS_BLOCK = FOODBLOCK.register("rabbit_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));

 //-----------------------------------------------------------------------------------Chiseled Blocks-------------------------------------------------------------------------------------------
  //.........apple
    public static final DeferredHolder<Block, Block> APPLE_CHISELED_BLOCK = FOODBLOCK.register("apple_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........potato
    public static final DeferredHolder<Block, Block> POTATO_CHISELED_BLOCK = FOODBLOCK.register("potato_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........beetroot
    public static final DeferredHolder<Block, Block> BEETROOT_CHISELED_BLOCK = FOODBLOCK.register("beetroot_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........carrot
    public static final DeferredHolder<Block, Block> CARROT_CHISELED_BLOCK = FOODBLOCK.register("carrot_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chorus
    public static final DeferredHolder<Block, Block> CHORUS_CHISELED_BLOCK = FOODBLOCK.register("chorus_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........glow_berry
    public static final DeferredHolder<Block, Block> GLOW_BERRY_CHISELED_BLOCK = FOODBLOCK.register("glow_berry_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 15)
         ));
  //.........melon
    public static final DeferredHolder<Block, Block> MELON_CHISELED_BLOCK = FOODBLOCK.register("melon_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........sweet_berry
    public static final DeferredHolder<Block, Block> SWEET_BERRY_CHISELED_BLOCK = FOODBLOCK.register("sweet_berry_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........brown_mushroom
    public static final DeferredHolder<Block, Block> BROWN_MUSHROOM_CHISELED_BLOCK = FOODBLOCK.register("brown_mushroom_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........red_mushroom
    public static final DeferredHolder<Block, Block> RED_MUSHROOM_CHISELED_BLOCK = FOODBLOCK.register("red_mushroom_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........pumpkin
    public static final DeferredHolder<Block, Block> PUMPKIN_CHISELED_BLOCK = FOODBLOCK.register("pumpkin_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chicken
    public static final DeferredHolder<Block, Block> CHICKEN_CHISELED_BLOCK = FOODBLOCK.register("chicken_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........cod
    public static final DeferredHolder<Block, Block> COD_CHISELED_BLOCK = FOODBLOCK.register("cod_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........salmon
    public static final DeferredHolder<Block, Block> SALMON_CHISELED_BLOCK = FOODBLOCK.register("salmon_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tropical_fish
    public static final DeferredHolder<Block, Block> TROPICAL_FISH_CHISELED_BLOCK = FOODBLOCK.register("tropical_fish_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........mutton
    public static final DeferredHolder<Block, Block> MUTTON_CHISELED_BLOCK = FOODBLOCK.register("mutton_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........beef
    public static final DeferredHolder<Block, Block> BEEF_CHISELED_BLOCK = FOODBLOCK.register("beef_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........pork
    public static final DeferredHolder<Block, Block> PORK_CHISELED_BLOCK = FOODBLOCK.register("pork_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........rabbit
    public static final DeferredHolder<Block, Block> RABBIT_CHISELED_BLOCK = FOODBLOCK.register("rabbit_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //-------------------------------------------------------------------------------------Tile Blocks---------------------------------------------------------------------------------------------
  //.........apple
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> APPLE_TILE_BLOCK = FOODBLOCK.register("apple_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........potato
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> POTATO_TILE_BLOCK = FOODBLOCK.register("potato_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........beetroot
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BEETROOT_TILE_BLOCK = FOODBLOCK.register("beetroot_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........carrot
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CARROT_TILE_BLOCK = FOODBLOCK.register("carrot_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chorus
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CHORUS_TILE_BLOCK = FOODBLOCK.register("chorus_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........glow_berry
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> GLOW_BERRY_TILE_BLOCK = FOODBLOCK.register("glow_berry_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         .lightLevel(state -> 10)
         ));
  //.........melon
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> MELON_TILE_BLOCK = FOODBLOCK.register("melon_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........sweet_berry
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> SWEET_BERRY_TILE_BLOCK = FOODBLOCK.register("sweet_berry_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........brown_mushroom
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BROWN_MUSHROOM_TILE_BLOCK = FOODBLOCK.register("brown_mushroom_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........red_mushroom
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> RED_MUSHROOM_TILE_BLOCK = FOODBLOCK.register("red_mushroom_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........pumpkin
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> PUMPKIN_TILE_BLOCK = FOODBLOCK.register("pumpkin_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chicken
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CHICKEN_TILE_BLOCK = FOODBLOCK.register("chicken_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........cod
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> COD_TILE_BLOCK = FOODBLOCK.register("cod_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........salmon
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> SALMON_TILE_BLOCK = FOODBLOCK.register("salmon_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tropical_fish
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> TROPICAL_FISH_TILE_BLOCK = FOODBLOCK.register("tropical_fish_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........mutton
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> MUTTON_TILE_BLOCK = FOODBLOCK.register("mutton_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........beef
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BEEF_TILE_BLOCK = FOODBLOCK.register("beef_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........pork
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> PORK_TILE_BLOCK = FOODBLOCK.register("pork_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........rabbit
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> RABBIT_TILE_BLOCK = FOODBLOCK.register("rabbit_tile_block", () -> new horizontal_food_block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));

//==============================================================================================================================================================================================
//                                                                                          Doors
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
         //WoodType.OAK
         foodmaterialtyperegistry.APPLEWOODMAT
   ));
   public static final DeferredHolder<Block, foodwallsign> APPLE_WALL_SIGN = FOODBLOCK.register("apple_wall_sign",
   () -> new foodwallsign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       //WoodType.OAK
       foodmaterialtyperegistry.APPLEWOODMAT
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
       //WoodType.OAK
       foodmaterialtyperegistry.APPLEWOODMAT
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
   public static final DeferredHolder<Block, foodsign> POTATO_SIGN = FOODBLOCK.register("potato_sign",
   () -> new foodsign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         //WoodType.OAK
         foodmaterialtyperegistry.POTATOWOODMAT
   ));
   public static final DeferredHolder<Block, foodwallsign> POTATO_WALL_SIGN = FOODBLOCK.register("potato_wall_sign",
   () -> new foodwallsign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       //WoodType.OAK
       foodmaterialtyperegistry.POTATOWOODMAT
   ));
   public static final DeferredHolder<Block, foodstandingsign> POTATO_STANDING_SIGN = FOODBLOCK.register("potato_standing_sign",
   () -> new foodsign.foodstandingsign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       //WoodType.OAK
       foodmaterialtyperegistry.POTATOWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<potato_sign_entity>> POTATO_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "potato_sign_entity",
     () -> BlockEntityType.Builder.of(
         potato_sign_entity::new,
         foodblockregistry.POTATO_SIGN.get(),
         foodblockregistry.POTATO_WALL_SIGN.get(),
         foodblockregistry.POTATO_STANDING_SIGN.get()
     ).build(null)
 );

//==============================================================================================================================================================================================
//                                                                                          Slabs
//==============================================================================================================================================================================================

 //-------------------------------------------------------------------------------------Regular Slabs-------------------------------------------------------------------------------------------
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

 //-------------------------------------------------------------------------------------Brick Slabs--------------------------------------------------------------------------------------------
   //.........apple
     public static final DeferredHolder<Block, SlabBlock> APPLE_BRICKS_SLAB = FOODBLOCK.register("apple_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........potato
     public static final DeferredHolder<Block, SlabBlock> POTATO_BRICKS_SLAB = FOODBLOCK.register("potato_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........beetroot
     public static final DeferredHolder<Block, SlabBlock> BEETROOT_BRICKS_SLAB = FOODBLOCK.register("beetroot_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........carrot
     public static final DeferredHolder<Block, SlabBlock> CARROT_BRICKS_SLAB = FOODBLOCK.register("carrot_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........chorus
     public static final DeferredHolder<Block, SlabBlock> CHORUS_BRICKS_SLAB = FOODBLOCK.register("chorus_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........glow_berry
     public static final DeferredHolder<Block, SlabBlock> GLOW_BERRY_BRICKS_SLAB = FOODBLOCK.register("glow_berry_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     .lightLevel(state -> 15)
     ));
   //.........melon
     public static final DeferredHolder<Block, SlabBlock> MELON_BRICKS_SLAB = FOODBLOCK.register("melon_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........sweet_berry
     public static final DeferredHolder<Block, SlabBlock> SWEET_BERRY_BRICKS_SLAB = FOODBLOCK.register("sweet_berry_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........brown_mushroom
     public static final DeferredHolder<Block, SlabBlock> BROWN_MUSHROOM_BRICKS_SLAB = FOODBLOCK.register("brown_mushroom_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........red_mushroom
     public static final DeferredHolder<Block, SlabBlock> RED_MUSHROOM_BRICKS_SLAB = FOODBLOCK.register("red_mushroom_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........pumpkin
     public static final DeferredHolder<Block, SlabBlock> PUMPKIN_BRICKS_SLAB = FOODBLOCK.register("pumpkin_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........chicken
     public static final DeferredHolder<Block, SlabBlock> CHICKEN_BRICKS_SLAB = FOODBLOCK.register("chicken_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........cod
     public static final DeferredHolder<Block, SlabBlock> COD_BRICKS_SLAB = FOODBLOCK.register("cod_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........salmon
     public static final DeferredHolder<Block, SlabBlock> SALMON_BRICKS_SLAB = FOODBLOCK.register("salmon_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........tropical_fish
     public static final DeferredHolder<Block, SlabBlock> TROPICAL_FISH_BRICKS_SLAB = FOODBLOCK.register("tropical_fish_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........mutton
     public static final DeferredHolder<Block, SlabBlock> MUTTON_BRICKS_SLAB = FOODBLOCK.register("mutton_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........beef
     public static final DeferredHolder<Block, SlabBlock> BEEF_BRICKS_SLAB = FOODBLOCK.register("beef_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........pork
     public static final DeferredHolder<Block, SlabBlock> PORK_BRICKS_SLAB = FOODBLOCK.register("pork_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........rabbit
     public static final DeferredHolder<Block, SlabBlock> RABBIT_BRICKS_SLAB = FOODBLOCK.register("rabbit_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
     
     
//==============================================================================================================================================================================================
//                                                                                          Stairs
//==============================================================================================================================================================================================

 //-------------------------------------------------------------------------------------Regular Stairs------------------------------------------------------------------------------------------
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

 //-------------------------------------------------------------------------------------Bricks Stairs------------------------------------------------------------------------------------------
   //.........apple
   public static final DeferredHolder<Block, StairBlock> APPLE_BRICKS_STAIRS = FOODBLOCK.register("apple_bricks_stairs", () -> new StairBlock(
    APPLE_BLOCK.get().defaultBlockState(),
    BlockBehaviour.Properties.of()
    .destroyTime(1.75f)
    .explosionResistance(9.5f)
    .sound(SoundType.MUD_BRICKS)
   ));
  //.........potato
   public static final DeferredHolder<Block, StairBlock> POTATO_BRICKS_STAIRS = FOODBLOCK.register("potato_bricks_stairs", () -> new StairBlock(
      POTATO_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........beetroot
   public static final DeferredHolder<Block, StairBlock> BEETROOT_BRICKS_STAIRS = FOODBLOCK.register("beetroot_bricks_stairs", () -> new StairBlock(
      BEETROOT_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........carrot
   public static final DeferredHolder<Block, StairBlock> CARROT_BRICKS_STAIRS = FOODBLOCK.register("carrot_bricks_stairs", () -> new StairBlock(
      CARROT_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........chorus
   public static final DeferredHolder<Block, StairBlock> CHORUS_BRICKS_STAIRS = FOODBLOCK.register("chorus_bricks_stairs", () -> new StairBlock(
      CHORUS_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........glow_berry
   public static final DeferredHolder<Block, StairBlock> GLOW_BERRY_BRICKS_STAIRS = FOODBLOCK.register("glow_berry_bricks_stairs", () -> new StairBlock(
      GLOW_BERRY_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
      .lightLevel(state -> 15)
   ));
  //.........melon
   public static final DeferredHolder<Block, StairBlock> MELON_BRICKS_STAIRS = FOODBLOCK.register("melon_bricks_stairs", () -> new StairBlock(
      MELON_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........sweet_berry
   public static final DeferredHolder<Block, StairBlock> SWEET_BERRY_BRICKS_STAIRS = FOODBLOCK.register("sweet_berry_bricks_stairs", () -> new StairBlock(
      SWEET_BERRY_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........brown_mushroom
   public static final DeferredHolder<Block, StairBlock> BROWN_MUSHROOM_BRICKS_STAIRS = FOODBLOCK.register("brown_mushroom_bricks_stairs", () -> new StairBlock(
      BROWN_MUSHROOM_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........red_mushroom
   public static final DeferredHolder<Block, StairBlock> RED_MUSHROOM_BRICKS_STAIRS = FOODBLOCK.register("red_mushroom_bricks_stairs", () -> new StairBlock(
      RED_MUSHROOM_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........pumpkin
   public static final DeferredHolder<Block, StairBlock> PUMPKIN_BRICKS_STAIRS = FOODBLOCK.register("pumpkin_bricks_stairs", () -> new StairBlock(
      PUMPKIN_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........chicken
   public static final DeferredHolder<Block, StairBlock> CHICKEN_BRICKS_STAIRS = FOODBLOCK.register("chicken_bricks_stairs", () -> new StairBlock(
      CHICKEN_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........cod
   public static final DeferredHolder<Block, StairBlock> COD_BRICKS_STAIRS = FOODBLOCK.register("cod_bricks_stairs", () -> new StairBlock(
      COD_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........salmon
   public static final DeferredHolder<Block, StairBlock> SALMON_BRICKS_STAIRS = FOODBLOCK.register("salmon_bricks_stairs", () -> new StairBlock(
      SALMON_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........tropical_fish
   public static final DeferredHolder<Block, StairBlock> TROPICAL_FISH_BRICKS_STAIRS = FOODBLOCK.register("tropical_fish_bricks_stairs", () -> new StairBlock(
      TROPICAL_FISH_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........mutton
   public static final DeferredHolder<Block, StairBlock> MUTTON_BRICKS_STAIRS = FOODBLOCK.register("mutton_bricks_stairs", () -> new StairBlock(
      MUTTON_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........beef
   public static final DeferredHolder<Block, StairBlock> BEEF_BRICKS_STAIRS = FOODBLOCK.register("beef_bricks_stairs", () -> new StairBlock(
      BEEF_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........pork
   public static final DeferredHolder<Block, StairBlock> PORK_BRICKS_STAIRS = FOODBLOCK.register("pork_bricks_stairs", () -> new StairBlock(
      PORK_BLOCK.get().defaultBlockState(),
      BlockBehaviour.Properties.of()
      .destroyTime(1.75f)
      .explosionResistance(9.5f)
      .sound(SoundType.MUD_BRICKS)
   ));
  //.........rabbit
   public static final DeferredHolder<Block, StairBlock> RABBIT_BRICKS_STAIRS = FOODBLOCK.register("rabbit_bricks_stairs", () -> new StairBlock(
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
     public static final DeferredHolder<Block, TrapDoorBlock> POTATO_TRAPDOOR = FOODBLOCK.register("potato_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........beetroot
     public static final DeferredHolder<Block, TrapDoorBlock> BEETROOT_TRAPDOOR = FOODBLOCK.register("beetroot_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........carrot
     public static final DeferredHolder<Block, TrapDoorBlock> CARROT_TRAPDOOR = FOODBLOCK.register("carrot_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........chorus
     public static final DeferredHolder<Block, TrapDoorBlock> CHORUS_TRAPDOOR = FOODBLOCK.register("chorus_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........glow_berry
     public static final DeferredHolder<Block, TrapDoorBlock> GLOW_BERRY_TRAPDOOR = FOODBLOCK.register("glow_berry_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     .lightLevel(state -> 15)
     ));
   //.........melon
     public static final DeferredHolder<Block, TrapDoorBlock> MELON_TRAPDOOR = FOODBLOCK.register("melon_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........sweet_berry
     public static final DeferredHolder<Block, TrapDoorBlock> SWEET_BERRY_TRAPDOOR = FOODBLOCK.register("sweet_berry_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........brown_mushroom
     public static final DeferredHolder<Block, TrapDoorBlock> BROWN_MUSHROOM_TRAPDOOR = FOODBLOCK.register("brown_mushroom_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........red_mushroom
     public static final DeferredHolder<Block, TrapDoorBlock> RED_MUSHROOM_TRAPDOOR = FOODBLOCK.register("red_mushroom_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........pumpkin
     public static final DeferredHolder<Block, TrapDoorBlock> PUMPKIN_TRAPDOOR = FOODBLOCK.register("pumpkin_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........chicken
     public static final DeferredHolder<Block, TrapDoorBlock> CHICKEN_TRAPDOOR = FOODBLOCK.register("chicken_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));   
   //.........cod
     public static final DeferredHolder<Block, TrapDoorBlock> COD_TRAPDOOR = FOODBLOCK.register("cod_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........salmon
     public static final DeferredHolder<Block, TrapDoorBlock> SALMON_TRAPDOOR = FOODBLOCK.register("salmon_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........tropical_fish
     public static final DeferredHolder<Block, TrapDoorBlock> TROPICAL_FISH_TRAPDOOR = FOODBLOCK.register("tropical_fish_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........mutton
     public static final DeferredHolder<Block, TrapDoorBlock> MUTTON_TRAPDOOR = FOODBLOCK.register("mutton_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........beef
     public static final DeferredHolder<Block, TrapDoorBlock> BEEF_TRAPDOOR = FOODBLOCK.register("beef_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........pork
     public static final DeferredHolder<Block, TrapDoorBlock> PORK_TRAPDOOR = FOODBLOCK.register("pork_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
   //.........rabbit
     public static final DeferredHolder<Block, TrapDoorBlock> RABBIT_TRAPDOOR = FOODBLOCK.register("rabbit_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.MEAT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
//==============================================================================================================================================================================================
//                                                                                           Bars
//==============================================================================================================================================================================================

   //.........apple
     public static final DeferredHolder<Block, IronBarsBlock> APPLE_BARS = FOODBLOCK.register("apple_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........potato
     public static final DeferredHolder<Block, IronBarsBlock> POTATO_BARS = FOODBLOCK.register("potato_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........beetroot
     public static final DeferredHolder<Block, IronBarsBlock> BEETROOT_BARS = FOODBLOCK.register("beetroot_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........carrot
     public static final DeferredHolder<Block, IronBarsBlock> CARROT_BARS = FOODBLOCK.register("carrot_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........chorus
     public static final DeferredHolder<Block, IronBarsBlock> CHORUS_BARS = FOODBLOCK.register("chorus_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........glow_berry
     public static final DeferredHolder<Block, IronBarsBlock> GLOW_BERRY_BARS = FOODBLOCK.register("glow_berry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........melon
     public static final DeferredHolder<Block, IronBarsBlock> MELON_BARS = FOODBLOCK.register("melon_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........sweet_berry
     public static final DeferredHolder<Block, IronBarsBlock> SWEET_BERRY_BARS = FOODBLOCK.register("sweet_berry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........brown_mushroom
     public static final DeferredHolder<Block, IronBarsBlock> BROWN_MUSHROOM_BARS = FOODBLOCK.register("brown_mushroom_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........red_mushroom
     public static final DeferredHolder<Block, IronBarsBlock> RED_MUSHROOM_BARS = FOODBLOCK.register("red_mushroom_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........pumpkin
     public static final DeferredHolder<Block, IronBarsBlock> PUMPKIN_BARS = FOODBLOCK.register("pumpkin_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.CROP).noOcclusion()));
   //.........chicken
     public static final DeferredHolder<Block, IronBarsBlock> CHICKEN_BARS = FOODBLOCK.register("chicken_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.MUD_BRICKS).noOcclusion()));
   //.........cod
     public static final DeferredHolder<Block, IronBarsBlock> COD_BARS = FOODBLOCK.register("cod_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.MUD_BRICKS).noOcclusion()));
   //.........salmon
     public static final DeferredHolder<Block, IronBarsBlock> SALMON_BARS = FOODBLOCK.register("salmon_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.MUD_BRICKS).noOcclusion()));
   //.........tropical_fish
     public static final DeferredHolder<Block, IronBarsBlock> TROPICAL_FISH_BARS = FOODBLOCK.register("tropical_fish_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.MUD_BRICKS).noOcclusion()));
   //.........mutton
     public static final DeferredHolder<Block, IronBarsBlock> MUTTON_BARS = FOODBLOCK.register("mutton_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.MUD_BRICKS).noOcclusion()));
   //.........beef
     public static final DeferredHolder<Block, IronBarsBlock> BEEF_BARS = FOODBLOCK.register("beef_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.MUD_BRICKS).noOcclusion()));
   //.........pork
     public static final DeferredHolder<Block, IronBarsBlock> PORK_BARS = FOODBLOCK.register("pork_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.MUD_BRICKS).noOcclusion()));
   //.........rabbit
     public static final DeferredHolder<Block, IronBarsBlock> RABBIT_BARS = FOODBLOCK.register("rabbit_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
     .strength(2.0F, 3.0F)
     .sound(SoundType.MUD_BRICKS).noOcclusion()));
//==============================================================================================================================================================================================
//                                                                                          Lamps
//==============================================================================================================================================================================================

   //.........apple
     public static final DeferredHolder<Block, Block> APPLE_LAMP = FOODBLOCK.register("apple_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........potato
     public static final DeferredHolder<Block, Block> POTATO_LAMP = FOODBLOCK.register("potato_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........beetroot
     public static final DeferredHolder<Block, Block> BEETROOT_LAMP = FOODBLOCK.register("beetroot_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........carrot
     public static final DeferredHolder<Block, Block> CARROT_LAMP = FOODBLOCK.register("carrot_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........chorus
     public static final DeferredHolder<Block, HorizontalDirectionalBlock> CHORUS_LAMP = FOODBLOCK.register("chorus_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........glow_berry
     public static final DeferredHolder<Block, Block> GLOW_BERRY_LAMP = FOODBLOCK.register("glow_berry_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........melon
     public static final DeferredHolder<Block, Block> MELON_LAMP = FOODBLOCK.register("melon_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........sweet_berry
     public static final DeferredHolder<Block, Block> SWEET_BERRY_LAMP = FOODBLOCK.register("sweet_berry_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........brown_mushroom
     public static final DeferredHolder<Block, Block> BROWN_MUSHROOM_LAMP = FOODBLOCK.register("brown_mushroom_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........red_mushroom
     public static final DeferredHolder<Block, Block> RED_MUSHROOM_LAMP = FOODBLOCK.register("red_mushroom_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........pumpkin
     public static final DeferredHolder<Block, HorizontalDirectionalBlock> PUMPKIN_LAMP = FOODBLOCK.register("pumpkin_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........chicken
     public static final DeferredHolder<Block, Block> CHICKEN_LAMP = FOODBLOCK.register("chicken_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........cod
     public static final DeferredHolder<Block, HorizontalDirectionalBlock> COD_LAMP = FOODBLOCK.register("cod_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........salmon
     public static final DeferredHolder<Block, Block> SALMON_LAMP = FOODBLOCK.register("salmon_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........tropical_fish
     public static final DeferredHolder<Block, HorizontalDirectionalBlock> TROPICAL_FISH_LAMP = FOODBLOCK.register("tropical_fish_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........mutton
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> MUTTON_LAMP = FOODBLOCK.register("mutton_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........beef
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BEEF_LAMP = FOODBLOCK.register("beef_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........pork
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> PORK_LAMP = FOODBLOCK.register("pork_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
   //.........rabbit
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> RABBIT_LAMP = FOODBLOCK.register("rabbit_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));

//==============================================================================================================================================================================================
//                                                                                         Carpets
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Block, CarpetBlock> APPLE_CARPET = FOODBLOCK.register("apple_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........potato
    public static final DeferredHolder<Block, CarpetBlock> POTATO_CARPET = FOODBLOCK.register("potato_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........beetroot
    public static final DeferredHolder<Block, CarpetBlock> BEETROOT_CARPET = FOODBLOCK.register("beetroot_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........carrot
    public static final DeferredHolder<Block, CarpetBlock> CARROT_CARPET = FOODBLOCK.register("carrot_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........chorus
    public static final DeferredHolder<Block, CarpetBlock> CHORUS_CARPET = FOODBLOCK.register("chorus_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........glow_berry
    public static final DeferredHolder<Block, CarpetBlock> GLOW_BERRY_CARPET = FOODBLOCK.register("glow_berry_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      .lightLevel(state -> 10)
      ));
   //.........melon
    public static final DeferredHolder<Block, CarpetBlock> MELON_CARPET = FOODBLOCK.register("melon_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........sweet_berry
    public static final DeferredHolder<Block, CarpetBlock> SWEET_BERRY_CARPET = FOODBLOCK.register("sweet_berry_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........brown_mushroom
    public static final DeferredHolder<Block, CarpetBlock> BROWN_MUSHROOM_CARPET = FOODBLOCK.register("brown_mushroom_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........red_mushroom
    public static final DeferredHolder<Block, CarpetBlock> RED_MUSHROOM_CARPET = FOODBLOCK.register("red_mushroom_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........pumpkin
    public static final DeferredHolder<Block, CarpetBlock> PUMPKIN_CARPET = FOODBLOCK.register("pumpkin_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........chicken
    public static final DeferredHolder<Block, CarpetBlock> CHICKEN_CARPET = FOODBLOCK.register("chicken_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........cod
    public static final DeferredHolder<Block, CarpetBlock> COD_CARPET = FOODBLOCK.register("cod_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........salmon
    public static final DeferredHolder<Block, CarpetBlock> SALMON_CARPET = FOODBLOCK.register("salmon_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........tropical_fish
    public static final DeferredHolder<Block, CarpetBlock> TROPICAL_FISH_CARPET = FOODBLOCK.register("tropical_fish_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........mutton
    public static final DeferredHolder<Block, CarpetBlock> MUTTON_CARPET = FOODBLOCK.register("mutton_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........beef
    public static final DeferredHolder<Block, CarpetBlock> BEEF_CARPET = FOODBLOCK.register("beef_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........pork
    public static final DeferredHolder<Block, CarpetBlock> PORK_CARPET = FOODBLOCK.register("pork_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
   //.........rabbit
    public static final DeferredHolder<Block, CarpetBlock> RABBIT_CARPET = FOODBLOCK.register("rabbit_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
//==============================================================================================================================================================================================
//                                                                                         Lanterns
//==============================================================================================================================================================================================

   //.........apple
    //regular
      public static final DeferredHolder<Block, LanternBlock> APPLE_LANTERN = FOODBLOCK.register("apple_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> APPLE_SOUL_LANTERN = FOODBLOCK.register("apple_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........potato
    //regular
      public static final DeferredHolder<Block, LanternBlock> POTATO_LANTERN = FOODBLOCK.register("potato_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> POTATO_SOUL_LANTERN = FOODBLOCK.register("potato_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........beetroot
    //regular
      public static final DeferredHolder<Block, LanternBlock> BEETROOT_LANTERN = FOODBLOCK.register("beetroot_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> BEETROOT_SOUL_LANTERN = FOODBLOCK.register("beetroot_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........carrot
    //regular
      public static final DeferredHolder<Block, LanternBlock> CARROT_LANTERN = FOODBLOCK.register("carrot_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> CARROT_SOUL_LANTERN = FOODBLOCK.register("carrot_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........chorus
    //regular
      public static final DeferredHolder<Block, LanternBlock> CHORUS_LANTERN = FOODBLOCK.register("chorus_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> CHORUS_SOUL_LANTERN = FOODBLOCK.register("chorus_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........glow_berry
    //regular
      public static final DeferredHolder<Block, LanternBlock> GLOW_BERRY_LANTERN = FOODBLOCK.register("glow_berry_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> GLOW_BERRY_SOUL_LANTERN = FOODBLOCK.register("glow_berry_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........melon
    //regular
      public static final DeferredHolder<Block, LanternBlock> MELON_LANTERN = FOODBLOCK.register("melon_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> MELON_SOUL_LANTERN = FOODBLOCK.register("melon_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........sweet_berry
    //regular
      public static final DeferredHolder<Block, LanternBlock> SWEET_BERRY_LANTERN = FOODBLOCK.register("sweet_berry_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> SWEET_BERRY_SOUL_LANTERN = FOODBLOCK.register("sweet_berry_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........brown_mushroom
    //regular
      public static final DeferredHolder<Block, LanternBlock> BROWN_MUSHROOM_LANTERN = FOODBLOCK.register("brown_mushroom_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> BROWN_MUSHROOM_SOUL_LANTERN = FOODBLOCK.register("brown_mushroom_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........red_mushroom
    //regular
      public static final DeferredHolder<Block, LanternBlock> RED_MUSHROOM_LANTERN = FOODBLOCK.register("red_mushroom_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> RED_MUSHROOM_SOUL_LANTERN = FOODBLOCK.register("red_mushroom_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........pumpkin
    //regular
      public static final DeferredHolder<Block, LanternBlock> PUMPKIN_LANTERN = FOODBLOCK.register("pumpkin_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> PUMPKIN_SOUL_LANTERN = FOODBLOCK.register("pumpkin_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........chicken
    //regular
      public static final DeferredHolder<Block, LanternBlock> CHICKEN_LANTERN = FOODBLOCK.register("chicken_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> CHICKEN_SOUL_LANTERN = FOODBLOCK.register("chicken_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........cod
    //regular
      public static final DeferredHolder<Block, LanternBlock> COD_LANTERN = FOODBLOCK.register("cod_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> COD_SOUL_LANTERN = FOODBLOCK.register("cod_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........salmon
    //regular
      public static final DeferredHolder<Block, LanternBlock> SALMON_LANTERN = FOODBLOCK.register("salmon_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> SALMON_SOUL_LANTERN = FOODBLOCK.register("salmon_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........tropical_fish
    //regular
      public static final DeferredHolder<Block, LanternBlock> TROPICAL_FISH_LANTERN = FOODBLOCK.register("tropical_fish_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> TROPICAL_FISH_SOUL_LANTERN = FOODBLOCK.register("tropical_fish_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........mutton
    //regular
      public static final DeferredHolder<Block, LanternBlock> MUTTON_LANTERN = FOODBLOCK.register("mutton_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> MUTTON_SOUL_LANTERN = FOODBLOCK.register("mutton_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........beef
    //regular
      public static final DeferredHolder<Block, LanternBlock> BEEF_LANTERN = FOODBLOCK.register("beef_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> BEEF_SOUL_LANTERN = FOODBLOCK.register("beef_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........pork
    //regular
      public static final DeferredHolder<Block, LanternBlock> PORK_LANTERN = FOODBLOCK.register("pork_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> PORK_SOUL_LANTERN = FOODBLOCK.register("pork_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
   //.........rabbit
    //regular
      public static final DeferredHolder<Block, LanternBlock> RABBIT_LANTERN = FOODBLOCK.register("rabbit_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> RABBIT_SOUL_LANTERN = FOODBLOCK.register("rabbit_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MUD)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
//==============================================================================================================================================================================================
//                                                                                         Chains
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Block, ChainBlock> APPLE_CHAIN = FOODBLOCK.register("apple_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........potato
    public static final DeferredHolder<Block, ChainBlock> POTATO_CHAIN = FOODBLOCK.register("potato_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........beetroot
    public static final DeferredHolder<Block, ChainBlock> BEETROOT_CHAIN = FOODBLOCK.register("beetroot_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........carrot
    public static final DeferredHolder<Block, ChainBlock> CARROT_CHAIN = FOODBLOCK.register("carrot_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........chorus
    public static final DeferredHolder<Block, ChainBlock> CHORUS_CHAIN = FOODBLOCK.register("chorus_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........glow_berry
    public static final DeferredHolder<Block, ChainBlock> GLOW_BERRY_CHAIN = FOODBLOCK.register("glow_berry_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    .lightLevel(state  -> 5)
    ));

   //.........melon
    public static final DeferredHolder<Block, ChainBlock> MELON_CHAIN = FOODBLOCK.register("melon_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........sweet_berry
    public static final DeferredHolder<Block, ChainBlock> SWEET_BERRY_CHAIN = FOODBLOCK.register("sweet_berry_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........brown_mushroom
    public static final DeferredHolder<Block, ChainBlock> BROWN_MUSHROOM_CHAIN = FOODBLOCK.register("brown_mushroom_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........red_mushroom
    public static final DeferredHolder<Block, ChainBlock> RED_MUSHROOM_CHAIN = FOODBLOCK.register("red_mushroom_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........pumpkin
    public static final DeferredHolder<Block, ChainBlock> PUMPKIN_CHAIN = FOODBLOCK.register("pumpkin_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........chicken
    public static final DeferredHolder<Block, ChainBlock> CHICKEN_CHAIN = FOODBLOCK.register("chicken_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........cod
    public static final DeferredHolder<Block, ChainBlock> COD_CHAIN = FOODBLOCK.register("cod_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........salmon
    public static final DeferredHolder<Block, ChainBlock> SALMON_CHAIN = FOODBLOCK.register("salmon_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........tropical_fish
    public static final DeferredHolder<Block, ChainBlock> TROPICAL_FISH_CHAIN = FOODBLOCK.register("tropical_fish_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........mutton
    public static final DeferredHolder<Block, ChainBlock> MUTTON_CHAIN = FOODBLOCK.register("mutton_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........beef
    public static final DeferredHolder<Block, ChainBlock> BEEF_CHAIN = FOODBLOCK.register("beef_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........pork
    public static final DeferredHolder<Block, ChainBlock> PORK_CHAIN = FOODBLOCK.register("pork_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));

   //.........rabbit
    public static final DeferredHolder<Block, ChainBlock> RABBIT_CHAIN = FOODBLOCK.register("rabbit_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
//==============================================================================================================================================================================================
//                                                                                         Tables
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Block, Block> APPLE_TABLE = FOODBLOCK.register("apple_table", () -> new Block(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........potato
    public static final DeferredHolder<Block, Block> POTATO_TABLE = FOODBLOCK.register("potato_table", () -> new Block(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........beetroot
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BEETROOT_TABLE = FOODBLOCK.register("beetroot_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........carrot
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CARROT_TABLE = FOODBLOCK.register("carrot_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........chorus
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CHORUS_TABLE = FOODBLOCK.register("chorus_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........glow_berry
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> GLOW_BERRY_TABLE = FOODBLOCK.register("glow_berry_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    .lightLevel(state  -> 7)
    ));
   //.........melon
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> MELON_TABLE = FOODBLOCK.register("melon_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........sweet_berry
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> SWEET_BERRY_TABLE = FOODBLOCK.register("sweet_berry_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........brown_mushroom
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BROWN_MUSHROOM_TABLE = FOODBLOCK.register("brown_mushroom_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    .lightLevel(state  -> 3)
    ));
   //.........red_mushroom
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> RED_MUSHROOM_TABLE = FOODBLOCK.register("red_mushroom_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........pumpkin
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> PUMPKIN_TABLE = FOODBLOCK.register("pumpkin_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    .lightLevel(state  -> 6)
    ));
   //.........chicken
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CHICKEN_TABLE = FOODBLOCK.register("chicken_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........cod
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> COD_TABLE = FOODBLOCK.register("cod_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........salmon
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> SALMON_TABLE = FOODBLOCK.register("salmon_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........tropical_fish
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> TROPICAL_FISH_TABLE = FOODBLOCK.register("tropical_fish_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........mutton
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> MUTTON_TABLE = FOODBLOCK.register("mutton_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........beef
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BEEF_TABLE = FOODBLOCK.register("beef_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........pork
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> PORK_TABLE = FOODBLOCK.register("pork_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........rabbit
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> RABBIT_TABLE = FOODBLOCK.register("rabbit_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));

//==============================================================================================================================================================================================
//                                                                                         Ladders
//==============================================================================================================================================================================================
  static float ladder_destroy_time = 0.75f;
  static float ladder_explosion_resistance = 0.75f;
  static SoundType plant_ladder_sound = SoundType.VINE;
  static SoundType meat_ladder_sound = SoundType.MUD_BRICKS;

   //.........apple
    public static final DeferredHolder<Block, LadderBlock> APPLE_LADDER = FOODBLOCK.register("apple_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    )); 
   //.........potato
    public static final DeferredHolder<Block, LadderBlock> POTATO_LADDER = FOODBLOCK.register("potato_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    )); 
   //.........beetroot
    public static final DeferredHolder<Block, LadderBlock> BEETROOT_LADDER = FOODBLOCK.register("beetroot_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    )); 
   //.........carrot
    public static final DeferredHolder<Block, LadderBlock> CARROT_LADDER = FOODBLOCK.register("carrot_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    )); 
   //.........chorus
    public static final DeferredHolder<Block, LadderBlock> CHORUS_LADDER = FOODBLOCK.register("chorus_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    )); 
   //.........glow_berry
    public static final DeferredHolder<Block, LadderBlock> GLOW_BERRY_LADDER = FOODBLOCK.register("glow_berry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    .lightLevel(state  -> 8)
    )); 
   //.........melon
    public static final DeferredHolder<Block, LadderBlock> MELON_LADDER = FOODBLOCK.register("melon_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    )); 
   //.........sweet_berry
    public static final DeferredHolder<Block, LadderBlock> SWEET_BERRY_LADDER = FOODBLOCK.register("sweet_berry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    .lightLevel(state  -> 4)
    )); 
   //.........brown_mushroom
    public static final DeferredHolder<Block, LadderBlock> BROWN_MUSHROOM_LADDER = FOODBLOCK.register("brown_mushroom_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    )); 
   //.........red_mushroom
    public static final DeferredHolder<Block, LadderBlock> RED_MUSHROOM_LADDER = FOODBLOCK.register("red_mushroom_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    )); 
   //.........pumpkin
    public static final DeferredHolder<Block, LadderBlock> PUMPKIN_LADDER = FOODBLOCK.register("pumpkin_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
    )); 
   //.........chicken
    public static final DeferredHolder<Block, LadderBlock> CHICKEN_LADDER = FOODBLOCK.register("chicken_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(meat_ladder_sound)
    .noOcclusion()
    )); 
   //.........cod
    public static final DeferredHolder<Block, LadderBlock> COD_LADDER = FOODBLOCK.register("cod_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(meat_ladder_sound)
    .noOcclusion()
    )); 
   //.........salmon
    public static final DeferredHolder<Block, LadderBlock> SALMON_LADDER = FOODBLOCK.register("salmon_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(meat_ladder_sound)
    .noOcclusion()
    )); 
   //.........tropical_fish
    public static final DeferredHolder<Block, LadderBlock> TROPICAL_FISH_LADDER = FOODBLOCK.register("tropical_fish_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(meat_ladder_sound)
    .noOcclusion()
    )); 
   //.........mutton
    public static final DeferredHolder<Block, LadderBlock> MUTTON_LADDER = FOODBLOCK.register("mutton_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(meat_ladder_sound)
    .noOcclusion()
    )); 
   //.........beef
    public static final DeferredHolder<Block, LadderBlock> BEEF_LADDER = FOODBLOCK.register("beef_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(meat_ladder_sound)
    .noOcclusion()
    )); 
   //.........pork
    public static final DeferredHolder<Block, LadderBlock> PORK_LADDER = FOODBLOCK.register("pork_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(meat_ladder_sound)
    .noOcclusion()
    )); 
   //.........rabbit
    public static final DeferredHolder<Block, LadderBlock> RABBIT_LADDER = FOODBLOCK.register("rabbit_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(meat_ladder_sound)
    .noOcclusion()
    )); 
//==============================================================================================================================================================================================
//                                                                                         Torches
//==============================================================================================================================================================================================

   //.........apple
    //regular
     public static final DeferredHolder<Block, TorchBlock> APPLE_TORCH = FOODBLOCK.register("apple_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> APPLE_WALL_TORCH = FOODBLOCK.register("apple_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> APPLE_REDSTONE_TORCH = FOODBLOCK.register("apple_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> APPLE_REDSTONE_WALL_TORCH = FOODBLOCK.register("apple_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> APPLE_SOUL_TORCH = FOODBLOCK.register("apple_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> APPLE_SOUL_WALL_TORCH = FOODBLOCK.register("apple_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........potato
    //regular
     public static final DeferredHolder<Block, TorchBlock> POTATO_TORCH = FOODBLOCK.register("potato_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> POTATO_WALL_TORCH = FOODBLOCK.register("potato_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> POTATO_REDSTONE_TORCH = FOODBLOCK.register("potato_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> POTATO_REDSTONE_WALL_TORCH = FOODBLOCK.register("potato_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> POTATO_SOUL_TORCH = FOODBLOCK.register("potato_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> POTATO_SOUL_WALL_TORCH = FOODBLOCK.register("potato_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........beetroot
    //regular
     public static final DeferredHolder<Block, TorchBlock> BEETROOT_TORCH = FOODBLOCK.register("beetroot_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BEETROOT_WALL_TORCH = FOODBLOCK.register("beetroot_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> BEETROOT_REDSTONE_TORCH = FOODBLOCK.register("beetroot_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> BEETROOT_REDSTONE_WALL_TORCH = FOODBLOCK.register("beetroot_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> BEETROOT_SOUL_TORCH = FOODBLOCK.register("beetroot_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BEETROOT_SOUL_WALL_TORCH = FOODBLOCK.register("beetroot_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........carrot
    //regular
     public static final DeferredHolder<Block, TorchBlock> CARROT_TORCH = FOODBLOCK.register("carrot_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CARROT_WALL_TORCH = FOODBLOCK.register("carrot_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> CARROT_REDSTONE_TORCH = FOODBLOCK.register("carrot_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> CARROT_REDSTONE_WALL_TORCH = FOODBLOCK.register("carrot_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> CARROT_SOUL_TORCH = FOODBLOCK.register("carrot_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CARROT_SOUL_WALL_TORCH = FOODBLOCK.register("carrot_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........chorus
    //regular
     public static final DeferredHolder<Block, TorchBlock> CHORUS_TORCH = FOODBLOCK.register("chorus_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CHORUS_WALL_TORCH = FOODBLOCK.register("chorus_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> CHORUS_REDSTONE_TORCH = FOODBLOCK.register("chorus_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> CHORUS_REDSTONE_WALL_TORCH = FOODBLOCK.register("chorus_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> CHORUS_SOUL_TORCH = FOODBLOCK.register("chorus_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CHORUS_SOUL_WALL_TORCH = FOODBLOCK.register("chorus_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........glow_berry
    //regular
     public static final DeferredHolder<Block, TorchBlock> GLOW_BERRY_TORCH = FOODBLOCK.register("glow_berry_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> GLOW_BERRY_WALL_TORCH = FOODBLOCK.register("glow_berry_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> GLOW_BERRY_REDSTONE_TORCH = FOODBLOCK.register("glow_berry_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> GLOW_BERRY_REDSTONE_WALL_TORCH = FOODBLOCK.register("glow_berry_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> GLOW_BERRY_SOUL_TORCH = FOODBLOCK.register("glow_berry_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> GLOW_BERRY_SOUL_WALL_TORCH = FOODBLOCK.register("glow_berry_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........melon
    //regular
     public static final DeferredHolder<Block, TorchBlock> MELON_TORCH = FOODBLOCK.register("melon_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> MELON_WALL_TORCH = FOODBLOCK.register("melon_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> MELON_REDSTONE_TORCH = FOODBLOCK.register("melon_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> MELON_REDSTONE_WALL_TORCH = FOODBLOCK.register("melon_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> MELON_SOUL_TORCH = FOODBLOCK.register("melon_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> MELON_SOUL_WALL_TORCH = FOODBLOCK.register("melon_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........sweet_berry
    //regular
     public static final DeferredHolder<Block, TorchBlock> SWEET_BERRY_TORCH = FOODBLOCK.register("sweet_berry_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> SWEET_BERRY_WALL_TORCH = FOODBLOCK.register("sweet_berry_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> SWEET_BERRY_REDSTONE_TORCH = FOODBLOCK.register("sweet_berry_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> SWEET_BERRY_REDSTONE_WALL_TORCH = FOODBLOCK.register("sweet_berry_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> SWEET_BERRY_SOUL_TORCH = FOODBLOCK.register("sweet_berry_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> SWEET_BERRY_SOUL_WALL_TORCH = FOODBLOCK.register("sweet_berry_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........brown_mushroom
    //regular
     public static final DeferredHolder<Block, TorchBlock> BROWN_MUSHROOM_TORCH = FOODBLOCK.register("brown_mushroom_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BROWN_MUSHROOM_WALL_TORCH = FOODBLOCK.register("brown_mushroom_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> BROWN_MUSHROOM_REDSTONE_TORCH = FOODBLOCK.register("brown_mushroom_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> BROWN_MUSHROOM_REDSTONE_WALL_TORCH = FOODBLOCK.register("brown_mushroom_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> BROWN_MUSHROOM_SOUL_TORCH = FOODBLOCK.register("brown_mushroom_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BROWN_MUSHROOM_SOUL_WALL_TORCH = FOODBLOCK.register("brown_mushroom_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........red_mushroom
    //regular
     public static final DeferredHolder<Block, TorchBlock> RED_MUSHROOM_TORCH = FOODBLOCK.register("red_mushroom_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> RED_MUSHROOM_WALL_TORCH = FOODBLOCK.register("red_mushroom_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> RED_MUSHROOM_REDSTONE_TORCH = FOODBLOCK.register("red_mushroom_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> RED_MUSHROOM_REDSTONE_WALL_TORCH = FOODBLOCK.register("red_mushroom_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> RED_MUSHROOM_SOUL_TORCH = FOODBLOCK.register("red_mushroom_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> RED_MUSHROOM_SOUL_WALL_TORCH = FOODBLOCK.register("red_mushroom_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........pumpkin
    //regular
     public static final DeferredHolder<Block, TorchBlock> PUMPKIN_TORCH = FOODBLOCK.register("pumpkin_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> PUMPKIN_WALL_TORCH = FOODBLOCK.register("pumpkin_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> PUMPKIN_REDSTONE_TORCH = FOODBLOCK.register("pumpkin_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> PUMPKIN_REDSTONE_WALL_TORCH = FOODBLOCK.register("pumpkin_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> PUMPKIN_SOUL_TORCH = FOODBLOCK.register("pumpkin_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> PUMPKIN_SOUL_WALL_TORCH = FOODBLOCK.register("pumpkin_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........chicken
    //regular
     public static final DeferredHolder<Block, TorchBlock> CHICKEN_TORCH = FOODBLOCK.register("chicken_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CHICKEN_WALL_TORCH = FOODBLOCK.register("chicken_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> CHICKEN_REDSTONE_TORCH = FOODBLOCK.register("chicken_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> CHICKEN_REDSTONE_WALL_TORCH = FOODBLOCK.register("chicken_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> CHICKEN_SOUL_TORCH = FOODBLOCK.register("chicken_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CHICKEN_SOUL_WALL_TORCH = FOODBLOCK.register("chicken_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));

   //.........cod
    //regular
     public static final DeferredHolder<Block, TorchBlock> COD_TORCH = FOODBLOCK.register("cod_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> COD_WALL_TORCH = FOODBLOCK.register("cod_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> COD_REDSTONE_TORCH = FOODBLOCK.register("cod_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> COD_REDSTONE_WALL_TORCH = FOODBLOCK.register("cod_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> COD_SOUL_TORCH = FOODBLOCK.register("cod_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> COD_SOUL_WALL_TORCH = FOODBLOCK.register("cod_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
    
   //.........salmon
    //regular
     public static final DeferredHolder<Block, TorchBlock> SALMON_TORCH = FOODBLOCK.register("salmon_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> SALMON_WALL_TORCH = FOODBLOCK.register("salmon_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> SALMON_REDSTONE_TORCH = FOODBLOCK.register("salmon_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> SALMON_REDSTONE_WALL_TORCH = FOODBLOCK.register("salmon_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> SALMON_SOUL_TORCH = FOODBLOCK.register("salmon_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> SALMON_SOUL_WALL_TORCH = FOODBLOCK.register("salmon_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
    
   //.........tropical_fish
    //regular
     public static final DeferredHolder<Block, TorchBlock> TROPICAL_FISH_TORCH = FOODBLOCK.register("tropical_fish_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> TROPICAL_FISH_WALL_TORCH = FOODBLOCK.register("tropical_fish_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> TROPICAL_FISH_REDSTONE_TORCH = FOODBLOCK.register("tropical_fish_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> TROPICAL_FISH_REDSTONE_WALL_TORCH = FOODBLOCK.register("tropical_fish_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> TROPICAL_FISH_SOUL_TORCH = FOODBLOCK.register("tropical_fish_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> TROPICAL_FISH_SOUL_WALL_TORCH = FOODBLOCK.register("tropical_fish_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
    
   //.........mutton
    //regular
     public static final DeferredHolder<Block, TorchBlock> MUTTON_TORCH = FOODBLOCK.register("mutton_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> MUTTON_WALL_TORCH = FOODBLOCK.register("mutton_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> MUTTON_REDSTONE_TORCH = FOODBLOCK.register("mutton_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> MUTTON_REDSTONE_WALL_TORCH = FOODBLOCK.register("mutton_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> MUTTON_SOUL_TORCH = FOODBLOCK.register("mutton_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> MUTTON_SOUL_WALL_TORCH = FOODBLOCK.register("mutton_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
    
   //.........beef
    //regular
     public static final DeferredHolder<Block, TorchBlock> BEEF_TORCH = FOODBLOCK.register("beef_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BEEF_WALL_TORCH = FOODBLOCK.register("beef_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> BEEF_REDSTONE_TORCH = FOODBLOCK.register("beef_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> BEEF_REDSTONE_WALL_TORCH = FOODBLOCK.register("beef_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> BEEF_SOUL_TORCH = FOODBLOCK.register("beef_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BEEF_SOUL_WALL_TORCH = FOODBLOCK.register("beef_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
    
   //.........pork
    //regular
      public static final DeferredHolder<Block, TorchBlock> PORK_TORCH = FOODBLOCK.register("pork_torch", 
      () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

      public static final DeferredHolder<Block, WallTorchBlock> PORK_WALL_TORCH = FOODBLOCK.register("pork_wall_torch", 
      () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
      public static final DeferredHolder<Block, RedstoneTorchBlock> PORK_REDSTONE_TORCH = FOODBLOCK.register("pork_redstone_torch", 
      () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

      public static final DeferredHolder<Block, RedstoneWallTorchBlock> PORK_REDSTONE_WALL_TORCH = FOODBLOCK.register("pork_redstone_wall_torch", 
      () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
      public static final DeferredHolder<Block, TorchBlock> PORK_SOUL_TORCH = FOODBLOCK.register("pork_soul_torch", 
      () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

      public static final DeferredHolder<Block, WallTorchBlock> PORK_SOUL_WALL_TORCH = FOODBLOCK.register("pork_soul_wall_torch", 
      () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
   
   //.........rabbit
    //regular
    public static final DeferredHolder<Block, TorchBlock> RABBIT_TORCH = FOODBLOCK.register("rabbit_torch", 
    () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

    public static final DeferredHolder<Block, WallTorchBlock> RABBIT_WALL_TORCH = FOODBLOCK.register("rabbit_wall_torch", 
    () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
    public static final DeferredHolder<Block, RedstoneTorchBlock> RABBIT_REDSTONE_TORCH = FOODBLOCK.register("rabbit_redstone_torch", 
    () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

    public static final DeferredHolder<Block, RedstoneWallTorchBlock> RABBIT_REDSTONE_WALL_TORCH = FOODBLOCK.register("rabbit_redstone_wall_torch", 
    () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
    public static final DeferredHolder<Block, TorchBlock> RABBIT_SOUL_TORCH = FOODBLOCK.register("rabbit_soul_torch", 
    () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

    public static final DeferredHolder<Block, WallTorchBlock> RABBIT_SOUL_WALL_TORCH = FOODBLOCK.register("rabbit_soul_wall_torch", 
    () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
   
//==============================================================================================================================================================================================
//                                                                                         Furnaces
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Block, applefurnace> APPLE_FURNACE = FOODBLOCK.register("apple_furnace", () -> new applefurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<applefurnaceentity>> APPLE_FURNACE_ENTITY = FOODBLOCKENTITY.register("apple_furnace", 
    () -> BlockEntityType.Builder.of(applefurnaceentity::new, APPLE_FURNACE.get()).build(null));

   //.........potato
    public static final DeferredHolder<Block, potatofurnace> POTATO_FURNACE = FOODBLOCK.register("potato_furnace", () -> new potatofurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<potatofurnaceentity>> POTATO_FURNACE_ENTITY = FOODBLOCKENTITY.register("potato_furnace", 
    () -> BlockEntityType.Builder.of(potatofurnaceentity::new, POTATO_FURNACE.get()).build(null));

   //.........beetroot
    public static final DeferredHolder<Block, beetrootfurnace> BEETROOT_FURNACE = FOODBLOCK.register("beetroot_furnace", () -> new beetrootfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<beetrootfurnaceentity>> BEETROOT_FURNACE_ENTITY = FOODBLOCKENTITY.register("beetroot_furnace", 
    () -> BlockEntityType.Builder.of(beetrootfurnaceentity::new, BEETROOT_FURNACE.get()).build(null));

   //.........carrot
    public static final DeferredHolder<Block, carrotfurnace> CARROT_FURNACE = FOODBLOCK.register("carrot_furnace", () -> new carrotfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<carrotfurnaceentity>> CARROT_FURNACE_ENTITY = FOODBLOCKENTITY.register("carrot_furnace", 
    () -> BlockEntityType.Builder.of(carrotfurnaceentity::new, CARROT_FURNACE.get()).build(null));

   //.........chorus
    public static final DeferredHolder<Block, chorusfurnace> CHORUS_FURNACE = FOODBLOCK.register("chorus_furnace", () -> new chorusfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<chorusfurnaceentity>> CHORUS_FURNACE_ENTITY = FOODBLOCKENTITY.register("chorus_furnace", 
    () -> BlockEntityType.Builder.of(chorusfurnaceentity::new, CHORUS_FURNACE.get()).build(null));

   //.........glow_berry
    public static final DeferredHolder<Block, glowberryfurnace> GLOWBERRY_FURNACE = FOODBLOCK.register("glowberry_furnace", () -> new glowberryfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<glowberryfurnaceentity>> GLOWBERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("glowberry_furnace", 
    () -> BlockEntityType.Builder.of(glowberryfurnaceentity::new, GLOWBERRY_FURNACE.get()).build(null));

   //.........melon
    public static final DeferredHolder<Block, melonfurnace> MELON_FURNACE = FOODBLOCK.register("melon_furnace", () -> new melonfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<melonfurnaceentity>> MELON_FURNACE_ENTITY = FOODBLOCKENTITY.register("melon_furnace", 
    () -> BlockEntityType.Builder.of(melonfurnaceentity::new, MELON_FURNACE.get()).build(null));

   //.........sweet_berry
    public static final DeferredHolder<Block, sweet_berryfurnace> SWEET_BERRY_FURNACE = FOODBLOCK.register("sweet_berry_furnace", () -> new sweet_berryfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<sweet_berryfurnaceentity>> SWEET_BERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("sweet_berry_furnace", 
    () -> BlockEntityType.Builder.of(sweet_berryfurnaceentity::new, SWEET_BERRY_FURNACE.get()).build(null));

   //.........brown_mushroom
    public static final DeferredHolder<Block, brown_mushroomfurnace> BROWN_MUSHROOM_FURNACE = FOODBLOCK.register("brown_mushroom_furnace", () -> new brown_mushroomfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<brown_mushroomfurnaceentity>> BROWN_MUSHROOM_FURNACE_ENTITY = FOODBLOCKENTITY.register("brown_mushroom_furnace", 
    () -> BlockEntityType.Builder.of(brown_mushroomfurnaceentity::new, BROWN_MUSHROOM_FURNACE.get()).build(null));

   //.........red_mushroom
    public static final DeferredHolder<Block, red_mushroomfurnace> RED_MUSHROOM_FURNACE = FOODBLOCK.register("red_mushroom_furnace", () -> new red_mushroomfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<red_mushroomfurnaceentity>> RED_MUSHROOM_FURNACE_ENTITY = FOODBLOCKENTITY.register("red_mushroom_furnace", 
    () -> BlockEntityType.Builder.of(red_mushroomfurnaceentity::new, RED_MUSHROOM_FURNACE.get()).build(null));

   //.........pumpkin
    public static final DeferredHolder<Block, pumpkinfurnace> PUMPKIN_FURNACE = FOODBLOCK.register("pumpkin_furnace", () -> new pumpkinfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<pumpkinfurnaceentity>> PUMPKIN_FURNACE_ENTITY = FOODBLOCKENTITY.register("pumpkin_furnace", 
    () -> BlockEntityType.Builder.of(pumpkinfurnaceentity::new, PUMPKIN_FURNACE.get()).build(null));

   //.........chicken
    public static final DeferredHolder<Block, chickenfurnace> CHICKEN_FURNACE = FOODBLOCK.register("chicken_furnace", () -> new chickenfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<chickenfurnaceentity>> CHICKEN_FURNACE_ENTITY = FOODBLOCKENTITY.register("chicken_furnace", 
    () -> BlockEntityType.Builder.of(chickenfurnaceentity::new, CHICKEN_FURNACE.get()).build(null));

   //.........cod
    public static final DeferredHolder<Block, codfurnace> COD_FURNACE = FOODBLOCK.register("cod_furnace", () -> new codfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<codfurnaceentity>> COD_FURNACE_ENTITY = FOODBLOCKENTITY.register("cod_furnace", 
    () -> BlockEntityType.Builder.of(codfurnaceentity::new, COD_FURNACE.get()).build(null));

   //.........salmon
    public static final DeferredHolder<Block, salmonfurnace> SALMON_FURNACE = FOODBLOCK.register("salmon_furnace", () -> new salmonfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<salmonfurnaceentity>> SALMON_FURNACE_ENTITY = FOODBLOCKENTITY.register("salmon_furnace", 
    () -> BlockEntityType.Builder.of(salmonfurnaceentity::new, SALMON_FURNACE.get()).build(null));

   //.........tropical_fish
    public static final DeferredHolder<Block, tropical_fishfurnace> TROPICAL_FISH_FURNACE = FOODBLOCK.register("tropical_fish_furnace", () -> new tropical_fishfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<tropical_fishfurnaceentity>> TROPICAL_FISH_FURNACE_ENTITY = FOODBLOCKENTITY.register("tropical_fish_furnace", 
    () -> BlockEntityType.Builder.of(tropical_fishfurnaceentity::new, TROPICAL_FISH_FURNACE.get()).build(null));

   //.........mutton
    public static final DeferredHolder<Block, muttonfurnace> MUTTON_FURNACE = FOODBLOCK.register("mutton_furnace", () -> new muttonfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<muttonfurnaceentity>> MUTTON_FURNACE_ENTITY = FOODBLOCKENTITY.register("mutton_furnace", 
    () -> BlockEntityType.Builder.of(muttonfurnaceentity::new, MUTTON_FURNACE.get()).build(null));

   //.........beef
    public static final DeferredHolder<Block, beeffurnace> BEEF_FURNACE = FOODBLOCK.register("beef_furnace", () -> new beeffurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<beeffurnaceentity>> BEEF_FURNACE_ENTITY = FOODBLOCKENTITY.register("beef_furnace", 
    () -> BlockEntityType.Builder.of(beeffurnaceentity::new, BEEF_FURNACE.get()).build(null));

   //.........pork
    public static final DeferredHolder<Block, porkfurnace> PORK_FURNACE = FOODBLOCK.register("pork_furnace", () -> new porkfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<porkfurnaceentity>> PORK_FURNACE_ENTITY = FOODBLOCKENTITY.register("pork_furnace", 
    () -> BlockEntityType.Builder.of(porkfurnaceentity::new, PORK_FURNACE.get()).build(null));

   //.........rabbit
    public static final DeferredHolder<Block, rabbitfurnace> RABBIT_FURNACE = FOODBLOCK.register("rabbit_furnace", () -> new rabbitfurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<rabbitfurnaceentity>> RABBIT_FURNACE_ENTITY = FOODBLOCKENTITY.register("rabbit_furnace", 
    () -> BlockEntityType.Builder.of(rabbitfurnaceentity::new, RABBIT_FURNACE.get()).build(null));

//==============================================================================================================================================================================================
//                                                                                          Paths
//==============================================================================================================================================================================================

   //.........apple
    public static final DeferredHolder<Block, foodpathtypeminislab> APPLE_STONE_PATH = FOODBLOCK.register("apple_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........potato
    public static final DeferredHolder<Block, foodpathtypeminislab> POTATO_STONE_PATH = FOODBLOCK.register("potato_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........beetroot
    public static final DeferredHolder<Block, foodpathtypeminislab> BEETROOT_STONE_PATH = FOODBLOCK.register("beetroot_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........carrot
    public static final DeferredHolder<Block, foodpathtypeminislab> CARROT_STONE_PATH = FOODBLOCK.register("carrot_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........chorus
    public static final DeferredHolder<Block, foodpathtypeminislab> CHORUS_STONE_PATH = FOODBLOCK.register("chorus_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........glow_berry
    public static final DeferredHolder<Block, foodpathtypeminislab> GLOW_BERRY_STONE_PATH = FOODBLOCK.register("glow_berry_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    .lightLevel(state  -> 10)
    ));
   //.........melon
    public static final DeferredHolder<Block, foodpathtypeminislab> MELON_STONE_PATH = FOODBLOCK.register("melon_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........sweet_berry
    public static final DeferredHolder<Block, foodpathtypeminislab> SWEET_BERRY_STONE_PATH = FOODBLOCK.register("sweet_berry_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........brown_mushroom
    public static final DeferredHolder<Block, foodpathtypeminislab> BROWN_MUSHROOM_STONE_PATH = FOODBLOCK.register("brown_mushroom_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........red_mushroom
    public static final DeferredHolder<Block, foodpathtypeminislab> RED_MUSHROOM_STONE_PATH = FOODBLOCK.register("red_mushroom_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........pumpkin
    public static final DeferredHolder<Block, foodpathtypeminislab> PUMPKIN_STONE_PATH = FOODBLOCK.register("pumpkin_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........chicken
    public static final DeferredHolder<Block, foodpathtypeminislab> CHICKEN_STONE_PATH = FOODBLOCK.register("chicken_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........cod
    public static final DeferredHolder<Block, foodpathtypeminislab> COD_STONE_PATH = FOODBLOCK.register("cod_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........salmon
    public static final DeferredHolder<Block, foodpathtypeminislab> SALMON_STONE_PATH = FOODBLOCK.register("salmon_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........tropical_fish
    public static final DeferredHolder<Block, foodpathtypeminislab> TROPICAL_FISH_STONE_PATH = FOODBLOCK.register("tropical_fish_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........mutton
    public static final DeferredHolder<Block, foodpathtypeminislab> MUTTON_STONE_PATH = FOODBLOCK.register("mutton_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........beef
    public static final DeferredHolder<Block, foodpathtypeminislab> BEEF_STONE_PATH = FOODBLOCK.register("beef_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........pork
    public static final DeferredHolder<Block, foodpathtypeminislab> PORK_STONE_PATH = FOODBLOCK.register("pork_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
   //.........rabbit
    public static final DeferredHolder<Block, foodpathtypeminislab> RABBIT_STONE_PATH = FOODBLOCK.register("rabbit_stone_path", () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));


//==============================================================================================================================================================================================
//                                                                                          Chests
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
//                                                                                           Chairs
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
//                                                                                           Beds
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
//                                                                                         Record Players
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
//                                                                                         Dressers
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
