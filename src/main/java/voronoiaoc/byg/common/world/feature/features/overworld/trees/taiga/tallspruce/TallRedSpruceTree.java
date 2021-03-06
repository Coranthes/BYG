package voronoiaoc.byg.common.world.feature.features.overworld.trees.taiga.tallspruce;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;

//THIS FEATURE MUST BE REGISTERED & ADDED TO A BIOME!
public class TallRedSpruceTree extends BYGAbstractTreeFeature<DefaultFeatureConfig> {
    //BYGBlockRenders used for the tree.
    private static final BlockState LOG = Blocks.SPRUCE_LOG.getDefaultState();
    private static final BlockState LEAVES = BYGBlockList.RED_SPRUCE_LEAVES.getDefaultState();
    private static final BlockState BEENEST = Blocks.BEE_NEST.getDefaultState();

    public TallRedSpruceTree(Codec<DefaultFeatureConfig> configIn) {
        super(configIn);
        //setSapling((net.minecraftforge.common.IPlantable) BYGBlockList.RED_SPRUCE_SAPLING);
    }


    public boolean place(Set<BlockPos> changedBlocks, StructureWorldAccess worldIn, Random rand, BlockPos pos, BlockBox boundsIn, boolean isSapling) {

        int randTreeHeight = rand.nextInt(2) + rand.nextInt(3) + 12;
        //Positions
        int posX = pos.getX();
        int posY = pos.getY();
        int posZ = pos.getZ();
        if (posY >= 1 && posY + randTreeHeight + 1 < 256) {

            if (!isDesiredGroundwDirtTag(worldIn, pos.down(), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isSapling)) {
                return false;
            } else {

                Direction direction = Direction.Type.HORIZONTAL.random(rand);
                int randTreeHeight2 = randTreeHeight - rand.nextInt(1);//Crashes on 0.
                int posY1 = 2 - rand.nextInt(1);//Crashes on 0.
                int posX1 = posX;
                int posZ1 = posZ;
                int topTrunkHeight = posY + randTreeHeight - 1;

                for (int buildTrunk = 0; buildTrunk < randTreeHeight; ++buildTrunk) {
                    if (buildTrunk >= randTreeHeight2 && posY1 < 0) { //Unknown
                        posX1 += direction.getOffsetX();
                        posZ1 += direction.getOffsetZ();
                        ++posY1;
                    }

                    int logplacer = posY + buildTrunk;
                    BlockPos blockpos1 = new BlockPos(posX1, logplacer, posZ1);

                    if (isAir(worldIn, blockpos1)) {
                        this.treelog(changedBlocks, worldIn, blockpos1, boundsIn);
                    }
                }
                int leaveColor = rand.nextInt(1) + 1;


                if (leaveColor == 1) {
                    int leavessquarespos = rand.nextInt(1) + 1;
                    for (int posXLeafWidth = (leavessquarespos * -1); posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                        for (int posZLeafWidthL0 = (leavessquarespos * -1); posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                            this.leafs(worldIn, posX1, topTrunkHeight + 1, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 - 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 - 1, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 - 1, topTrunkHeight - 2, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + 1, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + 1, topTrunkHeight - 2, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 2, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 1, posZ1 + 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 2, posZ1 + 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);
                        }
                    }
                }
            }
        }
        return true;
        //}
    }


    private boolean doesTreeFit(TestableWorld reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 2;
            if (yOffset == -5) {
                distance = 0;
            }

            if (yOffset >= height - 1) {
                distance = 1;
            }

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canLogPlaceHere(reader, pos.set(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //Log Placement
    private void treelog(Set<BlockPos> setlogblock, StructureWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, LOG, boundingBox);
        }

    }

    //Leaves Placement
    private void leafs(StructureWorldAccess reader, int x, int y, int z, BlockBox boundingBox, Set<BlockPos> blockPos) {
        BlockPos blockpos = new BlockPos(x, y, z);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos, LEAVES, boundingBox);
        }

    }
}