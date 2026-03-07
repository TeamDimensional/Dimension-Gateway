import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents


def setEmcTooltip(it, value, hideTier = true) {
    TooltipEvents.setTooltip(it, "§eEMC:§r ${value}")
    if (hideTier) {
        TooltipEvents.setTier(it, 0)
    }
}

emcValues = [
    "Decor": 1,
    "Building": 1,
    "Speedup": 4,
    "Lighting": 16,
]

def chiselBlock(name, i, category = "Building") {
    int id = i / 16
    int meta = i % 16
    def idStr = id > 0 ? id : ""
    def it = item("chisel:${name}${idStr}", meta)
    ore("emc${category}Block").add(it)
    setEmcTooltip(it, emcValues[category])
    // mods.thaumcraft.aspect_helper.removeAll(it)
    return it
}

def configureItem(it, category = "Building", removeRecipe = true) {
    if (removeRecipe) crafting.removeByOutput(it)
    ore("emc${category}Block").add(it)
    setEmcTooltip(it, emcValues[category])
}

def configureCraftable(it) {
    TooltipEvents.setTooltip(it, "§eCraftable from EMC items§r")
    TooltipEvents.setTier(it, 0)
}

def ec4BlockConfig(name, category = "Building") {
    for (def i in 0..15) {
        def it = item("essentialcraft:fancyblock.${name}", i)
        configureItem(it, category)
    }
}

def bibliocraftBlockConfig(name, count, category = "Decor") {
    for (def i in 0..count) {
        def it = item("bibliocraft:${name}", i)
        configureItem(it, category)
    }
}

// Lapis Core is used as an EMC source to make building blocks.
TooltipEvents.setTier(item("essentialcraft:genitem", 45), 2)
setEmcTooltip(item("essentialcraft:genitem", 45), 256, false)

// Chisel
def chiselRecipeItems = [
    item("chisel:antiblock", 15), item("chisel:bookshelf_spruce"), item("chisel:bookshelf_birch"), item("chisel:bookshelf_darkoak"),
    item("chisel:bookshelf_acacia"), item("chisel:bookshelf_jungle"), item("chisel:brownstone"), item("chisel:cloud"),
    item("chisel:factory"), item("chisel:futura"), item("chisel:laboratory"), item("chisel:lavastone"), item("chisel:temple"),
    item("chisel:tyrian"), item("chisel:voidstone"), item("chisel:waterstone"), item("chisel:valentines", 9),
]

