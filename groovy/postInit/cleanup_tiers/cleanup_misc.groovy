import classes.GatewayHelpers

def hideFromJei = [item("toolprogression:magic_mushroom")]

for (def it in hideFromJei) GatewayHelpers.hide(it)
