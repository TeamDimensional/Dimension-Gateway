import com.dimensional.gatewaycore.events.TooltipEvents
import net.minecraftforge.common.property.ExtendedBlockState
import net.minecraftforge.common.property.IExtendedBlockState
import net.minecraftforge.common.property.IUnlistedProperty
import net.minecraft.block.properties.IProperty
import vazkii.botania.api.state.BotaniaStateProps

// Coke Oven
crafting.remove("immersiveengineering:stone_decoration/cokebrick")
crafting.shapedBuilder()
        .name("tier1/coke_brick")
        .output(item("immersiveengineering:stone_decoration") * 3)
        .matrix("BCB", "CSC", "BCB")
        .key("B", item("minecraft:netherbrick")).key("C", item("minecraft:clay_ball")).key("S", ore("sandstone"))
        .register()

// Kiln
crafting.remove("immersiveengineering:stone_decoration/alloybrick")
crafting.shapedBuilder()
        .name("tier1/kiln_brick")
        .output(item("immersiveengineering:stone_decoration", 10) * 2)
        .matrix("BS", "SB")
        .key("B", item("minecraft:netherbrick")).key("S", ore("sandstone"))
        .register()

// Pyre
crafting.remove("roots:pyre")
crafting.shapedBuilder()
        .name("tier1/pyre")
        .output(item("roots:pyre"))
        .matrix(" L ", "LCL", "SMS")
        .key("L", ore("logWood")).key("C", ore("fuelCoke")).key("S", ore("cobblestone")).key("M", item("roots:terra_moss"))
        .register()

// Elemental Crystals
crafting.remove("essentialcraft:gem_elemental")
mods.roots.pyre.recipeBuilder()
    .name("tier1/elemental_block")
    .input(item("essentialcraft:compressed"), item("essentialcraft:compressed", 1), item("essentialcraft:compressed", 2),
           item("essentialcraft:compressed", 3), ore("gunpowder"))
    .output(item("essentialcraft:compressed", 4) * 4)
    .burnTime(300)
    .register()

// Pure Daisy
mods.roots.flower_generation.recipeBuilder()
    .name("puredaisy")
    .flower(blockstate("gateway:wilted_daisy"))
    .register()

inWorldCrafting.fluidToItem.recipeBuilder()
        .fluidInput(fluid("water"))
        .input(item("gateway:wilted_daisy"))
        .input(ore("petalWhite") * 4)
        .output(item("botania:specialflower").withNbt(["type": "puredaisy"]))
        .register()

TooltipEvents.setTooltip(
    item("gateway:wilted_daisy"), "This flower does not spawn in world! Use the Flower Growth ritual to obtain it.")

// Aurorian Book
def aurorianBook = item('patchouli:guide_book').withNbt(['patchouli:book': 'theaurorian:the_aurorian_guide'])
crafting.removeByOutput(aurorianBook)
crafting.shapelessBuilder()
        .name("tier1/aurorian_book")
        .output(aurorianBook)
        .input(item("minecraft:book"), ore("treeSapling"), ore("treeSapling"), ore("gemWaterElemental"))
        .register()

// Aurorian Portal
crafting.remove("theaurorian:blocks/aurorianstone")
mods.botania.pure_daisy.recipeBuilder()
    .input(blockstate("essentialcraft:compressed:4"))
    .output(blockstate("theaurorian:aurorianportalframebricks"))
    .time(30)
    .register()
