import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("astralsorcery:${name}", k)
}

def marbleItems = [
    mitem("blockmarblestairs"), mitem("blockmarbleslab"), mitem("itemjournal"),
]
for (def i in 0..6) {
    marbleItems.add(mitem("blockmarble", i))
    marbleItems.add(mitem("blockblackmarble", i))
}

def advancedItems = [
    mitem("itemcraftingcomponent", 4), mitem("iteminfusedglass"), mitem("itemtunedrockcrystal"), mitem("itemtunedcelestialcrystal"),
    mitem("itemshiftingstar"), mitem("itemchargedcrystalaxe"), mitem("itemchargedcrystalsword"), mitem("itemchargedcrystalpickaxe"),
    mitem("itemchargedcrystalshovel"), mitem("itemcape"), mitem("itemenchantmentamulet"), mitem("blockchalice"),
    mitem("blockbore"), mitem("blockattunementaltar"), mitem("blockstarlightinfuser"), mitem("blockrituallink"),
    mitem("blockmapdrawingtable"), mitem("blockobservatory"),
    mitem("blockborehead"), mitem("blockborehead", 1), mitem("blockritualpedestal"), mitem("blockaltar", 2), mitem("blockaltar", 3),
    mitem("blockcelestialcollectorcrystal"), mitem("blockinfusedwood", 6), mitem("blockprism"), mitem("itemilluminationwand"),
]

def hideFromJei = [mitem("blockfaketree"), mitem("blockportalnode")]

TooltipEvents.setModTier("astralsorcery", 6)
for (def x in marbleItems) TooltipEvents.setTier(x, 1)
for (def x in advancedItems) TooltipEvents.setTier(x, 10)
for (def x in hideFromJei) GatewayHelpers.hide(x)
