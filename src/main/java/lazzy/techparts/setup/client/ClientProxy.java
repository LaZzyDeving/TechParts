package lazzy.techparts.setup.client;

import lazzy.techparts.Ref;
import lazzy.techparts.items.MatPartItem;
import lazzy.techparts.blocks.MatPartBlock;
import lazzy.techparts.blocks.MatPartBlockItem;
import lazzy.techparts.items.materials.Parts;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static lazzy.techparts.items.MatDeclaration.*;

@Mod.EventBusSubscriber(value = Dist.CLIENT,modid = Ref.ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientProxy {

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        ItemColors itemColors = event.getItemColors();
        for(RegistryObject<MatPartItem> mp: MATERIAL_PART_ITEMS){
            itemColors.register((stack, index) -> index > 0 ? -1 : mp.get().getItemColor(stack, 0),mp.get().asItem());
        }
        for(RegistryObject<MatPartBlockItem> mp:MATERIAL_PART_BLOCKITEMS){
            itemColors.register((stack, index) -> index > 0 ? -1 : mp.get().getItemColor(stack, 0),mp.get().asItem());
        }

    }


    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event){

        for (RegistryObject<MatPartBlock> block : MATERIAL_PART_BLOCKS) {

            event.getBlockColors().register((state, level, pos, tintIndex) -> block.get().getMaterial().getRbg(), block.get());

            if (block.get().getPart() == Parts.FRAME){
                ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.translucent());
            }
        }
    }

}
