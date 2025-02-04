// Blaze Quartz
crafting.remove("botania:quartz_2")
/*
mods.thermalexpansion.transposer_fill.recipeBuilder()
    .input(item("botania:quartz"))
    .output(item("botania:quartz", 2))
    .fluidInput(fluid("firewater") * 100)
    .register()
*/

// Smokey Quartz
crafting.remove("botania:quartz_0")
mods.naturesaura.offering.recipeBuilder()
    .name("offered_quartz")
    .input(item("botania:quartz", 1))
    .catalyst(item("roots:runic_dust"))
    .output(item("botania:quartz"))
    .register()

// Mana Spreader
crafting.remove("botania:spreader")
// TODO: come up with a recipe.
