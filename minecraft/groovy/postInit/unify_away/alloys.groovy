import classes.AlloyHelper

// Base Metals
crafting.remove("thermalfoundation:material")
crafting.remove("thermalfoundation:material_1")
crafting.remove("thermalfoundation:material_2")
crafting.remove("thermalfoundation:material_3")

AlloyHelper.builder()  // Constantan
    .input(item("thermalfoundation:material", 128), item("thermalfoundation:material", 133))
    .output(item("thermalfoundation:material", 164) * 2)
    .register()

AlloyHelper.builder()  // Bronze
    .input(item("thermalfoundation:material", 128) * 3, item("thermalfoundation:material", 129))
    .output(item("thermalfoundation:material", 163) * 4)
    .register()

AlloyHelper.builder()  // Invar
    .input(item("minecraft:iron_ingot") * 2, item("thermalfoundation:material", 133))
    .output(item("thermalfoundation:material", 162) * 3)
    .register()

AlloyHelper.builder()  // Electrum
    .input(item("minecraft:gold_ingot"), item("thermalfoundation:material", 130))
    .output(item("thermalfoundation:material", 161) * 2)
    .register()

AlloyHelper.builder()  // Steel
    .input(item("minecraft:iron_ingot"), item("immersiveengineering:material", 17))
    .output(item("thermalfoundation:material", 160))
    .register()
AlloyHelper.builder()  // Steel
    .input(item("minecraft:iron_ingot"), item("thermalfoundation:material", 769) * 4)
    .output(item("thermalfoundation:material", 160))
    .minTier(1)
    .register()

// TConstruct
AlloyHelper.builder()  // Aluminium Brass
    .input(item("thermalfoundation:material", 128), item("thermalfoundation:material", 132) * 3)
    .output(item("tconstruct:ingots", 5) * 4)
    .register()

AlloyHelper.builder()  // Knightmetal
    .input(item("thermalfoundation:material", 160), item("tconstruct:edible", 2))
    .output(item("tconstruct:ingots", 3))
    .register()

AlloyHelper.builder()  // Pig Iron
    .input(item("thermalfoundation:material", 162), item("tconstruct:edible", 3))
    .output(item("tconstruct:ingots", 4))
    .register()

AlloyHelper.builder()  // Alumite
    .input(item("thermalfoundation:material", 160), item("thermalfoundation:material", 132))
    .output(item("tconstruct:ingots", 6) * 2)
    .register()

AlloyHelper.builder()  // Manyullyn
    .input(item("tconstruct:ingots"), item("tconstruct:ingots", 1))
    .output(item("tconstruct:ingots", 2) * 2)
    .register()

// Project Red
AlloyHelper.builder()  // Red Alloy
    .input(item("thermalfoundation:material", 130), item("minecraft:redstone") * 4)
    .output(item("projectred-core:resource_item", 103))
    .register()

// Colored Hardened Glass
def hardenedGlass = [
    [item("thermalfoundation:glass"), item("thermalfoundation:material", 64)],
    [item("thermalfoundation:glass", 1), item("thermalfoundation:material", 65)],
    [item("thermalfoundation:glass", 2), item("thermalfoundation:material", 66)],
    [item("thermalfoundation:glass", 4), item("thermalfoundation:material", 68)],
    [item("thermalfoundation:glass", 5), item("thermalfoundation:material", 69)],
    [item("thermalfoundation:glass", 6), item("thermalfoundation:material", 70)],
    [item("thermalfoundation:glass", 7), item("thermalfoundation:material", 71)],
    [item("thermalfoundation:glass", 8), item("thermalfoundation:material", 72)],
    [item("thermalfoundation:glass_alloy"), item("thermalfoundation:material", 96)],
    [item("thermalfoundation:glass_alloy", 1), item("thermalfoundation:material", 97)],
    [item("thermalfoundation:glass_alloy", 2), item("thermalfoundation:material", 98)],
    [item("thermalfoundation:glass_alloy", 3), item("thermalfoundation:material", 99)],
    [item("thermalfoundation:glass_alloy", 4), item("thermalfoundation:material", 100)],
    [item("thermalfoundation:glass_alloy", 5), item("thermalfoundation:material", 101)],
    [item("thermalfoundation:glass_alloy", 6), item("thermalfoundation:material", 102)],
    [item("thermalfoundation:glass_alloy", 7), item("thermalfoundation:material", 103)],
]

