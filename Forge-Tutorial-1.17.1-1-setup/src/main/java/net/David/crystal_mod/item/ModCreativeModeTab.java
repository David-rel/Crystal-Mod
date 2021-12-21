package net.David.crystal_mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CRYSTAL_MOD_TAB = new CreativeModeTab("CrystalModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OPAL.get());
        }
    };
}
