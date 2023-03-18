package lazzy.techparts.setup.client;

import lazzy.techparts.Ref;
import lazzy.techparts.items.MatPartItem;
import lazzy.techparts.items.blocks.MatPartBlock;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static lazzy.techparts.items.MatDeclaration.MATERIAL_PART_BLOCKS;
import static lazzy.techparts.items.MatDeclaration.MATERIAL_PART_ITEMS;

@Mod.EventBusSubscriber(value = Dist.CLIENT,modid = Ref.ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientProxy {

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        ItemColors itemColors = event.getItemColors();
        for(RegistryObject<MatPartItem> mp: MATERIAL_PART_ITEMS){
            itemColors.register((stack, index) -> index > 0 ? -1 : mp.get().getItemColor(stack, 0),mp.get().asItem());
        }


    }

    //TODO: Get that to work
    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event){
        BlockColors blockColors = event.getBlockColors();

        for (RegistryObject<? extends MatPartBlock> block : MATERIAL_PART_BLOCKS) {

            //blockColors.register(blockobj ->blockColors.register(new BlockColor(), blockobj.getBlock()));

            System.out.println("HEREZ: " + block);

            event.getBlockColors().register((state, level, pos, tintIndex) -> block.get().getMaterial().getRbg(), block.get());


        }
    }

}
