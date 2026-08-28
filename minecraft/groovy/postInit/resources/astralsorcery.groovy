// Resonating Gem
mods.astralsorcery.infusion_altar.removeByOutput(item("astralsorcery:itemcraftingcomponent", 4))
mods.astralsorcery.infusion_altar.recipeBuilder()
    .input(item("gateway:dormant_magical_crystal"))
    .output(item("astralsorcery:itemcraftingcomponent", 4))
    .consumption(1f)
    .chalice(true)
    .consumeMultiple(false)
    .time(40)
    .register()

mods.prodigytech.magnetic_reassembler.recipeBuilder()
    .input(item("gateway:magical_crystal_mixture"))
    .output(item("gateway:dormant_magical_crystal"))
    .register()

mods.roots.mortar.recipeBuilder()
    .name("fine_magical_sand")
    .input(item("appliedenergistics2:material", 7), item("gateway:resonating_gem"), item("essentialcraft:genitem", 47),
           item("gateway:ourium_shard"), item("aether_legacy:zanite_gemstone"))
    .output(item("gateway:magical_crystal_mixture"))
    .color(0.3, 0.7, 1, 1, 0.7, 0.3)
    .register()


// Dynamism Shards
mods.calculator.algorithm_separator.recipeBuilder()
    .input(item("astralsorcery:itemperkgem"))
    .output(item("gateway:ourium_shard") * 4, item("astralsorcery:itemcraftingcomponent", 2))
    .register()
mods.calculator.algorithm_separator.recipeBuilder()
    .input(item("astralsorcery:itemperkgem", 1))
    .output(item("gateway:ilium_shard") * 4, item("astralsorcery:itemcraftingcomponent", 2))
    .register()
mods.calculator.algorithm_separator.recipeBuilder()
    .input(item("astralsorcery:itemperkgem", 2))
    .output(item("gateway:fengarum_shard") * 4, item("astralsorcery:itemcraftingcomponent", 2))
    .register()
