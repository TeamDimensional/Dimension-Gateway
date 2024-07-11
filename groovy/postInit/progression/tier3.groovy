// Remove crafting recipes for IE plates, wires, etc. #UseTheMetalPress
crafting.removeByInput(item("immersiveengineering:tool"))
crafting.removeByInput(item("immersiveengineering:tool", 1))

// Remove crafting recipes for gears
for (int i in [24, 25, 26, 27, 256, 257, 258, 259, 260, 261, 262, 263, 264, 288, 289, 290, 291, 292, 293, 294, 295])
    crafting.removeByOutput(item("thermalfoundation:material", i))
crafting.removeByOutput(item("prodigytech:ferramic_gear"))
// Remove also gear casting
mods.tconstruct.casting_table.removeByCast(item("tconstruct:cast_custom", 4))
mods.tconstruct.casting_table.removeByOutput(item("tconstruct:cast_custom", 4))
// Add gemstone metal pressing
mods.immersiveengineering.metal_press.recipeBuilder()
    .mold(item("immersiveengineering:mold", 1))
    .input(item("minecraft:diamond") * 4)
    .output(item("thermalfoundation:material", 26))
    .register()

mods.immersiveengineering.metal_press.recipeBuilder()
    .mold(item("immersiveengineering:mold", 1))
    .input(item("minecraft:emerald") * 4)
    .output(item("thermalfoundation:material", 27))
    .register()

// Require crafting for mechanical components
crafting.remove("immersiveengineering:material/component_iron")
crafting.remove("immersiveengineering:material/component_steel")

// Engineer's Blueprint (avoid useless crafting components)
crafting.remove("immersiveengineering:blueprints/components")
crafting.shapedBuilder()
        .name("tier3/blueprints/components")
        .output(item("immersiveengineering:blueprint").withNbt(["blueprint": "components"]))
        .matrix(" C ", "LLL", "PPP")
        .key("P", ore("paper")).key("L", ore("dyeBlue")).key("C", item("prodigytech:circuit_refined"))
        .register()

crafting.remove("immersiveengineering:blueprints/common_cartridges")
crafting.shapedBuilder()
        .name("tier3/blueprints/bullet")
        .output(item("immersiveengineering:blueprint").withNbt(["blueprint": "bullet"]))
        .matrix("GCG", "LLL", "PPP")
        .key("P", ore("paper")).key("L", ore("dyeBlue")).key("C", ore("plateCopper")).key("G", item("minecraft:gunpowder"))
        .register()
