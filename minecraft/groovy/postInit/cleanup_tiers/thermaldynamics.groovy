import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("thermaldynamics:${name}", k)
}

def tier3Items = [
    mitem("duct_0"), mitem("duct_16"), mitem("duct_16", 1), mitem("duct_32"), mitem("duct_32", 1), mitem("duct_48"),
    mitem("servo"), mitem("servo", 1), mitem("filter"), mitem("filter", 1), mitem("cover"),
]

def tier6Items = [mitem("retriever"), mitem("retriever", 1)]
def tier8Items = [mitem("duct_0", 5), mitem("duct_0", 9), mitem("duct_16", 6), mitem("duct_16", 7)]

TooltipEvents.setModTier("thermaldynamics", 7)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in tier8Items) TooltipEvents.setTier(it, 8)
TooltipEvents.setTooltip(mitem("relay"), "Does not properly work with RFTools Sequencers! Choose another option instead.")
