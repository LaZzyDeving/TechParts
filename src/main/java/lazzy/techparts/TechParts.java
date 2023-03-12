package lazzy.techparts;

import com.mojang.logging.LogUtils;
import lazzy.techparts.items.materials.Materials;
import lazzy.techparts.items.TechPartsItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static lazzy.techparts.items.Register.ITEMS;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(Ref.ID)
public class TechParts
{

    private static final Logger LOGGER = LogUtils.getLogger();

    public TechParts() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Adds Items in ITEMS
        ITEMS.register(eventBus);

        //Create Items in ITEMS
        TechPartsItems.init();
        //Create Items from Materials
        Materials.init();








        eventBus.addListener(this::setup);
        // Items added in Register (ITEMS) are created
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
    }


}
