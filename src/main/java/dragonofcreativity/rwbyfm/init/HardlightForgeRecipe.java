package dragonofcreativity.rwbyfm.init;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import io.github.blaezdev.rwbym.Init.RWBYItems;
import net.minecraft.item.ItemStack;

public class HardlightForgeRecipe 
{
	private static final HardlightForgeRecipe INSTANCE = new HardlightForgeRecipe();
    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static HardlightForgeRecipe getInstance()
    {
        return INSTANCE;
    }

    private HardlightForgeRecipe()
    {
    	addHardlightForgeRecipe(new ItemStack(RWBYItems.dustrock), new ItemStack(RWBYItems.chisel, 1, Short.MAX_VALUE), new ItemStack(RWBYItems.dustcrystal, 2), 3);
    }
    
    public void addHardlightForgeRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience)
    {
        if(getHardlightForgeResult(input1, input2) != ItemStack.EMPTY) return;
        this.smeltingList.put(input1, input2, result);
        this.experienceList.put(result, Float.valueOf(experience));
    }

    public ItemStack getHardlightForgeResult(ItemStack input1, ItemStack input2)
    {
        for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.rowMap().entrySet())
        {
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
            {
                for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
                {
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                    {
                        return (ItemStack)ent.getValue();
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == Short.MAX_VALUE || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
    {
        return this.smeltingList;
    }

    public float getHardlightForgeExperience(ItemStack stack)
    {
        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}
