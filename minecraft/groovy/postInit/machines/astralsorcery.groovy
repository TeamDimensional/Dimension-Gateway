// Lenses
for (def i in 0..6)
    mods.astralsorcery.starlight_altar.removeByOutput(item("astralsorcery:itemcoloredlens", i))

mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("astralsorcery:itemcoloredlens"))
    .matrix("b   b",
            " bab ",
            "  l  ",
            " BaB ",
            "b   b")
    .key("b", item("minecraft:blaze_powder"))
    .key("B", item("minecraft:blaze_rod"))
    .key("l", item("astralsorcery:itemcraftingcomponent", 3))
    .key("a", item("astralsorcery:itemcraftingcomponent"))
    .craftTime(80)
    .starlight(500)
    .register()

mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("astralsorcery:itemcoloredlens", 1))
    .matrix("a   a",
            "  d  ",
            "  l  ",
            "  p  ",
            "g   g")
    .key("l", item("astralsorcery:itemcraftingcomponent", 3))
    .key("a", item("astralsorcery:itemcraftingcomponent"))
    .key("d", item("minecraft:diamond"))
    .key("p", item("calculator:endforgedpickaxe"))
    .key("g", item("minecraft:gold_ingot"))
    .craftTime(80)
    .starlight(500)
    .register()

mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("astralsorcery:itemcoloredlens", 2))
    .matrix("a   a",
            "  c  ",
            "  l  ",
            " f f ",
            "a   a")
    .key("l", item("astralsorcery:itemcraftingcomponent", 3))
    .key("a", item("astralsorcery:itemcraftingcomponent"))
    .key("c", item("minecraft:golden_carrot"))
    .key("f", item("calculator:fiddledewfruit"))
    .craftTime(80)
    .starlight(500)
    .register()

mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("astralsorcery:itemcoloredlens", 3))
    .matrix("a   a",
            "  i  ",
            " ili ",
            " f f ",
            "d   d")
    .key("l", item("astralsorcery:itemcraftingcomponent", 3))
    .key("a", item("astralsorcery:itemcraftingcomponent"))
    .key("d", item("minecraft:diamond"))
    .key("f", item("minecraft:flint"))
    .key("i", item("minecraft:iron_ingot"))
    .craftTime(80)
    .starlight(500)
    .register()

mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("astralsorcery:itemcoloredlens", 4))
    .matrix("a   a",
            "  g  ",
            "  l  ",
            "  d  ",
            "s   s")
    .key("l", item("astralsorcery:itemcraftingcomponent", 3))
    .key("a", item("astralsorcery:itemcraftingcomponent"))
    .key("s", item("astralsorcery:itemcraftingcomponent", 2))
    .key("d", item("minecraft:diamond"))
    .key("g", item("minecraft:ghast_tear"))
    .craftTime(80)
    .starlight(500)
    .register()

mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("astralsorcery:itemcoloredlens", 5))
    .matrix("a   a",
            " ppp ",
            "  l  ",
            "  p  ",
            "s   s")
    .key("l", item("astralsorcery:itemcraftingcomponent", 3))
    .key("a", item("astralsorcery:itemcraftingcomponent"))
    .key("s", item("astralsorcery:itemcraftingcomponent", 2))
    .key("p", item("minecraft:piston"))
    .craftTime(80)
    .starlight(500)
    .register()

mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("astralsorcery:itemcoloredlens", 6))
    .matrix("a   a",
            "  T  ",
            " ili ",
            "  A  ",
            "s   s")
    .key("l", item("astralsorcery:itemcraftingcomponent", 3))
    .key("a", item("astralsorcery:itemcraftingcomponent"))
    .key("s", item("astralsorcery:itemcraftingcomponent", 2))
    .key("i", item("astralsorcery:itemusabledust"))
    .key("A", item("calculator:largeamethyst"))
    .key("T", item("calculator:largetanzanite"))
    .craftTime(80)
    .starlight(500)
    .register()

// Attunement Altar
mods.astralsorcery.starlight_altar.removeByOutput(item("astralsorcery:blockattunementaltar"))
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("astralsorcery:blockattunementaltar"))
    .matrix("G   G",
            "  C  ",
            " S S ",
            " ARA ",
            "A   A")
    .key("G", item("gateway:dormant_magical_crystal"))
    .key("R", item("astralsorcery:blockattunementrelay"))
    .key("S", item("botania:manaresource"))
    .key("C", item("astralsorcery:itemcelestialcrystal"))
    .key("A", item("astralsorcery:blockmarble", 6))
    .craftTime(400)
    .starlight(1500)
    .register()

// Lightwell
mods.astralsorcery.starlight_altar.removeByOutput(item("astralsorcery:blockwell"))
mods.astralsorcery.starlight_altar.discoveryRecipeBuilder()
    .output(item("astralsorcery:blockwell"))
    .matrix("a a", "cCc", "AaA")
    .key("a", item("astralsorcery:blockmarble", 6))
    .key("c", item("astralsorcery:blockmarble", 4))
    .key("C", item("astralsorcery:itemrockcrystalsimple"))
    .key("A", item("calculator:smallamethyst"))
    .craftTime(100)
    .starlight(500)
    .register()

// Tree Beacon
mods.astralsorcery.starlight_altar.removeByOutput(item("astralsorcery:blocktreebeacon"))
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("astralsorcery:blocktreebeacon"))
    .matrix("     ",
            " LAL ",
            " LSL ",
            " LBL ",
            "a   a")
    .key("a", item("astralsorcery:blockmarble", 6))
    .key("A", item("calculator:smallamethyst"))
    .key("L", ore("treeLeaves"))
    .key("S", ore("treeSapling"))
    .key("B", fluid("astralsorcery.liquidstarlight") * 1000)
    .craftTime(200)
    .starlight(750)
    .register()
