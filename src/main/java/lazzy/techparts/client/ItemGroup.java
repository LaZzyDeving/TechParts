package lazzy.techparts.client;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class ItemGroup extends CreativeModeTab {

    protected String domain, id;
    protected Supplier<ItemStack> iconSupplier;


    public ItemGroup(String domain, String id, Supplier<ItemStack> iconSupplier) {
        super(domain + "." + id);
        this.domain = domain;
        this.id = id;
        this.iconSupplier = iconSupplier;
    }

    public String getDomain() {
        return domain;
    }

    public String getGroupId() {
        return id;
    }

    @Override
    public ItemStack makeIcon() {
        return iconSupplier.get();
    }
}