for (def i in 0..6) {
    ore("blockAluminum").remove(chiselBlock("blockaluminum", i))
    ore("blockBronze").remove(chiselBlock("blockbronze", i))
    ore("blockCobalt").remove(chiselBlock("blockcobalt", i))
    ore("blockCopper").remove(chiselBlock("blockcopper", i))
    ore("blockElectrum").remove(chiselBlock("blockelectrum", i))
    ore("blockGold").remove(chiselBlock("blockgold", i))
    ore("blockInvar").remove(chiselBlock("blockinvar", i))
    ore("blockIron").remove(chiselBlock("blockiron", i))
    ore("blockLead").remove(chiselBlock("blocklead", i))
    ore("blockNickel").remove(chiselBlock("blocknickel", i))
    ore("blockPlatinum").remove(chiselBlock("blockplatinum", i))
    ore("blockSilver").remove(chiselBlock("blocksilver", i))
    ore("blockSteel").remove(chiselBlock("blocksteel", i))
    ore("blockTin").remove(chiselBlock("blocktin", i))
    ore("blockUranium").remove(chiselBlock("blockuranium", i))

    ore("ice").remove(chiselBlock("icepillar", i))
    ore("blockIce").remove(chiselBlock("icepillar", i))
}
for (def i in 0..8) {
    ore("blockLapis").remove(chiselBlock("lapis", i))
}
for (def i in 0..9) {
    for (def plank in ["Oak", "Spruce", "Birch", "Jungle", "Acacia", "DarkOak"]) {
        def block = chiselBlock("bookshelf_${plank.toLowerCase()}", i)
        ore("bookshelf").remove(block)
        ore("bookshelf${plank}").remove(block)
    }
}
for (def i in 0..11) {
    ore("blockDiamond").remove(chiselBlock("diamond", i))
}
for (def i in 0..13) {
    ore("blockEmerald").remove(chiselBlock("emerald", i))
    ore("blockGold").remove(chiselBlock("gold", i))
    ore("netherrack").remove(chiselBlock("netherrack", i))
}
for (def i in 0..14) {
    ore("blockIron").remove(chiselBlock("iron", i))
    ore("obsidian").remove(chiselBlock("obsidian", i))
    for (def plank in ["oak", "spruce", "birch", "jungle", "acacia", "dark-oak"]) {
        ore("plankWood").remove(chiselBlock("planks-${plank}", i))
    }
}
for (def i in 0..15) {
    ore("dirt").remove(chiselBlock("dirt", i))
    def marblePillars = chiselBlock("marblepillar", i)
    ore("stoneMarble").remove(marblePillars)
    ore("stoneMarblePolished").remove(marblePillars)
    ore("sandstone").remove(chiselBlock("sandstone-scribbles", i))
    ore("sandstone").remove(chiselBlock("sandstonered-scribbles", i))
}
for (def i in 0..17) {
    def glass = chiselBlock("glass", i)
    ore("blockGlass").remove(glass)
    ore("blockGlassColorless").remove(glass)
    def glassPane = chiselBlock("glasspane", i)
    ore("paneGlass").remove(glassPane)
    ore("paneGlassColorless").remove(glassPane)
    chiselRecipeItems.add(glassPane)
}
for (def i in 0..27) {
    ore("blockRedstone").remove(chiselBlock("redstone", i))
}
for (def i in 0..31) {
    ore("blockQuartz").remove(chiselBlock("quartz", i))
}
for (def i in 0..32) {
    for (def name in ["andesite", "diorite", "granite"]) {
        def upperName = name.capitalize()
        def stone = chiselBlock(name, i)
        ore("stone${upperName}").remove(stone)
        ore("stone${upperName}Polished").remove(stone)
    }
    ore("blockMossy").remove(chiselBlock("cobblestonemossy", i))
    ore("glowstone").remove(chiselBlock("glowstone", i, "Lighting"))
    def ice = chiselBlock("ice", i)
    ore("ice").remove(ice)
    ore("blockIce").remove(ice)
}
for (def i in 0..33) {
    ore("blockCoal").remove(chiselBlock("block_coal", i))
    def coke = chiselBlock("block_coal_coke", i)
    ore("blockCoalCoke").remove(coke)
    ore("blockFuelCoke").remove(coke)
    ore("blockCharcoal").remove(chiselBlock("block_charcoal", i))
}
for (def i in 0..37) {
    if (i in 26..31) continue;
    def prismarine = chiselBlock("prismarine", i)
    ore("prismarine").remove(prismarine)
    ore("prismarineBrick").remove(prismarine)
    ore("prismarineDark").remove(prismarine)
}
for (def i in 0..38) {
    if (i in 26..31) continue;
    ore("endstone").remove(chiselBlock("endstone", i))
    ore("hardenedClay").remove(chiselBlock("hardenedclay", i))
}
for (def i in 0..39) {
    if (!(i in 26..31)) {
        for (def name in ["Basalt", "Limestone", "Marble"]) {
            def upperName = name.capitalize()
            def block = chiselBlock(name, i)
            ore("stone${upperName}").remove(block)
            ore("stone${upperName}Polished").remove(block)
        }
    }
    for (def color in ["yellow", "red"]) {
        ore("sandstone").remove(chiselBlock("sandstone${color}", i))
    }
}
for (def i in 0..41) {
    if (i in 26..31) continue;
    def smoothStone = chiselBlock("stonebrick", i)
    ore("stone").remove(smoothStone)
    ore("brickStone").remove(smoothStone)
    ore("bricksStone").remove(smoothStone)
    ore("cobblestone").remove(chiselBlock("cobblestone", i))
}

