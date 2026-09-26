// Aetherium Ore
mods.astralsorcery.light_transmutation.recipeBuilder()
    .input(block("thaumcraft:ore_amber"))
    .output(block("aetherworks:aether_ore"))
    .cost(10.0)
    .register()

// Alchemical Redstone
mods.immersiveengineering.mixer.recipeBuilder()
    .input(item("embers:dust_ember"), item("embers:dust_ember"))
    .fluidInput(fluid("redstone") * 1000)
    .fluidOutput(fluid("alchemical_redstone") * 1000)
    .energy(4000)
    .register()

mods.nuclearcraft.enricher.builder()
    .input(item("embers:dust_ember"))
    .fluidInput(fluid("redstone") * 1000)
    .fluidOutput(fluid("alchemical_redstone") * 1000)
    .register()
