package lazzy.techparts.items;

import lazzy.techparts.items.blocks.MatPartBlock;
import lazzy.techparts.items.blocks.MatPartBlockItem;
import lazzy.techparts.items.blocks.TechPartsBlocks;
import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import lazzy.techparts.setup.Register;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

import static lazzy.techparts.items.materials.Parts.*;

public class MatDeclaration{

    public static final DeferredRegister<Item> MAT_ITEMS = Register.create(ForgeRegistries.ITEMS);



    public static final Collection<RegistryObject<MatPartItem>> MATERIAL_PART_ITEMS = new ArrayList<>();
    public static final Collection<RegistryObject<MatPartBlock>> MATERIAL_PART_BLOCKS = new ArrayList<>();
    public static final Collection<RegistryObject<MatPartBlockItem>> MATERIAL_PART_BLOCKITEMS = new ArrayList<>();
    static EnumSet<Parts> metal = EnumSet.of(Parts.DUST,Parts.INGOT,Parts.RAW, NUGGET,BLOCK);
    static EnumSet<Parts> gem = EnumSet.of(Parts.GEM,Parts.LENSE);


    public static void init(){

        createMaterial(Material.CONSTANTAN,metal);
        createMaterial(Material.BRASS,metal);
        createMaterial(Material.MANASTEEL,metal);

    }

    public static void createMaterial(Material material, EnumSet<Parts> Group, Parts... whiteList){
        //Array that contains all parts from whitelist and group
        ArrayList<Parts> listOfParts = new ArrayList<Parts>(Arrays.asList(whiteList));
        listOfParts.addAll(Group);

        for(Parts part:listOfParts){

            //Add itemlike (Block or ITEM) to materialParts_XXXX for datagen
            if(part==FRAME ||part==BLOCK){

                MATERIAL_PART_BLOCKS.add(TechPartsBlocks.registerMatPartBlock(material,part));
            } else{
                MATERIAL_PART_ITEMS.add(TechPartsItems.registerMatPartItem(material,part));
            }
        }
    }

}
