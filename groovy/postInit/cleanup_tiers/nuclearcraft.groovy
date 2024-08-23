import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("nuclearcraft:${name}", k)
}

def fuelIsotopes = [
    ["uranium", 0],
    ["uranium", 1],
    ["neptunium", 0],
    ["plutonium", 1],
    ["plutonium", 2],
    ["americium", 1],
    ["curium", 0],
    ["curium", 1],
    ["curium", 3],
    ["berkelium", 1],
    ["californium", 0],
    ["californium", 2],
]

def rtgIsotopes = [
    ["plutonium", 0],
    ["americium", 0],
    ["californium", 1],
]

def fertileIsotopes = [
    ["uranium", 2],
    ["neptunium", 1],
    ["plutonium", 3],
    ["americium", 2],
    ["curium", 2],
    ["berkelium", 0],
    ["californium", 3],
]

def isotopes = fuelIsotopes + rtgIsotopes + fertileIsotopes

def fuelCounts = [
    ["thorium", 1],      // TBU
    ["uranium", 4],      // LEU-233, HEU-233, LEU-235, HEU-235
    ["neptunium", 2],    // LEN-236, HEN-236
    ["plutonium", 4],    // 239, 241
    ["mixed", 2],        // MIX-239, MIX-241
    ["americium", 2],    // 242
    ["curium", 6],       // 243, 245, 247
    ["berkelium", 2],    // 248
    ["californium", 4],  // 249, 251
]

def tier1Items = [mitem("dominos")]

def tier3Items = [
    mitem("gem_dust", 2), mitem("record_money_for_nothing"),
]

def tier4Items = [
    mitem("ingot_block", 8), mitem("ingot", 8), mitem("dust", 8), mitem("gem_dust"),
]

def tier6Items = [
    mitem("gem", 6), mitem("gem_dust", 11), mitem("alloy", 13),
]

def tier7Items = [
    mitem("graham_cracker"), mitem("roasted_cocoa_beans"), mitem("ground_cocoa_nibs"), mitem("ore", 4), mitem("ingot_block", 4),
    mitem("ingot", 4), mitem("dust", 4),
]

def tier11Items = [
    mitem("fertile_isotope", 32767), mitem("heavy_water_moderator"), mitem("decay_hastener"), mitem("fuel_reprocessor"),
    mitem("fission_casing"), mitem("fission_glass"), mitem("fission_monitor"), mitem("fission_reflector", 32767),
    mitem("fission_vent"), mitem("fission_irradiator"), mitem("fission_source", 32767), mitem("fission_shield"),
    mitem("fission_irradiator_port"), mitem("fission_cell_port"), mitem("fission_source_manager"), mitem("fission_shield_manager"),
    mitem("solid_fission_controller"), mitem("solid_fission_cell"), mitem("solid_fission_sink", 32767), mitem("solid_fission_sink2", 32767),
    mitem("turbine_controller"), mitem("turbine_casing"), mitem("turbine_glass"), mitem("turbine_rotor_shaft"), mitem("turbine_rotor_stator"),
    mitem("turbine_rotor_bearing"), mitem("turbine_dynamo_coil", 32767), mitem("turbine_coil_connector"), mitem("turbine_inlet"),
    mitem("turbine_inlet"), mitem("turbine_outlet"), mitem("fission_conductor"), mitem("part", 12), mitem("part", 14),
    mitem("fission_dust", 32767), mitem("boron", 0), mitem("boron", 1), mitem("lithium", 0), mitem("lithium", 1),
    mitem("record_end_of_the_world"), mitem("centrifuge"), mitem("separator"),
]
for (def m in ["steel", "extreme", "sic_sic_cmc"]) tier11Items.add(mitem("turbine_rotor_blade_${m}"))

def tier12Items = [
    mitem("fission_heater_port", 32767), mitem("fission_heater_port2", 32767), mitem("salt_fission_controller"), mitem("fission_vessel_port"),
    mitem("salt_fission_vessel"), mitem("salt_fission_heater", 32767), mitem("salt_fission_heater2", 32767),
    // mitem("assembler"), mitem("part", 15),
]

def tier13Items = [
    mitem("decay_generator"), mitem("tritium_lamp"),
]

