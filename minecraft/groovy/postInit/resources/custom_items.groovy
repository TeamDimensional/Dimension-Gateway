import classes.AlloyHelper
import com.dimensional.gatewaycore.events.TooltipEvents

// Starsteel
def citem(name, k=0) {
    return item("gateway:${name}", k)
}

ore("ingotStarsteel").add(citem("starsteel_ingot"))

AlloyHelper.builder()
    .input(ore("ingotZorrasteel"), ore("ingotAstralStarmetal"), ore("dustDiamond"))
    .output(citem("starsteel_ingot") * 2)
    .time(160)
    .register()

AlloyHelper.builder()
    .input(ore("ingotManasteel"), ore("ingotAstralStarmetal"), item("naturesaura:sky_ingot"))
    .output(citem("starsteel_ingot") * 5)
    .time(320)
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
        .fluidInput(fluid("blazing_blood") * 10, fluid("napalm") * 40, fluid("gas_dwarf") * 20, fluid("crystaloil") * 50)
        .fluidOutput(fluid("blaze_superfuel") * 120)
        .setAspect("copper", 2, 4)
        .register()
mods.embers.alchemy.addAspect("destabilized", item("thermalfoundation:material", 893))
mods.soot.alchemical_mixer.recipeBuilder()
        .fluidInput(fluid("blazing_blood") * 20, fluid("napalm") * 80, fluid("gas_dwarf") * 40, fluid("empoweredoil") * 100)
        .fluidOutput(fluid("blaze_superfuel") * 400)
        .setAspect("destabilized", 8, 16)
        .register()

// Wilted Daisy
mods.roots.flower_generation.recipeBuilder()
    .name("wilteddaisy")
    .flower(blockstate("gateway:wilted_daisy"))
    .register()
TooltipEvents.setTooltip(
    item("gateway:wilted_daisy"), "This flower does not spawn in world! Use the Flower Growth ritual to obtain it.")

// Runic Plate
mods.advancedrocketry.cutting_machine.recipeBuilder()
    .input(item("botania:livingrock"))
    .output(item("gateway:incomplete_runic_plate") * 3)
    .power(500)
    .time(100)
    .register()

mods.extrautils2.resonator.recipeBuilder()
    .input(item("gateway:incomplete_runic_plate"))
    .output(item("gateway:runic_plate"))
    .shouldProgress(
        (resonator, _1, _2) ->
        resonator.getWorld().getBiome(resonator.getPos()).getBiomeName() == "Magical Forest" &&
        resonator.getWorld().provider.getDimension() != 0)
    .requirementText("Must be in a Magical Forest, outside of Overworld")
    .energy(2000)
    .register()

// Transcendent Matrix line
mods.nuclearcraft.infuser.builder()
    .input(item("thaumcraft:brain"))
    .fluidInput(fluid("difluorobenzene") * 125)
    .output(item("gateway:purified_brain"))
    .register()

mods.actuallyadditions.empowerer.recipeBuilder()
    .mainInput(item("forge:bucketfilled").withNbt([FluidName:"purifying_fluid",Amount:1000]))
    .input(item("thermalfoundation:material", 102), item("prodigytech:aeternus_crystal"), item("gateway:starsteel_ingot"), item("gateway:purified_brain"))
    .output(item("forge:bucketfilled").withNbt([FluidName:"liquid_enlightenment",Amount:1000]))
    .color(0xe6ef7d)
    .time(200)
    .energy(20000)
    .register()

mods.nuclearcraft.crystallizer.builder()
    .fluidInput(fluid("liquid_enlightenment") * 80)
    .output(item("gateway:crystallized_enlightenment"))
    .register()

mods.factorytech.agitator.recipeBuilder()
    .input(item("appliedenergistics2:material", 8))
    .fluidInput(fluid("essence") * 250, fluid("milk_chocolate") * 288)
    .fluidOutput(fluid("condensed_thoughts") * 5)
    .register()

def sandLearning(world, blockPos) {
    def shifts = [[1, 0, 0], [-1, 0, 0], [0, 1, 0], [0, -1, 0], [0, 0, 1], [0, 0, -1]]
    for (def x in shifts) {
        def shifted = blockPos.add(x[0], x[1], x[2])
        if (world.getBlockState(shifted).getBlock().getRegistryName() == resource("minecraft:sand")) {
            world.setBlockState(shifted, blockstate("gateway:mindful_sand"))
        }
    }
    return false
}

in_world_crafting.fluid_to_block.recipeBuilder()
    .fluidInput(fluid("condensed_thoughts"))
    .input(item("gateway:crystallized_enlightenment"))
    .output(block("minecraft:air"))
    .afterRecipe((world, blockPos) -> sandLearning(world, blockPos))
    .register()

mods.nuclearcraft.manufactory.builder()
    .input(item("thaumcraft:plate", 3))
    .output(item("gateway:voidmetal_mesh"))
    .register()

mods.nuclearcraft.multiblock_infiltrator.builder()
    .input(item("gateway:voidmetal_mesh"))
    .fluidInput(fluid("diamond") * 111)
    .fluidInput(fluid("condensed_thoughts") * 250)
    .output(item("gateway:transcendental_matrix"))
    .heatingFactor(2.0)
    .register()

TooltipEvents.setTooltip(fluid("condensed_thoughts"), "Duplicate this with Sand Learning Process!")
TooltipEvents.setTooltip(fluid("liquid_enlightenment"), "Craft the bucket first!")
TooltipEvents.setTooltip(item("gateway:mindful_sand"), "Has a chance to transform into Condensed Thoughts upon receiving a block update.")