for (def it in hardenedGlass) {
    AlloyHelper.builder()
        .input(item("thermalfoundation:glass", 3) * 2, it[1])
        .output(it[0])
        .timeMultiplier(0.75)
        .minTier(2)
        .register()
}

// Nuclearcraft
AlloyHelper.builder()  // Ferroboron
    .input(item("thermalfoundation:material", 160), item("nuclearcraft:ingot", 5))
    .output(item("nuclearcraft:alloy", 6) * 2)
    .minTier(2)
    .timeMultiplier(1.5)
    .register()

AlloyHelper.builder()  // Tough Alloy
    .input(item("nuclearcraft:alloy", 6), item("nuclearcraft:ingot", 6))
    .output(item("nuclearcraft:alloy", 1) * 2)
    .minTier(2)
    .timeMultiplier(1.5)
    .register()

AlloyHelper.builder()  // Hard Carbon
    .input(item("nuclearcraft:ingot", 8), item("nuclearcraft:gem_dust"))
    .output(item("nuclearcraft:alloy", 2))
    .minTier(2)
    .timeMultiplier(1.5)
    .register()

AlloyHelper.builder()  // MgB2
    .input(item("nuclearcraft:ingot", 7), item("nuclearcraft:ingot", 5) * 2)
    .output(item("nuclearcraft:alloy", 3) * 3)
    .minTier(3)
    .timeMultiplier(2)
    .register()

AlloyHelper.builder()  // LiMnO2
    .input(item("nuclearcraft:ingot", 6), item("nuclearcraft:ingot", 15))
    .output(item("nuclearcraft:alloy", 4) * 2)
    .minTier(3)
    .timeMultiplier(2)
    .register()

AlloyHelper.builder()  // Extreme Alloy
    .input(item("nuclearcraft:alloy", 1), item("theaurorian:auroriansteel"))
    .output(item("nuclearcraft:alloy", 10) * 2)
    .minTier(3)
    .timeMultiplier(2)
    .register()

AlloyHelper.builder()  // Thermoconducting Alloy
    .input(item("nuclearcraft:alloy", 10), item("nuclearcraft:gem", 5))
    .output(item("nuclearcraft:alloy", 11) * 2)
    .minTier(3)
    .timeMultiplier(2)
    .register()

AlloyHelper.builder()  // Zircalloy
    .input(item("nuclearcraft:ingot", 10) * 7, item("thermalfoundation:material", 129))
    .output(item("nuclearcraft:alloy", 12) * 8)
    .minTier(2)
    .timeMultiplier(4)
    .register()

AlloyHelper.builder()  // SiC
    .input(item("nuclearcraft:ingot", 8), item("nuclearcraft:gem", 6))
    .output(item("nuclearcraft:alloy", 13) * 2)
    .minTier(3)
    .timeMultiplier(2)
    .register()

AlloyHelper.builder()  // HSLA
    .input(item("enderio:item_alloy_ingot", 8) * 7, item("nuclearcraft:ingot", 11))
    .output(item("nuclearcraft:alloy", 15) * 8)
    .minTier(3)
    .timeMultiplier(4)
    .register()

AlloyHelper.builder()  // ZrMo
    .input(item("nuclearcraft:ingot", 10), item("nuclearcraft:fission_dust", 6) * 15)
    .output(item("nuclearcraft:alloy", 16) * 16)
    .minTier(3)
    .timeMultiplier(8)
    .register()

AlloyHelper.builder()  // Hastelloy
    .input(item("qmd:ingot_alloy", 5) * 3, item("nuclearcraft:fission_dust", 6))
    .output(item("nuclearcraft:alloy", 17) * 4)
    .minTier(3)
    .timeMultiplier(2)
    .register()

AlloyHelper.builder()  // NiCr
    .input(item("thermalfoundation:material", 133), item("qmd:ingot", 2))
    .output(item("qmd:ingot_alloy", 5) * 4)
    .minTier(3)
    .register()

// Advanced Rocketry
AlloyHelper.builder()  // Titanium Aluminide
    .input(item("thermalfoundation:material", 132) * 7, item("libvulpes:productingot", 7) * 3)
    .output(item("advancedrocketry:productingot") * 3)
    .minTier(3)
    .timeMultiplier(4)
    .register()

AlloyHelper.builder()  // Titanium Iridium
    .input(item("thermalfoundation:material", 135), item("libvulpes:productingot", 7))
    .output(item("advancedrocketry:productingot") * 2)
    .minTier(3)
    .timeMultiplier(2)
    .register()

