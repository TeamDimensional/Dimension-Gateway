/*
Byproduct 1 - tier 3
Byproduct 2 - tier 4
Byproduct 3 - tier 6 (metallic), tier 8 (nonmetallic)
Byproduct 4 - tier 7
Byproduct 5 - tier 13
*/

def oresMetallic = [
    "Coal": ["Coal", "Coal", "Sulfur", "Graphite", "Diamond"],
    "Gold": ["Copper", "Silver", "Silver", "Ardite", "Platinum"],
    "Iron": ["Tin", "Nickel", "Nickel", "Cobalt", "Chromium"],
    "Redstone": ["Gold", "Redstone", "Silver", "Redstone", "Uranium"],
    "Lapis": ["Sulfur", "Lapis", "Aluminum", "Lapis", "Magnesium"],
    "Diamond": ["Coal", "Diamond", "Lapis", "Graphite", "Diamond"],
    "Emerald": ["Emerald", "Lapis", "Diamond", "Beryllium", "Emerald"],
    "Quartz": ["Sulfur", "Glowstone", "Sulfur", "CertusQuartz", "Diamond"],
    "Thorium": ["Lead", "Coal", "Uranium", "Lead", "Resonating"],
    "Uranium": ["Lead", "Thorium", "Thorium", "Resonating", "Thorium"],
    "Boron": ["Aluminum", "Iron", "Aluminum", "Sodium", "Calcium"],
    "Lithium": ["Beryllium", "Magnesium", "Sodium", "Potassium", "Beryllium"],
    "Magnesium": ["Beryllium", "Lithium", "Zirconium", "Potassium", "Strontium"],
    // "Cerulean": ["Iron", "Moonstone", "Moonstone", "Aether", "Ruthenium"],
    // "Moonstone": ["Silver", "Gold", "Cerulean", "Aether", "Gold"],
    "Copper": ["Silver", "Gold", "Silver", "Nickel", "Gold"],
    "Tin": ["Iron", "Nickel", "Aluminum", "Nickel", "Zinc"],
    "Silver": ["Lead", "Gold", "Gold", "Platinum", "Zinc"],
    "Lead": ["Iron", "Silver", "Gold", "Uranium", "Bismuth"],
    "Aluminum": ["Iron", "Tin", "Iron", "Iron", "Boron"],
    "Nickel": ["Tin", "Iron", "Platinum", "Cobalt", "Ruthenium"],
    "Cobalt": ["Nickel", "Iron", "Ardite", "Tin", "Palladium"],
    "Ardite": ["Gold", "Cobalt", "Iron", "Platinum", "Tungsten"],
    "Titanium": ["Iron", "Aluminum", "Iron", "Zirconium", "Hafnium"],
    "Iridium": ["Platinum", "Cobalt", "Platinum", "Ruthenium", "Osmium"],
    "LiquifiedCoralium": ["Cobalt", "Titanium", "Platinum", "Diamond", "Iridium"],
]

def oresNonMetallic = [
    // "Aether": ["Silver", "Nickel", "Lithium", "Silver", "Magnesium"],
    "FireElemental": ["FireElemental", "Blaze", "FireElemental", "FireElemental", "FireElemental"],
    "WaterElemental": ["WaterElemental", "Lapis", "WaterElemental", "WaterElemental", "WaterElemental"],
    "AirElemental": ["AirElemental", "Quartz", "AirElemental", "AirElemental", "AirElemental"],
    "EarthElemental": ["EarthElemental", "Graphite", "EarthElemental", "EarthElemental", "EarthElemental"],
    "Mithriline": ["Mithriline", "Cobalt", "Mithriline", "Mithriline", "Mithriline"],
    "DimensionalShard": ["Diamond", "DimensionalShard", "DimensionalShard", "Emerald", "Diamond"],
    // "Ambrosium": ["Zanite", "Quartz", "CertusQuartz", "Lapis", "Ambrosium"],
    // "Zanite": ["Ambrosium", "Amethyst", "Lapis", "Amethyst", "Diamond"],
    // "AurorianCoal": ["Coal", "Sulfur", "Graphite", "Graphite", "Diamond"],
    // "AurorianGeode": ["Quartz", "Lapis", "Diamond", "Diamond", "Emerald"],
    "Dilithium": ["Lithium", "Dilithium", "Lapis", "Magnesium", "Dilithium"],
    // "Resonating": ["Redstone", "Lead", "Redstone", "Uranium", "Thorium"],
    // "Amber": ["Amber", "AirElemental", "EarthElemental", "Ambrosium", "Aether"],
]

