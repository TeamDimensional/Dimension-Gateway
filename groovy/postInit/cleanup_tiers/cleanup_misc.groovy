import classes.GatewayHelpers

def hideFromJei = [item("toolprogression:magic_mushroom")]

for (def it in hideFromJei) GatewayHelpers.hide(it)

// TODO: figure out why this doesn't work
mods.jei.catalyst.removeByType("blockdrops")

crafting.remove("thermalfoundation:fertilizer_4")
crafting.remove("thermalfoundation:bait_2")
crafting.remove("minecraft:hopper")
crafting.remove("thermalfoundation:gunpowder")
crafting.remove("thermalfoundation:gunpowder_1")
crafting.remove("immersiveengineering:material/gunpowder0")
