// Pulse Piston
crafting.removeByOutput(item("factorytech:itempusher"))
crafting.shapedBuilder()
    .name("tier3/ft/pulse_piston")
    .mirrored()
    .output(item("factorytech:itempusher"))
    .matrix(" R ", "GPQ", " R ")
    .key("R", item("minecraft:redstone")).key("G", item("minecraft:glowstone_dust")).key("Q", item("minecraft:quartz")).key("P", item("minecraft:piston"))
    .register()

// Lift Receiver
crafting.removeByOutput(item("factorytech:bottomhatch"))
crafting.shapedBuilder()
    .name("tier3/ft/lift_receiver")
    .mirrored()
    .output(item("factorytech:bottomhatch"))
    .matrix("PPI", "S P", "PSP")
    .key("P", ore("plankWood")).key("S", ore("stickWood")).key("I", ore("ingotInvar"))
    .register()

// Wrench
crafting.removeByOutput(item("factorytech:wrench"))
crafting.shapedBuilder()
    .name("tier3/ft/wrench")
    .mirrored()
    .output(item("factorytech:wrench"))
    .matrix("IP", "IP", " P")
    .key("P", ore("plankWood")).key("I", ore("ingotInvar"))
    .register()

// Pipe
crafting.remove("factorytech:automation/pipe")
crafting.shapedBuilder()
    .name("tier3/ft/pipe")
    .output(item("factorytech:pipe") * 8)
    .matrix("IPI")
    .key("I", ore("ingotCopper")).key("P", ore("plateCopper")).register()
