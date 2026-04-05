package com.nemonotfound.nemos.quartz.world.level.block;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EyeblossomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class QuartzFlowerPot extends Block {

    public static final MapCodec<QuartzFlowerPot> CODEC = RecordCodecBuilder.mapCodec(
            (instance) -> instance.group(BuiltInRegistries.BLOCK.byNameCodec()
                            .fieldOf("potted")
                            .forGetter((quartzFlowerPot) -> quartzFlowerPot.potted), propertiesCodec()
                    )
                    .apply(instance, QuartzFlowerPot::new)
    );
    private static final Map<Block, Block> POTTED_BY_CONTENT = Maps.newHashMap();
    private static final VoxelShape SHAPE = Block.column(6.0F, 0.0F, 6.0F);
    private final Block potted;

    public QuartzFlowerPot(Block potted, Properties properties) {
        super(properties);
        this.potted = potted;
        POTTED_BY_CONTENT.put(potted, this);
    }

    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter blockGetter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return SHAPE;
    }

    protected @NotNull InteractionResult useItemOn(ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        Block pottedBlock;

        if (stack.getItem() instanceof BlockItem blockItem) {
            pottedBlock = POTTED_BY_CONTENT.getOrDefault(blockItem.getBlock(), Blocks.AIR);
        } else {
            pottedBlock = Blocks.AIR;
        }

        var blockState = pottedBlock.defaultBlockState();

        if (blockState.isAir()) {
            return InteractionResult.TRY_WITH_EMPTY_HAND;
        } else if (!this.isEmpty()) {
            return InteractionResult.CONSUME;
        } else {
            level.setBlock(pos, blockState, 3);
            level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            player.awardStat(Stats.POT_FLOWER);
            stack.consume(1, player);

            return InteractionResult.SUCCESS;
        }
    }

    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        if (this.isEmpty()) {
            return InteractionResult.CONSUME;
        } else {
            var itemStack = new ItemStack(this.potted);
            if (!player.addItem(itemStack)) {
                player.drop(itemStack, false);
            }

            level.setBlock(pos, Blocks.FLOWER_POT.defaultBlockState(), 3);
            level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);

            return InteractionResult.SUCCESS;
        }
    }

    protected @NotNull ItemStack getCloneItemStack(@NotNull LevelReader level, @NotNull BlockPos pos, @NotNull BlockState state, boolean includeData) {
        return this.isEmpty() ? super.getCloneItemStack(level, pos, state, includeData) : new ItemStack(this.potted);
    }

    private boolean isEmpty() {
        return this.potted == Blocks.AIR;
    }

    protected @NotNull BlockState updateShape(@NotNull BlockState state, @NotNull LevelReader level, @NotNull ScheduledTickAccess scheduledTickAccess, @NotNull BlockPos pos, @NotNull Direction direction, @NotNull BlockPos neighborPos, @NotNull BlockState neighborState, @NotNull RandomSource random) {
        return direction == Direction.DOWN && !state.canSurvive(level, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, level, scheduledTickAccess, pos, direction, neighborPos, neighborState, random);
    }

    public Block getPotted() {
        return this.potted;
    }

    protected boolean isPathfindable(@NotNull BlockState state, @NotNull PathComputationType pathComputationType) {
        return false;
    }

    protected boolean isRandomlyTicking(BlockState state) {
        return state.is(Blocks.POTTED_OPEN_EYEBLOSSOM) || state.is(Blocks.POTTED_CLOSED_EYEBLOSSOM);
    }

    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        if (this.isRandomlyTicking(state)) {
            var isOpenEyeblossom = this.potted == Blocks.OPEN_EYEBLOSSOM;
            var flag = level.environmentAttributes().getValue(EnvironmentAttributes.EYEBLOSSOM_OPEN, pos).toBoolean(isOpenEyeblossom);

            if (isOpenEyeblossom != flag) {
                level.setBlock(pos, this.opposite(state), 3);
                EyeblossomBlock.Type type = EyeblossomBlock.Type.fromBoolean(isOpenEyeblossom).transform();
                type.spawnTransformParticle(level, pos, random);
                level.playSound(null, pos, type.longSwitchSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
            }
        }

        super.randomTick(state, level, pos, random);
    }

    public BlockState opposite(BlockState state) {
        if (state.is(Blocks.POTTED_OPEN_EYEBLOSSOM)) {
            return Blocks.POTTED_CLOSED_EYEBLOSSOM.defaultBlockState();
        } else {
            return state.is(Blocks.POTTED_CLOSED_EYEBLOSSOM) ? Blocks.POTTED_OPEN_EYEBLOSSOM.defaultBlockState() : state;
        }
    }
}
