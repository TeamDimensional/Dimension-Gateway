// Arc Furnace Bricks
crafting.remove("immersiveengineering:stone_decoration/blastbrick_reinforced")
crafting.shapedBuilder()
        .name("tier4/blast_brick")
        .output(item("immersiveengineering:stone_decoration", 2) * 4)
        .matrix("SBS", "BHB", "SBS")
        .key("S", ore("plateSteel")).key("B", item("immersiveengineering:stone_decoration", 1)).key("H", item("immersiveengineering:material", 19))
        .register()

// Controller Slave
crafting.remove("storagedrawers:controller_slave")
/*
crafting.shapedBuilder()
        .name("tier4/drawer/controller_slave")
        .output(item("tconstruct:materials", 13))
        .matrix("SSS", "RDR", "SGS")
        .key("S", item("minecraft:stone")).key("R", RESTONIA).key("D", ore("drawerBasic")).key("G", ore("ingotGold"))
        .register()
*/

// Storage Upgrades
crafting.remove("storagedrawers:upgrade_void")
crafting.remove("storagedrawers:upgrade_storage_obsidian")
crafting.remove("storagedrawers:upgrade_storage_iron")
crafting.remove("storagedrawers:upgrade_storage_gold")
/*
crafting.shapedBuilder()
        .name("tier4/drawer/upgrade_void")
        .output(item("storagedrawers:upgrade_void"))
        .matrix("VSV", "STS", "VSV")
        .key("S", ore("stickWood")).key("V", VOID).key("T", item("storagedrawers:upgrade_template"))
        .register()
crafting.shapedBuilder()
        .name("tier4/drawer/upgrade_t1")
        .output(item("storagedrawers:upgrade_storage"))
        .matrix("SSS", "VTV", "SSS")
        .key("S", ore("stickWood")).key("V", VOID).key("T", item("storagedrawers:upgrade_template"))
        .register()
*/
crafting.shapedBuilder()
        .name("tier4/drawer/upgrade_t2")
        .output(item("storagedrawers:upgrade_storage", 1))
        .matrix("G", "T", "G")
        .key("G", ore("plateIron")).key("T", item("storagedrawers:upgrade_storage"))
        .register()
crafting.shapedBuilder()
        .name("tier4/drawer/upgrade_t3")
        .output(item("storagedrawers:upgrade_storage", 2))
        .matrix("G", "T", "G")
        .key("G", ore("plateGold")).key("T", item("storagedrawers:upgrade_storage", 1))
        .register()

// Natural Altar
mods.naturesaura.ritual.removeByOutput(item("naturesaura:nature_altar"))
/*
mods.naturesaura.ritual.recipeBuilder()
    .name("tier4/nat_altar")
    .input(item("minecraft:stone"), item("minecraft:stone"), item("roots:runic_dust"), item("naturesaura:gold_leaf"),
           item("naturesaura:token_joy"), DIAMATINE, DIAMATINE)
    .output(item("naturesaura:eye"))
    .time(250)
    .sapling(item("minecraft:sapling", 2))
    .register()
*/
