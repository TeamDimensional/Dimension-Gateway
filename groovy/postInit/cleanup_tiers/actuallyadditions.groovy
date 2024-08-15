import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("actuallyadditions:${name}", k)
}

def resources = ["redstone", "lapis", "diamond", "coal", "emerald", "iron"]
def armor = ["helm", "chest", "pants", "boots"]
def armor_colors = ["red", "blue", "light_blue", "green", "white"]

def tier3Items = [
    mitem("block_misc"), mitem("block_misc", 1), mitem("block_misc", 2), mitem("item_misc", 5),
    mitem("item_dust", 4), mitem("item_dust", 7),
]
for (def a in ["wall", "stair", "slab"])
    for (def b in ["", "chiseled_", "pillar_"])
        tier3Items.add(mitem("block_${b}quartz_${a}"))
for (def a in armor)
    tier3Items.add(mitem("item_${a}_quartz"))

def tier4Items = [
    mitem("block_battery_box"), mitem("block_item_viewer_hopping"), mitem("block_farmer"), mitem("block_display_stand"),
    mitem("block_item_viewer"), mitem("block_firework_box"), mitem("block_atomic_reconstructor"),
    mitem("block_leaf_generator"), mitem("block_lamp_powerer"), mitem("block_energizer"), mitem("block_enervator"),
    mitem("block_canola_press"), mitem("block_oil_generator"), mitem("block_fermenting_barrel"), mitem("block_feeder"),
    mitem("block_giant_chest"), mitem("block_giant_chest_medium"), mitem("block_grinder"), mitem("block_grinder_double"),
    mitem("block_furnace_double"), mitem("block_inputter"), mitem("block_inputter_advanced"), mitem("block_misc", 9), mitem("block_misc", 7),
    mitem("block_heat_collector"), mitem("block_placer"), mitem("block_dropper"), mitem("block_fluid_placer"),
    mitem("block_fluid_collector"), mitem("block_coffee_machine"),
    mitem("item_engineer_goggles"), mitem("item_laser_upgrade_range"), mitem("item_laser_upgrade_invisibility"), mitem("item_bag"),
    mitem("item_filter"), mitem("item_crate_keeper"), mitem("item_small_to_medium_crate_upgrade"), mitem("item_suction_ring"),
    mitem("item_water_removal_ring"), mitem("item_battery"), mitem("item_battery_double"),
    mitem("item_drill_upgrade_speed"), mitem("item_drill_upgrade_speed_ii"), mitem("item_drill_upgrade_three_by_three"),
    mitem("item_drill_upgrade_block_placing"), mitem("item_coffee"), mitem("item_leaf_blower"), mitem("item_leaf_blower_advanced"),
    mitem("item_chest_to_crate_upgrade"), mitem("item_damage_lens"), mitem("item_explosion_lens"), mitem("item_color_lens"),
    mitem("item_more_damage_lens"),
]
for (def i in [6, 7, 8, 14, 16, 18, 23])
    tier4Items.add(mitem("item_misc", i))

for (def t in ["wall", "fence", "stairs", "slab"])
    for (def c in ["green", "white"])
        tier4Items.add(mitem("block_testifi_bucks_${c}_${t}"))
for (def i in 0..15) tier4Items.add(mitem("block_colored_lamp", i))
for (def i in 0..9) tier4Items.add(mitem("item_potion_ring", i))
for (def a in armor)
    for (def c in armor_colors)
        tier4Items.add(mitem("item_${a}_crystal_${c}"))

def tier5Items = [
    mitem("block_laser_relay"), mitem("block_laser_relay_fluids"), mitem("block_laser_relay_item"), mitem("block_laser_relay_item_whitelist"),
    mitem("item_laser_wrench"),
]

def tier6Items = [
    mitem("block_ranged_collector"), mitem("block_misc", 6), mitem("item_void_bag"), mitem("item_misc", 19),
]
for (def i in 0..9) tier6Items.add(mitem("item_potion_ring_advanced", i))
// I wanted Drill in tier 4, but it has a mining level of 5 (Obsidian) and Tool Progression can't change it, so we put it in tier 6.
for (def i in 0..15) tier6Items.add(mitem("item_drill", i))

// The Breakers have a mining level of 7 (Cobalt) for some reason, and it actually seems infinite, not 7
// So they have to be moved to the highest harvest level tier, i.e. 7
def tier7Items = [
    mitem("block_directional_breaker"), mitem("block_breaker"),
]

def tier10Items = [
    mitem("block_empowerer"), mitem("block_shock_suppressor"), mitem("block_player_interface"), mitem("block_miner"),
    mitem("block_laser_relay_advanced"), mitem("block_laser_relay_extreme"), mitem("block_xp_solidifier"),
    mitem("block_lava_factory_controller"), mitem("block_misc", 8), mitem("block_giant_chest_large"), mitem("block_fishing_net"),
    mitem("block_furnace_solar"), mitem("block_item_repairer"), mitem("block_greenhouse_glass"), mitem("block_phantom_booster"),
    mitem("item_engineer_goggles_advanced"), mitem("item_filling_wand"), mitem("item_player_probe"), mitem("item_spawner_changer"),
    mitem("item_misc", 24), mitem("item_medium_to_large_crate_upgrade"), mitem("item_growth_ring"), mitem("item_tele_staff"),
    mitem("item_wings_of_the_bats"), mitem("item_battery_triple"), mitem("item_battery_quadruple"), mitem("item_battery_quintuple"),
    mitem("item_drill_upgrade_speed_iii"), mitem("item_drill_upgrade_silk_touch"), mitem("item_drill_upgrade_fortune"),
    mitem("item_drill_upgrade_fortune_ii"), mitem("item_drill_upgrade_five_by_five"), mitem("item_phantom_connector"),
    mitem("item_disenchanting_lens"),
]

for (def it in ["face", "_placer", "_liquiface", "_energyface", "_redstoneface", "_breaker"])
    tier10Items.add(mitem("block_phantom${it}"))

for (def i in 0..5) {
    tier4Items.add(mitem("block_crystal", i))
    tier10Items.add(mitem("block_crystal_empowered", i))
    tier4Items.add(mitem("item_crystal", i))
    tier10Items.add(mitem("item_crystal_empowered", i))
}

def removeRecipes = [
    mitem("block_bio_reactor"), mitem("block_coal_generator"), mitem("item_resonant_rice"),
]
for (def i in 0..5) removeRecipes.add(mitem("item_crystal_shard", i))

def hideFromJei = [
    mitem("block_treasure_chest"), mitem("item_worm"),
] + removeRecipes
for (def r in resources) hideFromJei.add(mitem("block_crystal_cluster_${r}"))
for (def i in 0..6) hideFromJei.add(mitem("item_jam", i))

// crystal shard packing
for (def i in [188, 194, 200, 206, 212, 218]) crafting.remove("actuallyadditions:recipes${i}")

for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in tier5Items) TooltipEvents.setTier(it, 5)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in tier10Items) TooltipEvents.setTier(it, 10)
TooltipEvents.setTier(item("actuallyadditions:item_mining_lens"), 14)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
