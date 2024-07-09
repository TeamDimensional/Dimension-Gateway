import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def armorParts = ["helm", "chest", "legs", "boots"]
def armorParts2 = ["helmet", "chestplate", "leggings", "boots"]
def toolParts = ["pick", "axe", "hoe", "shovel", "sword"]
def elementalTools = [], windTools = [], weakTools = []
for (def type in toolParts) {
    elementalTools.add(item("essentialcraft:elemental_${type}"))
    weakTools.add(item("essentialcraft:weak_elemental_${type}"))
    windTools.add(item("essentialcraft:wind_elemental_${type}"))
}
def allTools = elementalTools + windTools + weakTools

def magicalTier = [
    item("essentialcraft:magicplating"), item("essentialcraft:fortifiedglass"), item("essentialcraft:eccontroller"),
    item("essentialcraft:ecacceptor"), item("essentialcraft:ecejector"), item("essentialcraft:ecstatechecker"),
    item("essentialcraft:ecredstonecontroller"), item("essentialcraft:raytower"), item("essentialcraft:naturalfurnace"),
    item("essentialcraft:heatgenerator"), item("essentialcraft:magiciantable"), item("essentialcraft:fortifiedstone"),
    item("essentialcraft:potionspreader"), item("essentialcraft:magicalenchanter"), item("essentialcraft:magicalrepairer"),
    item("essentialcraft:matrixabsorber"), item("essentialcraft:radiatingchamber"), item("essentialcraft:magicaljukebox"),
    item("essentialcraft:chargingchamber"), item("essentialcraft:magicfence"), item("essentialcraft:ffence"),
    item("essentialcraft:blockpale"), item("essentialcraft:platingpale"), item("essentialcraft:corruptioncleaner"),
    item("essentialcraft:magicalmirror"), item("essentialcraft:controlrod"), item("essentialcraft:redstonetransmitter"),
    item("essentialcraft:magicalhopper"), item("essentialcraft:metadatamanager"), item("essentialcraft:blockbreaker"),
    item("essentialcraft:furnacemagic"), item("essentialcraft:furnacemagic", 4), item("essentialcraft:furnacemagic", 8), 
    item("essentialcraft:chest"), item("essentialcraft:advbreaker"), item("essentialcraft:intersector"),
    item("essentialcraft:mrumover1"), item("essentialcraft:bound_gem"), item("essentialcraft:magicmonocle"),
    item("essentialcraft:itemfilter"), item("essentialcraft:itemfilter", 2), item("essentialcraft:monsterclinger"),
    item("essentialcraft:soulstone"), item("essentialcraft:mrumover_t2"), item("essentialcraft:craftingframe"),
    item("essentialcraft:magicalalloy"), item("essentialcraft:echoldingchamber"),
    item("essentialcraft:gun.pistol"), item("essentialcraft:gun.rifle"), item("essentialcraft:gun.sniper"),
    item("essentialcraft:gun.gatling"),
] + elementalTools
for (int i in 0..3) magicalTier.add(item("essentialcraft:weaponmaker", i))
for (int i in 0..4) magicalTier.add(item("essentialcraft:storage", i))
for (int i in [0, 1, 2, 3, 5, 6, 7]) magicalTier.add(item("essentialcraft:device", i))
for (int i in [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
               21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
               33, 34, 38, 39, 40, 41, 42, 43, 44, 79]) magicalTier.add(item("essentialcraft:genitem", i))
for (int i in 0..15) {
    magicalTier.add(item("essentialcraft:fancyblock.fortifiedstone", i))
    magicalTier.add(item("essentialcraft:fancyblock.magicplating", i))
    magicalTier.add(item("essentialcraft:fancyblock.paleplating", i))
}

def spaceExplorationTier = [
    item("essentialcraft:bottledwind"), item("essentialcraft:imprisonedwind"), item("essentialcraft:windkeeper"),
    item("essentialcraft:helm_wind"), item("essentialcraft:chest_wind"), item("essentialcraft:legs_wind"),
    item("essentialcraft:boots_wind"),
]

