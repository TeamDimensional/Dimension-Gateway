import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("appliedenergistics2:${name}", k)
}
def citem(name, k=0) {
    return item("cells:${name}", k)
}

def earlyItems = [
    mitem("quartz_glass"), mitem("quartz_vibrant_glass"), 
]

def modItems = [
    mitem("quartz_block"), mitem("quartz_pillar"), mitem("chiseled_quartz_block"), mitem("quartz_fixture"), mitem("fluix_block"),
    mitem("sky_stone_block"), mitem("smooth_sky_stone_block"), mitem("sky_stone_brick"), mitem("sky_stone_small_brick"),
    mitem("security_station"), mitem("controller"), mitem("drive"), mitem("chest"), mitem("interface"),
    mitem("cell_workbench"), mitem("energy_acceptor"), mitem("energy_cell"), mitem("dense_energy_cell"),
    mitem("crafting_unit"), mitem("crafting_monitor"), mitem("molecular_assembler"), mitem("color_applicator"),
    mitem("sky_stone_stairs"), mitem("smooth_sky_stone_stairs"), mitem("sky_stone_brick_stairs"), mitem("sky_stone_small_brick_stairs"),
    mitem("sky_stone_slab"), mitem("smooth_sky_stone_slab"), mitem("sky_stone_brick_slab"), mitem("sky_stone_small_brick_slab"),
    mitem("quartz_stairs"), mitem("quartz_pillar_stairs"), mitem("chiseled_quartz_stairs"), mitem("fluix_stairs"),
    mitem("quartz_slab"), mitem("quartz_pillar_slab"), mitem("chiseled_quartz_slab"), mitem("fluix_slab"),
    mitem("biometric_card"), mitem("memory_card"), mitem("network_tool"), mitem("view_cell"), mitem("encoded_pattern"),
    item("nae2:material"), item("nae2:pattern_multiplier"), item("nae2:storage_cell_void"), item("nae2:fluid_storage_cell_void"),
    item("nae2:part", 1), item("nae2:upgrade", 1), item("cellterminal:cell_terminal"), item("cellterminal:wireless_cell_terminal"),
    item("aenetvistool:net_visualizer"), mitem("crafting_accelerator"), item("nae2:coprocessor_4x"), item("nae2:coprocessor_16x"),
    mitem("io_port"), mitem("fluid_interface"), mitem("entropy_manipulator"), mitem("matter_cannon"),
    citem("import_interface"), citem("import_fluid_interface"), citem("export_interface"), citem("export_fluid_interface"),
    item("ae2powertools:network_health_scanner"), item("ae2powertools:priority_tuner"), item("ae2powertools:cards_distributor"),
]
for (def i in [0, 2, 7, 8, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 35, 36, 37, 39, 43, 44, 45, 46, 52, 53, 60, 61])
    modItems.add(mitem("material", i))
for (def a in 0..16)
    for (def b in [0, 1, 2, 3, 25])
        modItems.add(mitem("part", a + b * 20))
for (def i in [80, 100, 120, 140, 160, 180, 200, 220, 221, 222, 240, 241, 260, 261, 280, 281,
               300, 302, 320, 321, 340, 360, 380, 400, 420, 440, 441, 460, 480, 520, 521, 522])
    modItems.add(mitem("part", i))
for (def i in 0..3)
    modItems.add(citem("part", i))

def thaumicItems = [
    citem("import_essentia_interface"), citem("export_essentia_interface"), citem("essentia_part", 0), citem("essentia_part", 1),
    citem("configurable_cell"), citem("overclocked_processor"), citem("overclocked_processor", 2),
]
for (def tier in 0..6)
    thaumicItems.add(citem("equal_distribution_card", tier))

