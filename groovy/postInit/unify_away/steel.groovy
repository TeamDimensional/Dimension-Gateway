// priority: 101

import classes.GatewayHelpers

// Removing every IE steel item except for Steel Block, removing ThF steel block
crafting.remove("immersiveengineering:metal_storage/steel_ingot")
crafting.remove("immersiveengineering:metal_storage/steel_ingot_uncraft")
crafting.remove("immersiveengineering:metal_storage/steel_block")
crafting.remove("immersiveengineering:metal_storage/steel_block_uncraft")
crafting.remove("immersiveengineering:sheetmetal/steel_sheetmetal_uncraft")
crafting.remove("thermalfoundation:storage_alloy")
furnace.removeByInput(item("immersiveengineering:metal", 17))

ore("ingotSteel").remove(item("immersiveengineering:metal", 8))
ore("dustSteel").remove(item("immersiveengineering:metal", 17))
ore("nuggetSteel").remove(item("immersiveengineering:metal", 28))
ore("plateSteel").remove(item("immersiveengineering:metal", 38))
ore("blockSteel").remove(item("thermalfoundation:storage_alloy"))

mods.immersiveengineering.blast_furnace.removeByOutput(item("immersiveengineering:metal", 8))
mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(item("minecraft:iron_ingot"))
    .output(item("thermalfoundation:material", 160))
    .time(1200)
    .slag(item("thermalfoundation:material", 864))
    .register()

mods.immersiveengineering.blast_furnace.removeByOutput(item("immersiveengineering:storage", 8))
mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(item("minecraft:iron_block"))
    .output(item("immersiveengineering:storage", 8))
    .time(9600)
    .slag(item("thermalfoundation:material", 864) * 9)
    .register()

// mods.immersiveengineering.arc_furnace.removeByOutput(item("immersiveengineering:metal", 8))
mods.immersiveengineering.arc_furnace.recipeBuilder()
    .input(item("minecraft:iron_ingot"), item("immersiveengineering:material", 17))
    .output(item("thermalfoundation:material", 160) * 2)
    .time(400)
    .energyPerTick(512)
    .slag(item("thermalfoundation:material", 864))
    .register()

// Tinker sucks
mods.tconstruct.casting_basin.removeByInput(fluid("steel"))
mods.tconstruct.casting_basin.recipeBuilder()
    .fluidInput(fluid("steel") * 1296)
    .output(item("immersiveengineering:storage", 8))
    .coolingTime(324)
    .register()

// Need to readd steel block
crafting.shapedBuilder()
    .name("unify/steelblock")
    .output(item("immersiveengineering:storage", 8))
    .matrix("SSS", "SSS", "SSS")
    .key("S", ore("ingotSteel"))
    .register()

GatewayHelpers.hide(item("immersiveengineering:metal", 8))
GatewayHelpers.hide(item("immersiveengineering:metal", 17))
GatewayHelpers.hide(item("immersiveengineering:metal", 28))
GatewayHelpers.hide(item("immersiveengineering:metal", 38))
GatewayHelpers.hide(item("thermalfoundation:storage_alloy"))

// Remove ThF coke
ore("fuelCoke").remove(item("thermalfoundation:material", 802))
ore("blockFuelCoke").remove(item("thermalfoundation:storage_resource", 1))
GatewayHelpers.hide(item("thermalfoundation:material", 802))
GatewayHelpers.hide(item("thermalfoundation:storage_resource", 1))
crafting.remove("thermalfoundation:material_802")
crafting.remove("thermalfoundation:storage_resource_1")
