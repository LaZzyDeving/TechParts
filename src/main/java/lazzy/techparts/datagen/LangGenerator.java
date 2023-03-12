package lazzy.techparts.datagen;

import lazzy.techparts.items.materials.MaterialParts;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

import static lazzy.techparts.Ref.*;
import static lazzy.techparts.items.materials.Materials.materialParts;


public class LangGenerator extends LanguageProvider {

    protected String local;

    public LangGenerator(DataGenerator gen,String local) {
        super(gen, ID, local);
        this.local = local;
    }



    @Override
    protected void addTranslations() {
        add("itemGroup."+TAB_ITEMS,"TechParts");


        switch (local){
            case "en_us":

                add("item.techparts.computer_monitor","Computer Monitor");
                //Loop over all materials that exist
                for(MaterialParts materialParts:materialParts){
                    addMaterialPartENG(materialParts);
                }
            break;
            default:
                break;
        }

    }

    protected void addMaterialPartENG(MaterialParts mP){
        Item item = mP.getItem().get();
        String mName = mP.getMaterial().getName();
        String pName = mP.getPart().getName();
        switch (mP.getPart()){
            case DENSEPLATE:
                add(item,"Dense "+mName+" Plate");
                break;
            case RAW:
                add(item,"Raw "+ mName+" Ore");
                break;
            case DUST:
            case INGOT:
            case GEM:
            case LENSE:
            default:
                add(item,mName+" "+ pName);
                break;
        }
    }

}
