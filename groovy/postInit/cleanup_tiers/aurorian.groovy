import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def moonTempleLoot = [
    item("theaurorian:crystallinepickaxe"), item("theaurorian:crystallinesword"), item("theaurorian:crystallineshield"),
    item("theaurorian:absorptionorb"), item("theaurorian:moontemplecellkeyfragment"), item("theaurorian:scrapcrystalline"),
    item("theaurorian:trophymoonqueen"),
]
def darkstoneLoot = [
    item("theaurorian:umbrapickaxe"), item("theaurorian:umbrasword"), item("theaurorian:umbrashield"),
    item("theaurorian:darkamulet"), item("theaurorian:scrapumbra"), item("theaurorian:spikedchestplate"),
    item("theaurorian:trophyspider"),
]
def runestoneLoot = [
    item("theaurorian:aurorianiteaxe"), item("theaurorian:aurorianitepickaxe"), item("theaurorian:aurorianitesword"),
    item("theaurorian:keeperamulet"), item("theaurorian:bepsi"), item("theaurorian:keepersbow"),
    item("theaurorian:runestonekey"), item("theaurorian:runestonelootkey"), item("theaurorian:scrapaurorianite"),
    item("theaurorian:strangemeat"), item("theaurorian:trophykeeper"),
]

def unobtainable = [
    item("theaurorian:darkstonebricks"), item("theaurorian:darkstonefancy"), item("theaurorian:darkstonegate"),
    item("theaurorian:darkstonegatekeyhole"), item("theaurorian:darkstonelamp"), item("theaurorian:darkstonelayers"),
    item("theaurorian:darkstonestairs"), item("theaurorian:moontemplebricks"), item("theaurorian:moontemplebars"),
    item("theaurorian:moontemplegate"), item("theaurorian:moontemplecellgate"), item("theaurorian:moontemplegatekeyhole"),
    item("theaurorian:moontemplecellgatekeyhole"), item("theaurorian:moontemplelamp"), item("theaurorian:moontemplebrickssmooth"),
    item("theaurorian:moontemplestairs"), item("theaurorian:runestone"), item("theaurorian:runestonebars"),
    item("theaurorian:runestonegate"), item("theaurorian:runestonegatekeyhole"), item("theaurorian:runestonelootgatekeyhole"),
    item("theaurorian:runestonelootgate"), item("theaurorian:runestonelamp"), item("theaurorian:runestonesmooth"),
    item("theaurorian:runestonestairs"),
]

def crystallineItems = [item("theaurorian:crystallineingot")]
def aurorianiteItems = [item("theaurorian:aurorianiteingot")]
def umbraItems = [item("theaurorian:umbraingot")]

def steelItems = []
for (def it in ["boots", "chestplate", "helmet", "leggings", "axe", "hoe", "nugget", "pickaxe", "shovel",
                "sword", "", "block"]) {
    steelItems.add(item("theaurorian:auroriansteel${it}"))
}

def generalItems = [
    item("theaurorian:aurorianbacon"), item("theaurorian:auroriancoal"), item("theaurorian:auroriancoalnugget"),
    item("theaurorian:aurorianpork"), item("theaurorian:aurorianporkcooked"),
    item("theaurorian:lavender"), item("theaurorian:lavenderbread"), item("theaurorian:plantfiber"),
    item("theaurorian:lavenderseeds"), item("theaurorian:silentwoodstick"),
    item("theaurorian:silkberry"), item("theaurorian:soullessflesh"), item("theaurorian:spectralsilk"),
    item("theaurorian:silkberryjam"), item("theaurorian:silkberryjamsandwich"), item("theaurorian:silkshroomstew"),
    item("theaurorian:weepingwillowsap"), item("theaurorian:auroriancobblestone"), item("theaurorian:auroriancobblestonestairs"),
    item("theaurorian:auroriandirt"), item("theaurorian:aurorianfarmtile"), item("theaurorian:aurorianfurnace"),
    item("theaurorian:auroriangrass"), item("theaurorian:auroriangrasslight"),
    item("theaurorian:aurorianstone"), item("theaurorian:aurorianstonebrick"), item("theaurorian:aurorianstonestairs"),
    item("theaurorian:aurorianglass"), item("theaurorian:moonglass"), item("theaurorian:aurorianglasspane"),
    item("theaurorian:moonglasspane"), item("theaurorian:auroriancoalblock"), item("theaurorian:moonsand"),
    item("theaurorian:mushroom"), item("theaurorian:mushroomcrystal"), item("theaurorian:mushroomsmall"),
    item("theaurorian:mushroomstem"), item("theaurorian:aurorianperidotite"), item("theaurorian:aurorianperidotitesmooth"),
    item("theaurorian:aurorianperidotitesmoothstairs"), item("theaurorian:silentwoodbow"),
    item("theaurorian:auroriantallgrass"), item("theaurorian:auroriantallgrasslight"),
    item("theaurorian:aurorianfurnacechimney"), item("theaurorian:auroriancoalore"), item("theaurorian:tamoonwater"),
    item("theaurorian:aurorianstonesickle"), item("theaurorian:silentwoodsickle"), item("theaurorian:teasilkberry"),
]
for (def it in ["boots", "chestplate", "helmet", "leggings"]) generalItems.add(item("theaurorian:spectral${it}"))
for (def it in ["lavender", "petunia", "seedy"]) generalItems.add(item("theaurorian:tea${it}"))
for (def it in ["chest", "ladder", "leaves", "log", "planks", "stairs", "torch", "craftingtable", "sapling"])
    generalItems.add(item("theaurorian:silentwood${it}"))
