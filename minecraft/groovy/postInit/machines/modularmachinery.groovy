// Generic things
crafting.remove("modularmachinery:casing_plain")
crafting.shapedBuilder()
    .name("modular/basic_casing")
    .matrix(" A ", "AIA", " A ")
    .key("A", item("theaurorian:auroriansteel"))
    .key("I", item("actuallyadditions:block_misc", 9))
    .output(item("modularmachinery:blockcasing"))
    .register()

crafting.remove("modularmachinery:casing_reinforced")
crafting.shapedBuilder()
    .name("modular/reinforced_casing")
    .matrix(" A ", "AIA", " A ")
    .key("A", item("thermalfoundation:material", 359))
    .key("I", item("modularmachinery:blockcasing"))
    .output(item("modularmachinery:blockcasing", 4))
    .register()

crafting.remove("modularmachinery:item_output_small")
crafting.remove("modularmachinery:item_input_small")
crafting.remove("modularmachinery:energy_input_tiny")
crafting.remove("modularmachinery:energy_input_small")
crafting.remove("modularmachinery:fluid_input_small")

def busses = [
    ["blockoutputbus", item("minecraft:chest"), 7, 5, item("ironchest:iron_chest", 6)],
    ["blockinputbus", item("minecraft:chest"), 7, 5, item("ironchest:iron_chest", 6)],
    ["blockfluidinputhatch", item("minecraft:bucket"), 8, 1, item("minecraft:bucket")],
    ["blockenergyinputhatch", item("actuallyadditions:block_laser_relay"), 8, 0, item("actuallyadditions:block_laser_relay_extreme")],
]

for (def it in busses) {
    def type = it[0]
    def additional = it[1]
    def max = it[2]
    def empIndex = it[3]
    def additional2 = it[4]

    if (max > 1) {
        // Small
        crafting.shapedBuilder()
            .name("modular/${type}_1")
            .matrix("SPS")
            .key("P", item("modularmachinery:${type}", 0))
            .key("S", additional)
            .output(item("modularmachinery:${type}", 1))
            .register()
    }

    if (max > 2) {
        // Normal
        crafting.shapedBuilder()
            .name("modular/${type}_2")
            .matrix(" S ", "IPI", " S ")
            .key("I", item("thermalfoundation:material", 354))
            .key("P", item("modularmachinery:${type}", 1))
            .key("S", additional)
            .output(item("modularmachinery:${type}", 2))
            .register()
    }

    if (max > 3) {
        // Reinforced
        crafting.shapedBuilder()
            .name("modular/${type}_3")
            .matrix("ISI", "EPE", "ISI")
            .key("I", item("thermalfoundation:material", 359))
            .key("E", item("actuallyadditions:item_crystal", empIndex))
            .key("P", item("modularmachinery:${type}", 2))
            .key("S", additional)
            .output(item("modularmachinery:${type}", 3))
            .register()
    }

    if (max > 4) {
        // Big
        crafting.shapedBuilder()
            .name("modular/${type}_4")
            .matrix("ISI", "EPE", "ISI")
            .key("I", item("appliedenergistics2:smooth_sky_stone_block"))
            .key("E", item("actuallyadditions:item_crystal", empIndex))
            .key("P", item("modularmachinery:${type}", 3))
            .key("S", additional)
            .output(item("modularmachinery:${type}", 4))
            .register()
    }

    if (max > 5) {
        // Huge
        crafting.shapedBuilder()
            .name("modular/${type}_5")
            .matrix("ISI", "EPE", "ISI")
            .key("I", item("appliedenergistics2:smooth_sky_stone_block"))
            .key("E", item("actuallyadditions:item_crystal_empowered", empIndex))
            .key("P", item("modularmachinery:${type}", 4))
            .key("S", additional2)
            .output(item("modularmachinery:${type}", 5))
            .register()
    }

    if (max > 6) {
        // Ludicrous
        crafting.shapedBuilder()
            .name("modular/${type}_6")
            .matrix("ISI", "EPE", "ISI")
            .key("I", item("nuclearcraft:part", 1))
            .key("E", item("actuallyadditions:item_crystal_empowered", empIndex))
            .key("P", item("modularmachinery:${type}", 5))
            .key("S", additional2)
            .output(item("modularmachinery:${type}", 6))
            .register()
    }

    if (max > 7) {
        // Vacuum/Ultimate
        crafting.shapedBuilder()
            .name("modular/${type}_7")
            .matrix("ISI", "EPE", "ISI")
            .key("I", item("nuclearcraft:part", 3))
            .key("E", item("actuallyadditions:block_crystal_empowered", empIndex))
            .key("P", item("modularmachinery:${type}", 6))
            .key("S", additional2)
            .output(item("modularmachinery:${type}", 7))
            .register()
    }
}

