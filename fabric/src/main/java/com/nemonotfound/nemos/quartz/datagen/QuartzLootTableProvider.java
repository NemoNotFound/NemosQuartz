package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzFlowerPot;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class QuartzLootTableProvider extends FabricBlockLootTableProvider {

    public QuartzLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        this.dropSelf(QuartzBlocks.QUARTZ_PRESSURE_PLATE.get());
        this.dropSelf(QuartzBlocks.QUARTZ_BUTTON.get());
        this.dropSelf(QuartzBlocks.CRACKED_QUARTZ_BRICKS.get());
        this.dropSelf(QuartzBlocks.CRACKED_QUARTZ_BRICK_STAIRS.get());
        this.dropSelf(QuartzBlocks.CRACKED_QUARTZ_BRICK_SLAB.get());
        this.dropSelf(QuartzBlocks.CRACKED_QUARTZ_BRICK_WALL.get());
        this.dropSelf(QuartzBlocks.QUARTZ_BRICK_STAIRS.get());
        this.dropSelf(QuartzBlocks.QUARTZ_BRICK_SLAB.get());
        this.dropSelf(QuartzBlocks.QUARTZ_BRICK_WALL.get());
        this.dropSelf(QuartzBlocks.QUARTZ_FLOWER_POT.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_TORCHFLOWER.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_OAK_SAPLING.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_SPRUCE_SAPLING.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_BIRCH_SAPLING.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_JUNGLE_SAPLING.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_ACACIA_SAPLING.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CHERRY_SAPLING.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_DARK_OAK_SAPLING.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_PALE_OAK_SAPLING.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_MANGROVE_PROPAGULE.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_FERN.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_DANDELION.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_POPPY.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_BLUE_ORCHID.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_ALLIUM.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_AZURE_BLUET.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_RED_TULIP.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_ORANGE_TULIP.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_WHITE_TULIP.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_PINK_TULIP.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_OXEYE_DAISY.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CORNFLOWER.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_LILY_OF_THE_VALLEY.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_WITHER_ROSE.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_RED_MUSHROOM.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_BROWN_MUSHROOM.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_DEAD_BUSH.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CACTUS.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_BAMBOO.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CRIMSON_FUNGUS.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_WARPED_FUNGUS.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CRIMSON_ROOTS.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_WARPED_ROOTS.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_AZALEA.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_FLOWERING_AZALEA.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_OPEN_EYEBLOSSOM.get());
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CLOSED_EYEBLOSSOM.get());
    }

    public void dropQuartzPottedContents(Block flowerPot) {
        this.add(flowerPot, (Function) ((block) -> this.createQuartzPotFlowerItemTable(((QuartzFlowerPot) block).getPotted())));
    }

    public final LootTable.Builder createQuartzPotFlowerItemTable(ItemLike item) {
        return LootTable.lootTable()
                .withPool(
                        this.applyExplosionCondition(QuartzBlocks.QUARTZ_FLOWER_POT.get(), LootPool.lootPool().
                                setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(QuartzBlocks.QUARTZ_FLOWER_POT.get())))
                ).withPool(
                        this.applyExplosionCondition(item, LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(item)))
                );
    }
}
