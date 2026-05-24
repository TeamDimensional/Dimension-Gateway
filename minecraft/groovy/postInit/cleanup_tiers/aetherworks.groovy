import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("aetherworks:${name}", k)
}

def aetheriumPrismParts = [
    mitem("aether_prism_controller_matrix"), mitem("moonlight_amplifier"), mitem("prism_support"), mitem("prism"),
]

def geodes = []
for (int i in 0..5) geodes.add(mitem("item_geode", i))

def forgeBaseItems = []

def ourItems = [
    mitem("aether_ore"), mitem("block_aether"), mitem("item_pickaxe_aether"), mitem("item_pickaxe_ember"),
    mitem("item_shovel_redstone"), mitem("item_shovel_slime"), mitem("item_crown"), mitem("item_crossbow_quartz"),
    mitem("item_crossbow_magma"), mitem("item_potion_gem"),
    mitem("aetherium_ashen_cloak_head"), mitem("aetherium_ashen_cloak_chest"), mitem("aetherium_ashen_cloak_legs"),
    mitem("aetherium_ashen_cloak_boots"), mitem("heat_dial"), mitem("forge_component", 5),
] + aetheriumPrismParts + geodes
for (int i in 0..14) ourItems.add(mitem("item_resource", i))
for (int i in 17..29) ourItems.add(mitem("item_resource", i))
for (int i in 0..4) forgeBaseItems.add(mitem("forge_component", i))

def potionGems = []
for (int i in 1..142) potionGems.add(mitem("item_potion_gem", i))

// Removing some Aetherium tools because they're terrible for when they're obtained LMAO.
def removeRecipes = [mitem("item_axe_prismarine"), mitem("item_axe_ender")]
def removeAlchemy = [mitem("item_resource", 15), mitem("item_resource", 16)]

def hideFromJei = [
    mitem("forge_structure"),
// Unobtainable tools => probably unfinished
    mitem("staff_aetherium"), mitem("aetheriumclockworkaxe"), mitem("aetheriumclockworkpickaxe"), mitem("aetheriumclockworkgrandhammer"),
    mitem("aetheriumblazingray"),
] + removeRecipes + removeAlchemy

// Many tooltips
TooltipEvents.setTooltip(mitem("item_pickaxe_aether"), "tooltip.gateway.use.aetherium_pick_aether")
TooltipEvents.setTooltip(mitem("item_pickaxe_ember"), "tooltip.gateway.use.aetherium_pick_ember")
TooltipEvents.setTooltip(mitem("item_shovel_redstone"), "tooltip.gateway.use.aetherium_shovel_redstone")
TooltipEvents.setTooltip(mitem("item_shovel_slime"), "tooltip.gateway.use.aetherium_shovel_slime")
TooltipEvents.setTooltip(mitem("item_crossbow_quartz"), "tooltip.gateway.use.aetherium_crossbow_quartz")
TooltipEvents.setTooltip(mitem("item_crossbow_magma"), "tooltip.gateway.use.aetherium_crossbow_magma")
TooltipEvents.setTooltip(mitem("item_crown"), "tooltip.gateway.use.aetherium_crown")
for (def it in geodes) TooltipEvents.setTooltip(it, "tooltip.gateway.obtain.aetherium_geode")
for (def it in aetheriumPrismParts) TooltipEvents.setTooltip(it, "tooltip.gateway.use.aetherium_prism")
// FIXME: maybe buff axes and return them to the game? Not sure.
// FIXME: rework and buff Shovel of the Perfect Machines.
TooltipEvents.setTooltip(fluid("aetherworks.impure_aetherium_gas"), "tooltip.gateway.obtain.impure_aetherium")
TooltipEvents.setTooltip(mitem("item_potion_gem"), "tooltip.gateway.use.potion_gem")
for (def it in potionGems) TooltipEvents.setTooltip(it, "tooltip.gateway.use.attuned_potion_gem")

for (def it in forgeBaseItems) TooltipEvents.setTier(it, 4)
for (def it in ourItems) TooltipEvents.setTier(it, 7)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in removeAlchemy) mods.embers.alchemy.removeByOutput(it)
