package com.goldfish.goldfishmod02tastyfurniture.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.applefurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockregistry;

import net.minecraft.client.resources.model.Material;
//import net.minecraft.world.level.material.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.core.Direction;

public class applefurnace extends FurnaceBlock {
   // public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
  //  public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public applefurnace() {
        super(BlockBehaviour.Properties.of().strength(3.5F));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(LIT, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT);
    }

    // @Override
    // public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
    //     // Open the furnace GUI when the block is used by the player
    //     if (!level.isClientSide) {
    //         openContainer(level, pos, player);
    //     }
    //     return InteractionResult.sidedSuccess(level.isClientSide);
    // }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
         return createTickerHelper(type, foodblockregistry.APPLE_FURNACE_ENTITY.get(), applefurnaceentity::tick);
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof FurnaceBlockEntity) {
            player.openMenu((MenuProvider) blockEntity);
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new applefurnaceentity(pos, state);
    }
}