// EnderIO
AlloyHelper.builder()  // Electrical Steel
    .input(item("thermalfoundation:material", 160), item("nuclearcraft:gem", 6))
    .output(item("enderio:item_alloy_ingot"))
    .minTier(5)
    .timeMultiplier(2)
    .register()

AlloyHelper.builder()  // Energetic Alloy (has Marimorphosis recipe)
    .input(item("minecraft:gold_ingot"), item("minecraft:redstone"), item("minecraft:glowstone_dust"))
    .output(item("enderio:item_alloy_ingot", 1))
    .minTier(5)
    .register()

AlloyHelper.builder()  // Vibrant Alloy (has Marimorphosis recipe)
    .input(item("enderio:item_alloy_ingot", 1), item("minecraft:ender_pearl"))
    .output(item("enderio:item_alloy_ingot", 2))
    .minTier(5)
    .register()

AlloyHelper.builder()  // Redstone Alloy (has Marimorphosis recipe)
    .input(item("nuclearcraft:gem"), item("minecraft:redstone"))
    .output(item("enderio:item_alloy_ingot", 3))
    .minTier(5)
    .register()

AlloyHelper.builder()  // Conductive Iron
    .input(item("minecraft:iron_ingot"), item("thermalfoundation:material", 893))
    .output(item("enderio:item_alloy_ingot", 4))
    .minTier(5)
    .timeMultiplier(2)
    .register()

AlloyHelper.builder()  // Pulsating Iron (has Marimorphosis recipe)
    .input(item("minecraft:iron_ingot"), item("minecraft:ender_pearl"))
    .output(item("enderio:item_alloy_ingot", 5))
    .minTier(5)
    .register()

AlloyHelper.builder()  // Dark Steel (has Marimorphosis recipe)
    .input(item("thermalfoundation:material", 160), item("minecraft:obsidian"))
    .output(item("enderio:item_alloy_ingot", 6))
    .minTier(5)
    .register()

AlloyHelper.builder()  // Soularium
    .input(item("embers:ingot_dawnstone"), item("minecraft:soul_sand"))
    .output(item("enderio:item_alloy_ingot", 7))
    .minTier(5)
    .timeMultiplier(2)
    .register()

AlloyHelper.builder()  // End Steel
    .input(item("enderio:item_alloy_ingot", 6), item("thermalfoundation:material", 167), item("ee:dark_ingot"))
    .output(item("enderio:item_alloy_ingot", 8) * 2)
    .minTier(5)
    .timeMultiplier(3)
    .register()

AlloyHelper.builder()  // Crystalline Alloy
    .input(item("theaurorian:crystallineingot"), item("enderio:item_material", 36), item("gateway:starsteel_ingot"))
    .output(item("enderio:item_alloy_endergy_ingot", 1) * 2)
    .minTier(5)
    .timeMultiplier(3)
    .register()

AlloyHelper.builder()  // Melodic Alloy
    .input(item("theaurorian:aurorianiteingot"), item("minecraft:chorus_fruit_popped"), item("industrialforegoing:pink_slime_ingot"))
    .output(item("enderio:item_alloy_endergy_ingot", 2) * 2)
    .minTier(5)
    .timeMultiplier(3)
    .register()

AlloyHelper.builder()  // Stellar Alloy
    .input(item("enderio:item_alloy_endergy_ingot", 2), item("minecraft:nether_star"), item("thermalfoundation:material", 135))
    .output(item("enderio:item_alloy_endergy_ingot", 3))
    .minTier(3)
    .timeMultiplier(4)
    .register()

// NC Isotopes
def isotopes = [
    ["nuclearcraft:uranium", 3],
    ["nuclearcraft:neptunium", 2],
    ["nuclearcraft:plutonium", 4],
    ["nuclearcraft:americium", 3],
    ["nuclearcraft:curium", 4],
    ["nuclearcraft:berkelium", 2],
    ["nuclearcraft:californium", 4],
    ["qmd:copernicium", 1],
]

def fuels = [
    ["nuclearcraft:pellet_thorium", 1],
    ["nuclearcraft:pellet_uranium", 4],
    ["nuclearcraft:pellet_neptunium", 2],
    ["nuclearcraft:pellet_plutonium", 4],
    ["nuclearcraft:pellet_mixed", 2],
    ["nuclearcraft:pellet_americium", 2],
    ["nuclearcraft:pellet_curium", 6],
    ["nuclearcraft:pellet_berkelium", 2],
    ["nuclearcraft:pellet_californium", 4],
    ["qmd:pellet_copernicium", 1],
]

