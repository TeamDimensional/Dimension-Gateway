import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("minecraft:${name}", k)
}

def toolTypes = ["shovel", "pickaxe", "axe", "sword", "hoe"]

def lapisItems = [mitem("lapis_ore"), mitem("dye", 4), mitem("lapis_block")]
def quartzItems = [
    mitem("stone_slab", 7), mitem("quartz_ore"), mitem("quartz"), mitem("quartz_block"), mitem("daylight_detector"),
    mitem("quartz_block", 1), mitem("quartz_block", 2), mitem("quartz_stairs")
]
def goldItems = [
    mitem("gold_ore"), mitem("gold_nugget"), mitem("gold_ingot"), mitem("gold_block"), mitem("light_weighted_pressure_plate"),
    mitem("speckled_melon"), mitem("golden_carrot"), mitem("golden_helmet"), mitem("golden_chestplate"),
    mitem("golden_leggings"), mitem("golden_boots")
]
def redstoneItems = [
    mitem("redstone_ore"), mitem("redstone"), mitem("repeater"), mitem("redstone_torch"), mitem("comparator"), mitem("redstone_lamp"),
    mitem("redstone_block"),  mitem("observer"), mitem("noteblock"), mitem("dropper"), mitem("dispenser"),
    mitem("clock"), mitem("compass"),
]
// Pistons are moved into Tier 2 even though they require redstone to support certain crafting methods
def pistons = [mitem("piston"), mitem("sticky_piston")]
def emeraldItems = [mitem("emerald_ore"), mitem("emerald"), mitem("emerald_block")]
def diamondItems = [
    mitem("diamond_ore"), mitem("diamond"), mitem("diamond_block"), mitem("jukebox"), 
    mitem("diamond_helmet"), mitem("diamond_chestplate"), mitem("diamond_leggings"), mitem("diamond_boots")
]
def obsidianItems = [
    mitem("obsidian"), mitem("enchanting_table")
    // enchanted books can be looted before this tier
]

def shulkerBoxes = []
for (def color in GatewayHelpers.colors)
    shulkerBoxes.add(mitem("${color}_shulker_box"))

def endItems = [
    mitem("end_stone"), mitem("purpur_block"), mitem("purpur_pillar"), mitem("purpur_stairs"), mitem("purpur_slab"), mitem("end_bricks"),
    mitem("end_portal_frame"), mitem("dragon_egg"), mitem("skull", 5), mitem("chorus_plant"), mitem("chorus_flower"), mitem("end_crystal"),
    mitem("ender_pearl"), mitem("chorus_fruit"), mitem("chorus_fruit_popped"), mitem("end_rod"), mitem("dragon_breath"), mitem("lingering_potion"),
    mitem("shulker_shell"), mitem("tipped_arrow"), mitem("ender_chest"), mitem("elytra"),
] + shulkerBoxes

def potionItems = [mitem("brewing_stand"), mitem("potion"), mitem("splash_potion")]

def hideFromJei = [
    mitem("mob_spawner"), mitem("command_block"), mitem("barrier"), mitem("knowledge_book"), mitem("repeating_command_block"),
    mitem("chain_command_block"), mitem("structure_void"), mitem("structure_block"), mitem("filled_map"), mitem("command_block_minecart"),
    mitem("written_book")
]
for (int i in 0..5) hideFromJei.add(mitem("monster_egg", i))

for (def type in toolTypes) {
    for (def material in ["wooden", "stone", "iron", "golden", "diamond"]) {
        GatewayHelpers.banTool(mitem("${material}_${type}"))
    }
    diamondItems.add(mitem("diamond_${type}"))
    goldItems.add(mitem("golden_${type}"))
}

def waterPotion = mitem("potion").withNbt(["Potion": "minecraft:water"])

for (def it in lapisItems) TooltipEvents.setTier(it, 2)
for (def it in quartzItems) TooltipEvents.setTier(it, 2)
for (def it in pistons) TooltipEvents.setTier(it, 2)
for (def it in redstoneItems) TooltipEvents.setTier(it, 3)
for (def it in goldItems) TooltipEvents.setTier(it, 3)
for (def it in emeraldItems) TooltipEvents.setTier(it, 4)
for (def it in diamondItems) TooltipEvents.setTier(it, 4)
for (def it in obsidianItems) TooltipEvents.setTier(it, 5)
for (def it in endItems) TooltipEvents.setTier(it, 6)
for (def it in potionItems) TooltipEvents.setTier(it, 4)
for (def it in hideFromJei) GatewayHelpers.hide(it)
TooltipEvents.setTier(mitem("beacon"), 9)
TooltipEvents.setTier(mitem("bedrock"), 0)
TooltipEvents.addTierPredicate("waterbottle", s -> s in waterPotion, 1)

furnace.removeByOutput(mitem("iron_nugget"))
furnace.removeByOutput(mitem("gold_nugget"))

TooltipEvents.setUnlock(mitem("ender_eye"), 6)
