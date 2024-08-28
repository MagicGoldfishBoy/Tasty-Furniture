package com.goldfish.goldfishmod02tastyfurniture.item;

import net.minecraft.world.item.SwordItem;
import com.goldfish.goldfishmod02tastyfurniture.registry.food_weapon_registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantment;

public class pork_sword extends SwordItem {
    public pork_sword(Tier pTier, Properties pProperties) {
        super(food_weapon_registry.PORK_TIER, pProperties);
    }

@Override
public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

target.addEffect(new MobEffectInstance(MobEffects.INFESTED, 100, 1));
attacker.addEffect(new MobEffectInstance(MobEffects.HEAL, 100, 2));
attacker.playSound(SoundEvents.SLIME_SQUISH);

return super.hurtEnemy(stack, target, attacker);
    
    }      
}
