package lazzy.techparts;

import com.mojang.logging.LogUtils;
import lazzy.techparts.setup.Register;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static lazzy.techparts.items.TechPartsItems.COMPUTER_MONITOR;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(Ref.ID)
public class TechParts
{

    private static final Logger LOGGER = LogUtils.getLogger();

    public TechParts() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Will register all Items, including Blocks, and others
        Register.init(eventBus);



        // Whats this doing ?
        //eventBus.addListener(this::setup);



    }


    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");


    }

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(Ref.ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(COMPUTER_MONITOR);
        }
    };
}
