// Pure Daisy
inWorldCrafting.fluidToItem.recipeBuilder()
        .fluidInput(fluid("water"))
        .input(item("gateway:wilted_daisy"))
        .input(ore("petalWhite") * 4)
        .output(item("botania:specialflower").withNbt(["type": "puredaisy"]))
        .register()