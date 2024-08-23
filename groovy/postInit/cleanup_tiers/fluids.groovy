import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def tier2 = [fluid("tamoonwater")]

def tier3 = [
    fluid("plantoil"), fluid("ethanol"), fluid("biodiesel"), fluid("concrete"), fluid("potion"), fluid("invar"),
    fluid("constantan"), fluid("iron"), fluid("gold"), fluid("pigiron"), fluid("knightslime"), fluid("alubrass"),
    fluid("copper"), fluid("tin"), fluid("bronze"), fluid("lead"), fluid("nickel"), fluid("silver"), fluid("electrum"),
    fluid("steel"), fluid("aluminum"), fluid("stone"), fluid("clay"), fluid("dirt"), fluid("glass"), fluid("blood"),
    fluid("purpleslime"), fluid("xu_demonic_metal"), fluid("oil"), fluid("diesel"), fluid("lubricant"), fluid("gasoline"), fluid("napalm"),
]

def tier4 = [
    fluid("emerald"), fluid("canolaoil"), fluid("refinedcanolaoil"), fluid("crystaloil"), fluid("evilcraftblood"), fluid("diamond"),
]

def tier5 = [
    fluid("obsidian"), fluid("brass"), fluid("crystal_water"), fluid("flux_goo"), fluid("liquid_death"), fluid("purifying_fluid"),
]

def tier6 = [
    fluid("ender"), fluid("aetherworks.aetherium_gas"), fluid("aetherworks.impure_aetherium_gas"), fluid("oil_soul"), fluid("oil_dwarf"),
    fluid("gas_dwarf"), fluid("dawnstone"), fluid("alchemical_redstone"), fluid("steam"), fluid("mercury"),
]

def tier7 = [
    fluid("coal"), fluid("refined_oil"), fluid("refined_fuel"), fluid("sap"), fluid("syrup"),
    fluid("resin"), fluid("tree_oil"), fluid("seed_oil"), fluid("biocrude"), fluid("refined_biofuel"),
    fluid("potion_splash"), fluid("potion_lingering"), fluid("platinum"), fluid("signalum"), fluid("lumium"), fluid("enderium"),
    fluid("cobalt"), fluid("ardite"), fluid("manyullyn"), fluid("pyrotheum"), fluid("aerotheum"), fluid("petrotheum"),
    fluid("liquid_crystal"), fluid("nutrient_distillation"), fluid("hootch"), fluid("rocket_fuel"), fluid("fire_water"),
    fluid("liquid_sunshine"), fluid("cloud_seed"), fluid("cloud_seed_concentrated"), fluid("electrical_steel"), fluid("energetic_alloy"),
    fluid("vibrant_alloy"), fluid("redstone_alloy"), fluid("conductive_iron"), fluid("pulsating_iron"), fluid("dark_steel"), fluid("soularium"),
    fluid("end_steel"), fluid("redstone"), fluid("glowstone"), fluid("quartz"), fluid("lapis"), fluid("nether_brick"), fluid("slime"),
    fluid("prismarine"), fluid("end_stone"), fluid("purpur"), fluid("uranium"),
]

def tier8 = [
    fluid("cryotheum"), fluid("rocketfuel"), fluid("oxygen"), fluid("hydrogen"), fluid("deuterium"),
    fluid("helium_3"), fluid("helium"), fluid("ferroboron"), fluid("tough"), fluid("hard_carbon"), fluid("beryllium"),
    fluid("zirconium"), fluid("manganese_dioxide"), fluid("sulfur"), fluid("liquid_helium"), fluid("liquid_nitrogen"),
    fluid("heavy_water"), fluid("methanol"), fluid("nitrogen"), fluid("ice"), fluid("slurry_ice"),
    fluid("fluorine"), fluid("carbon_dioxide"), fluid("carbon_monoxide"), fluid("ethene"), fluid("fluoromethane"), fluid("ammonia"),
    fluid("oxygen_difluoride"), fluid("diborane"), fluid("sulfur_dioxide"), fluid("sulfur_trioxide"), fluid("hydrofluoric_acid"),
    fluid("boric_acid"), fluid("sulfuric_acid"), fluid("boron_nitride_solution"), fluid("fluorite_water"), fluid("calcium_sulfate_solution"),
    fluid("sodium_fluoride_solution"), fluid("potassium_fluoride_solution"), fluid("sodium_hydroxide_solution"), fluid("potassium_hydroxide_solution"),
    fluid("chocolate_liquor"), fluid("cocoa_butter"), fluid("unsweetened_chocolate"), fluid("dark_chocolate"), fluid("milk_chocolate"),
    fluid("sugar"), fluid("gelatin"), fluid("hydrated_gelatin"), fluid("marshmallow"),
    fluid("lif"), fluid("bef2"), fluid("naoh"), fluid("koh"), fluid("sodium"), fluid("potassium"),
    fluid("emergency_coolant"), fluid("arsenic"), fluid("bas"), fluid("alugentum"), fluid("alumina"),
    fluid("thorium"), fluid("boron"), fluid("lithium"), fluid("magnesium"), fluid("manganese"),
    fluid("fluorite"), fluid("villiaumite"), fluid("carobbiite"), 
]
for (def c in GatewayHelpers.qmdChemiFluids) tier8.add(fluid(c))

def tier9 = [
    fluid("ender_distillation"), fluid("vapor_of_levity"), fluid("xu_evil_metal"), fluid("xu_enchanted_metal"),
]

