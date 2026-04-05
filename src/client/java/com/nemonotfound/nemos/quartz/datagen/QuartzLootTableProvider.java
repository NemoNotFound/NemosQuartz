package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzFlowerPot;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class QuartzLootTableProvider extends FabricBlockLootSubProvider {

    public QuartzLootTableProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate() {
        this.dropSelf(QuartzBlocks.QUARTZ_PRESSURE_PLATE);
        this.dropSelf(QuartzBlocks.QUARTZ_BUTTON);
        this.dropSelf(QuartzBlocks.CRACKED_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.CRACKED_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.CRACKED_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.QUARTZ_FLOWER_POT);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_TORCHFLOWER);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_SPRUCE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_BIRCH_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_JUNGLE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_ACACIA_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CHERRY_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_DARK_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_PALE_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_MANGROVE_PROPAGULE);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_FERN);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_DANDELION);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_POPPY);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_BLUE_ORCHID);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_ALLIUM);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_AZURE_BLUET);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_RED_TULIP);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_ORANGE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_WHITE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_PINK_TULIP);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_OXEYE_DAISY);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CORNFLOWER);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_LILY_OF_THE_VALLEY);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_WITHER_ROSE);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_RED_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_BROWN_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_DEAD_BUSH);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CACTUS);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_BAMBOO);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CRIMSON_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_WARPED_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CRIMSON_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_WARPED_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_FLOWERING_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_OPEN_EYEBLOSSOM);
        dropQuartzPottedContents(QuartzBlocks.QUARTZ_POTTED_CLOSED_EYEBLOSSOM);
    }

    public void dropQuartzPottedContents(Block flowerPot) {
        this.add(flowerPot, (Function) ((block) -> this.createQuartzPotFlowerItemTable(((QuartzFlowerPot) block).getPotted())));
    }

    public final LootTable.Builder createQuartzPotFlowerItemTable(ItemLike item) {
        return LootTable.lootTable()
                .withPool(
                        this.applyExplosionCondition(QuartzBlocks.QUARTZ_FLOWER_POT, LootPool.lootPool().
                                setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(QuartzBlocks.QUARTZ_FLOWER_POT)))
                ).withPool(
                        this.applyExplosionCondition(item, LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(item)))
                );
    }
}
