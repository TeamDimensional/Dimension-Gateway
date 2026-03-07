import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("bibliocraft:${name}", k)
}

def goldItems = [
    mitem("compass"), mitem("plumbline"), mitem("bibliodrill"), mitem("biblioglasses", 2), mitem("biblioredbook")
]

def bookPrinting = [
    mitem("typesettingtable"), mitem("printingpress"), mitem("bibliochase"), mitem("printplate"), mitem("enchantedplate"),
]

def hideFromJei = [mitem("bibliocreativelock"), mitem("markerpole"), mitem("clipboard")]
for (int i in 0..6) hideFromJei.add(mitem("bookcasecreative", i))

for (def it in goldItems) TooltipEvents.setTier(it, 3)
for (def it in bookPrinting) TooltipEvents.setTier(it, 9)
for (def it in hideFromJei) GatewayHelpers.hide(it)
