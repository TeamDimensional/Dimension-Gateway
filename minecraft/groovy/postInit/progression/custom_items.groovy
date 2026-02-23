// Starsteel
def citem(name, k=0) {
    return item("gateway:${name}", k)
}

ore("ingotStarsteel").add(citem("starsteel_ingot"))

mods.immersiveengineering.arc_furnace.recipeBuilder()
    .mainInput(ore("ingotSteel"))
    .input(ore("ingotAstralStarmetal"), ore("dustDiamond"))
    .output(citem("starsteel_ingot") * 2)
    .time(150)
    .energyPerTick(250)
    .register()

mods.enderio.alloy_smelter.recipeBuilder()
    .input(ore("ingotManasteel"), ore("ingotAstralStarmetal") * 2, ore("dustDiamond") * 2)
    .output(citem("starsteel_ingot") * 4)
    .tierAny()
    .energy(80000)
    .register()

// Radioinfused Tanzanite line
mods.nuclearcraft.chemical_reactor.addRecipe(
    fluid("titanium_aluminide") * 144, fluid("boron_nitride_solution") * 666, fluid("boron") * 128, fluid("titanium_aluminum_nitride") * 666);
mods.nuclearcraft.enricher.addRecipe(ore("dustUranium"), fluid("titanium_aluminum_nitride") * 444, fluid("uranium_titanide_mixture") * 555);
mods.nuclearcraft.infuser.addRecipe(ore("gemTanzanite"), fluid("uranium_titanide_mixture") * 333, item("gateway:impure_resonating_gem"));
// Radioinfused Tanzanite made in an MBD machine

mods.thermalexpansion.crucible.recipeBuilder()
    .input(ore("ingotBoron"))
    .fluidOutput(fluid("boron") * 144)
    .energy(4000)
    .register()
mods.thermalexpansion.crucible.recipeBuilder()
    .input(ore("ingotTitaniumAluminide"))
    .fluidOutput(fluid("titanium_aluminide") * 144)
    .energy(4000)
    .register()
