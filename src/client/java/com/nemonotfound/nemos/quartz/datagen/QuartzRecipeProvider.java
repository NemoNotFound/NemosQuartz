package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
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
                this.pressurePlate(QuartzItems.QUARTZ_PRESSURE_PLATE, Items.QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.QUARTZ_PRESSURE_PLATE, Items.QUARTZ_BLOCK, 4);

                this.buttonBuilder(QuartzItems.QUARTZ_BUTTON, Ingredient.of(Items.QUARTZ_BLOCK))
                        .unlockedBy(getHasName(Items.QUARTZ_BLOCK), this.has(Items.QUARTZ_BLOCK))
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.QUARTZ_BUTTON, Items.QUARTZ_BLOCK, 4);

                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICKS, Items.QUARTZ_BRICKS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICK_STAIRS, QuartzItems.QUARTZ_BRICK_STAIRS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICK_SLAB, QuartzItems.QUARTZ_BRICK_SLAB);
                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICK_WALL, QuartzItems.QUARTZ_BRICK_WALL);

                this.stairBuilder(QuartzItems.QUARTZ_BRICK_STAIRS, Ingredient.of(Items.QUARTZ_BRICKS))
                        .unlockedBy(getHasName(Items.QUARTZ_BRICKS), this.has(Items.QUARTZ_BRICKS))
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BRICKS);

                this.slab(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);

                this.wall(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);

                this.shaped(RecipeCategory.DECORATIONS, QuartzItems.QUARTZ_FLOWER_POT)
                        .define('#', Items.QUARTZ)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy(getHasName(Items.QUARTZ), this.has(Items.QUARTZ))
                        .save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Quartz Recipe Provider";
    }
}
