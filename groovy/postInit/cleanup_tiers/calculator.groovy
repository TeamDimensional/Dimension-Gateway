import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("calculator:${name}", k)
}

def basicItems = [
    mitem("reinforcedchest"), mitem("stoneseparator"), mitem("hungerprocessor"), mitem("dockingstation"),
    mitem("basicgreenhouse"), mitem("starchextractor"), mitem("redstoneextractor"), mitem("rainsensor"),
    mitem("gaslanternoff"), mitem("scarecrow"), mitem("pearlog"), mitem("pearplanks"), mitem("pearstairs"), mitem("pearfence"),
    mitem("pearleaves"), mitem("pearsapling"), mitem("infocalculator"), mitem("calculator"), mitem("craftingcalculator"),
    mitem("scientificcalculator"), mitem("hungermodule"), mitem("terrainmodule"), mitem("advancedterrainmodule"),
    mitem("energymodule"), mitem("smallstone"), mitem("calculatorscreen"), mitem("calculatorassembly"), mitem("advancedassembly"),
    mitem("wrench"), mitem("sickle"), mitem("enrichedgold"), mitem("enrichedgoldingot"), mitem("reinforcedironingot"),
    mitem("redstoneingot"), mitem("weakeneddiamond"), mitem("largeamethyst"), mitem("smallamethyst"), mitem("shardamethyst"),
    mitem("broccoliseeds"), mitem("broccoli"), mitem("pear"), mitem("rottenpear"), mitem("cookedbroccoli"), mitem("lantern"),
    mitem("coaldust"), mitem("enrichedcoal"), mitem("purifiedcoal"), mitem("firecoal"), mitem("babygrenade"), mitem("grenade"),
]
for (int i in [0, 2, 3, 4, 9]) basicItems.add(mitem("material", i))

def atomicItems = [
    mitem("atomiccalculator"), mitem("dynamiccalculator"), mitem("algorithmseparator"), mitem("healthprocessor"),
    mitem("precisionchamber"), mitem("processingchamber"), mitem("storagechamber"), mitem("fabricationchamber"),
    mitem("advancedgreenhouse"), mitem("conductormast"), mitem("weatherstation"), mitem("transmitter"),
    mitem("glowstoneextractor"), mitem("weathercontroller"), mitem("stoneassimilator"), mitem("algorithmassimilator"),
    mitem("amethystlog"), mitem("amethystplanks"), mitem("amethyststairs"), mitem("amethystfence"), mitem("amethystleaves"),
    mitem("amethystsapling"), mitem("tanzanitelog"), mitem("tanzaniteplanks"), mitem("tanzanitestairs"), mitem("tanzanitefence"),
    mitem("tanzaniteleaves"), mitem("tanzanitesapling"), mitem("warpmodule"), mitem("jumpmodule"), mitem("healthmodule"),
    mitem("soil"), mitem("speedupgrade"), mitem("energyupgrade"), mitem("voidupgrade"), mitem("transferupgrade"),
    mitem("atomicmodule"), mitem("atomicassembly"), mitem("atomicbinder"), mitem("flawlessdiamond"), mitem("firediamond"),
    mitem("electricdiamond"), mitem("largetanzanite"), mitem("smalltanzanite"), mitem("shardtanzanite"), mitem("prunaeseeds"),
    mitem("storagemodule"),
]
for (int i in [1, 5, 6, 7]) atomicItems.add(mitem("material", i))
for (int i in 0..13) {
    atomicItems.add(mitem("circuitboard", i))
    atomicItems.add(mitem("circuitdamaged", i))
    atomicItems.add(mitem("circuitdirty", i))
}

def cobaltItems = [
    mitem("material", 8), mitem("nutritionmodule"), mitem("enddiamond"),
]

def flawlessItems = [
    mitem("flawlessglass"), mitem("purifiedobsidian"), mitem("moduleworkstation"), mitem("flawlessgreenhouse"),
    mitem("co2generator"), mitem("diamondlog"), mitem("diamondplanks"), mitem("diamondstairs"), mitem("diamondfence"),
    mitem("diamondleaves"), mitem("diamondsapling"), mitem("flawlesscalculator"), mitem("flawlessassembly"),
    mitem("obsidiankey"), mitem("fiddledewfruit"), mitem("controlledfuel"),
]

def tier9Items = [
    mitem("analysingchamber"), mitem("calculatorlocator"), mitem("calculatorplug"), mitem("locatormodule"),
]

def removeRecipes = [
    mitem("powercube"), mitem("advancedpowercube"), mitem("reinforcedfurnace"), mitem("extractionchamber"), mitem("reassemblychamber"),
    mitem("restorationchamber"), mitem("handcrankedgenerator"), mitem("crankhandle"), mitem("grenadecasing"),
]

def creativeItems = [
    mitem("creativepowercube"), mitem("atomicmultiplier"),
]

def hideFromJei = [
    mitem("amethystpiping"), mitem("tanzanitepiping"), mitem("magneticflux")
] + removeRecipes

def tools = ["sword", "pickaxe", "axe", "shovel", "hoe"]
for (def it in tools) {
    for (def mat in ["reinforced", "enrichedgold", "reinforcediron", "redstone", "weakeneddiamond"]) basicItems.add(mitem(mat + it))
    for (def mat in ["flawlessdiamond", "firediamond", "electric"]) atomicItems.add(mitem(mat + it))
    for (def mat in ["endforged"]) cobaltItems.add(mitem(mat + it))
}

for (def it in basicItems) TooltipEvents.setTier(it, 5)
for (def it in atomicItems) TooltipEvents.setTier(it, 6)
for (def it in cobaltItems) TooltipEvents.setTier(it, 7)
for (def it in flawlessItems) TooltipEvents.setTier(it, 8)
for (def it in tier9Items) TooltipEvents.setTier(it, 9)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)

TooltipEvents.setTooltip(mitem("jumpmodule"), "Warning! Don't use this without a good Feather Falling armor or equivalent.", textformat("RED"))
