package lazzy.techparts.items.materials;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class MaterialParts{

    private final Material material;
    private final Parts part;

    private RegistryObject<Item> item;

    public MaterialParts(Material material, Parts part) {
        this.material = material;
        this.part = part;
    }

    public MaterialParts(Material material, Parts part, RegistryObject<Item> item) {
        this.material = material;
        this.part = part;
        this.item = item;
    }

    public void setItem(RegistryObject<Item> item) {
        this.item = item;
    }

    public RegistryObject<Item> getItem() {
        return item;
    }

    public Material getMaterial() {
        return material;
    }

    public Parts getPart() {
        return part;
    }
}
