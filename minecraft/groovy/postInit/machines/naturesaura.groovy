// Gold Fiber
crafting.remove("naturesaura:gold_fiber")
mods.theaurorian.scrapper.recipeBuilder()
    .input(item("thermalfoundation:material", 163))
    .output(item("naturesaura:gold_fiber"))
    .register()

// Bottle and cork
crafting.remove("naturesaura:bottle_two_the_rebottling")
crafting.shapelessBuilder()
        .name("tier2/nature_bottle")
        .output(item("naturesaura:bottle_two_the_rebottling"))
        .input(item("minecraft:glass_bottle"), item("naturesaura:ancient_planks"))
        .register()

// Environmental Eye (required Gold)
mods.naturesaura.ritual.removeByOutput(item("naturesaura:eye"))
mods.naturesaura.ritual.recipeBuilder()
    .name("tier2/env_eye")
    .input(item("minecraft:spider_eye"), ore("ingotCopper"), item("naturesaura:gold_leaf"), item("naturesaura:gold_leaf"))
    .output(item("naturesaura:eye"))
    .time(250)
    .sapling(item("theaurorian:weepingwillowsapling"))
    .register()

// Token of Anger (required Ender pearls)
mods.naturesaura.ritual.removeByOutput(item("naturesaura:token_anger"))
mods.naturesaura.ritual.recipeBuilder()
    .name("tier2/anger")
    .input(item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:nether"]),
           item("naturesaura:gold_leaf"), item("minecraft:blaze_powder"), item("minecraft:magma"),
           item("minecraft:gunpowder"), item("theaurorian:soullessflesh"))
    .output(item("naturesaura:token_anger") * 2)
    .time(200)
    .sapling(item("minecraft:sapling"))
    .register()

// Gold Leaf info
mods.jei.description.add(item("naturesaura:golden_leaves"),
                         ["Spreads to the nearby Leaves blocks when grown.", "Only fully grown Leaves can drop Gold Leaf!"])
mods.jei.description.add(item("naturesaura:gold_leaf"), ["Only fully grown Leaves can drop Gold Leaf!"])

// Natural Altar
mods.naturesaura.ritual.removeByOutput(item("naturesaura:nature_altar"))
mods.naturesaura.ritual.recipeBuilder()
    .name("tier3/nat_altar")
    .input(item("minecraft:stone"), item("minecraft:stone"), item("roots:runic_dust"), item("naturesaura:gold_leaf"),
           item("naturesaura:token_joy"), item("thermalfoundation:material", 160), item("thermalfoundation:material", 162))
    .output(item("naturesaura:nature_altar"))
    .time(250)
    .sapling(item("minecraft:sapling", 2))
    .register()

// Powder of Bountiful Core
bountyPowder = item('naturesaura:effect_powder').withNbt(['effect': 'naturesaura:ore_spawn'])
mods.naturesaura.ritual.removeByOutput(bountyPowder)
mods.naturesaura.ritual.recipeBuilder()
    .name("tier6/bounty_powder")
    .input(item("naturesaura:gold_powder"), item("naturesaura:gold_powder"), item("naturesaura:sky_ingot"), item("minecraft:redstone_ore"))
    .output(bountyPowder * 4)
    .time(250)
    .sapling(item("minecraft:sapling", 1))
    .register()