def removeRecipes = [
    mitem("manufactory"), mitem("alloy_furnace"), mitem("pressurizer"), mitem("electric_furnace"), mitem("melter"),
    mitem("rtg_uranium"), mitem("rtg_plutonium"), mitem("rtg_americium"), mitem("rtg_californium"),
    mitem("solar_panel_basic"), mitem("solar_panel_advanced"), mitem("solar_panel_du"), mitem("solar_panel_elite"),
    mitem("heat_exchanger_controller"), mitem("heat_exchanger_casing"), mitem("heat_exchanger_glass"), mitem("heat_exchanger_vent"),
    mitem("condenser_controller"), mitem("glowing_mushroom"),
    mitem("compound", 2), mitem("compound", 9), mitem("part", 11),
    mitem("assembler"), mitem("fission_power_port"),
]
for (def m in ["copper", "hard_carbon", "thermoconducting"]) removeRecipes.add(mitem("heat_exchanger_tube_${m}"))
for (def m in ["copper", "hard_carbon", "thermoconducting"]) removeRecipes.add(mitem("condenser_tube_${m}"))

def hideFromJei = [
    mitem("glowing_mushroom_block"), mitem("wasteland_earth"), mitem("wasteland_portal"), mitem("solidified_corium"), mitem("part", 13),
    mitem("fluid_steel"), mitem("fluid_enderium"), mitem("fluid_lead_platinum"), mitem("fluid_ethanol"), mitem("fluid_milk"),
    mitem("fluid_low_pressure_steam"), mitem("fluid_condensate_water"), mitem("fluid_sic_vapor"),
    mitem("alloy", 7), mitem("alloy", 8), mitem("alloy", 9), mitem("compound", 7), mitem("compound", 8), mitem("part", 15),
    mitem("fluid_radaway"), mitem("fluid_radaway_slow"), mitem("fluid_redstone_ethanol"),
    mitem("fluid_borax_solution"), mitem("fluid_irradiated_borax_solution"),
] + removeRecipes

TooltipEvents.setTooltip(mitem("fission_dust", 5), "Byproduct from the TBU, U-233 and Pu-based fuels.")
TooltipEvents.setTooltip(mitem("fission_dust", 6), "Byproduct from the U-235, Np-236, Am-242 and Cm-based fuels.")
TooltipEvents.setTooltip(mitem("fission_dust", 7), "Byproduct from the Bk-248 and Cf-based fuels.")
TooltipEvents.setTooltip(mitem("fission_dust", 8), "Byproduct from the TBU, U-based and Np-236 fuels.")
TooltipEvents.setTooltip(mitem("fission_dust", 9), "Byproduct from the Pu-based and more powerful fuels.")
TooltipEvents.setTooltip(mitem("fission_dust", 10), "Byproduct from the Cm-based and Cf-251 fuels.")

for (def f in isotopes) {
    tier11Items.add(mitem(f[0], f[1] * 5 + 0))
    hideFromJei.add(mitem(f[0], f[1] * 5 + 1))
    tier11Items.add(mitem(f[0], f[1] * 5 + 2))
    tier11Items.add(mitem(f[0], f[1] * 5 + 3))
    tier11Items.add(mitem(f[0], f[1] * 5 + 4))
    // TooltipEvents.setTooltip(mitem(f[0], f[1] * 5 + 1), "Only usable in Pebble Bed Reactors (tier 12).")
}
for (def f in fuelCounts) {
    def max = f[1] - 1
    for (def i in 0..max) {
        for (def d in ["depleted_", ""]) {
            hideFromJei.add(mitem("${d}fuel_${f[0]}", i * 4))
            // tier12Items.add(mitem("${d}fuel_${f[0]}", i * 4))
            tier11Items.add(mitem("${d}fuel_${f[0]}", i * 4 + 1))
            tier11Items.add(mitem("${d}fuel_${f[0]}", i * 4 + 2))
            tier11Items.add(mitem("${d}fuel_${f[0]}", i * 4 + 3))
        }
        tier11Items.add(mitem("pellet_${f[0]}", i * 2))
        hideFromJei.add(mitem("pellet_${f[0]}", i * 2 + 1))
        // TooltipEvents.setTooltip(mitem("pellet_${f[0]}", i * 2 + 1), "Only usable in Pebble Bed Reactors (tier 12).")
    }
}

TooltipEvents.setModTier("nuclearcraft", 8)
for (def it in tier1Items) TooltipEvents.setTier(it, 1)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in tier11Items) TooltipEvents.setTier(it, 11)
for (def it in tier12Items) TooltipEvents.setTier(it, 12)
for (def it in tier13Items) TooltipEvents.setTier(it, 13)
for (def it in removeRecipes) crafting.removeByOutput(it)
// for (def it in hideFromJei) GatewayHelpers.hide(it)
