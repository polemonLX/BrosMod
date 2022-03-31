package pt.viki.brosmod.init;

import net.minecraft.block.Block;

/**
 * Author: Polemon
 * Creation date: 31/03/2022
 */
public enum Blocks {
    ;

    private final Block block;

    Blocks(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

}
