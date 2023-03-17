package lazzy.techparts.datagen;

import lazzy.techparts.Ref;
import lazzy.techparts.blocks.MatPartBlock;
import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.silentchaos512.lib.registry.BlockRegistryObject;

import static lazzy.techparts.setup.MatDeclaration.MATERIAL_PART_BLOCKS;

public class BlockModelProvider extends BlockStateProvider {

    public BlockModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Ref.ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        Material mat;
        Parts part;
        for(BlockRegistryObject<? extends MatPartBlock> mP: MATERIAL_PART_BLOCKS) {
            mat = mP.get().getMaterial();
            part = mP.get().getPart();
            Material finalMat = mat;
            Parts finalPart = part;
            getVariantBuilder(mP.get()).forAllStates(state -> {
                // TODO
                return ConfiguredModel.builder()
                        .modelFile(models().cubeAll(finalMat.getID()+"_"+ finalPart.getID(), modLoc("item/material/"+finalMat.getTexture()+"/"+finalPart.getID())))
                        .build();
            });
        }
    }
}
