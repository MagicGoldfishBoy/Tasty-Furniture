package com.goldfish.goldfishmod02tastyfurniture.block;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import javax.annotation.Nullable;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.smallFoodContainerEntity;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;

public class smallFoodContainer extends HorizontalDirectionalBlock implements EntityBlock {
        public static final MapCodec<smallFoodContainer> CODEC = simpleCodec(smallFoodContainer::new);
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    @Override
    public MapCodec<smallFoodContainer> codec() {
        return CODEC;
    }

    public smallFoodContainer(BlockBehaviour.Properties p_49046_) {
        super(p_49046_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)));
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        //System.out.println("used");
        if (pLevel.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            BlockEntity blockentity = pLevel.getBlockEntity(pPos);
            if (blockentity instanceof smallFoodContainerEntity) {
                pPlayer.openMenu((smallFoodContainerEntity)blockentity);
               // pPlayer.awardStat(Stats.OPEN_BARREL);
                PiglinAi.angerNearbyPiglins(pPlayer, true);
            }

            return InteractionResult.CONSUME;
        }
    }

    @Override
    protected void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        Containers.dropContentsOnDestroy(pState, pNewState, pLevel, pPos);
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Override
    protected void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        //System.out.println("tick");
        BlockEntity blockentity = pLevel.getBlockEntity(pPos);
        if (blockentity instanceof smallFoodContainerEntity) {
            ((smallFoodContainerEntity)blockentity).recheckOpen();
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new smallFoodContainerEntity(pPos, pState);
    }

    @Override
    protected RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    /**
     * @deprecated call via {@link net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase#hasAnalogOutputSignal} whenever possible. Implementing/overriding is fine.
     */
    @Override
    protected boolean hasAnalogOutputSignal(BlockState pState) {
        return true;
    }

    /**
     * Returns the analog signal this block emits. This is the signal a comparator can read from it.
     *
     * @deprecated call via {@link net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase#getAnalogOutputSignal} whenever possible. Implementing/overriding is fine.
     */
    @Override
    protected int getAnalogOutputSignal(BlockState pBlockState, Level pLevel, BlockPos pPos) {
        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(pLevel.getBlockEntity(pPos));
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed blockstate.
     * @deprecated call via {@link net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase#rotate} whenever possible. Implementing/overriding is fine.
     */
    @Override
    protected BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed blockstate.
     * @deprecated call via {@link net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase#mirror} whenever possible. Implementing/overriding is fine.
     */
    @Override
    protected BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, OPEN);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getNearestLookingDirection().getOpposite());
    }

    // public static final MapCodec<HorizontalDirectionalBlock> CODEC = simpleCodec(smallFoodContainer::new);
    // public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    // public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    // @Override
    // protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
    //     return CODEC;
    // }

    // public smallFoodContainer(Properties pProperties) {
    //     super(pProperties);
    //    // this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)));
    // }


    // @Override
    // @Nullable
    // public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
    //     return new smallFoodContainerEntity(pPos, pState); 
    // }

    //         @Override
    // protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
    //     if (pLevel.isClientSide) {
    //         return InteractionResult.SUCCESS;
    //     } else {
    //         BlockEntity blockentity = pLevel.getBlockEntity(pPos);
    //         if (blockentity instanceof BarrelBlockEntity) {
    //             pPlayer.openMenu((BarrelBlockEntity)blockentity);
    //             pPlayer.awardStat(Stats.OPEN_BARREL);
    //             PiglinAi.angerNearbyPiglins(pPlayer, true);
    //         }

    //         return InteractionResult.CONSUME;
    //     }
    // }
    

    // @Override
    // protected void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
    //     Containers.dropContentsOnDestroy(pState, pNewState, pLevel, pPos);
    //     super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    // }

    // @Override
    // protected void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
    //     BlockEntity blockentity = pLevel.getBlockEntity(pPos);
    //     if (blockentity instanceof smallFoodContainerEntity) {
    //         ((smallFoodContainerEntity)blockentity).recheckOpen();
    //     }
    // }

    //     @Override
    // protected RenderShape getRenderShape(BlockState pState) {
    //     return RenderShape.MODEL;
    // }
    
}
