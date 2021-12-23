package net.David.crystal_mod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier CITRINE = new ForgeTier(1,1500,3f,
            4f,30, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.OPAL.get()));

    public static final ForgeTier RUBY_ZOISTE = new ForgeTier(5,10,5f,
            4f,20, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.RUBY_ZOISTE.get()));
}
