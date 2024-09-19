package com.goldfish.goldfishmod02tastyfurniture.block;

import javax.annotation.Nullable;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodChairBlockEntity;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;

public class foodChairBlock extends HorizontalDirectionalBlock implements EntityBlock {

    public static final MapCodec<foodChairBlock> CODEC = simpleCodec(foodChairBlock::new);
    public static final DirectionProperty HORIZONTALFACING = BlockStateProperties.HORIZONTAL_FACING;

    @Override
    public MapCodec<foodChairBlock> codec() {
        return CODEC;
    }

    public foodChairBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(HORIZONTALFACING, Direction.NORTH));
    }

        @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult result)
    {
        if(player.isCrouching())
        {
            level.playSound(player, pos, SoundEvents.MUD_BRICKS_HIT, SoundSource.BLOCKS, 1.0F, 0.9F + 0.1F * level.random.nextFloat());
            Direction blockDirection = state.getValue(FACING);
            Direction newDirection = blockDirection.getClockWise();
            BlockState newState = state.setValue(FACING, newDirection);
    
            level.setBlock(pos, newState, Block.UPDATE_ALL);
    
            return InteractionResult.CONSUME; 
          //  level.setBlock(pos, state.setValue(TUCKED, !state.getValue(TUCKED)), UPDATE_ALL);
           // return InteractionResult.SUCCESS;
        }
        else //state.getValue(BlockStateProperties.HORIZONTAL_FACING).getOpposite();
        {
            //return InteractionResult.CONSUME;
            return InteractionResult.SUCCESS;
        }
      //  return InteractionResult.SUCCESS;
    }

    @Override
    @Nullable
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new foodChairBlockEntity(pPos, pState);
    }

        @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(HORIZONTALFACING);
    }
    
}
