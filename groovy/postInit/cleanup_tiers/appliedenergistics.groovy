import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("appliedenergistics2:${name}", k)
}

def tier3Items = [
    mitem("quartz_glass"), mitem("quartz_vibrant_glass"), 
]

def tier6Items = [
    mitem("quartz_block"), mitem("quartz_pillar"), mitem("chiseled_quartz_block"), mitem("quartz_fixture"), mitem("fluix_block"),
    mitem("sky_stone_block"), mitem("smooth_sky_stone_block"), mitem("sky_stone_brick"), mitem("sky_stone_small_brick"),
    mitem("inscriber"), mitem("security_station"), mitem("controller"), mitem("drive"), mitem("chest"), mitem("interface"),
    mitem("cell_workbench"), mitem("energy_acceptor"), mitem("energy_cell"), mitem("dense_energy_cell"),
    mitem("crafting_unit"), mitem("crafting_monitor"), mitem("molecular_assembler"), mitem("color_applicator"),
    mitem("sky_stone_stairs"), mitem("smooth_sky_stone_stairs"), mitem("sky_stone_brick_stairs"), mitem("sky_stone_small_brick_stairs"),
    mitem("sky_stone_slab"), mitem("smooth_sky_stone_slab"), mitem("sky_stone_brick_slab"), mitem("sky_stone_small_brick_slab"),
    mitem("quartz_stairs"), mitem("quartz_pillar_stairs"), mitem("chiseled_quartz_stairs"), mitem("fluix_stairs"),
    mitem("quartz_slab"), mitem("quartz_pillar_slab"), mitem("chiseled_quartz_slab"), mitem("fluix_slab"),
    mitem("biometric_card"), mitem("memory_card"), mitem("network_tool"), mitem("view_cell"), mitem("encoded_pattern"),
    item("nae2:material"), item("nae2:pattern_multiplier"), item("nae2:storage_cell_void"), item("nae2:fluid_storage_cell_void"),
    item("nae2:part", 1), item("nae2:upgrade", 1),
]
for (def i in [0, 2, 7, 8, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 35, 36, 37, 39, 43, 44, 45, 46, 52, 53, 61])
    tier6Items.add(mitem("material", i))
for (def a in 0..16)
    for (def b in [0, 1, 2, 3, 25])
        tier6Items.add(mitem("part", a + b * 20))
for (def i in [80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 340, 360, 380, 400, 420, 440, 460, 480])
    tier6Items.add(mitem("part", i))

def tier8Items = [
    mitem("wireless_access_point"), mitem("quantum_ring"), mitem("quantum_link"), mitem("spatial_pylon"),
    mitem("spatial_io_port"), mitem("fluid_interface"), mitem("io_port"), mitem("condenser"),
    mitem("crafting_accelerator"), mitem("entropy_manipulator"), mitem("wireless_terminal"), mitem("matter_cannon"),
    item("nae2:part"), item("aenetvistool:net_visualizer"),
]
for (def i in 0..35) tier8Items.add(mitem("paint_ball", i))
for (def i in [6, 9, 28, 29, 30, 31, 32, 33, 34, 38, 41, 42, 47, 48, 54, 55, 56, 57, 58, 60])
    tier8Items.add(mitem("material", i))
for (def i in [221, 222, 241, 261, 281, 300, 301, 302, 320, 321, 341, 441, 520, 521, 522])
    tier8Items.add(mitem("part", i))
for (def i in [4, 16, 64]) tier8Items.add(item("nae2:coprocessor_${i}x"))

def tier11Items = [
    mitem("wireless_crafting_terminal"), mitem("wireless_pattern_terminal"), mitem("wireless_fluid_terminal"),
    mitem("material", 59), item("nae2:part", 2), item("nae2:upgrade"), item("nae2:exposer"),
]
for (def i in 1..8) tier11Items.add(item("nae2:material", i))
for (def i in [256, 1024, 4096, 16384]) {
    tier11Items.add(item("nae2:storage_cell_${i}k"))
    tier11Items.add(item("nae2:storage_cell_fluid_${i}k"))
    tier11Items.add(item("nae2:storage_crafting_${i}k"))
}

for (def name in ["crafting_storage", "storage_cell"]) {
    for (def tier in ["1k", "4k", "16k"]) tier6Items.add(mitem("${name}_${tier}"))
    tier8Items.add(mitem("${name}_64k"))
}
for (def tier in ["1k", "4k", "16k", "64k"]) tier8Items.add(mitem("fluid_storage_cell_${tier}"))
for (def tier in ["2", "16", "128"]) tier8Items.add(mitem("spatial_storage_cell_${tier}_cubed"))

def creativeItems = [
    mitem("creative_energy_cell"), mitem("creative_storage_cell"),
]

def removeRecipes = [
    mitem("sky_compass"), mitem("charged_staff"), mitem("quartz_growth_accelerator"), mitem("portable_cell"), item("nae2:reconstruction_chamber"),
]

def hideFromJei = [
    mitem("facade"), mitem("material", 1), mitem("material", 5),
] + removeRecipes

for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in tier8Items) TooltipEvents.setTier(it, 8)
for (def it in tier11Items) TooltipEvents.setTier(it, 11)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
