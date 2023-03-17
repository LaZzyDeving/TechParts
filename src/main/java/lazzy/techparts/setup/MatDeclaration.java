package lazzy.techparts.setup;

import lazzy.techparts.blocks.MatPartBlock;
import lazzy.techparts.blocks.TechPartsBlocks;
import lazzy.techparts.items.TechPartsItems;
import lazzy.techparts.items.materials.MatPartItem;
import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import net.silentchaos512.lib.registry.BlockRegistryObject;
import net.silentchaos512.lib.registry.ItemRegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

import static lazzy.techparts.items.materials.Parts.*;

public class MatDeclaration{

    public static final Collection<ItemRegistryObject<? extends MatPartItem>> MATERIAL_PART_ITEMS = new ArrayList<>();
    public static final Collection<BlockRegistryObject<? extends MatPartBlock>> MATERIAL_PART_BLOCKS = new ArrayList<>();
    static EnumSet<Parts> metal = EnumSet.of(Parts.DUST,Parts.INGOT,Parts.RAW, NUGGET,BLOCK);
    static EnumSet<Parts> gem = EnumSet.of(Parts.GEM,Parts.LENSE);


    public static void init(){

        createMaterial(Material.CONSTANTAN,metal);
        createMaterial(Material.BRASS,metal);
        createMaterial(Material.MANASTEEL,metal);

    }

    //TODO: Split for Item and Block and FIX
    public static void createMaterial(Material material, EnumSet<Parts> Group, Parts... whiteList){
        //Array that contains all parts from whitelist and group
        ArrayList<Parts> listOfParts = new ArrayList<Parts>(Arrays.asList(whiteList));
        listOfParts.addAll(Group);

        for(Parts part:listOfParts){

            //Add itemlike (Block or ITEM) to materialParts_XXXX for datagen
            if(part==FRAME ||part==BLOCK){
                BlockRegistryObject<MatPartBlock> block = TechPartsBlocks.registerBlock(material.getID()+"_"+part.getID(),()->new MatPartBlock(material,part));
                MATERIAL_PART_BLOCKS.add(block);
            } else{
                MATERIAL_PART_ITEMS.add(TechPartsItems.register(material.getID()+"_"+part.getID(),() -> new MatPartItem(material,part)));
            }
        }
    }

}
