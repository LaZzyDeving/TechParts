package lazzy.techparts.blocks;

import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import lazzy.techparts.setup.Register;
import lazzy.techparts.setup.client.IColorHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class MatPartBlock extends Block implements IColorHandler {

    private final Material material;
    private final Parts part;

    public MatPartBlock(Material material, Parts part) {
        super(Register.baseBlockProps());
        this.material = material;
        this.part = part;
    }

    public Material getMaterial() {
        return material;
    }

    public Parts getPart() {
        return part;
    }

    @Override
    public int getBlockColor(BlockState state, @Nullable BlockGetter world, @Nullable BlockPos pos, int i) {
        return i == 0 ? material.getRbg() : -1;
    }
}