import classes.GatewayHelpers


def lapisItems = [
    item("minecraft:lapis_ore"), item("minecraft:dye", 4), item("minecraft:lapis_block")
]
def quartzItems = [
    item("minecraft:stone_slab", 7), item("minecraft:quartz_ore"), item("minecraft:quartz"),
    item("minecraft:quartz_block"), item("minecraft:daylight_detector"),
    item("minecraft:quartz_block", 1), item("minecraft:quartz_block", 2), item("minecraft:quartz_stairs")
]
def goldItems = [
    item("minecraft:gold_ore"), item("minecraft:gold_nugget"), item("minecraft:gold_ingot"), item("minecraft:gold_block"),
    item("minecraft:light_weighted_pressure_plate"),
    item("minecraft:golden_apple"), item("minecraft:speckled_melon"), item("minecraft:golden_carrot"),
    item("minecraft:golden_helmet"), item("minecraft:golden_chestplate"),
    item("minecraft:golden_leggings"), item("minecraft:golden_boots")
]
def redstoneItems = [
    item("minecraft:redstone_ore"), item("minecraft:redstone"), item("minecraft:repeater"),
    item("minecraft:redstone_torch"), item("minecraft:comparator"), item("minecraft:redstone_lamp"),
    item("minecraft:redstone_block"), item("minecraft:piston"), item("minecraft:observer"),
    item("minecraft:noteblock"), item("minecraft:dropper"), item("minecraft:dispenser"),
    item("minecraft:clock"), item("minecraft:compass"), item("minecraft:sticky_piston")
]
def emeraldItems = [
    item("minecraft:emerald_ore"), item("minecraft:emerald"), item("minecraft:emerald_block")
]
def diamondItems = [
    item("minecraft:diamond_ore"), item("minecraft:diamond"), item("minecraft:diamond_block"),
    item("minecraft:jukebox"), 
    item("minecraft:diamond_helmet"), item("minecraft:diamond_chestplate"),
    item("minecraft:diamond_leggings"), item("minecraft:diamond_boots")
]
def obsidianItems = [
    item("minecraft:obsidian"), item("minecraft:enchanting_table")
    // enchanted books can be looted before this tier
]

def shulkerBoxes = []
for (def color in GatewayHelpers.colors)
    shulkerBoxes.add(item("minecraft:${color}_shulker_box"))

def endItems = [
    item("minecraft:end_stone"), item("minecraft:purpur_block"), item("minecraft:purpur_pillar"), item("minecraft:purpur_stairs"),
    item("minecraft:purpur_slab"), item("minecraft:end_bricks"), item("minecraft:end_portal_frame"), item("minecraft:dragon_egg"),
    item("minecraft:skull", 5), item("minecraft:chorus_plant"), item("minecraft:chorus_flower"), item("minecraft:end_crystal"),
    item("minecraft:ender_pearl"), item("minecraft:ender_eye"), item("minecraft:chorus_fruit"), item("minecraft:chorus_fruit_popped"),
    item("minecraft:end_rod"), item("minecraft:dragon_breath"), item("minecraft:lingering_potion"), item("minecraft:shulker_shell"),
    item("minecraft:tipped_arrow")
] + shulkerBoxes
def futureItems = [
    item("minecraft:ender_chest"), item("minecraft:beacon"), item("minecraft:nether_star")
]

def potionItems = [
    item("minecraft:brewing_stand"), item("minecraft:potion"), item("minecraft:splash_potion")
]

def hideFromJei = [
    item("minecraft:mob_spawner"), item("minecraft:command_block"), item("minecraft:barrier"), item("minecraft:knowledge_book"),
    item("minecraft:repeating_command_block"), item("minecraft:chain_command_block"), item("minecraft:structure_void"),
    item("minecraft:structure_block"), item("minecraft:filled_map"), item("minecraft:command_block_minecart"),
    item("minecraft:written_book")
]


for (def it in lapisItems) GatewayHelpers.setTier(it, 2)
for (def it in quartzItems) GatewayHelpers.setTier(it, 2)
for (def it in redstoneItems) GatewayHelpers.setTier(it, 3)
for (def it in goldItems) GatewayHelpers.setTier(it, 3)
for (def it in emeraldItems) GatewayHelpers.setTier(it, 4)
for (def it in diamondItems) GatewayHelpers.setTier(it, 4)
for (def it in obsidianItems) GatewayHelpers.setTier(it, 5)
for (def it in endItems) GatewayHelpers.setTier(it, 6)
for (def it in futureItems) GatewayHelpers.setTier(it, -1)
for (def it in potionItems) GatewayHelpers.setTier(it, 4)
for (def it in hideFromJei) mods.jei.ingredient.hide(it)
