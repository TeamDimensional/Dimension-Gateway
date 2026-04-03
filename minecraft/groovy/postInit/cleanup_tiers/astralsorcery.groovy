import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("astralsorcery:${name}", k)
}

def aquamarineItems = [
    mitem("itemcraftingcomponent"), mitem("blockcustomsandore"),
]

def marbleItems = [
    mitem("blockmarble"), mitem("blockmarble", 1), mitem("blockmarblestairs"), mitem("blockmarbleslab"), mitem("itemjournal"),
]

def advancedItems = [
    mitem("itemcraftingcomponent", 4), mitem("iteminfusedglass"), mitem("itemtunedrockcrystal"), mitem("itemtunedcelestialcrystal"),
    mitem("itemshiftingstar"), mitem("itemchargedcrystalaxe"), mitem("itemchargedcrystalsword"), mitem("itemchargedcrystalpickaxe"),
    mitem("itemchargedcrystalshovel"), mitem("itemcape"), mitem("itemenchantmentamulet"), mitem("blockchalice"),
    mitem("blockbore"), mitem("blockattunementaltar"), mitem("blockstarlightinfuser"), mitem("blockrituallink"),
    mitem("blockmapdrawingtable"), mitem("blockobservatory"),
    mitem("blockborehead"), mitem("blockborehead", 1), mitem("blockritualpedestal"), mitem("blockaltar", 2), mitem("blockaltar", 3),
    mitem("blockcelestialcollectorcrystal"), mitem("blockinfusedwood", 6),
]

def removeAstralRecipes = [mitem("blockmachine", 1)]
def hideFromJei = [mitem("blockfaketree"), mitem("blockportalnode")] + removeAstralRecipes

TooltipEvents.setModTier("astralsorcery", 6)
for (def x in marbleItems) TooltipEvents.setTier(x, 1)
for (def x in aquamarineItems) TooltipEvents.setTier(x, 3)
for (def x in advancedItems) TooltipEvents.setTier(x, 10)
for (def x in hideFromJei) GatewayHelpers.hide(x)
for (def x in removeAstralRecipes) mods.astralsorcery.starlight_altar.removeByOutput(x)
