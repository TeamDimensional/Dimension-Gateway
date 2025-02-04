import classes.AlloyHelper

// Energion machines
crafting.remove("prodigytech:machine/atomic_reshaper")
crafting.remove("prodigytech:machine/primordialis_reactor")
/*
atomicCircuit = CircuitBuilder.builder()
    .require("elemental", 3)
    .require("hot_air", 2)
    .require("particle", 1)
    .build()

crafting.shapedBuilder()
        .name("tier11/atomic_reshaper")
        .output(item("prodigytech:atomic_reshaper"))
        .matrix("FGF", "ACA", "FRF")
        .key("F", ore("ingotFerramic")).key("G", item("minecraft:glowstone")).key("A", item("essentialcraft:genitem"))
        .key("C", atomicCircuit).key("R", ore("blockRedstone"))
        .register()

crafting.shapedBuilder()
        .name("tier11/primordialis_reactor")
        .output(item("prodigytech:primordialis_reactor"))
        .matrix("FAF", "PCP", "FPF")
        .key("F", ore("ingotFerramic")).key("P", item("prodigytech:carbon_plate")).key("A", item("essentialcraft:genitem"))
        .key("C", atomicCircuit)
        .register()
*/

crafting.remove("prodigytech:machine/automatic_crystal_cutter")
/*
cutterCircuit = CircuitBuilder.builder()
    .require("hot_air", 2)
    .require("detection", 1)
    .require("logic", 1)
    .build()
crafting.shapedBuilder()
        .name("tier11/crystal_cutter")
        .output(item("prodigytech:automatic_crystal_cutter"))
        .matrix("F F", "FCG", "F F")
        .key("F", ore("ingotFerramic")).key("C", cutterCircuit).key("G", ore("gearFerramic"))
        .register()
*/

crafting.remove("prodigytech:machine/energion_aeroheater")
crafting.remove("prodigytech:machine/tartaric_aeroheater")
/*
energionCircuit = CircuitBuilder.builder()
    .require("elemental", 3)
    .require("hot_air", 2)
    .build()
crafting.shapedBuilder()
        .name("tier11/energion_aeroheater")
        .output(item("prodigytech:energion_aeroheater"))
        .matrix("F F", "RCR", "FfF")
        .key("F", ore("ingotFerramic")).key("C", cutterCircuit).key("R", ore("dustRedstone")).key("f", item("minecraft:furnace"))
        .register()
crafting.shapedBuilder()
        .name("tier11/energion_aeroheater")
        .output(item("prodigytech:tartaric_aeroheater"))
        .matrix("F F", "ZfZ", "ZCZ")
        .key("F", ore("ingotFerramic")).key("C", cutterCircuit).key("Z", ore("ingotZorrasteel")).key("f", item("minecraft:furnace"))
        .register()
*/

crafting.remove("prodigytech:materials/energion_dust")
/*
TODO: research Energion Crystal Growth and make a good recipe for this.
*/

crafting.remove("prodigytech:materials/zorrasteel_raw")
AlloyHelper.builder()
    .name("tier11/zorrasteel")
    .output(item("prodigytech:zorrasteel_raw"))
    .input(item("botania:manaresource"), item("prodigytech:zorra_leaf") * 6)
    .time(300)
    .register()

crafting.remove("prodigytech:tools/crystal_cutter")
crafting.shapedBuilder()
        .name("tier11/crystal_cutter_tool")
        .output(item("prodigytech:crystal_cutter"))
        .matrix("  G", " ID", "S  ")
        .key("G", ore("gearFerramic")).key("I", ore("ingotFerramic")).key("D", item("essentialcraft:genitem", 20)).key("S", ore("stickWood"))
        .register()

// Lavender Quartz
crafting.remove("botania:quartz_3")
mods.prodigytech.atomic_reshaper.recipeBuilder()
    .input(item("botania:quartz", 4))
    .output(item("botania:quartz", 3))
    .primordium(7)
    .register()

// Red Quartz
crafting.remove("botania:quartz_4")
AlloyHelper.builder()
    .input(item("botania:quartz", 2) * 4, item("essentialcraft:elementalfuel"))
    .output(item("botania:quartz", 4) * 4)
    .time(200)
    .register()
