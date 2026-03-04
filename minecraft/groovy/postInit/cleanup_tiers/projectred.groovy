import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("projectred-core:${name}", k)
}

def tier4Items = [item("projectred-transmission:framed_wire", 17)]
for (def i in [3, 20, 21, 301, 320, 341]) tier4Items.add(mitem("resource_item", i))
for (def i in [11, 20, 21, 22, 28, 29, 30, 32, 33]) tier4Items.add(item("projectred-integration:gate", i))
for (def i in 17..33) tier4Items.add(item("projectred-transmission:wire", i))

def removeRecipes = [
    mitem("drawplate"), item("projectred-transmission:wire", 34), item("projectred-transmission:framed_wire", 34),
]
for (def i in [250, 251, 252, 310, 311, 312, 400, 401, 402, 410, 420, 421]) removeRecipes.add(mitem("resource_item", i))
for (def i in 500..515) removeRecipes.add(mitem("resource_item", i))

def removeSmelting = []
for (def i in [104, 300, 342]) removeSmelting.add(mitem("resource_item", i))

def hideFromJei = [] + removeSmelting + removeRecipes
for (def i in [105, 200, 201, 202, 600]) hideFromJei.add(mitem("resource_item", i))

def creativeItems = [item("projectred-fabrication:ic_chip", 1)]

TooltipEvents.setModTier("projectred-core", 3)
TooltipEvents.setModTier("projectred-integration", 3)
TooltipEvents.setModTier("projectred-transmission", 3)
TooltipEvents.setModTier("projectred-fabrication", 5)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in removeSmelting) furnace.removeByOutput(it)
