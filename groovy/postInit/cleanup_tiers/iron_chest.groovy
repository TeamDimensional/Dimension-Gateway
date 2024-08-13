import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("ironchest:${name}", k)
}

// we're also removing silver and copper because they're unnecessary with our ore gen
def goldItems = [mitem("iron_gold_chest_upgrade"), mitem("iron_chest", 1)]
def diamondItems = [mitem("gold_diamond_chest_upgrade"), mitem("iron_chest", 2),
                    mitem("diamond_crystal_chest_upgrade"), mitem("iron_chest", 5)]
def obsidianItems = [mitem("diamond_obsidian_chest_upgrade"), mitem("iron_chest", 6)]
def removedItems = [
    mitem("copper_silver_chest_upgrade"), mitem("silver_gold_chest_upgrade"), mitem("copper_iron_chest_upgrade"),
    mitem("wood_copper_chest_upgrade"), mitem("copper_silver_shulker_upgrade"), mitem("silver_gold_shulker_upgrade"),
    mitem("copper_iron_shulker_upgrade"), mitem("vanilla_copper_shulker_upgrade"), mitem("iron_chest", 3), mitem("iron_chest", 4),
]
def removedRecipes = [
    "ironchest:chest/diamond/silver_diamond_chest", "ironchest:chest/gold/silver_gold_chest", "ironchest:chest/iron/copper_iron_chest",
]
def shulkerItems = [
    mitem("vanilla_iron_shulker_upgrade"), mitem("iron_gold_shulker_upgrade"), mitem("gold_diamond_shulker_upgrade"),
    mitem("diamond_crystal_shulker_upgrade"), mitem("diamond_obsidian_shulker_upgrade"),
]

for (def color in GatewayHelpers.colors) {
    shulkerItems.add(mitem("iron_shulker_box_${color}"))
    shulkerItems.add(mitem("iron_shulker_box_${color}", 1))
    shulkerItems.add(mitem("iron_shulker_box_${color}", 2))
    shulkerItems.add(mitem("iron_shulker_box_${color}", 5))
    shulkerItems.add(mitem("iron_shulker_box_${color}", 6))
    removedItems.add(mitem("iron_shulker_box_${color}", 3))
    removedItems.add(mitem("iron_shulker_box_${color}", 4))

    removedRecipes.add("ironchest:shulker/${color}/diamond/silver_diamond_shulker_box")
    removedRecipes.add("ironchest:shulker/${color}/gold/silver_gold_shulker_box")
    removedRecipes.add("ironchest:shulker/${color}/iron/copper_iron_shulker_box")
}

for (def it in goldItems) TooltipEvents.setTier(it, 3)
for (def it in diamondItems) TooltipEvents.setTier(it, 4)
for (def it in obsidianItems) TooltipEvents.setTier(it, 5)
for (def it in shulkerItems) TooltipEvents.setTier(it, 6)

for (def it in removedItems) {
    GatewayHelpers.hide(it)
    crafting.removeByOutput(it)
}
for (def it in removedRecipes) crafting.remove(it)

