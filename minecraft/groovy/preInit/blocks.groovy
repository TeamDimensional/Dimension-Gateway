import net.minecraft.block.BlockBush
import net.minecraft.block.SoundType

class BlockWiltedDaisy extends BlockBush {
    public BlockWiltedDaisy() {
        super()
        setSoundType(SoundType.PLANT)
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
content.createBlock("cleanroom_machine_frame").register()
