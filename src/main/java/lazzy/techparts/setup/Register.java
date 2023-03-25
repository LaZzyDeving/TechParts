package lazzy.techparts.setup;

import lazzy.techparts.blocks.TechPartsBlocks;
import lazzy.techparts.fluids.TPFluidDeclations;
import lazzy.techparts.items.MatDeclaration;
import lazzy.techparts.items.TechPartsItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

import static lazzy.techparts.Ref.ID;
import static lazzy.techparts.TechParts.ITEM_GROUP;


public class Register{
    public static void init(IEventBus eventBus){

        //Call up all MatPartItems to be created
        MatDeclaration.init();
        //Create Items in ITEMS
        TechPartsItems.init();
        TPFluidDeclations.init();

        TechPartsItems.ITEMS.register(eventBus);
        TechPartsBlocks.BLOCKS.register(eventBus);
        TPFluidDeclations.FLUIDS.register(eventBus);

        //TODO: MatFluids.FLUID_REGISTER.register(eventBus);

        //eventBus.addListener(ClientProxy::registerItemColors);
        //eventBus.addListener(ClientProxy::registerBlockColors);
    }


    public static Item.Properties baseProps() {
        return new Item.Properties().tab(ITEM_GROUP);
    }

    public static BlockBehaviour.Properties baseBlockProps() {
        return BlockBehaviour.Properties.of(Material.METAL);
    }



    //TODO: Fix this shit AKA Items with Tooltips
/*




    private static <T extends Item> ,RegistryObject<BasicItem> createNumberedItemWithTooltip(String id,int numberid, Item.Properties properties) {
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
    }*/

    /*
        Fluid Registry Start
     */


    public static ResourceLocation forgeLoc(String path){
        return new ResourceLocation("forge", path);
    }


    public static <T extends IForgeRegistryEntry<T>> DeferredRegister<T> create(IForgeRegistry<T> registry) {
        return DeferredRegister.create(registry, ID);
    }
}
