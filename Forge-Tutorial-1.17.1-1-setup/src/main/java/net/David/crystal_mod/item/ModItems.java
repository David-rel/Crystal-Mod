package net.David.crystal_mod.item;

import com.mojang.blaze3d.shaders.Effect;
import net.David.crystal_mod.CrystalMod;
import net.David.crystal_mod.item.custom.*;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrystalMod.MOD_ID);

    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new OpalItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));
    
    public static final RegistryObject<Item> ANYOLITE = ITEMS.register("anyolite",
            () -> new AnyoliteItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new CitrineItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> DUMORTIERTE = ITEMS.register("dumortierte",
            () -> new DumortierteItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new MoonstoneItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> RUBY_ZOISTE = ITEMS.register("ruby_zoiste",
            () -> new RubyZoisteItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> SACRAL_CHAKRA = ITEMS.register("sacral_chakra",
            () -> new SacralChakraItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> UNAKITE = ITEMS.register("unakite",
            () -> new UnakiteItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> PREHNITE = ITEMS.register("prehnite",
            () -> new PrehniteItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite",
            () -> new TanzaniteItem(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));



    public static final RegistryObject<Item> ANYOLITE_TOTEM = ITEMS.register("anyolite_totem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> MOONSTONE_MEAT = ITEMS.register("moonstone_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)
                    .food(new FoodProperties.Builder().meat().nutrition(3).saturationMod(5).build())));

    public static final RegistryObject<Item> SACRAL_CHAKRA_STAR = ITEMS.register("sacral_chakra_star",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> TANZANITE_POTION = ITEMS.register("tanzanite_potion",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));
    //opal shield
    //prehnite bed
    //how to work the anyolite totem
    //how to work the tanzanite potion
    //how to give effetcs to moon food


    public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe",
            () -> new PickaxeItem(ModTiers.CITRINE, 2, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register("citrine_axe",
            () -> new AxeItem(ModTiers.CITRINE, 5, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel",
            () -> new ShovelItem(ModTiers.CITRINE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register("citrine_hoe",
            () -> new HoeItem(ModTiers.CITRINE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));



    public static final RegistryObject<Item> RUBY_ZOISTE_PICKAXE = ITEMS.register("ruby_zoiste_pickaxe",
            () -> new PickaxeItem(ModTiers.RUBY_ZOISTE, 2, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> RUBY_ZOISTE_AXE = ITEMS.register("ruby_zoiste_axe",
            () -> new AxeItem(ModTiers.RUBY_ZOISTE, 5, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> RUBY_ZOISTE_SHOVEL = ITEMS.register("ruby_zoiste_shovel",
            () -> new ShovelItem(ModTiers.RUBY_ZOISTE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> RUBY_ZOISTE_HOE = ITEMS.register("ruby_zoiste_hoe",
            () -> new HoeItem(ModTiers.RUBY_ZOISTE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> RUBY_ZOISTE_SWORD = ITEMS.register("ruby_zoiste_sword",
            () -> new SwordItem(ModTiers.RUBY_ZOISTE, 4, 3f,
            new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));


    public static final RegistryObject<Item> UNAKITE_HELMET = ITEMS.register("unakite_helmet",
            () -> new ArmorItem(ModArmorMaterial.UNAKITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));



    public static final RegistryObject<Item> DUMORTIERTE_HELMET = ITEMS.register("dumortierte_helmet",
            () -> new ArmorItem(ModArmorMaterial.DUMORTIERTE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> DUMORTIERTE_CHESTPLATE = ITEMS.register("dumortierte_chestplate",
            () -> new ArmorItem(ModArmorMaterial.DUMORTIERTE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> DUMORTIERTE_LEGGINGS = ITEMS.register("dumortierte_leggings",
            () -> new ArmorItem(ModArmorMaterial.DUMORTIERTE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> DUMORTIERTE_BOOTS = ITEMS.register("dumortierte_boots",
            () -> new ArmorItem(ModArmorMaterial.DUMORTIERTE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> OPAL_HELMET = ITEMS.register("opal_helmet",
            () -> new ArmorItem(ModArmorMaterial.OPAL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> OPAL_CHESTPLATE = ITEMS.register("opal_chestplate",
            () -> new ArmorItem(ModArmorMaterial.OPAL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> OPAL_LEGGINGS = ITEMS.register("opal_leggings",
            () -> new ArmorItem(ModArmorMaterial.OPAL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));

    public static final RegistryObject<Item> OPAL_BOOTS = ITEMS.register("opal_boots",
            () -> new ArmorItem(ModArmorMaterial.OPAL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));



    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