def tier10 = [
    fluid("empoweredoil"), fluid("lifeessence"), fluid("essence"), fluid("meat"), fluid("latex"), fluid("sewage"),
    fluid("sludge"), fluid("biofuel"), fluid("if.pink_slime"), fluid("if.ore_fluid_raw"), fluid("if.ore_fluid_fermented"),
    fluid("liquidcoralium"),
]

def tier11 = [
    fluid("liquidantimatter"), fluid("boron_10"), fluid("boron_11"), fluid("lithium_6"), fluid("lithium_7"), fluid("corium"),
    fluid("high_pressure_steam"), fluid("exhaust_steam"), fluid("low_quality_steam"), fluid("emergency_coolant_heated"),
    fluid("strontium_90"), fluid("molybdenum"), fluid("ruthenium_106"), fluid("caesium_137"), fluid("promethium_147"), fluid("europium_155"),
    fluid("neodymium"), fluid("bismuth"), fluid("polonium"), fluid("radium"),
]

def tier12 = [
    fluid("iridium"), fluid("mana"), fluid("enrichedlava"), fluid("nak_hot"), fluid("nak"), fluid("flibe"),
]

def tier13 = [
    fluid("tritium"), fluid("plasma"), fluid("preheated_water"), fluid("sodium_tungstate_solution"), fluid("lead_tungstate_solution"),
    fluid("iodine"), fluid("yag"), fluid("nd_yag"), fluid("tungsten"), fluid("niobium"), fluid("chromium"), fluid("hafnium"),
    fluid("zinc"), fluid("osmium"), fluid("calcium"), fluid("strontium"), fluid("yttrium"), fluid("samarium"), fluid("terbium"),
    fluid("erbium"), fluid("ytterbium"), fluid("hot_mercury"),
]

def tier14 = [
    fluid("hot_mercury"), fluid("antihydrogen"), fluid("antideuterium"), fluid("antitritium"), fluid("antihelium3"), fluid("antihelium"),
    fluid("positronium"), fluid("muonium"), fluid("tauonium"), fluid("glueballs"),
]

def removeFluids = [
    fluid("construction_alloy"), fluid("if.protein"), fluid("crude_oil"), fluid("lead_platinum"), fluid("radaway"),
    fluid("radaway_slow"), fluid("redstone_ethanol"), fluid("borax_solution"), fluid("irradiated_borax_solution"),
    fluid("low_pressure_steam"), fluid("condensate_water"), fluid("sic_vapor"),
]

def ncIsotopes = [
    ["uranium", "u", [233, 235], [238]],
    ["neptunium", "n", [236], [237]],
    ["plutonium", "p", [239, 241], [238, 242]],
    ["americium", "a", [242], [241, 243]],
    ["curium", "cm", [243, 245, 247], [246]],
    ["berkelium", "b", [248], [247]],
    ["californium", "cf", [249, 251], [250, 252]],
]

def ncFuels = ["tbu", "mix_239", "mix_241"]

for (def f in ncIsotopes) {
    for (def x in f[2] + f[3]) tier11.add(fluid("${f[0]}_${x}"))
    for (def p in ["", "depleted_"]) {
        for (def fuel in ncFuels) {
            tier11.add(fluid("${p}${fuel}"))
            tier11.add(fluid("${p}${fuel}_fluoride"))
            tier12.add(fluid("${p}${fuel}_fluoride_flibe"))
        }
        for (def x in f[2]) {
            for (def d in ["le", "he"]) {
                tier11.add(fluid("${p}${d}${f[1]}_${x}"))
                tier11.add(fluid("${p}${d}${f[1]}_${x}_fluoride"))
                tier12.add(fluid("${p}${d}${f[1]}_${x}_fluoride_flibe"))
            }
        }
    }
}

def ncCoolants = [
    "iron", "redstone", "quartz", "obsidian", "nether_brick", "glowstone", "lapis", "gold", "prismarine",
    "slime", "end_stone", "purpur", "diamond", "emerald", "copper", "tin", "lead", "boron", "lithium", "magnesium",
    "manganese", "aluminum", "silver", "fluorite", "villiaumite", "carobbiite", "arsenic", "liquid_nitrogen", "liquid_helium", "enderium", "cryotheum"
]
for (def c in ncCoolants) {
    tier12.add(fluid("${c}_nak"))
    tier12.add(fluid("${c}_nak_hot"))
}

for (def it in tier2) TooltipEvents.setTier(it, 2)
for (def it in tier3) TooltipEvents.setTier(it, 3)
for (def it in tier4) TooltipEvents.setTier(it, 4)
for (def it in tier5) TooltipEvents.setTier(it, 5)
for (def it in tier6) TooltipEvents.setTier(it, 6)
for (def it in tier7) TooltipEvents.setTier(it, 7)
for (def it in tier8) TooltipEvents.setTier(it, 8)
for (def it in tier9) TooltipEvents.setTier(it, 9)
for (def it in tier10) TooltipEvents.setTier(it, 10)
for (def it in tier11) TooltipEvents.setTier(it, 11)
for (def it in tier12) TooltipEvents.setTier(it, 12)
for (def it in tier13) TooltipEvents.setTier(it, 13)
for (def it in tier14) TooltipEvents.setTier(it, 14)

for (def it in removeFluids) {
    mods.jei.ingredient.hide(it)
    TooltipEvents.setTier(it, 0)
}
