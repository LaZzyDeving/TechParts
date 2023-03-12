package lazzy.techparts.datagen;

import lazzy.techparts.items.materials.MaterialParts;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static lazzy.techparts.Ref.ID;
import static lazzy.techparts.items.materials.Materials.materialParts;

public class ItemOverlayTexture extends ItemModelProvider {
    public ItemOverlayTexture(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        String mId;
        String pId;
        String mtexture;
        for(MaterialParts mP:materialParts){
            mId = mP.getMaterial().getID();
            pId = mP.getPart().getID();
            mtexture = mP.getMaterial().getTexture();
            singleTexture(mId+"/"+pId, // For 'assets/<modid>/models/item/example_item.json'
                    ResourceLocation.tryParse("item/generated"), // Set parent to 'minecraft:item/generated'
                            "frame", // For the texture key 'layer0'
                            modLoc("item/material/"+mtexture+"/"+mId+"_"+pId) // Set the reference to 'assets/<modid>/textures/item/example_texture.png'
                    );
        }
    }
}
