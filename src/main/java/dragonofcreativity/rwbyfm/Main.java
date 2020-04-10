package dragonofcreativity.rwbyfm;

import dragonofcreativity.rwbyfm.creativetabs.RWBYFMTab;
import dragonofcreativity.rwbyfm.proxy.CommonProxy;
import dragonofcreativity.rwbyfm.util.Reference;
import io.github.blaezdev.rwbym.RWBYSoundHandler;
import io.github.blaezdev.rwbym.Init.RegUtil;
import io.github.blaezdev.rwbym.weaponry.RWBYHood;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:rwbym")
public class Main 
{
	public static final String MODID = "rwbyfm";
	
	public static final String VERSION = "1.0";
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs rwbyfmtab = new RWBYFMTab("rwbyfmtab");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final int GuiHardlightForge = 1;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
				
	}
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		System.out.println("RWBYM is installed: " + Loader.isModLoaded("rwbym"));
        if (event.getSide() == Side.CLIENT) {
            OBJLoader.INSTANCE.addDomain("rwbyfm");
        }
        RegUtil.registerAllRecipes(event);
        proxy.registerRenderers(this);
        RWBYSoundHandler.init();
	}


    @SubscribeEvent
    public void onEntityAttacked(LivingAttackEvent event) {
        EntityLivingBase base = event.getEntityLiving();
        ItemStack stack = base.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        if (stack != null && stack.getItem() instanceof RWBYHood) {
            RWBYHood Hood = (RWBYHood) stack.getItem();
            int damage = (int) event.getAmount();
            if(damage > 2){
            stack.damageItem(damage/2, base);}
        }
    }
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}
