import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("theaurorian:${name}", k)
}

def moonTempleLoot = [
    mitem("crystallinepickaxe"), mitem("crystallinesword"), mitem("crystallineshield"), mitem("moontemplecellkeyfragment"),
    mitem("scrapcrystalline"), mitem("trophymoonqueen"),
]
def darkstoneLoot = [
    mitem("umbrapickaxe"), mitem("umbrasword"), mitem("umbrashield"), mitem("darkamulet"), mitem("scrapumbra"), mitem("spikedchestplate"),
    mitem("trophyspider"), mitem("absorptionorb"),
]
def runestoneLoot = [
    mitem("aurorianiteaxe"), mitem("aurorianitepickaxe"), mitem("aurorianitesword"), mitem("keeperamulet"), mitem("bepsi"), mitem("keepersbow"),
    mitem("runestonekey"), mitem("runestonelootkey"), mitem("scrapaurorianite"), mitem("strangemeat"), mitem("trophykeeper"),
]

def unobtainable = [
    mitem("darkstonebricks"), mitem("darkstonefancy"), mitem("darkstonegate"), mitem("darkstonegatekeyhole"), mitem("darkstonelamp"),
    mitem("darkstonelayers"), mitem("darkstonestairs"), mitem("moontemplebricks"), mitem("moontemplebars"),
    mitem("moontemplegate"), mitem("moontemplecellgate"), mitem("moontemplegatekeyhole"), mitem("moontemplecellgatekeyhole"),
    mitem("moontemplelamp"), mitem("moontemplebrickssmooth"), mitem("moontemplestairs"), mitem("runestone"), mitem("runestonebars"),
    mitem("runestonegate"), mitem("runestonegatekeyhole"), mitem("runestonelootgatekeyhole"), mitem("runestonelootgate"), mitem("runestonelamp"),
    mitem("runestonesmooth"), mitem("runestonestairs"),
]

def crystallineItems = [mitem("crystallineingot")]
def aurorianiteItems = [mitem("aurorianiteingot")]
def umbraItems = [mitem("umbraingot")]

def steelItems = []
for (def it in ["boots", "chestplate", "helmet", "leggings", "axe", "hoe", "nugget", "pickaxe", "shovel",
                "sword", "", "block"]) {
    steelItems.add(mitem("auroriansteel${it}"))
}

def generalItems = [
    mitem("aurorianbacon"), mitem("auroriancoal"), mitem("auroriancoalnugget"), mitem("aurorianpork"), mitem("aurorianporkcooked"),
    mitem("lavender"), mitem("lavenderbread"), mitem("plantfiber"), mitem("lavenderseeds"), mitem("silentwoodstick"),
    mitem("silkberry"), mitem("soullessflesh"), mitem("spectralsilk"), mitem("silkberryjam"), mitem("silkberryjamsandwich"), mitem("silkshroomstew"),
    mitem("weepingwillowsap"), mitem("auroriancobblestone"), mitem("auroriancobblestonestairs"), mitem("auroriandirt"),
    mitem("aurorianfarmtile"), mitem("aurorianfurnace"), mitem("auroriangrass"), mitem("auroriangrasslight"),
    mitem("aurorianstone"), mitem("aurorianstonebrick"), mitem("aurorianstonestairs"), mitem("aurorianglass"), mitem("moonglass"),
    mitem("aurorianglasspane"), mitem("moonglasspane"), mitem("auroriancoalblock"), mitem("moonsand"),
    mitem("mushroom"), mitem("mushroomcrystal"), mitem("mushroomsmall"), mitem("mushroomstem"), mitem("aurorianperidotite"),
    mitem("aurorianperidotitesmooth"), mitem("aurorianperidotitesmoothstairs"), mitem("silentwoodbow"), mitem("auroriantallgrass"),
    mitem("auroriantallgrasslight"), mitem("aurorianfurnacechimney"), mitem("auroriancoalore"), mitem("tamoonwater"),
    mitem("aurorianstonesickle"), mitem("silentwoodsickle"), mitem("teasilkberry"),
]
for (def it in ["boots", "chestplate", "helmet", "leggings"]) generalItems.add(mitem("spectral${it}"))
for (def it in ["lavender", "petunia", "seedy"]) generalItems.add(mitem("tea${it}"))
for (def it in ["chest", "ladder", "leaves", "log", "planks", "stairs", "torch", "craftingtable", "sapling"])
    generalItems.add(mitem("silentwood${it}"))
