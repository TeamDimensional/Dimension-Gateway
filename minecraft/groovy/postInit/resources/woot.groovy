// Stygian Iron
furnace.removeByOutput(item("woot:stygianironingot"))
mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(item("woot:stygianirondust"))
    .output(item("woot:stygianironingot"))
    .time(800)
    .slag(item("thermalfoundation:material", 865))
    .register()

mods.woot.anvil.removeByOutput(item("woot:stygianirondust"))
mods.calculator.scientific_calculator.recipeBuilder()
    .input(item("tconstruct:ore", 1), item("abyssalcraft:shadowgem"))
    .output(item("woot:stygianirondust") * 3)
    .register()
