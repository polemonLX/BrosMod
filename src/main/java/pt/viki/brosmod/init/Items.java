package pt.viki.brosmod.init;

import net.minecraft.item.Item;

/**
 * Author: Polemon
 * Creation date: 31/03/2022
 */
public enum Items {
    ;

    private final Item item;

    Items(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

}
