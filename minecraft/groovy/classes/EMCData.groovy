import classes.GatewayHelpers

class EMCData {
    static def setup(manager) {
        // Chisel
        def chiselRecipeItems = [
            item("chisel:antiblock", 15), item("chisel:bookshelf_spruce"), item("chisel:bookshelf_birch"), item("chisel:bookshelf_darkoak"),
            item("chisel:bookshelf_acacia"), item("chisel:bookshelf_jungle"), item("chisel:brownstone"), item("chisel:cloud"),
            item("chisel:factory"), item("chisel:futura"), item("chisel:laboratory"), item("chisel:lavastone"), item("chisel:temple"),
            item("chisel:tyrian"), item("chisel:voidstone"), item("chisel:waterstone"), item("chisel:valentines", 9),
        ]

        for (def i in 0..6) {
            ore("blockAluminum").remove(manager.chiselBlock("blockaluminum", i))
            ore("blockBronze").remove(manager.chiselBlock("blockbronze", i))
            ore("blockCobalt").remove(manager.chiselBlock("blockcobalt", i))
            ore("blockCopper").remove(manager.chiselBlock("blockcopper", i))
            ore("blockElectrum").remove(manager.chiselBlock("blockelectrum", i))
            ore("blockGold").remove(manager.chiselBlock("blockgold", i))
            ore("blockInvar").remove(manager.chiselBlock("blockinvar", i))
            ore("blockIron").remove(manager.chiselBlock("blockiron", i))
            ore("blockLead").remove(manager.chiselBlock("blocklead", i))
            ore("blockNickel").remove(manager.chiselBlock("blocknickel", i))
            ore("blockPlatinum").remove(manager.chiselBlock("blockplatinum", i))
            ore("blockSilver").remove(manager.chiselBlock("blocksilver", i))
            ore("blockSteel").remove(manager.chiselBlock("blocksteel", i))
            ore("blockTin").remove(manager.chiselBlock("blocktin", i))
            ore("blockUranium").remove(manager.chiselBlock("blockuranium", i))

            ore("ice").remove(manager.chiselBlock("icepillar", i))
            ore("blockIce").remove(manager.chiselBlock("icepillar", i))
        }
        for (def i in 0..8) {
            ore("blockLapis").remove(manager.chiselBlock("lapis", i))
        }
        for (def i in 0..9) {
            for (def plank in ["Oak", "Spruce", "Birch", "Jungle", "Acacia", "DarkOak"]) {
                def block = manager.chiselBlock("bookshelf_${plank.toLowerCase()}", i)
                ore("bookshelf").remove(block)
                ore("bookshelf${plank}").remove(block)
            }
        }
        for (def i in 0..11) {
            ore("blockDiamond").remove(manager.chiselBlock("diamond", i))
        }
        for (def i in 0..13) {
            ore("blockEmerald").remove(manager.chiselBlock("emerald", i))
            ore("blockGold").remove(manager.chiselBlock("gold", i))
            ore("netherrack").remove(manager.chiselBlock("netherrack", i))
        }
        for (def i in 0..14) {
            ore("blockIron").remove(manager.chiselBlock("iron", i))
            ore("obsidian").remove(manager.chiselBlock("obsidian", i))
            for (def plank in ["oak", "spruce", "birch", "jungle", "acacia", "dark-oak"]) {
                ore("plankWood").remove(manager.chiselBlock("planks-${plank}", i))
            }
        }
        for (def i in 0..15) {
            ore("dirt").remove(manager.chiselBlock("dirt", i))
            def marblePillars = manager.chiselBlock("marblepillar", i)
            ore("stoneMarble").remove(marblePillars)
            ore("stoneMarblePolished").remove(marblePillars)
            ore("sandstone").remove(manager.chiselBlock("sandstone-scribbles", i))
            ore("sandstone").remove(manager.chiselBlock("sandstonered-scribbles", i))
        }
        for (def i in 0..17) {
            def glass = manager.chiselBlock("glass", i)
            ore("blockGlass").remove(glass)
            ore("blockGlassColorless").remove(glass)
            def glassPane = manager.chiselBlock("glasspane", i)
            ore("paneGlass").remove(glassPane)
            ore("paneGlassColorless").remove(glassPane)
            chiselRecipeItems.add(glassPane)
        }
        for (def i in 0..27) {
            ore("blockRedstone").remove(manager.chiselBlock("redstone", i))
        }
        for (def i in 0..31) {
            ore("blockQuartz").remove(manager.chiselBlock("quartz", i))
        }
        for (def i in 0..32) {
            for (def name in ["andesite", "diorite", "granite"]) {
                def upperName = name.capitalize()
                def stone = manager.chiselBlock(name, i)
                ore("stone${upperName}").remove(stone)
                ore("stone${upperName}Polished").remove(stone)
            }
            ore("blockMossy").remove(manager.chiselBlock("cobblestonemossy", i))
            ore("glowstone").remove(manager.chiselBlock("glowstone", i, "Lighting"))
            def ice = manager.chiselBlock("ice", i)
            ore("ice").remove(ice)
            ore("blockIce").remove(ice)
        }
        for (def i in 0..33) {
            ore("blockCoal").remove(manager.chiselBlock("block_coal", i))
            def coke = manager.chiselBlock("block_coal_coke", i)
            ore("blockCoalCoke").remove(coke)
            ore("blockFuelCoke").remove(coke)
            ore("blockCharcoal").remove(manager.chiselBlock("block_charcoal", i))
        }
        for (def i in 0..37) {
            if (i in 26..31) continue;
            def prismarine = manager.chiselBlock("prismarine", i)
            ore("prismarine").remove(prismarine)
            ore("prismarineBrick").remove(prismarine)
            ore("prismarineDark").remove(prismarine)
        }
        for (def i in 0..38) {
            if (i in 26..31) continue;
            ore("endstone").remove(manager.chiselBlock("endstone", i))
            ore("hardenedClay").remove(manager.chiselBlock("hardenedclay", i))
        }
        for (def i in 0..39) {
            if (!(i in 26..31)) {
                for (def name in ["Basalt", "Limestone", "Marble"]) {
                    def upperName = name.capitalize()
                    def block = manager.chiselBlock(name, i)
                    ore("stone${upperName}").remove(block)
                    ore("stone${upperName}Polished").remove(block)
                }
            }
            for (def color in ["yellow", "red"]) {
                ore("sandstone").remove(manager.chiselBlock("sandstone${color}", i))
            }
        }
        for (def i in 0..41) {
            if (i in 26..31) continue;
            def smoothStone = manager.chiselBlock("stonebrick", i)
            ore("stone").remove(smoothStone)
            ore("brickStone").remove(smoothStone)
            ore("bricksStone").remove(smoothStone)
            ore("cobblestone").remove(manager.chiselBlock("cobblestone", i))
        }

        for (def color in GatewayHelpers.colors) {
            color = color == "silver" ? "light_gray" : color
            def upperColor = color.startsWith("light") ? "Light" + color[6..<color.size()].capitalize() : color.capitalize()
            def colorFix = upperColor.toLowerCase()
            for (def i in 0..32) {
                def concrete = manager.chiselBlock("concrete_${colorFix}", i)
                ore("blockConcrete").remove(concrete)
                ore("blockConcrete${upperColor}").remove(concrete)
            }
            for (def i in 0..5) {
                def glass = manager.chiselBlock("glassdyed${colorFix}", i)
                def glassPane = manager.chiselBlock("glasspanedyed${colorFix}", i)
                ore("blockGlass").remove(glass)
                ore("blockGlass${upperColor}").remove(glass)
                ore("paneGlass").remove(glassPane)
                ore("paneGlass${upperColor}").remove(glassPane)
            }
            for (def i in 0..1) {
                ore("blockWool").remove(manager.chiselBlock("wool_${colorFix}", i))
            }
        }

        for (def it in chiselRecipeItems) {
            manager.removeByOutput(it)
        }

        // Other chisel blocks that don't have oredicts
        for (def i in 0..4) manager.chiselBlock("cloud", i)
        for (def i in 0..5) manager.chiselBlock("futura", i)
        for (def i in 0..7) manager.chiselBlock("voidstone", i)
        for (def i in 0..7) manager.chiselBlock("energizedvoidstone", i)
        for (def i in 0..8) manager.chiselBlock("paper", i)
        for (def i in 0..8) manager.chiselBlock("technicalnew", i)
        for (def i in 0..9) manager.chiselBlock("brownstone", i, "Speedup")
        for (def i in 0..9) manager.chiselBlock("valentines", i)
        for (def i in 0..12) manager.chiselBlock("ironpane", i, "Decor")
        for (def i in 0..14) manager.chiselBlock("voidstonerunic", i)
        for (def i in 0..15) manager.chiselBlock("antiblock", i)
        for (def i in 0..15) manager.chiselBlock("temple", i)
        for (def i in 0..15) manager.chiselBlock("templemossy", i)
        for (def i in 0..15) manager.chiselBlock("laboratory", i)
        for (def i in 0..15) manager.chiselBlock("netherbrick", i)
        for (def i in 0..15) manager.chiselBlock("tyrian", i)
        for (def i in 0..20) manager.chiselBlock("factory", i)
        for (def i in 0..20) manager.chiselBlock("technical", i)
        for (def i in 0..32) manager.chiselBlock("arcane_stone", i)
        for (def i in 0..32) manager.chiselBlock("lavastone", i)
        for (def i in 0..32) manager.chiselBlock("waterstone", i)
        for (def i in 0..33) manager.chiselBlock("certus", i)
        for (def i in 0..36) if (!(i in 26..31)) manager.chiselBlock("purpur", i)
        for (def i in 0..37) if (!(i in 26..31)) manager.chiselBlock("bricks", i)

        for (def color in GatewayHelpers.colors) {
            color = color == "silver" ? "light_gray" : color
            def upperColor = color.startsWith("light") ? "Light" + color[6..<color.size()].capitalize() : color.capitalize()
            def colorFix = upperColor.toLowerCase()
            for (def i in 0..1) manager.chiselBlock("carpet_${colorFix}", i, "Decor")
        }

        // EC4 Fancy blocks
        manager.ec4BlockConfig("fortifiedstone")
        manager.ec4BlockConfig("magicplating")
        manager.ec4BlockConfig("paleplating")
        manager.ec4BlockConfig("mithrilineplating")
        manager.ec4BlockConfig("mru")
        manager.ec4BlockConfig("mimic")
        manager.ec4BlockConfig("coldstone")
        manager.ec4BlockConfig("voidstone")
        manager.ec4BlockConfig("concrete")
        manager.ec4BlockConfig("demonicplating")

        // Bibliocraft
        manager.bibliocraftBlockConfig("lanterngold", 15, "Lighting")
        manager.bibliocraftBlockConfig("lanterniron", 15, "Lighting")
        manager.bibliocraftBlockConfig("lampgold", 15, "Lighting")
        manager.bibliocraftBlockConfig("lampiron", 15, "Lighting")
        manager.bibliocraftBlockConfig("clock", 6)
        for (def name in ["flat", "simple", "middle", "fancy", "borderless"]) {
            manager.bibliocraftBlockConfig("paintingframe${name}", 6)
        }
        manager.bibliocraftBlockConfig("typewriter", 15)
        manager.bibliocraftBlockConfig("bell", 0)
        manager.bibliocraftBlockConfig("cookiejar", 0)
        manager.bibliocraftBlockConfig("dinnerplate", 0)
        manager.bibliocraftBlockConfig("discrack", 0)
        for (def idx in 1..5) {
            manager.bibliocraftBlockConfig("seatback${idx}", 6)
        }

        // Botania
        for (def i in 0..5) {
            manager.configureItem(item("botania:pavement", i))
            manager.configureCraftable(item("botania:pavement${i}slab"))
            manager.configureCraftable(item("botania:pavement${i}stairs"))
        }
        for (def i in 0..15) {
            manager.configureItem(item("botania:custombrick", i))
        }

        // TConstruct
        for (def i in 0..11) manager.configureItem(item("tconstruct:brownstone", i), "Speedup", i in 1..3)
        for (def i in 0..7) manager.configureCraftable(item("tconstruct:brownstone_slab", i))
        for (def i in 0..3) manager.configureCraftable(item("tconstruct:brownstone_slab2", i))
        for (def i in 0..1) {
            manager.configureItem(item("tconstruct:dried_clay", i), "Building", i == 1)
            manager.configureCraftable(item("tconstruct:dried_clay_slab", i))
        }

        for (def name in ["dried_clay_stairs", "dried_brick_stairs"]) {
            manager.configureCraftable(item("tconstruct:${name}"))
        }
        for (def name in ["smooth", "rough", "paver", "brick", "brick_cracked", "brick_fancy", "brick_square", "brick_triangle",
                        "brick_small", "road", "tile", "creeper"]) {
            manager.configureCraftable(item("tconstruct:brownstone_stairs_${name}"))
        }

        // Quark
        for (def i in 0..15) {
            manager.configureItem(item("quark:stained_clay_tiles", i))
            manager.configureItem(item("quark:quilted_wool", i))
        }
        for (def i in 0..1) manager.configureItem(item("quark:polished_netherrack", i))
        manager.configureItem(item("quark:hardened_clay_tiles"))
        for (def i in 0..1) manager.configureItem(item("quark:iron_plate", i))
        manager.configureItem(item("quark:sandy_bricks"))
        manager.configureItem(item("quark:thatch"))
        crafting.remove("quark:wheat")
        manager.configureItem(item("quark:reed_block"))
        crafting.remove("quark:reeds")
        manager.configureItem(item("quark:charred_nether_bricks"))
        manager.configureItem(item("quark:magma_bricks"))
        manager.configureItem(item("quark:midori_block"))
        manager.configureItem(item("quark:midori_pillar"))
        manager.configureItem(item("quark:duskbound_block"))
        manager.configureItem(item("quark:duskbound_lantern"), "Lighting")
        manager.configureItem(item("quark:framed_glass"))
        manager.configureItem(item("quark:framed_glass_pane"))
        manager.configureItem(item("quark:turf"))
        for (def i in 0..2) manager.configureItem(item("quark:soul_sandstone", i))
        for (def i in 0..1) manager.configureItem(item("quark:paper_lantern", i), "Lighting")
        manager.configureItem(item("quark:paper_wall"), "Decor")
        manager.configureItem(item("quark:paper_wall_big"), "Decor")
        manager.configureItem(item("quark:paper_wall_sakura"), "Decor")

        for (def color in GatewayHelpers.colors) {
            manager.configureCraftable(item("quark:stained_clay_tiles_${color}_stairs"))
            manager.configureCraftable(item("quark:stained_clay_tiles_${color}_slab"))
        }
        def stairs = [
            "hardened_clay_tiles", "iron_plate", "sandy_bricks", "thatch", "charred_nether_brick", "midori_block",
            "magma_bricks", "duskbound_block", "reed_block", "soul_sandstone", "turf", "polished_netherrack_bricks",
        ]
        def walls = [
            "sandy_bricks", "midori_block", "duskbound_block", "reed_block", "polished_netherrack_bricks",
        ]
        for (def it in stairs) {
            manager.configureCraftable(item("quark:${it}_stairs"))
            manager.configureCraftable(item("quark:${it}_slab"))
        }
        for (def it in walls) {
            manager.configureCraftable(item("quark:${it}_wall"))
        }

        // Immersive Engineering
        manager.configureItem(item("immersiveengineering:metal_decoration2", 4), "Lighting")

        // EnderIO
        manager.configureItem(item("enderio:block_electric_light", 2), "Lighting")
        manager.configureItem(item("enderio:block_electric_light", 3), "Lighting")
    }
}