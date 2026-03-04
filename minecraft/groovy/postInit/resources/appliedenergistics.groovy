// Certus
mods.extrautils2.resonator.recipeBuilder()
    .input(item("appliedenergistics2:material", 2))
    .output(item("appliedenergistics2:material"))
    .energy(1200)
    .register()

// Fluix
mods.factorytech.agitator.recipeBuilder()
    .input(item("appliedenergistics2:material"))
    .fluidInput(fluid("redstone") * 200, fluid("propane") * 200)
    .output(item("appliedenergistics2:material", 7))
    .register()
mods.extrautils2.resonator.recipeBuilder()
    .input(item("appliedenergistics2:material", 8))
    .output(item("appliedenergistics2:material", 7))
    .energy(1200)
    .register()

// Fluix Pearl
crafting.removeByOutput(item("appliedenergistics2:material", 9))
mods.advancedrocketry.crystallizer.recipeBuilder()
    .input(item("appliedenergistics2:material", 7) * 4, item("appliedenergistics2:material", 8) * 4, item("botania:manaresource", 1))
    .output(item("appliedenergistics2:material", 9))
    .power(160)
    .time(200)
    .register()

// Processors
mods.embers.stamper.recipeBuilder()
    .stamp(item("appliedenergistics2:material", 15))
    .input(item("thermalfoundation:material", 166))
    .fluidInput(fluid("redstone") * 100)
    .output(item("appliedenergistics2:material", 22))
    .register()
mods.embers.stamper.recipeBuilder()
    .stamp(item("appliedenergistics2:material", 13))
    .input(item("factorytech:ingot", 4))
    .fluidInput(fluid("redstone") * 100)
    .output(item("appliedenergistics2:material", 23))
    .register()
mods.embers.stamper.recipeBuilder()
    .stamp(item("appliedenergistics2:material", 14))
    .input(item("thermalfoundation:material", 134))
    .fluidInput(fluid("redstone") * 100)
    .output(item("appliedenergistics2:material", 24))
    .register()

// Processor Presses
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .matrix("I   I",
            " SES ",
            " LGL ",
            " SLS ",
            "I   I")
    .key("I", item("thermalfoundation:material", 32))
    .key("S", item("thermalfoundation:material", 322))
    .key("L", item("thermalfoundation:material", 166))
    .key("E", item("essentialcraft:genitem", 31))
    .key("G", item("essentialcraft:genitem", 9))
    .output(item("appliedenergistics2:material", 15))
    .starlight(1000)
    .craftTime(100)
    .register()

mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .matrix("I   I",
            " SES ",
            " LGL ",
            " SLS ",
            "I   I")
    .key("I", item("thermalfoundation:material", 32))
    .key("S", item("thermalfoundation:material", 322))
    .key("L", item("factorytech:ingot", 4))
    .key("E", item("essentialcraft:genitem", 31))
    .key("G", item("essentialcraft:genitem", 9))
    .output(item("appliedenergistics2:material", 13))
    .starlight(1000)
    .craftTime(100)
    .register()

mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .matrix("I   I",
            " SES ",
            " LGL ",
            " SLS ",
            "I   I")
    .key("I", item("thermalfoundation:material", 32))
    .key("S", item("thermalfoundation:material", 322))
    .key("L", item("thermalfoundation:material", 134))
    .key("E", item("essentialcraft:genitem", 31))
    .key("G", item("essentialcraft:genitem", 9))
    .output(item("appliedenergistics2:material", 14))
    .starlight(1000)
    .craftTime(100)
    .register()

// Advanced Card
crafting.removeByOutput(item("appliedenergistics2:material", 28))
crafting.shapedBuilder()
    .name("resources/ae2/advanced_card")
    .matrix("DT ", "RPT", "DT ")
    .key("D", item("botania:manaresource", 2))
    .key("T", item("libvulpes:productingot", 7))
    .key("R", item("minecraft:redstone"))
    .key("P", item("appliedenergistics2:material", 23))
    .output(item("appliedenergistics2:material", 28) * 2)
    .register()

