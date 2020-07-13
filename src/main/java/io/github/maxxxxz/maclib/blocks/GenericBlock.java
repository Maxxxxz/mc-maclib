package io.github.maxxxxz.maclib.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GenericBlock extends Block {

    // Do not ever do this
    // I am only doing this to TEST
    // Should pass in Properties object

    public GenericBlock() {
        super(
                Block.Properties.
                        create(Material.WOOL)
                        .hardnessAndResistance(5.0f, 5.0f)
                        .sound(SoundType.CLOTH)
//                    .harvestLevel(0)
//                    .harvestTool(ToolType.AXE)
        );
    }

    public GenericBlock(Material mat, float hard, float res, SoundType snd, int harvestlvl, ToolType tool)
    {
        super(
                Block.Properties
                        .create(mat)
                        .hardnessAndResistance(hard, res)
                        .sound(snd)
                        .harvestLevel(harvestlvl)
                        .harvestTool(tool)
        );
    }


}
