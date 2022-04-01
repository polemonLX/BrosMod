package pt.viki.brosmod.init;

import net.minecraft.block.Block;
import pt.viki.brosmod.blocks.pump.Pump;

/**
 * Author: Polemon
 * Creation date: 31/03/2022
 */
public enum Blocks {
    PUMP(new Pump("pump"));

    private final Block block;

    Blocks(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

    public String getName() {
        return block.getUnlocalizedName();
    }

}
