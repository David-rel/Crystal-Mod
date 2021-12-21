package net.David.crystal_mod.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class OpalItem extends Item {
    public OpalItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component>
            pTooltipComponent, TooltipFlag pIsAdavanced) {

        if(Screen.hasShiftDown()){
            pTooltipComponent.add(new TranslatableComponent("tooltip.crystal_mod.opal"));
        }else{
            pTooltipComponent.add(new TranslatableComponent("tooltip.crystal_mod.opal_shift"));

        }

        super.appendHoverText(pStack, pLevel, pTooltipComponent, pIsAdavanced);


    }
}
