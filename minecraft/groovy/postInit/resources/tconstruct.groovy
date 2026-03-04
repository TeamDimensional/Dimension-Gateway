// Seared Brick
furnace.removeByOutput(item("tconstruct:materials"))
mods.roots.pyre.recipeBuilder()
    .name("tier2/seared_brick")
    .input(item("minecraft:brick"), item("minecraft:brick"), item("minecraft:netherbrick"),
           item("minecraft:netherbrick"), ore("dustAsh"))
    .output(item("tconstruct:materials") * 4)
    .burnTime(160)
    .register()

// alternate brownstone recipe that doesnt require redstone
crafting.shapedBuilder()
        .name("tier1/qol/brownstone")
        .output(item("tconstruct:brownstone", 1) * 3)
        .matrix(" F ", "SSS", " E ")
        .key("F", ore("gemFireElemental")).key("E", ore("gemEarthElemental")).key("S", ore("sandstone"))
        .register()

// Expanders
crafting.remove("tconstruct:tools/materials/expander_h")
crafting.remove("tconstruct:tools/materials/expander_w")
crafting.shapedBuilder()
        .name("tier4/qol/expander_horizontal")
        .output(item("tconstruct:materials", 12))
        .matrix(" G ", "PSP", " G ")
        .key("P", item("minecraft:piston")).key("G", item("actuallyadditions:block_crystal", 1)).key("S", item("tconstruct:edible", 2))
        .register()
crafting.shapedBuilder()
        .name("tier4/qol/expander_vertical")
        .output(item("tconstruct:materials", 13))
        .matrix(" P ", "GSG", " P ")
        .key("P", item("minecraft:piston")).key("G", item("actuallyadditions:block_crystal", 1)).key("S", item("tconstruct:edible", 2))
        .register()
