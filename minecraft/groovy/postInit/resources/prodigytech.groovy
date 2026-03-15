import classes.AlloyHelper
import classes.MetalworksHelper

// Zorrasteel
crafting.remove("prodigytech:materials/zorrasteel_raw")
AlloyHelper.builder()
    .name("tier5/zorrasteel")
    .output(item("prodigytech:zorrasteel_raw") * 2)
    .input(item("thermalfoundation:material", 160), item("thaumcraft:ingot"), item("prodigytech:zorra_leaf") * 8)
    .time(300)
    .register()

// Circuit Pattern
crafting.remove("prodigytech:placeholder/pattern_circuit_crude_ini")
crafting.shapelessBuilder()
        .name("tier3/circuit_pattern")
        .output(item("prodigytech:pattern_circuit_crude"))
        .input(ore("plateIron"), item("minecraft:paper"))
        .register()

// Circuit Plate
crafting.remove("prodigytech:materials/circuit_plate")
mods.roots.pyre.recipeBuilder()
    .name("tier3/circuit_plate")
    .input(item("immersiveengineering:material", 27), item("minecraft:paper"), ore("dyeGreen"), ore("dyeGreen"), item("minecraft:paper"))
    .output(item("prodigytech:circuit_plate", 3) * 2)
    .time(150)
    .register()

// Circuits
mods.prodigytech.solderer.removeAll()

mods.prodigytech.solderer.recipeBuilder()
    .pattern(item("prodigytech:pattern_circuit_crude"))
    .input(item("thermalfoundation:material", 133))
    .output(item("prodigytech:circuit_crude") * 2)
    .time(100)
    .gold(9)
    .register()

mods.prodigytech.solderer.recipeBuilder()
    .pattern(item("prodigytech:pattern_circuit_refined"))
    .input(item("thaumcraft:ingot"))
    .output(item("prodigytech:circuit_refined"))
    .time(200)
    .gold(9)
    .register()

mods.prodigytech.solderer.recipeBuilder()
    .pattern(item("prodigytech:pattern_circuit_perfected"))
    .input(ore("ingotEnchantedMetal"))
    .output(item("prodigytech:circuit_perfected"))
    .time(300)
    .gold(18)
    .register()

// Carbon Plate
crafting.remove("prodigytech:materials/carbon_plate")
mods.immersiveengineering.metal_press.removeByOutput(item("prodigytech:carbon_plate"))
mods.thermalexpansion.compactor.removeByOutput(item("prodigytech:carbon_plate"))
MetalworksHelper.builder()
    .plate()
    .input(item("immersiveengineering:material", 17) * 4)
    .output(item("prodigytech:carbon_plate"))
    .register()
