// Make silentwood great again
ore("plankWood").add(item("theaurorian:silentwoodplanks"))
ore("logWood").add(item("theaurorian:silentwoodlog"))

crafting.remove("theaurorian:blocks/tileentity/silentwoodcraftingtable")
crafting.shapedBuilder()
        .name("tier2/qol/silentwoodtable")
        .output(item("theaurorian:silentwoodcraftingtable"))
        .matrix("PP", "LL")
        .key("P", item("theaurorian:silentwoodplanks")).key("L", item("theaurorian:silentwoodlog"))
        .register()

crafting.remove("theaurorian:blocks/tileentity/silentwoodchest")
crafting.shapedBuilder()
        .name("tier2/qol/silentwoodchest")
        .output(item("theaurorian:silentwoodchest"))
        .matrix("PPP", "PNP", "PPP")
        .key("P", item("theaurorian:silentwoodplanks")).key("N", ore("nuggetCerulean"))
        .register()

crafting.remove("theaurorian:items/silentwoodstick")
crafting.shapedBuilder()
        .name("tier2/qol/silentwoodstick")
        .output(item("theaurorian:silentwoodstick") * 16)
        .matrix("L", "L")
        .key("L", item("theaurorian:silentwoodlog"))
        .register()

crafting.remove("theaurorian:items/bowl")

// Hang Glider
crafting.remove("openblocks:hang_glider_0")
crafting.shapedBuilder()
        .name("tier2/qol/hang_glider")
        .output(item("openblocks:hang_glider"))
        .matrix("WSW")
        .key("W", item("openblocks:generic")).key("S", item("naturesaura:ancient_stick"))
        .register()

// Hang Glider Wing
crafting.remove("openblocks:glider_wing_0")
crafting.remove("openblocks:glider_wing_1")
crafting.shapedBuilder()
        .name("tier2/qol/glider_wing")
        .output(item("openblocks:generic"))
        .matrix("LS ", "LLS", "MLL")
        .key("L", item("minecraft:leather")).key("S", ore("stickWood")).key("M", ore("ingotMoonstone"))
        .mirrored()
        .register()
