content.createItem("resonating_gem").register()
content.createItem("impure_resonating_gem").register()
content.createItem("starsteel_ingot").register()
content.createItem("incomplete_runic_plate").register()
content.createItem("runic_plate").register()
content.createItem("moonlight_powder").register()
content.createItem("compression_core").register()
content.createItem("transcendental_matrix").register()
content.createItem("transcendental_demon_alloy").register()
content.createItem("purified_brain").register()
content.createItem("crystallized_enlightenment").register()
content.createItem("voidmetal_mesh").register()

def lighten(color, factor) {
    def r = color >> 16,
        g = (color >> 8) & 255,
        b = color & 255
    r = Math.max(0, Math.min(255, r + factor))
    g = Math.max(0, Math.min(255, g + factor))
    b = Math.max(0, Math.min(255, b + factor))
    return (r << 16) + (g << 8) + b
}

def desaturate(color, factor) {
    def r = color >> 16,
        g = (color >> 8) & 255,
        b = color & 255
    r = (int)(r * (1 - factor) + 128 * factor)
    g = (int)(g * (1 - factor) + 128 * factor)
    b = (int)(b * (1 - factor) + 128 * factor)
    return (r << 16) + (g << 8) + b
}

def registerNcoFuel(name, color) {
    content.createItem("${name}_fuel_unprepared").register()
    content.createItem("${name}_fuel").register()
    for (def subname in ["", "_depleted"]) {
        // content.createItem("${subname}_fuel_za").register()
        content.createItem("${name}${subname}_fuel_ox").register()
        // content.createItem("${subname}_fuel_ni").register()
        def desatFactor = subname == "" ? 0 : 0.55
        content.createFluid("${name}${subname}_fuel")
            .setLavaMaterial()
            .setMetalTexture()
            .setColor(desaturate(lighten(color, -70), desatFactor))
            .register()
        content.createFluid("${name}${subname}_fuel_f4")
            .setLavaMaterial()
            .setMetalTexture()
            .setColor(desaturate(color, desatFactor))
            .register()
        content.createFluid("${name}${subname}_fuel_flibe")
            .setLavaMaterial()
            .setMetalTexture()
            .setColor(desaturate(lighten(color, 60), desatFactor))
            .register()
    }
}

registerNcoFuel("natural", 0x55FF55)
registerNcoFuel("arcane", 0xFF55FF)
registerNcoFuel("lunar", 0x5555FF)
registerNcoFuel("skybound", 0x55FFFF)
registerNcoFuel("botanical", 0xFFFF55)
registerNcoFuel("crystalline", 0xFFAA00)
registerNcoFuel("nightmare", 0xFF5555)
