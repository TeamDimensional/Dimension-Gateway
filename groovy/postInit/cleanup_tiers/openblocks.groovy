import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

tier2Items = [
    item("openblocks:hang_glider"), item("openblocks:generic"), item("openblocks:epic_eraser"),
]

craneBackpackItems = [
    item("openblocks:generic", 1), item("openblocks:generic", 2), item("openblocks:generic", 3), item("openblocks:generic", 5),
    item("openblocks:crane_control"), item("openblocks:crane_backpack"),
]

mapItems = [
    item("openblocks:generic", 6), item("openblocks:generic", 7), item("openblocks:empty_map")
]

redstoneItems = [
    item("openblocks:guide"), item("openblocks:sprinkler"), item("openblocks:cannon"), item("openblocks:auto_anvil"),
    item("openblocks:block_placer"), item("openblocks:item_dropper"), item("openblocks:projector"), item("openblocks:slimalyzer"),
    item("openblocks:pedometer"),
]

gemstoneItems = [
    item("openblocks:village_highlighter"), item("openblocks:block_breaker"), item("openblocks:luggage"),
]

obsidianItems = [
    item("openblocks:tank"), item("openblocks:auto_enchantment_table"), item("openblocks:paint_mixer"), item("openblocks:sonic_glasses"),
]

enderItems = [
    item("openblocks:builder_guide"), item("openblocks:vacuum_hopper"), item("openblocks:imaginary"), item("openblocks:sky"),
    item("openblocks:sky", 1), item("openblocks:generic", 9), item("openblocks:cartographer"), item("openblocks:imaginary", 1),
    item("openblocks:pencil_glasses"), item("openblocks:crayon_glasses"),
]
for (int i in 0..15) enderItems.add(item("openblocks:elevator", i))
for (int i in 0..15) enderItems.add(item("openblocks:elevator_rotating", i))

opItems = [
    item("openblocks:heal"),
]

removedItems = [
    item("openblocks:golden_egg"), item("openblocks:generic", 4), item("openblocks:tasty_clay"), item("openblocks:dev_null"),
]

hideFromJei = [item("openblocks:serious_glasses")] + removedItems
for (int i in 0..14) hideFromJei.add(item("openblocks:stencil", i))
for (int i in 0..122) hideFromJei.add(item("openblocks:glyph", i))

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

// Golden Egg uses metadata
// TODO: this script causes a JVM runtime failure and tons of ASM spam, investigate why
/*
def eggPredicate = stack -> {
    String name = stack.getItem().getUnlocalizedName(stack)
    return name != null && name.equals("item.openblocks.golden_eye".toString())
}
TooltipEvents.addTierPredicate("golden_eye", eggPredicate, 6)
*/

/*
Recipes needed:
- Healer (tier 16)
- Fix mod config
*/