// Storage components
def components = [
    //// (lower level, higher level, processor, corners, center)
    // 4k
    [item("appliedenergistics2:material", 35), item("appliedenergistics2:material", 36), item("appliedenergistics2:material", 22),
     item("calculator:redstoneingot"), item("appliedenergistics2:quartz_glass"), "4k"],
    [item("appliedenergistics2:material", 54), item("appliedenergistics2:material", 55), item("appliedenergistics2:material", 22),
     item("actuallyadditions:item_crystal", 1), item("appliedenergistics2:quartz_glass"), "4k_fluid"],
    // 16k
    [item("appliedenergistics2:material", 36), item("appliedenergistics2:material", 37), item("appliedenergistics2:material", 23),
     item("calculator:redstoneingot"), item("thermalfoundation:glass", 3), "16k"],
    [item("appliedenergistics2:material", 55), item("appliedenergistics2:material", 56), item("appliedenergistics2:material", 23),
     item("actuallyadditions:item_crystal", 1), item("thermalfoundation:glass", 2), "16k_fluid"],
    // 64k
    [item("appliedenergistics2:material", 37), item("appliedenergistics2:material", 38), item("appliedenergistics2:material", 23),
     item("thermalfoundation:material", 166), item("botania:managlass"), "64k"],
    [item("appliedenergistics2:material", 56), item("appliedenergistics2:material", 57), item("appliedenergistics2:material", 23),
     item("actuallyadditions:item_crystal_empowered", 1), item("botania:managlass"), "64k_fluid"],
    // 256k
    [item("appliedenergistics2:material", 38), item("nae2:material", 1), item("appliedenergistics2:material", 24),
     item("thermalfoundation:material", 166), item("enderio:block_fused_quartz"), "256k"],
    [item("appliedenergistics2:material", 57), item("nae2:material", 5), item("appliedenergistics2:material", 24),
     item("actuallyadditions:item_crystal_empowered", 1), item("enderio:block_fused_quartz"), "256k_fluid"],
    // 1024k
    [item("nae2:material", 1), item("nae2:material", 2), item("appliedenergistics2:material", 24),
     item("thermalfoundation:material", 167), item("enderio:block_fused_quartz"), "1024k"],
    [item("nae2:material", 5), item("nae2:material", 6), item("appliedenergistics2:material", 24),
     item("actuallyadditions:item_crystal_empowered", 2), item("enderio:block_fused_quartz"), "1024k_fluid"],
    // 4096k
    [item("nae2:material", 2), item("nae2:material", 3), item("appliedenergistics2:material", 24),
     item("thermalfoundation:material", 167), item("essentialcraft:genitem", 32), "4096k"],
    [item("nae2:material", 6), item("nae2:material", 7), item("appliedenergistics2:material", 24),
     item("actuallyadditions:item_crystal_empowered", 2), item("essentialcraft:genitem", 32), "4096k_fluid"],
    // 16384k
    [item("nae2:material", 3), item("nae2:material", 4), item("appliedenergistics2:material", 24),
     item("nuclearcraft:ingot2", 1), item("essentialcraft:genitem", 32), "16384k"],
    [item("nae2:material", 7), item("nae2:material", 8), item("appliedenergistics2:material", 24),
     item("qmd:ingot", 15), item("essentialcraft:genitem", 32), "16384k_fluid"],
]

for (def xs in components) {
    crafting.removeByOutput(xs[1])
    crafting.shapedBuilder()
        .name("resources/ae2/${xs[5]}_component")
        .matrix("GPG", "CSC", "GCG")
        .key("G", xs[3])
        .key("P", xs[2])
        .key("S", xs[4])
        .key("C", xs[0])
        .output(xs[1])
        .register()
}
