mods.actuallyadditions.nether_mining_lens.removeAll()
mods.actuallyadditions.stone_mining_lens.removeAll()

for (def it in ["oreClathrateRedstone", "oreClathrateGlowstone", "oreClathrateEnder", "oreRutile"]) {
    mods.actuallyadditions.nether_mining_lens.recipeBuilder()
        .ore(it)
        .weight(1000)
        .register()
}

for (def it in ["oreDenseIron", "oreDenseCopper", "oreDenseTin", "oreDenseSilver", "oreDenseLead", "oreDenseGold"]) {
    mods.actuallyadditions.stone_mining_lens.recipeBuilder()
        .ore(it)
        .weight(1000)
        .register()
}
