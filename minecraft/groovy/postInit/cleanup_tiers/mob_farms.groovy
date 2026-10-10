import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

// Woot
def mitem(name, k=0) {
    return item("woot:${name}", k)
}

TooltipEvents.setModTier("woot", 11)
def advItems = [
    mitem("factorycore", 3), mitem("cell", 2), mitem("upgradeb", 1),
]
for (def i in [1, 4, 7, 10, 13]) advItems.add(mitem("upgrade", i))
for (def i in [1, 3, 4, 6, 7]) advItems.add(mitem("upgradeb", i))

def eliteItems = [
    mitem("factorycore", 4), mitem("structure", 4), mitem("structure", 9), mitem("upgradeb", 2),
]
for (def i in [2, 5, 8, 11, 14]) eliteItems.add(mitem("upgrade", i))

def removeAnvil = [
    mitem("die"), mitem("die", 1), mitem("soulsanddust"),
]
for (def i in 0..3) removeAnvil.add(mitem("shard", i))

def removeRecipes = [
    mitem("prism"), mitem("soulsanddust"), mitem("soulstone"), mitem("stygianironore"), item("soulshardsrespawn:materials", 1),
]
def tiers = ["wood", "stone", "iron", "gold", "diamond", "emerald"]
for (def tier in tiers) {
    removeRecipes.add(item("tinymobfarm:${tier}_farm"))
    removeRecipes.add(item("tinymobfarm:${tier}_farm_machine"))
}

def removeFurnace = [item("soulshardsrespawn:materials", 2)]

def hideFromJei = [mitem("shard", 4), mitem("shard", 5), mitem("shard", 6)] + removeAnvil + removeRecipes + removeFurnace
for (def i in 3..14) hideFromJei.add(mitem("upgradeb", i))

TooltipEvents.setTier(item("guideapi:woot-guide"), 1)
for (def it in advItems) TooltipEvents.setTier(it, 12)
for (def it in eliteItems) TooltipEvents.setTier(it, 12)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in removeAnvil) mods.woot.anvil.removeByOutput(it)
for (def it in removeFurnace) furnace.removeByOutput(it)

// UMF
def itemsUMF = [item("tinymobfarm:lasso"), item("tinymobfarm:inferno_farm"), item("tinymobfarm:inferno_farm_machine")]
def advItemsUMF = [item("tinymobfarm:ultimate_farm"), item("tinymobfarm:ultimate_farm_machine")]
for (def it in itemsUMF) TooltipEvents.setTier(it, 7)
for (def it in advItemsUMF) TooltipEvents.setTier(it, 11)

// Soul Shards
def itemsSS = [item("soulshardsrespawn:materials"), item("soulshardsrespawn:vile_sword"), item("soulshardsrespawn:soul_cage"), item("soulshardsrespawn:soul_shard")]
for (def it in itemsSS) TooltipEvents.setTier(it, 7)
ore("dustCorrupted").remove(item("soulshardsrespawn:materials", 1))
ore("dustVile").remove(item("soulshardsrespawn:materials", 2))
