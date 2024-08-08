package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

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

}