for (def it in ["leaves", "log", "planks", "planksstairs", "sapling"])
    generalItems.add(item("theaurorian:weepingwillow${it}"))
for (def it in ["", "cracked", "rooftiles", "roofstairs"])
    generalItems.add(item("theaurorian:umbrastone${it}"))

def ceruleanItems = [
    item("theaurorian:cup"), item("theaurorian:locator"), item("theaurorian:lockpicks"),
    item("theaurorian:scrapper"),
]
for (def it in ["boots", "chestplate", "helmet", "leggings", "arrow", "bucket", "nugget", "shield", "ingot", "block", "ore"]) {
    ceruleanItems.add(item("theaurorian:cerulean${it}"))
}

def moonstoneItems = []
for (def it in ["ingot", "axe", "hoe", "nugget", "pickaxe", "shield", "shovel", "sickle", "sword", "block", "ore"]) {
    moonstoneItems.add(item("theaurorian:moonstone${it}"))
}

def runestoneDungeonItems = [
    item("theaurorian:aurorianslimeball"), item("theaurorian:darkstonekey"),
] + runestoneLoot
for (def it in ["boots", "chestplate", "helmet", "leggings"]) {
    steelItems.add(item("theaurorian:knight${it}"))
}

def geodeItems = [
    item("theaurorian:crystalarrow"), item("theaurorian:stickyspiker"), item("theaurorian:crystal"), item("theaurorian:geodeore")
]
def moonItems = [
    // requires only harvest level
    item("theaurorian:aurorianslimeboots"), item("theaurorian:moontemplekey"), item("theaurorian:moongem"),
    item("theaurorian:moonlightforge"), item("theaurorian:moontorch"),
    // requires queen defeat
    item("theaurorian:moonshield"), item("theaurorian:queenschipper"), item("theaurorian:moontemplecellkey"),
] + moonTempleLoot

def removedTools = []
for (def tool in ["axe", "hoe", "shovel", "pickaxe", "sword"]) {
    removedTools.add(item("theaurorian:aurorianstone${tool}"))
    removedTools.add(item("theaurorian:silentwood${tool}"))
    removedTools.add(item("theaurorian:moonstone${tool}"))
}

def unknownItems = [item("theaurorian:livingdiviningrod")]

def hideFromJei = [
    item("theaurorian:debugger"), item("theaurorian:mysticalbarrier"), item("theaurorian:urn"),
    item("theaurorian:lavenderplant"), item("theaurorian:petuniaplant"), item("theaurorian:silkberryplant"),
    item("theaurorian:lavendercrop"), item("theaurorian:silkberrycrop"), item("theaurorian:crystallinesprite"),
    item("theaurorian:aurorianfurnacelit"), item("theaurorian:aurorianportal"), item("theaurorian:webbing"),
    item("theaurorian:tamoltencerulean"),item("theaurorian:tamoltenmoonstone"), item("theaurorian:tamoltenauroriansteel"),
] + removedTools
for (def it in ["keeper", "moonqueen", "spider"]) hideFromJei.add(item("theaurorian:bossspawner${it}"))

for (def it in generalItems) TooltipEvents.setTier(it, 2)
for (def it in ceruleanItems + moonstoneItems + geodeItems) TooltipEvents.setTier(it, 2)
for (def it in runestoneDungeonItems + aurorianiteItems) TooltipEvents.setTier(it, 2)
for (def it in darkstoneLoot + umbraItems) TooltipEvents.setTier(it, 2)
for (def it in moonItems + crystallineItems) TooltipEvents.setTier(it, 3)
for (def it in steelItems) TooltipEvents.setTier(it, 3)  // tentative
for (def it in unknownItems) TooltipEvents.setTier(it, -1)
for (def it in unobtainable) TooltipEvents.setTier(it, 0)
for (def it in removedTools) GatewayHelpers.banTool(it)
for (def it in hideFromJei) mods.jei.ingredient.hide(it)
for (def it in runestoneLoot) TooltipEvents.setTooltip(it, "Found in the Runestone Temple in Aurorian.")
for (def it in darkstoneLoot) TooltipEvents.setTooltip(it, "Found in the Darkstone Temple in Aurorian.")
for (def it in moonTempleLoot) TooltipEvents.setTooltip(it, "Found in the Moon Temple in Aurorian.")

/*
recipes needed:
- make silentwood planks, fix silentwood stick recipe, similar to nature's aura
- remove recipe for aurorian stone
- new recipe for the aurorian portal frame
*/

TooltipEvents.setUnlock(item("theaurorian:aurorianportalframebricks"), 2)
