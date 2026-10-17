// Shadowium
mods.botania.elven_trade.recipeBuilder()
    .input(item("thermalfoundation:material", 136))
    .input(item("extrabotany:nightmarefuel"))
    .input(item("extrabotany:gildedmashedpotato"))
    .output(item("extrabotany:material", 5))
    .register()

// Photonium
mods.botania.elven_trade.recipeBuilder()
    .input(item("thermalfoundation:material", 136))
    .input(item("extrabotany:spiritfuel"))
    .input(item("extrabotany:gildedmashedpotato"))
    .output(item("extrabotany:material", 8))
    .register()

// Nightmare Fuel
mods.botania.mana_infusion.removeByOutput(item("extrabotany:nightmarefuel"))
mods.botania.mana_infusion.recipeBuilder()
    .input(item("thaumcraft:ingot", 1))
    .output(item("extrabotany:nightmarefuel"))
    .mana(2000)
    .register()

// Spirit Fuel
mods.botania.mana_infusion.recipeBuilder()
    .input(item("thermalfoundation:material", 166))
    .output(item("extrabotany:spiritfuel"))
    .mana(2000)
    .register()

// Orichalcos
mods.botania_ceu.terrestrial_agglomeration_plate.recipeBuilder()
    .input(item("extrabotany:material", 5), item("extrabotany:material", 8), item("botania:manaresource", 14), item("botania:manaresource", 5), item("botania:manaresource", 5), item("extrabotany:material", 3), item("extrabotany:gildedmashedpotato"))
    .output(item("extrabotany:material", 1))
    .centerBlock(blockstate("botania:conjurationcatalyst"))
    .mana(400000)
    .register()

// Gilded Potato
mods.advancedrocketry.chemical_reactor.recipeBuilder()
    .input(item("minecraft:potato") * 4)
    .fluidInput(fluid("gold") * 128)
    .output(item("extrabotany:material", 2) * 4)
    .power(128).time(40)
    .register()
