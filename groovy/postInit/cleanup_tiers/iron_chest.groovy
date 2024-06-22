import classes.GatewayHelpers

// we're also removing silver and copper because they're unnecessary with our ore gen
def goldItems = [item("ironchest:iron_gold_chest_upgrade"), item("ironchest:iron_chest", 1)]
def diamondItems = [item("ironchest:gold_diamond_chest_upgrade"), item("ironchest:iron_chest", 2),
                    item("ironchest:diamond_crystal_chest_upgrade"), item("ironchest:iron_chest", 5)]
def obsidianItems = [item("ironchest:diamond_obsidian_chest_upgrade"), item("ironchest:iron_chest", 6)]
def removedItems = [
    item("ironchest:copper_silver_chest_upgrade"),
    item("ironchest:silver_gold_chest_upgrade"),
    item("ironchest:copper_iron_chest_upgrade"),
    item("ironchest:wood_copper_chest_upgrade"),
    item("ironchest:copper_silver_shulker_upgrade"),
    item("ironchest:silver_gold_shulker_upgrade"),
    item("ironchest:copper_iron_shulker_upgrade"),
    item("ironchest:vanilla_copper_shulker_upgrade"),
    item("ironchest:iron_chest", 3),
    item("ironchest:iron_chest", 4),
]
def removedRecipes = [
    "ironchest:chest/diamond/silver_diamond_chest",
    "ironchest:chest/gold/silver_gold_chest",
    "ironchest:chest/iron/copper_iron_chest",
]
def shulkerItems = [
    item("ironchest:vanilla_iron_shulker_upgrade"),
    item("ironchest:iron_gold_shulker_upgrade"),
    item("ironchest:gold_diamond_shulker_upgrade"),
    item("ironchest:diamond_crystal_shulker_upgrade"),
    item("ironchest:diamond_obsidian_shulker_upgrade"),
]

for (def color in GatewayHelpers.colors) {
    shulkerItems.add(item("ironchest:iron_shulker_box_${color}"))
    shulkerItems.add(item("ironchest:iron_shulker_box_${color}", 1))
    shulkerItems.add(item("ironchest:iron_shulker_box_${color}", 2))
    shulkerItems.add(item("ironchest:iron_shulker_box_${color}", 5))
    shulkerItems.add(item("ironchest:iron_shulker_box_${color}", 6))
    removedItems.add(item("ironchest:iron_shulker_box_${color}", 3))
    removedItems.add(item("ironchest:iron_shulker_box_${color}", 4))

    removedRecipes.add("ironchest:shulker/${color}/diamond/silver_diamond_shulker_box")
    removedRecipes.add("ironchest:shulker/${color}/gold/silver_gold_shulker_box")
    removedRecipes.add("ironchest:shulker/${color}/iron/copper_iron_shulker_box")
}

for (def it in goldItems) GatewayHelpers.setTier(it, 3)
for (def it in diamondItems) GatewayHelpers.setTier(it, 4)
for (def it in obsidianItems) GatewayHelpers.setTier(it, 5)
for (def it in shulkerItems) GatewayHelpers.setTier(it, 6)

for (def it in removedItems) {
    mods.jei.ingredient.hide(it)
    crafting.removeByOutput(it)
}
for (def it in removedRecipes) crafting.remove(it)

