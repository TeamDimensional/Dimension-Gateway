// Stone Separator
mods.calculator.stone_separator.removeByInput(item("minecraft:gold_ore"))
mods.calculator.stone_separator.removeByInput(item("minecraft:iron_ore"))

// Thaumcraft Crucible
for (def i in 0..6) mods.thaumcraft.crucible.removeByOutput(item("thaumcraft:cluster", i))

// TODO - ore leacher
// TODO - mass spectrometer
