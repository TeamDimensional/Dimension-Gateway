// Runestone
mods.roots.fey_crafter.removeByOutput(item("roots:runestone"))
mods.roots.fey_crafter.recipeBuilder()
    .name("tier2/runestone")
    .input(item("minecraft:stone"), item("minecraft:stone"), item("minecraft:stone"), item("minecraft:blaze_powder"), item("minecraft:dye", 4))
    .output(item("roots:runestone") * 6)
    .register()