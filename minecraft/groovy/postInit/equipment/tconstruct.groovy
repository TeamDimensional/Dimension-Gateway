// Excavate Modifier
crafting.remove("oeintegration:excavate_modifier")
crafting.shapedBuilder()
    .name("tier3/excavation/modifier")
    .mirrored()
    .matrix("IIS", "ISS", "RRI")
    .key("S", ore("ingotSteel")).key("R", item("minecraft:redstone")).key("I", item("prodigytech:inferno_crystal"))
    .output(item("oeintegration:excavatemodifier"))
    .register()

// Tool Forge
crafting.removeByInput(item("tconstruct:tooltables", 3))
crafting.shapedBuilder()
    .name("tier3/tool_forge")
    .output(item("tconstruct:toolforge").withNbt(["textureBlock":["id":"tconstruct:metal","Count":1,"Damage":7]]))
    .matrix("BBB", "ATA", "A A")
    .key("B", ore("blockSeared")).key("A", ore("blockAlumite")).key("T", item("tconstruct:tooltables", 3))
    .register()
