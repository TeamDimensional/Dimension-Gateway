import classes.GatewayHelpers

def hideFromJei = [item("toolprogression:magic_mushroom")]

for (def it in hideFromJei) GatewayHelpers.hide(it)

// TODO: figure out why this doesn't work
mods.jei.catalyst.removeByType("blockdrops")
