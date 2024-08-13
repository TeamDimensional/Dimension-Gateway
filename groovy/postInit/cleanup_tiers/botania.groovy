import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("botania:${name}", k)
}

def getQuartzList(name) {
    def output = [mitem("quartzstairs${name}"), mitem("quartzslab${name}half")]
    for (int i in 0..2) output.add(mitem("quartztype${name}", i))
    return output
}

def lapisItems = [mitem("pavement", 2), mitem("pavement2slab"), mitem("pavement2stairs")]
for (int i in 0..15) lapisItems.add(mitem("custombrick", i))
def redstoneItems = [mitem("cacophonium"), mitem("pavement", 3), mitem("pavement3slab"), mitem("pavement3stairs")]
def firstMagicItems = [mitem("baublebox")]
def enderItems = [mitem("manaresource", 15), mitem("itemfinder"), mitem("endereyeblock")]
def equipmentItems = ["helm", "chest", "legs", "boots", "helmreveal"]
def mainTools = ["pick", "shovel", "axe", "sword", "shears"]

def tier1Items = [
    mitem("pool"), mitem("pool", 2), mitem("runealtar"), mitem("twigwand"), mitem("manatablet"), mitem("managun"), mitem("manacookie"),
    mitem("dirtrod"), mitem("tinyplanet"), mitem("manaring"), mitem("auraring"), mitem("travelbelt"), mitem("knockbackbelt"), mitem("slingshot"),
    mitem("icependant"), mitem("lavapendant"), mitem("magnetring"), mitem("waterring"), mitem("miningring"), mitem("enderdagger"),
    mitem("waterrod"), mitem("tornadorod"), mitem("firerod"), mitem("quartz"), mitem("quartz", 1), mitem("quartz", 2),
    mitem("manabottle"), mitem("enderhand"), mitem("diviningrod"), mitem("manainkwell"), mitem("vial"), mitem("brewvial"), mitem("spellcloth"),
    mitem("craftinghalo"), mitem("monocle"), mitem("cobblerod"), mitem("smeltrod"), mitem("livingwoodbow"), mitem("swapring"), mitem("phantomink"),
    mitem("poolminecart"), mitem("temperancestone"), mitem("incensestick"), mitem("obediencestick"), mitem("autocraftinghalo"), mitem("sextant"),
    mitem("speedupbelt"), mitem("dodgering"), mitem("invisibilitycloak"), mitem("cloudpendant"), mitem("thirdeye"), mitem("goddesscharm"),
    mitem("managlasspane"), mitem("spreader"), mitem("spreader", 1), mitem("pylon"), mitem("pistonrelay"), mitem("distributor"), mitem("manavoid"),
    mitem("manadetector"), mitem("turntable"), mitem("tinyplanetblock"), mitem("foresteye"), mitem("storage"), mitem("storage", 3),
    mitem("forestdrum"), mitem("forestdrum", 2), mitem("platform"), mitem("tinypotato"), mitem("brewery"), mitem("managlass"), mitem("pump"),
    mitem("incenseplate"), mitem("hourglass"), mitem("bellows"), mitem("teruterubozu"), mitem("avatar"), mitem("manainkwell"),
] + getQuartzList("dark") + getQuartzList("mana") + getQuartzList("blaze")
for (int i in [0, 1, 2, 3, 6, 11, 16, 17, 22, 23]) tier1Items.add(mitem("manaresource", i))
for (int i in [0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 12, 13, 15, 16, 17, 22]) tier1Items.add(mitem("lens", i))
for (int i in 0..8) tier1Items.add(mitem("rune", i))
for (int i in 0..8) tier1Items.add(mitem("grassseeds", i))
for (int i in 0..2) tier1Items.add(mitem("grasshorn", i))
for (int i in 0..8) tier1Items.add(mitem("craftpattern", i))
for (int i in 0..5) tier1Items.add(mitem("altgrass", i))
for (int i in 0..33) tier1Items.add(mitem("cosmetic", i))
for (int i in 0..15) tier1Items.add(mitem("miniisland", i))
for (def it in equipmentItems + mainTools) tier1Items.add(mitem("manasteel${it}"))
for (def it in ["helm", "chest", "legs", "boots"]) tier1Items.add(mitem("manaweave${it}"))

