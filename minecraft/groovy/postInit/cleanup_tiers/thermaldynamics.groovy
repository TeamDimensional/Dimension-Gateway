import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("thermaldynamics:${name}", k)
}

def earlyItems = [mitem("duct_16")]

def normalItems = [
    mitem("duct_0"), mitem("duct_16", 1), mitem("duct_16", 2), mitem("duct_16", 3), mitem("duct_32"), mitem("duct_32", 1), mitem("duct_48"),
    mitem("servo"), mitem("servo", 1), mitem("filter"), mitem("filter", 1), mitem("cover"),
]

def enderItems = [mitem("retriever"), mitem("retriever", 1)]
def advancedItems = [mitem("duct_0", 5), mitem("duct_0", 9), mitem("duct_16", 6), mitem("duct_16", 7)]

TooltipEvents.setModTier("thermaldynamics", 8)
for (def it in earlyItems) TooltipEvents.setTier(it, 2)
for (def it in normalItems) TooltipEvents.setTier(it, 3)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in advancedItems) TooltipEvents.setTier(it, 9)
TooltipEvents.setTooltip(mitem("relay"), "Does not properly work with RFTools Sequencers! Use Project Red utilities instead.")