def windTier = [
    item("essentialcraft:solarprism"), item("essentialcraft:sunrayabsorber"), item("essentialcraft:colddistillator"),
    item("essentialcraft:invertedplating"), item("essentialcraft:mithrilinecrystal"), item("essentialcraft:mithrilinecrystal", 3),
    item("essentialcraft:mithrilinefurnace"), item("essentialcraft:playerpentacle"), item("essentialcraft:windrune"),
    item("essentialcraft:compressed", 5), item("essentialcraft:crystallamp", 5), item("essentialcraft:oremithriline"),
    item("essentialcraft:air_potion"), item("essentialcraft:endergenerator"),
    item("essentialcraft:reactorsupport"), item("essentialcraft:reactor"),
] + windTools + spaceExplorationTier
for (int i in [32, 46, 47, 48, 49, 50, 51, 55]) windTier.add(item("essentialcraft:genitem", i))
for (def i in armorParts2) windTier.add(item("essentialcraft:wind_${i}"))
for (int i in 0..15) {
    windTier.add(item("essentialcraft:fancyblock.mithrilineplating", i))
}
for (int i in 0..3) windTier.add(item("essentialcraft:mrumatrixprojection", i))

def industrialTier = [
    item("essentialcraft:ecbalancer"),item("essentialcraft:moonwell"), item("essentialcraft:magicalquarry"),
    item("essentialcraft:monsterharvester"), item("essentialcraft:magmaticsmeltery"),
    item("essentialcraft:crystalformer"), item("essentialcraft:crystalcontroller"), item("essentialcraft:crystalextractor"),
    item("essentialcraft:mrucoilhardener"), item("essentialcraft:mrucoil"), item("essentialcraft:mimic"),
    item("essentialcraft:magicalslag"), item("essentialcraft:frozenmace"),
    item("essentialcraft:magicaldigger"), item("essentialcraft:spawnercollector"),
    item("essentialcraft:staffoflife"), item("essentialcraft:biomewand"), item("essentialcraft:emeraldheart"),
    item("essentialcraft:magicalshield"), item("essentialcraft:spikyshield"), item("essentialcraft:chaosfork"),
    item("essentialcraft:magicwaterbottle"), item("essentialcraft:magicalporkchop"), item("essentialcraft:playerlist"),
    item("essentialcraft:magmaticstaff"), item("essentialcraft:magicallantern"), item("essentialcraft:magnetizingstaff"),
    item("essentialcraft:chunkloader"), item("essentialcraft:dimtransciever"), item("essentialcraft:magicalwings"),
    item("essentialcraft:holymace"),
]
for (int i in 0..5) industrialTier.add(item("essentialcraft:rightclicker", i))
for (int i in 0..15) industrialTier.add(item("essentialcraft:essence", i))
for (def i in armorParts) industrialTier.add(item("essentialcraft:${i}_magic"))
for (int i in [17, 18, 19, 20, 77, 78, 80, 81]) industrialTier.add(item("essentialcraft:genitem", i))
for (int i in 0..15) {
    industrialTier.add(item("essentialcraft:fancyblock.mru", i))
    industrialTier.add(item("essentialcraft:fancyblock.mimic", i))
}
for (int i in 0..3) industrialTier.add(item("essentialcraft:elementalfuel", i))
for (int i in 0..9) industrialTier.add(item("essentialcraft:charm", i))
for (def i in ["e", "f", "w", "a"]) industrialTier.add(item("essentialcraft:${i}focus"))

def hoannaLoot = [
    item("essentialcraft:titanite"),
    item("essentialcraft:concrete"), item("essentialcraft:root"), item("essentialcraft:twinkling_titanite"),
]
for (int i in [35, 36, 37]) hoannaLoot.add(item("essentialcraft:genitem", i))
for (int i in 0..7) hoannaLoot.add(item("essentialcraft:ember", i))

