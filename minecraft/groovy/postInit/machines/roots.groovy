// Pyre
crafting.remove("roots:pyre")
crafting.shapedBuilder()
        .name("tier1/pyre")
        .output(item("roots:pyre"))
        .matrix(" L ", "LCL", "SMS")
        .key("L", ore("logWood")).key("C", ore("fuelCoke")).key("S", ore("cobblestone")).key("M", item("roots:terra_moss"))
        .register()
