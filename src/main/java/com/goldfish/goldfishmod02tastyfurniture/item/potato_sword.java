package com.goldfish.goldfishmod02tastyfurniture.item;

import com.goldfish.goldfishmod02tastyfurniture.registry.food_weapon_registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class potato_sword extends SwordItem {

        public potato_sword(Tier pTier, Properties pProperties) {
        super(food_weapon_registry.POTATO_TIER, pProperties);
    }

        @Override
        public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 1));
        target.playSound(SoundEvents.BONE_BLOCK_BREAK);

        return super.hurtEnemy(stack, target, attacker);
    }
    
}
