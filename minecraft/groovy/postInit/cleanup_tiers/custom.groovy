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
]

for (def it in hideFromJei) GatewayHelpers.hide(it)
TooltipEvents.setTier(citem("natural_infuser"), 4)
TooltipEvents.setTier(citem("resonant_caster"), 8)
TooltipEvents.setTier(citem("resonating_gem"), 8)
TooltipEvents.setTier(citem("impure_resonating_gem"), 8)

TooltipEvents.setTier(mitem("entity"), 14)
TooltipEvents.setTier(citem("demon_factory"), 14)
