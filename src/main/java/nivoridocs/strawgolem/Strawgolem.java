package nivoridocs.strawgolem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nivoridocs.strawgolem.proxy.CommonProxy;

import org.apache.logging.log4j.Logger;

@Mod(
		modid = Strawgolem.MODID, name = Strawgolem.NAME,
		version = Strawgolem.VERSION, useMetadata = true)
public class Strawgolem {
    public static final String MODID = "strawgolem";
    public static final String NAME = "Straw Golem";
    public static final String VERSION = "1.1";

    @SidedProxy(
    		serverSide = "nivoridocs.strawgolem.proxy.ServerProxy",
    		clientSide = "nivoridocs.strawgolem.proxy.ClientProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static Strawgolem instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
}