for (def it in isotopes) {
    for (def i in 0..(it[1] - 1)) {
        mods.nuclearcraft.alloy_furnace.builder()  // C
            .input(item(it[0], 5 * i), item("nuclearcraft:dust", 8))
            .output(item(it[0], 5 * i + 1))
            .register()
        mods.nuclearcraft.alloy_furnace.builder()  // ZA
            .input(item(it[0], 5 * i), item("nuclearcraft:dust", 10))
            .output(item(it[0], 5 * i + 4))
            .register()
    }
}

for (def it in fuels) {
    for (def i in 0..(it[1] - 1)) {
        mods.nuclearcraft.alloy_furnace.builder()  // C
            .input(item(it[0], 2 * i), item("nuclearcraft:dust", 8))
            .output(item(it[0], 2 * i + 1))
            .register()
        mods.nuclearcraft.alloy_furnace.builder()  // ZA
            .input(item(it[0], 2 * i), item("nuclearcraft:dust", 10))
            .output(item(it[0].replace("pellet_", "fuel_"), 4 * i + 3))
            .register()
    }
}

// QMD
AlloyHelper.builder()  // Stainless Steel
    .input(item("abyssalcraft:ethaxiumingot"), item("prodigytech:zorrasteel_ingot"), item("qmd:ingot", 2))
    .output(item("qmd:ingot_alloy", 2) * 3)
    .minTier(3)
    .timeMultiplier(4)
    .register()

AlloyHelper.builder()  // NbSn
    .input(item("thermalfoundation:material", 129), item("qmd:ingot", 1) * 3)
    .output(item("qmd:ingot_alloy", 1) * 4)
    .minTier(3)
    .timeMultiplier(4)
    .register()

AlloyHelper.builder()  // NbTi
    .input(item("libvulpes:productingot", 7), item("qmd:ingot", 1))
    .output(item("qmd:ingot_alloy", 3) * 2)
    .minTier(3)
    .timeMultiplier(2)
    .register()

inWorldCrafting.fluidToItem.recipeBuilder()  // OsIr
        .fluidInput(fluid("plasma"), 0.0f)
        .input(item("qmd:ingot", 8))
        .input(item("thermalfoundation:material", 135))
        .output(item("qmd:ingot_alloy", 4) * 2)
        .register()

AlloyHelper.builder()  // Super Alloy
    .input(item("qmd:ingot_alloy", 5), item("qmd:ingot_alloy", 3), item("abyssalcraft:abyingot"))
    .output(item("qmd:ingot_alloy", 6) * 3)
    .minTier(3)
    .timeMultiplier(4)
    .register()

// TODO: ZnS
// TODO: Industrial Insulation
// TODO: Blank Dark Steel Upgrade

// Glass
AlloyHelper.builder()
    .input(item("minecraft:glass"), item("tconstruct:clear_glass"))
    .output(item("enderio:block_fused_glass") * 2)
    .minTier(1)
    .timeMultiplier(0.25)
    .register()
AlloyHelper.builder()
    .input(item("enderio:block_fused_glass"), item("minecraft:glowstone") * 2)
    .output(item("enderio:block_enlightened_fused_glass"))
    .minTier(1)
    .timeMultiplier(0.25)
    .register()
AlloyHelper.builder()
    .input(item("enderio:block_fused_glass"), ore("dyeBlack"))
    .output(item("enderio:block_dark_fused_glass"))
    .minTier(1)
    .timeMultiplier(0.25)
    .register()

AlloyHelper.builder()
    .input(item("minecraft:quartz_block"), item("minecraft:glass"))
    .output(item("enderio:block_fused_quartz"))
    .minTier(1)
    .timeMultiplier(0.5)
    .register()
AlloyHelper.builder()
    .input(item("enderio:block_fused_quartz"), item("minecraft:glowstone") * 2)
    .output(item("enderio:block_enlightened_fused_quartz"))
    .minTier(1)
    .timeMultiplier(0.25)
    .register()
AlloyHelper.builder()
    .input(item("enderio:block_fused_quartz"), ore("dyeBlack"))
    .output(item("enderio:block_dark_fused_quartz"))
    .minTier(1)
    .timeMultiplier(0.25)
    .register()