def advancedItems = [
    mitem("wireless_access_point"), mitem("quantum_ring"), mitem("quantum_link"), mitem("spatial_pylon"),
    mitem("spatial_io_port"), mitem("condenser"), mitem("wireless_terminal"),
    item("nae2:part"), mitem("wireless_interface_terminal"),
    mitem("wireless_crafting_terminal"), mitem("wireless_pattern_terminal"), mitem("wireless_fluid_terminal"),
    item("nae2:coprocessor_64x"), item("nae2:upgrade"), item("nae2:exposer"), item("nae2:part", 2), mitem("part", 341),
    citem("overflow_card"), citem("trash_unselected_card"), citem("compression_tier_card"), citem("decompression_tier_card"),
    citem("pull_card"), citem("push_card"), item("ae2powertools:auto_crafter"),
]
for (def i in 0..35) advancedItems.add(mitem("paint_ball", i))
for (def i in [6, 9, 28, 29, 30, 31, 32, 33, 34, 38, 41, 42, 47, 48, 54, 55, 56, 57, 58])
    advancedItems.add(mitem("material", i))
for (def tier in 0..3) advancedItems.add(item("ae2powertools:crafter_speed_upgrade", tier))

def eliteItems = [mitem("material", 59), citem("overclocked_processor", 1)]
for (def i in 1..8) eliteItems.add(item("nae2:material", i))
for (def i in [256, 1024, 4096, 16384]) {
    eliteItems.add(item("nae2:storage_cell_${i}k"))
    eliteItems.add(item("nae2:storage_cell_fluid_${i}k"))
    eliteItems.add(item("nae2:storage_crafting_${i}k"))
}

for (def name in ["crafting_storage", "storage_cell", "fluid_storage_cell"]) {
    for (def tier in ["1k", "4k", "16k"]) modItems.add(mitem("${name}_${tier}"))
    advancedItems.add(mitem("${name}_64k"))
}
for (def tier in ["2", "16", "128"]) advancedItems.add(mitem("spatial_storage_cell_${tier}_cubed"))

for (def tier in 0..2) {
    thaumicItems.add(citem("compacting_cell", tier))
    thaumicItems.add(citem("compacting_component", tier))
}
advancedItems.add(citem("compacting_cell", 3))
advancedItems.add(citem("compacting_component", 3))
for (def tier in 4..7) {
    eliteItems.add(citem("compacting_cell", tier))
    eliteItems.add(citem("compacting_component", tier))
}

def creativeItems = [
    mitem("creative_energy_cell"), mitem("creative_storage_cell"), item("thaumicenergistics:essentia_cell_creative"), citem("creative_fluid_cell"),
]

def removeRecipes = [
    mitem("sky_compass"), mitem("charged_staff"), mitem("portable_cell"), item("nae2:reconstruction_chamber"), mitem("material", 46),
    item("appliedenergistics2:energy_acceptor"), citem("oredict_card"), citem("equal_distribution_card", 7),
    item("ae2powertools:better_level_maintainer"),
]
for (def tier in 8..11) {
    removeRecipes.add(citem("compacting_cell", tier))
    removeRecipes.add(citem("compacting_component", tier))
}
for (def tier in 1..4) {
    removeRecipes.add(citem("compression_tier_card", tier))
    removeRecipes.add(citem("decompression_tier_card", tier))
}
for (def tier in 0..3) {
    for (def kind in ["silicon", "logic", "calculation", "engineering"]) {
        removeRecipes.add(citem("compressed_${kind}_print", tier))
    }
}

def hideFromJei = [
    mitem("facade"), mitem("material", 1), mitem("material", 5), mitem("material", 19), mitem("material", 21), mitem("part", 301), citem("recovery_container"),
    citem("creative_cell"), citem("creative_essentia_cell"),
] + removeRecipes
for (def kind in 0..2) hideFromJei.add(citem("singularity_processor", kind))

TooltipEvents.setModTier("thaumicenergistics", 9)
for (def it in earlyItems) TooltipEvents.setTier(it, 3)
for (def it in modItems) TooltipEvents.setTier(it, 8)
for (def it in thaumicItems) TooltipEvents.setTier(it, 9)
for (def it in advancedItems) TooltipEvents.setTier(it, 10)
for (def it in eliteItems) TooltipEvents.setTier(it, 11)
for (def it in creativeItems) TooltipEvents.setTier(it, 14)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)

mods.jei.category.remove("appliedenergistics2.inscriber")
mods.jei.category.remove("nae2:cell_view")
