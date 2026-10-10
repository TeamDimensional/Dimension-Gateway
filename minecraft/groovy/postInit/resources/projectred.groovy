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
