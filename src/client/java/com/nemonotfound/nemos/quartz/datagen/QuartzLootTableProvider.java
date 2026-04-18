package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import com.nemonotfound.nemos.quartz.world.level.block.pot.FlowerPotBase;
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

        this.add(QuartzBlocks.NETHER_ROSE_QUARTZ_ORE, block -> this.createOreDrop(block, QuartzItems.ROSE_QUARTZ));

        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_PRESSURE_PLATE);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_BUTTON);
        this.dropSelf(QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.CRACKED_ROSE_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_PILLAR);
        this.dropSelf(QuartzBlocks.SMOOTH_ROSE_QUARTZ);
        this.dropSelf(QuartzBlocks.SMOOTH_ROSE_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.SMOOTH_ROSE_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.ROSE_QUARTZ_FLOWER_POT);

        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_TORCHFLOWER);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_SPRUCE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_BIRCH_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_JUNGLE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_ACACIA_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_CHERRY_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_DARK_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_PALE_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_MANGROVE_PROPAGULE);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_FERN);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_DANDELION);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_POPPY);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_BLUE_ORCHID);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_ALLIUM);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_AZURE_BLUET);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_RED_TULIP);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_ORANGE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_WHITE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_PINK_TULIP);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_OXEYE_DAISY);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_CORNFLOWER);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_LILY_OF_THE_VALLEY);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_WITHER_ROSE);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_RED_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_BROWN_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_DEAD_BUSH);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_CACTUS);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_BAMBOO);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_CRIMSON_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_WARPED_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_CRIMSON_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_WARPED_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_FLOWERING_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_OPEN_EYEBLOSSOM);
        dropQuartzPottedContents(QuartzBlocks.ROSE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM);

        this.add(QuartzBlocks.NETHER_LEMON_QUARTZ_ORE, block -> this.createOreDrop(block, QuartzItems.LEMON_QUARTZ));

        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_PRESSURE_PLATE);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_BUTTON);
        this.dropSelf(QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.CRACKED_LEMON_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_PILLAR);
        this.dropSelf(QuartzBlocks.SMOOTH_LEMON_QUARTZ);
        this.dropSelf(QuartzBlocks.SMOOTH_LEMON_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.SMOOTH_LEMON_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.LEMON_QUARTZ_FLOWER_POT);

        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_TORCHFLOWER);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_SPRUCE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_BIRCH_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_JUNGLE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_ACACIA_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_CHERRY_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_DARK_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_PALE_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_MANGROVE_PROPAGULE);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_FERN);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_DANDELION);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_POPPY);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_BLUE_ORCHID);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_ALLIUM);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_AZURE_BLUET);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_RED_TULIP);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_ORANGE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_WHITE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_PINK_TULIP);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_OXEYE_DAISY);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_CORNFLOWER);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_LILY_OF_THE_VALLEY);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_WITHER_ROSE);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_RED_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_BROWN_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_DEAD_BUSH);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_CACTUS);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_BAMBOO);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_CRIMSON_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_WARPED_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_CRIMSON_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_WARPED_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_FLOWERING_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_OPEN_EYEBLOSSOM);
        dropQuartzPottedContents(QuartzBlocks.LEMON_QUARTZ_POTTED_CLOSED_EYEBLOSSOM);

        this.add(QuartzBlocks.NETHER_GREEN_QUARTZ_ORE, block -> this.createOreDrop(block, QuartzItems.GREEN_QUARTZ));

        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_PRESSURE_PLATE);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_BUTTON);
        this.dropSelf(QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.CRACKED_GREEN_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_PILLAR);
        this.dropSelf(QuartzBlocks.SMOOTH_GREEN_QUARTZ);
        this.dropSelf(QuartzBlocks.SMOOTH_GREEN_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.SMOOTH_GREEN_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.GREEN_QUARTZ_FLOWER_POT);

        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_TORCHFLOWER);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_SPRUCE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_BIRCH_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_JUNGLE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_ACACIA_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_CHERRY_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_DARK_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_PALE_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_MANGROVE_PROPAGULE);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_FERN);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_DANDELION);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_POPPY);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_BLUE_ORCHID);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_ALLIUM);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_AZURE_BLUET);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_RED_TULIP);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_ORANGE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_WHITE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_PINK_TULIP);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_OXEYE_DAISY);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_CORNFLOWER);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_LILY_OF_THE_VALLEY);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_WITHER_ROSE);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_RED_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_BROWN_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_DEAD_BUSH);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_CACTUS);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_BAMBOO);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_CRIMSON_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_WARPED_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_CRIMSON_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_WARPED_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_FLOWERING_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_OPEN_EYEBLOSSOM);
        dropQuartzPottedContents(QuartzBlocks.GREEN_QUARTZ_POTTED_CLOSED_EYEBLOSSOM);

        this.add(QuartzBlocks.NETHER_BLUE_QUARTZ_ORE, block -> this.createOreDrop(block, QuartzItems.BLUE_QUARTZ));

        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_PRESSURE_PLATE);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_BUTTON);
        this.dropSelf(QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.CRACKED_BLUE_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_PILLAR);
        this.dropSelf(QuartzBlocks.SMOOTH_BLUE_QUARTZ);
        this.dropSelf(QuartzBlocks.SMOOTH_BLUE_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.SMOOTH_BLUE_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.BLUE_QUARTZ_FLOWER_POT);

        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_TORCHFLOWER);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_SPRUCE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_BIRCH_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_JUNGLE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_ACACIA_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_CHERRY_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_DARK_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_PALE_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_MANGROVE_PROPAGULE);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_FERN);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_DANDELION);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_POPPY);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_BLUE_ORCHID);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_ALLIUM);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_AZURE_BLUET);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_RED_TULIP);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_ORANGE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_WHITE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_PINK_TULIP);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_OXEYE_DAISY);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_CORNFLOWER);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_LILY_OF_THE_VALLEY);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_WITHER_ROSE);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_RED_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_BROWN_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_DEAD_BUSH);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_CACTUS);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_BAMBOO);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_CRIMSON_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_WARPED_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_CRIMSON_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_WARPED_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_FLOWERING_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_OPEN_EYEBLOSSOM);
        dropQuartzPottedContents(QuartzBlocks.BLUE_QUARTZ_POTTED_CLOSED_EYEBLOSSOM);

        this.add(QuartzBlocks.NETHER_SMOKY_QUARTZ_ORE, block -> this.createOreDrop(block, QuartzItems.SMOKY_QUARTZ));

        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_PRESSURE_PLATE);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_BUTTON);
        this.dropSelf(QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICKS);
        this.dropSelf(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_STAIRS);
        this.dropSelf(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_SLAB);
        this.dropSelf(QuartzBlocks.CRACKED_SMOKY_QUARTZ_BRICK_WALL);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_PILLAR);
        this.dropSelf(QuartzBlocks.SMOOTH_SMOKY_QUARTZ);
        this.dropSelf(QuartzBlocks.SMOOTH_SMOKY_QUARTZ_STAIRS);
        this.dropSelf(QuartzBlocks.SMOOTH_SMOKY_QUARTZ_SLAB);
        this.dropSelf(QuartzBlocks.SMOKY_QUARTZ_FLOWER_POT);

        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_TORCHFLOWER);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_SPRUCE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_BIRCH_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_JUNGLE_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_ACACIA_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_CHERRY_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_DARK_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_PALE_OAK_SAPLING);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_MANGROVE_PROPAGULE);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_FERN);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_DANDELION);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_POPPY);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_BLUE_ORCHID);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_ALLIUM);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_AZURE_BLUET);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_RED_TULIP);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_ORANGE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_WHITE_TULIP);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_PINK_TULIP);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_OXEYE_DAISY);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_CORNFLOWER);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_LILY_OF_THE_VALLEY);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_WITHER_ROSE);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_RED_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_BROWN_MUSHROOM);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_DEAD_BUSH);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_CACTUS);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_BAMBOO);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_CRIMSON_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_WARPED_FUNGUS);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_CRIMSON_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_WARPED_ROOTS);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_OPEN_EYEBLOSSOM);
        dropQuartzPottedContents(QuartzBlocks.SMOKY_QUARTZ_POTTED_CLOSED_EYEBLOSSOM);
    }

    public void dropQuartzPottedContents(Block block) {
        FlowerPotBase flowerPot = (FlowerPotBase) block;
        this.add(flowerPot, (_) -> this.createQuartzPotFlowerItemTable(flowerPot.getPotted(), flowerPot.getFlowerPot()));
    }

    public final LootTable.Builder createQuartzPotFlowerItemTable(ItemLike item, Block flowerPot) {
        return LootTable.lootTable()
                .withPool(
                        this.applyExplosionCondition(flowerPot, LootPool.lootPool().
                                setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(flowerPot)))
                ).withPool(
                        this.applyExplosionCondition(item, LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(item)))
                );
    }
}
