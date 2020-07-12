package io.github.maxxxxz.maclib.blocks;

import io.github.maxxxxz.maclib.macLib;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class GenericBlockItem extends BlockItem {
    public GenericBlockItem(Block blockIn) {
        super(blockIn, new Item.Properties().group(macLib.TAB));
    }
}
