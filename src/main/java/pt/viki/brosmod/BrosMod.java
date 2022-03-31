package pt.viki.brosmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BrosMod.MODID, name = BrosMod.NAME, version = BrosMod.VERSION)
public class BrosMod {

    @Mod.Instance
    public static BrosMod instance;

    public static final String MODID = "brosmod";

    public static final String NAME = "Bros Mod";

    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(BrosMod.MODID + ":preInit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(BrosMod.MODID + ":init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(BrosMod.MODID + ":postInit");
    }

}
