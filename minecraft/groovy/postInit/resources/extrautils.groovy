// Fluid Filter
crafting.remove("extrautils2:filter_fluids")
crafting.shapedBuilder()
    .name("tier3/xu2/fluid_filter")
    .matrix("LSL", "SFS", "LSL")
    .key("L", ore("dustLapis")).key("S", ore("stickWood")).key("F", ore("string"))
    .output(item("extrautils2:filterfluids"))
    .register()
