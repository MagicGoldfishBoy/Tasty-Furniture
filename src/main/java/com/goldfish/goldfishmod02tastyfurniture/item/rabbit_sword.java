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
import net.minecraft.world.item.enchantment.Enchantment;

public class rabbit_sword extends SwordItem {
    public rabbit_sword(Tier pTier, Properties pProperties) {
        super(foodmaterialtyperegistry.RABBIT_TIER, pProperties);
    }

        @Override
        public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        attacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2));
        attacker.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 2));
        attacker.playSound(SoundEvents.SLIME_SQUISH);

        return super.hurtEnemy(stack, target, attacker);   
   }

        @Override
        public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.goldfishmod02tastyfurniture.rabbit_sword.tooltip"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
