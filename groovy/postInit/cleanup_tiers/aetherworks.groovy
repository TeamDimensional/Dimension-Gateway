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

def ourItems = [
    mitem("aether_ore"), mitem("block_aether"), mitem("item_pickaxe_aether"), mitem("item_pickaxe_ember"),
    mitem("item_shovel_redstone"), mitem("item_shovel_slime"), mitem("item_crown"), mitem("item_crossbow_quartz"),
    mitem("item_crossbow_magma"), mitem("item_potion_gem")
] + aetheriumPrismParts + geodes
for (int i in [0, 2, 4, 5, 7, 8, 10, 11, 12, 18, 19, 20, 22, 25, 26, 27, 28, 29]) ourItems.add(mitem("item_resource", i))

def potionGems = []
for (int i in 1..140) potionGems.add(mitem("item_potion_gem", i))

// Removing Aetherium Forge because no one knows how it works, including me after extensively reading the code.
// Removing some Aetherium tools because they're terrible for when they're obtained LMAO.
def removeRecipes = [
    mitem("heat_dial"), mitem("item_axe_prismarine"), mitem("item_axe_ender"),
]
for (int i in 0..5) removeRecipes.add(mitem("forge_component", i))
for (int i in [6, 9, 13, 17, 21, 23, 24]) removeRecipes.add(mitem("item_resource", i))

// TODO: wait for Embers UEL to update and remove those too.
def removeStamping = [mitem("item_resource", 1), mitem("item_resource", 3)]
def removeAlchemy = [mitem("item_resource", 15), mitem("item_resource", 16)]

def hideFromJei = [
    mitem("forge_structure"), mitem("item_resource", 14),
] + removeRecipes + removeStamping + removeAlchemy + potionGems

// Many tooltips
TooltipEvents.setTooltip(mitem("item_pickaxe_aether"), "Right-click breaks large veins of the same block automatically.")
TooltipEvents.setTooltip(mitem("item_pickaxe_ember"), "Has a small chance to drop Geodes when breaking blocks.")
TooltipEvents.setTooltip(mitem("item_shovel_redstone"), "Right-click to place a 3x3 patch of a selected block.")
TooltipEvents.setTooltip(mitem("item_shovel_slime"), "Right-click to exchange blocks in the world with ones in the inventory.")
TooltipEvents.setTooltip(mitem("item_crossbow_quartz"), "Affected by Power enchantment twice as much. Damage bypasses armor.")
TooltipEvents.setTooltip(mitem("item_crossbow_magma"), "Launches a spray of magma on use.")
TooltipEvents.setTooltip(mitem("item_crown"), "Constantly applies the status effect supplied via a Potion Gem when worn.")
for (def it in geodes) TooltipEvents.setTooltip(it, "Dropped when using Pickaxe of the Molten Depths.")
for (def it in aetheriumPrismParts) TooltipEvents.setTooltip(it, "Used in the construction of Aetherium Prism.")
// FIXME: maybe buff axes and return them to the game? Not sure.
// FIXME: rework and buff Shovel of the Perfect Machines.
TooltipEvents.setTooltip(fluid("aetherworks.impure_aetherium_gas"), "Produced by the Aetherium Prism.")
TooltipEvents.setTooltip(mitem("item_potion_gem"), "Craft with a potion to attune.")
for (def it in potionGems) TooltipEvents.setTooltip(it, "Craft with the Aetherium Crown to apply the effect.")

for (def it in ourItems) TooltipEvents.setTier(it, 6)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
