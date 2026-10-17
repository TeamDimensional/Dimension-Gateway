// Livingrock Pedestal
crafting.remove("extrabotany:recipe_pedestal")
crafting.shapedBuilder()
    .matrix("LDL", " L ", "LLL")
    .key("L", item("botania:livingrock"))
    .key("D", item("essentialcraft:genitem", 20))
    .output(item("extrabotany:pedestal"))
    .register()

// Power Frame
crafting.remove("extrabotany:recipe_chargepad")
crafting.shapedBuilder()
    .matrix("MMM", "L L", "MLM")
    .key("L", item("botania:livingrock"))
    .key("M", item("botania:manaresource"))
    .output(item("extrabotany:chargepad"))
    .register()