outputs = [
    "Copper": item("thermalfoundation:material", 64),
    "Silver": item("thermalfoundation:material", 66),
    "Ardite": item("enderio:item_material", 30),
    "Platinum": item("thermalfoundation:material", 70),
    "Tin": item("thermalfoundation:material", 65),
    "Nickel": item("thermalfoundation:material", 69),
    "Cobalt": item("enderio:item_material", 31),
    "Chromium": item("qmd:dust", 2),
    "Gold": item("thermalfoundation:material", 1),
    "Resonating": item("deepresonance:resonating_plate") * 4,
    "Uranium": item("nuclearcraft:dust", 4),
    "Redstone": item("minecraft:redstone") * 4,
    "Lead": item("thermalfoundation:material", 67),
    "Thorium": item("nuclearcraft:dust", 3),
    "Iron": item("thermalfoundation:material"),
    "Aluminum": item("thermalfoundation:material", 68),
    "Sodium": item("qmd:dust", 11),
    "Calcium": item("qmd:dust", 13),
    "Beryllium": item("nuclearcraft:dust", 9),
    "Magnesium": item("nuclearcraft:dust", 7),
    "Potassium": item("qmd:dust", 12),
    "Lithium": item("nuclearcraft:dust", 6),
    "Zirconium": item("nuclearcraft:dust", 10),
    "Strontium": item("qmd:dust", 14),
    "Moonstone": false,   // <- TODO
    "Aether": item("aetherworks:item_resource") * 4,
    "Ruthenium": item("nuclearcraft:dust2", 5),  // <- TODO
    "Cerulean": false,   // <- TODO
    "Zinc": item("qmd:dust", 7),
    "Bismuth": item("nuclearcraft:fission_dust"),
    "Boron": item("nuclearcraft:dust", 5),
    "Palladium": item("nuclearcraft:dust2", 1),
    "Tungsten": item("qmd:dust"),
    "Hafnium": item("qmd:dust", 6),
    "Osmium": item("qmd:dust", 8),
    "Coal": item("minecraft:coal"),
    "Sulfur": item("thermalfoundation:material", 771),
    "Graphite": item("nuclearcraft:dust", 8),
    "Diamond": item("minecraft:diamond"),
    "Lapis": item("minecraft:dye", 4) * 5,
    "Emerald": item("minecraft:emerald"),
    "Glowstone": item("minecraft:glowstone_dust") * 3,
    "CertusQuartz": item("appliedenergistics2:material", 2),
    "FireElemental": item("essentialcraft:gem_elemental") * 2,
    "WaterElemental": item("essentialcraft:gem_elemental", 1) * 2,
    "AirElemental": item("essentialcraft:gem_elemental", 3) * 2,
    "EarthElemental": item("essentialcraft:gem_elemental", 2) * 2,
    "Mithriline": item("essentialcraft:genitem", 51) * 6,
    "Blaze": item("minecraft:blaze_powder"),
    "DimensionalShard": item("rftools:dimensional_shard") * 6,
    "Zanite": item("aether_legacy:zanite_gemstone"),
    "Ambrosium": item("aether_legacy:ambrosium_shard"),
    "Amethyst": item("calculator:smallamethyst") * 2,
    "Dilithium": item("libvulpes:productdust"),
    // "AurorianCoal": item("theaurorian:auroriancoal"),
    // "AurorianGeode": item("theaurorian:crystal"),
    "LiquifiedCoralium": item("abyssalcraft:cingot"),
]

