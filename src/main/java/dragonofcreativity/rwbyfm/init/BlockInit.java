package dragonofcreativity.rwbyfm.init;

import java.util.ArrayList;
import java.util.List;

import dragonofcreativity.rwbyfm.Main;
import dragonofcreativity.rwbyfm.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_HARDLIGHT = new BlockBase("block_hardlight", Material.IRON, Main.rwbyfmtab, 5F, 0f, "pickaxe", 1);
	//public static final Block BLOCK_HARDLIGHT = new BlockBase("block_hardlight", Material.IRON, Main.rwbyfmtab); 
	
	private static void registerItems(FMLPreInitializationEvent event, Block...blocks) {
		//System.out.println("Registering Items");
		for(Block block : blocks){
			//System.out.println("Registering Item " + item.getUnlocalizedName().substring(5));
			if(event.getSide() == Side.CLIENT){
				//ModelLoader.setCustomModelResourceLocation(block,0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
				//System.out.println("Item Model Registered");
			}
			ForgeRegistries.BLOCKS.register(block);
			//System.out.println("Item Registered");
		}
	}
}
