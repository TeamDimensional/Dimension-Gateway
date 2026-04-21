import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("thermalexpansion:${name}", k)
}

def tinItems = [mitem("strongbox")]

def basicItems = [
    mitem("device"), mitem("device", 5), mitem("device", 6), mitem("device", 12), mitem("tank"), mitem("cache"),
    mitem("reservoir"), mitem("reservoir", 1), mitem("satchel"), mitem("satchel", 1), mitem("satchel", 2), mitem("satchel", 100),
    mitem("frame", 64),
]

def advancedAugments = [
    mitem("augment", 129), mitem("augment", 402), mitem("augment", 433), 
]

def creativeItems = [
    mitem("capacitor", 32000), mitem("reservoir", 32000), mitem("satchel", 32000),
]

def removeRecipes = [
    mitem("machine", 2), mitem("machine", 12), mitem("machine", 13),
    mitem("device", 1), mitem("device", 2), mitem("device", 3), mitem("device", 4), mitem("device", 7), mitem("device", 10),
    mitem("dynamo"), mitem("dynamo", 1), mitem("dynamo", 2), mitem("dynamo", 3), mitem("dynamo", 4), mitem("dynamo", 5),
]
for (def i in [257, 273, 288, 303, 304, 323, 336, 352, 369, 448, 512, 513, 514, 515, 576, 640, 656, 672, 673, 674, 688, 704, 720])
    removeRecipes.add(mitem("augment", i))

def hideFromJei = [
    mitem("frame", 129), mitem("frame", 130), mitem("frame", 131), mitem("frame", 132), mitem("frame", 146),
    mitem("frame", 147), mitem("frame", 148),
] + removeRecipes

TooltipEvents.setModTier("thermalexpansion", 8)
for (def it in tinItems) TooltipEvents.setTier(it, 2)
for (def it in basicItems) TooltipEvents.setTier(it, 3)
for (def it in advancedAugments) TooltipEvents.setTier(it, 8)
for (def it in creativeItems) TooltipEvents.setTier(it, 14)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)

// Remove augments from JEI
// Normally this is done automatically as the ingredient is hidden, but JEI adds both the machine and the augment into the left panel
mods.jei.category.remove("thermalexpansion.pulverizer_petrotheum")
mods.jei.category.remove("thermalexpansion.furnace_ore")
mods.jei.category.remove("thermalexpansion.smelter_pyrotheum")
mods.jei.category.remove("thermalexpansion.insolator_tree")
mods.jei.category.remove("thermalexpansion.compactor_mint")
mods.jei.category.remove("thermalexpansion.crucible_lava")
mods.jei.category.remove("thermalexpansion.refinery_potion")
