import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def getQuartzList(name) {
    def output = [item("botania:quartzstairs${name}"), item("botania:quartzslab${name}half")]
    for (int i in 0..2) output.add(item("botania:quartztype${name}", i))
    return output
}

def lapisItems = [
    item("botania:pavement", 2), item("botania:pavement2slab"), item("botania:pavement2stairs"),
]
for (int i in 0..15) lapisItems.add(item("botania:custombrick", i))
def redstoneItems = [
    item("botania:cacophonium"), item("botania:pavement", 3), item("botania:pavement3slab"), item("botania:pavement3stairs"),
]

def firstMagicItems = [item("botania:baublebox")]

def enderItems = [
    item("botania:manaresource", 15), item("botania:itemfinder"), item("botania:endereyeblock"),
]

def equipmentItems = ["helm", "chest", "legs", "boots", "helmreveal"]
def mainTools = ["pick", "shovel", "axe", "sword", "shears"]

def tier1Items = [
    item("botania:pool"), item("botania:pool", 2), item("botania:runealtar"),
    item("botania:twigwand"), item("botania:manatablet"), item("botania:managun"), item("botania:manacookie"),
    item("botania:dirtrod"), item("botania:tinyplanet"), item("botania:manaring"), item("botania:auraring"),
    item("botania:travelbelt"), item("botania:knockbackbelt"), item("botania:slingshot"),
    item("botania:icependant"), item("botania:lavapendant"),
    item("botania:magnetring"), item("botania:waterring"), item("botania:miningring"),
    item("botania:enderdagger"), item("botania:waterrod"), item("botania:tornadorod"), item("botania:firerod"),
    item("botania:quartz"), item("botania:quartz", 1), item("botania:quartz", 2),
    item("botania:manabottle"), item("botania:enderhand"), item("botania:diviningrod"),
    item("botania:manainkwell"), item("botania:vial"), item("botania:brewvial"), item("botania:spellcloth"),
    item("botania:craftinghalo"), item("botania:monocle"), item("botania:cobblerod"), item("botania:smeltrod"),
    item("botania:livingwoodbow"), item("botania:swapring"), item("botania:phantomink"), item("botania:poolminecart"),
    item("botania:temperancestone"), item("botania:incensestick"), item("botania:obediencestick"),
    item("botania:autocraftinghalo"), item("botania:sextant"), item("botania:speedupbelt"), item("botania:dodgering"),
    item("botania:invisibilitycloak"), item("botania:cloudpendant"), item("botania:thirdeye"), item("botania:goddesscharm"),
    item("botania:managlasspane"), item("botania:spreader"), item("botania:spreader", 1),
    item("botania:pylon"), item("botania:pistonrelay"), item("botania:distributor"), item("botania:manavoid"),
    item("botania:manadetector"), item("botania:turntable"), item("botania:tinyplanetblock"),
    item("botania:foresteye"), item("botania:storage"), item("botania:storage", 3),
    item("botania:forestdrum"), item("botania:forestdrum", 2), item("botania:platform"), item("botania:tinypotato"),
    item("botania:brewery"), item("botania:managlass"), item("botania:pump"), item("botania:incenseplate"),
    item("botania:hourglass"), item("botania:bellows"), item("botania:teruterubozu"), item("botania:avatar"),
] + getQuartzList("dark") + getQuartzList("mana") + getQuartzList("blaze")
for (int i in [0, 1, 2, 3, 6, 11, 16, 17, 22, 23]) tier1Items.add(item("botania:manaresource", i))
for (int i in [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 12, 13, 15, 16, 17, 22]) tier1Items.add(item("botania:lens", i))
for (int i in 0..8) tier1Items.add(item("botania:rune", i))
for (int i in 0..8) tier1Items.add(item("botania:grassseeds", i))
for (int i in 0..2) tier1Items.add(item("botania:grasshorn", i))
for (int i in 0..8) tier1Items.add(item("botania:craftpattern", i))
for (int i in 0..5) tier1Items.add(item("botania:altgrass", i))
for (int i in 0..33) tier1Items.add(item("botania:cosmetic", i))
for (int i in 0..15) tier1Items.add(item("botania:miniisland", i))
for (def it in equipmentItems + mainTools) tier1Items.add(item("botania:manasteel${it}"))
for (def it in ["helm", "chest", "legs", "boots"]) tier1Items.add(item("botania:manaweave${it}"))

