// Hunger Module
crafting.removeByOutput(item("calculator:hungermodule"))
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .matrix("A   A",
            " sSs ",
            " FPF ",
            " RFR ",
            "A   A")
    .key("A", item("calculator:smallamethyst"))
    .key("P", item("minecraft:golden_apple"))
    .key("S", item("calculator:calculatorscreen"))
    .key("s", item("astralsorcery:itemcraftingcomponent", 1))
    .key("F", item("calculator:fiddledewfruit"))
    .key("R", item("calculator:redstoneingot"))
    .output(item("calculator:hungermodule"))
    .starlight(1500)
    .craftTime(300)
    .register()

// Health Module
crafting.removeByOutput(item("calculator:healthmodule"))
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .matrix("A   A",
            " RSR ",
            " FPF ",
            " RFR ",
            "A   A")
    .key("A", item("calculator:smalltanzanite"))
    .key("P", item("minecraft:golden_apple"))
    .key("S", item("calculator:calculatorscreen"))
    .key("F", item("botania:rune", 13))
    .key("R", item("essentialcraft:genitem"))
    .output(item("calculator:healthmodule"))
    .starlight(2000)
    .craftTime(400)
    .register()

// Nutrition Module
mods.calculator.atomic_calculator.removeByOutput(item("calculator:nutritionmodule"))
mods.advancedrocketry.precision_assembler.recipeBuilder()
    .input(item("calculator:healthmodule"), item("calculator:hungermodule"), item("calculator:healthprocessor"), item("calculator:hungerprocessor"),
           item("calculator:atomicbinder") * 8, item("botania:quartz", 6) * 8)
    .output(item("calculator:nutritionmodule"))
    .power(500)
    .time(200)
    .register()