/*
Byproduct 1 - tier 3
Byproduct 2 - tier 4
Byproduct 3 - tier 6 (metallic), tier 8 (nonmetallic)
Byproduct 4 - tier 7
Byproduct 5 - tier 13
*/

def oresMetallic = [
    "Coal": ["Coal", "Coal", "Sulfur", "Graphite"],
    "Gold": ["Copper", "Silver", "Silver", "Ardite"],
    "Iron": ["Tin", "Nickel", "Nickel", "Cobalt"],
    "Redstone": ["Gold", "Redstone", "Silver", "Redstone"],
    "Lapis": ["Sulfur", "Lapis", "Aluminum", "Lapis"],
    "Diamond": ["Coal", "Diamond", "Lapis", "Graphite"],
    "Emerald": ["Emerald", "Lapis", "Diamond", "Beryllium"],
    "Quartz": ["Sulfur", "Glowstone", "Sulfur", "CertusQuartz"],
    "Thorium": ["Lead", "Coal", "Uranium", "Lead"],
    "Uranium": ["Lead", "Thorium", "Thorium", "Resonating"],
    "Boron": ["Aluminum", "Iron", "Aluminum", "Lithium"],
    "Lithium": ["Beryllium", "Magnesium", "Beryllium", "Emerald"],
    "Magnesium": ["Beryllium", "Lithium", "Zirconium", "Magnesium"],
    "Cerulean": ["Iron", "Moonstone", "Moonstone", "Aether"],
    "Moonstone": ["Silver", "Gold", "Cerulean", "Aether"],
    "Copper": ["Silver", "Gold", "Silver", "Nickel"],
    "Tin": ["Iron", "Nickel", "Aluminum", "Nickel"],
    "Silver": ["Lead", "Gold", "Gold", "Platinum"],
    "Lead": ["Iron", "Silver", "Gold", "Uranium"],
    "Aluminum": ["Iron", "Tin", "Iron", "Iron"],
    "Nickel": ["Tin", "Iron", "Cobalt", "Platinum"],
    "Cobalt": ["Nickel", "Iron", "Ardite", "Tin"],
    "Ardite": ["Gold", "Cobalt", "Iron", "Platinum"],
    "Titanium": ["Iron", "Aluminum", "Iron", "Ardite"],
    "Iridium": ["Platinum", "Cobalt", "Platinum", "Osmium"],
    "LiquifiedCoralium": ["Cobalt", "Titanium", "Platinum", "Diamond"],
]

def oresNonMetallic = [
    "Aether": ["Silver", "Nickel", "Lithium", "Silver"],
    "FireElemental": ["FireElemental", "Blaze", "FireElemental", "FireElemental"],
    "WaterElemental": ["WaterElemental", "Lapis", "WaterElemental", "WaterElemental"],
    "AirElemental": ["AirElemental", "Quartz", "AirElemental", "AirElemental"],
    "EarthElemental": ["EarthElemental", "Graphite", "EarthElemental", "EarthElemental"],
    "Mithriline": ["Mithriline", "Cobalt", "Mithriline", "Mithriline"],
    "DimensionalShard": ["Diamond", "DimensionalShard", "DimensionalShard", "Emerald"],
    "Ambrosium": ["Zanite", "Quartz", "CertusQuartz", "Lapis"],
    "Zanite": ["Ambrosium", "Amethyst", "Lapis", "Amethyst"],
    "AurorianCoal": ["Coal", "Sulfur", "Graphite", "Graphite"],
    "AurorianGeode": ["Quartz", "Lapis", "Diamond", "Diamond"],
    "Dilithium": ["Lithium", "Dilithium", "Lapis", "Magnesium"],
    "Resonating": ["Redstone", "Lead", "Redstone", "Uranium"],
    "Amber": ["Amber", "AirElemental", "EarthElemental", "Ambrosium"],
]

