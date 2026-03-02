import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def magicalTier = [
    item("netherized:netherite_ingot"), item("netherized:netherite_sword"), item("netherized:netherite_shovel"), item("netherized:netherite_pickaxe"),
    item("netherized:netherite_axe"), item("netherized:netherite_hoe"), item("netherized:netherite_helmet"),
    item("netherized:netherite_chestplate"), item("netherized:netherite_leggings"), item("netherized:netherite_boots"),
    item("netherized:netherite_horse_armor"), item("netherized:netherite_block"),
]

def removeRecipeNames = [
    "natura:common/charcoal", "natura:common/string", "natura:common/wool", "natura:common/leather",
    "natura:common/flamestring_to_string",
]

def removeRecipes = [
    item("natura:materials", 4), item("natura:materials", 1), item("natura:materials", 2), item("natura:materials", 5),
    item("netherized:inferno_reactor"), item("natura:sticks", 8), item("natura:overworld_planks", 8), item("natura:overworld_slab2", 3),
    item("natura:overworld_stairs_redwood"), item("natura:overworld_doors", 3), item("natura:overworld_doors", 4),
    item("natura:redwood_button"), item("natura:redwood_pressure_plate"), item("natura:redwood_trap_door"),
    item("natura:redwood_fence"), item("natura:redwood_fence_gate"), item("natura:overworld_bookshelves", 8),
    item("natura:overworld_workbenches", 8),
]

for (def mat in ["bloodwood", "ghostwood", "darkwood", "fusewood", "netherquartz"]) {
    for (def typ in ["sword", "pickaxe", "shovel", "axe", "hoe"]) {
        removeRecipes.add(item("natura:${mat}_${typ}"))
    }
}

def metallurgyTier = [
    item("natura:blaze_rail_golden"), item("natura:blaze_rail_activator"), item("natura:blaze_rail_detector"),
]

def removeFurnace = [
    item("netherized:netherite_scrap"),
]

def hideFromJei = [
    item("ee:projpurp"), item("ee:parasitebomb"), item("ee:crystalball"), item("ee:spinsword"),
    item("ee:lighting_updater"), item("ee:invisible"), item("ee:bomb_proj"), item("ee:green_orb"),
    item("ee:mega_structure_block"), item("ee:door_on"), item("ee:source_on"), item("ee:reverse_on"),
    item("netherized:nether_gold_ore"), item("netherized:ancient_debris"), item("natura:redwood_leaves"), item("natura:redwood_sapling"),
] + removeFurnace + removeRecipes
for (def i in 0..2) hideFromJei.add(item("natura:redwood_logs", i))

def unbreakable = [
    item("ee:disappearing_spawner"), item("ee:ash_spawner"),
]

TooltipEvents.setModTier("ee", 6)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in magicalTier) TooltipEvents.setTier(it, 5)
