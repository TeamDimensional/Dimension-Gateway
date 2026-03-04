import classes.AlloyHelper
import com.dimensional.gatewaycore.events.TooltipEvents

// Starsteel
def citem(name, k=0) {
    return item("gateway:${name}", k)
}

ore("ingotStarsteel").add(citem("starsteel_ingot"))

AlloyHelper.builder()
    .input(ore("ingotSteel"), ore("ingotAstralStarmetal"), ore("dustDiamond"))
    .output(citem("starsteel_ingot") * 2)
    .time(160)
    .maxTier(2)
    .register()

AlloyHelper.builder()
    .input(ore("ingotManasteel"), ore("ingotAstralStarmetal") * 2, ore("dustDiamond") * 2)
    .output(citem("starsteel_ingot") * 4)
    .time(400)
    .minTier(3)
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

// Blaze Superfuel
mods.soot.alchemical_mixer.recipeBuilder()
        .fluidInput(fluid("blazing_blood") * 20, fluid("napalm") * 80, fluid("gas_dwarf") * 50, fluid("crystaloil") * 100)
        .fluidOutput(fluid("blaze_superfuel") * 250)
        .setAspect("copper", 2, 4)
        .register()
mods.embers.alchemy.addAspect("destabilized", item("thermalfoundation:material", 893))
mods.soot.alchemical_mixer.recipeBuilder()
        .fluidInput(fluid("blazing_blood") * 40, fluid("napalm") * 160, fluid("gas_dwarf") * 100, fluid("empoweredoil") * 200)
        .fluidOutput(fluid("blaze_superfuel") * 900)
        .setAspect("destabilized", 8, 16)
        .register()

// Wilted Daisy
mods.roots.flower_generation.recipeBuilder()
    .name("wilteddaisy")
    .flower(blockstate("gateway:wilted_daisy"))
    .register()
TooltipEvents.setTooltip(
    item("gateway:wilted_daisy"), "This flower does not spawn in world! Use the Flower Growth ritual to obtain it.")