outputFluids = [  // overrides from default fluid(name) * 144
    "Redstone": fluid("redstone") * 100,
    "Coal": fluid("coal") * 100,
    "Diamond": fluid("diamond") * 666,
    "Lapis": fluid("lapis") * 666,
    "Emerald": fluid("emerald") * 666,
    "Quartz": fluid("quartz") * 666,
    // "Cerulean": false,  // <- TODO
    // "Moonstone": false,  // <- TODO
    "LiquifiedCoralium": fluid("vapor_of_levity") * 250,  // <- TODO
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

    // Stage 2: Native Cluster -> Crushed ore
    mods.prodigytech.rotary_grinder.recipeBuilder()
        .input(itemOre | itemCluster)
        .output(itemCrystal * 2)
        .time(200)
        .register()
    
    mods.immersiveengineering.crusher.recipeBuilder()
        .input(itemOre | itemCluster)
        .output(itemCrystal)
        .secondaryOutput(itemCrystal, 0.8)
        .secondaryOutput(outputs[byproducts[0]], 0.3)
        .energy(4000)
        .register()
    
    mods.actuallyadditions.crusher.recipeBuilder()
        .input(itemOre | itemCluster)
        .output(itemCrystal * 2, outputs[byproducts[0]])
        .chance(20)
        .register()
    
    mods.prodigytech.ore_refinery.recipeBuilder()
        .input(itemOre | itemCluster)
        .output(itemCrystal * 2, outputs[byproducts[1]])
        .secondaryChance(0.2)
        .time(240)
        .register()
    
    mods.calculator.scientific_calculator.recipeBuilder()
        .input(itemOre | itemCluster, item("thermalfoundation:material", 1027))
        .output(itemCrystal * 3)
        .register()
    
    // TODO: mass spectrometer

    // Stage 3: Shard -> Clump

    mods.enderio.sag_mill.recipeBuilder()
        .input(itemOre | itemCluster | itemCrystal)
        .output(itemShard)
        .output(itemShard, 0.05)
        .output(outputs[byproducts[3]], 0.25)
        .bonusTypeMultiply()
        .register()

    mods.calculator.flawless_calculator.recipeBuilder()
        .input(itemCluster, itemOre | itemCluster | itemCrystal,
               item("thermalfoundation:material", 1026), item("thermalfoundation:material", 1025))
        .output(itemShard * 6)
        .register()
    
    // TODO: ore leecher

    // Stage 4a: Shard -> Compressed Shard
    crafting.shapelessBuilder()
        .output(itemClump)
        .input(itemShard, itemShard, itemShard, itemShard, itemShard, itemShard, itemShard, itemShard)
        .register()

    mods.nuclearcraft.infuser.builder()
        .input(itemShard * 6)
        .fluidInput(fluid("aetherworks.aetherium_gas") * 400)
        .output(itemClump)
        .register()

    // Stage 4: Compressed Shard -> Dirty Dust
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
    
    // TODO: magmatic smeltery (needs oredict to be added to all things)

    if (addFluidOps) {
        // Stage 5: Dirty Dust -> Solution
        def fluidSolution = fluid("solution_" + snakeCase)
        def fluidByproduct = getOutputFluid(byproducts[2])

        mods.embers.melter.recipeBuilder()
            .input(itemOre | itemCluster | itemCrystal | itemShard | itemDirty)
            .fluidOutput(fluidSolution * 160, fluidByproduct * 32)
            .register()
        
        mods.nuclearcraft.enricher.builder()
            .input(itemOre | itemCluster | itemCrystal | itemShard | itemDirty)
            .fluidInput(fluid("hydrofluoric_acid") * 125)
            .fluidOutput(fluidSolution * 216)
            .register()

        // Stage 6: Dirty Dust/Solution -> Molten
        for (def it in [itemOre, itemCluster, itemCrystal, itemShard, itemDirty]) {
            mods.tconstruct.melting.recipeBuilder()
                .input(it)
                .fluidOutput(getOutputFluid(key))
                .time(160)
                .register()
        }
        
        // TODO: industrial centrifuge
    }
}


for (entry in oresMetallic) {
    addOre(entry.key, entry.value, true)
}
for (entry in oresNonMetallic) {
    addOre(entry.key, entry.value, false)
}
