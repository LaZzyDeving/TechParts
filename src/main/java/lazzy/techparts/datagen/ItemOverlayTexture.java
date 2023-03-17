package lazzy.techparts.datagen;

import lazzy.techparts.blocks.MatPartBlock;
import lazzy.techparts.items.materials.MatPartItem;
import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.silentchaos512.lib.registry.BlockRegistryObject;
import net.silentchaos512.lib.registry.ItemRegistryObject;

import static lazzy.techparts.Ref.ID;
import static lazzy.techparts.setup.MatDeclaration.MATERIAL_PART_BLOCKS;
import static lazzy.techparts.setup.MatDeclaration.MATERIAL_PART_ITEMS;

public class ItemOverlayTexture extends ItemModelProvider {
    public ItemOverlayTexture(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ID, existingFileHelper);
    }

    //TODO: FIX THIS
    //Model Datagen for Material Part Itemlikes
    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(new ResourceLocation("item/generated"));



        Material mat;
        Parts part;
        for(ItemRegistryObject<? extends MatPartItem> mP: MATERIAL_PART_ITEMS){
            mat = mP.get().getMaterial();
            part = mP.get().getPart();
            //iId = String.valueOf(mP.getItem().getId());
            switch (part){
                case DUST:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(itemGenerated)
                            .texture("layer0",modLoc("item/material/"+mat.getTexture()+"/"+part.getID()));
                    break;
                case BOLT:
                case BUZZSAW_BLADE:
                case INGOT:
                case GEAR:
                case RAW:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(itemGenerated)
                        .texture("layer0",modLoc("item/material/"+mat.getTexture()+"/"+part.getID()))
                        .texture("layer1",modLoc("item/material/"+mat.getTexture()+"/"+part.getID()+"_overlay"));
                    break;
                default:
                    break;
            }
        }
        for(BlockRegistryObject<? extends MatPartBlock> mP: MATERIAL_PART_BLOCKS){
            mat = mP.get().getMaterial();
            part = mP.get().getPart();
            switch (part){
                case FRAME:
                case BLOCK:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(getExistingFile(ResourceLocation.tryParse(ID+":block/"+mat.getID()+"_"+part.getID())))
                            .texture("layer0",modLoc("item/material/"+mat.getTexture()+"/"+part.getID()));
                    break;
                default:
                    break;
            }
        }

    }
}
