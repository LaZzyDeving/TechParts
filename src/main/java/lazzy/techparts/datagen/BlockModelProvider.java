package lazzy.techparts.datagen;

import lazzy.techparts.Ref;
import lazzy.techparts.items.blocks.MatPartBlock;
import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static lazzy.techparts.items.MatDeclaration.MATERIAL_PART_BLOCKS;

public class BlockModelProvider extends BlockStateProvider {

    public BlockModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Ref.ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        Material mat;
        Parts part;
        for(RegistryObject<? extends MatPartBlock> mP: MATERIAL_PART_BLOCKS) {
            mat = mP.get().getMaterial();
            part = mP.get().getPart();
            Material finalMat = mat;
            Parts finalPart = part;
            MBlockBuilder(mP.get());
        }
    }

    private void MBlockBuilder(MatPartBlock block) {
        String name = block.getMaterial().getID()+"_"+block.getPart().getID();
        String style = block.getMaterial().getStyle();
        System.out.println("STYLE: "+style);
        simpleBlock(block, models().singleTexture(name + "_block", mcLoc("cube_all"), "all", ResourceLocation.tryParse("techparts:block/"+style+"/"+block.getPart().getID()))
                .element()
                .face(Direction.NORTH).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.SOUTH).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.EAST).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.WEST).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.UP).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.DOWN).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .end().texture("particle", "#all"));

    }


}
