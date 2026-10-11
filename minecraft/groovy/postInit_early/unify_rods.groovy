def rods = [
    // Rod, Ingot, Fluid, Config
    [item("advancedrocketry:productrod"), item("advancedrocketry:productingot"), fluid("titanium_aluminide") * 72, "strong"],
    [item("advancedrocketry:productrod", 1), item("advancedrocketry:productingot", 1), null, "strong"],
    [item("immersiveengineering:material", 1), item("minecraft:iron_ingot"), fluid("iron") * 72, "metal"],
    [item("immersiveengineering:material", 2), item("thermalfoundation:material", 160), fluid("steel") * 72, "metal"],
    [item("immersiveengineering:material", 3), item("thermalfoundation:material", 132), fluid("aluminum") * 72, "metal"],
    [item("libvulpes:productrod", 4), item("thermalfoundation:material", 128), fluid("copper") * 72, "metal"],
    [item("libvulpes:productrod", 7), item("libvulpes:productingot", 7), fluid("titanium") * 72, "strong"],
    [item("libvulpes:productrod", 10), item("thermalfoundation:material", 135), fluid("iridium") * 72, "strong"],
]

// Clean up involved categories
mods.advancedrocketry.lathe.removeAll()
mods.immersiveengineering.metal_press.removeByMold(item("immersiveengineering:mold", 2))
def removeStamping = [item("libvulpes:productrod", 1), item("libvulpes:productrod", 4), item("libvulpes:productrod", 6)]
for (def x in removeStamping) {
    mods.embers.stamper.removeByOutput(x)
}

for (def x in rods) {
    def rod = x[0]
    def ingot = x[1]
    def liquid = x[2]
    def category = x[3]

    def doImmersive = category == "metal" || category == "dust"
    def doEmbers = (category == "metal" || category == "strong") && liquid != null
    def doLathe = category == "metal" || category == "strong"

    if (doImmersive) {
        mods.immersiveengineering.metal_press.recipeBuilder()
            .mold(item("immersiveengineering:mold", 2))
            .input(ingot)
            .output(rod * 2)
            .energy(2000)
            .register()
    }
    if (doLathe) {
        mods.advancedrocketry.rolling_machine.recipeBuilder()
            .input(ingot * 4)
            .output(rod * 8)
            .power(500)
            .time(60)
            .register()
    }
    if (doEmbers) {
        mods.embers.stamper.recipeBuilder()
            .stamp(item("embers:stamp_rod"))
            .fluidInput(liquid)
            .output(rod * 2)
            .register()
    }
}
