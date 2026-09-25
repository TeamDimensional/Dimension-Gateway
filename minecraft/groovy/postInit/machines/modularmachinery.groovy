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
    ["itemId": "modularmachinery:blockinputbus",
     "upgrade": item("minecraft:chest"),
     "highTierUpgrade": item("ironchest:iron_chest", 6),
     "crystalIndex": 5, "progression": ["small", "normal", "reinforced", "large", "huge", "ludicrous"]],
    ["itemId": "modularmachinery:blockoutputbus",
     "upgrade": item("minecraft:chest"),
     "highTierUpgrade": item("ironchest:iron_chest", 6),
     "crystalIndex": 5, "progression": ["small", "normal", "reinforced", "large", "huge", "ludicrous"]],
    ["itemId": "modularmachinery:blockfluidinputhatch",
     "upgrade": item("thermaldynamics:duct_16", 2),
     "highTierUpgrade": item("thermaldynamics:duct_16", 7),
     "crystalIndex": 1, "progression": ["small", "normal", "reinforced", "large", "huge", "ludicrous", "ultimate"]],
    ["itemId": "modularmachinery:blockenergyinputhatch",
     "upgrade": item("actuallyadditions:block_laser_relay"),
     "highTierUpgrade": item("actuallyadditions:block_laser_relay_extreme"),
     "crystalIndex": 0, "progression": ["small", "normal", "reinforced", "large", "huge", "ludicrous", "ultimate"]],
    ["itemId": "mmce_complement:input_assembly_hatch",
     "upgrade": item("minecraft:chest"), "upgrade2": item("thermaldynamics:duct_16", 2),
     "highTierUpgrade": item("ironchest:iron_chest", 6), "highTierUpgrade2": item("thermaldynamics:duct_16", 7),
     "crystalIndex": 2, "progression": ["normal", "large", "huge", "ludicrous"]],
    ["itemId": "mmce_complement:output_assembly_hatch",
     "upgrade": item("minecraft:chest"), "upgrade2": item("thermaldynamics:duct_16", 2),
     "highTierUpgrade": item("ironchest:iron_chest", 6), "highTierUpgrade2": item("thermaldynamics:duct_16", 7),
     "crystalIndex": 2, "progression": ["normal", "large", "huge", "ludicrous"]],
    ["itemId": "mmce_complement:quad_fluid_input_hatch_tiny",
     "upgrade": item("thermaldynamics:duct_16", 2),
     "highTierUpgrade": item("thermaldynamics:duct_16", 7),
     "crystalIndex": 1, "progression": ["small", "normal", "reinforced", "large", "huge", "ludicrous", "ultimate"]],
]

def craftMatrices = [
    "small": ["S", "H", "s"],
    "normal": [" S ", "PHP", " s "],
    "reinforced": ["PSP", "cHc", "PsP"],
    "large": ["PSP", "cHc", "PsP"],
    "huge": ["PSP", "eHe", "PsP"],
    "ludicrous": ["PSP", "eHe", "PsP"],
    "ultimate": ["PSP", "EHE", "PsP"],
]
def plateItems = [
    "small": item("thermalfoundation:material", 32),  // unused
    "normal": item("thermalfoundation:material", 354),
    "reinforced": item("thermalfoundation:material", 358),
    "large": item("thermalfoundation:material", 326),
    "huge": item("thermalfoundation:material", 359),
    "ludicrous": item("nuclearcraft:part", 1),
    "ultimate": item("nuclearcraft:part", 3),
]

