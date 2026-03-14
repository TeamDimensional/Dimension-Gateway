// Hardened Glass
mods.thermalexpansion.smelter.removeByOutput(item("thermalfoundation:glass", 3))
mods.immersiveengineering.bottling_machine.recipeBuilder()
    .input(item("thermalfoundation:material", 131))
    .fluidInput(fluid("glass") * 1000)
    .output(item("thermalfoundation:glass", 3) * 2)
    .register()
