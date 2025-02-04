// Elven Quartz
mods.botania.elven_trade.removeByOutputs(item("botania:quartz", 5))
mods.botania.elven_trade.recipeBuilder()
    .input(item("botania:quartz", 6))
    .output(item("botania:quartz", 5))
    .register()