for (def it in ["leaves", "log", "planks", "planksstairs", "sapling"])
    generalItems.add(mitem("weepingwillow${it}"))
for (def it in ["", "cracked", "rooftiles", "roofstairs"])
    generalItems.add(mitem("umbrastone${it}"))

def ceruleanItems = [mitem("cup"), mitem("locator"), mitem("lockpicks"), mitem("scrapper")]
for (def it in ["boots", "chestplate", "helmet", "leggings", "arrow", "bucket", "nugget", "shield", "ingot", "block", "ore"]) {
    ceruleanItems.add(mitem("cerulean${it}"))
}

def moonstoneItems = []
for (def it in ["ingot", "axe", "hoe", "nugget", "pickaxe", "shield", "shovel", "sickle", "sword", "block", "ore"]) {
    moonstoneItems.add(mitem("moonstone${it}"))
}

def runestoneDungeonItems = [mitem("aurorianslimeball"), mitem("darkstonekey")] + runestoneLoot
for (def it in ["boots", "chestplate", "helmet", "leggings"]) {
    steelItems.add(mitem("knight${it}"))
}

def geodeItems = [mitem("crystalarrow"), mitem("stickyspiker"), mitem("crystal"), mitem("geodeore")]
def moonItems = [
    // requires only harvest level
    mitem("aurorianslimeboots"), mitem("moontemplekey"), mitem("moongem"), mitem("moonlightforge"), mitem("moontorch"),
    // requires queen defeat
    mitem("moonshield"), mitem("queenschipper"), mitem("moontemplecellkey"),
] + moonTempleLoot

def removedTools = []
for (def tool in ["axe", "hoe", "shovel", "pickaxe", "sword"]) {
    removedTools.add(mitem("aurorianstone${tool}"))
    removedTools.add(mitem("silentwood${tool}"))
    removedTools.add(mitem("moonstone${tool}"))
}

def unknownItems = [mitem("livingdiviningrod")]

def hideFromJei = [
    mitem("debugger"), mitem("mysticalbarrier"), mitem("urn"), mitem("lavenderplant"), mitem("petuniaplant"), mitem("silkberryplant"),
    mitem("lavendercrop"), mitem("silkberrycrop"), mitem("crystallinesprite"), mitem("aurorianfurnacelit"), mitem("aurorianportal"),
    mitem("webbing"), mitem("tamoltencerulean"),mitem("tamoltenmoonstone"), mitem("tamoltenauroriansteel"),
] + removedTools
for (def it in ["keeper", "moonqueen", "spider"]) hideFromJei.add(mitem("bossspawner${it}"))

for (def it in generalItems) TooltipEvents.setTier(it, 2)
for (def it in ceruleanItems + moonstoneItems + geodeItems) TooltipEvents.setTier(it, 2)
for (def it in runestoneDungeonItems + aurorianiteItems) TooltipEvents.setTier(it, 2)
for (def it in darkstoneLoot + umbraItems) TooltipEvents.setTier(it, 2)
for (def it in moonItems + crystallineItems) TooltipEvents.setTier(it, 4)
for (def it in steelItems) TooltipEvents.setTier(it, 4)
for (def it in unknownItems) TooltipEvents.setTier(it, -1)
for (def it in unobtainable) TooltipEvents.setTier(it, 0)
for (def it in removedTools) GatewayHelpers.banTool(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in runestoneLoot) TooltipEvents.setTooltip(it, "Found in the Runestone Temple in Aurorian.")
for (def it in darkstoneLoot) TooltipEvents.setTooltip(it, "Found in the Darkstone Temple in Aurorian.")
for (def it in moonTempleLoot) TooltipEvents.setTooltip(it, "Found in the Moon Temple in Aurorian.")

TooltipEvents.setUnlock(mitem("aurorianportalframebricks"), 2)
