import classes.GatewayHelpers

def requiresSmeltery = [
    item("tconstruct:casting", 1), item("tconstruct:firewood"), item("tconstruct:firewood", 1),
    item("tconstruct:nuggets", 3), item("tconstruct:nuggets", 4), item("tconstruct:nuggets", 5),
    item("tconstruct:ingots", 3), item("tconstruct:ingots", 4), item("tconstruct:ingots", 5),
    item("tconstruct:metal", 3), item("tconstruct:metal", 4), item("tconstruct:metal", 5),
    item("tconstruct:cast"), item("tconstruct:firewood_stairs"), item("tconstruct:lavawood_stairs"),
    item("tconstruct:firewood_slab"), item("tconstruct:firewood_slab", 1), item("tconstruct:edible", 33),
    item("tconstruct:slime_channel", 3), item("tconstruct:slime_boots", 3),
    item("tconstruct:slime", 3), item("tconstruct:slime_congealed", 3), item("tconstruct:edible", 3),
]

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
    item("tconstruct:materials", 12), item("tconstruct:materials", 13), item("tconstruct:toolforge"),
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
    item("tconstruct:piggybackpack"),
]

def hideFromJei = [item("tconstruct:clay_cast")] + removeThese

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

for (def it in requiresSmeltery) GatewayHelpers.setTier(it, 3)
for (def it in requiresFey) GatewayHelpers.setTier(it, 3)
for (def it in requiresGemstones) GatewayHelpers.setTier(it, 4)
for (def it in requiresEvilcraft) GatewayHelpers.setTier(it, 4)
for (def it in requiresAoE) GatewayHelpers.setTier(it, 4)
for (def it in requiresObsidian) GatewayHelpers.setTier(it, 5)
for (def it in cobaltArditeItems) GatewayHelpers.setTier(it, 7)
for (def it in creativeItems) GatewayHelpers.setTier(it, 17)
for (def it in removeThese) crafting.removeByOutput(it)
for (def it in hideFromJei) mods.jei.ingredient.hide(it)

GatewayHelpers.setUnlocksTier(item("tconstruct:smeltery_controller"), 3)
