package dragonofcreativity.rwbyfm.proxy;

import dragonofcreativity.rwbyfm.Main;
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
	public static void registerItemModel(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_PIERCING_LASER);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_ROCKET);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SNIPER);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.ICON);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.INGOT_HARDLIGHT);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_BlADE_BACK);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_BLADE_CENTRE);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_BlADE_FRONT);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_END);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_HEAD);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_STAFF);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.HARDLIGHT_CORE);
		event.getRegistry().register(dragonofcreativity.rwbyfm.init.ItemInit.HARDLIGHT_CIRCUITRY);
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelEvent(final ModelRegistryEvent event) 
	{
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.ICON);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.INGOT_HARDLIGHT);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.HARDLIGHT_CORE);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.HARDLIGHT_CIRCUITRY);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_BlADE_BACK);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_BLADE_CENTRE);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_BlADE_FRONT);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_END);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_HEAD);
		registerItemModel(dragonofcreativity.rwbyfm.init.ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_STAFF);
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

	public void registerRenderers(Main main) {}
}
