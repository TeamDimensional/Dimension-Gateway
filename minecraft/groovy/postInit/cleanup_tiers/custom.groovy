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
TooltipEvents.setTier(citem("natural_infuser"), 4)
TooltipEvents.setTier(citem("resonant_caster"), 10)
TooltipEvents.setTier(citem("resonating_gem"), 10)
TooltipEvents.setTier(citem("impure_resonating_gem"), 10)
TooltipEvents.setTier(citem("starsteel_ingot"), 6)

TooltipEvents.setTier(mitem("entity"), 15)
TooltipEvents.setTier(citem("demon_factory"), 15)