def tier2Items = [
    item("botania:terraformrod"), item("botania:manamirror"), item("botania:terrasword"), item("botania:terrapick"),
    item("botania:manaringgreater"), item("botania:auraringgreater"), item("botania:terraaxe"),
    item("botania:quartz", 6), item("botania:spark"), item("botania:bloodpendant"), item("botania:thornchakram"),
    item("botania:exchangerod"), item("botania:magnetringgreater"), item("botania:alchemycatalyst"),
    item("botania:storage", 1), item("botania:terraplate"),
] + getQuartzList("sunny")
for (int i in [4, 18]) tier2Items.add(item("botania:manaresource", i))
for (int i in [8, 11]) tier2Items.add(item("botania:lens", i))
for (int i in 9..15) tier2Items.add(item("botania:rune", i))
for (int i in 0..15) {
    tier2Items.add(item("botania:biomestonea", i))
    tier2Items.add(item("botania:biomestonea${i}stairs"))
    tier2Items.add(item("botania:biomestonea${i}slab"))
    tier2Items.add(item("botania:biomestoneb", i))
}
for (int i in 0..7) {
    tier2Items.add(item("botania:biomestonea0wall", i))
    tier2Items.add(item("botania:biomestoneb${i}stairs"))
    tier2Items.add(item("botania:biomestoneb${i}slab"))
}
for (def it in equipmentItems) tier2Items.add(item("botania:terrasteel${it}"))
for (int i in 1..8) tier2Items.add(item("botania:altar", i))

def industrialTier = [item("botania:quartz", 3), item("botania:quartz", 4)] + getQuartzList("lavender") + getQuartzList("blaze")

def gaiaDrops = [
    item("botania:recordgaia1"), item("botania:recordgaia2"), item("botania:manaresource", 5)
]
def gaiaDropsT2 = [
    item("botania:blacklotus"), item("botania:blacklotus", 1), item("botania:overgrowthseed"),
    item("botania:pinkinator"), item("botania:dice")
]
for (int i in 0..5) gaiaDropsT2.add(item("botania:ancientwill", i))

