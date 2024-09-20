package com.goldfish.goldfishmod02tastyfurniture.client.renderer;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodChairEntity;

import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class foodChairEntityRenderer extends EntityRenderer<foodChairEntity> {

    public foodChairEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(foodChairEntity entity) {
        return null; // No texture since the entity is invisible
    }

    @Override
    public boolean shouldRender(foodChairEntity entity, Frustum frustum, double x, double y, double z) {
        return false;
    }
}

