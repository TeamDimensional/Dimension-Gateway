import com.dimensional.gatewaycore.events.TooltipEvents

def citem(name, k=0) {
    return item("gateway:${name}", k)
}

TooltipEvents.setTier(item("modularmachinery:natural_infuser_controller"), 6)
TooltipEvents.setTier(item("modularmachinery:resonant_caster_controller"), 10)
TooltipEvents.setTier(item("modularmachinery:moonlight_fabricator_controller"), 4)
TooltipEvents.setTier(item("modularmachinery:network_supercharger_controller"), 8)
TooltipEvents.setTier(item("modularmachinery:dawnstone_refinery_controller"), 5)
TooltipEvents.setTier(item("modularmachinery:starlight_laser_controller"), 6)
TooltipEvents.setTier(item("modularmachinery:thaumic_centrifuge_controller"), 10)

TooltipEvents.setTier(citem("resonating_gem"), 10)
TooltipEvents.setTier(citem("impure_resonating_gem"), 10)
TooltipEvents.setTier(citem("starsteel_ingot"), 6)
TooltipEvents.setTier(citem("incomplete_runic_plate"), 10)
TooltipEvents.setTier(citem("runic_plate"), 10)
TooltipEvents.setTooltip(citem("runic_plate"), "tooltip.gateway.obtain.runic_plate")
TooltipEvents.setTier(citem("moonlight_powder"), 4)
TooltipEvents.setTier(citem("crystalline_aerogel"), 7)
TooltipEvents.setTier(citem("compression_core"), 6)
TooltipEvents.setTier(citem("ferramic_machine_frame"), 3)
TooltipEvents.setTier(citem("transcendental_matrix"), 9)
TooltipEvents.setTier(citem("transcendental_demon_alloy"), 14)
TooltipEvents.setTier(citem("cleanroom_machine_frame"), 6)
TooltipEvents.setTier(citem("purified_brain"), 9)
TooltipEvents.setTier(citem("crystallized_enlightenment"), 9)
TooltipEvents.setTier(citem("voidmetal_mesh"), 9)
TooltipEvents.setTier(citem("mindful_sand"), 9)
TooltipEvents.setTier(citem("pulsating_iron_dust"), 11)
TooltipEvents.setTier(citem("redstone_alloy_dust"), 11)
TooltipEvents.setTier(citem("dark_steel_dust"), 11)
TooltipEvents.setTier(citem("energetic_alloy_dust"), 11)
TooltipEvents.setTier(citem("vibrant_alloy_dust"), 11)
TooltipEvents.setTier(citem("starlight_fragment_midnight"), 6)
TooltipEvents.setTier(citem("starlight_fragment_dawn"), 6)
TooltipEvents.setTier(citem("starlight_fragment_noon"), 6)
TooltipEvents.setTier(citem("starlight_fragment_dusk"), 6)
TooltipEvents.setTier(citem("catalyzed_starlight"), 6)
TooltipEvents.setTier(citem("magical_crystal_mixture"), 10)
TooltipEvents.setTier(citem("dormant_magical_crystal"), 10)
TooltipEvents.setTier(citem("fengarum_shard"), 6)
TooltipEvents.setTier(citem("ourium_shard"), 6)
TooltipEvents.setTier(citem("ilium_shard"), 6)

def magicFuels = [
    ["natural", 11],
    ["arcane", 11],
    ["lunar", 11],
    ["skybound", 11],
    ["botanical", 11],
    ["crystalline", 11],
    ["nightmare", 13],
]
for (def it in magicFuels) {
    def name = it[0]
    def tier = it[1]
    TooltipEvents.setTier(citem("${name}_fuel_unprepared"), tier)
    TooltipEvents.setTier(citem("${name}_fuel"), tier)
    TooltipEvents.setTier(citem("${name}_fuel_ox"), tier)
    TooltipEvents.setTier(citem("${name}_fuel_carbide"), tier)
    TooltipEvents.setTier(citem("${name}_fuel_triso"), tier)
    TooltipEvents.setTier(citem("${name}_depleted_fuel_triso"), tier)
    TooltipEvents.setTier(citem("${name}_depleted_fuel_ox"), tier)
}
