import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("bibliocraft:${name}", k)
}

def quartzItems = [mitem("dinnerplate")]
def goldItems = [
    mitem("bell"), mitem("cookiejar"), mitem("compass"), mitem("plumbline"), mitem("bibliodrill"), mitem("biblioglasses", 2)
]
for (int i in 0..15) goldItems.add(mitem("lanterngold", i))
for (int i in 0..15) goldItems.add(mitem("lampgold", i))

def bookPrinting = [
    mitem("typesettingtable"), mitem("printingpress"), mitem("bibliochase"), mitem("printplate"), mitem("enchantedplate"),
    mitem("biblioredbook")
]

def hideFromJei = [mitem("bibliocreativelock"), mitem("markerpole"), mitem("clipboard")]
for (int i in 0..5) hideFromJei.add(mitem("bookcasecreative", i))

for (def it in quartzItems) TooltipEvents.setTier(it, 2)
for (def it in goldItems) TooltipEvents.setTier(it, 3)
for (def it in bookPrinting) TooltipEvents.setTier(it, 10)
for (def it in hideFromJei) GatewayHelpers.hide(it)
