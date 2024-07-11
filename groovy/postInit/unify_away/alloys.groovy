// priority: -100

import classes.AlloyHelper

// Remove 1-to-1 smelting in Arc Furnace
if (!isReloading()) {
    mods.immersiveengineering.arc_furnace.streamRecipes()
        .filter(r -> r.additives.length == 0)
        .removeAll()
}

// No TConstruct cheese for you
mods.tconstruct.alloying.removeAll()

def iron = item("minecraft:iron_ingot")
def gold = item("minecraft:gold_ingot")
def copper = item("thermalfoundation:material", 128)
def tin = item("thermalfoundation:material", 129)
def silver = item("thermalfoundation:material", 130)
def aluminum = item("thermalfoundation:material", 132)
def nickel = item("thermalfoundation:material", 133)
def steel = item("thermalfoundation:material", 160)

// Constantan
def constantan = item("thermalfoundation:material", 164)
crafting.remove("thermalfoundation:material_3")
AlloyHelper.builder()
    .name("alloy/constantan")
    .output(constantan * 2)
    .input(copper, nickel)
    .time(200)
    .register()

// Invar
def invar = item("thermalfoundation:material", 162)
mods.immersiveengineering.arc_furnace.removeByOutput(invar)
mods.immersiveengineering.alloy_kiln.removeByOutput(invar)
crafting.remove("thermalfoundation:material_1")
AlloyHelper.builder()
    .name("alloy/constantan")
    .output(invar * 3)
    .input(iron * 2, nickel)
    .time(200)
    .register()

// Knightslime, Pig Iron (secondary recipes instead of the removed Smeltery ones)
AlloyHelper.builder()
    .name("alloy/knightslime")
    .output(item("tconstruct:ingots", 3))
    .input(steel, item("tconstruct:edible", 2))
    .time(200)
    .register()

AlloyHelper.builder()
    .name("alloy/pigiron")
    .output(item("tconstruct:ingots", 4))
    .input(iron, item("tconstruct:edible", 3))
    .time(200)
    .register()

// Manyullyn
def manyullyn = item("tconstruct:ingots", 2)
mods.immersiveengineering.arc_furnace.removeByOutput(manyullyn)
AlloyHelper.builder()
    .name("alloy/manyullyn")
    .output(manyullyn * 2)
    .input(item("tconstruct:ingots"), item("tconstruct:ingots", 1))
    .time(200)
    .register()

// Bronze
def bronze = item("thermalfoundation:material", 163)
mods.immersiveengineering.arc_furnace.removeByOutput(bronze)
mods.immersiveengineering.alloy_kiln.removeByOutput(bronze)
crafting.remove("thermalfoundation:material_2")
AlloyHelper.builder()
    .name("alloy/bronze")
    .output(bronze * 4)
    .input(copper * 3, tin)
    .time(200)
    .register()

// Electrum
def electrum = item("thermalfoundation:material", 161)
crafting.remove("thermalfoundation:material")
AlloyHelper.builder()
    .name("alloy/electrum")
    .output(electrum * 2)
    .input(gold, silver)
    .time(200)
    .register()

// Aluminum Brass
def alubrass = item("tconstruct:ingots", 5)
mods.immersiveengineering.arc_furnace.removeByOutput(alubrass)
AlloyHelper.builder()
    .name("alloy/alubrass")
    .output(alubrass * 4)
    .input(copper, aluminum * 3)
    .time(200)
    .register()
