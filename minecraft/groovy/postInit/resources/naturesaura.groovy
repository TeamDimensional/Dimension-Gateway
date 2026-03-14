// Gold Powder
crafting.remove("naturesaura:gold_powder")
inWorldCrafting.pistonPush.recipeBuilder()
    .input(item("naturesaura:gold_leaf"))
    .output(item("naturesaura:gold_powder"))
    .minHarvestLevel(1)
    .maxConversionsPerPush(16)
    .register()

// Gold Fiber
crafting.remove("naturesaura:gold_fiber")
mods.theaurorian.scrapper.recipeBuilder()
    .input(item("thermalfoundation:material", 163))
    .output(item("naturesaura:gold_fiber"))
    .register()

// Gold Leaf info
mods.jei.description.add(item("naturesaura:golden_leaves"),
                         ["Spreads to the nearby Leaves blocks when grown.", "Only fully grown Leaves can drop Gold Leaf!"])
mods.jei.description.add(item("naturesaura:gold_leaf"), ["Only fully grown Leaves can drop Gold Leaf!"])

// Tokens
mods.naturesaura.ritual.removeByOutput(item("naturesaura:token_anger"))
mods.naturesaura.ritual.recipeBuilder()
    .name("tier2/anger")
    .input(item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:nether"]),
           item("naturesaura:gold_leaf"), item("minecraft:blaze_powder"), item("minecraft:magma"),
           item("minecraft:gunpowder"), item("theaurorian:soullessflesh"),
           item("roots:infernal_bulb"), item("roots:pereskia"))
    .output(item("naturesaura:token_anger") * 2)
    .time(200)
    .sapling(item("minecraft:sapling"))
    .register()

mods.naturesaura.ritual.removeByOutput(item("naturesaura:token_fear"))
mods.naturesaura.ritual.recipeBuilder()
    .name("tier2/fear")
    .input(item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:nether"]),
           item("naturesaura:gold_leaf"), item("minecraft:rotten_flesh"), item("minecraft:feather"),
           item("minecraft:bone"), item("minecraft:soul_sand"),
           item("roots:wildewheet"), item("roots:stalicripe"))
    .output(item("naturesaura:token_fear") * 2)
    .time(200)
    .sapling(item("minecraft:sapling"))
    .register()

mods.naturesaura.ritual.removeByOutput(item("naturesaura:token_joy"))
mods.naturesaura.ritual.recipeBuilder()
    .name("tier2/joy")
    .input(item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:overworld"]),
           item("naturesaura:gold_leaf"), ore("allFlowers"), item("minecraft:apple"),
           item("minecraft:torch"), item("minecraft:iron_ingot"),
           item("roots:cloud_berry"), item("roots:dewgonia"))
    .output(item("naturesaura:token_joy") * 2)
    .time(200)
    .sapling(item("minecraft:sapling"))
    .register()

def anyMeat = item("minecraft:beef") | item("minecraft:porkchop") | item("minecraft:chicken") | item("minecraft:mutton")
def anyFish = ore("fish")

mods.naturesaura.ritual.removeByOutput(item("naturesaura:token_sorrow"))
mods.naturesaura.ritual.recipeBuilder()
    .name("tier2/sorrow")
    .input(item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:overworld"]),
           item("naturesaura:gold_leaf"), item("minecraft:ghast_tear"), anyMeat,
           item("minecraft:glass"), anyFish,
           item("roots:fey_leather"), item("roots:spirit_herb"))
    .output(item("naturesaura:token_sorrow") * 2)
    .time(200)
    .sapling(item("minecraft:sapling"))
    .register()
