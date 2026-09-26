import classes.MachineHelper

// Hardened Glass
mods.thermalexpansion.smelter.removeByOutput(item("thermalfoundation:glass", 3))
mods.immersiveengineering.bottling_machine.recipeBuilder()
    .input(item("thermalfoundation:material", 131))
    .fluidInput(fluid("glass") * 1000)
    .output(item("thermalfoundation:glass", 3) * 2)
    .register()

// Primal Mana
mods.immersiveengineering.mixer.recipeBuilder()
    .input(item("thermalfoundation:material", 1024), item("thermalfoundation:material", 1025), item("thermalfoundation:material", 1026), item("thermalfoundation:material", 1027))
    .fluidInput(fluid("enrichedlava") * 500)
    .fluidOutput(fluid("mana") * 500)
    .energy(16000)
    .register()

// Dust crystallization
MachineHelper.crystallization()
    .fluidInput(fluid("pyrotheum") * 250)
    .output(item("thermalfoundation:material", 1024))
    .register()
MachineHelper.crystallization()
    .fluidInput(fluid("cryotheum") * 250)
    .output(item("thermalfoundation:material", 1025))
    .register()
MachineHelper.crystallization()
    .fluidInput(fluid("aerotheum") * 250)
    .output(item("thermalfoundation:material", 1026))
    .register()
MachineHelper.crystallization()
    .fluidInput(fluid("petrotheum") * 250)
    .output(item("thermalfoundation:material", 1027))
    .register()
MachineHelper.crystallization()
    .fluidInput(fluid("mana") * 250)
    .output(item("thermalfoundation:material", 1028))
    .register()
