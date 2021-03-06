package pt.viki.brosmod.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import pt.viki.brosmod.BrosMod;

/**
 * Author: Polemon
 * Creation date: 31/03/2022
 */
@Mod.EventBusSubscriber(modid = BrosMod.MODID)
public class RegistryHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for (Items item : Items.values()) {
            event.getRegistry().register(item.getItem());
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        for (Blocks block : Blocks.values()) {
            event.getRegistry().register(block.getBlock());
        }
    }

    // TODO: 31/03/2022 Verificar se é necessário
    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        for (Blocks block : Blocks.values()) {
            event.getRegistry().register(new ItemBlock(block.getBlock()).setRegistryName(block.getName()));
        }
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        for (Blocks block : Blocks.values()) {
            Item item = Item.getItemFromBlock(block.getBlock());
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }

}
