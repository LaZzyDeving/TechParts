package lazzy.techparts.datagen;

import lazzy.techparts.items.MatPartItem;
import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static lazzy.techparts.Ref.ID;
import static lazzy.techparts.items.MatDeclaration.MATERIAL_PART_ITEMS;

public class ItemOverlayTexture extends ItemModelProvider {
    public ItemOverlayTexture(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ID, existingFileHelper);
    }

    //Model Datagen for Material Part Itemlikes
    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(new ResourceLocation("item/generated"));



        Material mat;
        Parts part;
        for(RegistryObject<? extends MatPartItem> mP: MATERIAL_PART_ITEMS){
            mat = mP.get().getMaterial();
            part = mP.get().getPart();
            //iId = String.valueOf(mP.getItem().getId());
            switch (part){
                case DUST:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(itemGenerated)
                            .texture("layer0",modLoc("item/material/"+mat.getStyle()+"/"+part.getID()));
                    break;
                case BOLT:
                case BUZZSAW_BLADE:
                case INGOT:
                case GEAR:
                case RAW:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(itemGenerated)
                        .texture("layer0",modLoc("item/material/"+mat.getStyle()+"/"+part.getID()))
                        .texture("layer1",modLoc("item/material/"+mat.getStyle()+"/"+part.getID()+"_overlay"));
                    break;
                default:
                    break;
            }
        }

/*        for(RegistryObject<? extends MatPartBlockItem> mP: MATERIAL_PART_BLOCKITEMS){
            mat = mP;
            part = mP.get().getPart();
            //iId = String.valueOf(mP.getItem().getId());
            switch (part){
                case DUST:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(itemGenerated)
                            .texture("layer0",modLoc("item/material/"+mat.getStyle()+"/"+part.getID()));
                    break;
                case BOLT:
                case BUZZSAW_BLADE:
                case INGOT:
                case GEAR:
                case RAW:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(itemGenerated)
                            .texture("layer0",modLoc("item/material/"+mat.getStyle()+"/"+part.getID()))
                            .texture("layer1",modLoc("item/material/"+mat.getStyle()+"/"+part.getID()+"_overlay"));
                    break;
                default:
                    break;
            }
        }*/

    }
}