def tier2Items = [
    mitem("terraformrod"), mitem("manamirror"), mitem("terrasword"), mitem("terrapick"), mitem("manaringgreater"), mitem("auraringgreater"),
    mitem("terraaxe"), mitem("quartz", 6), mitem("spark"), mitem("bloodpendant"), mitem("thornchakram"), mitem("exchangerod"), mitem("magnetringgreater"),
    mitem("alchemycatalyst"), mitem("storage", 1), mitem("terraplate"),
] + getQuartzList("sunny")
for (int i in [4, 18]) tier2Items.add(mitem("manaresource", i))
for (int i in [8, 11]) tier2Items.add(mitem("lens", i))
for (int i in 9..15) tier2Items.add(mitem("rune", i))
for (int i in 0..15) {
    tier2Items.add(mitem("biomestonea", i))
    tier2Items.add(mitem("biomestonea${i}stairs"))
    tier2Items.add(mitem("biomestonea${i}slab"))
    tier2Items.add(mitem("biomestoneb", i))
}
for (int i in 0..7) {
    tier2Items.add(mitem("biomestonea0wall", i))
    tier2Items.add(mitem("biomestoneb${i}stairs"))
    tier2Items.add(mitem("biomestoneb${i}slab"))
}
for (def it in equipmentItems) tier2Items.add(mitem("terrasteel${it}"))
for (int i in 1..8) tier2Items.add(mitem("altar", i))

def industrialTier = [mitem("quartz", 3), mitem("quartz", 4)] + getQuartzList("lavender") + getQuartzList("red")

def gaiaDrops = [
    mitem("recordgaia1"), mitem("recordgaia2"), mitem("manaresource", 5)
]
def gaiaDropsT2 = [
    mitem("blacklotus"), mitem("blacklotus", 1), mitem("overgrowthseed"),
    mitem("pinkinator"), mitem("dice")
]
for (int i in 0..5) gaiaDropsT2.add(mitem("ancientwill", i))

def diceItems = [mitem("infinitefruit"), mitem("kingkey"), mitem("flugeleye"), mitem("thorring"), mitem("odinring"), mitem("lokiring")]
def tier3Items = [
    mitem("divacharm"), mitem("openbucket"), mitem("pixiering"), mitem("supertravelbelt"), mitem("rainbowrod"), mitem("virus"), mitem("virus", 1),
    mitem("reachring"), mitem("skydirtrod"), mitem("superlavapendant"), mitem("quartz", 5), mitem("gravityrod"), mitem("vial", 1), mitem("brewflask"),
    mitem("missilerod"), mitem("holycloak"), mitem("unholycloak"), mitem("balancecloak"), mitem("clip"), mitem("thornchakram", 1), mitem("worldseed"),
    mitem("corporeaspark"), mitem("corporeaspark", 1), mitem("crystalbow"), mitem("keepivy"), mitem("blackholetalisman"), mitem("slimebottle"),
    mitem("starsword"), mitem("thundersword"), mitem("gaiahead"), mitem("supercloudpendant"), mitem("astrolabe"),
    mitem("dreamwood0stairs"), mitem("dreamwood0slab"), mitem("dreamwood0wall"), mitem("dreamwood1stairs"), mitem("dreamwood1slab"), mitem("pylon", 1),
    mitem("shimmerrock0slab"), mitem("shimmerrock0stairs"), mitem("shimmerwoodplanks0slab"), mitem("shimmerwoodplanks0stairs"),
    mitem("elfglasspane"), mitem("bifrostpermpane"), mitem("opencrate", 1), mitem("spreader", 2), mitem("spreader", 3), mitem("pool", 3), mitem("pylon", 2),
    mitem("storage", 2), mitem("storage", 4), mitem("forestdrum", 1), mitem("platform", 1), mitem("conjurationcatalyst"), mitem("spawnerclaw"),
    mitem("starfield"), mitem("elfglass"), mitem("prism"), mitem("ghostrail"), mitem("sparkchanger"), mitem("cocoon"), mitem("lightlauncher"),
    mitem("manabomb"), mitem("bifrostperm"), mitem("shimmerrock"), mitem("shimmerwoodplanks"), mitem("enchantedsoil"), 
] + diceItems + gaiaDrops + gaiaDropsT2 + getQuartzList("elf")
for (int i in [5, 7, 8, 9, 12, 13, 14, 19]) tier3Items.add(mitem("manaresource", i))
for (int i in [14, 18, 19, 20, 21, 23]) tier3Items.add(mitem("lens", i))
for (int i in 0..8) tier3Items.add(mitem("flighttiara", i))
for (int i in 0..19) tier3Items.add(mitem("laputashard", i))
for (def it in equipmentItems + mainTools) tier3Items.add(mitem("elementium${it}"))
for (int i in 0..3) tier3Items.add(mitem("sparkupgrade", i))
for (int i in 0..3) tier3Items.add(mitem("lightrelay", i))
for (int i in 0..5) tier3Items.add(mitem("dreamwood", i))
for (def i in ["container", "dispenser", "comparator", "fertilizer", "relay", "interceptor"])
    tier3Items.add(mitem("redstring${i}"))
