import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("immersiveengineering:${name}", k)
}
def pitem(name, k=0) {
    return item("immersivepetroleum:${name}", k)
}

def uraniumItems = [mitem("sheetmetal", 5), mitem("sheetmetal_slab", 5)]

def slabs = []
for (int i in [0, 1, 2, 10]) slabs.add(mitem("stone_decoration_slab", i))

def steelTools = []
for (def part in ["pickaxe", "shovel", "axe", "hoe", "sword"]) {
    steelTools.add(mitem("${part}_steel"))
}
def steelArmor = []
for (def part in ["feet", "legs", "chest", "head"]) steelArmor.add(mitem("steel_armor_${part}"))

def metallurgyTier = [
    mitem("storage", 8), mitem("stone_decoration", 1), mitem("stone_decoration", 7), mitem("stone_decoration", 8), mitem("stone_decoration_slab", 7),
    mitem("stone_decoration_stairs_concrete_leaded"), mitem("metal_ladder", 1), mitem("conveyor"), mitem("tool", 1), mitem("tool", 2),
    mitem("toolbox"), mitem("drill"), mitem("drillhead"), mitem("drillhead", 1), mitem("jerrycan"),
    mitem("powerpack"), mitem("shield"), mitem("maintenance_kit"), mitem("skyhook"), mitem("metal_multiblock", 15),
    mitem("stone_device", 1), pitem("metal_multiblock", 1), pitem("metal_multiblock", 3), pitem("metal_device"),
    pitem("stone_decoration"), pitem("material"), mitem("metal_decoration2", 4), pitem("schematic"), pitem("speedboat"), pitem("oil_can"),
] + steelTools + steelArmor
for (int i in [2, 3, 5, 6, 7]) metallurgyTier.add(mitem("wooden_device0", i))
for (int i in [0, 1]) metallurgyTier.add(mitem("wooden_device1", i))
for (int i in 0..4) metallurgyTier.add(pitem("upgrades", i))
for (int i in [0, 1, 2, 3, 4, 6, 7, 8, 9, 10]) {
    metallurgyTier.add(mitem("sheetmetal", i))
    metallurgyTier.add(mitem("sheetmetal_slab", i))
}
for (int i in [0, 1, 3, 4, 5]) metallurgyTier.add(mitem("metal_decoration0", i))
for (int i in [0, 1, 2, 3]) {
    metallurgyTier.add(mitem("metal_decoration1", i))
    metallurgyTier.add(mitem("metal_decoration1_slab", i))
}
for (int i in [0, 1, 5, 6]) metallurgyTier.add(mitem("metal_decoration2", i))
for (int i in [0, 1, 2]) metallurgyTier.add(mitem("steel_scaffolding_stairs${i}"))
for (int i in [0, 1, 2, 3, 6, 7, 9, 10, 11, 12, 13]) metallurgyTier.add(mitem("connector", i))
for (int i in [0, 1, 2, 4, 5, 6]) metallurgyTier.add(mitem("metal_device0", i))
for (int i in [1, 2, 3, 4, 5, 6, 8, 9]) metallurgyTier.add(mitem("metal_device1", i))
for (int i in [2, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 20, 21, 22, 23, 24, 25, 26, 27]) metallurgyTier.add(mitem("material", i))
for (int i in [0, 1, 3, 4, 5, 6, 7]) metallurgyTier.add(mitem("wirecoil", i))
for (int i in 0..7) metallurgyTier.add(mitem("mold", i))
for (int i in 0..9) metallurgyTier.add(mitem("metal_multiblock", i))

def arcTier = [
    mitem("stone_decoration", 2), mitem("metal_device1"), mitem("graphite_electrode"), mitem("fluorescent_tube"),
    mitem("metal_multiblock", 13), mitem("stone_device", 2),
]
for (int i in [18, 19]) arcTier.add(mitem("material", i))

def hvTier = [
    mitem("metal_device1", 7), mitem("wirecoil", 2), mitem("metal_multiblock", 10),
    mitem("metal_multiblock", 11), mitem("metal_multiblock", 14)
]
for (int i in [2, 6, 7]) hvTier.add(mitem("metal_decoration0", i))
for (int i in [4, 5, 8]) hvTier.add(mitem("connector", i))

def tier7Items = [mitem("metal_device1", 13)]

metallurgyTier += [
    mitem("metal_device1", 10), mitem("metal_device1", 11), mitem("revolver"), mitem("speedloader"), mitem("chemthrower"), mitem("railgun"),
]
for (int i in [0, 1, 2]) metallurgyTier.add(mitem("bullet", i))
for (int i in 0..13) metallurgyTier.add(mitem("toolupgrade", i))
for (def i in ["chest", "head", "legs", "feet"]) metallurgyTier.add(mitem("faraday_suit_${i}"))

def removeRecipes = [pitem("metal_device", 1)] + slabs + uraniumItems
def hideFromJei = [mitem("coresample")] + removeRecipes
def creativeItems = [mitem("metal_device0", 3)]

for (def it in metallurgyTier) TooltipEvents.setTier(it, 3)
for (def it in arcTier) TooltipEvents.setTier(it, 4)
for (def it in hvTier) TooltipEvents.setTier(it, 6)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def tool in steelTools) GatewayHelpers.banTool(tool)

crafting.remove("immersiveengineering:stone_decoration/blastbrick_reinforced_slab_back")
crafting.remove("immersiveengineering:stone_decoration/alloybrick_slab_back")
crafting.remove("immersiveengineering:stone_decoration/cokebrick_slab_back")
crafting.remove("immersiveengineering:stone_decoration/blastbrick_slab_back")
