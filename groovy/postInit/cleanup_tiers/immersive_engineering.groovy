import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def uraniumItems = [
    item("immersiveengineering:sheetmetal", 5), item("immersiveengineering:sheetmetal_slab", 5),
]

def slabs = []
for (int i in [0, 1, 2, 10]) slabs.add(item("immersiveengineering:stone_decoration_slab", i))

def steelTools = []
for (def part in ["pickaxe", "shovel", "axe", "hoe", "sword"]) {
    steelTools.add(item("immersiveengineering:${part}_steel"))
}
def steelArmor = []
for (def part in ["feet", "legs", "chest", "head"]) steelArmor.add(item("immersiveengineering:steel_armor_${part}"))

def metallurgyTier = [
    item("immersiveengineering:storage", 8), item("immersiveengineering:stone_decoration", 1), item("immersiveengineering:stone_decoration", 7),
    item("immersiveengineering:stone_decoration", 8), item("immersiveengineering:stone_decoration_slab", 7),
    item("immersiveengineering:stone_decoration_stairs_concrete_leaded"), item("immersiveengineering:metal_ladder", 1),
    item("immersiveengineering:conveyor"), item("immersiveengineering:tool", 1), item("immersiveengineering:tool", 2),
    item("immersiveengineering:toolbox"), item("immersiveengineering:drill"),
    item("immersiveengineering:drillhead"), item("immersiveengineering:drillhead", 1), item("immersiveengineering:jerrycan"),
    item("immersiveengineering:powerpack"), item("immersiveengineering:shield"), item("immersiveengineering:maintenance_kit"),
    item("immersiveengineering:skyhook"),
] + steelTools + steelArmor
for (int i in [2, 3, 5, 6, 7]) metallurgyTier.add(item("immersiveengineering:wooden_device0", i))
for (int i in [0, 1]) metallurgyTier.add(item("immersiveengineering:wooden_device1", i))
for (int i in [0, 1, 2, 3, 4, 6, 7, 8, 9, 10]) {
    metallurgyTier.add(item("immersiveengineering:sheetmetal", i))
    metallurgyTier.add(item("immersiveengineering:sheetmetal_slab", i))
}
for (int i in [0, 1, 3, 4, 5]) metallurgyTier.add(item("immersiveengineering:metal_decoration0", i))
for (int i in [0, 1, 2, 3]) {
    metallurgyTier.add(item("immersiveengineering:metal_decoration1", i))
    metallurgyTier.add(item("immersiveengineering:metal_decoration1_slab", i))
}
for (int i in [0, 1, 5, 6]) metallurgyTier.add(item("immersiveengineering:metal_decoration2", i))
for (int i in [0, 1, 2]) metallurgyTier.add(item("immersiveengineering:steel_scaffolding_stairs${i}"))
for (int i in [0, 1, 2, 3, 6, 7, 9, 10, 11, 12, 13]) metallurgyTier.add(item("immersiveengineering:connector", i))
for (int i in [0, 1, 2, 4, 5, 6]) metallurgyTier.add(item("immersiveengineering:metal_device0", i))
for (int i in [1, 2, 3, 4, 5, 6, 8, 9]) metallurgyTier.add(item("immersiveengineering:metal_device1", i))
for (int i in [2, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 20, 21, 22, 23, 24, 25, 26, 27]) metallurgyTier.add(item("immersiveengineering:material", i))
for (int i in [0, 1, 3, 4, 5, 6, 7]) metallurgyTier.add(item("immersiveengineering:wirecoil", i))
for (int i in 0..7) metallurgyTier.add(item("immersiveengineering:mold", i))

def arcTier = [
    item("immersiveengineering:stone_decoration", 2), item("immersiveengineering:metal_device1"),
    item("immersiveengineering:graphite_electrode"), item("immersiveengineering:fluorescent_tube"),
]
for (int i in [18, 19]) arcTier.add(item("immersiveengineering:material", i))

def hvTier = [
    item("immersiveengineering:metal_device1", 7), item("immersiveengineering:metal_device1", 13),
    item("immersiveengineering:wirecoil", 2),
]
for (int i in [2, 6, 7]) hvTier.add(item("immersiveengineering:metal_decoration0", i))
for (int i in [4, 5, 8]) hvTier.add(item("immersiveengineering:connector", i))

metallurgyTier += [
    item("immersiveengineering:metal_device1", 10), item("immersiveengineering:metal_device1", 11),
    item("immersiveengineering:revolver"), item("immersiveengineering:speedloader"),
    item("immersiveengineering:chemthrower"), item("immersiveengineering:railgun"),
]
for (int i in [0, 1, 2]) metallurgyTier.add(item("immersiveengineering:bullet", i))
for (int i in 0..13) metallurgyTier.add(item("immersiveengineering:toolupgrade", i))
for (def i in ["chest", "head", "legs", "feet"]) metallurgyTier.add(item("immersiveengineering:faraday_suit_${i}"))

def removeRecipes = [] + slabs + uraniumItems
def hideFromJei = [item("immersiveengineering:coresample")] + removeRecipes
def creativeItems = [item("immersiveengineering:metal_device0", 3)]

for (def it in metallurgyTier) TooltipEvents.setTier(it, 3)
for (def it in arcTier) TooltipEvents.setTier(it, 4)
for (def it in hvTier) TooltipEvents.setTier(it, 6)
for (def it in creativeItems) TooltipEvents.setTier(it, 17)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def tool in steelTools) GatewayHelpers.banTool(tool)
