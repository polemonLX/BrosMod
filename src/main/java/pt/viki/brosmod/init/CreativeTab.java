package pt.viki.brosmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Author: Polemon
 * Creation date: 31/03/2022
 */
public class CreativeTab extends CreativeTabs {

    private static CreativeTab INSTANCE;

    private CreativeTab() {
        super(getNextID(), "Bro Mod");
    }

    public static CreativeTab getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CreativeTab();
        }
        return INSTANCE;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.QUARTZ);
    }

}
