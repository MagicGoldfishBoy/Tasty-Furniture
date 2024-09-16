package com.goldfish.goldfishmod02tastyfurniture.block;

import net.minecraft.client.resources.model.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.CompoundContainer;
import net.minecraft.world.Container;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.BlockHitResult;

import org.jetbrains.annotations.Nullable;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodChestEntity;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;

import java.util.*;
import java.util.function.Supplier;

public class foodChest extends ChestBlock {
    public DoubleBlockCombiner.Combiner<ChestBlockEntity, Optional<MenuProvider>> NAME_RETRIEVER;
    public final String chestType;


    public foodChest(MapColor colour, String chestType) {
        super(Properties.of()
            .strength(2.5F)
            .sound(SoundType.WOOD)
            .mapColor(colour), 
            () -> foodblockregistry.APPLE_CHEST_ENTITY.get()
        );
        this.chestType = chestType;
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
        registerMaterialNameRetriever();
    }

    // public foodChest(MapColor colour, String chestType) {
    //     super(Properties.ofFullCopy(Blocks.CHEST).mapColor(colour), () -> BlockEntityType.CHEST);
    //     this.chestType = chestType;

    //     registerMaterialNameRetriever();
    // }

    public foodChest(MapColor colour, SoundType sound, String chestType) {
        super(Properties.of()
        .strength(2.5F)
        .sound(SoundType.WOOD)
        .mapColor(colour),  
        () -> foodblockregistry.APPLE_CHEST_ENTITY.get());//BlockEntityType.CHEST);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
        this.chestType = chestType;

        registerMaterialNameRetriever();
    }
    // public foodChest(MapColor colour, SoundType sound, String chestType) {
    //     //super(Properties.ofFullCopy(Blocks.CHEST).mapColor(colour).sound(sound), () -> foodblockregistry.APPLE_CHEST_ENTITY);
    //     super(Properties.ofFullCopy(Blocks.CHEST).mapColor(colour).sound(sound), () -> foodblockregistry.APPLE_CHEST_ENTITY.get());//BlockEntityType.CHEST);
    //     this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
    //     this.chestType = chestType;

    //     registerMaterialNameRetriever();
    // }

    public foodChest(BlockBehaviour.Properties properties, Supplier<BlockEntityType<? extends ChestBlockEntity>> supplier, String chestType) {
        super(properties, supplier);
        this.chestType = chestType;

        registerMaterialNameRetriever();
    }
    
    

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
       // System.out.println("Placed at " + pos);
        return new foodChestEntity(pos, state);
        //return new ChestBlockEntity(pos, state);
    }

    protected void registerMaterialNameRetriever() {
        NAME_RETRIEVER = new DoubleBlockCombiner.Combiner<>() {
            public Optional<MenuProvider> acceptDouble(ChestBlockEntity chestBlockEntity, ChestBlockEntity chestBlockEntity2) {
                final Container container = new CompoundContainer(chestBlockEntity, chestBlockEntity2);
                return Optional.of(new MenuProvider() {
                    @Nullable
                    public AbstractContainerMenu createMenu(int p_51622_, Inventory p_51623_, Player p_51624_) {
                        if (chestBlockEntity.canOpen(p_51624_) && chestBlockEntity2.canOpen(p_51624_)) {
                            chestBlockEntity.unpackLootTable(p_51623_.player);
                            chestBlockEntity2.unpackLootTable(p_51623_.player);
                            return ChestMenu.sixRows(p_51622_, p_51623_, container);
                        } else {
                            return null;
                        }
                    }

                    public Component getDisplayName() {
                        if (chestBlockEntity.hasCustomName()) {
                            return chestBlockEntity.getDisplayName();
                        } else {
                            return chestBlockEntity2.hasCustomName() ? chestBlockEntity2.getDisplayName() :
                                    Component.translatable(chestType + "_chestDouble");
                        }
                    }
                });
            }

            public Optional<MenuProvider> acceptSingle(ChestBlockEntity chestBlockEntity) {
                return Optional.of(chestBlockEntity);
            }

            public Optional<MenuProvider> acceptNone() {
                return Optional.empty();
            }
        };
    }

    @Override
    @Nullable
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return this.combine(state, level, pos, false)
                .apply(NAME_RETRIEVER).orElse(null);
    }

        @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        BlockPos above = pos.above();
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else if (!level.getBlockState(above).isRedstoneConductor(level, above)) {
            if (level.getBlockEntity(pos) instanceof foodChestEntity blockEntity) {
                player.openMenu(blockEntity);
                PiglinAi.angerNearbyPiglins(player, true);
            }
            return InteractionResult.CONSUME;
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

     @Override
     public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
     //   System.out.println("type: " + type + ", " + "level: " + level + ", state: " + state);
         return createTickerHelper(type, foodblockregistry.APPLE_CHEST_ENTITY.get(), foodChestEntity::tick);


     }
}
