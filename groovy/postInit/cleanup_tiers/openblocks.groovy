import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("openblocks:${name}", k)
}

tier2Items = [mitem("hang_glider"), mitem("generic"), mitem("epic_eraser")]

craneBackpackItems = [
    mitem("generic", 1), mitem("generic", 2), mitem("generic", 3), mitem("generic", 5), mitem("crane_control"), mitem("crane_backpack"),
]

mapItems = [mitem("generic", 6), mitem("generic", 7), mitem("empty_map")]

redstoneItems = [
    mitem("guide"), mitem("sprinkler"), mitem("cannon"), mitem("auto_anvil"),
    mitem("block_placer"), mitem("item_dropper"), mitem("projector"), mitem("slimalyzer"), mitem("pedometer"),
]
gemstoneItems = [mitem("village_highlighter"), mitem("block_breaker"), mitem("luggage")]
obsidianItems = [mitem("tank"), mitem("auto_enchantment_table"), mitem("paint_mixer"), mitem("sonic_glasses"), mitem("xp_shower")]

enderItems = [
    mitem("builder_guide"), mitem("vacuum_hopper"), mitem("imaginary"), mitem("sky"),
    mitem("sky", 1), mitem("generic", 9), mitem("cartographer"), mitem("imaginary", 1),
    mitem("pencil_glasses"), mitem("crayon_glasses"), mitem("golden_eye", 32767),
]
for (int i in 0..15) enderItems.add(mitem("elevator", i))
for (int i in 0..15) enderItems.add(mitem("elevator_rotating", i))

opItems = [mitem("heal")]

removedItems = [mitem("golden_egg"), mitem("generic", 4), mitem("tasty_clay"), mitem("dev_null")]

hideFromJei = [mitem("serious_glasses")] + removedItems
for (int i in 0..14) hideFromJei.add(mitem("stencil", i))
for (int i in 0..122) hideFromJei.add(mitem("glyph", i))

for (def it in tier2Items) TooltipEvents.setTier(it, 2)
for (def it in craneBackpackItems) TooltipEvents.setTier(it, 3)
for (def it in mapItems) TooltipEvents.setTier(it, 3)
for (def it in redstoneItems) TooltipEvents.setTier(it, 3)
for (def it in gemstoneItems) TooltipEvents.setTier(it, 4)
for (def it in obsidianItems) TooltipEvents.setTier(it, 5)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in opItems) TooltipEvents.setTier(it, 16)
for (def it in removedItems) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)
