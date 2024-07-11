// IE High Voltage items
// TODO: "Sky Steel"? Custom item. Ingot of the Skies + some other metals in a smelter

crafting.remove("immersiveengineering:metal_decoration/generator")
/*
crafting.shapedBuilder()
        .name("tier6/generator_block")
        .output(item("immersiveengineering:metal_decoration0", 6) * 2)
        .matrix("SSS", "EGE", "SSS")
        .key("E", ore("blockElectrum")).key("S", ore("ingotSkysteel")).key("G", SomeGeneratorHere)
        .register()
*/

crafting.remove("immersiveengineering:metal_decoration/radiator")
/*
crafting.shapedBuilder()
        .name("tier6/radiator_block")
        .output(item("immersiveengineering:metal_decoration0", 7) * 2)
        .matrix("ScS", "CGC", "ScS")
        .key("C", ore("blockCopper")).key("c", ore("ingotCopper")).key("S", ore("ingotSkysteel")).key("G", SomeKindOfWater)
        .register()
*/

crafting.remove("immersiveengineering:metal_devices/coresample_drill")
/*
coreSampleCircuit = CircuitBuilder.builder()
    .require("logic", 2)
    .require("detection", 1)
    .build()
crafting.shapedBuilder()
        .name("tier6/core_sample_drill")
        .output(item("immersiveengineering:metal_device1", 7))
        .matrix("SFS", "SCS", "EFE")
        .key("S", ore("ingotSkysteel")).key("F", item("immersiveengineering:metal_decoration1"))
        .key("E", item("immersiveengineering:metal_decoration0", 4)).key("C", coreSampleCircuit)
        .register()
*/

crafting.remove("immersiveengineering:wirecoils/wirecoil_hv")
crafting.remove("immersiveengineering:wirecoils/wirecoil_hv2")
/*
crafting.shapedBuilder()
        .name("tier6/hv_coil")
        .output(item("immersiveengineering:wirecoil", 2) * 4)
        .matrix(" W ", "SRS", " W ")
        .key("W", item("immersiveengineering:material", 22)).key("S", ore("ingotSkysteel")).key("R", item("immersiveengineering:material", 2))
        .register()
*/
