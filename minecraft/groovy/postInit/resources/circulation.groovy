// Sourceflow Crystal
crafting.remove("circulation_networks:sourceflow_crystal")
mods.calculator.atomic_calculator.recipeBuilder()
    .input(item("actuallyadditions:item_crystal", 1), item("gateway:starsteel_ingot"), item("actuallyadditions:item_crystal"))
    .output(item("circulation_networks:sourceflow_crystal") * 3)
    .register()

// Netherforged Crystal
crafting.remove("circulation_networks:netherforged_crystal")
mods.embers.alchemy.addAspect("nether", item("thaumicaugmentation:augment_builder_power").withNbt(["id":"thaumicaugmentation:strength_nether"]))
mods.embers.alchemy.recipeBuilder()
    .input(item("circulation_networks:sourceflow_crystal"), item("minecraft:quartz"), item("minecraft:netherbrick"))
    .output(item("circulation_networks:netherforged_crystal") * 2)
    .setAspect("nether", 4, 10)
    .register()

// Endercore Crystal
crafting.remove("circulation_networks:endercore_crystal")
// TODO: figure out if alchemy like this even works or no. it certainly doesn't work in JEI.
mods.embers.alchemy.addAspect("ender", item("thaumicaugmentation:augment_builder_power").withNbt(["id":"thaumicaugmentation:strength_end"]))
mods.embers.alchemy.recipeBuilder()
    .input(item("circulation_networks:sourceflow_crystal"), item("minecraft:dragon_breath"), item("minecraft:ender_pearl"))
    .output(item("circulation_networks:endercore_crystal") * 2)
    .setAspect("ender", 4, 10)
    .register()
