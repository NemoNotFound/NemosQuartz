package com.nemonotfound.nemos.quartz.client.data.models.model;

import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

import static com.nemonotfound.nemos.quartz.Constants.MOD_ID;

public class QuartzModelTemplates {

    public static final ModelTemplate QUARTZ_FLOWER_POT_CROSS = create("quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate TINTED_QUARTZ_FLOWER_POT_CROSS = create("tinted_quartz_flower_pot_cross", TextureSlot.PLANT);
    public static final ModelTemplate QUARTZ_FLOWER_POT_CROSS_EMISSIVE = create("quartz_flower_pot_cross_emissive", TextureSlot.PLANT, TextureSlot.CROSS_EMISSIVE);
    public static final ModelTemplate QUARTZ_POTTED_AZALEA = create("template_quartz_potted_azalea_bush", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate QUARTZ_POTTED_FLOWERING_AZALEA = create("template_quartz_potted_azalea_bush", TextureSlot.PLANT, TextureSlot.TOP, TextureSlot.SIDE);

    private static ModelTemplate create(String path, TextureSlot... textureSlots) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(MOD_ID,"block/" + path)), Optional.empty(), textureSlots);
    }
}
