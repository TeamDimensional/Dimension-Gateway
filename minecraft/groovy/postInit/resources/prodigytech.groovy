import classes.AlloyHelper

// Zorrasteel
crafting.remove("prodigytech:materials/zorrasteel_raw")
AlloyHelper.builder()
    .name("tier7/zorrasteel")
    .output(item("prodigytech:zorrasteel_raw") * 2)
    .input(item("gateway:starsteel_ingot"), item("naturesaura:sky_ingot"), item("prodigytech:zorra_leaf") * 12)
    .time(300)
    .register()

// Circuit Pattern
crafting.remove("prodigytech:placeholder/pattern_circuit_crude_ini")
crafting.shapelessBuilder()
        .name("tier3/circuit_pattern")
        .output(item("prodigytech:pattern_circuit_crude"))
        .input(ore("plateIron"), item("minecraft:paper"))
        .register()
