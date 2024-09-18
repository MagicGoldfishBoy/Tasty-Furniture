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
import net.minecraft.world.level.BlockGetter;
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
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class smallFoodContainer extends HorizontalDirectionalBlock implements EntityBlock {
    public static final MapCodec<smallFoodContainer> CODEC = simpleCodec(smallFoodContainer::new);
    //public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final DirectionProperty HORIZONTALFACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    @Override
    public MapCodec<smallFoodContainer> codec() {
        return CODEC;
    }

    public smallFoodContainer(BlockBehaviour.Properties p_49046_) {
        super(p_49046_);
        this.registerDefaultState(this.stateDefinition.any().setValue(HORIZONTALFACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)));
    }

        @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        VoxelShape facing = switch (state.getValue(HORIZONTALFACING)) {
            case Direction.NORTH -> Shapes.box(0.05, 0.25, 0.50, 0.945, 0.75, 1.0);
            case EAST -> Shapes.box(0.0, 0.25, 0.05, 0.5, 0.75, 0.945); 
            case SOUTH -> Shapes.box(0.05, 0.25, 0.0, 0.945, 0.75, 0.50); 
            case WEST -> Shapes.box(0.50, 0.25, 0.05, 1.0, 0.75, 0.945);
            default -> Shapes.box(0.05, 0.25, 0.0, 0.945, 0.75, 0.50);
        };
        return facing;
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

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(HORIZONTALFACING, OPEN);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(HORIZONTALFACING, pContext.getHorizontalDirection().getOpposite());
       // return this.defaultBlockState().setValue(FACING, pContext.getNearestLookingDirection().getOpposite());
    }
    
}
