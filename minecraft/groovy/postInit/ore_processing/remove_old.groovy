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

// IE's Crusher
mods.immersiveengineering.crusher.removeByInput(item("minecraft:gold_ore"))
mods.immersiveengineering.crusher.removeByInput(item("minecraft:iron_ore"))
mods.immersiveengineering.crusher.removeByInput(item("minecraft:diamond_ore"))
mods.immersiveengineering.crusher.removeByInput(item("minecraft:redstone_ore"))
mods.immersiveengineering.crusher.removeByInput(item("minecraft:emerald_ore"))
mods.immersiveengineering.crusher.removeByInput(item("minecraft:quartz_ore"))
mods.immersiveengineering.crusher.removeByInput(item("minecraft:coal_ore"))
mods.immersiveengineering.crusher.removeByInput(item("minecraft:lapis_ore"))
for (def i in 0..8) mods.immersiveengineering.crusher.removeByInput(item("thermalfoundation:ore", i))
for (def i in 0..4) mods.immersiveengineering.crusher.removeByInput(item("essentialcraft:oredrops", i))
mods.immersiveengineering.crusher.removeByInput(item("essentialcraft:oremithriline"))
for (def i in 3..7) mods.immersiveengineering.crusher.removeByInput(item("nuclearcraft:ore", i))
for (def i in [0, 8]) mods.immersiveengineering.crusher.removeByInput(item("libvulpes:ore0", i))
mods.immersiveengineering.crusher.removeByInput(item("thaumcraft:ore_amber"))
mods.immersiveengineering.crusher.removeByInput(item("tconstruct:ore"))
mods.immersiveengineering.crusher.removeByInput(item("abyssalcraft:coraliumore"))
mods.immersiveengineering.crusher.removeByInput(item("abyssalcraft:nitreore"))
mods.immersiveengineering.crusher.removeByInput(item("aether_legacy:zanite_ore"))
mods.immersiveengineering.crusher.removeByInput(item("aether_legacy:ambrosium_ore"))
mods.immersiveengineering.crusher.removeByInput(item("aetherworks:aether_ore"))
mods.immersiveengineering.crusher.removeByInput(item("theaurorian:auroriancoalore"))
mods.immersiveengineering.crusher.removeByInput(item("theaurorian:geodeore"))
for (def i in [0, 2]) mods.immersiveengineering.crusher.removeByInput(item("deepresonance:resonating_ore", i))

// Crusher - removing bugged recipes for no-longer-existing ores
mods.immersiveengineering.crusher.removeByOutput(item("nuclearcraft:dust", 12))
mods.immersiveengineering.crusher.removeByOutput(item("libvulpes:productdust", 3))
for (def i in [0, 1]) mods.immersiveengineering.crusher.removeByOutput(item("appliedenergistics2:material", i))
mods.immersiveengineering.crusher.removeByOutput(item("evilcraft:dark_gem"))
mods.immersiveengineering.crusher.removeByOutput(item("actuallyadditions:item_misc", 5))

// Actually Additions Crusher
mods.actuallyadditions.crusher.removeByInput(item("minecraft:gold_ore"))
mods.actuallyadditions.crusher.removeByInput(item("minecraft:iron_ore"))
mods.actuallyadditions.crusher.removeByInput(item("minecraft:redstone_ore"))
mods.actuallyadditions.crusher.removeByInput(item("minecraft:lapis_ore"))
mods.actuallyadditions.crusher.removeByInput(item("minecraft:diamond_ore"))
mods.actuallyadditions.crusher.removeByInput(item("minecraft:coal_ore"))
mods.actuallyadditions.crusher.removeByInput(item("minecraft:quartz_ore"))
mods.actuallyadditions.crusher.removeByInput(item("minecraft:emerald_ore"))
for (def i in 0..8) mods.actuallyadditions.crusher.removeByInput(item("thermalfoundation:ore", i))
for (def i in 0..5) mods.actuallyadditions.crusher.removeByInput(item("immersiveengineering:ore", i))
mods.actuallyadditions.crusher.removeByInput(item("abyssalcraft:abyiroore"))
for (def i in 0..4) mods.actuallyadditions.crusher.removeByInput(item("essentialcraft:oredrops", i))
mods.actuallyadditions.crusher.removeByInput(item("essentialcraft:oremithriline"))
for (def i in 3..7) mods.actuallyadditions.crusher.removeByInput(item("nuclearcraft:ore", i))
for (def i in [0, 8]) mods.actuallyadditions.crusher.removeByInput(item("libvulpes:ore0", i))
for (def i in [0, 1]) mods.actuallyadditions.crusher.removeByInput(item("tconstruct:ore", i))
mods.actuallyadditions.crusher.removeByInput(item("thaumcraft:ore_amber"))
mods.actuallyadditions.crusher.removeByInput(item("rftools:dimensional_shard_ore", 2))
for (def i in 0..2) mods.actuallyadditions.crusher.removeByInput(item("deepresonance:resonating_ore", i))
mods.actuallyadditions.crusher.removeByInput(item("abyssalcraft:coraliumore"))
mods.actuallyadditions.crusher.removeByInput(item("abyssalcraft:nitreore"))
mods.actuallyadditions.crusher.removeByInput(item("aether_legacy:zanite_ore"))
mods.actuallyadditions.crusher.removeByInput(item("aether_legacy:ambrosium_ore"))
mods.actuallyadditions.crusher.removeByInput(item("aetherworks:aether_ore"))
mods.actuallyadditions.crusher.removeByInput(item("theaurorian:auroriancoalore"))
mods.actuallyadditions.crusher.removeByInput(item("theaurorian:geodeore"))

