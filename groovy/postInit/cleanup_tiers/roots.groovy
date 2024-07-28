import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def wildwoodItems = [item("roots:runed_wildwood"), item("roots:wildroot_rune"), item("roots:bark_wildwood")]
for (itemType in ["door", "leaves", "log", "planks", "trapdoor", "fence", "fence_gate", "ladder", "slab", "stairs",
              "wall", "button", "pressure_plate"])
    wildwoodItems.add(item("roots:wildwood_${itemType}"))

def rootsPlants = [
    item("roots:baffle_cap_mushroom"), item("roots:moonglow_seed"), item("roots:moonglow_leaf"),
    item("roots:pereskia_bulb"), item("roots:pereskia"), item("roots:spirit_herb_seed"), item("roots:spirit_herb"),
    item("roots:wildewheet"), item("roots:wildewheet_seed"), item("roots:cloud_berry"), item("roots:infernal_bulb"),
    item("roots:dewgonia"), item("roots:stalicripe"), item("roots:cooked_pereskia"), item("roots:wildewheet_bread"),
]

def spells = [
    item("roots:gramary"), item("roots:imbuer"), item("roots:imposer"), item("roots:spell_icon"),
    item("roots:spell_modifier"), item("roots:fey_pouch"), item("roots:herb_pouch"),
    item("roots:component_pouch"), item("roots:apothecary_pouch"), item("roots:spell_dust"), item("roots:staff"),
]

def feyCrafting = [
    item("roots:runic_dust"), item("roots:fey_leather"), item("roots:mystic_feather"), item("roots:strange_ooze"),
    item("roots:runic_shears"), item("roots:life_essence"), item("roots:chiseled_runestone"),
    item("roots:runestone_trample"), item("roots:catalyst_plate"), item("roots:unending_bowl"),
    item("roots:grove_stone"), item("roots:fey_crafter")
] + rootsPlants + wildwoodItems
for (soilType in ["", "_water", "_air", "_earth", "_fire"])
    feyCrafting.add(item("roots:elemental_soil${soilType}"))
for (variant in ["", "_brick", "_brick_alt"])
    for (itemType in ["", "_slab", "_stairs", "_wall", "_button", "_pressure_plate"])
        feyCrafting.add(item("roots:runestone${variant}${itemType}"))
for (ritual in ["heavy_storms", "divine_protection", "fire_storm", "spreading_forest", "windwall",
                "warding_protection", "germination", "purity", "frost_lands", "animal_harvest",
                "summon_creatures", "wildroot_growth", "transmutation", "gathering", "grove_supplication"])
    feyCrafting.add(item("roots:ritual_${ritual}"))

def goldItems = [
    item("roots:gold_knife"),
]

def gemstoneItems = [
    item("roots:terrastone_pickaxe"), item("roots:terrastone_axe"),
    item("roots:terrastone_shovel"), item("roots:terrastone_hoe"), item("roots:terrastone_sword"), item("roots:living_pickaxe"),
    item("roots:living_axe"), item("roots:living_shovel"), item("roots:living_sword"), item("roots:living_hoe"),
    item("roots:living_arrow"), item("roots:apothecary_pouch"), item("roots:wildwood_quiver"), item("roots:wildwood_bow"),
    item("roots:sylvan_helmet"), item("roots:sylvan_chestplate"), item("roots:sylvan_leggings"), item("roots:sylvan_boots"),
    item("roots:wildwood_helmet"), item("roots:wildwood_chestplate"), item("roots:wildwood_leggings"), item("roots:wildwood_boots"),
    item("roots:diamond_knife"),
]

def obsidianItems = [
    item("roots:reinforced_pyre"), item("roots:reinforced_catalyst_plate"),
    item("roots:runed_pickaxe"), item("roots:runed_axe"), item("roots:runed_hoe"), item("roots:runed_sword"),
    item("roots:runed_shovel"), item("roots:runed_dagger"), item("roots:chiseled_runed_obsidian")
]
for (variant in ["", "_brick", "_brick_alt"])
    for (itemType in ["", "_slab", "_stairs", "_wall", "_button", "_pressure_plate"])
        obsidianItems.add(item("roots:runed_obsidian${variant}${itemType}"))

def industrialTier = [item("roots:runic_crafter")]
def creativeItems = [item("roots:creative_pouch")]
def removeFromFey = [item("roots:salmon_of_knowledge")]
def removeFromShearing = [item("roots:spirit_bag")]
def removeFromCrafting = [item("roots:wooden_shears"), item("roots:fire_starter")]

def hideFromJei = [
    item("roots:reliquary"), item("roots:baffle_cap_huge_stem"), item("roots:baffle_cap_huge_top"),
    item("roots:fey_fire"), item("roots:wildwood_sapling"), item("roots:spell_dust"),
    item("roots:spirit_bag"), item("roots:reliquary"),
] + removeFromFey + removeFromShearing + removeFromCrafting

for (def it in feyCrafting) TooltipEvents.setTier(it, 3)
for (def it in goldItems) TooltipEvents.setTier(it, 3)
for (def it in spells) TooltipEvents.setTier(it, 4)
for (def it in gemstoneItems) TooltipEvents.setTier(it, 4)
for (def it in obsidianItems) TooltipEvents.setTier(it, 5)
for (def it in industrialTier) TooltipEvents.setTier(it, 11)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeFromCrafting) crafting.removeByOutput(it)
for (def it in removeFromFey) mods.roots.fey_crafter.removeByOutput(it)
for (def it in removeFromShearing) mods.roots.runic_shear_entity.removeByOutput(it)

mods.jei.description.remove(item("roots:wildwood_sapling"))
mods.jei.category.remove("roots.loot")
mods.jei.catalyst.remove("roots.pyre_light", item("roots:fire_starter"))

// NOTE: remove firestarter catalyst
/*
recipes needed:
- Baffle Cap (tier 1 -> tier 3)
- Moonglow (tier 2 -> tier 3)
- Cloud Berry (tier 1 -> tier 3)
- Infernal Bulb (tier 1 -> tier 3)
- Dewgonia (tier 2 -> tier 3)
- Herb Pouch (tier 1 -> tier 4)
- Component Pouch (tier 3 -> tier 4)
- Creative Component Pouch (tier 17)
- Gramary of the Forests (tier 1 -> tier 4)
- Runestone (patch up the recipe)
- Runic Crafter (tier 3 -> tier 11)
- spells (various tiers -> tier 4)
- Ritual: summon creatures (remove eggs, tier 1 -> tier 3)
- Ritual: grove supplication (tier 3)
*/
