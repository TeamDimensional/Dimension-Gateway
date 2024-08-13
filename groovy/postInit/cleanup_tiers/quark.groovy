import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("quark:${name}", k)
}

def quartzItems = [mitem("quartz_wall")]
def tier3Items = [mitem("gold_button"), mitem("redstone_inductor"), mitem("lit_lamp")]
def obsidianItems = [mitem("obsidian_pressure_plate")]
def enderItems = [
    mitem("duskbound_block"), mitem("duskbound_lantern"), mitem("duskbound_block_stairs"), mitem("duskbound_block_slab"),
    mitem("purpur_block_wall"), mitem("end_bricks_wall"), mitem("duskbound_block_wall"), mitem("redstone_randomizer"),
    mitem("gravisand"), mitem("rain_detector"), mitem("enderdragon_scale"),
]

for (def it in quartzItems) TooltipEvents.setTier(it, 2)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in obsidianItems) TooltipEvents.setTier(it, 5)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
