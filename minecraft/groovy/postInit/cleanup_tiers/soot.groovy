import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("soot:${name}", k)
}

def decor = [
    mitem("redstone_bin"), mitem("caminite_clay"), mitem("caminite_tiles"), mitem("caminite_tiles_slab"), mitem("caminite_tiles_stairs"),
    mitem("caminite_large_tile"), mitem("caminite_large_tile_stairs"), mitem("archaic_tile_slab"), mitem("archaic_tile_stairs"),
    mitem("archaic_big_bricks"), mitem("archaic_big_bricks_slab"), mitem("archaic_big_bricks_stairs"), mitem("archaic_bricks_slab"),
    mitem("archaic_bricks_stairs"), mitem("sealed_planks_slab"), mitem("sealed_planks_stairs"), mitem("sealed_tile"),
    mitem("sealed_tile_slab"), mitem("sealed_tile_stairs"), mitem("sealed_keg"), mitem("sealed_pillar"),
    mitem("wrought_tile"), mitem("wrought_platform"), mitem("wrought_platform_slab"),
]

def metallurgyDecor = [
    mitem("scale"),
]

def removeStamping = [mitem("sulfur")]
def hideFromJei = [mitem("sulfur_ore"), mitem("sulfur_clump"), mitem("mug")] + removeStamping

def mugs = [
    "boiling_wort", "snowpoff"
]

for (def it in mugs) {
    def mug = item("soot:mug").withNbt(["Fluid": ["Amount": 250, "FluidName": it]])
    mods.jei.ingredient.hide(mug)
}

TooltipEvents.setModTier("soot", 4)
for (def it in decor) TooltipEvents.setTier(it, 1)
for (def it in metallurgyDecor) TooltipEvents.setTier(it, 3)
for (def it in removeStamping) mods.embers.stamper.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)
