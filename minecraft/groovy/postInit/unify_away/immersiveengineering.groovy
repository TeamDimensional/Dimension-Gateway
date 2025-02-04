// priority: 100

import classes.GatewayHelpers

// Ores
ore("oreCopper").remove(item("immersiveengineering:ore"))
ore("oreAluminum").remove(item("immersiveengineering:ore", 1))
ore("oreLead").remove(item("immersiveengineering:ore", 2))
ore("oreSilver").remove(item("immersiveengineering:ore", 3))
ore("oreNickel").remove(item("immersiveengineering:ore", 4))
ore("oreUranium").remove(item("immersiveengineering:ore", 5))
for (int i in 0..5) GatewayHelpers.hide(item("immersiveengineering:ore", i))

// Blocks & Slabs
ore("blockCopper").remove(item("immersiveengineering:storage"))
ore("blockAluminum").remove(item("immersiveengineering:storage", 1))
ore("blockLead").remove(item("immersiveengineering:storage", 2))
ore("blockSilver").remove(item("immersiveengineering:storage", 3))
ore("blockNickel").remove(item("immersiveengineering:storage", 4))
ore("blockUranium").remove(item("immersiveengineering:storage", 5))
ore("blockConstantan").remove(item("immersiveengineering:storage", 6))
ore("blockElectrum").remove(item("immersiveengineering:storage", 7))
for (def name in ["copper", "aluminum", "lead", "silver", "nickel", "constantan", "uranium", "electrum"]) {
    crafting.remove("immersiveengineering:metal_storage/${name}_block")
    crafting.remove("immersiveengineering:metal_storage/${name}_slab")
    crafting.remove("immersiveengineering:metal_storage/${name}_block_uncraft")
    crafting.remove("immersiveengineering:metal_storage/${name}_slab_back")
}
crafting.remove("immersiveengineering:metal_storage/steel_slab")
crafting.remove("immersiveengineering:metal_storage/steel_slab_back")

crafting.remove("immersiveengineering:metal_storage/uranium_slab")
crafting.remove("immersiveengineering:metal_storage/uranium_slab_back")
for (int i in [0, 1, 2, 3, 4, 5, 6, 7]) GatewayHelpers.hide(item("immersiveengineering:storage", i))
for (int i in 0..8) GatewayHelpers.hide(item("immersiveengineering:storage_slab", i))

// Ingots
for (def name in ["copper", "aluminum", "lead", "silver", "nickel", "constantan", "uranium", "electrum", "iron"]) {
    crafting.remove("immersiveengineering:metal_storage/${name}_ingot")
    crafting.remove("immersiveengineering:metal_storage/${name}_ingot_uncraft")
}
for (int i in 0..7) {
    furnace.removeByOutput(item("immersiveengineering:metal", i))
    GatewayHelpers.hide(item("immersiveengineering:metal", i))
}
mods.immersiveengineering.alloy_kiln.removeByOutput(item("immersiveengineering:metal", 6))
mods.immersiveengineering.alloy_kiln.removeByOutput(item("immersiveengineering:metal", 7))

ore("ingotCopper").remove(item("immersiveengineering:metal"))
ore("ingotAluminum").remove(item("immersiveengineering:metal", 1))
ore("ingotLead").remove(item("immersiveengineering:metal", 2))
ore("ingotSilver").remove(item("immersiveengineering:metal", 3))
ore("ingotNickel").remove(item("immersiveengineering:metal", 4))
ore("ingotUranium").remove(item("immersiveengineering:metal", 5))
ore("ingotConstantan").remove(item("immersiveengineering:metal", 6))
ore("ingotElectrum").remove(item("immersiveengineering:metal", 7))

// Dusts
ore("dustCopper").remove(item("immersiveengineering:metal", 9))
ore("dustAluminum").remove(item("immersiveengineering:metal", 10))
ore("dustLead").remove(item("immersiveengineering:metal", 11))
ore("dustSilver").remove(item("immersiveengineering:metal", 12))
ore("dustNickel").remove(item("immersiveengineering:metal", 13))
ore("dustUranium").remove(item("immersiveengineering:metal", 14))
ore("dustConstantan").remove(item("immersiveengineering:metal", 15))
ore("dustElectrum").remove(item("immersiveengineering:metal", 16))
ore("dustIron").remove(item("immersiveengineering:metal", 18))
ore("dustGold").remove(item("immersiveengineering:metal", 19))