crafting.shapedBuilder()
    .name("modular/tiny_energy_input")
    .matrix("H", "C", "L")
    .key("C", item("modularmachinery:blockcasing"))
    .key("H", item("minecraft:hopper"))
    .key("L", item("immersiveengineering:wirecoil", 2))
    .output(item("modularmachinery:blockenergyinputhatch"))
    .register()

// AE2 busses
crafting.shapedBuilder()
    .name("modular/ae2_essentia")
    .matrix("M M", "TVT", "MRM")
    .key("M", item("gateway:transcendental_matrix"))
    .key("T", item("thaumcraft:plate", 2))
    .key("V", item("modularmachinery:blockaspectproviderinput"))
    .key("R", item("modularmachinery:blockcasing", 4))
    .output(item("modularmachineryaddons:blockmeessentiainputbus"))
    .register()

def meBusses = [
    ["iteminput", item("modularmachinery:blockinputbus", 3), item("modularmachinery:blockmeiteminputbus")],
    ["itemoutput", item("modularmachinery:blockoutputbus", 3), item("modularmachinery:blockmeitemoutputbus")],
    ["fluidinput", item("modularmachinery:blockfluidinputhatch", 3), item("modularmachinery:blockmefluidinputbus")],
]
for (def it in meBusses) {
    crafting.shapedBuilder()
        .name("modular/ae2_${it[0]}")
        .matrix("M M", "TVT", "MRM")
        .key("M", item("appliedenergistics2:smooth_sky_stone_block"))
        .key("T", item("thermalfoundation:material", 357))
        .key("V", item("appliedenergistics2:material", 23))
        .key("R", it[1])
        .output(it[2])
        .register()
}

///// Special Hatches
// Starlight Hatch
mods.astralsorcery.starlight_altar.discoveryRecipeBuilder()
    .output(item("modularmachinery:blockstarlightproviderinput"))
    .matrix("F F", "OCO", "ISI")
    .key("C", item("modularmachinery:blockcasing"))
    .key("I", item("gateway:ilium_shard"))
    .key("O", item("gateway:ourium_shard"))
    .key("F", item("gateway:fengarum_shard"))
    .key("S", item("gateway:starsteel_ingot"))
    .craftTime(100)
    .starlight(500)
    .register()

// Mana Hatch
crafting.shapedBuilder()
    .name("modular/input_mana")
    .matrix("MHM", " V ", "M M")
    .key("M", item("botania:manaresource"))
    .key("V", item("modularmachinery:blockcasing"))
    .key("H", item("botania:rune", 8))
    .output(item("modularmachinery:blockmanaproviderinput"))
    .register()

// Essentia Input Hatch
crafting.shapedBuilder()
    .name("modular/input_essentia")
    .matrix("MHM", " V ", "M M")
    .key("M", item("thaumcraft:plate", 2))
    .key("V", item("modularmachinery:blockcasing"))
    .key("H", item("thaumcraft:metal_alchemical"))
    .output(item("modularmachinery:blockaspectproviderinput"))
    .register()

// Essentia Output Hatch
crafting.shapedBuilder()
    .name("modular/output_essentia")
    .matrix("M M", " V ", "MHM")
    .key("M", item("thaumcraft:plate", 3))
    .key("V", item("modularmachinery:blockcasing"))
    .key("H", item("thaumcraft:metal_alchemical_advanced"))
    .output(item("modularmachinery:blockaspectprovideroutput"))
    .register()

// Aura Output Hatch
crafting.shapedBuilder()
    .name("modular/input_aura")
    .matrix("MHM", " V ", "M M")
    .key("M", item("naturesaura:infused_stone"))
    .key("V", item("modularmachinery:blockcasing"))
    .key("H", item("naturesaura:grated_chute"))
    .output(item("modularmachinery:blockauraproviderinput"))
    .register()

