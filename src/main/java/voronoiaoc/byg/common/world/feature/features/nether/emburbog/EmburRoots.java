package voronoiaoc.byg.common.world.feature.features.nether.emburbog;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;

public class EmburRoots extends Feature<DefaultFeatureConfig> {
    public EmburRoots(Codec<DefaultFeatureConfig> config) {
        super(config);
    }

    public boolean generate(StructureWorldAccess worldIn, ChunkGenerator generator, Random random, BlockPos pos, DefaultFeatureConfig config) {
        if (!worldIn.isAir(pos) || worldIn.getBlockState(pos.down()).getBlock() != BYGBlockList.EMBUR_NYLIUM) {
            return false;
        } else {
            worldIn.setBlockState(pos, BYGBlockList.EMBUR_ROOTS.getDefaultState(), 10);
            return true;
        }
    }
}