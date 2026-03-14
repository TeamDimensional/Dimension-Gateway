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
