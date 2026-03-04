// Coralium Liquid
inWorldCrafting.fluidToFluid.recipeBuilder()
        .fluidInput(fluid("sludge"))
        .input(item("enderio:item_material", 36))
        .input(item("astralsorcery:itemcraftingcomponent", 4), 0.3f)
        .fluidOutput(fluid("liquidcoralium"))
        .register()

// Shadow Gem
inWorldCrafting.fluidToItem.recipeBuilder()
        .fluidInput(fluid("liquidcoralium"), 0.2f)
        .input(item("essentialcraft:genitem", 47))
        .output(item("abyssalcraft:shadowgem"))
        .register()
