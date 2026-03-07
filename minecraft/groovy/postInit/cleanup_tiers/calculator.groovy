import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("calculator:${name}", k)
}

def t3Items = [
    mitem("advancedpowercube"),
]

def basicItems = [
    mitem("reinforcedchest"), mitem("stoneseparator"), mitem("dockingstation"),
    mitem("basicgreenhouse"), mitem("starchextractor"), mitem("redstoneextractor"), mitem("rainsensor"),
    mitem("gaslanternoff"), mitem("scarecrow"), mitem("craftingcalculator"),
    mitem("scientificcalculator"), mitem("terrainmodule"), mitem("advancedterrainmodule"),
    mitem("energymodule"), mitem("smallstone"), mitem("calculatorscreen"), mitem("calculatorassembly"), mitem("advancedassembly"),
    mitem("wrench"), mitem("sickle"), mitem("enrichedgold"), mitem("enrichedgoldingot"), mitem("reinforcedironingot"),
    mitem("redstoneingot"), mitem("weakeneddiamond"), mitem("largeamethyst"), mitem("smallamethyst"), mitem("shardamethyst"),
    mitem("broccoliseeds"), mitem("broccoli"), mitem("cookedbroccoli"), mitem("lantern"),
    mitem("coaldust"), mitem("enrichedcoal"), mitem("purifiedcoal"), mitem("firecoal"), mitem("babygrenade"), mitem("grenade"),
    mitem("calculator"),
]
for (int i in [0, 2, 3, 4, 9]) basicItems.add(mitem("material", i))

def atomicItems = [
    mitem("atomiccalculator"), mitem("dynamiccalculator"), mitem("algorithmseparator"),
    mitem("advancedgreenhouse"), mitem("conductormast"), mitem("weatherstation"), mitem("transmitter"),
    mitem("glowstoneextractor"), mitem("weathercontroller"), mitem("warpmodule"), mitem("jumpmodule"),
    mitem("soil"), mitem("speedupgrade"), mitem("energyupgrade"), mitem("voidupgrade"), mitem("transferupgrade"),
    mitem("atomicmodule"), mitem("atomicassembly"), mitem("atomicbinder"), mitem("flawlessdiamond"), mitem("firediamond"),
    mitem("electricdiamond"), mitem("largetanzanite"), mitem("smalltanzanite"), mitem("shardtanzanite"), mitem("prunaeseeds"),
    mitem("storagemodule"), mitem("pearlog"), mitem("pearplanks"), mitem("pearstairs"), mitem("pearfence"),
    mitem("pearleaves"), mitem("pearsapling"), mitem("pear"), mitem("rottenpear"), mitem("fabricationchamber"),
    // Circuits part 1 needed for powergens and upgrades
    mitem("precisionchamber"), mitem("processingchamber"), mitem("storagechamber"), mitem("analysingchamber"),
]
for (int i in [1, 5, 6, 7]) atomicItems.add(mitem("material", i))
for (int i in 0..13) {
    atomicItems.add(mitem("circuitboard", i))
    atomicItems.add(mitem("circuitdamaged", i))
    atomicItems.add(mitem("circuitdirty", i))
}

def hungerItems = [
    mitem("amethystlog"), mitem("amethystplanks"), mitem("amethyststairs"), mitem("amethystfence"), mitem("amethystleaves"),
    mitem("amethystsapling"), mitem("hungerprocessor"), mitem("hungermodule"), mitem("stoneassimilator"),
]

def healthItems = [
    mitem("tanzanitelog"), mitem("tanzaniteplanks"), mitem("tanzanitestairs"), mitem("tanzanitefence"), mitem("tanzaniteleaves"),
    mitem("tanzanitesapling"), mitem("algorithmassimilator"), mitem("healthprocessor"), mitem("healthmodule"), mitem("nutritionmodule"),
]

def starsteelItems = [
    mitem("material", 8), mitem("enddiamond"),
]

def flawlessItems = [
    mitem("flawlessglass"), mitem("purifiedobsidian"), mitem("moduleworkstation"), mitem("flawlessgreenhouse"),
    mitem("co2generator"), mitem("diamondlog"), mitem("diamondplanks"), mitem("diamondstairs"), mitem("diamondfence"),
    mitem("diamondleaves"), mitem("diamondsapling"), mitem("flawlesscalculator"), mitem("flawlessassembly"),
    mitem("obsidiankey"), mitem("fiddledewfruit"), mitem("controlledfuel"),
]

def locatorItems = [
    mitem("calculatorlocator"), mitem("calculatorplug"), mitem("locatormodule"),
]

def removeRecipes = [
    mitem("powercube"), mitem("reinforcedfurnace"), mitem("extractionchamber"), mitem("reassemblychamber"),
    mitem("restorationchamber"), mitem("handcrankedgenerator"), mitem("crankhandle"), mitem("grenadecasing"),
]

def creativeItems = [
    mitem("creativepowercube"), mitem("atomicmultiplier"),
]

def hideFromJei = [
    mitem("amethystpiping"), mitem("tanzanitepiping"), mitem("magneticflux"), mitem("conductormastblock"), mitem("weatherstationblock"),
    mitem("transmitterblock"), mitem("gaslanternon"), mitem("scarecrowblock"), mitem("calculatorscreenblock"),
    mitem("cropbroccoli"), mitem("cropprunae"), mitem("cropfiddledew"),
] + removeRecipes

def tools = ["sword", "pickaxe", "axe", "shovel", "hoe"]
for (def it in tools) {
    for (def mat in ["reinforced", "enrichedgold", "reinforcediron", "redstone", "weakeneddiamond"]) basicItems.add(mitem(mat + it))
    for (def mat in ["flawlessdiamond", "firediamond", "electric"]) atomicItems.add(mitem(mat + it))
    for (def mat in ["endforged"]) starsteelItems.add(mitem(mat + it))
}

for (def it in t3Items) TooltipEvents.setTier(it, 3)
for (def it in basicItems) TooltipEvents.setTier(it, 6)
for (def it in atomicItems) TooltipEvents.setTier(it, 6)
for (def it in starsteelItems) TooltipEvents.setTier(it, 6)
for (def it in flawlessItems) TooltipEvents.setTier(it, 6)
for (def it in hungerItems) TooltipEvents.setTier(it, 7)
for (def it in healthItems) TooltipEvents.setTier(it, 10)
for (def it in locatorItems) TooltipEvents.setTier(it, 12)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)

TooltipEvents.setTooltip(mitem("jumpmodule"), "Warning! Don't use this without a good Feather Falling armor or equivalent.", textformat("RED"))
TooltipEvents.setModTier("sonarcore", 6)
