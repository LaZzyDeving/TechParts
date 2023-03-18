package lazzy.techparts.items.blocks;

import lazzy.techparts.items.materials.Material;
import lazzy.techparts.items.materials.Parts;
import lazzy.techparts.setup.Register;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class MatPartBlock extends Block implements BlockColor {

    private final Material material;
    private final Parts part;

    public MatPartBlock(Material material, Parts part) {
        super(Register.baseBlockProps());
        //  To prevent translucent Frames from wallhacking
        if(part == Parts.FRAME){
            super.properties.noCollission();
        }
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
    public int getColor(BlockState p_92567_, @Nullable BlockAndTintGetter p_92568_, @Nullable BlockPos p_92569_, int p_92570_) {
        return 0;
    }
}