import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def aitem(name, k=0) {
    return item("aether_legacy:${name}", k)
}
def alitem(name, k=0) {
    return item("lost_aether:${name}", k)
}

TooltipEvents.setModTier("aether_legacy", 6)
TooltipEvents.setModTier("lost_aether", 6)

TooltipEvents.setTier(aitem("lore_book"), 1)

for (def tool in ["sword", "pickaxe", "axe", "shovel"]) {
    for (def material in ["skyroot", "holystone", "zanite", "gravitite"]) {
        def toolItem = aitem("${material}_${tool}")
        GatewayHelpers.banTool(toolItem)
        GatewayHelpers.hide(toolItem)
        crafting.removeByOutput(toolItem)
    }
}

def anyDungeonLoot = [
    aitem("gummy_swet"), aitem("gummy_swet", 1)
]

def bronzeDungeonLoot = [
    aitem("swet_cape"), aitem("phoenix_bow"), aitem("flaming_sword"), aitem("lightning_knife"), aitem("valkyrie_lance"),
    aitem("agility_cape"), aitem("sentry_boots"), aitem("notch_hammer"), aitem("dungeon_key"),
]

def silverDungeonLoot = [
    aitem("ascending_dawn"), aitem("lightning_sword"), aitem("valkyrie_axe"), aitem("valkyrie_shovel"), aitem("neptune_helmet"),
    aitem("valkyrie_pickaxe"), aitem("holy_sword"), aitem("valkyrie_helmet"), aitem("regeneration_stone"), aitem("neptune_leggings"),
    aitem("neptune_chestplate"), aitem("neptune_boots"), aitem("neptune_gloves"), aitem("invisibility_cape"),
    aitem("valkyrie_boots"), aitem("valkyrie_gloves"), aitem("valkyrie_leggings"), aitem("valkyrie_chestplate"),
    aitem("valkyrie_cape"), aitem("golden_feather"), aitem("dungeon_key", 1),
]

def goldenDungeonLoot = [
    aitem("iron_bubble"), aitem("vampire_blade"), aitem("pig_slayer"), aitem("obsidian_chestplate"),
    aitem("phoenix_helmet"), aitem("phoenix_chestplate"), aitem("phoenix_boots"), aitem("phoenix_gloves"),
    aitem("phoenix_leggings"), aitem("chain_gloves"), aitem("dungeon_key", 2),
]

def platinumDungeonLoot = [
    alitem("phoenix_pickaxe"), alitem("phoenix_axe"), alitem("phoenix_shovel"), alitem("phoenix_sword"), alitem("phoenix_cape"),
    alitem("sentry_shield"), alitem("invisibility_gem"), alitem("power_gloves"), alitem("swetty_mask"), alitem("agility_boots"),
    alitem("jeb_shield"), alitem("platinum_key"),
]

for (def it in bronzeDungeonLoot) TooltipEvents.setTooltip(it, "Found in the Bronze Dungeon in Aether.")
for (def it in silverDungeonLoot) TooltipEvents.setTooltip(it, "Found in the Silver Dungeon in Aether.")
for (def it in goldenDungeonLoot) TooltipEvents.setTooltip(it, "Found in the Gold Dungeon in Aether.")
for (def it in platinumDungeonLoot) TooltipEvents.setTooltip(it, "Found in the Platinum Dungeon in Aether.")
for (def it in anyDungeonLoot) TooltipEvents.setTooltip(it, "Found in the Bronze and Silver dungeons in Aether.")
TooltipEvents.setTooltip(aitem("repulsion_shield"), "Found in the Bronze and Platinum dungeons in Aether.")
TooltipEvents.setTooltip(aitem("cloud_staff"), "Found in the Bronze and Platinum dungeons in Aether.")
TooltipEvents.setTooltip(aitem("life_shard"), "Found in the Gold and Platinum dungeons in Aether.")
TooltipEvents.setTooltip(aitem("aether_portal_frame"), "Can only be created with a Skyroot Water Bucket.")

// I think this loot should exist, but for some reason it doesn't.
// TODO: readd this to loot tables
def brokenLoot = [
    aitem("obsidian_helmet"), aitem("obsidian_leggings"), aitem("obsidian_boots"), aitem("candy_cane_sword"),
    aitem("obsidian_gloves"),
]
for (def it in brokenLoot) GatewayHelpers.hide(it)
GatewayHelpers.hide(aitem("developer_stick"))
