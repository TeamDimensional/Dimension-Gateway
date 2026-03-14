// Runestone
mods.roots.fey_crafter.removeByOutput(item("roots:runestone"))
mods.roots.fey_crafter.recipeBuilder()
    .name("tier2/runestone")
    .input(item("minecraft:stone"), item("minecraft:stone"), item("minecraft:stone"), item("minecraft:blaze_powder"), item("minecraft:dye", 4))
    .output(item("roots:runestone") * 6)
    .register()

//// Plants
// Baffle Cap
mods.roots.pyre.removeByOutput(item("roots:baffle_cap_mushroom"))
mods.roots.pyre.recipeBuilder()
    .name("tier2/baffle_cap")
    .input(item("theaurorian:soullessflesh"), item("roots:terra_moss"), item("minecraft:wheat_seeds"), item("minecraft:brown_mushroom"), item("theaurorian:mushroomsmall"))
    .output(item("roots:baffle_cap_mushroom") * 3)
    .time(200)
    .register()

// Pereskia
mods.roots.pyre.removeByOutput(item("roots:pereskia"))
mods.roots.pyre.recipeBuilder()
    .name("tier2/pereskia")
    .input(item("minecraft:melon"), item("roots:wildroot"), item("theaurorian:crystal"), item("minecraft:reeds"), item("minecraft:beetroot"))
    .output(item("roots:pereskia") * 3)
    .time(200)
    .register()

// Cloud Berry
mods.roots.pyre.removeByOutput(item("roots:cloud_berry"))
mods.roots.pyre.recipeBuilder()
    .name("tier2/cloud_berry")
    .input(ore("tallgrass"), ore("treeLeaves"), item("theaurorian:silkberry"), item("naturesaura:gold_leaf"), item("roots:terra_moss"))
    .output(item("roots:cloud_berry") * 3)
    .time(200)
    .register()

// Dewgonia
mods.roots.pyre.removeByOutput(item("roots:dewgonia"))
mods.roots.pyre.recipeBuilder()
    .name("tier2/dewgonia")
    .input(ore("tallgrass"), item("minecraft:sugar"), item("roots:terra_moss"), item("minecraft:waterlily"), item("minecraft:dye", 4))
    .output(item("roots:dewgonia") * 3)
    .time(200)
    .register()

// Infernal Bulb
mods.roots.pyre.removeByOutput(item("roots:infernal_bulb"))
mods.roots.pyre.recipeBuilder()
    .name("tier2/infernal_bulb")
    .input(item("minecraft:magma_cream"), item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:nether"]),
           ore("ingotCopper"), item("roots:bark_wildwood"), item("minecraft:glowstone_dust"))
    .output(item("roots:infernal_bulb") * 3)
    .time(200)
    .register()

// Stalicripe
mods.roots.pyre.removeByOutput(item("roots:stalicripe"))
mods.roots.pyre.recipeBuilder()
    .name("tier2/stalicripe")
    .input(item("minecraft:stone"), item("minecraft:flint"), ore("ingotIron"), ore("ingotTin"), item("roots:wildroot"))
    .output(item("roots:stalicripe") * 3)
    .time(200)
    .register()
