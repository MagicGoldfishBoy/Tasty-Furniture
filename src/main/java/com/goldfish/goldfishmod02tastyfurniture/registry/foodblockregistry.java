package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodsign;
import com.google.common.base.Supplier;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.behavior.GateBehavior;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Block.*;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.obj.ObjMaterialLibrary.Material;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Blocks.*;


public class foodblockregistry {
    public static final DeferredRegister<Block> FOODBLOCK = DeferredRegister.create(BuiltInRegistries.BLOCK, TastyFurniture.MODID);
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
         
    public static final DeferredHolder<Block, Block> APPLE_DOOR_BLOCK = FOODBLOCK.register("apple_door", () -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
         .destroyTime(1.75f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         ));
    public static final DeferredHolder<Block, Block> POTATO_DOOR_BLOCK = FOODBLOCK.register("potato_door", () -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
    public static final DeferredHolder<Block, Block> BEETROOT_DOOR_BLOCK = FOODBLOCK.register("beetroot_door", () -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, Block> CARROT_DOOR_BLOCK = FOODBLOCK.register("carrot_door", () -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, Block> CHORUS_DOOR_BLOCK = FOODBLOCK.register("chorus_door", () -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         ));
     public static final DeferredHolder<Block, DoorBlock> GLOW_BERRY_DOOR_BLOCK = FOODBLOCK.register("glow_berry_door", () -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
         .destroyTime(2.25f)
         .explosionResistance(9.5f)
         .sound(SoundType.MUD_BRICKS)
         .noOcclusion()
         .lightLevel(state -> 10)
         ));

//==============================================================================================================================================================================================
//                                                                                         Buttons
//==============================================================================================================================================================================================

    public static final DeferredHolder<Block, ButtonBlock> APPLE_BUTTON = FOODBLOCK.register("apple_button", () -> new ButtonBlock(BlockSetType.WARPED, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));
    public static final DeferredHolder<Block, ButtonBlock> POTATO_BUTTON = FOODBLOCK.register("potato_button", () -> new ButtonBlock(BlockSetType.WARPED, 20, BlockBehaviour.Properties.of()
    .sound(SoundType.MUD_BRICKS)
    ));

//==============================================================================================================================================================================================
//                                                                                         Fences
//==============================================================================================================================================================================================

    public static final DeferredHolder<Block, Block> APPLE_FENCE = FOODBLOCK.register("apple_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
    ));

//==============================================================================================================================================================================================
//                                                                                      Pressure Plates
//==============================================================================================================================================================================================

    public static final DeferredHolder<Block, Block> APPLE_PRESSURE_PLATE = FOODBLOCK.register("apple_pressure_plate", () -> new PressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
    ));

//==============================================================================================================================================================================================
//                                                                                          Signs
//==============================================================================================================================================================================================

    public static final DeferredHolder<Block, Block> APPLE_SIGN = FOODBLOCK.register("apple_sign",
    () -> new foodsign(
        BlockBehaviour.Properties.of(),
        WoodType.OAK
    ));


//==============================================================================================================================================================================================
//                                                                                          Slabs
//==============================================================================================================================================================================================

     public static final DeferredHolder<Block, Block> APPLE_SLAB = FOODBLOCK.register("apple_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     ));
     
//==============================================================================================================================================================================================
//                                                                                          Stairs
//==============================================================================================================================================================================================

     public static final DeferredHolder<Block, Block> APPLE_STAIRS = FOODBLOCK.register("apple_stairs", () -> new StairBlock(
          APPLE_BLOCK.get().defaultBlockState(),
          BlockBehaviour.Properties.of()
          .destroyTime(1.75f)
          .explosionResistance(9.5f)
          .sound(SoundType.MUD_BRICKS)
      ));
  
//==============================================================================================================================================================================================
//                                                                                         Trapdoors
//==============================================================================================================================================================================================

     public static final DeferredHolder<Block, Block> APPLE_TRAPDOOR = FOODBLOCK.register("apple_trapdoor", () -> new TrapDoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
}
