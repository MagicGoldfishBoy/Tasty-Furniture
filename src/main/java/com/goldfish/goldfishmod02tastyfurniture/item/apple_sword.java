package com.goldfish.goldfishmod02tastyfurniture.item;

import com.goldfish.goldfishmod02tastyfurniture.registry.food_weapon_registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class apple_sword extends SwordItem{

    public apple_sword(Tier pTier, Properties pProperties) {
        super(food_weapon_registry.APPLE_TIER, pProperties);
    }

        @Override
        public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 100, 1));
        target.playSound(SoundEvents.MAGMA_CUBE_SQUISH);

        return super.hurtEnemy(stack, target, attacker);
    }
    
}

// @Override
// public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
//     target.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 1));
//     target.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200, 0)); // Applies Weakness I for 10 seconds
    
//     return super.hurtEnemy(stack, target, attacker);
// }