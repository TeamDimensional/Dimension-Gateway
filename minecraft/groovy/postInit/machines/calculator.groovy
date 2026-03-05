// Power Cube
crafting.removeByOutput(item("calculator:advancedpowercube"))
crafting.shapedBuilder()
    .matrix(" R ", "UFU", "RUR")
    .key("R", item("minecraft:redstone"))
    .key("U", item("roots:runestone"))
    .key("F", item("minecraft:furnace"))
    .output(item("calculator:advancedpowercube"))
    .register()

// Hunger Processor
crafting.removeByOutput(item("calculator:hungerprocessor"))
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .matrix("A   A",
            " aGa ",
            " SHS ",
            " aGa ",
            "A   A")
    .key("H", item("extrautils2:machine"))
    .key("a", item("extrautils2:magicapple"))
    .key("A", item("calculator:largeamethyst"))
    .key("G", item("aether_legacy:aechor_petal"))
    .key("S", item("calculator:advancedassembly"))
    .output(item("calculator:hungerprocessor"))
    .starlight(1500)
    .craftTime(300)
    .register()

// Health Processor
crafting.removeByOutput(item("calculator:healthprocessor"))
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .matrix("A   A",
            " aGa ",
            " SHS ",
            " aGa ",
            "A   A")
    .key("H", item("extrautils2:machine"))
    .key("a", item("extrautils2:magicapple"))
    .key("A", item("calculator:largetanzanite"))
    .key("G", item("botania:rune", 12))
    .key("S", item("calculator:flawlessassembly"))
    .output(item("calculator:healthprocessor"))
    .starlight(2000)
    .craftTime(400)
    .register()

// Amethyst Sapling
mods.calculator.scientific_calculator.removeByInput(item("calculator:largeamethyst"))
mods.calculator.scientific_calculator.recipeBuilder()
    .input(item("calculator:largeamethyst"), item("aether_legacy:golden_oak_sapling"))
    .output(item("calculator:amethystsapling"))
    .register()

// Tanzanite Sapling
mods.calculator.atomic_calculator.removeByOutput(item("calculator:tanzanitesapling"))
mods.calculator.flawless_calculator.recipeBuilder()
    .input(item("calculator:largetanzanite"), item("botania:rune", 15), item("calculator:fiddledewfruit"), item("aether_legacy:golden_oak_sapling"))
    .output(item("calculator:tanzanitesapling"))
    .register()
mods.calculator.flawless_calculator.recipeBuilder()
    .input(item("calculator:tanzanitelog"), item("calculator:tanzaniteleaves"), item("calculator:fiddledewfruit"), item("aether_legacy:golden_oak_sapling"))
    .output(item("calculator:tanzanitesapling"))
    .register()

// Pear Sapling
mods.calculator.atomic_calculator.removeByOutput(item("calculator:pearsapling"))
mods.calculator.atomic_calculator.recipeBuilder()
    .input(item("minecraft:sapling", 3), item("minecraft:end_stone"), item("minecraft:golden_apple"))
    .output(item("calculator:pearsapling"))
    .register()
