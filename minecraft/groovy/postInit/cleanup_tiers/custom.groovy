import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("multiblocked:${name}", k)
}

def citem(name, k=0) {
    return item("gateway:${name}", k)
}

def hideFromJei = [
    mitem("blueprint_table"), mitem("blueprint_table_part"), mitem("controller_tester"), mitem("part_tester"),
    mitem("blueprint"), mitem("multiblock_builder"), mitem("item_input"), mitem("item_output"), mitem("fluid_input"),
    mitem("fluid_output"), mitem("energy_input"), mitem("energy_output"),
    mitem("dummy_component"), mitem("item_nbt.any"), mitem("item.any"), mitem("ember.any"),
    mitem("qmd_particle.any"), mitem("item_durability.any"), mitem("ta_impetus.any"), mitem("bg_lp.any"), mitem("forge_energy.any"),
    mitem("tc6_aspect.any"), mitem("prodigy_hotair.any"), mitem("starlight_as.any"), mitem("bot_mana.any"), mitem("fluid.any"),
    mitem("natures_aura.any"), mitem("exu2_gp.any"), mitem("fluid_nbt.any"), mitem("entity.any"), mitem("symbol"),
]

for (def it in hideFromJei) GatewayHelpers.hide(it)

TooltipEvents.setTier(citem("demon_factory"), 14)
TooltipEvents.setTier(citem("natural_infuser"), 4)
TooltipEvents.setTier(citem("resonant_caster"), 10)
TooltipEvents.setTier(citem("moonlight_fabricator"), 4)
TooltipEvents.setTier(citem("network_supercharger"), 8)
TooltipEvents.setTier(citem("lithographic_etcher"), 8)

TooltipEvents.setTier(citem("resonating_gem"), 10)
TooltipEvents.setTier(citem("impure_resonating_gem"), 10)
TooltipEvents.setTier(citem("starsteel_ingot"), 6)
TooltipEvents.setTier(citem("incomplete_runic_plate"), 10)
TooltipEvents.setTier(citem("runic_plate"), 10)
TooltipEvents.setTooltip(citem("runic_plate"), "Use Terraformer to create the correct conditions for this recipe!")
TooltipEvents.setTier(citem("moonlight_powder"), 4)
TooltipEvents.setTier(citem("crystalline_aerogel"), 7)
TooltipEvents.setTier(citem("compression_core"), 6)
TooltipEvents.setTier(citem("ferramic_machine_frame"), 3)
TooltipEvents.setTier(mitem("entity"), 14)
TooltipEvents.setTier(citem("transcendental_matrix"), 9)
TooltipEvents.setTier(citem("transcendental_demon_alloy"), 14)
TooltipEvents.setTier(citem("cleanroom_machine_frame"), 6)
TooltipEvents.setTier(citem("purified_brain"), 9)
TooltipEvents.setTier(citem("crystallized_enlightenment"), 9)
TooltipEvents.setTier(citem("voidmetal_mesh"), 9)
TooltipEvents.setTier(citem("mindful_sand"), 9)
