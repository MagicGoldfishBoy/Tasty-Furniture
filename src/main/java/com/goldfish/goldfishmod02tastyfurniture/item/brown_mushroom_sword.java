package com.goldfish.goldfishmod02tastyfurniture.item;

import net.minecraft.world.item.SwordItem;
import com.goldfish.goldfishmod02tastyfurniture.registry.food_weapon_registry;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class brown_mushroom_sword extends SwordItem {
    public brown_mushroom_sword(Tier pTier, Properties pProperties) {
        super(foodmaterialtyperegistry.BROWN_MUSHROOM_TIER, pProperties);
    }

@Override
public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

target.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 1));
attacker.playSound(SoundEvents.SLIME_SQUISH);

return super.hurtEnemy(stack, target, attacker);
    
    }
    
}
