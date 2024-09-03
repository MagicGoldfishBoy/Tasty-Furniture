package com.goldfish.goldfishmod02tastyfurniture.item;

import com.goldfish.goldfishmod02tastyfurniture.registry.food_weapon_registry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class beetroot_sword extends SwordItem {
    public beetroot_sword(Tier pTier, Properties pProperties) {
        super(foodmaterialtyperegistry.BEETROOT_TIER, pProperties);
    }

        @Override
        public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 1));
        target.playSound(SoundEvents.BONE_BLOCK_BREAK);

        return super.hurtEnemy(stack, target, attacker);
    }
    
}
