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

// Signalum, Lumium, Enderium
crafting.remove("thermalfoundation:dust_signalum")
crafting.remove("thermalfoundation:dust_lumium")
crafting.remove("thermalfoundation:dust_enderium")
// TODO: readd these recipes
