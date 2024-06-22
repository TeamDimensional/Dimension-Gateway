import classes.GatewayHelpers

def buildList(index) {
    def output = [
        item("immersiveengineering:storage", index), item("immersiveengineering:storage_slab", index),
        item("immersiveengineering:sheetmetal", index), item("immersiveengineering:sheetmetal_slab", index),
    ]
    for (int i in [index, index + 9, index + 20, index + 30]) output.add(item("immersiveengineering:metal", i))
    return output
}

def buildListOre(index) {
    def output = buildList(index)
    output.add(item("immersiveengineering:ore", index))
    return output
}


def copperItems = buildListOre(0)
copperItems += [
    item("immersiveengineering:metal_decoration0"), item("immersiveengineering:material", 20),
    item("immersiveengineering:wirecoil"), item("immersiveengineering:wirecoil", 6),
    item("immersiveengineering:bullet", 1),
]

def leadItems = buildListOre(2)
leadItems += [
    item("immersiveengineering:stone_decoration", 7), item("immersiveengineering:stone_decoration_slab", 7),
    item("immersiveengineering:stone_decoration_stairs_concrete_leaded")
]

def silverItems = buildListOre(3)
def nickelItems = buildListOre(4)
def uraniumItems = buildListOre(5)
def constantanItems = buildList(6)
def electrumItems = buildList(7)

electrumItems += [
    item("immersiveengineering:metal_decoration0", 1), item("immersiveengineering:material", 21),
    item("immersiveengineering:wirecoil", 1), item("immersiveengineering:wirecoil", 7),
]

def steelTools = []
for (def part in ["pickaxe", "shovel", "axe", "hoe", "sword"]) {
    steelTools.add(item("immersiveengineering:${part}_steel"))
}

def steelItems = buildList(8) + steelTools

steelItems += [
    item("immersiveengineering:material", 2), item("immersiveengineering:material", 23),
    item("immersiveengineering:wirecoil", 4), item("immersiveengineering:wirecoil", 2),
    item("immersiveengineering:metal_ladder", 1), item("immersiveengineering:tool", 1),
    item("immersiveengineering:shield"), item("immersiveengineering:maintenance_kit"),
    item("immersiveengineering:metal_decoration0", 2),
]
for (int i in 0..2) steelItems.add(item("immersiveengineering:steel_scaffolding_stairs${i}"))
for (int i in 1..3) steelItems.add(item("immersiveengineering:metal_decoration1_slab", i))
for (int i in 0..7) steelItems.add(item("immersiveengineering:mold", i))
for (int i in [0, 1, 2, 3, 10, 11, 15, 17]) {
    int idKey = i / 10 + 1
    int meta = i % 10
    steelItems.add(item("immersiveengineering:metal_decoration${idKey}", meta))
}
for (def part in ["feet", "legs", "chest", "head"]) steelItems.add(item("immersiveengineering:steel_armor_${part}"))

def mainMod = [
    // blast furnace
    item("immersiveengineering:stone_decoration", 1), item("immersiveengineering:stone_decoration_slab", 1),
    // kinetic gens
    item("immersiveengineering:metal_device1", 2),
    item("immersiveengineering:wooden_device1", 0), item("immersiveengineering:material", 10),
    item("immersiveengineering:wooden_device1", 1), item("immersiveengineering:material", 11),
    item("immersiveengineering:metal_device1", 3),
    item("immersiveengineering:material", 12),
    // engineering blocks
    item("immersiveengineering:metal_decoration0", 3),
    item("immersiveengineering:metal_decoration0", 4),
    item("immersiveengineering:metal_decoration0", 5),
    // capacitors
    item("immersiveengineering:metal_device0"),
    item("immersiveengineering:metal_device0", 1),
    item("immersiveengineering:metal_device0", 2),
    // things that use mechanical components
    item("immersiveengineering:material", 8),
    item("immersiveengineering:material", 9),
    item("immersiveengineering:metal_device0", 5),
    // misc
    item("immersiveengineering:metal_device1", 1),
    item("immersiveengineering:metal_device1", 4),
    item("immersiveengineering:metal_device1", 5),
    item("immersiveengineering:metal_device1", 9),
    item("immersiveengineering:tool", 2),
    item("immersiveengineering:skyhook"),
    item("immersiveengineering:powerpack"),
    // machines, shown in JEI
    item("immersiveengineering:stone_device", 1),
    item("immersiveengineering:metal_multiblock", 1),
    item("immersiveengineering:metal_multiblock"),
    item("immersiveengineering:metal_multiblock", 1),
    item("immersiveengineering:metal_multiblock", 5),
    item("immersiveengineering:metal_multiblock", 6),
    item("immersiveengineering:metal_multiblock", 7),
    item("immersiveengineering:metal_multiblock", 8),
    item("immersiveengineering:metal_multiblock", 9),
    item("immersiveengineering:metal_multiblock", 15),
]
for (int i in 0..13) mainMod.add(item("immersiveengineering:connector", i))
for (int i in [7, 13, 17, 18, 19, 24, 25, 26, 27]) mainMod.add(item("immersiveengineering:material", i))

