package com.nemonotfound.nemos.quartz.datagen;

import com.nemonotfound.nemos.quartz.world.item.QuartzItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class QuartzRecipeProvider extends FabricRecipeProvider {

    public QuartzRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                this.pressurePlate(QuartzItems.QUARTZ_PRESSURE_PLATE.get(), Items.QUARTZ_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.QUARTZ_PRESSURE_PLATE.get(), Items.QUARTZ_BLOCK, 4);

                this.buttonBuilder(QuartzItems.QUARTZ_BUTTON.get(), Ingredient.of(Items.QUARTZ_BLOCK))
                        .unlockedBy(getHasName(Items.QUARTZ_BLOCK), this.has(Items.QUARTZ_BLOCK))
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.REDSTONE, QuartzItems.QUARTZ_BUTTON.get(), Items.QUARTZ_BLOCK, 4);

                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICKS.get(), Items.QUARTZ_BRICKS);
                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICK_STAIRS.get(), QuartzItems.QUARTZ_BRICK_STAIRS.get());
                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICK_SLAB.get(), QuartzItems.QUARTZ_BRICK_SLAB.get());
                this.smeltingResultFromBase(QuartzItems.CRACKED_QUARTZ_BRICK_WALL.get(), QuartzItems.QUARTZ_BRICK_WALL.get());

                this.stairBuilder(QuartzItems.QUARTZ_BRICK_STAIRS.get(), Ingredient.of(Items.QUARTZ_BRICKS))
                        .unlockedBy(getHasName(Items.QUARTZ_BRICKS), this.has(Items.QUARTZ_BRICKS))
                        .save(this.output);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_STAIRS.get(), Items.QUARTZ_BRICKS);

                this.slab(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_SLAB.get(), Items.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_SLAB.get(), Items.QUARTZ_BRICKS);

                this.wall(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_WALL.get(), Items.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, QuartzItems.QUARTZ_BRICK_WALL.get(), Items.QUARTZ_BRICKS);

                this.shaped(RecipeCategory.DECORATIONS, QuartzItems.QUARTZ_FLOWER_POT.get())
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
