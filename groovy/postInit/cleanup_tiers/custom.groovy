import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("multiblocked:${name}", k)
}

def hideFromJei = [
    mitem("blueprint_table"), mitem("blueprint_table_part"), mitem("controller_tester"), mitem("part_tester"),
    mitem("blueprint"), mitem("multiblock_builder"),
]

for (def it in hideFromJei) GatewayHelpers.hide(it)
