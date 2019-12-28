package dragonofcreativity.rwbyfm.init;

import java.util.ArrayList;
import java.util.List;

import dragonofcreativity.rwbyfm.Main;
import dragonofcreativity.rwbyfm.objects.armour.ArmourBase;
import dragonofcreativity.rwbyfm.objects.items.ItemBase;
import dragonofcreativity.rwbyfm.objects.items.RWBYGunAddon;
import dragonofcreativity.rwbyfm.util.Reference;
import io.github.blaezdev.rwbym.Init.RWBYCreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_HARDLIGHT = EnumHelper.addToolMaterial("tool_hardlight", 3, 2500, 13.0F, 13.0F, 5);
	public static final ArmorMaterial ARMOR_HARDLIGHT = EnumHelper.addArmorMaterial("armour_hardlight", Reference.MODID + ":hardlight", 33, new int[]{10, 10, 10, 10}, 5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
	
	//Items
	public static final Item RIQOCHET_HOLOGRAPH_SCYTHE_HEAD = new ItemBase("riqochet_holograph_scythe_head", Main.rwbyfmtab);
	public static final Item RIQOCHET_HOLOGRAPH_SCYTHE_BLADE_CENTRE = new ItemBase("riqochet_holograph_scythe_blade_centre", Main.rwbyfmtab);
	public static final Item RIQOCHET_HOLOGRAPH_SCYTHE_BlADE_FRONT = new ItemBase("riqochet_holograph_scythe_blade_front", Main.rwbyfmtab);
	public static final Item RIQOCHET_HOLOGRAPH_SCYTHE_BlADE_BACK = new ItemBase("riqochet_holograph_scythe_blade_back", Main.rwbyfmtab);
	public static final Item RIQOCHET_HOLOGRAPH_SCYTHE_STAFF = new ItemBase("riqochet_holograph_scythe_staff", Main.rwbyfmtab);
	public static final Item RIQOCHET_HOLOGRAPH_SCYTHE_END = new ItemBase("riqochet_holograph_scythe_end", Main.rwbyfmtab);
	public static final Item INGOT_HARDLIGHT = new ItemBase("ingot_hardlight", Main.rwbyfmtab);
	public static final Item ICON = new ItemBase("icon", null);
	
	//Armour
	public static final Item HELMET_HARDLIGHT = new ArmourBase("helmet_hardlight", ARMOR_HARDLIGHT, 1, EntityEquipmentSlot.HEAD, Main.rwbyfmtab);
	public static final Item CHESTPLATE_HARDLIGHT = new ArmourBase("chestplate_hardlight", ARMOR_HARDLIGHT, 1, EntityEquipmentSlot.CHEST, Main.rwbyfmtab);
	public static final Item LEGGINGS_HARDLIGHT = new ArmourBase("leggings_hardlight", ARMOR_HARDLIGHT, 2, EntityEquipmentSlot.LEGS, Main.rwbyfmtab);
	public static final Item BOOTS_HARDLIGHT = new ArmourBase("boots_hardlight", ARMOR_HARDLIGHT, 1,EntityEquipmentSlot.FEET, Main.rwbyfmtab);
	
	//Weapons
	public static final Item RIQOCHET_HOLOGRAPH_SCYTHE = new RWBYGunAddon(
			"riqochet_holograph_scythe", 
			2500, 
			17, 
			RWBYGunAddon.SCYTHE, 
			"{AttributeModifiers:[{AttributeName:\"generic.attackDamage\",Name:\"generic.attackDamage\",Amount:18,Operation:0,UUIDLeast:571090,UUIDMost:892303,Slot:\"mainhand\"}]}", 
			"rwbyfm:riqochet_holograph_rocket", 
			"rwbym:ammov", 
			false,
            5,
            false,
            false,
            0,
            1,
            0,
            1, 
            Main.rwbyfmtab).setRecoil(5);
	public static final Item RIQOCHET_HOLOGRAPH_ROCKET = new RWBYGunAddon(
			"riqochet_holograph_rocket", 
			2500, 
			0, 
			0, 
			null, 
			"rwbyfm:riqochet_holograph_sniper", 
			"rwbym:ammov", 
			false, 
			5, 
			false, 
			false, 
			0, 
			1, 
			1, 
			1, 
			null).setRecoil(6);
	public static final Item RIQOCHET_HOLOGRAPH_SNIPER = new RWBYGunAddon(
			"riqochet_holograph_sniper", 
			2500, 
			0, 
			0, 
			null, 
			"rwbyfm:riqochet_holograph_piercing_laser", 
			"rwbym:ammov", 
			false, 
			2, 
			false, 
			false, 
			0, 
			1, 
			1, 
			1, 
			null).setRecoil(10);
	public static final Item RIQOCHET_HOLOGRAPH_PIERCING_LASER = new RWBYGunAddon(
			"riqochet_holograph_piercing_laser", 
			2500, 
			0,
			0,
			null,
			"rwbyfm:riqochet_holograph_scythe", 
			"rwbym:ammov",
			false,
			20,
			false,
			false,
			0,
			1,
			1,
			1,
			null).setRecoil(0);
	
	public static void registerAll(FMLPreInitializationEvent event){
		registerItems(event, ItemInit.BOOTS_HARDLIGHT);
		registerItems(event, ItemInit.CHESTPLATE_HARDLIGHT);
		registerItems(event, ItemInit.HELMET_HARDLIGHT);
		registerItems(event, ItemInit.ICON);
		registerItems(event, ItemInit.INGOT_HARDLIGHT);
		registerItems(event, ItemInit.LEGGINGS_HARDLIGHT);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_PIERCING_LASER);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_ROCKET);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_BlADE_BACK);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_BLADE_CENTRE);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_BlADE_FRONT);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_END);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_HEAD);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_SCYTHE_STAFF);
		registerItems(event, ItemInit.RIQOCHET_HOLOGRAPH_SNIPER);
	}

	private static void registerItems(FMLPreInitializationEvent event, Item...items) {
		//System.out.println("Registering Items");
		for(Item item : items){
			//System.out.println("Registering Item " + item.getUnlocalizedName().substring(5));
			if(event.getSide() == Side.CLIENT){
				ModelLoader.setCustomModelResourceLocation(item,0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
				//System.out.println("Item Model Registered");
			}
			ForgeRegistries.ITEMS.register(item);
			//System.out.println("Item Registered");
		}
	}
}
