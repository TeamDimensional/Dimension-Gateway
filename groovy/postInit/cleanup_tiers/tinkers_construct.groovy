import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def searedItems = [
    item("tconstruct:faucet"), item("tconstruct:channel"), item("tconstruct:smeltery_io"),
    item("tconstruct:casting"), item("tconstruct:tinker_tank_controller"), item("tconstruct:seared_glass"),
    item("tconstruct:seared_furnace_controller"), item("tconstruct:casting:1"), item("tconstruct:toolforge"),
]
for (int i in 2..11) searedItems.add(item("tconstruct:seared", i))
for (int i in 2..11) searedItems.add(item("tconstruct:seared_slab", i))
for (int i in 0..2) searedItems.add(item("tconstruct:seared_tank", i))
for (def i in ["paver", "brick", "brick_cracked", "brick_fancy", "brick_square", "brick_triangle", "brick_small", "road", "tile", "creeper"])
    searedItems.add(item("tconstruct:seared_stairs_${i}"))

def requiresSmeltery = [
    item("tconstruct:smeltery_controller"),
    item("tconstruct:casting", 1), item("tconstruct:firewood"), item("tconstruct:firewood", 1),
    item("tconstruct:nuggets", 3), item("tconstruct:nuggets", 4), item("tconstruct:nuggets", 5),
    item("tconstruct:ingots", 3), item("tconstruct:ingots", 4), item("tconstruct:ingots", 5),
    item("tconstruct:metal", 3), item("tconstruct:metal", 4), item("tconstruct:metal", 5),
    item("tconstruct:cast"), item("tconstruct:firewood_stairs"), item("tconstruct:lavawood_stairs"),
    item("tconstruct:firewood_slab"), item("tconstruct:firewood_slab", 1), item("tconstruct:edible", 33),
    item("tconstruct:slime_channel", 3), item("tconstruct:slime_boots", 3),
    item("tconstruct:slime", 3), item("tconstruct:slime_congealed", 3), item("tconstruct:edible", 3),
    item("tconstruct:clear_glass"), item("tconstruct:fancy_frame", 6), item("tconstruct:seared"), item("tconstruct:seared", 1),
    item("tconstruct:seared_slab"), item("tconstruct:seared_slab", 1), item("tconstruct:seared_stairs_stone"), item("tconstruct:seared_stairs_cobble"),
]
for (int i in 0..15) requiresSmeltery.add(item("tconstruct:clear_stained_glass", i))
for (int i in 0..3) requiresSmeltery.add(item("tconstruct:cast_custom", i))

def requiresFey = [item("tconstruct:materials", 18), item("tconstruct:materials", 19)]

def requiresGemstones = [
    item("tconstruct:materials", 15), item("tconstruct:materials", 16), item("tconstruct:metal", 6),
]

def requiresEvilcraft = []
for (int i in 0..4) requiresEvilcraft.add(item("tconstruct:slimesling", i))

def requiresObsidian = [
    item("tconstruct:fancy_frame", 0), item("tconstruct:fancy_frame", 1), item("tconstruct:fancy_frame", 5),
    item("tconstruct:materials", 14),
]

def requiresAoE = [
    item("tconstruct:materials", 12), item("tconstruct:materials", 13),
]

def cobaltArditeItems = [
    item("tconstruct:fancy_frame", 2), item("tconstruct:fancy_frame", 3), item("tconstruct:fancy_frame", 4),
    item("tconstruct:ore"), item("tconstruct:ore", 1),
    item("tconstruct:nuggets"), item("tconstruct:nuggets", 1), item("tconstruct:nuggets", 2),
    item("tconstruct:ingots"), item("tconstruct:ingots", 1), item("tconstruct:ingots", 2),
    item("tconstruct:metal"), item("tconstruct:metal", 1), item("tconstruct:metal", 2),
]

def removeThese = [
    item("tconstruct:wooden_hopper"), item("tconstruct:throwball", 1),
    item("tconstruct:wood_rail"), item("tconstruct:wood_rail_trapdoor"),
    item("tconstruct:piggybackpack"), item("tconstruct:soil"),
]

def hideFromJei = [item("tconstruct:clay_cast"), item("tconstruct:cast_custom", 4)] + removeThese

def creativeItems = [item("tconstruct:materials", 50)]

/*
chores needed:
- remove mom's spaghetti
- brownstone (tier 3 -> tier 1)
- smeltery controller (tier 1 -> end of tier 2), casting basin
- better recipe for seared brick
- slimesling (tier 1 -> tier 4)
- aoe items - expanders and tool forge (tentative tier 4)
- mending moss (tier 1 -> tier 3)
- silky cloth (tier 1 -> tier 4)
- creative modifier (tier 17)
- redo all materials...........
*/

for (def it in searedItems) TooltipEvents.setTier(it, 3)
for (def it in requiresSmeltery) TooltipEvents.setTier(it, 3)
for (def it in requiresFey) TooltipEvents.setTier(it, 3)
for (def it in requiresGemstones) TooltipEvents.setTier(it, 4)
for (def it in requiresEvilcraft) TooltipEvents.setTier(it, 4)
for (def it in requiresAoE) TooltipEvents.setTier(it, 4)
for (def it in requiresObsidian) TooltipEvents.setTier(it, 5)
for (def it in cobaltArditeItems) TooltipEvents.setTier(it, 7)
for (def it in creativeItems) TooltipEvents.setTier(it, 17)
for (def it in removeThese) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)

TooltipEvents.setUnlock(item("tconstruct:materials"), 3)
