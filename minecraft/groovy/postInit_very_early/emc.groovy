import classes.EMCData

class PostInitEMCManager {
    def chiselBlock(name, i, category = "Building") {
        int id = i / 16
        int meta = i % 16
        def idStr = id > 0 ? id : ""
        def it = item("chisel:${name}${idStr}", meta)
        ore("emc${category}Block").add(it)
        return it
    }

    def configureItem(it, category = "Building", removeRecipe = true) {
        if (removeRecipe) crafting.removeByOutput(it)
    }

    def configureCraftable(it) {}

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

    def removeByOutput(it) {
        crafting.removeByOutput(it)
    }
}

EMCData.setup(new PostInitEMCManager())

// Lapis Core is used as an EMC source to make building blocks.
mods.roots.fey_crafter.recipeBuilder()
    .name("lapis_core")
    .input(item("theaurorian:ceruleaningot"), item("roots:runic_dust"), item("roots:moonglow_leaf"), item("minecraft:dye", 4), item("minecraft:dye", 4))
    .output(item("essentialcraft:genitem", 45))
    .register()

// Building block stuff
crafting.removeByOutput(item("projecte:transmutation_table"))
crafting.shapedBuilder()
    .name("emc/transmutation_table")
    .matrix("RSR", "SLS", "RSR")
    .key("R", ore("runestone"))
    .key("S", item("minecraft:stone"))
    .key("L", item("essentialcraft:genitem", 45))
    .output(item("projecte:transmutation_table"))
    .register()

crafting.removeByOutput(item("projecte:item.pe_transmutation_tablet"))
crafting.shapelessBuilder()
    .name("emc/table_to_tablet")
    .input(item("projecte:transmutation_table")).output(item("projecte:item.pe_transmutation_tablet")).register()
crafting.shapelessBuilder()
    .name("emc/tablet_to_table")
    .output(item("projecte:transmutation_table")).input(item("projecte:item.pe_transmutation_tablet")).register()

crafting.removeByOutput(item("projecte:condenser_mk2"))
crafting.shapedBuilder()
    .name("emc/condenser_mk2")
    .matrix("RSR", "SLS", "RSR")
    .key("R", item("thaumcraft:stone_arcane"))
    .key("S", item("netherized:netherite_ingot"))
    .key("L", item("projecte:condenser_mk1"))
    .output(item("projecte:condenser_mk2"))
    .register()

crafting.removeByOutput(item("betterbuilderswands:wanddiamond"))
crafting.shapedBuilder()
    .name("emc/diamond_wand")
    .matrix("  C", " S ", "S  ")
    .key("C", item("essentialcraft:genitem", 45))
    .key("S", ore("stickWood"))
    .output(item("betterbuilderswands:wanddiamond"))
    .register()

crafting.remove("betterbuilderswands:recipewandunbreakable")
crafting.shapedBuilder()
    .name("emc/unbreakable_wand")
    .matrix("  N", " W ", "S  ")
    .key("S", ore("stickWood"))
    .key("W", item("betterbuilderswands:wanddiamond"))
    .key("N", item("minecraft:nether_star"))
    .output(item("betterbuilderswands:wandunbreakable", 12))
    .register()

mods.roots.fey_crafter.recipeBuilder()
    .name("knowledge_tome")
    .input(item("minecraft:book"), item("essentialcraft:genitem", 45), item("essentialcraft:genitem", 45), item("essentialcraft:genitem", 45), item("essentialcraft:genitem", 45))
    .output(item("projecte:item.pe_tome"))
    .register()

crafting.removeByOutput(item("chisel:offsettool"))
crafting.shapedBuilder()
    .name("emc/offset_tool")
    .matrix("IC", "SI")
    .key("I", item("minecraft:iron_ingot"))
    .key("C", item("essentialcraft:genitem", 45))
    .key("S", ore("stickWood"))
    .output(item("chisel:offsettool"))
    .register()

mods.tconstruct.drying.removeByOutput(item("tconstruct:dried_clay"))
mods.tconstruct.drying.removeByOutput(item("tconstruct:materials", 2))