def hoannaBuildingLoot = [
    item("essentialcraft:levitator"), item("essentialcraft:spreader")
]

def hoannaTier = [
    item("essentialcraft:dreaddirt"), item("essentialcraft:magicalteleporter"), item("essentialcraft:darknessobelisk"),
    item("essentialcraft:magicalfurnace"), item("essentialcraft:emberforge"), item("essentialcraft:voidfence"),
    item("essentialcraft:ultraheatgen"), item("essentialcraft:ultraflowerburner"), item("essentialcraft:furnacemagic", 12),
    item("essentialcraft:mithrilinecrystal", 6), item("essentialcraft:chest", 1), item("essentialcraft:elementalsword"),
    item("essentialcraft:itemfilter", 1), item("essentialcraft:itemfilter", 3), item("essentialcraft:magicalbuilder"),
    item("essentialcraft:voidstone"), item("essentialcraft:voidglass"),
] + hoannaLoot + hoannaBuildingLoot
for (def i in armorParts) hoannaTier.add(item("essentialcraft:${i}_void"))
for (int i in 0..15) {
    hoannaTier.add(item("essentialcraft:fancyblock.voidstone", i))
    hoannaTier.add(item("essentialcraft:fancyblock.concrete", i))
}

def inqDrops = [
    item("essentialcraft:robocalypse"),
    item("essentialcraft:orbitalremote"), item("essentialcraft:dividergun"),
]
for (int i in [70, 71, 72, 73]) inqDrops.add(item("essentialcraft:genitem", i))

def demonTier = [
    item("essentialcraft:mithrilinecrystal", 9), item("essentialcraft:demonicplating"), item("essentialcraft:demonicpentacle"),
    item("essentialcraft:holopad"), item("essentialcraft:soulscriber"), item("essentialcraft:computerboard"),
    item("essentialcraft:soul"),
] + inqDrops
for (int i in [52, 53, 54, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67,
               68, 69, 74, 75]) demonTier.add(item("essentialcraft:genitem", i))
for (def i in armorParts2) demonTier.add(item("essentialcraft:computer_${i}"))
for (int i in 0..15) {
    demonTier.add(item("essentialcraft:fancyblock.demonicplating", i))
}

def unknownItems = [
    item("essentialcraft:cacti"), item("essentialcraft:record"), item("essentialcraft:record_a"),
    item("essentialcraft:record_secret"), item("essentialcraft:genitem", 45),
]
for (def i in armorParts) unknownItems.add(item("essentialcraft:${i}_inq"))

def corruptions = []
for (int i in 0..7)
    for (def corru in ["chaos", "frozen", "magic", "shade"])
        corruptions.add(item("essentialcraft:${corru}", i))

def removedOres = []
for (int i in [0, 1, 2, 3, 4, 5, 10, 11, 12, 13, 14])
    removedOres.add(item("essentialcraft:oredrops", i))
for (int i in [1, 2])
    removedOres.add(item("essentialcraft:oremithriline", i))
def creativeItems = [item("essentialcraft:device", 4), item("essentialcraft:device", 8)]

def removeItems = [
    item("essentialcraft:miminvstorage"), item("essentialcraft:newmim"), item("essentialcraft:mimscreen"),
    item("essentialcraft:mimcrafter"), item("essentialcraft:mimejector"), item("essentialcraft:miminjector"),
    item("essentialcraft:mimejectorp"), item("essentialcraft:miminjectorp"), item("essentialcraft:inventorygem"),
]

