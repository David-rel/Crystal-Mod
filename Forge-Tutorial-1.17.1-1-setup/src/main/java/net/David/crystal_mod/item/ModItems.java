package net.David.crystal_mod.item;

import net.David.crystal_mod.CrystalMod;
import net.David.crystal_mod.item.custom.*;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
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


    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }

}