def diceItems = [
    item("botania:infinitefruit"), item("botania:kingkey"), item("botania:flugeleye"), item("botania:thorring"),
    item("botania:odinring"), item("botania:lokiring"),
]
def tier3Items = [
    item("botania:divacharm"), item("botania:openbucket"),
    item("botania:pixiering"), item("botania:supertravelbelt"), item("botania:rainbowrod"),
    item("botania:virus"), item("botania:virus", 1), item("botania:reachring"), item("botania:skydirtrod"),
    item("botania:superlavapendant"), item("botania:quartz", 5), item("botania:gravityrod"),
    item("botania:vial", 1), item("botania:brewflask"), item("botania:missilerod"),
    item("botania:holycloak"), item("botania:unholycloak"), item("botania:balancecloak"),
    item("botania:clip"), item("botania:thornchakram", 1), item("botania:worldseed"),
    item("botania:corporeaspark"), item("botania:corporeaspark", 1), item("botania:crystalbow"),
    item("botania:keepivy"), item("botania:blackholetalisman"), item("botania:slimebottle"),
    item("botania:starsword"), item("botania:thundersword"), item("botania:gaiahead"),
    item("botania:supercloudpendant"), item("botania:astrolabe"),
    item("botania:dreamwood0stairs"), item("botania:dreamwood0slab"), item("botania:dreamwood0wall"),
    item("botania:dreamwood1stairs"), item("botania:dreamwood1slab"), item("botania:pylon", 1),
    item("botania:shimmerrock0slab"), item("botania:shimmerrock0stairs"),
    item("botania:shimmerwoodplanks0slab"), item("botania:shimmerwoodplanks0stairs"),
    item("botania:elfglasspane"), item("botania:bifrostpermpane"), item("botania:opencrate", 1),
    item("botania:spreader", 2), item("botania:spreader", 3), item("botania:pool", 3), item("botania:pylon", 2),
    item("botania:storage", 2), item("botania:storage", 4), item("botania:forestdrum", 1), item("botania:platform", 1),
    item("botania:conjurationcatalyst"), item("botania:spawnerclaw"), item("botania:starfield"), item("botania:elfglass"),
    item("botania:prism"), item("botania:ghostrail"),
    item("botania:sparkchanger"), item("botania:cocoon"), item("botania:lightlauncher"), item("botania:manabomb"),
    item("botania:bifrostperm"), item("botania:shimmerrock"), item("botania:shimmerwoodplanks"),
    item("botania:enchantedsoil"), 
] + diceItems + gaiaDrops + gaiaDropsT2 + getQuartzList("elf")
for (int i in [5, 7, 8, 9, 12, 13, 14, 19]) tier3Items.add(item("botania:manaresource", i))
for (int i in [14, 18, 19, 20, 21, 23]) tier3Items.add(item("botania:lens", i))
for (int i in 0..8) tier3Items.add(item("botania:flighttiara", i))
for (int i in 0..19) tier3Items.add(item("botania:laputashard", i))
for (def it in equipmentItems + mainTools) tier3Items.add(item("botania:elementium${it}"))
for (int i in 0..3) tier3Items.add(item("botania:sparkupgrade", i))
for (int i in 0..3) tier3Items.add(item("botania:lightrelay", i))
for (int i in 0..5) tier3Items.add(item("botania:dreamwood", i))
for (def i in ["container", "dispenser", "comparator", "fertilizer", "relay", "interceptor"])
    tier3Items.add(item("botania:redstring${i}"))
for (def i in ["index", "funnel", "interceptor", "crystalcube", "retainer"])
    tier3Items.add(item("botania:corporea${i}"))

def creativeItems = [
    item("botania:pool", 1),
]

def removeThese = [
    item("botania:spawnermover"), item("botania:glasspick"), item("botania:rfgenerator"), item("botania:animatedtorch"),
]

def hideFromJei = [
    item("botania:platform", 2), item("botania:enchanter"), item("botania:bifrost"), item("botania:cacophoniumblock")
] + removeThese

for (def it in lapisItems) TooltipEvents.setTier(it, 2)
for (def it in redstoneItems) TooltipEvents.setTier(it, 3)
for (def it in firstMagicItems) TooltipEvents.setTier(it, 5)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in tier1Items) TooltipEvents.setTier(it, 9)
for (def it in industrialTier) TooltipEvents.setTier(it, 11)
for (def it in tier2Items) TooltipEvents.setTier(it, 12)
for (def it in tier3Items) TooltipEvents.setTier(it, 14)
for (def it in creativeItems) TooltipEvents.setTier(it, 17)
for (def it in removeThese) crafting.removeByOutput(it)
for (def it in hideFromJei) mods.jei.ingredient.hide(it)

TooltipEvents.setUnlock(item("botania:altar"), 9)
TooltipEvents.setUnlock(item("botania:alfheimportal"), 14)

for (def it in gaiaDrops) TooltipEvents.setTooltip(it, "Dropped by the Guardian of Gaia.")
for (def it in gaiaDropsT2) TooltipEvents.setTooltip(it, "Dropped by the 2nd tier Guardian of Gaia.")
for (def it in diceItems) TooltipEvents.setTooltip(it, "Reward from the Dice of Fate.")
TooltipEvents.setTooltip(item("botania:gaiahead"), "Dropped by the Guardian of Gaia when killed with an Elementium Axe.")
TooltipEvents.setTooltip(item("botania:manaresource", 4), "Made with Terrestrial Agglomeration Plate.")
TooltipEvents.setTooltip(item("botania:manaresource", 15), "Obtained by right-clicking with an Empty Bottle in the End.")