// First entry is a crusher byproduct (i.e. dust), second entry is a furnace output (i.e. ingot)
outputs = [
    "Copper": [item("thermalfoundation:material", 64), item("thermalfoundation:material", 128)],
    "Silver": [item("thermalfoundation:material", 66), item("thermalfoundation:material", 130)],
    "Ardite": [item("enderio:item_material", 30), item("tconstruct:ingots", 1)],
    "Platinum": [item("thermalfoundation:material", 70), item("thermalfoundation:material", 134)],
    "Tin": [item("thermalfoundation:material", 65), item("thermalfoundation:material", 129)],
    "Nickel": [item("thermalfoundation:material", 69), item("thermalfoundation:material", 133)],
    "Cobalt": [item("enderio:item_material", 31), item("tconstruct:ingots")],
    "Gold": [item("thermalfoundation:material", 1), item("minecraft:gold_ingot")],
    "Resonating": [item("deepresonance:resonating_plate") * 4, item("deepresonance:resonating_plate") * 4],
    "Uranium": [item("nuclearcraft:dust", 4), item("nuclearcraft:ingot", 4)],
    "Redstone": [item("minecraft:redstone") * 4, item("minecraft:redstone") * 4],
    "Lead": [item("thermalfoundation:material", 67), item("thermalfoundation:material", 131)],
    "Thorium": [item("nuclearcraft:dust", 3), item("nuclearcraft:ingot", 3)],
    "Iron": [item("thermalfoundation:material"), item("minecraft:iron_ingot")],
    "Aluminum": [item("thermalfoundation:material", 68), item("thermalfoundation:material", 132)],
    "Beryllium": [item("nuclearcraft:dust", 9), null],  // no ore
    "Magnesium": [item("nuclearcraft:dust", 7), item("nuclearcraft:ingot", 7)],
    "Lithium": [item("nuclearcraft:dust", 6), item("nuclearcraft:ingot", 6)],
    "Zirconium": [item("nuclearcraft:dust", 10), null],  // no ore
    "Moonstone": [item("jaopca:dust.moonstone"), item("theaurorian:moonstoneingot")],
    "Aether": [item("aetherworks:item_resource") * 4, item("aetherworks:item_resource") * 4],
    "Cerulean": [item("jaopca:dust.cerulean"), item("theaurorian:ceruleaningot")],
    "Boron": [item("nuclearcraft:dust", 5), item("nuclearcraft:ingot", 5)],
    "Osmium": [item("qmd:dust", 8), null],  // no ore
    "Coal": [item("minecraft:coal"), item("minecraft:coal")],
    "Sulfur": [item("thermalfoundation:material", 771), null],  // no ore
    "Graphite": [item("nuclearcraft:dust", 8), null],   // no ore
    "Diamond": [item("minecraft:diamond"), item("minecraft:diamond")],
    "Lapis": [item("minecraft:dye", 4) * 5, item("minecraft:dye", 4) * 5],
    "Emerald": [item("minecraft:emerald"), item("minecraft:emerald")],
    "Glowstone": [item("minecraft:glowstone_dust") * 3, null],  // no ore
    "CertusQuartz": [item("appliedenergistics2:material", 2), null],  // no ore
    "FireElemental": [item("essentialcraft:gem_elemental") * 2, item("essentialcraft:gem_elemental") * 2],
    "WaterElemental": [item("essentialcraft:gem_elemental", 1) * 2, item("essentialcraft:gem_elemental", 1) * 2],
    "AirElemental": [item("essentialcraft:gem_elemental", 3) * 2, item("essentialcraft:gem_elemental", 3) * 2],
    "EarthElemental": [item("essentialcraft:gem_elemental", 2) * 2, item("essentialcraft:gem_elemental", 2) * 2],
    "Mithriline": [item("essentialcraft:genitem", 51) * 6, item("essentialcraft:genitem", 51) * 6],
    "Blaze": [item("minecraft:blaze_powder"), null],  // no ore
    "DimensionalShard": [item("rftools:dimensional_shard") * 6, item("rftools:dimensional_shard") * 6],
    "Zanite": [item("aether_legacy:zanite_gemstone"), item("aether_legacy:zanite_gemstone")],
    "Ambrosium": [item("aether_legacy:ambrosium_shard"), item("aether_legacy:ambrosium_shard")],
    "Amethyst": [item("calculator:smallamethyst") * 2, null],  // no ore
    "Dilithium": [item("libvulpes:productdust"), item("libvulpes:productdust")],
    "AurorianCoal": [item("theaurorian:auroriancoal"), item("theaurorian:auroriancoal")],
    "AurorianGeode": [item("theaurorian:crystal"), item("theaurorian:crystal")],
    "LiquifiedCoralium": [item("jaopca:dust.liquified_coralium"), item("abyssalcraft:cingot")],
    "Amber": [item("thaumcraft:amber"), item("thaumcraft:amber")],
    "Quartz": [item("minecraft:quartz"), item("minecraft:quartz")],
    "Titanium": [item("libvulpes:productdust", 7), item("libvulpes:productingot", 7)],
    "Iridium": [item("thermalfoundation:material", 71), item("thermalfoundation:material", 135)],
]

