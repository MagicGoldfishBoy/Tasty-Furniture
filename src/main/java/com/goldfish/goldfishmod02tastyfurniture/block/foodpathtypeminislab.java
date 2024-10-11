package com.goldfish.goldfishmod02tastyfurniture.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class foodpathtypeminislab extends Block {

    private static final VoxelShape MINI_SLAB_SHAPE = Shapes.box(0.0, 0.0, 0.0, 1.0, 0.1, 1.0);

    public foodpathtypeminislab(Properties p_49795_) {
        super(p_49795_);
    }
    
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        return MINI_SLAB_SHAPE; // Return the mini slab shape
    }
}
