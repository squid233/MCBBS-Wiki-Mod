package cn.mcbbswiki.qwerty5238.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockMcbbsWikiOre extends Block {
    public BlockMcbbsWikiOre(){
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(50)
                .harvestTool(ToolType.get("pickaxe"))
                .harvestLevel(3));
    }
}
