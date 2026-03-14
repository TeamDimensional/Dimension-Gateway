// Iron Shaft
crafting.remove("factorytech:parts/shaft")
crafting.shapedBuilder()
    .name("tier3/shaft")
    .matrix("R", "R", "R")
    .key("R", ore("stickIron"))
    .output(item("factorytech:machinepart", 51) * 2)
    .register()
