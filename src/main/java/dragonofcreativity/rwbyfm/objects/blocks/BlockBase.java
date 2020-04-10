package dragonofcreativity.rwbyfm.objects.blocks;

import dragonofcreativity.rwbyfm.Main;
import dragonofcreativity.rwbyfm.init.BlockInit;
import dragonofcreativity.rwbyfm.init.ItemInit;
import dragonofcreativity.rwbyfm.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block implements IHasModel{
    public BlockBase(String name, Material mat, CreativeTabs tab, float hardness, float resistance, String tool, int harvest) 
    {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(tab);
        setHarvestLevel(tool, harvest);
        
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}