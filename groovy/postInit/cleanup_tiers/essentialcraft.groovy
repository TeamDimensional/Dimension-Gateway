import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("essentialcraft:${name}", k)
}

def armorParts = ["helm", "chest", "legs", "boots"]
def armorParts2 = ["helmet", "chestplate", "leggings", "boots"]
def toolParts = ["pick", "axe", "hoe", "shovel", "sword"]
def elementalTools = [], windTools = [], weakTools = []
for (def type in toolParts) {
    elementalTools.add(mitem("elemental_${type}"))
    weakTools.add(mitem("weak_elemental_${type}"))
    windTools.add(mitem("wind_elemental_${type}"))
}
def allTools = elementalTools + windTools + weakTools

def magicalTier = [
    mitem("magicplating"), mitem("fortifiedglass"), mitem("eccontroller"), mitem("ecacceptor"), mitem("ecejector"), mitem("ecstatechecker"),
    mitem("ecredstonecontroller"), mitem("raytower"), mitem("naturalfurnace"), mitem("heatgenerator"), mitem("magiciantable"), mitem("fortifiedstone"),
    mitem("potionspreader"), mitem("magicalenchanter"), mitem("magicalrepairer"), mitem("matrixabsorber"), mitem("radiatingchamber"),
    mitem("magicaljukebox"), mitem("chargingchamber"), mitem("magicfence"), mitem("ffence"), mitem("blockpale"), mitem("platingpale"),
    mitem("corruptioncleaner"), mitem("magicalmirror"), mitem("controlrod"), mitem("redstonetransmitter"), mitem("magicalhopper"),
    mitem("metadatamanager"), mitem("blockbreaker"), mitem("furnacemagic"), mitem("furnacemagic", 4), mitem("furnacemagic", 8), 
    mitem("chest"), mitem("advbreaker"), mitem("intersector"), mitem("mrumover1"), mitem("bound_gem"), mitem("magicmonocle"),
    mitem("itemfilter"), mitem("itemfilter", 2), mitem("monsterclinger"), mitem("soulstone"), mitem("mrumover_t2"), mitem("craftingframe"),
    mitem("magicalalloy"), mitem("echoldingchamber"), mitem("gun.pistol"), mitem("gun.rifle"), mitem("gun.sniper"), mitem("gun.gatling"),
] + elementalTools
for (int i in 0..3) magicalTier.add(mitem("weaponmaker", i))
for (int i in 0..4) magicalTier.add(mitem("storage", i))
for (int i in [0, 1, 2, 3, 5, 6, 7]) magicalTier.add(mitem("device", i))
for (int i in [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
               21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
               33, 34, 38, 39, 40, 41, 42, 43, 44, 79]) magicalTier.add(mitem("genitem", i))
for (int i in 0..15) {
    magicalTier.add(mitem("fancyblock.fortifiedstone", i))
    magicalTier.add(mitem("fancyblock.magicplating", i))
    magicalTier.add(mitem("fancyblock.paleplating", i))
}

def spaceExplorationTier = [
    mitem("bottledwind"), mitem("imprisonedwind"), mitem("windkeeper"), mitem("helm_wind"), mitem("chest_wind"),
    mitem("legs_wind"), mitem("boots_wind"),
]

def windTier = [
    mitem("solarprism"), mitem("sunrayabsorber"), mitem("colddistillator"), mitem("invertedplating"), mitem("mithrilinecrystal"),
    mitem("mithrilinecrystal", 3), mitem("mithrilinefurnace"), mitem("playerpentacle"), mitem("windrune"),
    mitem("compressed", 5), mitem("crystallamp", 5), mitem("oremithriline"), mitem("air_potion"), mitem("endergenerator"),
    mitem("reactorsupport"), mitem("reactor"),
] + windTools + spaceExplorationTier
for (int i in [32, 46, 47, 48, 49, 50, 51, 55]) windTier.add(mitem("genitem", i))
for (def i in armorParts2) windTier.add(mitem("wind_${i}"))
for (int i in 0..15) {
    windTier.add(mitem("fancyblock.mithrilineplating", i))
}
for (int i in 0..3) windTier.add(mitem("mrumatrixprojection", i))

def industrialTier = [
    mitem("ecbalancer"), mitem("moonwell"), mitem("monsterharvester"), mitem("magmaticsmeltery"), mitem("crystalformer"), mitem("crystalcontroller"),
    mitem("crystalextractor"), mitem("mrucoilhardener"), mitem("mrucoil"), mitem("mimic"), mitem("magicalslag"), mitem("frozenmace"),
    mitem("magicaldigger"), mitem("spawnercollector"), mitem("staffoflife"), mitem("biomewand"), mitem("emeraldheart"),
    mitem("magicalshield"), mitem("spikyshield"), mitem("chaosfork"), mitem("magicwaterbottle"), mitem("magicalporkchop"), mitem("playerlist"),
    mitem("magmaticstaff"), mitem("magicallantern"), mitem("magnetizingstaff"), mitem("chunkloader"), mitem("dimtransciever"), mitem("magicalwings"),
    mitem("holymace"), mitem("genitem"), mitem("genitem", 20),
]
for (int i in 0..5) industrialTier.add(mitem("rightclicker", i))
for (int i in 0..15) industrialTier.add(mitem("essence", i))
for (def i in armorParts) industrialTier.add(mitem("${i}_magic"))
for (int i in 0..15) {
    industrialTier.add(mitem("fancyblock.mru", i))
    industrialTier.add(mitem("fancyblock.mimic", i))
}
for (int i in 0..3) industrialTier.add(mitem("elementalfuel", i))
for (int i in 0..9) industrialTier.add(mitem("charm", i))
for (def i in ["e", "f", "w", "a"]) industrialTier.add(mitem("${i}focus"))

