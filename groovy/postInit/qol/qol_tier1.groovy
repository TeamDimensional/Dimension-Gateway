// drawer key
crafting.shapedBuilder()
        .name("tier1/qol/drawer_key")
        .output(item("storagedrawers:drawer_key"))
        .matrix("NI", "YI", " T")
        .key("N", ore("nuggetIron")).key("I", ore("ingotIron")).key("Y", ore("dyeYellow"))
        .key("T", item("storagedrawers:upgrade_template"))
        .register()

// concealment key
crafting.remove("storagedrawers:key_concealment")
crafting.shapelessBuilder()
        .name("tier1/qol/conceal_key")
        .output(item("storagedrawers:shroud_key"))
        .input(item("storagedrawers:drawer_key"), item("roots:glass_eye"))
        .register()

// alternate brownstone recipe that doesnt require redstone
crafting.shapedBuilder()
        .name("tier1/qol/brownstone")
        .output(item("tconstruct:brownstone", 1) * 3)
        .matrix(" F ", "SSS", " E ")
        .key("F", ore("gemFireElemental")).key("E", ore("gemEarthElemental")).key("S", ore("sandstone"))
        .register()

// xp shower
crafting.remove("openblocks:xp_shower_0")
crafting.shapedBuilder()
        .name("tier1/qol/xp_shower")
        .output(item("openblocks:xp_shower"))
        .matrix("III", "  F")
        .key("F", item("minecraft:flint")).key("I", ore("ingotIron"))
        .register()

// don't show 16 sponge recipes
crafting.removeByOutput(item("openblocks:sponge"))
crafting.shapelessBuilder()
        .name("tier1/qol/sponge")
        .output(item("openblocks:sponge"))
        .input(ore("wool"), ore("slimeball"))
        .register()

