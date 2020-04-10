package dragonofcreativity.rwbyfm.init;

import java.util.ArrayList;
import java.util.List;

import dragonofcreativity.rwbyfm.Main;
import dragonofcreativity.rwbyfm.objects.blocks.RWBYFMHardlight_forge;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	

	public static final Block HARDLIGHT_FORGE = new RWBYFMHardlight_forge("hardlight_forge");
}