def hideFromJei = [
    item("baubles:ring"), item("essentialcraft:drops"), item("essentialcraft:drops", 1),
    item("essentialcraft:drops", 2), item("essentialcraft:drops", 3), item("essentialcraft:elementalcrystal"),
    item("essentialcraft:flowergreen"), item("essentialcraft:fruit"), item("essentialcraft:tallgrass"),
    item("essentialcraft:torch"), item("essentialcraft:magicaldisplay"), item("essentialcraft:portal"),
    item("essentialcraft:mithrilinecrystal", 12), item("essentialcraft:weathercontroller"), item("essentialcraft:testitem"),
    item("essentialcraft:mrumatrixprojection", 4), item("essentialcraft:fruit_item"), item("essentialcraft:bauble"),
    item("essentialcraft:shadesword"), item("essentialcraft:shadeslasher"), item("essentialcraft:shadeknife"),
    item("essentialcraft:collectedspawner"), item("essentialcraft:balance_setter"),
    item("essentialcraft:clearing_catalyst"), item("essentialcraft:raining_catalyst"), item("essentialcraft:thundering_catalyst")
] + corruptions + removedOres + removeItems
for (int i in [2, 76]) hideFromJei.add(item("essentialcraft:genitem", i))
for (int i in 0..13) hideFromJei.add(item("essentialcraft:entityegg", i))

for (def it in magicalTier) TooltipEvents.setTier(it, 5)
for (def it in windTier) TooltipEvents.setTier(it, 8)
for (def it in industrialTier) TooltipEvents.setTier(it, 11)
for (def it in hoannaTier) TooltipEvents.setTier(it, 13)
for (def it in demonTier) TooltipEvents.setTier(it, 15)
for (def it in creativeItems) TooltipEvents.setTier(it, 17)
for (def it in unknownItems) TooltipEvents.setTier(it, -1)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeItems) crafting.removeByOutput(it)
for (def it in inqDrops) TooltipEvents.setTooltip(it, "Dropped by the Holographic Projection.")
for (def it in hoannaLoot) TooltipEvents.setTooltip(it, "Found in dungeons in Hoanna.")
for (def it in hoannaBuildingLoot) TooltipEvents.setTooltip(it, "Found in city ruins in Hoanna.")
for (def it in 0..15) TooltipEvents.setTooltip(item("essentialcraft:essence", it), "Produced by the Crystal Extractor.")
TooltipEvents.setTooltip(item("essentialcraft:magicalalloy"), "Made in the Magmatic Furnace or Magmatic Smeltery.")
TooltipEvents.setTooltip(item("essentialcraft:elementalsword"), "Made in Ember Forge.")
TooltipEvents.setUnlock(item("essentialcraft:windtablet"), 13)
TooltipEvents.setUnlock(item("essentialcraft:genitem"), 11)

for (def tool in allTools) GatewayHelpers.banTool(tool)

/*
Needed recipes:
Elemental Ore generation in nether

Ender Generator (tier 5 -> tier 8)
Solar Prism (tier 11 -> tier 8)
MRUMP - Empty (tier 5 -> tier 8)
MRU Coil Base (tier 5 -> tier 8)
MRU Tesla Reactor Support (tier 5 -> tier 8)
Look through the code to see whether Magical Slag is obtainable without Magmatic Smeltery
Demonic Pentacle (bugged recipe -> tier 15)
Void Stone (bugged recipe -> tier 13)
Void Glass (bugged recipe -> tier 13)
Creative MRU Source (endgame)
Creative ESPE Source (endgame)
MRU Chunk Loader (missing -> tier 11)
MRU Dimensional Transceiver (missing -> tier 11)
Bound Gem (tier 2 -> tier 5)
Combined Magical Alloys (tier 5 -> tier 11)
Elemental Core (tier 1 -> tier 5)
Heat Rod (tier 1 -> tier 5)
Iron Frame (tier 1 -> tier 5)
MRU Linking Device (cannot require ender pearls)
MRU Collecting Device (cannot require ender pearls)
Eye of Absorption (cannot require ender pearls)
Sun Imbued Glass (tier 5 -> tier 8)
Magical Ingot (fix thaumium casting)
Magical Plate (fix thaumium casting)
Fix metal press
Fix pale items
New recipe for Elemental Gem
JEI handler for Magmatic Smeltery and Magmatic Furnace
JEI handler for Crystal Extractor
JEI handler for crystal growth
Soul Scriber (tier 2 -> tier 15)
Wind Tablet (tier 11 -> end of tier 12)
*/
