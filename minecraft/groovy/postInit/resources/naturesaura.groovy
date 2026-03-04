// Gold Powder
crafting.remove("naturesaura:gold_powder")
inWorldCrafting.pistonPush.recipeBuilder()
    .input(item("naturesaura:gold_leaf"))
    .output(item("naturesaura:gold_powder"))
    .minHarvestLevel(1)
    .maxConversionsPerPush(16)
    .register()
