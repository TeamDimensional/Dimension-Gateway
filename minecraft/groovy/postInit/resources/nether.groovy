// Netherite
furnace.removeByInput(item("netherized:ancient_debris"))
crafting.remove("netherized:materials/netherite_ingot")
mods.essentialcraft.magician_table.recipeBuilder()
    .input(item("essentialcraft:genitem", 10), item("minecraft:nether_brick"), item("minecraft:magma"),
           item("thermalfoundation:material", 771), item("thermalfoundation:material", 770))
    .output(item("netherized:netherite_ingot"))
    .mru(250)
    .register()