outputFluids = [  // overrides from default fluid(name) * 144
    "Redstone": fluid("redstone") * 400,
    "Coal": fluid("coal") * 100,
    "Diamond": fluid("diamond") * 666,
    "Lapis": fluid("lapis") * 3330,
    "Emerald": fluid("emerald") * 666,
    "Quartz": fluid("quartz") * 666,
]

byproductFluidAmounts = [
    "Redstone": 60,
    "Coal": 20,
    "Diamond": 148,
    "Lapis": 370,
    "Emerald": 148,
    "Quartz": 148,
]


def getOutputFluid(name) {
    nameSnakeCase = name.replaceAll(/(?<!^)([A-Z])/, '_$1').toLowerCase()
    if (outputFluids[name])
        return outputFluids[name]
    return fluid(nameSnakeCase) * 144
}

mods.essentialcraft.magmatic_smeltery.removeAll()


def addOre(key, byproducts, addFluidOps) {
    def snakeCase = key.replaceAll(/(?<!^)([A-Z])/, '_$1').toLowerCase()
    def itemOre = ore("ore" + key)
    def itemCluster = item("jaopca:ore_cluster." + snakeCase)
    def itemCrystal = item("jaopca:ore_crystal." + snakeCase)
    def itemShard = item("jaopca:shard." + snakeCase)
    def itemClump = item("jaopca:clump." + snakeCase)
    def itemDirty = item("jaopca:dirty_dust." + snakeCase)
    
    // Stage 1: Ore -> Native Cluster
    // TODO: Magical Ore Extractor
    // TODO: Refining modifier

    // Stage 2: Native Cluster -> Crystal
    mods.prodigytech.rotary_grinder.recipeBuilder()
        .input(itemOre | itemCluster)
        .output(itemCrystal * 2)
        .time(200)
        .register()
    
    mods.immersiveengineering.crusher.recipeBuilder()
        .input(itemOre | itemCluster)
        .output(itemCrystal)
        .secondaryOutput(itemCrystal, 0.8)
        .secondaryOutput(outputs[byproducts[0]][0], 0.3)
        .energy(4000)
        .register()
    
    mods.actuallyadditions.crusher.recipeBuilder()
        .input(itemOre | itemCluster)
        .output(itemCrystal * 2, outputs[byproducts[0]][0])
        .chance(20)
        .register()
    
    mods.prodigytech.ore_refinery.recipeBuilder()
        .input(itemOre | itemCluster)
        .output(itemCrystal * 2, outputs[byproducts[1]][0])
        .secondaryChance(0.2)
        .time(240)
        .register()
    
    mods.calculator.atomic_calculator.recipeBuilder()
        .input(itemOre | itemCluster, item("thermalfoundation:material", 1027), itemOre | itemCluster)
        .output(itemCrystal * 5)
        .register()
    
    // TODO: mass spectrometer

    // Stage 3: Crystal -> Shard

    mods.enderio.sag_mill.recipeBuilder()
        .input(itemOre | itemCluster | itemCrystal)
        .output(itemShard)
        .output(itemShard, 0.05)
        .output(outputs[byproducts[3]][0], 0.25)
        .bonusTypeMultiply()
        .register()

    mods.calculator.flawless_calculator.recipeBuilder()
        .input(itemCluster, item("thermalfoundation:material", 1026), item("thermalfoundation:material", 1025), itemCrystal)
        .output(itemShard * 5)
        .register()
    
    // TODO: ore leecher

    // Stage 4a: Shard -> Clump
    def itemClumpInput = itemShard | itemCrystal
    crafting.shapelessBuilder()
        .output(itemClump)
        .input(itemClumpInput, itemClumpInput, itemClumpInput, itemClumpInput,
               itemClumpInput, itemClumpInput, itemClumpInput, itemClumpInput)
        .register()

    mods.nuclearcraft.infuser.builder()
        .input(itemShard * 6)
        .fluidInput(fluid("aetherworks.aetherium_gas") * 400)
        .output(itemClump)
        .register()

    // Stage 4: Clump -> Dirty Dust
    crafting.shapelessBuilder()
        .output(itemDirty * 8)
        .input(itemClump, item("roots:stalicripe"), item("roots:stalicripe"))
        .register()
    
    mods.naturesaura.altar.recipeBuilder()
        .input(itemClump)
        .output(itemDirty * 10)
        .catalyst(item("naturesaura:crushing_catalyst"))
        .aura(1000)
        .time(100)
        .register()
    
    ore("clump${key}").add(itemClump)
    ore("dirtyDust${key}").add(itemDirty)
    
    mods.essentialcraft.magmatic_smeltery.recipeBuilder()
        .input("clump${key}")
        .output("dirtyDust${key}")
        .factor(3)
        .color(0xFFFFFF) //material(key).getColor())
        .register()

    if (addFluidOps) {
        // Stage 5: Dirty Dust -> Solution
        def fluidSolution = fluid("solution_" + snakeCase)
        def fluidByproduct = getOutputFluid(byproducts[2]) * byproductFluidAmounts.get(byproducts[2], 32)
        def fluidOut = getOutputFluid(key)

        mods.embers.melter.recipeBuilder()
            .input(itemOre | itemCluster | itemCrystal | itemShard | itemDirty)
            .fluidOutput(fluidSolution * 160, fluidByproduct)
            .register()
        
        mods.nuclearcraft.enricher.builder()
            .input(itemOre | itemCluster | itemCrystal | itemShard | itemDirty)
            .fluidInput(fluid("hydrofluoric_acid") * 125)
            .fluidOutput(fluidSolution * 216)
            .register()

        mods.embers.mixer.recipeBuilder()
            .fluidInput(fluidSolution * 144, fluid("water") * 1000)
            .fluidOutput(fluidOut)
            .register()

        // Stage 6: Dirty Dust/Solution -> Molten
        for (def it in [itemOre, itemCluster, itemCrystal, itemShard, itemDirty]) {
            mods.tconstruct.melting.recipeBuilder()
                .input(it)
                .fluidOutput(fluidOut)
                .time(160)
                .register()
        }
        
        // TODO: industrial centrifuge
    }

    // Stage 5: Dirty Dust -> Ingot
    furnace.add(itemOre | itemCluster | itemCrystal | itemShard | itemDirty, outputs[key][1], 0.25)
}


for (entry in oresMetallic) {
    addOre(entry.key, entry.value, true)
}
for (entry in oresNonMetallic) {
    addOre(entry.key, entry.value, false)
}