for (int i in [9, 10, 11, 12, 13, 14, 15, 16, 18, 19]) {
    GatewayHelpers.hide(item("immersiveengineering:metal", i))
}
crafting.remove("immersiveengineering:material/dust_electrum")
crafting.remove("immersiveengineering:material/dust_constantan")
for (int i in [18, 19]) furnace.removeByInput(item("immersiveengineering:metal", i))

// Nuggets
ore("nuggetCopper").remove(item("immersiveengineering:metal", 20))
ore("nuggetAluminum").remove(item("immersiveengineering:metal", 21))
ore("nuggetLead").remove(item("immersiveengineering:metal", 22))
ore("nuggetSilver").remove(item("immersiveengineering:metal", 23))
ore("nuggetNickel").remove(item("immersiveengineering:metal", 24))
ore("nuggetUranium").remove(item("immersiveengineering:metal", 25))
ore("nuggetConstantan").remove(item("immersiveengineering:metal", 26))
ore("nuggetElectrum").remove(item("immersiveengineering:metal", 27))
ore("nuggetIron").remove(item("immersiveengineering:metal", 29))
for (int i in [20, 21, 22, 23, 24, 25, 26, 27, 29]) GatewayHelpers.hide(item("immersiveengineering:metal", i))

// Plates
for (def i in ["copper", "aluminum", "lead", "silver", "nickel", "uranium", "constantan", "electrum", "iron", "gold"])
    crafting.remove("immersiveengineering:sheetmetal/${i}_sheetmetal_uncraft")
ore("plateCopper").remove(item("immersiveengineering:metal", 30))
ore("plateAluminum").remove(item("immersiveengineering:metal", 31))
ore("plateLead").remove(item("immersiveengineering:metal", 32))
ore("plateSilver").remove(item("immersiveengineering:metal", 33))
ore("plateNickel").remove(item("immersiveengineering:metal", 34))
ore("plateUranium").remove(item("immersiveengineering:metal", 35))
ore("plateConstantan").remove(item("immersiveengineering:metal", 36))
ore("plateElectrum").remove(item("immersiveengineering:metal", 37))
ore("plateIron").remove(item("immersiveengineering:metal", 39))
ore("plateGold").remove(item("immersiveengineering:metal", 40))
for (int i in [30, 31, 32, 33, 34, 35, 36, 37, 39, 40]) {
    // mods.immersiveengineering.metal_press.removeByOutput(item("immersiveengineering:metal", i))
    GatewayHelpers.hide(item("immersiveengineering:metal", i))
}

// Nitrate and Sulfur
mods.immersiveengineering.crusher.removeByInput(item("minecraft:sandstone"))
mods.immersiveengineering.crusher.recipeBuilder()
    .input(item("minecraft:sandstone:*"))
    .output(item("minecraft:sand") * 2)
    .secondaryOutput(item("thermalfoundation:material", 772), 0.5)
    .register()
mods.immersiveengineering.crusher.recipeBuilder()
    .input(item("minecraft:red_sandstone:*"))
    .output(item("minecraft:sand", 1) * 2)
    .secondaryOutput(item("thermalfoundation:material", 772), 0.5)
    .register()

mods.immersiveengineering.crusher.removeByInput(item("minecraft:blaze_rod"))
mods.immersiveengineering.crusher.recipeBuilder()
    .input(item("minecraft:blaze_rod"))
    .output(item("minecraft:blaze_powder") * 4)
    .secondaryOutput(item("thermalfoundation:material", 771), 0.5)
    .register()

GatewayHelpers.hide(item("immersiveengineering:material", 24))
GatewayHelpers.hide(item("immersiveengineering:material", 25))

// Slag (most work is done in the Steel file)
mods.immersiveengineering.arc_furnace.streamRecipes()
    .filter(recipe -> recipe.slag in item("immersiveengineering:material", 7))
    .removeAll()
ore("crystalSlag").remove(item("immersiveengineering:material", 7))
ore("itemSlag").remove(item("immersiveengineering:material", 7))
GatewayHelpers.hide(item("immersiveengineering:material", 7))
