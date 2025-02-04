import net.minecraft.block.BlockBush
import net.minecraft.block.SoundType

class BlockWiltedDaisy extends BlockBush {
    public BlockWiltedDaisy() {
        super()
        setSoundType(SoundType.PLANT)
    }
}

content.registerBlock("wilted_daisy", new BlockWiltedDaisy())
