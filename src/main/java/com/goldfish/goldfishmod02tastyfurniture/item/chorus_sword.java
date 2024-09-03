package com.goldfish.goldfishmod02tastyfurniture.item;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class chorus_sword extends SwordItem {

    public chorus_sword(Tier pTier, Properties pProperties) {
        super(foodmaterialtyperegistry.CHORUS_TIER, pProperties);
    }

        @Override
        public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 1));
        target.playSound(SoundEvents.ENDERMAN_TELEPORT);
        target.randomTeleport(7, 57, 50, canRepair);
        
        return super.hurtEnemy(stack, target, attacker);
    }
    
}
