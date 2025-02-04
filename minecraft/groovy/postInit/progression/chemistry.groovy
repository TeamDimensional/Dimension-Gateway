// Resonating Gem line
mods.nuclearcraft.chemical_reactor.addRecipe(
    fluid("aluminum") * 144, fluid("boron_nitride_solution") * 666, fluid("boron") * 128, fluid("aluminum_nitride") * 666);
mods.nuclearcraft.enricher.addRecipe(ore("dustUranium"), fluid("aluminum_nitride") * 444, fluid("uranium_albn_mixture") * 555);
mods.nuclearcraft.infuser.addRecipe(ore("gemTanzanite"), fluid("uranium_albn_mixture") * 333, item("gateway:impure_resonating_gem"));
// Resonating Gem made in an MBD machine

mods.thermalexpansion.crucible.recipeBuilder()
    .input(ore("ingotBoron"))
    .fluidOutput(fluid("boron") * 144)
    .energy(4000)
    .register()
