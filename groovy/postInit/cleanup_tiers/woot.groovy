import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("woot:${name}", k)
}

TooltipEvents.setModTier("woot", 9)
def advItems = [
    mitem("factorycore", 3), mitem("cell", 2),
]
for (def i in [1, 4, 7, 10, 13]) advItems.add(mitem("upgrade", i))
for (def i in [1, 3, 4, 6, 7, 10]) advItems.add(mitem("upgradeb", i))

def eliteItems = [
    mitem("factorycore", 4), mitem("structure", 4), mitem("structure", 9),
]
for (def i in [2, 5, 8, 11, 14]) eliteItems.add(mitem("upgrade", i))
for (def i in [2, 5, 8, 11, 12, 13, 14]) eliteItems.add(mitem("upgradeb", i))

def removeAnvil = [
    mitem("die"), mitem("die", 1), mitem("soulsanddust"),
]
for (def i in 0..3) removeAnvil.add(mitem("shard", i))

def removeRecipes = [
    mitem("prism"), mitem("soulsanddust"), mitem("soulstone"), mitem("stygianironore"),
]

def hideFromJei = [mitem("shard", 4), mitem("shard", 5), mitem("shard", 6)] + removeAnvil + removeRecipes

TooltipEvents.setTier(item("guideapi:woot-guide"), 1)
for (def it in advItems) TooltipEvents.setTier(it, 11)
for (def it in eliteItems) TooltipEvents.setTier(it, 13)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in removeAnvil) mods.woot.anvil.removeByOutput(it)