def arcTier = [
    // reinforced blast furnace
    item("immersiveengineering:stone_decoration", 2), item("immersiveengineering:stone_decoration_slab", 2),
    item("immersiveengineering:metal_device1"),
    // jei
    item("immersiveengineering:stone_device", 2),
    item("immersiveengineering:metal_multiblock", 13),
]

def highVoltageTier = [
    item("immersiveengineering:metal_decoration0", 6),
    item("immersiveengineering:metal_decoration0", 7),
    item("immersiveengineering:metal_device1", 7),
    item("immersiveengineering:metal_device1", 13),
    item("immersiveengineering:graphite_electrode"),
    item("immersiveengineering:fluorescent_tube"),
    item("immersiveengineering:metal_device1", 8),
]

def redstoneItems = [
    item("immersiveengineering:wooden_device0", 3), item("immersiveengineering:wooden_device0", 6),
    item("immersiveengineering:wooden_device0", 7), item("immersiveengineering:conveyor"),
    item("immersiveengineering:wirecoil", 5),
]
def goldItems = [
    item("immersiveengineering:sheetmetal", 10), item("immersiveengineering:sheetmetal_slab", 10),
]

def revolverItems = [
    item("immersiveengineering:metal_device1", 10),
    item("immersiveengineering:metal_device1", 11),
    item("immersiveengineering:revolver"), item("immersiveengineering:speedloader"),
    item("immersiveengineering:bullet"), item("immersiveengineering:bullet", 2),
    item("immersiveengineering:chemthrower"), item("immersiveengineering:railgun"),
]
for (int i in 3..13) revolverItems.add(item("immersiveengineering:toolupgrade", i))
for (int i in [14, 15, 16]) revolverItems.add(item("immersiveengineering:material", i))

def creativeItems = [item("immersiveengineering:metal_device0", 3)]
def removedItems = [
    item("immersiveengineering:drill"), item("immersiveengineering:drillhead"), item("immersiveengineering:drillhead:1"),
    item("immersiveengineering:toolupgrade"),
    item("immersiveengineering:toolupgrade", 1),
    item("immersiveengineering:toolupgrade", 2),
]
def hideFromJei = [
    item("immersiveengineering:coresample")
] + removedItems

for (def it in copperItems) GatewayHelpers.setTier(it, 2)
for (def it in silverItems) GatewayHelpers.setTier(it, 3)
for (def it in leadItems) GatewayHelpers.setTier(it, 3)
for (def it in nickelItems) GatewayHelpers.setTier(it, 3)
for (def it in uraniumItems) GatewayHelpers.setTier(it, 3)
for (def it in constantanItems) GatewayHelpers.setTier(it, 3)
for (def it in electrumItems) GatewayHelpers.setTier(it, 3)
for (def it in steelItems) GatewayHelpers.setTier(it, 3)
for (def it in goldItems) GatewayHelpers.setTier(it, 3)
for (def it in redstoneItems) GatewayHelpers.setTier(it, 3)
for (def it in mainMod) GatewayHelpers.setTier(it, 3)
for (def it in arcTier) GatewayHelpers.setTier(it, 4)
for (def it in highVoltageTier) GatewayHelpers.setTier(it, 6)
for (def it in revolverItems) GatewayHelpers.setTier(it, 4)
for (def it in creativeItems) GatewayHelpers.setTier(it, 17)
for (def it in hideFromJei) mods.jei.ingredient.hide(it)
for (def it in removedItems) crafting.removeByOutput(it)
for (def tool in steelTools) GatewayHelpers.banTool(tool)

/*
Needed recipes:
Coke Brick and Kiln Brick - should require Nether
Blast Brick (tier 1 -> tier 3)
Reinforced Blast Brick (tier 3 -> tier 4)
Windmill (tier 1 -> tier 3)
Generator block (tier 3 -> tier 6)
Radiator block (tier 3 -> tier 6)
All connectors (tiers 1 and 2 -> tier 3)
Creative capacitor
Blast Furnace Preheater (tier 3 -> tier 4)
Core Sample Drill (tier 3 -> tier 6)
Tesla Coil (tier 3 -> tier 6)
Garden Cloche (tier 3 -> tier 6)
Chutes that are called "Conveyor" in code (tier 1, 2 -> tier 3)
Iron Mechanical Component (tier 2 -> tier 3)
Waterwheel Segment (tier 1 -> tier 3)
Windmill Blade (tier 1 -> tier 3)
Windmill Sail (tier 1 -> tier 3)
Wooden Grip (tier 2 -> tier 3)
Engineer's Wire Cutters (tier 1 -> tier 3)
Revolver Barrel (tier 3 -> tier 4)
Revolver Drum (tier 3 -> tier 4)
Revolver Hammer (tier 3 -> tier 4)
Graphite Electrode (tier 3 -> tier 6)
*/
