package com.goldfish.goldfishmod02tastyfurniture.item;

import net.minecraft.world.item.SwordItem;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class sweet_berry_sword extends SwordItem{
    public sweet_berry_sword(Tier pTier, Properties pProperties) {
        super(foodmaterialtyperegistry.SWEET_BERRY_TIER, pProperties);
    }

@Override
public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

target.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, 1));
attacker.addEffect(new MobEffectInstance(MobEffects.SATURATION, 100, 1));
attacker.playSound(SoundEvents.SLIME_SQUISH);

return super.hurtEnemy(stack, target, attacker);
    
    }
    
}
