package com.goldfish.goldfishmod02tastyfurniture.block;

import java.util.List;

import javax.annotation.Nullable;

import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodChairEntity;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodEntityRegistry;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
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
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class foodChairBlock extends HorizontalDirectionalBlock {

    public static final MapCodec<foodChairBlock> CODEC = simpleCodec(foodChairBlock::new);
    public static final DirectionProperty HORIZONTALFACING = BlockStateProperties.HORIZONTAL_FACING;
    private static final VoxelShape SHAPE = Shapes.box(0.0, 0.0, 0.0, 1.0, 0.6, 1.0);

    @Override
    public MapCodec<foodChairBlock> codec() {
        return CODEC;
    }

    public foodChairBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(HORIZONTALFACING, Direction.NORTH));
    }


    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult result) {
        if (player.isCrouching()) {
            // Rotate the chair block
            level.playSound(player, pos, SoundEvents.MUD_BRICKS_HIT, SoundSource.BLOCKS, 1.0F, 0.9F + 0.1F * level.random.nextFloat());
            Direction blockDirection = state.getValue(HORIZONTALFACING);
            Direction newDirection = blockDirection.getClockWise();
            BlockState newState = state.setValue(HORIZONTALFACING, newDirection);
            level.setBlock(pos, newState, Block.UPDATE_ALL);
            return InteractionResult.CONSUME;
        } else if (!level.isClientSide()) {
            Entity chairEntity = this.getChairEntity(level, pos);
            if (chairEntity != null && !player.isPassenger()) {
                return player.startRiding(chairEntity) ? InteractionResult.CONSUME : InteractionResult.PASS;
            }
            return InteractionResult.PASS;
        } else {
            return InteractionResult.SUCCESS;
        }
    }

    public Entity getChairEntity(Level level, BlockPos pos) {
        foodChairEntity entity = new foodChairEntity(foodEntityRegistry.CHAIR_ENTITY.get(), level);
        entity.setPos(pos.getX() + 0.5, pos.getY() + 0.2, pos.getZ() + 0.5); 
        level.addFreshEntity(entity); 
        return entity;
    }

        @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(HORIZONTALFACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        return SHAPE;
    } 

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<net.minecraft.network.chat.Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(net.minecraft.network.chat.Component.translatable("tooltip.goldfishmod02tastyfurniture.food_chair.tooltip"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }
}
