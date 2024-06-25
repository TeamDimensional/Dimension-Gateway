
import com.cleanroommc.groovyscript.event.LootTablesLoadedEvent

// Currently 2 criteria of item removal
// 1) progression skip
// 2) useless tools
// Currently not adding loot, should do it in the future
event_manager.listen { LootTablesLoadedEvent event ->
    def ieHouse = event.loot.getTable("immersiveengineering:chests/engineers_house")
    ieHouse.removePool("immersiveengineering:engineers_village_house_1")
    ieHouse.removePool("immersiveengineering:engineers_village_house_2")
    def iePool = ieHouse.getPool("immersiveengineering:engineers_village_house_0")
    for (def entry in ["steel_rod", "coal_coke", "iron_component", "steel_component", "lead_nugget", "silver_nugget", "nugget_nickel"]) {
        iePool.removeEntry(entry)
    }

    def blacksmithHouse = event.loot.getTable("minecraft:chests/village_blacksmith")
    def blacksmith = blacksmithHouse.getPool("main")
    for (def entry in ["minecraft:diamond", "minecraft:gold_ingot", "minecraft:obsidian", "minecraft:iron_pickaxe", "minecraft:iron_sword"]) {
        blacksmith.removeEntry(entry)
    }

    def rootsHut = event.loot.getTable("mysticalworld:chests/hut").getPool("gems")
    for (def entry in ["mysticalworld:amethyst_gem", "minecraft:diamond", "minecraft:ender_pearl",
                       "minecraft:quartz", "minecraft:redstone", "minecraft:gold_ingot", "minecraft:silver_ingot", "mysticalworld:copper_ingot"]) {
        rootsHut.removeEntry(entry)
    }

    def strongholdCorridor = event.loot.getTable("minecraft:chests/stronghold_corridor")
    strongholdCorridor.removePool("botania_inject_pool")  // black lotus + manasteel
    def shC = strongholdCorridor.getPool("main")
    for (def entry in ["minecraft:ender_pearl", "minecraft:diamond", "minecraft:gold_ingot",
                       "minecraft:redstone", "minecraft:iron_pickaxe", "minecraft:iron_sword"]) {
        shC.removeEntry(entry)
    }

    def strongholdCrossing = event.loot.getTable("minecraft:chests/stronghold_crossing")
    def shCr = strongholdCrossing.getPool("main")
    for (def entry in ["minecraft:gold_ingot", "minecraft:redstone", "minecraft:iron_pickaxe"]) {
        shCr.removeEntry(entry)
    }

    def jungleTemple = event.loot.getTable("minecraft:chests/jungle_temple")
    def jungle = jungleTemple.getPool("main")
    for (def entry in ["minecraft:diamond", "minecraft:gold_ingot", "minecraft:emerald"]) {
        jungle.removeEntry(entry)
    }

    def igloo = event.loot.getTable("minecraft:chests/igloo_chest").getPool("main")
    igloo.removeEntry("minecraft:emerald")
    igloo.removeEntry("minecraft:gold_nugget")

    def mineshaft = event.loot.getTable("minecraft:chests/abandoned_mineshaft")
    mineshaft.getPool("main").removeEntry("minecraft:iron_pickaxe")
    def ms = mineshaft.getPool("pool1")
    for (def entry in ["minecraft:gold_ingot", "minecraft:redstone", "minecraft:diamond"]) {
        ms.removeEntry(entry)
    }

    def bridge = event.loot.getTable("minecraft:chests/nether_bridge").getPool("main")
    for (def entry in ["minecraft:diamond", "minecraft:gold_ingot", "minecraft:golden_sword", "minecraft:obsidian"]) {
        bridge.removeEntry(entry)
    }

    def mansion = event.loot.getTable("minecraft:chests/woodland_mansion")
    def mnMain = mansion.getPool("main")
    for (def entry in ["minecraft:diamond_hoe"]) {
        mnMain.removeEntry(entry)
    }
    def mn1 = mansion.getPool("pool1")
    for (def entry in ["minecraft:gold_ingot", "minecraft:redstone"]) {
        mn1.removeEntry(entry)
    }

    def dungeon = event.loot.getTable("minecraft:chests/simple_dungeon")
    def dRes = dungeon.getPool("pool1")
    for (def entry in ["minecraft:gold_ingot", "minecraft:redstone"]) {
        dRes.removeEntry(entry)
    }
    dungeon.removePool("botania_inject_pool")

    def desertPyramid = event.loot.getTable("minecraft:chests/desert_pyramid").getPool("main")
    for (def entry in ["minecraft:diamond", "minecraft:gold_ingot", "minecraft:emerald"]) {
        desertPyramid.removeEntry(entry)
    }

    def endCity = event.loot.getTable("minecraft:chests/end_city_treasure").getPool("main")
    for (def entry in ["minecraft:iron_pickaxe", "minecraft:iron_shovel", "minecraft:iron_sword"]) {
        endCity.removeEntry(entry)
    }
}