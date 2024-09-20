package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurniture;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodChairEntity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class foodEntityRegistry {

    public static final DeferredRegister<EntityType<?>> FOODENTITY = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, TastyFurniture.MODID);

    public static final Supplier<EntityType<foodChairEntity>> CHAIR_ENTITY = FOODENTITY.register("chair_entity",
    () -> EntityType.Builder.of(foodChairEntity::new, MobCategory.MISC).sized(0.6F, 0.5F).clientTrackingRange(8).build("chair_entity"));
}
