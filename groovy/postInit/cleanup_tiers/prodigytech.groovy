import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

baseItems = [
    item("prodigytech:explosion_furnace"), item("prodigytech:magmatic_aeroheater"),
    item("prodigytech:incinerator"), item("prodigytech:blower_furnace"),
    item("prodigytech:capacitor_charger"), item("prodigytech:ash_bricks"), item("prodigytech:ash"), 
    item("prodigytech:air_funnel"), item("prodigytech:linear_extractor"), item("prodigytech:ferramic_block"),
    item("prodigytech:charred_cobblestone"), item("prodigytech:charred_stone"), item("prodigytech:charred_stonebricks"),
    item("prodigytech:ferramic_ingot"), item("prodigytech:ferramic_nugget"),
]

gearItems = [
    item("prodigytech:ferramic_gear"), item("prodigytech:sawdust"), item("prodigytech:enriched_fuel"),
    item("prodigytech:rotary_grinder"), item("prodigytech:particle_board"), item("prodigytech:particle_board_planks"),
    item("prodigytech:meat_ground"), item("prodigytech:coal_dust"),
    item("prodigytech:quartz_dust"), item("prodigytech:ferramic_dust"), item("prodigytech:ferramic_dust_tiny"),
    item("prodigytech:funnelling_extractor"), item("prodigytech:dispersing_extractor"), item("prodigytech:food_purifier"),
    item("prodigytech:meat_patty"), item("prodigytech:carbon_plate_block"), item("prodigytech:ferramic_handbow"),
    item("prodigytech:purified_food"), item("prodigytech:heat_sawmill"), item("prodigytech:carbon_plate"),
    item("prodigytech:fuel_pellet_1"), item("prodigytech:fuel_pellet_4"), item("prodigytech:fuel_pellet_16"), item("prodigytech:fuel_pellet_64"),
    item("prodigytech:solid_fuel_aeroheater"),
]

redstoneItems = [
    item("prodigytech:capacitor_aeroheater"), item("prodigytech:solderer"), item("prodigytech:magnetic_reassembler"),
    item("prodigytech:ore_refinery"), item("prodigytech:fuel_processor"), item("prodigytech:food_enricher"),
    item("prodigytech:inferno_fuel"), item("prodigytech:inferno_crystal"), item("prodigytech:circuit_plate"),
    item("prodigytech:circuit_crude"), item("prodigytech:circuit_refined"),
    item("prodigytech:sugar_cube"), item("prodigytech:gold_dust"), item("prodigytech:gold_dust_tiny"),
    item("prodigytech:pattern_circuit_crude"), item("prodigytech:pattern_circuit_refined"),
]

gemstoneItems = [
    item("prodigytech:diamond_dust"), item("prodigytech:emerald_dust"),
]

enderItems = [
    item("prodigytech:wormhole_funnel"), item("prodigytech:wormhole_linker"), 
]

energionItems = [
    item("prodigytech:energion_aeroheater"), item("prodigytech:automatic_crystal_cutter"), item("prodigytech:primordialis_reactor"),
    item("prodigytech:atomic_reshaper"), item("prodigytech:crystal_cutter"), item("prodigytech:primordium"),
    item("prodigytech:aeternus_crystal"), item("prodigytech:circuit_perfected"), item("prodigytech:pattern_circuit_perfected"),
    item("prodigytech:energion_crystal_seed"), item("prodigytech:energion_dust"),
]

zorrasteelItems = [
    item("prodigytech:tartaric_aeroheater"), item("prodigytech:zorra_altar"), item("prodigytech:zorra_log"),
    item("prodigytech:zorra_planks"), item("prodigytech:zorra_leaves"), item("prodigytech:zorra_sapling"),
    item("prodigytech:zorrasteel_block"), item("prodigytech:zorra_leaf"), item("prodigytech:zorrasteel_raw"),
    item("prodigytech:zorrasteel_ingot"), item("prodigytech:tartaric_stoker"), item("prodigytech:zorrasteel_sword"),
    item("prodigytech:zorrasteel_handbow"),
]

for (def it in baseItems) TooltipEvents.setTier(it, 2)
for (def it in gearItems) TooltipEvents.setTier(it, 3)
for (def it in redstoneItems) TooltipEvents.setTier(it, 3)
for (def it in gemstoneItems) TooltipEvents.setTier(it, 4)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in energionItems) TooltipEvents.setTier(it, 11)
for (def it in zorrasteelItems) TooltipEvents.setTier(it, 11)

/*
Recipes needed:
- Solid Fuel Aeroheater (tier 2 -> tier 3)
- Energion Aeroheater (tier 3 -> tier 11)
- Automatic Crystal Cutter (tier 3 -> tier 11)
- Circuit Plate (tier 1 -> tier 3)
- Remove Ferramic Gear recipe
- Perfected Circuit (tier 4 -> tier 11)
- Heat Capacitor T1 (tier 3 -> tier 2)
- Heat Capacitor T3 (tier 4 -> tier 11)
- Energion (tier 4 -> tier 11)
- Crystal Cutter (tier 3 -> tier 11)
*/
