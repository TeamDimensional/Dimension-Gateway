// Magical Porkchop (tier 5)
crafting.remove("essentialcraft:magical_porkchop")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("minecraft:porkchop"))
    .output(item("essentialcraft:magicalporkchop"))
    .aspect(aspect("humanus") * 20, aspect("victus") * 20, aspect("permutatio") * 20)
    .input(item("minecraft:prismarine_crystals"))
    .input(item("essentialcraft:genitem", 33))
    .input(item("essentialcraft:genitem", 33))
    .input(item("minecraft:prismarine_crystals"))
    .input(item("essentialcraft:storage", 1))
    .instability(5)
    .register()

// Magic Water Bottle (tier 10)
crafting.remove("essentialcraft:magic_water_bottle")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("essentialcraft:genitem", 6))
    .output(item("essentialcraft:magicwaterbottle"))
    .aspect(aspect("vitreus") * 20, aspect("sensus") * 20, aspect("gelum") * 20)
    .input(item("botania:rune", 7))
    .input(item("thaumcraft:salis_mundus"))
    .input(item("thaumcraft:salis_mundus"))
    .input(item("botania:rune", 8))
    .input(item("essentialcraft:storage", 1))
    .instability(7)
    .register()

// Magical Shield (tier 5)
crafting.remove("essentialcraft:magical_shield")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("theaurorian:crystallineshield"))
    .output(item("essentialcraft:magicalshield"))
    .aspect(aspect("praemunio") * 20, aspect("spiritus") * 20, aspect("fluctus") * 20)
    .input(item("essentialcraft:genitem", 31))
    .input(item("thermalfoundation:material", 352))
    .input(item("thermalfoundation:material", 352))
    .input(item("essentialcraft:genitem", 31))
    .input(item("essentialcraft:storage", 1))
    .instability(5)
    .register()

// Spiky Buckler (tier 10)
crafting.remove("essentialcraft:spiky_shield")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("essentialcraft:magicalshield"))
    .output(item("essentialcraft:spikyshield"))
    .aspect(aspect("aversio") * 50, aspect("infernum") * 50, aspect("caeles") * 25)
    .input(item("botania:rune", 13))
    .input(item("essentialcraft:genitem"))
    .input(item("essentialcraft:genitem"))
    .input(item("botania:rune", 13))
    .input(item("minecraft:nether_star"))
    .instability(9)
    .register()

// Magical Wings (tier 5)
crafting.remove("essentialcraft:magical_wings")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("roots:mystic_feather"))
    .output(item("essentialcraft:magicalwings"))
    .aspect(aspect("volatus") * 20, aspect("potentia") * 20, aspect("ventus") * 20)
    .input(item("actuallyadditions:item_misc", 15))
    .input(item("minecraft:quartz"))
    .input(item("minecraft:quartz"))
    .input(item("actuallyadditions:item_misc", 15))
    .input(item("essentialcraft:storage", 1))
    .instability(5)
    .register()

// Emerald Heart (tier 10)
crafting.remove("essentialcraft:emerald_heart")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("minecraft:apple"))
    .output(item("essentialcraft:emeraldheart"))
    .aspect(aspect("victus") * 20, aspect("ordo") * 20, aspect("caeles") * 20)
    .input(item("essentialcraft:genitem", 22))
    .input(item("botania:rune", 9))
    .input(item("botania:rune", 10))
    .input(item("essentialcraft:genitem", 22))
    .input(item("essentialcraft:storage", 1))
    .instability(8)
    .register()

// Spawner Collector (tier 5)
crafting.remove("essentialcraft:spawner_collector")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("embers:grandhammer"))
    .output(item("essentialcraft:spawnercollector"))
    .aspect(aspect("exitium") * 20, aspect("exanimis") * 20, aspect("vinculum") * 20)
    .input(item("actuallyadditions:item_misc", 20))
    .input(item("naturesaura:token_sorrow"))
    .input(item("naturesaura:token_fear"))
    .input(item("actuallyadditions:item_misc", 20))
    .input(item("essentialcraft:storage", 2))
    .instability(5)
    .register()

// Magical Digger (tier 5)
crafting.remove("essentialcraft:magical_digger")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("essentialcraft:elemental_pick"))
    .output(item("essentialcraft:magicaldigger"))
    .aspect(aspect("exitium") * 20, aspect("ignis") * 20, aspect("fluctus") * 20)
    .input(item("embers:focal_lens"))
    .input(item("minecraft:tnt"))
    .input(item("minecraft:tnt"))
    .input(item("embers:focal_lens"))
    .input(item("essentialcraft:storage", 1))
    .instability(5)
    .register()

// Holy Mace (tier 5)
crafting.remove("essentialcraft:holy_mace")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("essentialcraft:elemental_sword"))
    .output(item("essentialcraft:holymace"))
    .aspect(aspect("exanimis") * 20, aspect("mortuus") * 20, aspect("lux") * 20)
    .input(item("essentialcraft:genitem", 4))
    .input(item("embers:ingot_dawnstone"))
    .input(item("tconstruct:materials", 22))
    .input(item("essentialcraft:genitem", 4))
    .input(item("essentialcraft:storage", 1))
    .instability(5)
    .register()

// Charms (tier 5)
def foci = [
    [item("minecraft:fire_charge"), item("minecraft:potion").withNbt(["Potion":"minecraft:fire_resistance"]), "ignis", "ignis"],
    [item("minecraft:glass"), item("minecraft:potion").withNbt(["Potion":"minecraft:water_breathing"]), "aqua", "aer"],
    [item("naturesaura:infused_iron_chest"), item("minecraft:golden_apple"), "terra", "praemunio"],
    [item("naturesaura:infused_iron_shoes"), item("minecraft:potion").withNbt(["Potion":"minecraft:swiftness"]), "motus", "aer"],
    [item("tconstruct:materials", 22), item("minecraft:potion").withNbt(["Potion":"minecraft:swiftness"]), "mortuus", "ignis"],
    [item("tconstruct:materials", 23), item("minecraft:potion").withNbt(["Potion":"minecraft:fire_resistance"]), "ignis", "aqua"],
    [item("immersiveengineering:wooden_device1", 1), item("minecraft:potion").withNbt(["Potion":"minecraft:strength"]), "ignis", "visum"],
    [item("minecraft:slime_ball"), item("minecraft:potion").withNbt(["Potion":"minecraft:regeneration"]), "victus", "praecantatio"],
    [item("immersiveengineering:wooden_device1", 1), item("minecraft:potion").withNbt(["Potion":"minecraft:haste"]), "aqua", "sonus"],
]
for (def i in 0..8) {
    crafting.removeByOutput(item("essentialcraft:charm", i))
    def center = foci[i][0]
    def potion = foci[i][1]
    def builder = mods.thaumcraft.infusion_crafting.recipeBuilder()
        .researchKey("INFUSION")
        .mainInput(center)
        .output(item("essentialcraft:charm", i))
        .input(item("essentialcraft:genitem", 6))
        .input(item("essentialcraft:genitem", 6))
        .input(item("thaumcraft:ingot", 2))
        .input(item("thaumcraft:ingot", 2))
        .input(potion)
        .input(potion)
        .input(item("essentialcraft:storage", 1))
        .instability(3)
    
    def aspectMap = ["auram": 10]
    for (def j in 2..3) {
        def aspect = foci[i][j]
        if (aspectMap[aspect] == null) {
            aspectMap[aspect] = 0
        }
        aspectMap[aspect] += 15
    }
    for (def x in aspectMap.keySet()) {
        builder.aspect(aspect(x) * aspectMap[x])
    }
    
    builder.register()
}
