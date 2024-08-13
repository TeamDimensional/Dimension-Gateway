import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("enderio:${name}", k)
}

def tier3Items = [
    mitem("block_exit_rail"), mitem("block_painted_pressure_plate", 7),
]

for (def a in [5, 10, 30, 60, 300])
    for (def b in ["", "i"])
        tier3Items.add(mitem("block_self_resetting_lever${a}${b}"))

def tier6Items = [mitem("item_coord_selector"), mitem("block_enderman_skull")]

def items = [
    mitem("block_infinity_fog"), mitem("block_infinity"), mitem("block_infinity", 0), mitem("block_infinity", 1), mitem("block_dark_steel_ladder"),
    mitem("block_dark_iron_bars"), mitem("block_dark_steel_trapdoor"), mitem("block_dark_steel_door"), mitem("block_reinforced_obsidian"),
    mitem("block_industrial_insulation"), mitem("item_conduit_probe"), mitem("item_yeta_wrench"), mitem("item_xp_transfer"),
    mitem("item_magnet"), mitem("block_enderman_skull", 2), mitem("item_enchantment_filter_normal"), mitem("item_enchantment_filter_big"),
    mitem("item_fluid_filter"), mitem("block_detector_block"), mitem("block_detector_block_silent"),
    mitem("item_dark_steel_shears"), mitem("item_dark_steel_crook"), mitem("item_inventory_charger_basic"), mitem("item_inventory_charger"),
    mitem("item_inventory_charger_vibrant"), mitem("item_dark_steel_upgrade"), mitem("item_dark_steel_upgrade", 1),
    mitem("item_item_conduit"), mitem("item_redstone_conduit"), mitem("item_extract_speed_upgrade"), mitem("item_extract_speed_downgrade"),
    mitem("item_me_conduit"), mitem("item_me_conduit", 1), mitem("block_alloy_smelter"), mitem("block_buffer"),
    mitem("block_buffer", 1), mitem("block_buffer", 2), mitem("block_enchanter"), mitem("block_farm_station"),
    mitem("block_combustion_generator"), mitem("block_zombie_generator"), mitem("block_aversion_obelisk"), mitem("block_relocator_obelisk"),
    mitem("block_experience_obelisk"), mitem("block_painter"), mitem("block_reservoir"), mitem("block_omni_reservoir"),
    mitem("block_sag_mill"), mitem("block_slice_and_splice"), mitem("block_vat"), mitem("block_wired_charger"), mitem("block_wireless_charger"),
    mitem("block_normal_wireless_charger"), mitem("block_tank", 1), mitem("block_vacuum_chest"), mitem("block_xp_vacuum"), mitem("block_niard"),
    mitem("block_travel_anchor"), mitem("block_tele_pad"), mitem("block_dialing_device"), mitem("block_impulse_hopper"),
    mitem("block_cap_bank", 1), mitem("block_cap_bank", 2), mitem("block_cap_bank", 3), mitem("block_gauge"),
    mitem("block_power_monitor"), mitem("block_advanced_power_monitor"),
]
for (def i in 0..3) items.add(mitem("item_conduit_facade", i))
for (def i in 0..2) items.add(mitem("item_basic_capacitor", i))
for (def i in 0..2) {
    items.add(mitem("item_liquid_conduit", i))
    items.add(mitem("item_power_conduit", i))
}
for (def i in 0..7) {
    items.add(mitem("block_alloy", i))
    items.add(mitem("item_alloy_ingot", i))
    items.add(mitem("item_alloy_nugget", i))
    items.add(mitem("item_alloy_ball", i))
}
for (def i in [1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 30, 31, 40, 41, 43, 45, 46, 47, 48, 49, 50, 53, 57, 58, 59, 60, 65, 70, 73, 76])
    items.add(mitem("item_material", i))
for (def i in 0..2) items.add(mitem("block_dark_steel_anvil", i))
for (def i in 8..13) items.add(mitem("block_painted_pressure_plate", i))
for (def it in ["basic", "advanced", "limited", "big", "big_advanced", "existing", "mod", "power"])
    items.add(mitem("item_${it}_item_filter"))
for (def it in ["not", "or", "and", "nor", "nand", "xor", "xnor", "toggle", "counting", "sensor", "timer"])
    items.add(mitem("item_redstone_${it}_filter"))
for (def it in ["tiny", "small", "medium", "big", "large"]) items.add(mitem("block_inventory_chest_${it}"))
for (def i in [0, 1, 4, 5]) items.add(mitem("block_electric_light", i))
for (def i in 0..3) items.add(mitem("block_solar_panel", i))

