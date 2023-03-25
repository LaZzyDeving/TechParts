package lazzy.techparts.datagen;

import lazzy.techparts.Ref;
import lazzy.techparts.blocks.MatPartBlock;
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
            if(part == Parts.FRAME){
                MBlockBuilderFRAMES(mP.get());
            }
            else {
                MBlockBuilder(mP.get());
            }
        }
    }

    private void MBlockBuilder(MatPartBlock block) {
        String name = block.getMaterial().getID()+"_"+block.getPart().getID();
        String style = block.getMaterial().getTexture();
        simpleBlock(block, models().singleTexture(name, mcLoc("cube_all"), "all", ResourceLocation.tryParse("techparts:block/"+style+"/"+block.getPart().getID()))
                .element()
                .face(Direction.NORTH).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.SOUTH).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.EAST).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.WEST).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.UP).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.DOWN).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .end().texture("particle", "#all"));
    }

    private void MBlockBuilderFRAMES(MatPartBlock block) {
        String name = block.getMaterial().getID()+"_"+block.getPart().getID();
        String style = block.getMaterial().getTexture();
        simpleBlock(block, models().singleTexture(name, mcLoc("cube_all"), "all", ResourceLocation.tryParse("techparts:block/"+style+"/"+block.getPart().getID()))

                .element()
                .face(Direction.NORTH).tintindex(0).uvs(0,0,16,16).texture("#all").cullface(Direction.NORTH).end()
                .face(Direction.SOUTH).tintindex(0).uvs(0,0,16,16).texture("#all").cullface(Direction.SOUTH).end()
                .face(Direction.EAST).tintindex(0).uvs(0,0,16,16).texture("#all").cullface(Direction.EAST).end()
                .face(Direction.WEST).tintindex(0).uvs(0,0,16,16).texture("#all").cullface(Direction.WEST).end()
                .face(Direction.UP).tintindex(0).uvs(0,0,16,16).texture("#all").cullface(Direction.UP).end()
                .face(Direction.DOWN).tintindex(0).uvs(0,0,16,16).texture("#all").cullface(Direction.DOWN).end()
                .end()
                .element()
                .from(15.984375F, 15.984375F, 15.984375F)
                .to(0.015625F, 0.015625F, 0.015625F)
                .face(Direction.NORTH).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.SOUTH).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.EAST).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.WEST).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.UP).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .face(Direction.DOWN).tintindex(0).uvs(0,0,16,16).texture("#all").end()
                .end().texture("particle", "#all"));
    }


}
