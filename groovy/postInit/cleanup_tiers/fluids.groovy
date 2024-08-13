import com.dimensional.gatewaycore.events.TooltipEvents

def tier2 = [fluid("tamoonwater")]

def tier3 = [
    fluid("plantoil"), fluid("ethanol"), fluid("biodiesel"), fluid("concrete"), fluid("potion"), fluid("invar"),
    fluid("constantan"), fluid("iron"), fluid("gold"), fluid("pigiron"), fluid("knightslime"), fluid("alubrass"),
    fluid("copper"), fluid("tin"), fluid("bronze"), fluid("lead"), fluid("nickel"), fluid("silver"), fluid("electrum"),
    fluid("steel"), fluid("aluminum"), fluid("stone"), fluid("clay"), fluid("dirt"), fluid("glass"), fluid("blood"),
    fluid("purpleslime"),
]

def tier4 = [
    fluid("emerald"), fluid("canolaoil"), fluid("refinedcanolaoil"), fluid("crystaloil"), fluid("evilcraftblood"),
]

def tier5 = [fluid("obsidian")]

def tier6 = [
    fluid("ender"), fluid("aetherworks.aetherium_gas"), fluid("aetherworks.impure_aetherium_gas"), fluid("oil_soul"), fluid("oil_dwarf"),
    fluid("gas_dwarf"), fluid("dawnstone"), fluid("alchemical_redstone"),
]

def tier7 = [
    fluid("steam"), fluid("coal"), fluid("refined_oil"), fluid("refined_fuel"), fluid("sap"), fluid("syrup"),
    fluid("resin"), fluid("tree_oil"), fluid("seed_oil"), fluid("biocrude"), fluid("refined_biofuel"),
    fluid("potion_splash"), fluid("potion_lingering"), fluid("platinum"), fluid("signalum"), fluid("lumium"), fluid("enderium"),
    fluid("cobalt"), fluid("ardite"), fluid("manyullyn"), fluid("pyrotheum"), fluid("aerotheum"), fluid("petrotheum"),
    fluid("liquid_crystal"), fluid("nutrient_distillation"), fluid("hootch"), fluid("rocket_fuel"), fluid("fire_water"),
    fluid("liquid_sunshine"), fluid("cloud_seed"), fluid("cloud_seed_concentrated"), fluid("electrical_steel"), fluid("energetic_alloy"),
    fluid("vibrant_alloy"), fluid("redstone_alloy"), fluid("conductive_iron"), fluid("pulsating_iron"), fluid("dark_steel"), fluid("soularium"),
    fluid("end_steel"),
]

def tier8 = [
    fluid("cryotheum"), fluid("rocketfuel"),
]

def tier9 = [
    fluid("ender_distillation"), fluid("vapor_of_levity"), 
]

def tier10 = [fluid("empoweredoil"), fluid("lifeessence")]

def tier12 = [
    fluid("iridium"), fluid("mana"), fluid("enrichedlava"),
]

for (def it in tier2) TooltipEvents.setTier(it, 2)
for (def it in tier3) TooltipEvents.setTier(it, 3)
for (def it in tier4) TooltipEvents.setTier(it, 4)
for (def it in tier5) TooltipEvents.setTier(it, 5)
for (def it in tier6) TooltipEvents.setTier(it, 6)
for (def it in tier7) TooltipEvents.setTier(it, 7)
for (def it in tier8) TooltipEvents.setTier(it, 8)
for (def it in tier9) TooltipEvents.setTier(it, 9)
for (def it in tier10) TooltipEvents.setTier(it, 10)
for (def it in tier12) TooltipEvents.setTier(it, 12)

mods.jei.ingredient.hide(fluid("uranium"))
TooltipEvents.setTier(fluid("uranium"), 0)
