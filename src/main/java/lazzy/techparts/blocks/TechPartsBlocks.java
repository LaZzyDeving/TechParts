package lazzy.techparts.blocks;

import lazzy.techparts.items.TechPartsItems;
import lazzy.techparts.setup.Register;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silentchaos512.lib.registry.BlockRegistryObject;

import java.util.function.Supplier;

public class TechPartsBlocks {
    public static final DeferredRegister<Block> BLOCKS = Register.create(ForgeRegistries.BLOCKS);



    // THIS TO CALL
    public static <T extends Block> BlockRegistryObject<T> registerBlock(String name, Supplier<T> block){
        BlockRegistryObject<T> toReturn = new BlockRegistryObject<>(BLOCKS.register(name,block));
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<MatPartBlockItem> registerBlockItem(String name, BlockRegistryObject<T> block){
        return TechPartsItems.ITEMS.register(name,()->new MatPartBlockItem(block.get(),Register.baseProps()));
    }


}
