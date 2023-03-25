package lazzy.techparts.blocks;

import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;

public class MatPartBlockItem extends BlockItem{


    public MatPartBlockItem(MatPartBlock block, Properties p_40566_) {
        super(block, p_40566_);
    }

    public Material getMaterial(){
        return ((MatPartBlock) super.getBlock()).getMaterial();
    }

    public Parts getPart(){
        return ((MatPartBlock) super.getBlock()).getPart();
    }

    public int getItemColor(ItemStack stack, int i) {
        return this.getMaterial().getRbg();
    }


}
