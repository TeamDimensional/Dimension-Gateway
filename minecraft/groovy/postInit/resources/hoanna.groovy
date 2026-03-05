import nc.recipe.NCRecipes
import net.minecraft.util.ResourceLocation

// Decaying Void Stone
if (!reloading) {
    NCRecipes.decay_generator.removeAllRecipes()
    NCRecipes.decay_generator.addRecipe(item("thaumcraft:metal_void"), item("essentialcraft:voidstone"), 400.0, 0, 0)
}

def getBlockIdAt(world, pos) {
    return world.getBlockState(pos).getBlock().getRegistryName()
}

// Titanite and Twinkling Titanite
def isDecayingVoid(resonator) {
    def shifts = [[1, 0, 0], [-1, 0, 0], [0, 1, 0], [0, -1, 0], [0, 0, 1], [0, 0, -1]]
    for (def x in shifts) {
        def shifted = resonator.getPos().add(x[0], x[1], x[2])
        if (getBlockIdAt(resonator.getWorld(), shifted) == new ResourceLocation("thaumcraft:metal_void")) {
            for (def y in shifts) {
                def shifted2 = shifted.add(y[0], y[1], y[2])
                if (getBlockIdAt(resonator.getWorld(), shifted2) == new ResourceLocation("nuclearcraft:decay_generator")) {
                    return true
                }
            }
        }
    }
    return false
}

mods.extrautils2.resonator.recipeBuilder()
    .input(item("qmd:ingot", 15))
    .output(item("essentialcraft:titanite"))
    .shouldProgress((resonator, _1, _2) -> isDecayingVoid(resonator))
    .requirementText("Must be adjacent to decaying Void Metal")
    .energy(9000)
    .register()

mods.extrautils2.resonator.recipeBuilder()
    .input(item("advancedrocketry:productingot", 1))
    .output(item("essentialcraft:twinkling_titanite"))
    .shouldProgress((resonator, _1, _2) -> isDecayingVoid(resonator))
    .requirementText("Must be adjacent to decaying Void Metal")
    .energy(9000)
    .register()
