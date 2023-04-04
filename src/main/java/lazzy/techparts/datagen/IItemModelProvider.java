package lazzy.techparts.datagen;

import lazzy.techparts.blocks.MatPartBlockItem;
import lazzy.techparts.fluids.TPFluidInstance;
import lazzy.techparts.items.BasicItem;
import lazzy.techparts.items.MatPartItem;
import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import lazzy.techparts.setup.Register;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.loaders.DynamicBucketModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static lazzy.techparts.Ref.ID;
import static lazzy.techparts.fluids.TPFluidDeclations.TP_FLUIDS;
import static lazzy.techparts.items.MatDeclaration.MATERIAL_PART_BLOCKITEMS;
import static lazzy.techparts.items.MatDeclaration.MATERIAL_PART_ITEMS;
import static lazzy.techparts.items.TechPartsItems.BASIC_ITEMS;

public class IItemModelProvider extends ItemModelProvider {
    public IItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
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
            switch (part){
                // Switch to look if there are some without overlay

                // NO Overlay - keep if I ever want to clean them up as many part overlays are empty for all material textures
                case GEM_FLAWLESS:
                case ORE_CLUMP:
                case CRYSTAL:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(itemGenerated)
                           .texture("layer0",modLoc("item/material/"+mat.getTexture()+"/"+part.getID()));
                    break;
                default:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(itemGenerated)
                        .texture("layer0",modLoc("item/material/"+mat.getTexture()+"/"+part.getID()))
                        .texture("layer1",modLoc("item/material/"+mat.getTexture()+"/"+part.getID()+"_overlay"));
                    break;

            }
        }

        for(RegistryObject<? extends MatPartBlockItem> mP: MATERIAL_PART_BLOCKITEMS) {
            mat = mP.get().getMaterial();
            part = mP.get().getPart();
            //iId = String.valueOf(mP.getItem().getId());
            switch (part){
                case FRAME:
                case BLOCK:
                    getBuilder(mat.getID()+"_"+part.getID()).parent(getExistingFile(ResourceLocation.tryParse("techparts:block/"+mat.getID()+"_"+part.getID())))
                            .texture("layer0","block/"+mat.getTexture()+"/"+part.getID());
                    break;
                default:
                    break;
            }
        }

        for (RegistryObject<BasicItem> item: BASIC_ITEMS) {
            getBuilder(String.valueOf(item.getId())).parent(itemGenerated)
                    .texture("layer0",modLoc("item/basic/"+item.get()));
        }




        for (TPFluidInstance fluid:TP_FLUIDS){
            withExistingParent(fluid.getBucketFluid().asItem().getRegistryName().getPath(), Register.forgeLoc("item/bucket"))
                    .customLoader(DynamicBucketModelBuilder::begin)
                    .fluid(fluid.getSourceFluid());
                    //.applyTint(true);
        }

    }


}
