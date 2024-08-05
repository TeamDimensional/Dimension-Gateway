import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("bloodmagic:${name}", k)
}

def bloodItems = [
    mitem("altar"), mitem("incense_altar"), mitem("alchemy_table"), mitem("decorative_brick"), mitem("decorative_brick", 1),
    mitem("blood_orb"), mitem("activation_crystal"), mitem("activation_crystal", 1), mitem("sacrificial_dagger"), mitem("pack_sacrifice"),
    mitem("pack_self_sacrifice"), mitem("dagger_of_sacrifice"), mitem("ritual_diviner"), mitem("ritual_diviner", 1),
    mitem("ritual_dismantler"), mitem("ritual_reader"), mitem("lava_crystal"),
    mitem("bound_sword"), mitem("bound_pickaxe"), mitem("bound_axe"), mitem("bound_shovel"),
    mitem("sigil_divination"), mitem("sigil_water"), mitem("sigil_lava"), mitem("sigil_void"), mitem("sigil_green_grove"),
    mitem("sigil_blood_light"), mitem("sigil_elemental_affinity"), mitem("sigil_magnetism"), mitem("sigil_suppression"),
    mitem("sigil_air"), mitem("sigil_fast_miner"), mitem("sigil_seer"), mitem("sigil_phantom_bridge"), 
    mitem("sigil_compression"), mitem("sigil_ender_severance"), mitem("sigil_holding"), mitem("sigil_bounce"),
    mitem("experience_tome"), mitem("blood_shard"),
    mitem("living_armour_helmet"), mitem("living_armour_chest"), mitem("living_armour_leggings"), mitem("living_armour_boots"),
    mitem("upgrade_tome"), mitem("upgrade_trainer"), mitem("arcane_ashes"), mitem("sanguine_book"), mitem("points_upgrade"),
    mitem("potion_flask"),
]
for (int i in [0, 1, 3, 4, 5, 6, 8, 10]) bloodItems.add(mitem("blood_rune", i))
for (int i in [0, 1, 2]) bloodItems.add(mitem("ritual_controller", i))
for (int i in 0..5) bloodItems.add(mitem("ritual_stone", i))
for (int i in 0..7) bloodItems.add(mitem("path", i))
for (int i in 0..4) bloodItems.add(mitem("mimic", i))
for (int i in 0..4) bloodItems.add(mitem("slate", i))
for (int i in 1..5) bloodItems.add(mitem("inscription_tool", i))
for (int i in 0..15) bloodItems.add(mitem("blood_tank", i))
for (int i in [8, 22, 25, 26, 27, 28, 29]) bloodItems.add(mitem("component", i))

def sentientItems = [
    mitem("soul_forge"), mitem("demon_crucible"), mitem("demon_pylon"), mitem("demon_crystallizer"),
    mitem("demon_pillar_cap_1"), mitem("demon_pillar_cap_1", 1), mitem("demon_pillar_cap_2"), mitem("demon_pillar_cap_2", 1),
    mitem("demon_pillar_cap_3"),
    mitem("demon_stairs_1"), mitem("demon_stairs_1", 1), mitem("demon_stairs_2"), mitem("demon_stairs_2", 1),
    mitem("demon_stairs_3"), mitem("teleposer"), mitem("sigil_haste"), mitem("sigil_teleposition"), mitem("sigil_transposition"),
    mitem("blood_shard", 1),
    mitem("soul_snare"), mitem("sentient_sword"), mitem("sentient_bow"), mitem("sentient_axe"),
    mitem("sentient_pickaxe"), mitem("sentient_shovel"), mitem("demon_will_gauge"),
]
def coloredThings = [
    ["demon_crystal", 0],
    ["demon_brick_1", 0],
    ["demon_brick_2", 0],
    ["demon_brick_2", 5],
    ["demon_brick_2", 10],
    ["demon_extras", 0],
    ["demon_extras", 5],
    ["demon_pillar_1", 0],
    ["demon_pillar_2", 0],
    ["demon_light", 0],
    ["demon_wall_1", 0],
    ["demon_wall_1", 5],
    ["demon_wall_1", 10],
]
for (int i in 0..4) {
    for (def it in coloredThings) {
        sentientItems.add(mitem(it[0], i + it[1]))
    }
}
for (int i in [13, 17, 18]) sentientItems.add(mitem("component", i))
for (int i in 0..4) sentientItems.add(mitem("item_demon_crystal", i))
for (int i in 0..3) sentientItems.add(mitem("teleposition_focus", i))
for (int i in 0..4) sentientItems.add(mitem("monster_soul", i))
for (int i in 0..4) sentientItems.add(mitem("soul_gem", i))
for (int i in [7, 9]) bloodItems.add(mitem("blood_rune", i))

def removeHellfire = [
    mitem("master_routing_node"), mitem("item_routing_node"), mitem("input_routing_node"), mitem("output_routing_node"),
    mitem("node_router"), mitem("sentient_armour_gem"),
]
for (int i in [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 14, 15, 16, 30, 31, 32])
    removeHellfire.add(mitem("component", i))

def removeArray = [mitem("sigil_claw")]
// TODO: fix this recipe removal not working (GS bug)
def removeTable = [mitem("cutting_fluid").withEmptyNbt(), mitem("cutting_fluid", 1).withEmptyNbt()]

def removeRecipes = [mitem("base_fluid_filter")]
for (int i in 0..3) removeRecipes.add(mitem("base_item_filter", i))

def hideFromJei = [
    mitem("blood_rune", 2), mitem("ritual_stone", 6), mitem("ritual_diviner", 2), mitem("sigil_whirlwind"), mitem("sigil_frost"),
    mitem("alchemic_vial"), mitem("icarus_scroll"),
    mitem("sentient_armour_helmet"), mitem("sentient_armour_chest"), mitem("sentient_armour_leggings"), mitem("sentient_armour_boots"),
] + removeHellfire + removeArray + removeRecipes + removeTable
for (int i in 10..14) hideFromJei.add(mitem("demon_extras", i))
for (int i in 0..4) hideFromJei.add(mitem("inversion_pillar", i))
for (int i in 0..9) hideFromJei.add(mitem("inversion_pillar_end", i))

def creativeItems = [mitem("activation_crystal", 2), mitem("sacrificial_dagger", 1), mitem("altar_maker")]

for (def it in bloodItems) TooltipEvents.setTier(it, 10)
for (def it in sentientItems) TooltipEvents.setTier(it, 12)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in removeArray) mods.bloodmagic.alchemy_array.removeByOutput(it)
for (def it in removeTable) mods.bloodmagic.alchemy_table.removeByOutput(it)
for (def it in removeHellfire) mods.bloodmagic.tartaric_forge.removeByOutput(it)
