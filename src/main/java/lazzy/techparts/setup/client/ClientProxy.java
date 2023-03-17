package lazzy.techparts.setup.client;

import lazzy.techparts.Ref;
import lazzy.techparts.blocks.MatPartBlock;
import lazzy.techparts.items.materials.MatPartItem;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.silentchaos512.lib.registry.BlockRegistryObject;
import net.silentchaos512.lib.registry.ItemRegistryObject;

import static lazzy.techparts.setup.MatDeclaration.MATERIAL_PART_BLOCKS;
import static lazzy.techparts.setup.MatDeclaration.MATERIAL_PART_ITEMS;

@Mod.EventBusSubscriber(value = Dist.CLIENT,modid = Ref.ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientProxy {

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        ItemColors itemColors = event.getItemColors();
        for(ItemRegistryObject<? extends MatPartItem> mp: MATERIAL_PART_ITEMS){
            itemColors.register((stack, index) -> index > 0 ? -1 : ((MatPartItem)mp.asItem()).getItemColor(stack, 0),mp.asItem());
        }


    }

    //TODO: Get that to work
    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event){
        BlockColors blockColors = event.getBlockColors();

        for (BlockRegistryObject<? extends MatPartBlock> block : MATERIAL_PART_BLOCKS) {

            blockColors.register(blockobj ->blockColors.register(new BlockColor(), blockobj.getBlock()));

            System.out.println("HEREZ: " + block);
            //if (block.asBlock() instanceof IColorHandler){
            //    event.getBlockColors().register((state, level, pos, tintIndex) -> block.get().getMaterial().getRbg(), block.get());
            //}

        }
    }

}
