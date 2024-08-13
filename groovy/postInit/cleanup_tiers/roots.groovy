import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("roots:${name}", k)
}

def wildwoodItems = [mitem("runed_wildwood"), mitem("wildroot_rune"), mitem("bark_wildwood")]
for (itemType in ["door", "leaves", "log", "planks", "trapdoor", "fence", "fence_gate", "ladder", "slab", "stairs",
              "wall", "button", "pressure_plate"])
    wildwoodItems.add(mitem("wildwood_${itemType}"))

def rootsPlants = [
    mitem("baffle_cap_mushroom"), mitem("moonglow_seed"), mitem("moonglow_leaf"), mitem("pereskia_bulb"), mitem("pereskia"),
    mitem("spirit_herb_seed"), mitem("spirit_herb"), mitem("wildewheet"), mitem("wildewheet_seed"), mitem("cloud_berry"), mitem("infernal_bulb"),
    mitem("dewgonia"), mitem("stalicripe"), mitem("cooked_pereskia"), mitem("wildewheet_bread"),
]

def spells = [
    mitem("gramary"), mitem("imbuer"), mitem("imposer"), mitem("spell_icon"), mitem("spell_modifier"), mitem("fey_pouch"), mitem("herb_pouch"),
    mitem("component_pouch"), mitem("apothecary_pouch"), mitem("spell_dust"), mitem("staff"),
]

def feyCrafting = [
    mitem("runic_dust"), mitem("fey_leather"), mitem("mystic_feather"), mitem("strange_ooze"),
    mitem("runic_shears"), mitem("life_essence"), mitem("chiseled_runestone"), mitem("runestone_trample"), mitem("catalyst_plate"), mitem("unending_bowl"),
    mitem("grove_stone"), mitem("fey_crafter")
] + rootsPlants + wildwoodItems
for (soilType in ["", "_water", "_air", "_earth", "_fire"])
    feyCrafting.add(mitem("elemental_soil${soilType}"))
for (variant in ["", "_brick", "_brick_alt"])
    for (itemType in ["", "_slab", "_stairs", "_wall", "_button", "_pressure_plate"])
        feyCrafting.add(mitem("runestone${variant}${itemType}"))
for (ritual in ["heavy_storms", "divine_protection", "fire_storm", "spreading_forest", "windwall",
                "warding_protection", "germination", "purity", "frost_lands", "animal_harvest",
                "summon_creatures", "wildroot_growth", "transmutation", "gathering", "grove_supplication"])
    feyCrafting.add(mitem("ritual_${ritual}"))

def goldItems = [
    mitem("gold_knife"),
]

def gemstoneItems = [
    mitem("terrastone_pickaxe"), mitem("terrastone_axe"), mitem("terrastone_shovel"), mitem("terrastone_hoe"), mitem("terrastone_sword"),
    mitem("living_pickaxe"), mitem("living_axe"), mitem("living_shovel"), mitem("living_sword"), mitem("living_hoe"),
    mitem("living_arrow"), mitem("apothecary_pouch"), mitem("wildwood_quiver"), mitem("wildwood_bow"),
    mitem("sylvan_helmet"), mitem("sylvan_chestplate"), mitem("sylvan_leggings"), mitem("sylvan_boots"),
    mitem("wildwood_helmet"), mitem("wildwood_chestplate"), mitem("wildwood_leggings"), mitem("wildwood_boots"),
    mitem("diamond_knife"),
]

def obsidianItems = [
    mitem("reinforced_pyre"), mitem("reinforced_catalyst_plate"), mitem("runed_pickaxe"), mitem("runed_axe"), mitem("runed_hoe"), mitem("runed_sword"),
    mitem("runed_shovel"), mitem("runed_dagger"), mitem("chiseled_runed_obsidian")
]
for (variant in ["", "_brick", "_brick_alt"])
    for (itemType in ["", "_slab", "_stairs", "_wall", "_button", "_pressure_plate"])
        obsidianItems.add(mitem("runed_obsidian${variant}${itemType}"))

def industrialTier = [mitem("runic_crafter")]
def creativeItems = [mitem("creative_pouch")]
def removeFromFey = [mitem("salmon_of_knowledge")]
def removeFromShearing = [mitem("spirit_bag")]
def removeFromCrafting = [mitem("wooden_shears"), mitem("fire_starter")]

def hideFromJei = [
    mitem("reliquary"), mitem("baffle_cap_huge_stem"), mitem("baffle_cap_huge_top"), mitem("fey_fire"), mitem("wildwood_sapling"),
    mitem("spell_dust"), mitem("spirit_bag"), mitem("reliquary"),
] + removeFromFey + removeFromShearing + removeFromCrafting

for (def it in feyCrafting) TooltipEvents.setTier(it, 3)
for (def it in goldItems) TooltipEvents.setTier(it, 3)
for (def it in spells) TooltipEvents.setTier(it, 4)
for (def it in gemstoneItems) TooltipEvents.setTier(it, 4)
for (def it in obsidianItems) TooltipEvents.setTier(it, 5)
for (def it in industrialTier) TooltipEvents.setTier(it, 9)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeFromCrafting) crafting.removeByOutput(it)
for (def it in removeFromFey) mods.roots.fey_crafter.removeByOutput(it)
for (def it in removeFromShearing) mods.roots.runic_shear_entity.removeByOutput(it)

mods.jei.description.remove(mitem("wildwood_sapling"))
mods.jei.category.remove("roots.loot")
mods.jei.catalyst.remove("roots.pyre_light", mitem("fire_starter"))

// NOTE: remove firestarter catalyst
