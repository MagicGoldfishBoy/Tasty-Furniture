package com.goldfish.goldfishmod02tastyfurniture.item;

import net.minecraft.world.item.SwordItem;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodmaterialtyperegistry;
import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

public class cod_sword extends SwordItem {
    public cod_sword(Tier pTier, Properties pProperties) {
        super(foodmaterialtyperegistry.COD_TIER, pProperties);
    }

        @Override
        public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.setAirSupply(0);
        attacker.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 100, 1));
        attacker.playSound(SoundEvents.SLIME_SQUISH);

        return super.hurtEnemy(stack, target, attacker);
    
    }

        @Override
        public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.goldfishmod02tastyfurniture.cod_sword.tooltip"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
    
}
