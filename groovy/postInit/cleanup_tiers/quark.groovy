import com.dimensional.gatewaycore.events.TooltipEvents

def quartzItems = [
    item("quark:quartz_wall"),
]

def tier3Items = [
    item("quark:gold_button"), item("quark:redstone_inductor"), item("quark:lit_lamp"),
]

def obsidianItems = [
    item("quark:obsidian_pressure_plate"),
]

def enderItems = [
    item("quark:duskbound_block"), item("quark:duskbound_lantern"), item("quark:duskbound_block_stairs"), item("quark:duskbound_block_slab"),
    item("quark:purpur_block_wall"), item("quark:end_bricks_wall"), item("quark:duskbound_block_wall"), item("quark:redstone_randomizer"),
    item("quark:gravisand"), item("quark:rain_detector"), item("quark:enderdragon_scale"),
]

for (def it in quartzItems) TooltipEvents.setTier(it, 2)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in obsidianItems) TooltipEvents.setTier(it, 5)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