for (def color in GatewayHelpers.colors) {
    color = color == "silver" ? "light_gray" : color
    def upperColor = color.startsWith("light") ? "Light" + color[6..<color.size()].capitalize() : color.capitalize()
    def colorFix = upperColor.toLowerCase()
    for (def i in 0..32) {
        def concrete = chiselBlock("concrete_${colorFix}", i)
        ore("blockConcrete").remove(concrete)
        ore("blockConcrete${upperColor}").remove(concrete)
    }
    for (def i in 0..5) {
        def glass = chiselBlock("glassdyed${colorFix}", i)
        def glassPane = chiselBlock("glasspanedyed${colorFix}", i)
        ore("blockGlass").remove(glass)
        ore("blockGlass${upperColor}").remove(glass)
        ore("paneGlass").remove(glassPane)
        ore("paneGlass${upperColor}").remove(glassPane)
    }
    for (def i in 0..1) {
        ore("blockWool").remove(chiselBlock("wool_${colorFix}", i))
    }
}

// Other chisel blocks that don't have oredicts
for (def i in 0..4) chiselBlock("cloud", i)
for (def i in 0..5) chiselBlock("futura", i)
for (def i in 0..7) chiselBlock("voidstone", i)
for (def i in 0..7) chiselBlock("energizedvoidstone", i)
for (def i in 0..8) chiselBlock("paper", i)
for (def i in 0..8) chiselBlock("technicalnew", i)
for (def i in 0..9) chiselBlock("brownstone", i, "Speedup")
for (def i in 0..9) chiselBlock("valentines", i)
for (def i in 0..12) chiselBlock("ironpane", i, "Decor")
for (def i in 0..14) chiselBlock("voidstonerunic", i)
for (def i in 0..15) chiselBlock("antiblock", i)
for (def i in 0..15) chiselBlock("temple", i)
for (def i in 0..15) chiselBlock("templemossy", i)
for (def i in 0..15) chiselBlock("laboratory", i)
for (def i in 0..15) chiselBlock("netherbrick", i)
for (def i in 0..15) chiselBlock("tyrian", i)
for (def i in 0..20) chiselBlock("factory", i)
for (def i in 0..20) chiselBlock("technical", i)
for (def i in 0..32) chiselBlock("arcane_stone", i)
for (def i in 0..32) chiselBlock("lavastone", i)
for (def i in 0..32) chiselBlock("waterstone", i)
for (def i in 0..33) chiselBlock("certus", i)
for (def i in 0..36) if (!(i in 26..31)) chiselBlock("purpur", i)
for (def i in 0..37) if (!(i in 26..31)) chiselBlock("bricks", i)

for (def color in GatewayHelpers.colors) {
    color = color == "silver" ? "light_gray" : color
    def upperColor = color.startsWith("light") ? "Light" + color[6..<color.size()].capitalize() : color.capitalize()
    def colorFix = upperColor.toLowerCase()
    for (def i in 0..1) chiselBlock("carpet_${colorFix}", i, "Decor")
}

for (def it in chiselRecipeItems) {
    crafting.removeByOutput(it)
}

// EC4 Fancy blocks
ec4BlockConfig("fortifiedstone")
ec4BlockConfig("magicplating")
ec4BlockConfig("paleplating")
ec4BlockConfig("mithrilineplating")
ec4BlockConfig("mru")
ec4BlockConfig("mimic")
ec4BlockConfig("coldstone")
ec4BlockConfig("voidstone")
ec4BlockConfig("concrete")
ec4BlockConfig("demonicplating")

// Bibliocraft
bibliocraftBlockConfig("lanterngold", 15, "Lighting")
bibliocraftBlockConfig("lanterniron", 15, "Lighting")
bibliocraftBlockConfig("lampgold", 15, "Lighting")
bibliocraftBlockConfig("lampiron", 15, "Lighting")
bibliocraftBlockConfig("clock", 6)
for (def name in ["flat", "simple", "middle", "fancy", "borderless"]) {
    bibliocraftBlockConfig("paintingframe${name}", 6)
}
bibliocraftBlockConfig("typewriter", 15)
bibliocraftBlockConfig("bell", 0)
bibliocraftBlockConfig("cookiejar", 0)
bibliocraftBlockConfig("dinnerplate", 0)
bibliocraftBlockConfig("discrack", 0)
for (def idx in 1..5) {
    bibliocraftBlockConfig("seatback${idx}", 6)
}

