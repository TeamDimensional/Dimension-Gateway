//// Tier 10

// Quantum Ring
crafting.removeByOutput(item("appliedenergistics2:quantum_ring"))
crafting.shapedBuilder()
    .name("machines/ae2/quantum_ring")
    .matrix("TLT", "ECD", "TLT")
    .key("T", ore("ingotTitanium"))
    .key("L", item("appliedenergistics2:material", 22))
    .key("D", item("appliedenergistics2:part", 76))
    .key("E", item("appliedenergistics2:material", 24))
    .key("C", item("appliedenergistics2:energy_cell"))
    .output(item("appliedenergistics2:quantum_ring"))
    .register()

// Spatial Pylon
crafting.removeByOutput(item("appliedenergistics2:spatial_pylon"))
crafting.shapedBuilder()
    .name("machines/ae2/spatial_pylon")
    .matrix("GCG", "DFD", "GCG")
    .key("G", item("botania:managlass"))
    .key("C", item("appliedenergistics2:part", 16))
    .key("D", item("appliedenergistics2:material", 8))
    .key("F", item("appliedenergistics2:material", 7))
    .output(item("appliedenergistics2:spatial_pylon"))
    .register()

// Spatial I/O Port
crafting.removeByOutput(item("appliedenergistics2:spatial_io_port"))
crafting.shapedBuilder()
    .name("machines/ae2/spatial_io_port")
    .matrix("GGG", "CPC", "TET")
    .key("G", item("botania:managlass"))
    .key("C", item("appliedenergistics2:part", 16))
    .key("P", item("appliedenergistics2:io_port"))
    .key("T", ore("ingotTitanium"))
    .key("E", item("appliedenergistics2:material", 24))
    .output(item("appliedenergistics2:spatial_io_port"))
    .register()

// ME Controller (idk where the recipe went)
crafting.shapedBuilder()
    .name("machines/ae2/controller")
    .matrix("EAE", "CDC", "EAE")
    .key("D", item("integrateddynamics:logic_director"))
    .key("E", item("thermalfoundation:material", 359))
    .key("A", item("factorytech:machinepart", 170))
    .key("C", item("appliedenergistics2:material", 24))
    .output(item("appliedenergistics2:controller"))
    .register()
TooltipEvents.setTooltip(item("appliedenergistics2:controller"), "Networks consume much more energy than usual! Check out Network Supercharger to satisfy new AE2's needs.")

// Quantum Link Card
mods.nuclearcraft.assembler.builder()
    .input(item("appliedenergistics2:material", 28), item("enderio:item_material", 44) * 2,
           item("appliedenergistics2:material", 47) * 2, item("appliedenergistics2:material", 42) * 32)
    .output(item("appliedenergistics2:material", 59))
    .register()

// Magnet Card
crafting.shapelessBuilder()
    .name("resources/ae2/magnet_card")
    .input(item("appliedenergistics2:material", 25), item("factorytech:machinepart", 130))
    .output(item("appliedenergistics2:material", 60))
    .register()

// Matter Condenser
crafting.removeByOutput(item("appliedenergistics2:condenser"))
crafting.shapedBuilder()
    .name("machines/ae2/matter_condenser")
    .matrix("TGT", "GPG", "TGT")
    .key("T", ore("ingotTitanium"))
    .key("G", item("botania:managlass"))
    .key("P", item("appliedenergistics2:material", 9))
    .output(item("appliedenergistics2:condenser"))
    .register()

// Wireless Booster Card
crafting.removeByOutput(item("appliedenergistics2:material", 42))
mods.nuclearcraft.assembler.builder()
    .input(item("thermalfoundation:material", 295), item("botania:rune", 14), item("botania:rune", 14), item("appliedenergistics2:material", 37))
    .output(item("appliedenergistics2:material", 42))
    .register()

// Job Autocomplete Card
crafting.removeByOutput(item("nae2:upgrade", 1))
crafting.shapelessBuilder()
    .name("resources/ae2/autocomplete_card")
    .input(item("appliedenergistics2:material", 53), item("thermalfoundation:material", 293))
    .output(item("nae2:upgrade", 1))
    .register()

// Extended Pattern Terminal
crafting.removeByOutput(item("appliedenergistics2:part", 341))
mods.nuclearcraft.assembler.builder()
    .input(item("appliedenergistics2:part", 340) * 2, item("botania:rune", 11), item("botania:rune", 11), item("appliedenergistics2:material", 24) * 4)
    .output(item("appliedenergistics2:part", 341))
    .register()
