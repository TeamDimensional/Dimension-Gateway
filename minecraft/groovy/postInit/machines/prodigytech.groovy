// Explosion Furnace
crafting.remove("prodigytech:machine/explosion_furnace")
crafting.shapedBuilder()
        .name("tier2/explosion_furnace")
        .output(item("prodigytech:explosion_furnace"))
        .matrix("BBB", "BAB", "BBB")
        .key("B", ore("bricksStone")).key("A", item("naturesaura:token_anger"))
        .register()

// Incinerator
crafting.remove("prodigytech:machine/incinerator")
crafting.shapedBuilder()
        .name("tier2/incinerator")
        .output(item("prodigytech:incinerator"))
        .matrix("FUF", "FUF", "FSF")
        .key("F", ore("ingotFerramic")).key("U", item("theaurorian:scrapumbra")).key("S", item("naturesaura:token_sorrow"))
        .register()
