import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("prodigytech:${name}", k)
}

baseItems = [
    mitem("explosion_furnace"), mitem("magmatic_aeroheater"), mitem("incinerator"), mitem("blower_furnace"), mitem("capacitor_charger"),
    mitem("ash_bricks"), mitem("ash"), mitem("air_funnel"), mitem("linear_extractor"), mitem("ferramic_block"),
    mitem("charred_cobblestone"), mitem("charred_stone"), mitem("charred_stonebricks"), mitem("ferramic_ingot"), mitem("ferramic_nugget"),
]

gearItems = [
    mitem("ferramic_gear"), mitem("sawdust"), mitem("enriched_fuel"), mitem("rotary_grinder"), mitem("particle_board"), mitem("particle_board_planks"),
    mitem("meat_ground"), mitem("quartz_dust"), mitem("ferramic_dust"), mitem("ferramic_dust_tiny"), mitem("funnelling_extractor"),
    mitem("dispersing_extractor"), mitem("food_purifier"), mitem("meat_patty"), mitem("carbon_plate_block"), mitem("ferramic_handbow"),
    mitem("purified_food"), mitem("heat_sawmill"), mitem("carbon_plate"),
    mitem("fuel_pellet_1"), mitem("fuel_pellet_4"), mitem("fuel_pellet_16"), mitem("fuel_pellet_64"), mitem("solid_fuel_aeroheater"),
]

redstoneItems = [
    mitem("capacitor_aeroheater"), mitem("solderer"), mitem("magnetic_reassembler"), mitem("fuel_processor"), mitem("food_enricher"),
    mitem("inferno_fuel"), mitem("inferno_crystal"), mitem("circuit_plate"), mitem("circuit_crude"), mitem("circuit_refined"),
    mitem("sugar_cube"), mitem("gold_dust_tiny"), mitem("pattern_circuit_perfected"),
    mitem("pattern_circuit_crude"), mitem("pattern_circuit_refined"), mitem("heat_capacitor_0", 32767), mitem("heat_capacitor_1", 32767),
]

gemstoneItems = [mitem("diamond_dust"), mitem("emerald_dust"), mitem("ore_refinery")]
enderItems = [mitem("wormhole_funnel"), mitem("wormhole_linker")]
energionItems = [
    mitem("energion_aeroheater"), mitem("automatic_crystal_cutter"), mitem("primordialis_reactor"), mitem("atomic_reshaper"),
    mitem("crystal_cutter"), mitem("primordium"), mitem("aeternus_crystal"), mitem("circuit_perfected"),
    mitem("energion_crystal_seed"), mitem("energion_dust"), mitem("heat_capacitor_2", 32767), mitem("heat_capacitor_3", 32767),
]

zorrasteelItems = [
    mitem("tartaric_aeroheater"), mitem("zorra_altar"), mitem("zorra_log"), mitem("zorra_planks"), mitem("zorra_leaves"), mitem("zorra_sapling"),
    mitem("zorrasteel_block"), mitem("zorra_leaf"), mitem("zorrasteel_raw"), mitem("zorrasteel_ingot"), mitem("tartaric_stoker"), mitem("zorrasteel_sword"),
    mitem("zorrasteel_handbow"),
]

for (def it in baseItems) TooltipEvents.setTier(it, 2)
for (def it in gearItems) TooltipEvents.setTier(it, 3)
for (def it in redstoneItems) TooltipEvents.setTier(it, 3)
for (def it in gemstoneItems) TooltipEvents.setTier(it, 4)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in energionItems) TooltipEvents.setTier(it, 11)
for (def it in zorrasteelItems) TooltipEvents.setTier(it, 11)
