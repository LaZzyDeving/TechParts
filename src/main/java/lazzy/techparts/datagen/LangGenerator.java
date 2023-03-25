package lazzy.techparts.datagen;

import lazzy.techparts.items.BasicItem;
import lazzy.techparts.items.MatPartItem;
import lazzy.techparts.blocks.MatPartBlockItem;
import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

import static lazzy.techparts.Ref.ID;
import static lazzy.techparts.items.MatDeclaration.MATERIAL_PART_BLOCKITEMS;
import static lazzy.techparts.items.MatDeclaration.MATERIAL_PART_ITEMS;
import static lazzy.techparts.items.TechPartsItems.BASIC_ITEMS;


public class LangGenerator extends LanguageProvider {

    protected String local;

    public LangGenerator(DataGenerator gen,String local) {
        super(gen, ID, local);
        this.local = local;
    }



    @Override
    protected void addTranslations() {
        add("itemGroup.techparts","TechParts");


        switch (local){
            case "en_us":

                //Loop over all materials that exist
                for(RegistryObject<MatPartItem> materialParts: MATERIAL_PART_ITEMS){
                    addMaterialPartENG(materialParts.get());
                }
                for(RegistryObject<MatPartBlockItem> materialParts: MATERIAL_PART_BLOCKITEMS){
                    addMaterialPartENG(materialParts.get());
                }
                for(RegistryObject<BasicItem> item:BASIC_ITEMS){
                    //ItemName
                    add(item.get(),item.get().getName());
                    //Item Tooltip
                    if(!(item.get().getTooltip() == null)){
                        add("tooltip.techparts."+item.get(),item.get().getTooltip());
                    }
                }
            break;
            default:
                break;
        }

    }

    protected void addMaterialPartENG(Item mP){
        Material mat = null;
        Parts part = null;
        if(mP instanceof MatPartItem){
            mat = ((MatPartItem) mP).getMaterial();
            part = ((MatPartItem) mP).getPart();
        }else if(mP instanceof MatPartBlockItem){
            mat = ((MatPartBlockItem) mP).getMaterial();
            part = ((MatPartBlockItem) mP).getPart();
        }
        String mName = mat.getName();
        String pName = part.getName();
        Item item = mP.asItem();
        switch (part){
            case PLATE_DENSE:
                this.add(item,"Dense "+mName+" Plate");
                break;
            case INGOT_HOT:
                this.add(item,"Hot "+mName+" Ingot");
                break;
            case GEAR_SMALL:
                this.add(item,"Small "+mName+" Gear");
                break;
            case WIRE:
                this.add(item,"Fine "+mName+" Wire");
                break;
            case ORE_RAW:
                this.add(item,"Raw "+ mName+" Ore");
                break;
            case ORE_CRUSHED:
                this.add(item,"Crushed "+ mName+" Ore");
                break;
            case ORE_CENTRIFUGED:
                this.add(item,"Centrifuged "+ mName+" Ore");
                break;
            case ORE_PURIFIED:
                this.add(item,"Purified "+ mName+" Ore");
                break;
            case DUST_SMALL:
                this.add(item,"Small "+mName+" Dust");
                break;
            case DUST_IMPURE:
                this.add(item,"Impure "+mName+" Dust");
                break;
            case DUST_PURE:
                this.add(item,"Pure "+mName+" Dust");
                break;
            case DUST_TINY:
                this.add(item,"Tiny "+mName+" Dust");
                break;
            case GEM_BRITTLE:
                this.add(item,"Brittle "+mName+" Gem");
                break;
            case GEM_POLISHED:
                this.add(item,"Polished "+mName+" Gem");
                break;
            case GEM_FLAWLESS:
                this.add(item,"Flawless "+mName+" Gem");
                break;
            case GEM_FLAWED:
                this.add(item,"Flawed "+mName+" Gem");
                break;
            case DUST:
            case INGOT:
            case GEM:
            case LENS:
            case FRAME:
            case BLOCK:
            default:
                add(item,mName+" "+ pName);
                break;
        }
    }

}
