package io.github.maxxxxz.maclib.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

public class ComplexBlock extends Block {

    // Do not ever do this
    // I am only doing this to TEST
    // Should pass in Properties object

    public ComplexBlock() {
        super(
                Properties.
                        create(Material.ANVIL)
                        .hardnessAndResistance(5.0f, 5.0f)
                        .sound(SoundType.METAL)
        );
    }

    public ComplexBlock(Material mat, float hard, float res, SoundType snd, int harvestlvl, ToolType tool)
    {
        super(
                Properties
                        .create(mat)
                        .hardnessAndResistance(hard, res)
                        .sound(snd)
                        .harvestLevel(harvestlvl)
                        .harvestTool(tool)
        );
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        LOGGER.info("Acitvated!");
//        NetworkHooks.openGui(player, , pos);
        return ActionResultType.SUCCESS;
    }
}
