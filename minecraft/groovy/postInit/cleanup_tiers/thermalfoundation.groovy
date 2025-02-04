import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("thermalfoundation:${name}", k)
}

def armorPieces = ["plate", "helmet", "legs", "boots"]
def bronzeArmor = []
for (def it in armorPieces) bronzeArmor.add(mitem("armor.${it}_bronze"))
def invarArmor = []
for (def it in armorPieces) invarArmor.add(mitem("armor.${it}_invar"))

def tier2Items = [
    mitem("ore"), mitem("ore", 1), mitem("storage"), mitem("storage", 1), mitem("storage_alloy", 3), mitem("storage_resource", 1), mitem("wrench"),
] + bronzeArmor
for (int i in [0, 1, 2, 3, 5]) tier2Items.add(mitem("ore_fluid", i))
for (int i in [128, 129, 163, 192, 193, 227, 893, 894]) tier2Items.add(mitem("material", i))

def tier3Items = [
    mitem("ore", 2), mitem("ore", 3), mitem("ore", 5), mitem("storage", 2), mitem("storage", 3), mitem("storage", 5),
    mitem("tome_lexicon"), mitem("fertilizer"), mitem("bait"),
] + invarArmor
for (int i in [0, 1, 2, 4]) tier3Items.add(mitem("storage_alloy", i))
for (int i in [0, 1, 24, 25, 32, 33, 64, 65, 66, 67, 68, 69, 96, 97, 98, 99, 100, 130, 131, 133, 160, 161, 162, 164,
               194, 195, 197, 224, 225, 226, 228, 256, 257, 258, 259, 260, 261, 288, 289, 290, 291, 292,
               320, 321, 322, 323, 324, 325, 352, 353, 354, 355, 356, 512, 768, 769, 771, 772, 800, 864, 1024])
    tier3Items.add(mitem("material", i))
for (int i in 0..15) tier3Items.add(mitem("rockwool", i))

def tier4Items = [mitem("diagram_redprint")]
for (int i in [16, 17, 26, 27]) tier4Items.add(mitem("material", i))

def tier5Items = [mitem("material", 770)]

def enderItems = [
    mitem("ore_fluid", 4), mitem("tome_experience"), mitem("material", 895),
]

def techTierItems = [
    mitem("storage", 6), mitem("security"), mitem("fertilizer", 1), mitem("fertilizer", 2), mitem("bait", 1), mitem("bait", 2), mitem("meter"),
]
for (int i in [5, 6, 7]) techTierItems.add(mitem("storage_alloy", i))
for (int i in 0..6) techTierItems.add(mitem("glass", i))
for (int i in 0..7) techTierItems.add(mitem("glass_alloy", i))
for (int i in [0, 1, 33]) techTierItems.add(mitem("upgrade", i))
for (int i in 0..15) techTierItems.add(mitem("dye", i))
for (int i in [70, 101, 102, 103, 134, 165, 166, 167, 198, 229, 230, 231, 262, 293, 294, 295,
               326, 357, 358, 359, 513, 514, 515, 801, 816, 817, 818, 819, 832, 833, 865, 866])
    techTierItems.add(mitem("material", i))

def elementalDrops = []
for (int i in [1025, 1026, 1027, 2048, 2049, 2050, 2051, 2052, 2053]) elementalDrops.add(mitem("material", i))

def industrialTierItems = []
for (int i in [2, 3, 34, 35]) industrialTierItems.add(mitem("upgrade", i))

def rocketScienceItems = [mitem("storage", 7), mitem("storage", 8)]
for (int i in 7..8) rocketScienceItems.add(mitem("glass", i))
for (int i in [71, 72, 135, 136, 199, 200, 263, 264, 327, 328, 1028]) rocketScienceItems.add(mitem("material", i))

def creativeItems = [mitem("upgrade", 256)]

def removedItems = []
for (int i in [22, 23, 640, 656, 657]) removedItems.add(mitem("material", i))

def hideFromJei = [
    mitem("geode"), mitem("ore", 6), mitem("ore", 7), mitem("ore", 8), mitem("material", 892), mitem("fluid_crude_oil")
] + removedItems
for (int i in [0, 1, 64, 65, 66, 67, 68, 69, 70, 71, 72, 96, 97, 98, 99, 100, 101, 102, 103]) hideFromJei.add(mitem("coin", i))

for (def it in tier2Items) TooltipEvents.setTier(it, 2)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in tier5Items) TooltipEvents.setTier(it, 5)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in techTierItems) TooltipEvents.setTier(it, 7)
for (def it in elementalDrops) TooltipEvents.setTier(it, 8)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in industrialTierItems) TooltipEvents.setTier(it, 8)
for (def it in rocketScienceItems) TooltipEvents.setTier(it, 12)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in removedItems) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)
