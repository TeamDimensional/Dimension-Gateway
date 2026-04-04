import classes.AlloyHelper

// Remove items that are made in Lithographic Etcher
crafting.remove("opencomputers:material35")
furnace.removeByInput(item("opencomputers:material", 2))

// Cable
crafting.remove("opencomputers:cable2")
crafting.shapedBuilder()
    .matrix(" N ", "NRN", " N ")
    .key("N", item("thermalfoundation:material", 229))
    .key("R", item("appliedenergistics2:material", 45))
    .output(item("opencomputers:cable") * 16)
    .register()

// Chamelium
crafting.remove("opencomputers:material54")
mods.factorytech.agitator.recipeBuilder()
    .input(item("thermalfoundation:material", 800))
    .fluidInput(fluid("slime") * 288)
    .fluidInput(fluid("redstone") * 300)
    .output(item("opencomputers:material", 28) * 16)
    .register()

// Disk Platter
crafting.remove("opencomputers:material41")
crafting.shapedBuilder()
    .matrix(" N ", "N N", " N ")
    .key("N", item("thermalfoundation:material", 230))
    .output(item("opencomputers:material", 12))
    .register()

// Interweb
crafting.remove("opencomputers:material42")
AlloyHelper.builder()
    .minTier(2)
    .input(item("minecraft:web"), item("minecraft:ender_pearl"))
    .output(item("opencomputers:material", 13))
    .time(100)
    .register()

// Keyboard
crafting.remove("opencomputers:keyboard14")
mods.factorytech.agitator.recipeBuilder()
    .input(item("calculator:calculatorassembly"))
    .fluidInput(fluid("silicon") * 288)
    .output(item("opencomputers:keyboard"))
    .register()

// Diamond Chip stuff -> replaced from the user.recipes file

// Grog
crafting.remove("opencomputers:material32")
mods.thermalexpansion.centrifuge.recipeBuilder()
    .input(item("soot:mug").withNbt(["Fluid": ["Amount": 250, "FluidName": "absinthe"]]))
    .output(item("soot:mug"), item("opencomputers:material", 1))
    .chance(100, 25)
    .register()
