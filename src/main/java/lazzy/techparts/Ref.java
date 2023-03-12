package lazzy.techparts;

import lazzy.techparts.client.ItemGroup;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import java.util.function.Supplier;

import static net.minecraft.world.item.Items.IRON_INGOT;

public class Ref {

    /** Mod Data **/
    public static final String ID = "techparts";
    public static final String NAME = "TechParts";
    public static final String VERSION = "0.0.1";

    public static final ItemGroup TAB_ITEMS = new ItemGroup(ID, "items", () -> new ItemStack(IRON_INGOT));


}
