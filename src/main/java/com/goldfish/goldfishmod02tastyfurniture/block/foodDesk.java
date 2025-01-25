package com.goldfish.goldfishmod02tastyfurniture.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

public class foodDesk extends HorizontalDirectionalBlock {
    public static final MapCodec<foodDesk> CODEC = simpleCodec(foodDesk::new);

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty NORTH_CONNECTED = BooleanProperty.create("north_connected");
    public static final BooleanProperty EAST_CONNECTED = BooleanProperty.create("east_connected");
    public static final BooleanProperty SOUTH_CONNECTED = BooleanProperty.create("south_connected");
    public static final BooleanProperty WEST_CONNECTED = BooleanProperty.create("west_connected");

    public foodDesk(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(FACING, Direction.NORTH)
                .setValue(NORTH_CONNECTED, false)
                .setValue(EAST_CONNECTED, false)
                .setValue(SOUTH_CONNECTED, false)
                .setValue(WEST_CONNECTED, false));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        return updateConnectionState(context.getLevel(), context.getClickedPos(), state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, NORTH_CONNECTED, EAST_CONNECTED, SOUTH_CONNECTED, WEST_CONNECTED);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        return updateConnectionState(level, pos, state);
    }

    private BlockState updateConnectionState(LevelAccessor level, BlockPos pos, BlockState state) {
        Direction facing = state.getValue(FACING);
    
        // Get the relative directions based on the facing direction
        Direction north = facing;
        Direction east = facing.getClockWise();
        Direction south = facing.getOpposite();
        Direction west = facing.getCounterClockWise();
    
        // Check connections in the calculated directions
        boolean northConnected = isSameBlock(level.getBlockState(pos.relative(north)));
        boolean eastConnected = isSameBlock(level.getBlockState(pos.relative(east)));
        boolean southConnected = isSameBlock(level.getBlockState(pos.relative(south)));
        boolean westConnected = isSameBlock(level.getBlockState(pos.relative(west)));
    
        // Update the block state with connection properties
        return state.setValue(NORTH_CONNECTED, northConnected)
                    .setValue(EAST_CONNECTED, eastConnected)
                    .setValue(SOUTH_CONNECTED, southConnected)
                    .setValue(WEST_CONNECTED, westConnected);}
    

    private boolean isSameBlock(BlockState state) {
        return state.getBlock() instanceof foodDesk;
    }
}
