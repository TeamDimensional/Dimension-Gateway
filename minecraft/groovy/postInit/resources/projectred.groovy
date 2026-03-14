import classes.AlloyHelper

// Circuit Plate
furnace.removeByOutput(item("projectred-core:resource_item"))
mods.prodigytech.heat_sawmill.recipeBuilder()
    .input(item("minecraft:stone"))
    .output(item("projectred-core:resource_item") * 2)
    .register()

// Red Alloy
furnace.removeByOutput(item("projectred-core:resource_item", 103))
mods.immersiveengineering.alloy_kiln.removeByOutput(item("projectred-core:resource_item", 103))
mods.immersiveengineering.arc_furnace.removeByOutput(item("projectred-core:resource_item", 103))
AlloyHelper.builder()
    .input(item("thermalfoundation:material", 130), item("minecraft:redstone") * 4)
    .output(item("projectred-core:resource_item", 103))
    .time(200)
    .register()
