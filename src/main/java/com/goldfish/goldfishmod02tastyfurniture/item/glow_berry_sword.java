package com.goldfish.goldfishmod02tastyfurniture.item;

import net.minecraft.world.item.SwordItem;
import com.goldfish.goldfishmod02tastyfurniture.registry.food_weapon_registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class glow_berry_sword extends SwordItem {
    public glow_berry_sword(Tier pTier, Properties pProperties) {
        super(food_weapon_registry.GLOW_BERRY_TIER, pProperties);
    }



@Override
public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

target.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 1));
attacker.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 1));
attacker.playSound(SoundEvents.SLIME_SQUISH);

return super.hurtEnemy(stack, target, attacker);
    
    }

    //     @Override
    // public boolean isFoil(ItemStack stack) {
    //     return true;
    // }
}
