// Fluid Filter
crafting.remove("extrautils2:filter_fluids")
crafting.shapedBuilder()
    .name("tier3/xu2/fluid_filter")
    .matrix("LSL", "SFS", "LSL")
    .key("L", ore("dustLapis")).key("S", ore("stickWood")).key("F", ore("string"))
    .output(item("extrautils2:filterfluids"))
    .register()

// Drop of Evil
mods.jei.description.remove(item("extrautils2:ingredients", 10))
mods.actuallyadditions.atomic_reconstructor.recipeBuilder()
    .input(item("xreliquary:mob_ingredient", 1))
    .output(item("extrautils2:ingredients", 10))
    .energy(10000)
    .register()
