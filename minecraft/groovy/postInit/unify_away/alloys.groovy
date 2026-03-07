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

def steel = item("thermalfoundation:material", 160)
def invar = item("thermalfoundation:material", 162)

// Invar, Bronze, Constantan
crafting.remove("thermalfoundation:material_1")
crafting.remove("thermalfoundation:material_2")
crafting.remove("thermalfoundation:material_3")

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
    .input(invar, item("tconstruct:edible", 3))
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
