package io.github.maxxxxz.maclib.util;

import io.github.maxxxxz.maclib.blocks.GenericBlock;
import io.github.maxxxxz.maclib.blocks.GenericBlockItem;
import io.github.maxxxxz.maclib.items.GenericItem;
import io.github.maxxxxz.maclib.macLib;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, macLib.MOD_ID);//new DeferredRegister<>(ForgeRegistries.ITEMS, macLib.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, macLib.MOD_ID);//new DeferredRegister<>(ForgeRegistries.BLOCKS, macLib.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, macLib.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Adding Items (comment out AFTER TESTING)
    public static final RegistryObject<Item> GENERIC_ITEM =
            ITEMS.register("generic_item", () -> new GenericItem(new Item.Properties().group(macLib.TAB)));

    // Adding Blocks
    public static final RegistryObject<Block> GENERIC_BLOCK =
            BLOCKS.register("generic_block", () -> new GenericBlock());

    // Adding Block Items
    public static final RegistryObject<Item> GENERIC_BLOCK_ITEM =
            ITEMS.register("generic_block_item", () -> new GenericBlockItem(GENERIC_BLOCK.get()));

    // Adding Fluids
//    public static final RegistryObject<Fluid> GENERIC_FLUID =
//            FLUIDS.register("generic_fluid", () -> new GenericFluid());


}
