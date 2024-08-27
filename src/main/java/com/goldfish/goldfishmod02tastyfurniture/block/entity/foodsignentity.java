package com.goldfish.goldfishmod02tastyfurniture.block.entity;

import java.util.Collection;
import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.goldfish.goldfishmod02tastyfurniture.datagen.GM1BlockLootTableProvider;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableProvider.SubProviderEntry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class foodsignentity extends SignBlockEntity {
    public foodsignentity(/*BlockEntityType<?> type, */BlockPos pos, BlockState state) {
      super(/*getSignEntityType(state.getBlock()), */pos, state);
    }
    @Override
    public @NotNull BlockEntityType<?> getType() {
        return foodblockregistry.APPLE_SIGN_ENTITY.get();
    }
    // private static BlockEntityType<? extends SignBlockEntity> getSignEntityType(Block block) {
     //   return foodblockregistry.APPLE_SIGN_ENTITY.get();
    // }

    public static void tick(Level level, BlockPos pos, BlockState state, foodsignentity entity) {
          if (level instanceof ServerLevel) {
            //System.out.println("Ticking at " + pos);
          }
    }

    public static class potato_sign_entity extends foodsignentity {
      public potato_sign_entity(BlockPos pos, BlockState state) {
        super(pos, state);
      }
      @Override
      public @NotNull BlockEntityType<?> getType() {
          return foodblockregistry.POTATO_SIGN_ENTITY.get();
      }

    }
    }





    
    

