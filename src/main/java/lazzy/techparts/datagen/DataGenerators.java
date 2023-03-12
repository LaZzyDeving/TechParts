package lazzy.techparts.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import static lazzy.techparts.Ref.ID;

@Mod.EventBusSubscriber(modid = ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        if( event.includeClient()){
            generator.addProvider(new ItemOverlayTexture(generator,event.getExistingFileHelper()));
            generator.addProvider(new LangGenerator(generator,"en_us"));
        }
    }

}
