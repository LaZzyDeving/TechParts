package lazzy.techparts.datagen;

import lazzy.techparts.items.materials.MatPartItem;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.silentchaos512.lib.registry.ItemRegistryObject;

import static lazzy.techparts.Ref.ID;
import static lazzy.techparts.TechParts.ITEM_GROUP;
import static lazzy.techparts.setup.MatDeclaration.MATERIAL_PART_ITEMS;


public class LangGenerator extends LanguageProvider {

    protected String local;

    public LangGenerator(DataGenerator gen,String local) {
        super(gen, ID, local);
        this.local = local;
    }



    @Override
    protected void addTranslations() {
        add("itemGroup."+ITEM_GROUP,"TechParts");


        switch (local){
            case "en_us":

                add("item.techparts.computer_monitor","Computer Monitor");
                add("item.techparts.gravi_star","Gravity Star");

                //Loop over all materials that exist
                for(ItemRegistryObject<? extends MatPartItem> materialParts: MATERIAL_PART_ITEMS){
                    addMaterialPartENG(materialParts.get());
                }
            break;
            default:
                break;
        }

    }

    protected void addMaterialPartENG(MatPartItem mP){
        String mName = mP.getMaterial().getName();
        String pName = mP.getPart().getName();
        Item item = mP.asItem();
        switch (mP.getPart()){
            case DENSEPLATE:
                this.add(item,"Dense "+mName+" Plate");
                break;
            case RAW:
                this.add(item,"Raw "+ mName+" Ore");
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
