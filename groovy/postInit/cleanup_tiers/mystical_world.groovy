import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents
// remove spirit drops because they can give ender pearls, a tier 6 item
import epicsquid.roots.recipe.SpiritDrops

def buildToolList(metal) {
    def typedTools = []
    for (name in ["axe", "hoe", "pickaxe", "shovel", "sword"])
        typedTools.add(item("mysticalworld:${metal}_${name}"))
    return typedTools
}

def buildArmorList(metal) {
    def output = []
    for (type in ["helmet", "chestplate", "leggings", "boots"])
        output.add(item("mysticalworld:${metal}_${type}"))
    return output
}

def buildList(metal) {
    def output = [] + buildToolList(metal)
    for (type in ["ingot", "nugget", "dust", "dust_tiny", "helmet", "chestplate", "leggings", "boots", "knife", "block", "ore"])
        output.add(item("mysticalworld:${metal}_${type}"))
    return output
}

def copperItems = buildList("copper")
def silverItems = buildList("silver")
def amethystItems = buildToolList("amethyst")
def tools = buildToolList("copper") + amethystItems + buildToolList("silver")
for (type in ["gem", "block", "ore", "knife"])
    amethystItems.add(item("mysticalworld:amethyst_${type}"))

def feyCrafting = [item("mysticalworld:pearl")]
for (type in ["block", "slab", "stairs", "wall", "button", "pressure_plate", "fence", "fence_gate"])
    feyCrafting.add(item("mysticalworld:pearl_${type}"))

def removeItems = [item("mysticalworld:pearleporter")] + buildArmorList("copper") + buildArmorList("silver")
def hideFromJei = [
    item("mysticalworld:unripe_pearl"), item("mysticalworld:quartz_ore"), item("mysticalworld:granite_quartz_ore")
] + removeItems + copperItems + silverItems

for (def it in feyCrafting) TooltipEvents.setTier(it, 3)
for (def it in amethystItems) TooltipEvents.setTier(it, 4)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeItems) crafting.removeByOutput(it)
for (def it in tools) GatewayHelpers.banTool(it)
TooltipEvents.setTier(item("mysticalworld:epic_squid"), 4)
SpiritDrops.clear()
crafting.remove("mysticalworld:ender_pearl")
