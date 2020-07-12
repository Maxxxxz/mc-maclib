package io.github.maxxxxz.maclib.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SnethBlock extends Block {

    public SnethBlock() {
        super(
                Block.Properties.
                        create(Material.WOOL)
                        .hardnessAndResistance(5.0f, 5.0f)
                        .sound(SoundType.CLOTH)
//                    .harvestLevel(0)
//                    .harvestTool(ToolType.AXE)
        );
    }
}
