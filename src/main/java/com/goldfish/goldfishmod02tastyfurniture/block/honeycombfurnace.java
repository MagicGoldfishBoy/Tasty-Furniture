package com.goldfish.goldfishmod02tastyfurniture.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import javax.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.honeycombfurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.MapColor;

public class honeycombfurnace extends FurnaceBlock {

    public String type;

    public honeycombfurnace(MapColor colour, float strength, String type) {
        super(Properties.ofFullCopy(Blocks.FURNACE).mapColor(colour).strength(strength));
        this.type = type;
    }
    public honeycombfurnace(MapColor colour, SoundType sound, float strength, String type) {
        super(Properties.ofFullCopy(Blocks.FURNACE).mapColor(colour).sound(sound).strength(strength));
        this.type = type;
    }

    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> type) {
        return honeycombfurnace.createFurnaceTicker(level, type, foodblockregistry.HONEYCOMB_FURNACE_ENTITY.get());
    }

    @Override
    protected void openContainer(Level level, @NotNull BlockPos pos, @NotNull Player player) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof honeycombfurnaceentity) {
            player.openMenu((MenuProvider)blockEntity);
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new honeycombfurnaceentity(pos, state);
    }

}
    

