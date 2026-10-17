import net.minecraft.block.BlockBush
import net.minecraft.block.BlockFalling
import net.minecraft.block.SoundType
import net.minecraft.world.World 
import net.minecraft.util.math.BlockPos
import net.minecraft.block.state.IBlockState
import net.minecraft.util.EnumParticleTypes
import net.minecraft.block.material.Material
import net.minecraft.block.Block
import com.gildedgames.the_aether.blocks.natural.ore.BlockGravititeOre

class BlockWiltedDaisy extends BlockBush {
    public BlockWiltedDaisy() {
        super()
        setSoundType(SoundType.PLANT)
    }
}

class BlockCleanroomFrame extends Block {
    public BlockCleanroomFrame() {
        super(Material.ROCK)
        setLightOpacity(0)
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false
    }

    @Override
    public boolean isNormalCube(IBlockState state) {
        return false
    }
}

content.registerBlock("wilted_daisy", new BlockWiltedDaisy())

content.createBlock("metallic_substrate").register()
content.createBlock("light_metal_substrate").register()
content.createBlock("heavy_metal_substrate").register()
content.createBlock("mundane_substrate").register()
content.createBlock("gemstone_substrate").register()
content.createBlock("crystalline_aerogel").register()
content.createBlock("ferramic_machine_frame").register()
content.registerBlock("cleanroom_machine_frame", new BlockCleanroomFrame())
content.createBlock("electrotine_ore").register()
content.createBlock("void_metal_ore").register()
content.registerBlock("dense_gravitite_ore", new BlockGravititeOre())
content.createBlock("enriched_stone").register()

class BlockDenseAquamarineOre extends BlockFalling {
    public BlockDenseAquamarineOre() {
        super(Material.SAND)
        setSoundType(SoundType.SAND)
    }
}

class BlockMindfulSand extends BlockFalling {
    public BlockMindfulSand() {
        super(Material.SAND)
        setSoundType(SoundType.SAND)
    }

    private void turnIntoThoughts(World world, BlockPos pos) {
        world.setBlockState(pos, blockstate("gateway:condensed_thoughts"))
    }

    public void onEndFalling(World world, BlockPos pos, IBlockState a, IBlockState b) {
        this.turnIntoThoughts(world, pos)
    }

    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
        if (rand.nextInt(20) == 0) {
            this.turnIntoThoughts(world, pos)
        } else {
            super().updateTick(world, pos, state, rand)
        }
    }

    public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {
        if (rand.nextInt(10) == 0) {
            double x = (double)pos.getX() + 0.5D;
            double y = (double)pos.getY() + 1.1D;
            double z = (double)pos.getZ() + 0.5D;

            world.spawnParticle(EnumParticleTypes.END_ROD, x, y, z, 0.0D, 0.0D, 0.0D);
        }
    }
}

content.registerBlock("dense_aquamarine_ore", new BlockDenseAquamarineOre())
content.registerBlock("mindful_sand", new BlockMindfulSand())
