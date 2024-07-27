import classes.GatewayHelpers

def items = ["pickaxe", "axe", "shovel", "hoe", "sword", "ingot", "nugget", "plate"]
def metals = ["copper", "silver", "lead"]

for (def it in items) for (def m in metals) GatewayHelpers.hide(item("embers:${it}_${m}"))
