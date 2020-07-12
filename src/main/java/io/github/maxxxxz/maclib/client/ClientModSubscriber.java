package io.github.maxxxxz.maclib.client;

import io.github.maxxxxz.maclib.macLib;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = macLib.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(macLib.MOD_ID);

    // Client side setup here
    @SubscribeEvent
    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event)
    {
        // Don't need screenmanager for a client side gui I think?
//        LOGGER.info("Registered Phone Screen");
    }

    // add cape stuff here?

}
