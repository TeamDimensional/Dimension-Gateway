// Small Plate Press
crafting.remove("advancedrocketry:platepress")
crafting.shapedBuilder()
    .name("tier3/plate_press")
    .matrix(" P ", "III")
    .key("P", item("minecraft:piston"))
    .key("I", item("thermalfoundation:material", 162))
    .output(item("advancedrocketry:platepress"))
    .register()
