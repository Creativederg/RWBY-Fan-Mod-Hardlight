package dragonofcreativity.rwbyfm.proxy;

import dragonofcreativity.rwbyfm.init.ItemInit;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber(modid = "rwbyfm")
public class CommonProxy 
{
	@SubscribeEvent
	public static void RegisterItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_PIERCING_LASER);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_ROCKET);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SNIPER);
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelEvent(final ModelRegistryEvent event) 
	{
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_PIERCING_LASER);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_ROCKET);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SNIPER);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerItemModel(Item parItem)
	{
		registerItemModel(parItem, 0);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerItemModel(Item parItem, int parMetaData)
	{
		ModelLoader.setCustomModelResourceLocation(parItem, parMetaData, new ModelResourceLocation(parItem.getRegistryName(), "inventory"));
	}

	public void registerItemRenderer(Item item, int meta, String id) {}
}