for (def i in ["index", "funnel", "interceptor", "crystalcube", "retainer"])
    tier3Items.add(mitem("corporea${i}"))

def creativeItems = [mitem("pool", 1)]
def removeThese = [mitem("spawnermover"), mitem("glasspick"), mitem("rfgenerator"), mitem("animatedtorch")]
def hideFromJei = [mitem("platform", 2), mitem("enchanter"), mitem("bifrost"), mitem("cacophoniumblock")] + removeThese

for (def it in lapisItems) TooltipEvents.setTier(it, 2)
for (def it in redstoneItems) TooltipEvents.setTier(it, 3)
for (def it in firstMagicItems) TooltipEvents.setTier(it, 5)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in tier1Items) TooltipEvents.setTier(it, 9)
for (def it in industrialTier) TooltipEvents.setTier(it, 11)
for (def it in tier2Items) TooltipEvents.setTier(it, 12)
for (def it in tier3Items) TooltipEvents.setTier(it, 14)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in removeThese) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)

TooltipEvents.setUnlock(mitem("altar"), 9)
TooltipEvents.setUnlock(mitem("alfheimportal"), 14)

for (def it in gaiaDrops) TooltipEvents.setTooltip(it, "Dropped by the Guardian of Gaia.")
for (def it in gaiaDropsT2) TooltipEvents.setTooltip(it, "Dropped by the 2nd tier Guardian of Gaia.")
for (def it in diceItems) TooltipEvents.setTooltip(it, "Reward from the Dice of Fate.")
TooltipEvents.setTooltip(mitem("gaiahead"), "Dropped by the Guardian of Gaia when killed with an Elementium Axe.")
TooltipEvents.setTooltip(mitem("manaresource", 4), "Made with Terrestrial Agglomeration Plate.")
TooltipEvents.setTooltip(mitem("manaresource", 15), "Obtained by right-clicking with an Empty Bottle in the End.")

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
    def flower = mitem("specialflower").withNbt(["type": name])
    def flower2 = mitem("floatingspecialflower").withNbt(["type": name])
    def flower3 = mitem("specialflower").withNbt(["type": name + "Chibi"])
    def flower4 = mitem("floatingspecialflower").withNbt(["type": name + "Chibi"])
    def predicate = stack -> {
        return stack in flower || stack in flower2 || stack in flower3 || stack in flower4
    }
    TooltipEvents.addTierPredicate("flower:" + name, predicate, tier)
}

def setFloatingFlowerTier(name, tier) {
    def flower2 = mitem("floatingspecialflower").withNbt(["type": name])
    def flower4 = mitem("floatingspecialflower").withNbt(["type": name + "Chibi"])
    def predicate = stack -> {
        return stack in flower2 || stack in flower4
    }
    TooltipEvents.addTierPredicate("fflower:" + name, predicate, tier)
}

for (def it in tier1Flowers) setFlowerTier(it, 9)
for (def it in tier2Flowers) setFlowerTier(it, 12)
for (def it in tier3Flowers) setFlowerTier(it, 14)
setFloatingFlowerTier("puredaisy", 9)
