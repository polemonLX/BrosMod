package pt.viki.brosmod.blocks.pump;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import pt.viki.brosmod.init.CreativeTab;

/**
 * Author: Polemon
 * Creation date: 31/03/2022
 */
public class Pump extends Block {

    public Pump(String name) {
        super(Material.IRON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTab.getInstance());
    }

}