for (def it in busses) {
    for (def i in 0..it["progression"].size() - 1) {
        def inputItem = item(it["itemId"], i)
        def outputItem = item(it["itemId"], i + 1)
        def tier = it["progression"][i]
        def upgradeKey = (tier == "huge" || tier == "ludicrous" || tier == "ultimate") ? "highTierUpgrade" : "upgrade"
        def item1 = it[upgradeKey]
        def item2 = it[upgradeKey + "2"] != null ? it[upgradeKey + "2"] : item1
        def type = it["itemId"].replace(":", "_")

        crafting.shapedBuilder()
            .name("modular/${type}_${i}")
            .matrix(craftMatrices[tier] as String[])
            .key("P", plateItems[tier])
            .key("H", inputItem)
            .key("c", item("actuallyadditions:item_crystal", it["crystalIndex"]))
            .key("e", item("actuallyadditions:item_crystal_empowered", it["crystalIndex"]))
            .key("E", item("actuallyadditions:block_crystal_empowered", it["crystalIndex"]))
            .key("S", item1)
            .key("s", item2)
            .output(outputItem)
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
    ["iteminput", item("modularmachinery:blockinputbus", 4), item("modularmachinery:blockmeiteminputbus"), item("mmce_complement:me_item_inventory_input_bus")],
    ["itemoutput", item("modularmachinery:blockoutputbus", 4), item("modularmachinery:blockmeitemoutputbus"), null],
    ["fluidinput", item("mmce_complement:quad_fluid_input_hatch_tiny", 4), item("modularmachinery:blockmefluidinputbus"), item("mmce_complement:me_fluid_inventory_input_bus")],
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
    if (it[3] != null) {
        crafting.shapedBuilder()
            .name("modular/ae2_${it[0]}_adv")
            .matrix("MDM", "TVT", "MRM")
            .key("M", item("appliedenergistics2:smooth_sky_stone_block"))
            .key("T", item("thermalfoundation:material", 357))
            .key("V", item("appliedenergistics2:material", 24))
            .key("D", item("integrateddynamics:logic_director"))
            .key("R", it[1])
            .output(it[3])
            .register()
    }
}

mods.calculator.atomic_calculator.recipeBuilder()
    .input(item("mmce_complement:me_item_inventory_input_bus"), item("calculator:atomicbinder"), item("thermalfoundation:tome_lexicon"))
    .output(item("mmce_complement:me_ore_dict_input_bus"))
    .register()

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

// Aura Input Hatch
crafting.shapedBuilder()
    .name("modular/input_aura")
    .matrix("MHM", " V ", "M M")
    .key("M", item("naturesaura:infused_stone"))
    .key("V", item("modularmachinery:blockcasing"))
    .key("H", item("naturesaura:grated_chute"))
    .output(item("modularmachinery:blockauraproviderinput"))
    .register()

// Redstone Output Hatch
crafting.shapedBuilder()
    .name("modular/output_redstone")
    .matrix("M M", " V ", "MHM")
    .key("H", item("prodigytech:circuit_crude"))
    .key("V", item("modularmachinery:blockcasing"))
    .key("M", item("minecraft:comparator"))
    .output(item("mmce_complement:redstone_signal_output_hatch"))
    .register()

// Dual Input Hatch
crafting.shapedBuilder()
    .name("modular/input_dual")
    .matrix("MIM", " F ", "MVM")
    .key("M", item("prodigytech:circuit_crude"))
    .key("V", item("modularmachinery:blockcasing"))
    .key("I", item("minecraft:hopper"))
    .key("F", item("minecraft:bucket"))
    .output(item("mmce_complement:input_assembly_hatch"))
    .register()

// Dual Output Hatch
crafting.shapedBuilder()
    .name("modular/output_dual")
    .matrix("MVM", " F ", "MIM")
    .key("M", item("prodigytech:circuit_crude"))
    .key("V", item("modularmachinery:blockcasing"))
    .key("I", item("minecraft:hopper"))
    .key("F", item("minecraft:bucket"))
    .output(item("mmce_complement:output_assembly_hatch"))
    .register()

// Quadruple Fluid Input Hatch
crafting.shapedBuilder()
    .name("modular/input_quad")
    .matrix("MHM", " V ", "MBM")
    .key("M", item("immersiveengineering:metal_device1", 6))
    .key("V", item("modularmachinery:blockcasing"))
    .key("H", item("thaumcraft:tube_valve"))
    .key("B", item("minecraft:bucket"))
    .output(item("mmce_complement:quad_fluid_input_hatch_tiny"))
    .register()

// ME Connection Sharing Hatch
crafting.shapedBuilder()
    .name("modular/me_sharing")
    .matrix("M M", " V ", "M M")
    .key("M", item("appliedenergistics2:quantum_ring"))
    .key("V", item("modularmachinery:blockcasing", 4))
    .output(item("mmce_complement:me_connection_share_hatch"))
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
