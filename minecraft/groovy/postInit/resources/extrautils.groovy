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

// Enchanted Ingot
mods.extrautils2.enchanter.removeByInput(item("minecraft:gold_ingot"))
mods.extrautils2.enchanter.removeByInput(item("minecraft:gold_block"))
mods.extrautils2.enchanter.recipeBuilder()
    .input(item("thaumcraft:ingot"), item("aether_legacy:ambrosium_shard"))
    .output(item("extrautils2:ingredients", 12))
    .energy(8000)
    .time(200)
    .register()
mods.extrautils2.enchanter.recipeBuilder()
    .input(item("thaumcraft:metal_thaumium"), item("aether_legacy:ambrosium_shard") * 9)
    .output(item("extrautils2:simpledecorative"))
    .energy(24000)
    .time(600)
    .register()

// Magical Wood
// TODO: fix the recipe not showing - maybe in UT
crafting.removeByOutput(item("extrautils2:decorativesolidwood", 1))
mods.extrautils2.enchanter.removeByInput(item("minecraft:bookshelf"))
mods.extrautils2.enchanter.recipeBuilder()
    .input(ore("bookshelf"), item("aether_legacy:ambrosium_shard") * 4)
    .output(item("extrautils2:decorativesolidwood", 1))
    .energy(16000)
    .time(400)
    .register()

// Enchanted Apple
mods.extrautils2.enchanter.removeByInput(item("minecraft:apple"))
mods.extrautils2.enchanter.recipeBuilder()
    .input(item("minecraft:apple") * 4, item("aether_legacy:ambrosium_shard"))
    .output(item("extrautils2:magicapple") * 4)
    .energy(4000)
    .time(50)
    .register()

