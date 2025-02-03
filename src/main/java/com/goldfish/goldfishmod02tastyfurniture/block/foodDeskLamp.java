package com.goldfish.goldfishmod02tastyfurniture.block;

import java.util.List;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class foodDeskLamp extends HorizontalDirectionalBlock {
    public static final MapCodec<foodDeskLamp> CODEC = simpleCodec(foodDeskLamp::new);
    public static final DirectionProperty HORIZONTALFACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    public static final IntegerProperty POSITION = IntegerProperty.create("position", 0, 4);

    public foodDeskLamp(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(HORIZONTALFACING, Direction.NORTH).setValue(LIT, false).setValue(POSITION, 0));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }
    
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(HORIZONTALFACING, LIT, POSITION);
    };

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(HORIZONTALFACING, pContext.getHorizontalDirection().getOpposite());
    };

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult result) {
        if (player.isCrouching()) {
            level.playSound(player, pos, SoundEvents.MUD_BRICKS_HIT, SoundSource.BLOCKS, 1.0F, 0.9F + 0.1F * level.random.nextFloat());
            Direction blockDirection = state.getValue(HORIZONTALFACING);
            Direction newDirection = blockDirection.getClockWise();
            BlockState newState = state.setValue(HORIZONTALFACING, newDirection);
            level.setBlock(pos, newState, Block.UPDATE_ALL);
            return InteractionResult.CONSUME;
        } else if (!level.isClientSide()) {
            level.playSound(player, pos, SoundEvents.MUD_BRICKS_HIT, SoundSource.BLOCKS, 1.0F, 0.9F + 0.1F * level.random.nextFloat());
            BlockState lit = (state.getValue(LIT) == true) ? state.setValue(LIT, false) : state.setValue(LIT, true);
            level.setBlock(pos, lit, Block.UPDATE_ALL);
            return InteractionResult.CONSUME;
        } else {
            return InteractionResult.SUCCESS;
        }
    }

    @Override
    public void attack(BlockState state, Level level, BlockPos pos, Player player) {
        if (player.isCrouching()) {
            level.playSound(player, pos, SoundEvents.MUD_BRICKS_HIT, SoundSource.BLOCKS, 1.0F, 0.9F + 0.1F * level.random.nextFloat());
            Integer position = state.getValue(POSITION);
            if (position >= 4) {
            position = 0;
            }
            else {
            position += 1;
            }
            BlockPos newPos = new BlockPos(position, pos.getY(), pos.getZ());
            level.setBlock(newPos, state.setValue(POSITION, position), Block.UPDATE_ALL);
        }
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
       return state.getValue(LIT) ? 15 : 0;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        VoxelShape facing = switch (state.getValue(HORIZONTALFACING)) {
            case Direction.NORTH -> Shapes.box(0.3, 0.0,  0.1, 0.95, 1.0, 0.65);
            case EAST -> Shapes.box(0.3, 0.0, 0.35, 0.95, 1.0, 0.90); 
            case SOUTH -> Shapes.box(0.05, 0.0, 0.35, 0.7, 1.0, 0.90); 
            case WEST -> Shapes.box(0.05, 0.0, 0.1, 0.7, 1.0, 0.65);
            default -> Shapes.box(0.05, 0.0, 0.0, 0.945, 1.0, 0.50);
        };
        return facing;
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<net.minecraft.network.chat.Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(net.minecraft.network.chat.Component.translatable("tooltip.goldfishmod02tastyfurniture.foodDeskLamp.tooltip"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
