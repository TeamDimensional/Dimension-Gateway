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

// Connectors
// TODO: more connectors
crafting.remove("immersiveengineering:connectors/breaker_switch")
crafting.shapedBuilder()
        .name("tier3/connectors/breaker")
        .output(item("immersiveengineering:connector", 9))
        .matrix(" L ", "TCT")
        .key("T", item("minecraft:hardened_clay")).key("L", item("minecraft:lever")).key("C", ore("plateCopper"))
        .register()

crafting.remove("immersiveengineering:connectors/connector_lv")
crafting.shapedBuilder()
        .name("tier3/connectors/lv")
        .output(item("immersiveengineering:connector") * 2)
        .matrix(" C ", "TCT", "TCT")
        .key("T", item("minecraft:hardened_clay")).key("C", ore("plateCopper"))
        .register()

crafting.remove("immersiveengineering:connectors/connector_mv")
crafting.shapedBuilder()
        .name("tier3/connectors/mv")
        .output(item("immersiveengineering:connector", 2) * 2)
        .matrix(" C ", "TCT", "TCT")
        .key("T", item("minecraft:hardened_clay")).key("C", ore("plateSteel"))
        .register()

crafting.remove("immersiveengineering:connectors/relay_lv")
crafting.shapedBuilder()
        .name("tier3/relays/lv")
        .output(item("immersiveengineering:connector", 1) * 4)
        .matrix(" C ", "TCT")
        .key("T", item("minecraft:hardened_clay")).key("C", ore("plateCopper"))
        .register()

crafting.remove("immersiveengineering:connectors/relay_mv")
crafting.shapedBuilder()
        .name("tier3/relays/mv")
        .output(item("immersiveengineering:connector", 3) * 4)
        .matrix(" C ", "TCT")
        .key("T", item("minecraft:hardened_clay")).key("C", ore("plateSteel"))
        .register()

// Engineer's Worktable
crafting.remove("immersiveengineering:wooden_devices/workbench")
crafting.shapedBuilder()
        .name("tier3/worktable")
        .output(item("immersiveengineering:wooden_device0", 2))
        .matrix("TTT", "SSS", "C F")
        .key("T", ore("plankTreatedWood")).key("S", ore("ingotSteel")).key("C", item("minecraft:crafting_table"))
        .key("F", item("immersiveengineering:wooden_decoration"))
        .mirrored()
        .register()

// Circuit Pattern
crafting.remove("prodigytech:placeholder/pattern_circuit_crude_ini")
crafting.shapelessBuilder()
        .name("tier3/circuit_pattern")
        .output(item("prodigytech:pattern_circuit_crude"))
        .input(ore("plateIron"), item("minecraft:paper"))
        .register()

