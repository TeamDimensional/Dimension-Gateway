// Power Cube
crafting.removeByOutput(item("calculator:advancedpowercube"))
crafting.shapedBuilder()
    .matrix(" R ", "UFU", "RUR")
    .key("R", item("minecraft:redstone"))
    .key("U", item("roots:runestone"))
    .key("F", item("minecraft:furnace"))
    .output(item("calculator:advancedpowercube"))
    .register()