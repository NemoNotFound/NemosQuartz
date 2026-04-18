package com.nemonotfound.nemos.quartz.client.data.models.model;

import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;

import java.util.Optional;

import static com.nemonotfound.nemos.quartz.NemosQuartz.MOD_ID;

public class QuartzModelTemplates {

    public static final ModelTemplate QUARTZ_FLOWER_POT_CROSS = create("quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate TINTED_QUARTZ_FLOWER_POT_CROSS = create("tinted_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate QUARTZ_FLOWER_POT_CROSS_EMISSIVE = create("quartz_flower_pot_cross_emissive", TextureSlot.PLANT, TextureSlot.CROSS_EMISSIVE);
    public static final ModelTemplate QUARTZ_POTTED_AZALEA = create("quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate QUARTZ_POTTED_FLOWERING_AZALEA = create("quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate ROSE_QUARTZ_FLOWER_POT_CROSS = create("rose_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate TINTED_ROSE_QUARTZ_FLOWER_POT_CROSS = create("tinted_rose_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate ROSE_QUARTZ_FLOWER_POT_CROSS_EMISSIVE = create("rose_quartz_flower_pot_cross_emissive", TextureSlot.PLANT, TextureSlot.CROSS_EMISSIVE);
    public static final ModelTemplate ROSE_QUARTZ_POTTED_AZALEA = create("rose_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate ROSE_QUARTZ_POTTED_FLOWERING_AZALEA = create("rose_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate LEMON_QUARTZ_FLOWER_POT_CROSS = create("lemon_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate TINTED_LEMON_QUARTZ_FLOWER_POT_CROSS = create("tinted_lemon_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate LEMON_QUARTZ_FLOWER_POT_CROSS_EMISSIVE = create("lemon_quartz_flower_pot_cross_emissive", TextureSlot.PLANT, TextureSlot.CROSS_EMISSIVE);
    public static final ModelTemplate LEMON_QUARTZ_POTTED_AZALEA = create("lemon_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate LEMON_QUARTZ_POTTED_FLOWERING_AZALEA = create("lemon_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate GREEN_QUARTZ_FLOWER_POT_CROSS = create("green_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate TINTED_GREEN_QUARTZ_FLOWER_POT_CROSS = create("tinted_green_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate GREEN_QUARTZ_FLOWER_POT_CROSS_EMISSIVE = create("green_quartz_flower_pot_cross_emissive", TextureSlot.PLANT, TextureSlot.CROSS_EMISSIVE);
    public static final ModelTemplate GREEN_QUARTZ_POTTED_AZALEA = create("green_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate GREEN_QUARTZ_POTTED_FLOWERING_AZALEA = create("green_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate BLUE_QUARTZ_FLOWER_POT_CROSS = create("blue_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate TINTED_BLUE_QUARTZ_FLOWER_POT_CROSS = create("tinted_blue_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate BLUE_QUARTZ_FLOWER_POT_CROSS_EMISSIVE = create("blue_quartz_flower_pot_cross_emissive", TextureSlot.PLANT, TextureSlot.CROSS_EMISSIVE);
    public static final ModelTemplate BLUE_QUARTZ_POTTED_AZALEA = create("blue_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate BLUE_QUARTZ_POTTED_FLOWERING_AZALEA = create("blue_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate SMOKY_QUARTZ_FLOWER_POT_CROSS = create("smoky_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate TINTED_SMOKY_QUARTZ_FLOWER_POT_CROSS = create("tinted_smoky_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate SMOKY_QUARTZ_FLOWER_POT_CROSS_EMISSIVE = create("smoky_quartz_flower_pot_cross_emissive", TextureSlot.PLANT, TextureSlot.CROSS_EMISSIVE);
    public static final ModelTemplate SMOKY_QUARTZ_POTTED_AZALEA = create("smoky_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate SMOKY_QUARTZ_POTTED_FLOWERING_AZALEA = create("smoky_quartz_potted_azalea_bush_template", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);

    private static ModelTemplate create(String path, TextureSlot... textureSlots) {
        return new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(MOD_ID,"block/" + path)), Optional.empty(), textureSlots);
    }
}
