// Elemental Crystals
crafting.remove("essentialcraft:gem_elemental")
mods.roots.pyre.recipeBuilder()
    .name("tier1/elemental_block")
    .input(item("essentialcraft:compressed"), item("essentialcraft:compressed", 1), item("essentialcraft:compressed", 2),
           item("essentialcraft:compressed", 3), ore("gunpowder"))
    .output(item("essentialcraft:compressed", 4) * 4)
    .burnTime(300)
    .register()
