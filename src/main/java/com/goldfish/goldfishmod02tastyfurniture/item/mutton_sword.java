package com.goldfish.goldfishmod02tastyfurniture.item;

import net.minecraft.world.item.SwordItem;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class mutton_sword extends SwordItem{
    public mutton_sword(Tier pTier, Properties pProperties) {
        super(foodmaterialtyperegistry.MUTTON_TIER, pProperties);
    }

@Override
public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

attacker.addEffect(new MobEffectInstance(MobEffects.HEAL, 100, 1));
target.setYHeadRot(5.4f);
target.setXRot(ABSOLUTE_MAX_STACK_SIZE);
target.setYRot(50.5f);
attacker.playSound(SoundEvents.SLIME_SQUISH);

return super.hurtEnemy(stack, target, attacker);
    
    }      
}
