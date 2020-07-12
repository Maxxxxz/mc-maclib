package io.github.maxxxxz.maclib.util;

import io.github.maxxxxz.maclib.items.GenericItem;
import io.github.maxxxxz.maclib.macLib;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler{

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, macLib.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, macLib.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Adding Items (REMOVE AFTER TESTING)
    public static final RegistryObject<Item> GENERIC_ITEM =
            ITEMS.register("genericitem", () -> new GenericItem(new Item.Properties().group(macLib.TAB)));


    // Adding Blocks

    // Adding Block Items


}
