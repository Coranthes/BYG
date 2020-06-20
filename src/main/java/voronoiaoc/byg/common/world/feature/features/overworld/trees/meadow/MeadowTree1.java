package voronoiaoc.byg.common.world.feature.features.overworld.trees.meadow;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class MeadowTree1 extends BYGAbstractTreeFeature<NoFeatureConfig> {

    public MeadowTree1(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn) {
        int randTreeHeight = 23 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable(pos);

        if (pos.getY() >= 1 && pos.getY() + randTreeHeight + 1 < 256) {
            BlockPos blockpos = pos.down();
            if (!isSoil(worldIn, blockpos, getSapling())) {
                return false;
            } else if (!this.doesTreeFit(worldIn, pos, randTreeHeight)) {
                return false;
            } else {
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 2, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 3, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 4, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 5, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 5, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 6, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 6, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 7, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 7, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 7, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 8, -4), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 8, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 8, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 8, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 9, -5), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 9, -4), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 9, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 9, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 9, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, 9, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 10, -6), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 10, -5), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, 10, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3, 10, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 10, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 10, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3, 10, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, 10, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 10, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 11, -7), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(4, 11, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-3, 11, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 11, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(4, 11, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-3, 11, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 8, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 8, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 8, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 8, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 9, -8), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 9, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 9, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 9, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 9, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6, 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 9, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 9, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 9, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 9, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -9), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, -9), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, -8), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 10, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 10, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 10, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 10, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 10, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 10, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -9), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, -9), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, -8), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, -8), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, -8), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 11, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6, 11, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 11, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, -8), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -8), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 12, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 12, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 12, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, -8), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, -7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 13, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 13, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 13, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 13, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 13, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 13, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 13, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 13, 5), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        BlockPos.Mutable blockpos = new BlockPos.Mutable(pos);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos,  BYGBlockList.PINE_LEAVES.getDefaultState(), boundingBox);
        }
    }



    private boolean doesTreeFit(IWorldGenerationBaseReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 2;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canTreePlaceHere(reader, pos.setPos(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}