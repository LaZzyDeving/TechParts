package lazzy.techparts.blocks;

import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import lazzy.techparts.setup.Register;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static lazzy.techparts.items.MatDeclaration.MATERIAL_PART_BLOCKITEMS;
import static lazzy.techparts.items.TechPartsItems.ITEMS;

public class TechPartsBlocks {
    public static final DeferredRegister<Block> BLOCKS = Register.create(ForgeRegistries.BLOCKS);

    //Private because only for Basic Blocks
    public static <T extends Block> RegistryObject<T> registerBasicBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    private static<T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ITEMS.register(name, ()->new BlockItem(block.get(),Register.baseProps()));
    }

    private static<T extends MatPartBlock> RegistryObject<MatPartBlockItem> registerMatPartBlockItem(String name, RegistryObject<T> block){
        return ITEMS.register(name, ()->new MatPartBlockItem(block.get(),Register.baseProps()));
    }

    public static RegistryObject<MatPartBlock> registerMatPartBlock(Material mat, Parts part){
        BlockBehaviour.Properties properties = Register.baseBlockProps();
        if(part == Parts.FRAME){
            properties.noOcclusion();
        }
        RegistryObject<MatPartBlock> toReturn = BLOCKS.register(mat.getID()+"_"+part.getID(),()->new MatPartBlock(mat,part,properties));
        MATERIAL_PART_BLOCKITEMS.add(registerMatPartBlockItem(mat.getID()+"_"+part.getID(),toReturn));
        return toReturn;
    }

}