def advancedItems = [
    mitem("item_cold_fire_igniter"), mitem("block_end_iron_bars"), mitem("item_travel_staff"), mitem("item_rod_of_return"),
    mitem("item_soul_filter_normal"), mitem("item_soul_filter_big"), mitem("item_staff_of_levity"), mitem("block_inventory_panel"),
    mitem("block_inventory_panel_sensor"), mitem("item_data_conduit"), mitem("block_enhanced_alloy_smelter"),
    mitem("block_enhanced_combustion_generator"), mitem("block_franken_zombie_generator"), mitem("block_ender_generator"),
    mitem("block_killer_joe"), mitem("block_attractor_obelisk"), mitem("block_inhibitor_obelisk"), mitem("block_weather_obelisk"),
    mitem("block_enhanced_sag_mill"), mitem("block_soul_binder"), mitem("block_powered_spawner"), mitem("block_enhanced_vat"),
    mitem("block_enhanced_wired_charger"), mitem("block_enhanced_wireless_charger"), mitem("block_wireless_charger_extension"),
    mitem("block_transceiver"), mitem("block_simple_crafter"), mitem("block_crafter"), mitem("item_soul_vial"),
]
for (def i in [16, 17, 18, 19, 34, 35, 36, 37, 42, 44, 56, 64, 68, 71, 78, 79, 80])
    advancedItems.add(mitem("item_material", i))
advancedItems.add(mitem("block_alloy", 8))
advancedItems.add(mitem("item_alloy_ingot", 8))
advancedItems.add(mitem("item_alloy_nugget", 8))
advancedItems.add(mitem("item_alloy_ball", 8))
for (def it in ["huge", "enormous", "warehouse", "warehouse13"]) advancedItems.add(mitem("block_inventory_chest_${it}"))
for (def i in 0..2) advancedItems.add(mitem("item_inventory_remote", i))

for (def it in 0..15) {
    for (def modifier in ["", "enlightened_", "dark_"]) {
        items.add(mitem("block_${modifier}fused_glass", it))
        items.add(mitem("block_${modifier}fused_quartz", it))
        for (def passthrough in ["holy_", "unholy_", "pasture_", "not_holy_", "not_unholy_", "not_pasture_"]) {
            advancedItems.add(mitem("block_${passthrough}${modifier}fused_glass", it))
            advancedItems.add(mitem("block_${passthrough}${modifier}fused_quartz", it))
        }
    }
}

for (def it in ["helmet", "chestplate", "leggings", "boots", "shield", "sword", "pickaxe", "axe", "bow"]) {
    items.add(mitem("item_dark_steel_${it}"))
    advancedItems.add(mitem("item_end_steel_${it}"))
}

def creativeItems = [mitem("block_buffer", 3), mitem("block_cap_bank")]

def removeRecipes = [
    mitem("block_alloy", 9), mitem("item_alloy_ingot", 9), mitem("item_alloy_nugget", 9),
    mitem("item_ender_food"), mitem("item_dark_steel_hand"), mitem("item_inventory_charger_simple"),
    mitem("block_simple_furnace"), mitem("block_simple_alloy_smelter"), mitem("block_simple_stirling_generator"),
    mitem("block_stirling_generator"), mitem("block_lava_generator"), mitem("block_simple_sag_mill"),
    mitem("block_simple_wired_charger"), mitem("block_dark_paper_anvil"),
]
for (def i in [0, 22, 38, 51, 52, 66, 67, 69, 77, 81]) removeRecipes.add(mitem("item_material", i))
for (def b in 0..15) for (def a in [1, 2]) removeRecipes.add(mitem("block_decoration${a}", b))
for (def b in 0..4) removeRecipes.add(mitem("block_decoration3", b))
ore("blockConstructionAlloy").remove(mitem("block_alloy", 9))
ore("ingotConstructionAlloy").remove(mitem("item_alloy_ingot", 9))
ore("nuggetConstructionAlloy").remove(mitem("item_alloy_nugget", 9))
ore("nuggetEnderPearl").remove(mitem("item_material", 28))

def removeSagMill = [mitem("item_material", 28), mitem("block_holier_fog")]
def removeSagMillInputs = [item("minecraft:ender_pearl"), item("appliedenergistics2:material", 46), mitem("item_material", 76)]
def removeAlloy = [mitem("item_material", 39), mitem("item_material", 72), mitem("item_material", 76), mitem("block_death_pouch")]
def removeTank = [mitem("item_material", 8)]

def hideFromJei = [
    mitem("item_alloy_ball", 9), mitem("item_material", 5), mitem("block_holy_fog"), mitem("block_creative_spawner"),
    mitem("block_dark_paper_anvil", 1), mitem("block_dark_paper_anvil", 2),
] + removeRecipes + removeSagMill + removeAlloy + removeTank

def setUpgradeTier(name, tier) {
    def upgrade = item("enderio:item_dark_steel_upgrade", 1).withNbt(["enderio:dsu": name])
    def predicate = stack -> stack in upgrade
    TooltipEvents.addTierPredicate("eioupgrade:" + name, predicate, tier)
}

setUpgradeTier("enderio:travel", 9)

for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in items) TooltipEvents.setTier(it, 7)
for (def it in advancedItems) TooltipEvents.setTier(it, 9)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
TooltipEvents.setTier(fluid("construction_alloy"), 0)
mods.jei.ingredient.hide(fluid("construction_alloy"))

for (def it in removeSagMillInputs) mods.enderio.sag_mill.removeByInput(it)
for (def it in removeAlloy) mods.enderio.alloy_smelter.remove(it)
mods.enderio.tank.removeFill(fluid("nutrient_distillation"), mitem("item_material", 8))
mods.tconstruct.melting.removeByOutput(fluid("construction_alloy"))
