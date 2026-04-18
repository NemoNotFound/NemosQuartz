package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import com.nemonotfound.nemos.quartz.world.level.block.QuartzBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class QuartzRecipeProvider extends FabricRecipeProvider {

    public QuartzRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider, @NonNull RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                this.quartzPressurePlate(QuartzItems.QUARTZ_PRESSURE_PLATE, Items.QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.QUARTZ_PRESSURE_PLATE, Items.QUARTZ_BLOCK, 4);

                this.buttonBuilder(QuartzItems.QUARTZ_BUTTON, Ingredient.of(Items.QUARTZ_BLOCK))
                        .unlockedBy(getHasName(Items.QUARTZ_BLOCK), this.has(Items.QUARTZ_BLOCK))
                        .group("quartz_button")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.QUARTZ_BUTTON, Items.QUARTZ_BLOCK, 4);

                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICKS, Items.QUARTZ_BRICKS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICK_STAIRS, QuartzItems.QUARTZ_BRICK_STAIRS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICK_SLAB, QuartzItems.QUARTZ_BRICK_SLAB);
                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICK_WALL, QuartzItems.QUARTZ_BRICK_WALL);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_QUARTZ_BRICK_STAIRS, QuartzItems.CRACKED_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_QUARTZ_BRICK_SLAB, QuartzItems.CRACKED_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_QUARTZ_BRICK_WALL, QuartzItems.CRACKED_QUARTZ_BRICKS);

                this.stairBuilder(QuartzItems.QUARTZ_BRICK_STAIRS, Ingredient.of(Items.QUARTZ_BRICKS))
                        .unlockedBy(getHasName(Items.QUARTZ_BRICKS), this.has(Items.QUARTZ_BRICKS))
                        .group("quartz_brick_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BLOCK);

                this.quartzBrickSlab(QuartzItems.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_SLAB, Items.QUARTZ_BLOCK);

                this.brickWall(QuartzItems.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_WALL, Items.QUARTZ_BLOCK);

                this.shaped(RecipeCategory.DECORATIONS, QuartzItems.QUARTZ_FLOWER_POT)
                        .define('#', Items.QUARTZ)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy(getHasName(Items.QUARTZ), this.has(Items.QUARTZ))
                        .group("quartz_flower_pot")
                        .save(this.output);

                this.chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK, Ingredient.of(QuartzBlocks.ROSE_QUARTZ_SLAB))
                        .unlockedBy("has_chiseled_rose_quartz_block", this.has(QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK))
                        .unlockedBy("has_rose_quartz_block", this.has(QuartzBlocks.ROSE_QUARTZ_BLOCK))
                        .unlockedBy("has_rose_quartz_pillar", this.has(QuartzBlocks.ROSE_QUARTZ_PILLAR))
                        .group("chiseled_quartz_block")
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.ROSE_QUARTZ_PILLAR, 2)
                        .define('#', QuartzBlocks.ROSE_QUARTZ_BLOCK)
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_chiseled_rose_quartz_block", this.has(QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK))
                        .unlockedBy("has_rose_quartz_block", this.has(QuartzBlocks.ROSE_QUARTZ_BLOCK))
                        .unlockedBy("has_rose_quartz_pillar", this.has(QuartzBlocks.ROSE_QUARTZ_PILLAR))
                        .group("quartz_pillar")
                        .save(this.output);

                this.quartzTwoByTwoPacker(QuartzBlocks.ROSE_QUARTZ_BLOCK, QuartzItems.ROSE_QUARTZ);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.ROSE_QUARTZ_BRICKS, 4)
                        .define('#', QuartzBlocks.ROSE_QUARTZ_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy("has_rose_quartz_block", this.has(QuartzBlocks.ROSE_QUARTZ_BLOCK))
                        .group("quartz_bricks")
                        .save(this.output);
                this.slabBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.ROSE_QUARTZ_SLAB, Ingredient.of(QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK, QuartzBlocks.ROSE_QUARTZ_BLOCK, QuartzBlocks.ROSE_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_rose_quartz_block", this.has(QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK))
                        .unlockedBy("has_rose_quartz_block", this.has(QuartzBlocks.ROSE_QUARTZ_BLOCK))
                        .unlockedBy("has_rose_quartz_pillar", this.has(QuartzBlocks.ROSE_QUARTZ_PILLAR))
                        .group("quartz_slab")
                        .save(this.output);
                this.stairBuilder(QuartzBlocks.ROSE_QUARTZ_STAIRS, Ingredient.of(QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK, QuartzBlocks.ROSE_QUARTZ_BLOCK, QuartzBlocks.ROSE_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_rose_quartz_block", this.has(QuartzBlocks.CHISELED_ROSE_QUARTZ_BLOCK))
                        .unlockedBy("has_rose_quartz_block", this.has(QuartzBlocks.ROSE_QUARTZ_BLOCK))
                        .unlockedBy("has_rose_quartz_pillar", this.has(QuartzBlocks.ROSE_QUARTZ_PILLAR))
                        .group("quartz_stairs")
                        .save(this.output);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.ROSE_QUARTZ_STAIRS, QuartzItems.ROSE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.ROSE_QUARTZ_SLAB, QuartzItems.ROSE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.ROSE_QUARTZ_BRICKS, QuartzItems.ROSE_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.NETHER_ROSE_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.ROSE_QUARTZ,
                                0.2F,
                                200
                        )
                        .unlockedBy("has_nether_rose_quartz_ore", this.has(QuartzBlocks.NETHER_ROSE_QUARTZ_ORE))
                        .save(this.output);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.ROSE_QUARTZ_BLOCK),
                                RecipeCategory.BUILDING_BLOCKS,
                                CookingBookCategory.BLOCKS,
                                QuartzItems.SMOOTH_ROSE_QUARTZ,
                                0.1F,
                                200
                        )
                        .unlockedBy("has_rose_quartz_block", this.has(QuartzBlocks.ROSE_QUARTZ_BLOCK))
                        .save(this.output);

                this.stairBuilder(QuartzItems.SMOOTH_ROSE_QUARTZ_STAIRS, Ingredient.of(QuartzItems.SMOOTH_ROSE_QUARTZ))
                        .unlockedBy(getHasName(QuartzItems.SMOOTH_ROSE_QUARTZ), this.has(QuartzItems.SMOOTH_ROSE_QUARTZ))
                        .group("smooth_quartz_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_ROSE_QUARTZ_STAIRS, QuartzItems.SMOOTH_ROSE_QUARTZ);
                this.smoothQuartzSlab(QuartzItems.SMOOTH_ROSE_QUARTZ_SLAB, QuartzItems.SMOOTH_ROSE_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_ROSE_QUARTZ_SLAB, QuartzItems.SMOOTH_ROSE_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CHISELED_ROSE_QUARTZ_BLOCK, QuartzItems.ROSE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.ROSE_QUARTZ_BRICK_STAIRS, QuartzItems.ROSE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.ROSE_QUARTZ_BRICK_SLAB, QuartzItems.ROSE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.ROSE_QUARTZ_BRICK_WALL, QuartzItems.ROSE_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.blasting(
                        Ingredient.of(QuartzBlocks.NETHER_ROSE_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.ROSE_QUARTZ,
                                0.2F,
                                100
                        )
                        .unlockedBy("has_nether_rose_quartz_ore", this.has(QuartzBlocks.NETHER_ROSE_QUARTZ_ORE))
                        .save(this.output, getBlastingRecipeName(QuartzItems.ROSE_QUARTZ));

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.ROSE_QUARTZ_PILLAR, QuartzBlocks.ROSE_QUARTZ_BLOCK);

                this.quartzPressurePlate(QuartzItems.ROSE_QUARTZ_PRESSURE_PLATE, QuartzItems.ROSE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.ROSE_QUARTZ_PRESSURE_PLATE, QuartzItems.ROSE_QUARTZ_BLOCK, 4);

                this.buttonBuilder(QuartzItems.ROSE_QUARTZ_BUTTON, Ingredient.of(QuartzItems.ROSE_QUARTZ_BLOCK))
                        .unlockedBy(getHasName(QuartzItems.ROSE_QUARTZ_BLOCK), this.has(QuartzItems.ROSE_QUARTZ_BLOCK))
                        .group("quartz_button")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.ROSE_QUARTZ_BUTTON, QuartzItems.ROSE_QUARTZ_BLOCK, 4);

                this.smeltingResultFromBase(QuartzItems.CRACKED_ROSE_QUARTZ_BRICKS, QuartzItems.ROSE_QUARTZ_BRICKS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_ROSE_QUARTZ_BRICK_STAIRS, QuartzItems.ROSE_QUARTZ_BRICK_STAIRS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_ROSE_QUARTZ_BRICK_SLAB, QuartzItems.ROSE_QUARTZ_BRICK_SLAB);
                this.smeltingResultFromBase(QuartzItems.CRACKED_ROSE_QUARTZ_BRICK_WALL, QuartzItems.ROSE_QUARTZ_BRICK_WALL);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_ROSE_QUARTZ_BRICK_STAIRS, QuartzItems.CRACKED_ROSE_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_ROSE_QUARTZ_BRICK_SLAB, QuartzItems.CRACKED_ROSE_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_ROSE_QUARTZ_BRICK_WALL, QuartzItems.CRACKED_ROSE_QUARTZ_BRICKS);

                this.stairBuilder(QuartzItems.ROSE_QUARTZ_BRICK_STAIRS, Ingredient.of(QuartzItems.ROSE_QUARTZ_BRICKS))
                        .unlockedBy(getHasName(QuartzItems.ROSE_QUARTZ_BRICKS), this.has(QuartzItems.ROSE_QUARTZ_BRICKS))
                        .group("quartz_brick_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.ROSE_QUARTZ_BRICK_STAIRS, QuartzItems.ROSE_QUARTZ_BRICKS);

                this.quartzBrickSlab(QuartzItems.ROSE_QUARTZ_BRICK_SLAB, QuartzItems.ROSE_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.ROSE_QUARTZ_BRICK_SLAB, QuartzItems.ROSE_QUARTZ_BRICKS);

                this.brickWall(QuartzItems.ROSE_QUARTZ_BRICK_WALL, QuartzItems.ROSE_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.ROSE_QUARTZ_BRICK_WALL, QuartzItems.ROSE_QUARTZ_BRICKS);

                this.shaped(RecipeCategory.DECORATIONS, QuartzItems.ROSE_QUARTZ_FLOWER_POT)
                        .define('#', QuartzItems.ROSE_QUARTZ)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy(getHasName(QuartzItems.ROSE_QUARTZ), this.has(QuartzItems.ROSE_QUARTZ))
                        .group("quartz_flower_pot")
                        .save(this.output);

                this.chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK, Ingredient.of(QuartzBlocks.LEMON_QUARTZ_SLAB))
                        .unlockedBy("has_chiseled_lemon_quartz_block", this.has(QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK))
                        .unlockedBy("has_lemon_quartz_block", this.has(QuartzBlocks.LEMON_QUARTZ_BLOCK))
                        .unlockedBy("has_lemon_quartz_pillar", this.has(QuartzBlocks.LEMON_QUARTZ_PILLAR))
                        .group("chiseled_quartz_block")
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.LEMON_QUARTZ_PILLAR, 2)
                        .define('#', QuartzBlocks.LEMON_QUARTZ_BLOCK)
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_chiseled_lemon_quartz_block", this.has(QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK))
                        .unlockedBy("has_lemon_quartz_block", this.has(QuartzBlocks.LEMON_QUARTZ_BLOCK))
                        .unlockedBy("has_lemon_quartz_pillar", this.has(QuartzBlocks.LEMON_QUARTZ_PILLAR))
                        .group("quartz_pillar")
                        .save(this.output);

                this.quartzTwoByTwoPacker(QuartzBlocks.LEMON_QUARTZ_BLOCK, QuartzItems.LEMON_QUARTZ);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.LEMON_QUARTZ_BRICKS, 4)
                        .define('#', QuartzBlocks.LEMON_QUARTZ_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy("has_lemon_quartz_block", this.has(QuartzBlocks.LEMON_QUARTZ_BLOCK))
                        .group("quartz_bricks")
                        .save(this.output);
                this.slabBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.LEMON_QUARTZ_SLAB, Ingredient.of(QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK, QuartzBlocks.LEMON_QUARTZ_BLOCK, QuartzBlocks.LEMON_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_lemon_quartz_block", this.has(QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK))
                        .unlockedBy("has_lemon_quartz_block", this.has(QuartzBlocks.LEMON_QUARTZ_BLOCK))
                        .unlockedBy("has_lemon_quartz_pillar", this.has(QuartzBlocks.LEMON_QUARTZ_PILLAR))
                        .group("quartz_slab")
                        .save(this.output);
                this.stairBuilder(QuartzBlocks.LEMON_QUARTZ_STAIRS, Ingredient.of(QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK, QuartzBlocks.LEMON_QUARTZ_BLOCK, QuartzBlocks.LEMON_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_lemon_quartz_block", this.has(QuartzBlocks.CHISELED_LEMON_QUARTZ_BLOCK))
                        .unlockedBy("has_lemon_quartz_block", this.has(QuartzBlocks.LEMON_QUARTZ_BLOCK))
                        .unlockedBy("has_lemon_quartz_pillar", this.has(QuartzBlocks.LEMON_QUARTZ_PILLAR))
                        .group("quartz_stairs")
                        .save(this.output);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.LEMON_QUARTZ_STAIRS, QuartzItems.LEMON_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.LEMON_QUARTZ_SLAB, QuartzItems.LEMON_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.LEMON_QUARTZ_BRICKS, QuartzItems.LEMON_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.NETHER_LEMON_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.LEMON_QUARTZ,
                                0.2F,
                                200
                        )
                        .unlockedBy("has_nether_lemon_quartz_ore", this.has(QuartzBlocks.NETHER_LEMON_QUARTZ_ORE))
                        .save(this.output);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.LEMON_QUARTZ_BLOCK),
                                RecipeCategory.BUILDING_BLOCKS,
                                CookingBookCategory.BLOCKS,
                                QuartzItems.SMOOTH_LEMON_QUARTZ,
                                0.1F,
                                200
                        )
                        .unlockedBy("has_lemon_quartz_block", this.has(QuartzBlocks.LEMON_QUARTZ_BLOCK))
                        .save(this.output);

                this.stairBuilder(QuartzItems.SMOOTH_LEMON_QUARTZ_STAIRS, Ingredient.of(QuartzItems.SMOOTH_LEMON_QUARTZ))
                        .unlockedBy(getHasName(QuartzItems.SMOOTH_LEMON_QUARTZ), this.has(QuartzItems.SMOOTH_LEMON_QUARTZ))
                        .group("smooth_quartz_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_LEMON_QUARTZ_STAIRS, QuartzItems.SMOOTH_LEMON_QUARTZ);
                this.smoothQuartzSlab(QuartzItems.SMOOTH_LEMON_QUARTZ_SLAB, QuartzItems.SMOOTH_LEMON_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_LEMON_QUARTZ_SLAB, QuartzItems.SMOOTH_LEMON_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CHISELED_LEMON_QUARTZ_BLOCK, QuartzItems.LEMON_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.LEMON_QUARTZ_BRICK_STAIRS, QuartzItems.LEMON_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.LEMON_QUARTZ_BRICK_SLAB, QuartzItems.LEMON_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.LEMON_QUARTZ_BRICK_WALL, QuartzItems.LEMON_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.blasting(
                                Ingredient.of(QuartzBlocks.NETHER_LEMON_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.LEMON_QUARTZ,
                                0.2F,
                                100
                        )
                        .unlockedBy("has_nether_lemon_quartz_ore", this.has(QuartzBlocks.NETHER_LEMON_QUARTZ_ORE))
                        .save(this.output, getBlastingRecipeName(QuartzItems.LEMON_QUARTZ));

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.LEMON_QUARTZ_PILLAR, QuartzBlocks.LEMON_QUARTZ_BLOCK);

                this.quartzPressurePlate(QuartzItems.LEMON_QUARTZ_PRESSURE_PLATE, QuartzItems.LEMON_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.LEMON_QUARTZ_PRESSURE_PLATE, QuartzItems.LEMON_QUARTZ_BLOCK, 4);

                this.buttonBuilder(QuartzItems.LEMON_QUARTZ_BUTTON, Ingredient.of(QuartzItems.LEMON_QUARTZ_BLOCK))
                        .unlockedBy(getHasName(QuartzItems.LEMON_QUARTZ_BLOCK), this.has(QuartzItems.LEMON_QUARTZ_BLOCK))
                        .group("quartz_button")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.LEMON_QUARTZ_BUTTON, QuartzItems.LEMON_QUARTZ_BLOCK, 4);

                this.smeltingResultFromBase(QuartzItems.CRACKED_LEMON_QUARTZ_BRICKS, QuartzItems.LEMON_QUARTZ_BRICKS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_LEMON_QUARTZ_BRICK_STAIRS, QuartzItems.LEMON_QUARTZ_BRICK_STAIRS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_LEMON_QUARTZ_BRICK_SLAB, QuartzItems.LEMON_QUARTZ_BRICK_SLAB);
                this.smeltingResultFromBase(QuartzItems.CRACKED_LEMON_QUARTZ_BRICK_WALL, QuartzItems.LEMON_QUARTZ_BRICK_WALL);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_LEMON_QUARTZ_BRICK_STAIRS, QuartzItems.CRACKED_LEMON_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_LEMON_QUARTZ_BRICK_SLAB, QuartzItems.CRACKED_LEMON_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_LEMON_QUARTZ_BRICK_WALL, QuartzItems.CRACKED_LEMON_QUARTZ_BRICKS);

                this.stairBuilder(QuartzItems.LEMON_QUARTZ_BRICK_STAIRS, Ingredient.of(QuartzItems.LEMON_QUARTZ_BRICKS))
                        .unlockedBy(getHasName(QuartzItems.LEMON_QUARTZ_BRICKS), this.has(QuartzItems.LEMON_QUARTZ_BRICKS))
                        .group("quartz_brick_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.LEMON_QUARTZ_BRICK_STAIRS, QuartzItems.LEMON_QUARTZ_BRICKS);

                this.quartzBrickSlab(QuartzItems.LEMON_QUARTZ_BRICK_SLAB, QuartzItems.LEMON_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.LEMON_QUARTZ_BRICK_SLAB, QuartzItems.LEMON_QUARTZ_BRICKS);

                this.brickWall(QuartzItems.LEMON_QUARTZ_BRICK_WALL, QuartzItems.LEMON_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.LEMON_QUARTZ_BRICK_WALL, QuartzItems.LEMON_QUARTZ_BRICKS);

                this.shaped(RecipeCategory.DECORATIONS, QuartzItems.LEMON_QUARTZ_FLOWER_POT)
                        .define('#', QuartzItems.LEMON_QUARTZ)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy(getHasName(QuartzItems.LEMON_QUARTZ), this.has(QuartzItems.LEMON_QUARTZ))
                        .group("quartz_flower_pot")
                        .save(this.output);

                this.chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK, Ingredient.of(QuartzBlocks.GREEN_QUARTZ_SLAB))
                        .unlockedBy("has_chiseled_green_quartz_block", this.has(QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK))
                        .unlockedBy("has_green_quartz_block", this.has(QuartzBlocks.GREEN_QUARTZ_BLOCK))
                        .unlockedBy("has_green_quartz_pillar", this.has(QuartzBlocks.GREEN_QUARTZ_PILLAR))
                        .group("chiseled_quartz_block")
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.GREEN_QUARTZ_PILLAR, 2)
                        .define('#', QuartzBlocks.GREEN_QUARTZ_BLOCK)
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_chiseled_green_quartz_block", this.has(QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK))
                        .unlockedBy("has_green_quartz_block", this.has(QuartzBlocks.GREEN_QUARTZ_BLOCK))
                        .unlockedBy("has_green_quartz_pillar", this.has(QuartzBlocks.GREEN_QUARTZ_PILLAR))
                        .group("quartz_pillar")
                        .save(this.output);

                this.quartzTwoByTwoPacker(QuartzBlocks.GREEN_QUARTZ_BLOCK, QuartzItems.GREEN_QUARTZ);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.GREEN_QUARTZ_BRICKS, 4)
                        .define('#', QuartzBlocks.GREEN_QUARTZ_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy("has_green_quartz_block", this.has(QuartzBlocks.GREEN_QUARTZ_BLOCK))
                        .group("quartz_bricks")
                        .save(this.output);
                this.slabBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.GREEN_QUARTZ_SLAB, Ingredient.of(QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK, QuartzBlocks.GREEN_QUARTZ_BLOCK, QuartzBlocks.GREEN_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_green_quartz_block", this.has(QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK))
                        .unlockedBy("has_green_quartz_block", this.has(QuartzBlocks.GREEN_QUARTZ_BLOCK))
                        .unlockedBy("has_green_quartz_pillar", this.has(QuartzBlocks.GREEN_QUARTZ_PILLAR))
                        .group("quartz_slab")
                        .save(this.output);
                this.stairBuilder(QuartzBlocks.GREEN_QUARTZ_STAIRS, Ingredient.of(QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK, QuartzBlocks.GREEN_QUARTZ_BLOCK, QuartzBlocks.GREEN_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_green_quartz_block", this.has(QuartzBlocks.CHISELED_GREEN_QUARTZ_BLOCK))
                        .unlockedBy("has_green_quartz_block", this.has(QuartzBlocks.GREEN_QUARTZ_BLOCK))
                        .unlockedBy("has_green_quartz_pillar", this.has(QuartzBlocks.GREEN_QUARTZ_PILLAR))
                        .group("quartz_stairs")
                        .save(this.output);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.GREEN_QUARTZ_STAIRS, QuartzItems.GREEN_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.GREEN_QUARTZ_SLAB, QuartzItems.GREEN_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.GREEN_QUARTZ_BRICKS, QuartzItems.GREEN_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.NETHER_GREEN_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.GREEN_QUARTZ,
                                0.2F,
                                200
                        )
                        .unlockedBy("has_nether_green_quartz_ore", this.has(QuartzBlocks.NETHER_GREEN_QUARTZ_ORE))
                        .save(this.output);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.GREEN_QUARTZ_BLOCK),
                                RecipeCategory.BUILDING_BLOCKS,
                                CookingBookCategory.BLOCKS,
                                QuartzItems.SMOOTH_GREEN_QUARTZ,
                                0.1F,
                                200
                        )
                        .unlockedBy("has_green_quartz_block", this.has(QuartzBlocks.GREEN_QUARTZ_BLOCK))
                        .save(this.output);

                this.stairBuilder(QuartzItems.SMOOTH_GREEN_QUARTZ_STAIRS, Ingredient.of(QuartzItems.SMOOTH_GREEN_QUARTZ))
                        .unlockedBy(getHasName(QuartzItems.SMOOTH_GREEN_QUARTZ), this.has(QuartzItems.SMOOTH_GREEN_QUARTZ))
                        .group("smooth_quartz_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_GREEN_QUARTZ_STAIRS, QuartzItems.SMOOTH_GREEN_QUARTZ);
                this.smoothQuartzSlab(QuartzItems.SMOOTH_GREEN_QUARTZ_SLAB, QuartzItems.SMOOTH_GREEN_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_GREEN_QUARTZ_SLAB, QuartzItems.SMOOTH_GREEN_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CHISELED_GREEN_QUARTZ_BLOCK, QuartzItems.GREEN_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.GREEN_QUARTZ_BRICK_STAIRS, QuartzItems.GREEN_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.GREEN_QUARTZ_BRICK_SLAB, QuartzItems.GREEN_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.GREEN_QUARTZ_BRICK_WALL, QuartzItems.GREEN_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.blasting(
                                Ingredient.of(QuartzBlocks.NETHER_GREEN_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.GREEN_QUARTZ,
                                0.2F,
                                100
                        )
                        .unlockedBy("has_nether_green_quartz_ore", this.has(QuartzBlocks.NETHER_GREEN_QUARTZ_ORE))
                        .save(this.output, getBlastingRecipeName(QuartzItems.GREEN_QUARTZ));

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.GREEN_QUARTZ_PILLAR, QuartzBlocks.GREEN_QUARTZ_BLOCK);

                this.quartzPressurePlate(QuartzItems.GREEN_QUARTZ_PRESSURE_PLATE, QuartzItems.GREEN_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.GREEN_QUARTZ_PRESSURE_PLATE, QuartzItems.GREEN_QUARTZ_BLOCK, 4);

                this.buttonBuilder(QuartzItems.GREEN_QUARTZ_BUTTON, Ingredient.of(QuartzItems.GREEN_QUARTZ_BLOCK))
                        .unlockedBy(getHasName(QuartzItems.GREEN_QUARTZ_BLOCK), this.has(QuartzItems.GREEN_QUARTZ_BLOCK))
                        .group("quartz_button")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.GREEN_QUARTZ_BUTTON, QuartzItems.GREEN_QUARTZ_BLOCK, 4);

                this.smeltingResultFromBase(QuartzItems.CRACKED_GREEN_QUARTZ_BRICKS, QuartzItems.GREEN_QUARTZ_BRICKS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_GREEN_QUARTZ_BRICK_STAIRS, QuartzItems.GREEN_QUARTZ_BRICK_STAIRS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_GREEN_QUARTZ_BRICK_SLAB, QuartzItems.GREEN_QUARTZ_BRICK_SLAB);
                this.smeltingResultFromBase(QuartzItems.CRACKED_GREEN_QUARTZ_BRICK_WALL, QuartzItems.GREEN_QUARTZ_BRICK_WALL);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_GREEN_QUARTZ_BRICK_STAIRS, QuartzItems.CRACKED_GREEN_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_GREEN_QUARTZ_BRICK_SLAB, QuartzItems.CRACKED_GREEN_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_GREEN_QUARTZ_BRICK_WALL, QuartzItems.CRACKED_GREEN_QUARTZ_BRICKS);

                this.stairBuilder(QuartzItems.GREEN_QUARTZ_BRICK_STAIRS, Ingredient.of(QuartzItems.GREEN_QUARTZ_BRICKS))
                        .unlockedBy(getHasName(QuartzItems.GREEN_QUARTZ_BRICKS), this.has(QuartzItems.GREEN_QUARTZ_BRICKS))
                        .group("quartz_brick_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.GREEN_QUARTZ_BRICK_STAIRS, QuartzItems.GREEN_QUARTZ_BRICKS);

                this.quartzBrickSlab(QuartzItems.GREEN_QUARTZ_BRICK_SLAB, QuartzItems.GREEN_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.GREEN_QUARTZ_BRICK_SLAB, QuartzItems.GREEN_QUARTZ_BRICKS);

                this.brickWall(QuartzItems.GREEN_QUARTZ_BRICK_WALL, QuartzItems.GREEN_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.GREEN_QUARTZ_BRICK_WALL, QuartzItems.GREEN_QUARTZ_BRICKS);

                this.shaped(RecipeCategory.DECORATIONS, QuartzItems.GREEN_QUARTZ_FLOWER_POT)
                        .define('#', QuartzItems.GREEN_QUARTZ)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy(getHasName(QuartzItems.GREEN_QUARTZ), this.has(QuartzItems.GREEN_QUARTZ))
                        .group("quartz_flower_pot")
                        .save(this.output);

                this.chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK, Ingredient.of(QuartzBlocks.BLUE_QUARTZ_SLAB))
                        .unlockedBy("has_chiseled_blue_quartz_block", this.has(QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK))
                        .unlockedBy("has_blue_quartz_block", this.has(QuartzBlocks.BLUE_QUARTZ_BLOCK))
                        .unlockedBy("has_blue_quartz_pillar", this.has(QuartzBlocks.BLUE_QUARTZ_PILLAR))
                        .group("chiseled_quartz_block")
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.BLUE_QUARTZ_PILLAR, 2)
                        .define('#', QuartzBlocks.BLUE_QUARTZ_BLOCK)
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_chiseled_blue_quartz_block", this.has(QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK))
                        .unlockedBy("has_blue_quartz_block", this.has(QuartzBlocks.BLUE_QUARTZ_BLOCK))
                        .unlockedBy("has_blue_quartz_pillar", this.has(QuartzBlocks.BLUE_QUARTZ_PILLAR))
                        .group("quartz_pillar")
                        .save(this.output);

                this.quartzTwoByTwoPacker(QuartzBlocks.BLUE_QUARTZ_BLOCK, QuartzItems.BLUE_QUARTZ);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.BLUE_QUARTZ_BRICKS, 4)
                        .define('#', QuartzBlocks.BLUE_QUARTZ_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy("has_blue_quartz_block", this.has(QuartzBlocks.BLUE_QUARTZ_BLOCK))
                        .group("quartz_bricks")
                        .save(this.output);
                this.slabBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.BLUE_QUARTZ_SLAB, Ingredient.of(QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK, QuartzBlocks.BLUE_QUARTZ_BLOCK, QuartzBlocks.BLUE_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_blue_quartz_block", this.has(QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK))
                        .unlockedBy("has_blue_quartz_block", this.has(QuartzBlocks.BLUE_QUARTZ_BLOCK))
                        .unlockedBy("has_blue_quartz_pillar", this.has(QuartzBlocks.BLUE_QUARTZ_PILLAR))
                        .group("quartz_slab")
                        .save(this.output);
                this.stairBuilder(QuartzBlocks.BLUE_QUARTZ_STAIRS, Ingredient.of(QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK, QuartzBlocks.BLUE_QUARTZ_BLOCK, QuartzBlocks.BLUE_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_blue_quartz_block", this.has(QuartzBlocks.CHISELED_BLUE_QUARTZ_BLOCK))
                        .unlockedBy("has_blue_quartz_block", this.has(QuartzBlocks.BLUE_QUARTZ_BLOCK))
                        .unlockedBy("has_blue_quartz_pillar", this.has(QuartzBlocks.BLUE_QUARTZ_PILLAR))
                        .group("quartz_stairs")
                        .save(this.output);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.BLUE_QUARTZ_STAIRS, QuartzItems.BLUE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.BLUE_QUARTZ_SLAB, QuartzItems.BLUE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.BLUE_QUARTZ_BRICKS, QuartzItems.BLUE_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.NETHER_BLUE_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.BLUE_QUARTZ,
                                0.2F,
                                200
                        )
                        .unlockedBy("has_nether_blue_quartz_ore", this.has(QuartzBlocks.NETHER_BLUE_QUARTZ_ORE))
                        .save(this.output);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.BLUE_QUARTZ_BLOCK),
                                RecipeCategory.BUILDING_BLOCKS,
                                CookingBookCategory.BLOCKS,
                                QuartzItems.SMOOTH_BLUE_QUARTZ,
                                0.1F,
                                200
                        )
                        .unlockedBy("has_blue_quartz_block", this.has(QuartzBlocks.BLUE_QUARTZ_BLOCK))
                        .save(this.output);

                this.stairBuilder(QuartzItems.SMOOTH_BLUE_QUARTZ_STAIRS, Ingredient.of(QuartzItems.SMOOTH_BLUE_QUARTZ))
                        .unlockedBy(getHasName(QuartzItems.SMOOTH_BLUE_QUARTZ), this.has(QuartzItems.SMOOTH_BLUE_QUARTZ))
                        .group("smooth_quartz_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_BLUE_QUARTZ_STAIRS, QuartzItems.SMOOTH_BLUE_QUARTZ);
                this.smoothQuartzSlab(QuartzItems.SMOOTH_BLUE_QUARTZ_SLAB, QuartzItems.SMOOTH_BLUE_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_BLUE_QUARTZ_SLAB, QuartzItems.SMOOTH_BLUE_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CHISELED_BLUE_QUARTZ_BLOCK, QuartzItems.BLUE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.BLUE_QUARTZ_BRICK_STAIRS, QuartzItems.BLUE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.BLUE_QUARTZ_BRICK_SLAB, QuartzItems.BLUE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.BLUE_QUARTZ_BRICK_WALL, QuartzItems.BLUE_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.blasting(
                                Ingredient.of(QuartzBlocks.NETHER_BLUE_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.BLUE_QUARTZ,
                                0.2F,
                                100
                        )
                        .unlockedBy("has_nether_blue_quartz_ore", this.has(QuartzBlocks.NETHER_BLUE_QUARTZ_ORE))
                        .save(this.output, getBlastingRecipeName(QuartzItems.BLUE_QUARTZ));

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.BLUE_QUARTZ_PILLAR, QuartzBlocks.BLUE_QUARTZ_BLOCK);

                this.quartzPressurePlate(QuartzItems.BLUE_QUARTZ_PRESSURE_PLATE, QuartzItems.BLUE_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.BLUE_QUARTZ_PRESSURE_PLATE, QuartzItems.BLUE_QUARTZ_BLOCK, 4);

                this.buttonBuilder(QuartzItems.BLUE_QUARTZ_BUTTON, Ingredient.of(QuartzItems.BLUE_QUARTZ_BLOCK))
                        .unlockedBy(getHasName(QuartzItems.BLUE_QUARTZ_BLOCK), this.has(QuartzItems.BLUE_QUARTZ_BLOCK))
                        .group("quartz_button")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.BLUE_QUARTZ_BUTTON, QuartzItems.BLUE_QUARTZ_BLOCK, 4);

                this.smeltingResultFromBase(QuartzItems.CRACKED_BLUE_QUARTZ_BRICKS, QuartzItems.BLUE_QUARTZ_BRICKS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_BLUE_QUARTZ_BRICK_STAIRS, QuartzItems.BLUE_QUARTZ_BRICK_STAIRS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_BLUE_QUARTZ_BRICK_SLAB, QuartzItems.BLUE_QUARTZ_BRICK_SLAB);
                this.smeltingResultFromBase(QuartzItems.CRACKED_BLUE_QUARTZ_BRICK_WALL, QuartzItems.BLUE_QUARTZ_BRICK_WALL);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_BLUE_QUARTZ_BRICK_STAIRS, QuartzItems.CRACKED_BLUE_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_BLUE_QUARTZ_BRICK_SLAB, QuartzItems.CRACKED_BLUE_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_BLUE_QUARTZ_BRICK_WALL, QuartzItems.CRACKED_BLUE_QUARTZ_BRICKS);

                this.stairBuilder(QuartzItems.BLUE_QUARTZ_BRICK_STAIRS, Ingredient.of(QuartzItems.BLUE_QUARTZ_BRICKS))
                        .unlockedBy(getHasName(QuartzItems.BLUE_QUARTZ_BRICKS), this.has(QuartzItems.BLUE_QUARTZ_BRICKS))
                        .group("quartz_brick_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.BLUE_QUARTZ_BRICK_STAIRS, QuartzItems.BLUE_QUARTZ_BRICKS);

                this.quartzBrickSlab(QuartzItems.BLUE_QUARTZ_BRICK_SLAB, QuartzItems.BLUE_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.BLUE_QUARTZ_BRICK_SLAB, QuartzItems.BLUE_QUARTZ_BRICKS);

                this.brickWall(QuartzItems.BLUE_QUARTZ_BRICK_WALL, QuartzItems.BLUE_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.BLUE_QUARTZ_BRICK_WALL, QuartzItems.BLUE_QUARTZ_BRICKS);

                this.shaped(RecipeCategory.DECORATIONS, QuartzItems.BLUE_QUARTZ_FLOWER_POT)
                        .define('#', QuartzItems.BLUE_QUARTZ)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy(getHasName(QuartzItems.BLUE_QUARTZ), this.has(QuartzItems.BLUE_QUARTZ))
                        .group("quartz_flower_pot")
                        .save(this.output);

                this.chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK, Ingredient.of(QuartzBlocks.SMOKY_QUARTZ_SLAB))
                        .unlockedBy("has_chiseled_smoky_quartz_block", this.has(QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK))
                        .unlockedBy("has_smoky_quartz_block", this.has(QuartzBlocks.SMOKY_QUARTZ_BLOCK))
                        .unlockedBy("has_smoky_quartz_pillar", this.has(QuartzBlocks.SMOKY_QUARTZ_PILLAR))
                        .group("chiseled_quartz_block")
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.SMOKY_QUARTZ_PILLAR, 2)
                        .define('#', QuartzBlocks.SMOKY_QUARTZ_BLOCK)
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_chiseled_smoky_quartz_block", this.has(QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK))
                        .unlockedBy("has_smoky_quartz_block", this.has(QuartzBlocks.SMOKY_QUARTZ_BLOCK))
                        .unlockedBy("has_smoky_quartz_pillar", this.has(QuartzBlocks.SMOKY_QUARTZ_PILLAR))
                        .group("quartz_pillar")
                        .save(this.output);

                this.quartzTwoByTwoPacker(QuartzBlocks.SMOKY_QUARTZ_BLOCK, QuartzItems.SMOKY_QUARTZ);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.SMOKY_QUARTZ_BRICKS, 4)
                        .define('#', QuartzBlocks.SMOKY_QUARTZ_BLOCK)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy("has_smoky_quartz_block", this.has(QuartzBlocks.SMOKY_QUARTZ_BLOCK))
                        .group("quartz_bricks")
                        .save(this.output);
                this.slabBuilder(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.SMOKY_QUARTZ_SLAB, Ingredient.of(QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK, QuartzBlocks.SMOKY_QUARTZ_BLOCK, QuartzBlocks.SMOKY_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_smoky_quartz_block", this.has(QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK))
                        .unlockedBy("has_smoky_quartz_block", this.has(QuartzBlocks.SMOKY_QUARTZ_BLOCK))
                        .unlockedBy("has_smoky_quartz_pillar", this.has(QuartzBlocks.SMOKY_QUARTZ_PILLAR))
                        .group("quartz_slab")
                        .save(this.output);
                this.stairBuilder(QuartzBlocks.SMOKY_QUARTZ_STAIRS, Ingredient.of(QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK, QuartzBlocks.SMOKY_QUARTZ_BLOCK, QuartzBlocks.SMOKY_QUARTZ_PILLAR))
                        .unlockedBy("has_chiseled_smoky_quartz_block", this.has(QuartzBlocks.CHISELED_SMOKY_QUARTZ_BLOCK))
                        .unlockedBy("has_smoky_quartz_block", this.has(QuartzBlocks.SMOKY_QUARTZ_BLOCK))
                        .unlockedBy("has_smoky_quartz_pillar", this.has(QuartzBlocks.SMOKY_QUARTZ_PILLAR))
                        .group("quartz_stairs")
                        .save(this.output);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOKY_QUARTZ_STAIRS, QuartzItems.SMOKY_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOKY_QUARTZ_SLAB, QuartzItems.SMOKY_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOKY_QUARTZ_BRICKS, QuartzItems.SMOKY_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.NETHER_SMOKY_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.SMOKY_QUARTZ,
                                0.2F,
                                200
                        )
                        .unlockedBy("has_nether_smoky_quartz_ore", this.has(QuartzBlocks.NETHER_SMOKY_QUARTZ_ORE))
                        .save(this.output);

                SimpleCookingRecipeBuilder.smelting(
                                Ingredient.of(QuartzBlocks.SMOKY_QUARTZ_BLOCK),
                                RecipeCategory.BUILDING_BLOCKS,
                                CookingBookCategory.BLOCKS,
                                QuartzItems.SMOOTH_SMOKY_QUARTZ,
                                0.1F,
                                200
                        )
                        .unlockedBy("has_smoky_quartz_block", this.has(QuartzBlocks.SMOKY_QUARTZ_BLOCK))
                        .save(this.output);

                this.stairBuilder(QuartzItems.SMOOTH_SMOKY_QUARTZ_STAIRS, Ingredient.of(QuartzItems.SMOOTH_SMOKY_QUARTZ))
                        .unlockedBy(getHasName(QuartzItems.SMOOTH_SMOKY_QUARTZ), this.has(QuartzItems.SMOOTH_SMOKY_QUARTZ))
                        .group("smooth_quartz_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_SMOKY_QUARTZ_STAIRS, QuartzItems.SMOOTH_SMOKY_QUARTZ);
                this.smoothQuartzSlab(QuartzItems.SMOOTH_SMOKY_QUARTZ_SLAB, QuartzItems.SMOOTH_SMOKY_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOOTH_SMOKY_QUARTZ_SLAB, QuartzItems.SMOOTH_SMOKY_QUARTZ);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CHISELED_SMOKY_QUARTZ_BLOCK, QuartzItems.SMOKY_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOKY_QUARTZ_BRICK_STAIRS, QuartzItems.SMOKY_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOKY_QUARTZ_BRICK_SLAB, QuartzItems.SMOKY_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOKY_QUARTZ_BRICK_WALL, QuartzItems.SMOKY_QUARTZ_BLOCK);

                SimpleCookingRecipeBuilder.blasting(
                                Ingredient.of(QuartzBlocks.NETHER_SMOKY_QUARTZ_ORE),
                                RecipeCategory.MISC,
                                CookingBookCategory.MISC,
                                QuartzItems.SMOKY_QUARTZ,
                                0.2F,
                                100
                        )
                        .unlockedBy("has_nether_smoky_quartz_ore", this.has(QuartzBlocks.NETHER_SMOKY_QUARTZ_ORE))
                        .save(this.output, getBlastingRecipeName(QuartzItems.SMOKY_QUARTZ));

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzBlocks.SMOKY_QUARTZ_PILLAR, QuartzBlocks.SMOKY_QUARTZ_BLOCK);

                this.quartzPressurePlate(QuartzItems.SMOKY_QUARTZ_PRESSURE_PLATE, QuartzItems.SMOKY_QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.SMOKY_QUARTZ_PRESSURE_PLATE, QuartzItems.SMOKY_QUARTZ_BLOCK, 4);

                this.buttonBuilder(QuartzItems.SMOKY_QUARTZ_BUTTON, Ingredient.of(QuartzItems.SMOKY_QUARTZ_BLOCK))
                        .unlockedBy(getHasName(QuartzItems.SMOKY_QUARTZ_BLOCK), this.has(QuartzItems.SMOKY_QUARTZ_BLOCK))
                        .group("quartz_button")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.SMOKY_QUARTZ_BUTTON, QuartzItems.SMOKY_QUARTZ_BLOCK, 4);

                this.smeltingResultFromBase(QuartzItems.CRACKED_SMOKY_QUARTZ_BRICKS, QuartzItems.SMOKY_QUARTZ_BRICKS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_SMOKY_QUARTZ_BRICK_STAIRS, QuartzItems.SMOKY_QUARTZ_BRICK_STAIRS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_SMOKY_QUARTZ_BRICK_SLAB, QuartzItems.SMOKY_QUARTZ_BRICK_SLAB);
                this.smeltingResultFromBase(QuartzItems.CRACKED_SMOKY_QUARTZ_BRICK_WALL, QuartzItems.SMOKY_QUARTZ_BRICK_WALL);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_SMOKY_QUARTZ_BRICK_STAIRS, QuartzItems.CRACKED_SMOKY_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_SMOKY_QUARTZ_BRICK_SLAB, QuartzItems.CRACKED_SMOKY_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.CRACKED_SMOKY_QUARTZ_BRICK_WALL, QuartzItems.CRACKED_SMOKY_QUARTZ_BRICKS);

                this.stairBuilder(QuartzItems.SMOKY_QUARTZ_BRICK_STAIRS, Ingredient.of(QuartzItems.SMOKY_QUARTZ_BRICKS))
                        .unlockedBy(getHasName(QuartzItems.SMOKY_QUARTZ_BRICKS), this.has(QuartzItems.SMOKY_QUARTZ_BRICKS))
                        .group("quartz_brick_stairs")
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOKY_QUARTZ_BRICK_STAIRS, QuartzItems.SMOKY_QUARTZ_BRICKS);

                this.quartzBrickSlab(QuartzItems.SMOKY_QUARTZ_BRICK_SLAB, QuartzItems.SMOKY_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOKY_QUARTZ_BRICK_SLAB, QuartzItems.SMOKY_QUARTZ_BRICKS);

                this.brickWall(QuartzItems.SMOKY_QUARTZ_BRICK_WALL, QuartzItems.SMOKY_QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.SMOKY_QUARTZ_BRICK_WALL, QuartzItems.SMOKY_QUARTZ_BRICKS);

                this.shaped(RecipeCategory.DECORATIONS, QuartzItems.SMOKY_QUARTZ_FLOWER_POT)
                        .define('#', QuartzItems.SMOKY_QUARTZ)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy(getHasName(QuartzItems.SMOKY_QUARTZ), this.has(QuartzItems.SMOKY_QUARTZ))
                        .group("quartz_flower_pot")
                        .save(this.output);
            }

            private void quartzTwoByTwoPacker(final ItemLike result, final ItemLike ingredient) {
                this.shaped(RecipeCategory.BUILDING_BLOCKS, result, 1)
                        .define('#', ingredient)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy(getHasName(ingredient), this.has(ingredient))
                        .group("quartz_block")
                        .save(this.output);
            }

            private void quartzPressurePlate(final ItemLike result, final ItemLike base) {
                this.pressurePlateBuilder(RecipeCategory.REDSTONE, result, Ingredient.of(base))
                        .unlockedBy(getHasName(base), this.has(base))
                        .group("quartz_pressure_plate")
                        .save(this.output);
            }

            private void smoothQuartzSlab(final ItemLike result, final ItemLike base) {
                this.slabBuilder(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.of(base))
                        .unlockedBy(getHasName(base), this.has(base))
                        .group("smooth_quartz_slab")
                        .save(this.output);
            }

            private void quartzBrickSlab(final ItemLike result, final ItemLike base) {
                this.slabBuilder(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.of(base))
                        .unlockedBy(getHasName(base), this.has(base))
                        .group("quartz_brick_slab")
                        .save(this.output);
            }

            private void brickWall(final ItemLike result, final ItemLike base) {
                this.wallBuilder(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.of(base))
                        .unlockedBy(getHasName(base), this.has(base))
                        .group("quartz_brick_wall")
                        .save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Quartz Recipe Provider";
    }
}
