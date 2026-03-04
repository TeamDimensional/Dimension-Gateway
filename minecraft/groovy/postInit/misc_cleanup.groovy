// don't show 16 sponge recipes
crafting.removeByOutput(item("openblocks:sponge"))
crafting.shapelessBuilder()
        .name("tier1/qol/sponge")
        .output(item("openblocks:sponge"))
        .input(ore("wool"), ore("slimeball"))
        .register()

// Make silentwood great again
ore("plankWood").add(item("theaurorian:silentwoodplanks"))
ore("logWood").add(item("theaurorian:silentwoodlog"))
ore("stickWood").add(item("theaurorian:silentwoodstick"))

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

// Fix Plant Fiber -> String since it's already oredicted as that
crafting.remove("theaurorian:items/stringfromplantfiber")
crafting.shapelessBuilder()
        .name("tier2/qol/fiber")
        .output(item("minecraft:string") * 3)
        .input(item("theaurorian:plantfiber"), item("theaurorian:plantfiber"), item("theaurorian:plantfiber"))
        .register()
