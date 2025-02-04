import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

TooltipEvents.setModTier("compactmachines3", 7)

def tier3Items = [
    item("xnet:xnet_manual"), item("supersoundmuffler:sound_muffler"), item("supersoundmuffler:sound_muffler_bauble"),
    item("naturescompass:naturescompass"),
]
for (def i in [1, 3, 4, 5, 6, 7]) tier3Items.add(item("engineersworkshop:upgrade", i))

def tier4Items = [
    item("omniwand:wand"), item("xnet:facade"), item("xnet:controller"), item("xnet:router"), item("engineersworkshop:upgrade", 8),
]

def tier7Items = [
    item("xnet:connector_upgrade"), item("xnet:redstone_proxy"), item("xnet:redstone_proxy_upd"), item("xnet:netcable", 4),
    item("xnet:connector", 4), item("xnet:wireless_router"), item("xnet:antenna"), item("xnet:antenna_base"), item("xnet:antenna_dish"),
    item("simplevoidworld:portal"),
]

for (def i in 0..3) {
    tier4Items.add(item("xnet:netcable", i))
    tier4Items.add(item("xnet:connector", i))
    tier7Items.add(item("xnet:advanced_connector", i))
}

def removeRecipes = [
    item("hammercore:manual"), item("engineersworkshop:upgrade", 9), item("microblockcbe:stone_rod"),
]

def hideFromJei = [] + removeRecipes
for (def it in ["iron", "gold", "diamond", "emerald", "quartz"]) hideFromJei.add(item("hammercore:${it}_bordered_cobblestone"))

for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in removeRecipes) crafting.removeByOutput(it)

ore("rodStone").remove(item("microblockcbe:stone_rod"))
