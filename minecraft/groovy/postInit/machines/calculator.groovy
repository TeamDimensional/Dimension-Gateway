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

// Separators
crafting.remove("calculator:tile.stoneseparator151")
crafting.shapedBuilder()
    .mirrored()
    .matrix("SQS", "PIP", "SQS")
    .key("S", item("sonarcore:reinforcedstoneblock"))
    .key("Q", item("minecraft:piston"))
    .key("I", item("calculator:reinforcedironingot"))
    .key("P", item("calculator:advancedpowercube"))
    .output(item("calculator:stoneseparator"))
    .register()
crafting.remove("calculator:tile.algorithmseparator203")
crafting.shapedBuilder()
    .matrix("SQS", "PIP", "SQS")
    .key("S", item("calculator:material", 3))
    .key("Q", item("calculator:flawlessdiamond"))
    .key("I", item("calculator:stoneseparator"))
    .key("P", item("calculator:advancedpowercube"))
    .output(item("calculator:algorithmseparator"))
    .register()

// Docking Station
crafting.remove("calculator:tile.dockingstation196")
crafting.shapedBuilder()
    .matrix(" S ", "APA", "SSS")
    .key("S", item("sonarcore:reinforcedstoneblock"))
    .key("P", item("calculator:advancedpowercube"))
    .key("A", item("calculator:calculatorassembly"))
    .output(item("calculator:dockingstation"))
    .register()

// Cleanroom machines
crafting.remove("calculator:tile.precisionchamber155")
crafting.shapedBuilder()
    .mirrored()
    .matrix("IDI", "DFL", "IDI")
    .key("I", item("calculator:material", 3))
    .key("D", item("calculator:weakeneddiamond"))
    .key("F", item("gateway:cleanroom_machine_frame"))
    .key("L", item("astralsorcery:itemcoloredlens", 1))
    .output(item("calculator:precisionchamber"))
    .register()

mods.calculator.atomic_calculator.removeByOutput(item("calculator:processingchamber"))
crafting.shapedBuilder()
    .mirrored()
    .matrix("IDI", "DFL", "IDI")
    .key("I", item("calculator:material", 3))
    .key("D", item("calculator:weakeneddiamond"))
    .key("F", item("gateway:cleanroom_machine_frame"))
    .key("L", item("astralsorcery:itemcoloredlens", 4))
    .output(item("calculator:processingchamber"))
    .register()

crafting.remove("calculator:tile.analysingchamber144")
crafting.shapedBuilder()
    .matrix("ILI", "DFD", "ICI")
    .key("I", item("calculator:material", 3))
    .key("D", item("calculator:weakeneddiamond"))
    .key("F", item("gateway:cleanroom_machine_frame"))
    .key("L", item("astralsorcery:itemcraftingcomponent", 3))
    .key("C", item("prodigytech:circuit_refined"))
    .output(item("calculator:analysingchamber"))
    .register()

mods.calculator.atomic_calculator.removeByOutput(item("calculator:storagechamber"))
crafting.shapedBuilder()
    .matrix("I I", "DCD", "IFI")
    .key("I", item("calculator:material", 3))
    .key("D", item("calculator:weakeneddiamond"))
    .key("F", item("gateway:cleanroom_machine_frame"))
    .key("C", item("calculator:reinforcedchest"))
    .output(item("calculator:storagechamber"))
    .register()

crafting.remove("calculator:tile.fabricationchamber145")
crafting.shapedBuilder()
    .mirrored()
    .matrix("P R", "IFI")
    .key("I", item("calculator:material", 3))
    .key("F", item("gateway:cleanroom_machine_frame"))
    .key("R", item("ee:red_crystal_item"))
    .key("P", item("ee:purple_crystal_item"))
    .output(item("calculator:fabricationchamber"))
    .register()

// Calculator Locator
crafting.remove("calculator:tile.calculatorlocator149")
mods.astralsorcery.starlight_altar.traitRecipeBuilder()
    .output(item("calculator:calculatorlocator"))
    .matrix(' P P ',
            'P B P',
            '  p  ',
            'S D S',
            'SSSSS')
    .outerInput(
        item("botania:rune", 10), item("calculator:circuitboard", 9), item("calculator:circuitboard", 9),
        item("botania:rune", 12), item("calculator:circuitboard", 9), item("calculator:circuitboard", 9))
    .key("B", item("minecraft:beacon"))
    .key("p", item("calculator:calculatorplug"))
    .key("P", item("prodigytech:circuit_perfected"))
    .key("S", ore("sonarStableStone"))
    .key("D", item("calculator:electricdiamond"))
    .starlight(3500)
    .craftTime(600)
    .register()

// Calculator Plug
crafting.remove("calculator:tile.calculatorplug150")
crafting.shapedBuilder()
    .matrix(" E ", "ASA", "RIR")
    .key("E", item("calculator:energymodule"))
    .key("A", item("calculator:advancedassembly"))
    .key("S", ore("sonarStableStone"))
    .key("R", item("calculator:redstoneingot"))
    .key("I", item("advancedrocketry:productingot", 1))
    .output(item("calculator:calculatorplug"))
    .register()

// Conductor Mast
mods.calculator.atomic_calculator.removeByOutput(item("calculator:conductormast"))
mods.calculator.atomic_calculator.recipeBuilder()
    .input(item("calculator:firediamond"), item("calculator:energymodule"), item("gateway:starsteel_ingot"))
    .output(item("calculator:conductormast"))
    .register()

// Stone Assimilator
crafting.remove("calculator:tile.stoneassimilator198")
crafting.shapedBuilder()
    .matrix(" S ", "BMB", " B ")
    .key("S", item("calculator:sickle"))
    .key("M", item("calculator:stoneseparator"))
    .key("B", item("extrautils2:decorativesolid", 3))
    .output(item("calculator:stoneassimilator"))
    .register()
