// Circuit Plate
furnace.removeByOutput(item("projectred-core:resource_item"))
mods.prodigytech.heat_sawmill.recipeBuilder()
    .input(item("minecraft:stone"))
    .output(item("projectred-core:resource_item") * 2)
    .register()
