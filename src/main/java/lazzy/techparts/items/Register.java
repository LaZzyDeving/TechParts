package lazzy.techparts.items;

import lazzy.techparts.Ref;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;


public class Register{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ref.ID);



    //public static RegistryObject<Item> computer_monitor = createItemWithTooltip("computer_monitor");

    public static void init(){

    }

    public static <T extends Item> RegistryObject<Item> createbasicItem(String id){
        return ITEMS.register(id, () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_BREWING)));
    }
    public static <T extends Item> RegistryObject<Item> createItemWithTooltip(String id) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_BREWING)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel,List<Component> components, TooltipFlag ptflag) {
                if(Screen.hasShiftDown()){
                    components.add(new TranslatableComponent("tooltip.techparts."+id));

                } else {
                    components.add(new TranslatableComponent("tooltip.techparts.shiftup"));
                }
            }
        });
    }



    private static <T extends Item> RegistryObject<Item> createNumberedItemWithTooltip(String id,int numberid, Item.Properties properties) {
        return ITEMS.register(id+"_"+numberid, () -> new Item(properties.tab(CreativeModeTab.TAB_BREWING)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel,List<Component> components, TooltipFlag pisAdvanced) {
                if(Screen.hasShiftDown()){
                    components.add(new TranslatableComponent("tooltip.techparts."+id+"."+String.valueOf(numberid)));

                } else {
                    components.add(new TranslatableComponent("tooltip.techparts."+id+"."+String.valueOf(numberid)));
                }
            }
        });
    }
}
