import classes.AlloyHelper

// Openblocks's backpack
crafting.remove("openblocks:beam_0")
crafting.remove("openblocks:beam_1")
crafting.shapedBuilder()
        .name("tier3/qol/openblocks_beam")
        .output(item("openblocks:generic", 1) * 2)
        .matrix("SSS", "B Y", "SSS")
        .key("B", ore("dyeBlack")).key("Y", ore("dyeYellow")).key("S", ore("ingotSteel"))
        .mirrored()
        .register()

crafting.remove("openblocks:crane_magnet_0")
crafting.remove("openblocks:crane_magnet_1")
crafting.shapedBuilder()
        .name("tier3/qol/openblocks_magnet")
        .output(item("openblocks:generic", 3))
        .matrix("BSY", "SRS")
        .key("B", ore("dyeBlack")).key("Y", ore("dyeYellow")).key("S", ore("ingotSteel")).key("R", ore("dustRedstone"))
        .mirrored()
        .register()

crafting.remove("openblocks:line_0")
AlloyHelper.builder()
    .name("tier3/qol/openblocks_line")
    .output(item("openblocks:generic", 5))
    .input(item("minecraft:string"), item("roots:runic_dust") * 2)
    .time(200)
    .register()