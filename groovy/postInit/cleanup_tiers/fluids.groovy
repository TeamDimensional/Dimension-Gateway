import com.dimensional.gatewaycore.events.TooltipEvents

def metallurgyTier = [
    fluid("plantoil"), fluid("ethanol"), fluid("biodiesel"), fluid("concrete"), fluid("potion"), fluid("invar"),
    fluid("constantan"), fluid("iron"), fluid("gold"), fluid("pigiron"), fluid("knightslime"), fluid("alubrass"),
    fluid("copper"), fluid("tin"), fluid("bronze"), fluid("lead"), fluid("nickel"), fluid("silver"), fluid("electrum"),
    fluid("steel"), fluid("aluminum"), fluid("stone"), fluid("clay"), fluid("dirt"), fluid("glass"), fluid("blood"),
    fluid("purpleslime"),
]

def tier4 = [fluid("emerald")]

def tier5 = [fluid("obsidian")]

def tier6 = [fluid("ender")]

def techTier = [
    fluid("steam"), fluid("coal"), fluid("refined_oil"), fluid("refined_fuel"), fluid("sap"), fluid("syrup"),
    fluid("resin"), fluid("tree_oil"), fluid("seed_oil"), fluid("biocrude"), fluid("refined_biofuel"),
    fluid("potion_splash"), fluid("potion_lingering"), fluid("platinum"), fluid("signalum"), fluid("lumium"), fluid("enderium"),
    fluid("cobalt"), fluid("ardite"), fluid("manyullyn"), fluid("pyrotheum"), fluid("aerotheum"), fluid("petrotheum"),
]

def automationTier = [
    fluid("cryotheum"),
]

def rocketScienceTier = [
    fluid("iridium"), fluid("mana"),
]

for (def it in metallurgyTier) TooltipEvents.setTier(it, 3)
for (def it in tier4) TooltipEvents.setTier(it, 4)
for (def it in tier5) TooltipEvents.setTier(it, 5)
for (def it in tier6) TooltipEvents.setTier(it, 6)
for (def it in techTier) TooltipEvents.setTier(it, 7)
for (def it in automationTier) TooltipEvents.setTier(it, 8)
for (def it in rocketScienceTier) TooltipEvents.setTier(it, 12)

mods.jei.ingredient.hide(fluid("uranium"))
TooltipEvents.setTier(fluid("uranium"), 0)