def hoannaLoot = [
    mitem("titanite"),
    mitem("concrete"), mitem("root"), mitem("twinkling_titanite"),
]
for (int i in [35, 36, 37]) hoannaLoot.add(mitem("genitem", i))
for (int i in 0..7) hoannaLoot.add(mitem("ember", i))

def hoannaBuildingLoot = [
    mitem("levitator"), mitem("spreader")
]

def hoannaTier = [
    mitem("dreaddirt"), mitem("magicalteleporter"), mitem("darknessobelisk"), mitem("magicalfurnace"), mitem("emberforge"), mitem("voidfence"),
    mitem("ultraheatgen"), mitem("ultraflowerburner"), mitem("furnacemagic", 12), mitem("mithrilinecrystal", 6), mitem("chest", 1),
    mitem("elementalsword"), mitem("itemfilter", 1), mitem("itemfilter", 3), mitem("magicalbuilder"), mitem("voidstone"), mitem("voidglass"),
] + hoannaLoot + hoannaBuildingLoot
for (def i in armorParts) hoannaTier.add(mitem("${i}_void"))
for (int i in 0..15) {
    hoannaTier.add(mitem("fancyblock.voidstone", i))
    hoannaTier.add(mitem("fancyblock.concrete", i))
}

def inqDrops = [mitem("robocalypse"), mitem("orbitalremote"), mitem("dividergun")]
for (int i in [70, 71, 72, 73]) inqDrops.add(mitem("genitem", i))

def demonTier = [
    mitem("mithrilinecrystal", 9), mitem("demonicplating"), mitem("demonicpentacle"), mitem("holopad"), mitem("soulscriber"),
    mitem("computerboard"), mitem("soul"),
] + inqDrops
for (int i in [52, 53, 54, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67,
               68, 69, 74, 75]) demonTier.add(mitem("genitem", i))
for (def i in armorParts2) demonTier.add(mitem("computer_${i}"))
for (int i in 0..15) {
    demonTier.add(mitem("fancyblock.demonicplating", i))
}

def unknownItems = [
    mitem("cacti"), mitem("record"), mitem("record_a"), mitem("record_secret"), mitem("genitem", 45),
]
for (def i in armorParts) unknownItems.add(mitem("${i}_inq"))

def corruptions = []
for (int i in 0..7)
    for (def corru in ["chaos", "frozen", "magic", "shade"])
        corruptions.add(mitem("${corru}", i))

def removedOres = []
for (int i in [0, 1, 2, 3, 4, 5, 10, 11, 12, 13, 14])
    removedOres.add(mitem("oredrops", i))
for (int i in [1, 2])
    removedOres.add(mitem("oremithriline", i))
def creativeItems = [mitem("device", 4), mitem("device", 8)]

def removeItems = [
    mitem("miminvstorage"), mitem("newmim"), mitem("mimscreen"), mitem("mimcrafter"), mitem("mimejector"), mitem("miminjector"),
    mitem("mimejectorp"), mitem("miminjectorp"), mitem("inventorygem"), mitem("magicalquarry"),
]
for (int i in [17, 18, 19, 77, 78, 80, 81]) removeItems.add(mitem("genitem", i))

def hideFromJei = [
    item("baubles:ring"), mitem("drops"), mitem("drops", 1), mitem("drops", 2), mitem("drops", 3), mitem("elementalcrystal"),
    mitem("flowergreen"), mitem("fruit"), mitem("tallgrass"), mitem("torch"), mitem("magicaldisplay"), mitem("portal"),
    mitem("mithrilinecrystal", 12), mitem("weathercontroller"), mitem("testitem"), mitem("mrumatrixprojection", 4), mitem("fruit_item"), mitem("bauble"),
    mitem("shadesword"), mitem("shadeslasher"), mitem("shadeknife"), mitem("collectedspawner"), mitem("balance_setter"),
    mitem("clearing_catalyst"), mitem("raining_catalyst"), mitem("thundering_catalyst")
] + corruptions + removedOres + removeItems
for (int i in [2, 76]) hideFromJei.add(mitem("genitem", i))
for (int i in 0..13) hideFromJei.add(mitem("entityegg", i))

for (def it in magicalTier) TooltipEvents.setTier(it, 5)
for (def it in windTier) TooltipEvents.setTier(it, 8)
for (def it in industrialTier) TooltipEvents.setTier(it, 8)
for (def it in hoannaTier) TooltipEvents.setTier(it, 13)
for (def it in demonTier) TooltipEvents.setTier(it, 14)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in unknownItems) TooltipEvents.setTier(it, -1)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeItems) crafting.removeByOutput(it)
for (def it in inqDrops) TooltipEvents.setTooltip(it, "Dropped by the Holographic Projection.")
for (def it in hoannaLoot) TooltipEvents.setTooltip(it, "Found in dungeons in Hoanna.")
for (def it in hoannaBuildingLoot) TooltipEvents.setTooltip(it, "Found in city ruins in Hoanna.")
for (def it in 0..15) TooltipEvents.setTooltip(mitem("essence", it), "Produced by the Crystal Extractor.")
TooltipEvents.setTooltip(mitem("magicalalloy"), "Made in the Magmatic Furnace or Magmatic Smeltery.")
TooltipEvents.setTooltip(mitem("elementalsword"), "Made in Ember Forge.")
TooltipEvents.setUnlock(mitem("windtablet"), 13)

for (def tool in allTools) GatewayHelpers.banTool(tool)
