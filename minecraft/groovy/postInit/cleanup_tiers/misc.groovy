import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

TooltipEvents.setModTier("compactmachines3", 7)
TooltipEvents.setModTier("buildinggadgets", 4)
TooltipEvents.setModTier("betterbuilderswands", 2)

def tier2Items = [
    item("chisel:offsettool"),
]

def tier3Items = [
    item("supersoundmuffler:sound_muffler"), item("supersoundmuffler:sound_muffler_bauble"),
    item("naturescompass:naturescompass"), item("oeintegration:excavatemodifier"),
]
for (def i in [1, 3, 4, 5, 6, 7]) tier3Items.add(item("engineersworkshop:upgrade", i))

def tier4Items = [
    item("omniwand:wand"), item("engineersworkshop:upgrade", 8), item("simplevoidworld:portal"),
]

def basicXnet = [
    item("xnet:xnet_manual"), item("xnet:facade"), item("xnet:controller"), item("xnet:router"),
]

def advancedXnet = [
    item("xnet:connector_upgrade"), item("xnet:redstone_proxy"), item("xnet:redstone_proxy_upd"), item("xnet:netcable", 4),
    item("xnet:connector", 4), item("xnet:wireless_router"), item("xnet:antenna"), item("xnet:antenna_base"), item("xnet:antenna_dish"),
]

def tier7Items = [
    item("translocators:translocator_part"), item("translocators:translocator_part", 1),
]

for (def i in 0..3) {
    basicXnet.add(item("xnet:netcable", i))
    basicXnet.add(item("xnet:connector", i))
    advancedXnet.add(item("xnet:advanced_connector", i))
}

def removeRecipes = [
    item("hammercore:manual"), item("engineersworkshop:upgrade", 9), item("microblockcbe:stone_rod"),
    item("chisel:chisel_iron"), item("chisel:chisel_diamond"), item("chisel:chisel_hitech"), item("chisel:auto_chisel"),
    item("betterbuilderswandsfix:break_core"), item("betterbuilderswands:wandstone"), item("betterbuilderswands:wandiron"),
]

def hideFromJei = [
    item("champions:champion_egg")
] + removeRecipes
for (def it in ["iron", "gold", "diamond", "emerald", "quartz"]) hideFromJei.add(item("hammercore:${it}_bordered_cobblestone"))

for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in tier2Items) TooltipEvents.setTier(it, 2)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in basicXnet) TooltipEvents.setTier(it, 5)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in advancedXnet) TooltipEvents.setTier(it, 7)
for (def it in removeRecipes) crafting.removeByOutput(it)

ore("rodStone").remove(item("microblockcbe:stone_rod"))
