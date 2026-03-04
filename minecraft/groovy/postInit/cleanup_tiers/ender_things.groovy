import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("enderutilities:${name}", k)
}

def enderItems = [
    mitem("enderpart"), mitem("enderarrow"), mitem("nullifier"), mitem("quickstacker"), mitem("ruler"), mitem("asu"),
    mitem("ender_elevator"), mitem("ender_elevator_slab"), mitem("ender_elevator_layer"), mitem("phasing"), mitem("phasing", 1),
    mitem("sound_block"),
]

def items = [
    mitem("linkcrystal"), mitem("linkcrystal", 1), mitem("linkcrystal", 2), mitem("builderswand"), mitem("chairwand"), mitem("dolly"),
    mitem("enderbucket"), mitem("endersword"), mitem("handybag"), mitem("inventoryswapper"), mitem("livingmanipulator"),
    mitem("mobharness"), mitem("pickupmanager"), mitem("portalscaler"), mitem("void_pickaxe"), mitem("draw_bridge"), mitem("draw_bridge", 1),
    mitem("machine_0"), mitem("machine_1", 1), mitem("machine_1", 2), mitem("machine_1", 3), mitem("molecular_exciter"), mitem("msu"),
    mitem("frame"), mitem("portal_panel"),
    item("enderstorage:ender_storage"), item("enderstorage:ender_storage", 1), item("enderstorage:ender_pouch"),
]
for (def i in [1, 10, 11, 12, 15, 16, 17, 45, 50, 51, 52, 53, 54, 80]) items.add(mitem("enderpart", i))
for (def i in 0..3) items.add(mitem("endertool", i))
for (def i in 0..3) items.add(mitem("syringe", i))
for (def i in 0..7) items.add(mitem("storage_0", i))

def advancedItems = [
    mitem("endercapacitor"), mitem("endercapacitor", 1), mitem("endercapacitor", 2), mitem("enderpart", 30), mitem("enderbow"),
    mitem("enderlasso"), mitem("handybag", 1), mitem("energy_bridge"), mitem("energy_bridge", 1), mitem("energy_bridge", 2), mitem("msu", 1),
    mitem("enderporter"), mitem("enderporter", 1), mitem("enderpart", 2),
]

def creativeItems = [
    mitem("endercapacitor", 3), mitem("enderpart", 81),
]

def removeRecipes = [
    mitem("enderbag"), mitem("enderpearlreusable"), mitem("enderpearlreusable", 1), mitem("icemelter"), mitem("icemelter", 1),
    mitem("barrel"), mitem("inserter"), mitem("inserter", 1), mitem("machine_1"),
]
for (def i in [20, 21, 40, 70, 71, 72, 73, ]) removeRecipes.add(mitem("enderpart", i))
def hideFromJei = [] + removeRecipes

for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in items) TooltipEvents.setTier(it, 7)
for (def it in advancedItems) TooltipEvents.setTier(it, 8)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
