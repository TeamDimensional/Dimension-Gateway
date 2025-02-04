import classes.GatewayHelpers

// Iron Plate
crafting.remove("thaumcraft:ironplate")
ore("plateIron").remove(item("thaumcraft:plate", 2))
GatewayHelpers.hide(item("thaumcraft:plate", 1))
