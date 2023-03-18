package lazzy.techparts.items;

import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import lazzy.techparts.setup.client.IColorHandler;
import lazzy.techparts.setup.Register;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class MatPartItem extends Item implements IColorHandler {

    private final Material material;
    private final Parts part;

    public MatPartItem(Material material, Parts part) {
        super(Register.baseProps());
        this.material = material;
        this.part = part;
    }


    public Material getMaterial() {
        return material;
    }

    public Parts getPart() {
        return part;
    }

    public int getItemColor(ItemStack stack, int i) {
        return this.getMaterial().getRbg();
    }
}