// Broken recipes - same as above
mods.actuallyadditions.crusher.removeByOutput(item("nuclearcraft:dust", 12))
mods.actuallyadditions.crusher.removeByOutput(item("appliedenergistics2:material"))
mods.actuallyadditions.crusher.removeByOutput(item("evilcraft:dark_gem"))
mods.actuallyadditions.crusher.removeByOutput(item("actuallyadditions:item_misc:5"))

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

// Replace recipes specific to SAG Mill
mods.botania.mana_infusion.recipeBuilder()
    .input(item("enderio:item_material", 14))
    .output(item("enderio:item_material", 36))
    .mana(10000)
    .catalyst(blockstate("naturesaura:crushing_catalyst"))
    .register()

mods.botania.mana_infusion.recipeBuilder()
    .input(item("enderio:item_material", 15))
    .output(item("enderio:item_material", 35))
    .mana(10000)
    .catalyst(blockstate("naturesaura:crushing_catalyst"))
    .register()

mods.botania.mana_infusion.recipeBuilder()
    .input(item("enderio:item_material", 16))
    .output(item("enderio:item_material", 37))
    .mana(25000)
    .catalyst(blockstate("naturesaura:crushing_catalyst"))
    .register()

mods.botania.mana_infusion.recipeBuilder()
    .input(item("enderio:item_material", 19))
    .output(item("enderio:item_material", 34))
    .mana(25000)
    .catalyst(blockstate("naturesaura:crushing_catalyst"))
    .register()

// Alchemy Table
mods.bloodmagic.alchemy_table.removeByOutput(item("minecraft:redstone") * 8)
mods.bloodmagic.alchemy_table.removeByOutput(item("bloodmagic:component", 19) * 2)
mods.bloodmagic.alchemy_table.removeByOutput(item("bloodmagic:component", 20) * 2)
mods.bloodmagic.alchemy_table.removeByOutput(item("essentialcraft:genitem", 51) * 2)
for (def i in 3..7) mods.bloodmagic.alchemy_table.removeByOutput(item("nuclearcraft:dust", i) * 2)
for (def i in 64..72) mods.bloodmagic.alchemy_table.removeByOutput(item("thermalfoundation:material", i) * 2)
mods.bloodmagic.alchemy_table.removeByOutput(item("thermalfoundation:material", 772) * 2)
mods.bloodmagic.alchemy_table.removeByOutput(item("appliedenergistics2:material", 2) * 2)
for (def i in [0, 2]) mods.bloodmagic.alchemy_table.removeByOutput(item("nuclearcraft:gem_dust", i) * 2)
for (def i in [3, 4]) mods.bloodmagic.alchemy_table.removeByOutput(item("qmd:dust", i) * 2)
mods.bloodmagic.alchemy_table.removeByOutput(item("libvulpes:productdust") * 2)
for (def i in [4, 7]) mods.bloodmagic.alchemy_table.removeByOutput(item("actuallyadditions:item_dust", i) * 2)
mods.bloodmagic.alchemy_table.removeByOutput(item("prodigytech:emerald_dust") * 2)

// TODO - ore leacher
// TODO - mass spectrometer
