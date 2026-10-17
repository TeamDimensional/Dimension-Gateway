// Dense Gravitite Ore
mods.calculator.stone_separator.recipeBuilder()
    .input(item("gateway:dense_gravitite_ore"))
    .output(item("aether_legacy:gravitite_ore") * 8, item("ee:amber_raw") * 5)
    .register()

// Gravitite
mods.extrautils2.enchanter.recipeBuilder()
    .input(item("aether_legacy:gravitite_ore"), item("aether_legacy:ambrosium_shard") * 2)
    .output(item("aether_legacy:enchanted_gravitite"))
    .energy(24000)
    .time(200)
    .register()
