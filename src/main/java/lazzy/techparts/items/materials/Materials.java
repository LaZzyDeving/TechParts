package lazzy.techparts.items.materials;

import lazzy.techparts.items.Register;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;

public class Materials {

    static EnumSet<Parts> metal = EnumSet.of(Parts.DUST,Parts.INGOT,Parts.RAW);
    static EnumSet<Parts> gem = EnumSet.of(Parts.GEM,Parts.LENSE);

    public static ArrayList<MaterialParts> materialParts = new ArrayList<>();

    public static void init(){

        createMaterial(Material.CONSTANTAN,metal);
    }

    public static void createMaterial(Material material, EnumSet<Parts> Group, Parts... whiteList){
        //Array that contains all parts from whitelist and group
        ArrayList<Parts> listOfParts = new ArrayList<Parts>(Arrays.asList(whiteList));
        listOfParts.addAll(Group);

        ArrayList<Item> items = new ArrayList<>();

        for(Parts part:listOfParts){
            //Register
            RegistryObject<Item> item = Register.createbasicItem(material.getID()+"_"+part.getID());
            //Add items to materialParts so they can get translation and Json for Texture
            materialParts.add(new MaterialParts(material,part,item));
        }
    }

}