///// Controllers
// Moonlight Fabricator
crafting.shapedBuilder()
    .name("modular/moonlight_fabricator")
    .output(item("modularmachinery:moonlight_fabricator_controller"))
    .matrix("M M", "PCP", "IPI")
    .key("M", item("theaurorian:moongem"))
    .key("C", item("modularmachinery:blockcasing"))
    .key("I", item("naturesaura:infused_stone"))
    .key("P", item("tconstruct:large_plate").withNbt(["Material": "gateway_crystal"]))
    .register()

// Dawnstone Refinery
mods.thaumcraft.arcane_workbench.shapedBuilder()
    .researchKey("ELEMENTALTOOLS")
    .output(item("modularmachinery:dawnstone_refinery_controller"))
    .matrix(" P ", "DCD", "BDB")
    .key("P", item("prodigytech:circuit_refined"))
    .key("D", item("embers:plate_dawnstone"))
    .key("B", item("embers:ember_bore"))
    .key("C", item("modularmachinery:blockcasing"))
    .aspect("aqua", 2).aspect("ignis", 10).aspect("terra", 5)
    .vis(25)
    .register()

// Starlight Laser
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("modularmachinery:starlight_laser_controller"))
    .matrix("c   c",
            " FDF ",
            " OCO ",
            " IRI ",
            "S   S")
    .key("S", item("theaurorian:auroriansteelblock"))
    .key("c", item("minecraft:clock"))
    .key("C", item("modularmachinery:blockcasing"))
    .key("I", item("gateway:ilium_shard"))
    .key("O", item("gateway:ourium_shard"))
    .key("F", item("gateway:fengarum_shard"))
    .key("R", item("prodigytech:circuit_refined"))
    .key("D", item("ee:infused_crystal"))
    .craftTime(200)
    .starlight(1500)
    .register()

// Natural Infuser
crafting.shapedBuilder()
    .name("modular/natural_infuser")
    .output(item("modularmachinery:natural_infuser_controller"))
    .matrix(" T ", "gCg", "GRG")
    .key("C", item("modularmachinery:blockcasing"))
    .key("T", item("astralsorcery:blocktreebeacon"))
    .key("G", item("ee:green_crystal_item"))
    .key("g", item("ee:green_chunk"))
    .key("R", item("prodigytech:circuit_refined"))
    .register()

// Network Supercharger
crafting.shapedBuilder()
    .mirrored()
    .name("modular/network_supercharger")
    .output(item("modularmachinery:network_supercharger_controller"))
    .matrix("S  ", " CF", "FEF")
    .key("C", item("modularmachinery:blockcasing"))
    .key("S", item("aether_legacy:lightning_sword") | item("aether_legacy:lightning_knife"))
    .key("F", item("appliedenergistics2:fluix_block"))
    .key("E", item("calculator:circuitboard", 9))
    .register()

// Resonant Caster
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("modularmachinery:resonant_caster_controller"))
    .matrix("S   s",
            "  R  ",
            " ECE ",
            " EPE ",
            "W   A")
    .key("C", item("modularmachinery:blockcasing", 4))
    .key("P", item("prodigytech:circuit_perfected"))
    .key("R", item("deepresonance:resonating_crystal"))
    .key("S", item("botania:rune", 4))
    .key("s", item("botania:rune", 5))
    .key("A", item("botania:rune", 6))
    .key("W", item("botania:rune", 7))
    .key("E", item("actuallyadditions:block_misc", 8))
    .craftTime(200)
    .starlight(1500)
    .register()

// Thaumic Centrifuge
mods.thaumcraft.arcane_workbench.shapedBuilder()
    .researchKey("ELEMENTALTOOLS")
    .output(item("modularmachinery:thaumic_centrifuge_controller"))
    .matrix(" E ", "VCV", "RVR")
    .key("C", item("modularmachinery:blockcasing", 4))
    .key("R", item("astralsorcery:itemcraftingcomponent", 4))
    .key("E", item("thaumcraft:centrifuge"))
    .key("V", item("thaumcraft:plate", 3))
    .aspect("aqua", 10).aspect("perditio", 10)
    .vis(60)
    .register()
