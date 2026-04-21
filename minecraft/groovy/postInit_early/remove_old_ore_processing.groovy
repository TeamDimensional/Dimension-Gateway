// priority: 10

// Tinkers' Smeltery
mods.tconstruct.melting.removeByInput(item("nuclearcraft:ingot", 8))  // graphite
mods.tconstruct.melting.removeByInput(item("minecraft:gold_ore"))
mods.tconstruct.melting.removeByInput(item("minecraft:emerald_ore"))
mods.tconstruct.melting.removeByInput(item("minecraft:iron_ore"))
mods.tconstruct.melting.removeByInput(item("tconstruct:ore"))
mods.tconstruct.melting.removeByInput(item("tconstruct:ore", 1))
for (def i in 0..7) mods.tconstruct.melting.removeByInput(item("thermalfoundation:ore", i))
for (def i in 3..7) mods.tconstruct.melting.removeByInput(item("nuclearcraft:ore", i))

// Stone Separator
mods.calculator.stone_separator.removeByInput(item("minecraft:gold_ore"))
mods.calculator.stone_separator.removeByInput(item("minecraft:iron_ore"))

// Thaumcraft Crucible
for (def i in 0..6) mods.thaumcraft.crucible.removeByOutput(item("thaumcraft:cluster", i))

// Embers Melter
mods.embers.melter.removeByInput(item("minecraft:gold_ore"))
mods.embers.melter.removeByInput(item("minecraft:iron_ore"))
for (def i in 0..5) mods.embers.melter.removeByInput(item("thermalfoundation:ore", i))
mods.embers.melter.removeByInput(item("minecraft:redstone"))
mods.embers.melter.removeByInput(item("minecraft:redstone_block"))
mods.embers.melter.removeByInput(item("minecraft:redstone_ore"))

// Magma Crucible
mods.thermalexpansion.crucible.removeByInput(item("minecraft:gold_ore"))
mods.thermalexpansion.crucible.removeByInput(item("minecraft:iron_ore"))
mods.thermalexpansion.crucible.removeByInput(item("minecraft:emerald_ore"))
mods.thermalexpansion.crucible.removeByInput(item("tconstruct:ore"))
mods.thermalexpansion.crucible.removeByInput(item("tconstruct:ore", 1))
for (def i in 0..8) mods.thermalexpansion.crucible.removeByInput(item("thermalfoundation:ore", i))
for (def i in 0..4) mods.thermalexpansion.crucible.removeByInput(item("thermalfoundation:ore_fluid", i))

// TODO - ore leacher
// TODO - mass spectrometer
