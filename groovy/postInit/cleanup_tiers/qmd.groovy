import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("qmd:${name}", k)
}

def tier6Items = [mitem("fluid_mercury")]

def tier7Items = [mitem("fluid_silicon")]

def tier8Items = [
    mitem("ore_leacher"), mitem("atmosphere_collector"), mitem("dust", 11), mitem("ingot", 11),
]
for (def i in [3, 4]) tier8Items.add(mitem("chemical_dust", i))
for (def c in GatewayHelpers.qmdChemiFluids) tier8Items.add(mitem("fluid_${c}"))

def tier11Items = [
    mitem("dust2", 1), mitem("ingot2", 1), mitem("fluid_polonium"), mitem("fluid_radium"), mitem("fluid_bismuth"),
    mitem("fluid_neodymium"),
]
for (def i in [2, 3, 4, 6, 8]) tier11Items.add(mitem("isotope", i))
def tier12Items = [mitem("dust", 8), mitem("ingot", 8)]

def tier14Items = [
    mitem("neutral_containment_controller"), mitem("nucleosynthesis_chamber_controller"), mitem("containment_casing"),
    mitem("containment_glass"), mitem("containment_port"), mitem("containment_beam_port"), mitem("containment_vent"),
    mitem("containment_energy_port"), mitem("vacuum_chamber_fluid_port"), mitem("containment_coil"),
    mitem("containment_laser"), mitem("vacuum_chamber_beam"), mitem("vacuum_chamber_plasma_glass"), mitem("vacuum_chamber_plasma_nozzle"),
    mitem("vacuum_chamber_heater", 32767), mitem("vacuum_chamber_heater_vent"), mitem("vacuum_chamber_redstone_port"),
    mitem("part", 9), mitem("cell", 32767),
    mitem("lepton_cannon"), mitem("gluon_gun"), mitem("antimatter_launcher"),
]

def creativeItems = [mitem("creative_particle_source")]

def removeRecipes = [
    mitem("rtg_strontium"),
]

def hideFromJei = [
    mitem("ingot2", 2), mitem("potassium_iodine_tablet"),
    mitem("copernicium", 1), mitem("pellet_copernicium", 1), mitem("fuel_copernicium"), mitem("depleted_fuel_copernicium"),
    mitem("fluid_cobalt"), mitem("fluid_nickel"), mitem("fluid_iridium"), mitem("fluid_platinum"), mitem("fluid_zinc"),
] + removeRecipes
for (def c in ["green", "blue", "orange"]) hideFromJei.add(mitem("block_${c}_luminous_paint"))

TooltipEvents.setModTier("qmd", 13)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in tier8Items) TooltipEvents.setTier(it, 8)
for (def it in tier11Items) TooltipEvents.setTier(it, 11)
for (def it in tier12Items) TooltipEvents.setTier(it, 12)
for (def it in tier14Items) TooltipEvents.setTier(it, 14)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)

def predicateBook = stack -> {
    return stack in item("patchouli:guide_book").withNbt(["patchouli:book": "qmd:guide"])
}
TooltipEvents.addTierPredicate("qmdbook", predicateBook, 8)