def tier1Flowers = [
    // generating
    "hydroangeas", "thermalily", "endoflame", "munchdew", "kekimurus", "gourmaryllis",
    // functional
    "dreadthorn", "tangleberrie", "bellethorn", "manastar", "tigerseye", "jadedAmaranthus",
    "exoflame", "hopperhock", "jiyuulia", "medumone", "clayconia", "solegnolia",
    "daffomill", "rannuncarpus", "agricarnation", "hyacidus", "bergamute", "fallenKanade",
]
def tier2Flowers = [
    // generating
    "arcanerose", "rafflowsia", "narslimmus", "dandelifeon",
    // functional
    "pollidisiac", "marimorphosis", "vinculotus",
]
def tier3Flowers = [
    // generating
    "entropinnyum", "spectrolus", "shulk_me_not",
    // functional
    "bubbell", "loonium", "heiseiDream", "spectranthemum", "orechid", "orechidIgnem",
]

def setFlowerTier(name, tier) {
    def flower = item("botania:specialflower").withNbt(["type": name])
    def flower2 = item("botania:floatingspecialflower").withNbt(["type": name])
    def flower3 = item("botania:specialflower").withNbt(["type": name + "Chibi"])
    def flower4 = item("botania:floatingspecialflower").withNbt(["type": name + "Chibi"])
    def predicate = stack -> {
        return stack in flower || stack in flower2 || stack in flower3 || stack in flower4
    }
    TooltipEvents.addTierPredicate(predicate, tier)
}

def setFloatingFlowerTier(name, tier) {
    def flower2 = item("botania:floatingspecialflower").withNbt(["type": name])
    def flower4 = item("botania:floatingspecialflower").withNbt(["type": name + "Chibi"])
    def predicate = stack -> {
        return stack in flower2 || stack in flower4
    }
    TooltipEvents.addTierPredicate(predicate, tier)
}

for (def it in tier1Flowers) setFlowerTier(it, 9)
for (def it in tier2Flowers) setFlowerTier(it, 12)
for (def it in tier3Flowers) setFlowerTier(it, 14)
setFloatingFlowerTier("puredaisy", 9)

/*
recipes needed:
- livingwood twig (tier 1 -> tier 9)
- terrestrial JEI handler
- redstone root (tier 3 -> tier 9)
- crafting placeholder (tier 1 -> tier 9)
- only keep 1 red string recipe
- tier 3 runes (tier 9 -> tier 12)
- quartz progression:
  mana -> resonator -> smokey
  smokey -> offering to the gods -> blaze
  blaze -> atomic reshaper -> lavender
  lavender -> elemental fuel alloying -> red
  red -> ? -> sunny
  sunny -> elven trade -> elven
- spark (tier 3 -> tier 12)
- tainted blood pendant (tier 9 -> tier 12)
  - may be better to swap pendant and flask
- bauble case (tier 9 -> tier 5)
- petal apothecary (tier 1 -> end of tier 8)
  - also implement the biofuel thing
- kekimurus (tier 14 -> tier 9)
- narslimmus (tier 9 -> tier 12)
- entropinnyum (tier 12 -> tier 14)
- munchdew (tier 12 -> tier 9)
- rosa arcana (tier 9 -> tier 12)
- rafflowsia (tier 14 -> tier 12)
- dandelifeon (tier 14 -> tier 12)
- mana spreader (tier 3 -> tier 9)
- mana pool and diluted mana pool (tier 1 -> tier 9)
- natura pylon (tier 12 -> end of tier 13)
- mana void (tier 5 -> tier 9)
- mana detector (tier 3 -> tier 9)
- spreader turntable (tier 3 -> tier 9)
- alchemy catalyst (tier 9 -> tier 12)
- elven gateway core (tier 12 -> end of tier 13)
- terrestrial agglomeration plate (tier 9 -> tier 12)
- incense plate (tier 1 -> tier 9)
- cellular block (tier 1 -> tier 12)
*/
