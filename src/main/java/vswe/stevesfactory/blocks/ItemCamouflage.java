package vswe.stevesfactory.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import vswe.stevesfactory.StevesFactoryManager;
import vswe.stevesfactory.init.ModBlocks;
import vswe.stevesfactory.lib.ModInfo;
import vswe.stevesfactory.tiles.TileEntityCamouflage;

public class ItemCamouflage extends ItemBlock
{
    public ItemCamouflage(Block block)
    {
        super(block);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedName(ItemStack item)
    {
        return "tile." + ModInfo.UNLOCALIZED_START + TileEntityCamouflage.CamouflageType.values()[ModBlocks.blockCableCamouflage.getId(item.getItemDamage())].getUnlocalized();
    }
}
