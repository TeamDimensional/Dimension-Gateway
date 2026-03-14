// Require crafting for mechanical components and rods
crafting.remove("immersiveengineering:material/component_iron")
crafting.remove("immersiveengineering:material/component_steel")
crafting.remove("immersiveengineering:material/stick_iron")
crafting.remove("immersiveengineering:material/stick_steel")
crafting.remove("immersiveengineering:material/stick_aluminum")

// Engineer's Blueprint (avoid useless crafting components)
crafting.remove("immersiveengineering:blueprints/components")
crafting.shapedBuilder()
        .name("tier3/blueprints/components")
        .output(item("immersiveengineering:blueprint").withNbt(["blueprint": "components"]))
        .matrix(" C ", "LLL", "PPP")
        .key("P", ore("paper")).key("L", ore("dyeBlue")).key("C", ore("plateInvar"))
        .register()

crafting.remove("immersiveengineering:blueprints/common_cartridges")
crafting.shapedBuilder()
        .name("tier3/blueprints/bullet")
        .output(item("immersiveengineering:blueprint").withNbt(["blueprint": "bullet"]))
        .matrix("GCG", "LLL", "PPP")
        .key("P", ore("paper")).key("L", ore("dyeBlue")).key("C", ore("plateCopper")).key("G", item("minecraft:gunpowder"))
        .register()

// Windmill Blade
crafting.remove("immersiveengineering:material/windmill_blade")
crafting.shapedBuilder()
        .mirrored()
        .name("tier3/windmill_blade")
        .output(item("immersiveengineering:material", 11))
        .matrix("PP ", "SSP", "II ")
        .key("P", item("immersiveengineering:treated_wood")).key("S", item("immersiveengineering:material")).key("I", item("immersiveengineering:material", 2))
        .register()

// Windmill Sail
crafting.remove("immersiveengineering:material/windmill_sail")
crafting.shapedBuilder()
        .mirrored()
        .name("tier3/windmill_sail")
        .output(item("immersiveengineering:material", 12))
        .matrix(" SS", "SIS", "SS ")
        .key("S", item("immersiveengineering:material", 5)).key("I", ore("ingotNickel"))
        .register()

// Wooden Grip
crafting.remove("immersiveengineering:material/wooden_grip")
crafting.shapedBuilder()
        .mirrored()
        .name("tier3/wooden_grip")
        .output(item("immersiveengineering:material", 13))
        .matrix("SS", "IS", "SS")
        .key("S", item("immersiveengineering:material")).key("I", ore("ingotSteel"))
        .register()

// Plant oil is not lubricant
crafting.remove("immersiveengineering:toolupgrades/drill_lube")

// Emergency Paddles
crafting.remove("immersivepetroleum:speedboat/emergency_paddles")
crafting.shapedBuilder()
        .mirrored()
        .name("tier3/emergency_paddles")
        .output(item("immersivepetroleum:upgrades", 4))
        .matrix("S S", "S S", "P P")
        .key("S", item("immersiveengineering:material")).key("P", ore("plateSteel"))
        .register()
