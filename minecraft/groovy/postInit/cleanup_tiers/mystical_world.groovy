import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents
// remove spirit drops because they can give ender pearls, a tier 6 item
import epicsquid.roots.recipe.SpiritDrops

def mitem(name, k=0) {
    return item("mysticalworld:${name}", k)
}

def buildToolList(metal) {
    def typedTools = []
    for (name in ["axe", "hoe", "pickaxe", "shovel", "sword"])
        typedTools.add(mitem("${metal}_${name}"))
    return typedTools
}

def buildArmorList(metal) {
    def output = []
    for (type in ["helmet", "chestplate", "leggings", "boots"])
        output.add(mitem("${metal}_${type}"))
    return output
}

def buildList(metal) {
    def output = [] + buildToolList(metal)
    for (type in ["ingot", "nugget", "dust", "dust_tiny", "helmet", "chestplate", "leggings", "boots", "knife", "block", "ore"])
        output.add(mitem("${metal}_${type}"))
    return output
}

def copperItems = buildList("copper")
def silverItems = buildList("silver")
def amethystItems = buildToolList("amethyst")
def tools = buildToolList("copper") + amethystItems + buildToolList("silver")
amethystItems.add(mitem("amethyst_knife"))

def feyCrafting = [mitem("pearl")]
for (type in ["block", "slab", "stairs", "wall", "button", "pressure_plate", "fence", "fence_gate"])
    feyCrafting.add(mitem("pearl_${type}"))

def removeItems = [mitem("pearleporter")] + buildArmorList("copper") + buildArmorList("silver")
def hideFromJei = [
    mitem("unripe_pearl"), mitem("quartz_ore"), mitem("granite_quartz_ore"), mitem("amethyst_ore"), mitem("amethyst_gem"), mitem("amethyst_block"),
    mitem("iron_dust"), mitem("iron_dust_tiny"), mitem("gold_dust"), mitem("gold_dust_tiny"),
] + removeItems + copperItems + silverItems

for (def it in feyCrafting) TooltipEvents.setTier(it, 3)
for (def it in amethystItems) TooltipEvents.setTier(it, 5)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeItems) crafting.removeByOutput(it)
for (def it in tools) GatewayHelpers.banTool(it)
TooltipEvents.setTier(mitem("epic_squid"), 4)
SpiritDrops.clear()
crafting.remove("mysticalworld:ender_pearl")
