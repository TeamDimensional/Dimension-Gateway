// Black Quartz
mods.embers.stamper.recipeBuilder()
    .stamp(item("embers:stamp_flat"))
    .input(item("minecraft:quartz"))
    .fluidInput(fluid("oil") * 100)
    .output(item("actuallyadditions:item_misc", 5))
    .register()
