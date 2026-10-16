// Circuit Plate
furnace.removeByOutput(item("projectred-core:resource_item"))
mods.prodigytech.heat_sawmill.recipeBuilder()
    .input(item("minecraft:stone"))
    .output(item("projectred-core:resource_item") * 2)
    .register()

// Silicon
mods.prodigytech.heat_sawmill.recipeBuilder()
    .input(item("projectred-core:resource_item", 300))
    .output(item("projectred-core:resource_item", 301) * 8)
    .register()

furnace.removeByOutput(item("projectred-core:resource_item", 300))
mods.immersiveengineering.arc_furnace.recipeBuilder()
    .input(item("nuclearcraft:gem_dust", 2) * 4, item("theaurorian:crystal"), item("prodigytech:inferno_crystal"))
    .output(item("projectred-core:resource_item", 300))
    .time(400)
    .energyPerTick(512)
    .register()

mods.advancedrocketry.crystallizer.recipeBuilder()
    .input(item("nuclearcraft:gem_dust", 2) * 16, item("theaurorian:crystal") * 4, item("prodigytech:inferno_crystal") * 4)
    .output(item("projectred-core:resource_item", 300) * 4)
    .power(2048)
    .time(200)
    .register()

// Alloys
furnace.removeByOutput(item("projectred-core:resource_item", 103))
furnace.removeByOutput(item("projectred-core:resource_item", 104))

// Replace Red Alloy with Redstone Alloy in recipes
crafting.remove("projectred-core:tools/multimeter")
crafting.shapedBuilder()
    .mirrored()
    .matrix("A A", "BGR", "BLR")
    .key("A", item("enderio:item_alloy_ingot", 3))
    .key("B", ore("dyeBlack"))
    .key("R", ore("dyeRed"))
    .key("G", ore("dyeGreen"))
    .key("L", item("minecraft:glowstone_dust"))
    .output(item("projectred-core:multimeter"))
    .register()

for (def i in 0..16) {
    crafting.removeByOutput(item("projectred-transmission:wire", i))
    def row = i == 0 ? " R " : "WRW"
    crafting.shapedBuilder()
        .matrix(row, row, row)
        .key("R", item("enderio:item_alloy_ingot", 3))
        .key("W", i == 0 ? item("minecraft:wool") : item("minecraft:wool", i - 1))
        .output(item("projectred-transmission:wire", i) * 12)
        .register()
}
