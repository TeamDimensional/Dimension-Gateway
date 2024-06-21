import classes.GatewayHelpers

for (def material in ["wooden", "stone", "iron", "golden", "diamond"]) {
    for (def type in ["shovel", "pickaxe", "axe", "sword", "hoe"]) {
        GatewayHelpers.banTool(item("minecraft:${material}_${type}"))
    }
}
