import classes.MachineHelper

// Aurorian Steel
crafting.remove("theaurorian:items/auroriansteel")
MachineHelper.alloy()
    .input(item("theaurorian:crystallineingot"), item("thermalfoundation:material", 160), item("theaurorian:aurorianiteingot"), item("theaurorian:umbraingot"))
    .output(item("theaurorian:auroriansteel") * 4)
    .register()