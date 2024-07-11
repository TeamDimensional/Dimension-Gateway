import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def armorPieces = ["plate", "helmet", "legs", "boots"]
def bronzeArmor = []
for (def it in armorPieces) bronzeArmor.add(item("thermalfoundation:armor.${it}_bronze"))
def invarArmor = []
for (def it in armorPieces) invarArmor.add(item("thermalfoundation:armor.${it}_invar"))

def tier2Items = [
    item("thermalfoundation:ore"), item("thermalfoundation:ore", 1),
    item("thermalfoundation:storage"), item("thermalfoundation:storage", 1),
    item("thermalfoundation:storage_alloy", 3), item("thermalfoundation:storage_resource"), item("thermalfoundation:storage_resource", 1),
    item("thermalfoundation:wrench"),
] + bronzeArmor
for (int i in [0, 1, 2, 3, 5]) tier2Items.add(item("thermalfoundation:ore_fluid", i))
for (int i in [128, 129, 163, 192, 193, 227, 893, 894]) tier2Items.add(item("thermalfoundation:material", i))

def tier3Items = [
    item("thermalfoundation:ore", 2), item("thermalfoundation:ore", 3), item("thermalfoundation:ore", 5),
    item("thermalfoundation:storage", 2), item("thermalfoundation:storage", 3), item("thermalfoundation:storage", 5),
    item("thermalfoundation:tome_lexicon"), item("thermalfoundation:fertilizer"), item("thermalfoundation:bait"),
] + invarArmor
for (int i in [0, 1, 2, 4]) tier3Items.add(item("thermalfoundation:storage_alloy", i))
for (int i in [0, 1, 24, 25, 32, 33, 64, 65, 66, 67, 68, 69, 96, 97, 98, 99, 100, 130, 131, 133, 160, 161, 162, 164,
               194, 195, 197, 224, 225, 226, 228, 256, 257, 258, 259, 260, 261, 288, 289, 290, 291, 292,
               320, 321, 322, 323, 324, 325, 352, 353, 354, 355, 356, 768, 769, 771, 772, 800, 866, 1024])
    tier3Items.add(item("thermalfoundation:material", i))

def tier4Items = []
for (int i in [16, 17, 26, 27]) tier4Items.add(item("thermalfoundation:material", i))

def tier5Items = [item("thermalfoundation:material", 770)]

def enderItems = [
    item("thermalfoundation:ore_fluid", 4), item("thermalfoundation:tome_experience"), item("thermalfoundation:material", 895),
]

def techTierItems = [
    item("thermalfoundation:storage", 6), item("thermalfoundation:security"),
    item("thermalfoundation:fertilizer", 1), item("thermalfoundation:fertilizer", 2),
    item("thermalfoundation:bait", 1), item("thermalfoundation:bait", 2), item("thermalfoundation:meter"),
]
for (int i in [5, 6, 7]) techTierItems.add(item("thermalfoundation:storage_alloy", i))
for (int i in 0..6) techTierItems.add(item("thermalfoundation:glass", i))
for (int i in 0..7) techTierItems.add(item("thermalfoundation:glass_alloy", i))
for (int i in [0, 1, 33]) techTierItems.add(item("thermalfoundation:upgrade", i))
for (int i in [0, 1, 64, 65, 66, 67, 68, 69, 70, 96, 97, 98, 99, 100, 101, 102, 103]) techTierItems.add(item("thermalfoundation:coin", i))
for (int i in 0..15) techTierItems.add(item("thermalfoundation:dye", i))
for (int i in [70, 101, 102, 103, 134, 165, 166, 167, 198, 229, 230, 231, 262, 293, 294, 295,
               326, 357, 358, 359, 513, 514, 515, 801, 816, 817, 818, 819, 832, 833, 865, 512])
    techTierItems.add(item("thermalfoundation:material", i))

def betweenlandsItems = []
for (int i in [1027, 2052, 2053]) betweenlandsItems.add(item("thermalfoundation:material", i))

def aetherItems = []
for (int i in [1026, 2050, 2051]) aetherItems.add(item("thermalfoundation:material", i))

def spaceItems = []
for (int i in [1025, 2048, 2049]) spaceItems.add(item("thermalfoundation:material", i))

def industrialTierItems = []
for (int i in [2, 3, 34, 35]) industrialTierItems.add(item("thermalfoundation:upgrade", i))

def rocketScienceItems = [
    item("thermalfoundation:storage", 7), item("thermalfoundation:storage", 8),
]
for (int i in 7..8) rocketScienceItems.add(item("thermalfoundation:glass", i))
for (int i in [71, 72]) techTierItems.add(item("thermalfoundation:coin", i))
for (int i in [71, 72, 135, 136, 199, 200, 263, 264, 327, 328, 1028]) rocketScienceItems.add(item("thermalfoundation:material", i))

def creativeItems = [item("thermalfoundation:upgrade", 256)]

def removedItems = []
for (int i in [22, 23, 640, 656, 657]) removedItems.add(item("thermalfoundation:material", i))

def hideFromJei = [
    item("thermalfoundation:geode"),
    item("thermalfoundation:ore", 6), item("thermalfoundation:ore", 7), item("thermalfoundation:ore", 8)
] + removedItems

for (def it in tier2Items) TooltipEvents.setTier(it, 2)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in tier5Items) TooltipEvents.setTier(it, 5)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in techTierItems) TooltipEvents.setTier(it, 7)
for (def it in betweenlandsItems) TooltipEvents.setTier(it, 5)
for (def it in aetherItems) TooltipEvents.setTier(it, 6)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in spaceItems) TooltipEvents.setTier(it, 8)
for (def it in industrialTierItems) TooltipEvents.setTier(it, 8)
for (def it in rocketScienceItems) TooltipEvents.setTier(it, 12)
for (def it in creativeItems) TooltipEvents.setTier(it, 17)
for (def it in removedItems) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)

/*
Recipes needed:
- Upgrade kits (Tier 7, Tier 8)
- Creative Conversion Kit
- Tome of Knowledge (Tier 4 -> Tier 6)
- Restrict metals: Platinum (Tier 3 -> Tier 7), Iridium (Tier 12), Mithril (Tier 12), Signalum, Lumium, Enderium (Tier 7)
- Remove stupid recipes for: Rich Phyto-Gro, Fluxed Phyto-Gro, Rich Aqua-Chow, Fluxed Aqua-Chow
- Gears
- Redstone Coils (Tier 3 -> Tier 7)
- Compressed Sawdust (Tier 3 -> Tier 7)
- Spawn Blitz, Basalz, Blizz (in Aether, Betweenlands, Moon)
- Mana Dust (Tier 12)

*/
