package net.David.crystal_mod.blocks;

import net.David.crystal_mod.CrystalMod;
import net.David.crystal_mod.item.ModCreativeModeTab;
import net.David.crystal_mod.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CrystalMod.MOD_ID);

    public static final RegistryObject<Block> OPAL_ORE = registerBlock("opal_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ANYOLITE_ORE = registerBlock("anyolite_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DUMORTIERTE_ORE = registerBlock("dumortierte_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOONSTONE_ORE = registerBlock("moonstone_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PREHNITE_ORE = registerBlock("prehnite_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RUBY_ZOISTE_ORE = registerBlock("ruby_zoiste_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SACRAL_CHAKRA_ORE = registerBlock("sacral_chakra_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TANZANITE_ORE = registerBlock("tanzanite_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> UNKAITE_ORE = registerBlock("unakite_ore",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()));





    public static final RegistryObject<Block> ANYOLITE_BLOCK = registerBlock("anyolite_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DUMORTIERTE_BLOCK = registerBlock("dumortierte_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PREHNITE_BLOCK = registerBlock("prehnite_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RUBY_ZOISTE_BLOCK = registerBlock("ruby_zoiste_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SACRAL_CHAKRA_BLOCK = registerBlock("sacral_chakra_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> UNAKITE_BLOCK = registerBlock("unakite_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TANZANITE_BLOCK = registerBlock("tanzanite_block",() -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));











    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, String tooltipKey) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)) {
            @Override
            public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
                tooltip.add(new TranslatableComponent(tooltipKey));
                super.appendHoverText(stack, level, tooltip, flagIn);
            }
        });
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MOD_TAB)));
    }

    public static void register(IEventBus eventBus) {


        BLOCKS.register(eventBus);
    }
}
