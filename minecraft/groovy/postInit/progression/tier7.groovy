// Signalum, Lumium, Enderium
crafting.remove("thermalfoundation:dust_signalum")
crafting.remove("thermalfoundation:dust_lumium")
crafting.remove("thermalfoundation:dust_enderium")
// TODO: readd these recipes

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
