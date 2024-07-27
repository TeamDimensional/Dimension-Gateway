import classes.GatewayHelpers

// Remove Magical Ingot
ore("ingotThaumium").remove(item("essentialcraft:genitem", 5))
mods.essentialcraft.magician_table.removeByOutput(item("essentialcraft:genitem", 5))
GatewayHelpers.hide(item("essentialcraft:genitem", 5))

// Remove Magical Plate, I would rather remove the TC's plate but some recipes are hardcoded to use that one
ore("plateMagic").remove(item("essentialcraft:genitem", 34))
ore("plateThaumium").remove(item("essentialcraft:genitem", 34))
mods.essentialcraft.magician_table.removeByOutput(item("essentialcraft:genitem", 34))
ore("plateMagic").add(item("thaumcraft:plate", 2))
GatewayHelpers.hide(item("essentialcraft:genitem", 34))
// TODO: adjust recipes