// Botania
for (def i in 0..5) {
    configureItem(item("botania:pavement", i))
    configureCraftable(item("botania:pavement${i}slab"))
    configureCraftable(item("botania:pavement${i}stairs"))
}
for (def i in 0..15) {
    configureItem(item("botania:custombrick", i))
}

// TConstruct
mods.tconstruct.drying.removeByOutput(item("tconstruct:dried_clay"))
mods.tconstruct.drying.removeByOutput(item("tconstruct:materials", 2))
for (def i in 0..11) configureItem(item("tconstruct:brownstone", i), "Speedup", i in 1..3)
for (def i in 0..7) configureCraftable(item("tconstruct:brownstone_slab", i))
for (def i in 0..3) configureCraftable(item("tconstruct:brownstone_slab2", i))
for (def i in 0..1) {
    configureItem(item("tconstruct:dried_clay", i), "Building", i == 1)
    configureCraftable(item("tconstruct:dried_clay_slab", i))
}

for (def name in ["dried_clay_stairs", "dried_brick_stairs"]) {
    configureCraftable(item("tconstruct:${name}"))
}
for (def name in ["smooth", "rough", "paver", "brick", "brick_cracked", "brick_fancy", "brick_square", "brick_triangle",
                  "brick_small", "road", "tile", "creeper"]) {
    configureCraftable(item("tconstruct:brownstone_stairs_${name}"))
}

// Quark
for (def i in 0..15) {
    configureItem(item("quark:stained_clay_tiles", i))
    configureItem(item("quark:quilted_wool", i))
}
for (def i in 0..1) configureItem(item("quark:polished_netherrack", i))
configureItem(item("quark:hardened_clay_tiles"))
for (def i in 0..1) configureItem(item("quark:iron_plate", i))
configureItem(item("quark:sandy_bricks"))
configureItem(item("quark:thatch"))
crafting.remove("quark:wheat")
configureItem(item("quark:reed_block"))
crafting.remove("quark:reeds")
configureItem(item("quark:charred_nether_bricks"))
configureItem(item("quark:magma_bricks"))
configureItem(item("quark:midori_block"))
configureItem(item("quark:midori_pillar"))
configureItem(item("quark:duskbound_block"))
configureItem(item("quark:duskbound_lantern"), "Lighting")
configureItem(item("quark:framed_glass"))
configureItem(item("quark:framed_glass_pane"))
configureItem(item("quark:turf"))
for (def i in 0..2) configureItem(item("quark:soul_sandstone", i))
for (def i in 0..1) configureItem(item("quark:paper_lantern", i), "Lighting")
configureItem(item("quark:paper_wall"), "Decor")
configureItem(item("quark:paper_wall_big"), "Decor")
configureItem(item("quark:paper_wall_sakura"), "Decor")

for (def color in GatewayHelpers.colors) {
    configureCraftable(item("quark:stained_clay_tiles_${color}_stairs"))
    configureCraftable(item("quark:stained_clay_tiles_${color}_slab"))
}
def stairs = [
    "hardened_clay_tiles", "iron_plate", "sandy_bricks", "thatch", "charred_nether_brick", "midori_block",
    "magma_bricks", "duskbound_block", "reed_block", "soul_sandstone", "turf", "polished_netherrack_bricks",
]
def walls = [
    "sandy_bricks", "midori_block", "duskbound_block", "reed_block", "polished_netherrack_bricks",
]
for (def it in stairs) {
    configureCraftable(item("quark:${it}_stairs"))
    configureCraftable(item("quark:${it}_slab"))
}
for (def it in walls) {
    configureCraftable(item("quark:${it}_wall"))
}
