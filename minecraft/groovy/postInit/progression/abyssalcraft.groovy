// Various cleanup of dreadlands, non-functional recipes, machine identities...

mods.abyssaltweaker.fuel.removeTransmutator(item("minecraft:blaze_rod"))
mods.abyssaltweaker.fuel.removeTransmutator(item("minecraft:blaze_powder"))
mods.abyssaltweaker.fuel.removeTransmutator(item("abyssalcraft:cchunk"))
mods.abyssaltweaker.fuel.removeTransmutator(item("abyssalcraft:transmutationgem:*"))
mods.abyssaltweaker.fuel.removeTransmutator(item("abyssalcraft:corflesh"))
mods.abyssaltweaker.fuel.removeTransmutator(item("abyssalcraft:corbone"))
mods.abyssaltweaker.fuel.removeTransmutator(item("abyssalcraft:cbrick"))
mods.abyssaltweaker.fuel.removeTransmutator(item("abyssalcraft:methane"))

mods.abyssaltweaker.fuel.removeCrystallizer(item("minecraft:blaze_rod"))
mods.abyssaltweaker.fuel.removeCrystallizer(item("abyssalcraft:dreadshard"))
mods.abyssaltweaker.fuel.removeCrystallizer(item("abyssalcraft:dreadchunk"))
mods.abyssaltweaker.fuel.removeCrystallizer(item("abyssalcraft:dreadfragment"))
mods.abyssaltweaker.fuel.removeCrystallizer(item("abyssalcraft:carboncluster"))
mods.abyssaltweaker.fuel.removeCrystallizer(item("abyssalcraft:densecarboncluster"))

mods.abyssaltweaker.transmutator.removeAll()
mods.abyssaltweaker.crystallizer.removeAll()

def transmutationChemicals = [
    ["abyssalnite", item("abyssalcraft:abyingot")],
    ["coralium", item("abyssalcraft:cingot")],
    ["dreadium", item("abyssalcraft:dreadiumingot")],
    ["iron", item("minecraft:iron_ingot")],
    ["gold", item("minecraft:gold_ingot")],
    ["sulfur", item("thermalfoundation:material", 771)],
    ["blaze", item("minecraft:blaze_rod")],
    ["redstone", item("minecraft:redstone")],
    ["methane", item("abyssalcraft:methane")],
    ["tin", item("thermalfoundation:material", 129)],
    ["copper", item("thermalfoundation:material", 128)],
    ["aluminium", item("thermalfoundation:material", 132)],
    ["magnesium", item("nuclearcraft:ingot", 7)],
    ["carbon", item("minecraft:coal")],
    ["silicon", item("nuclearcraft:gem", 6)],
]

for (def a in transmutationChemicals) {
    mods.abyssaltweaker.transmutator.recipeBuilder()
        .input(item("abyssalcraft:${a[0]}_crystal"))
        .output(a[1])
        .register()

    mods.abyssaltweaker.crystallizer.recipeBuilder()
        .input(a[1])
        .output(item("abyssalcraft:${a[0]}_crystal"))
        .register()
}

def crystallizationRecipes = [
    [item("minecraft:potion").withNbt(["Potion": "minecraft:water"]), "hydrogen", 2, "oxygen", 7],
    [item("minecraft:gunpowder"), "nitrate", 16, "sulfur", 4],
    [item("minecraft:obsidian"), "silica", 6, "magnesia", 6],
    [item("minecraft:rotten_flesh"), "phosphorus", 8, "", 0],
    [item("abyssalcraft:corflesh"), "phosphorus", 8, "coralium", 1],
    [item("minecraft:prismarine_shard"), "silica", 4, "beryl", 4],
    [item("minecraft:prismarine"), "silica", 16, "beryl", 16],
    [item("minecraft:prismarine", 1), "silica", 36, "beryl", 36],
    [item("minecraft:prismarine", 2), "silica", 32, "beryl", 32],

    [item("abyssalcraft:silica_crystal"), "silicon", 9, "oxygen", 18],
    [item("abyssalcraft:alumina_crystal"), "aluminium", 18, "oxygen", 27],
    [item("abyssalcraft:magnesia_crystal"), "magnesium", 9, "oxygen", 9],
    [item("abyssalcraft:methane_crystal"), "carbon", 9, "hydrogen", 36],
    [item("abyssalcraft:nitrate_crystal"), "nitrogen", 9, "oxygen", 27],
]

for (def a in crystallizationRecipes) {
    def builder = mods.abyssaltweaker.crystallizer.recipeBuilder()
        .input(a[0])
    def output1 = a[2] % 9 == 0 ? item("abyssalcraft:${a[1]}_crystal") * (a[2] / 9) : item("abyssalcraft:${a[1]}_crystal_shard") * a[2]
    builder.output(output1)
    if (a[4] > 0) {
        def output2 = a[4] % 9 == 0 ? item("abyssalcraft:${a[3]}_crystal") * (a[4] / 9) : item("abyssalcraft:${a[3]}_crystal_shard") * a[4]
        builder.output(output2)
    }
    builder.register()
}

// New crafting chains for Statues in tier 10
mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:cthulhustatue"))
mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:hasturstatue"))
mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:jzaharstatue"))
mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:azathothstatue"))
mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:nyarlathotepstatue"))
mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:yogsothothstatue"))
mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:shubniggurathstatue"))

mods.calculator.flawless_calculator.recipeBuilder()
    .output(item("abyssalcraft:monolithstone") * 16)
    .input(item("industrialforegoing:artificial_dye", 15), item("bloodmagic:blood_rune", 4), item("bloodmagic:blood_rune", 4),  item("industrialforegoing:artificial_dye", 15))
    .register()

def gods = ["cthulhu", "hastur", "jzahar", "azathoth", "nyarlathotep", "yogsothoth", "shubniggurath"]
for (def g in gods) {
    def decoStatue = item("abyssalcraft:decorative${g}statue")
    def fullStatue = item("abyssalcraft:${g}statue")
    mods.enderio.soul_binder.recipeBuilder()
        .input(decoStatue)
        .output(fullStatue)
        .entity(entity("abyssalcraft:abyssalzombie"))
        .name("god_statue_${g}")
        .energy(25000)
        .xp(7)
        .register()
}

// New crafting chains for various energy collectors and condensers to remove the tiers 1 and 4
def items = [
    ["energy_pedestal", item("enderio:item_material", 43)],
    ["sacrificial_altar", item("bloodmagic:blood_rune", 3)],
    ["energy_collector", item("deepresonance:energy_collector")],
    ["energy_relay", item("bloodmagic:blood_rune", 5)], 
    ["energy_container", item("bloodmagic:blood_rune", 7)],
]
for (def pair in items) {
    def it = pair[0]
    def owItem = item("abyssalcraft:overworld_${it}")
    def awItem = item("abyssalcraft:abyssal_wasteland_${it}")
    def omItem = item("abyssalcraft:omothol_${it}")

    mods.abyssaltweaker.ritual.removeByOutput(owItem)
    mods.abyssaltweaker.ritual.removeByOutput(awItem)
    mods.abyssaltweaker.ritual.removeByOutput(omItem)

    mods.abyssaltweaker.ritual.recipeBuilder()
        .name("gateway:overworld_${it}")
        .output(owItem)
        .bookTier(0)
        .energy(400)
        .centerItem(pair[1])
        .input(
            item("calculator:enddiamond"), item("industrialforegoing:plastic"), item("botania:manaresource"),
            item("minecraft:stone"), item("calculator:enddiamond"), item("minecraft:stone"), item("minecraft:ender_eye"),
            item("industrialforegoing:plastic"))
        .register()

    mods.abyssaltweaker.ritual.recipeBuilder()
        .name("gateway:wasteland_${it}")
        .output(awItem)
        .bookTier(1)
        .energy(800)
        .centerItem(owItem)
        .input(
            item("abyssalcraft:shadowgem"), item("actuallyadditions:item_crystal_empowered", 3), item("abyssalcraft:cingot"),
            item("abyssalcraft:abystone"), item("abyssalcraft:shadowgem"), item("abyssalcraft:abystone"), item("enderutilities:enderpart", 2),
            item("actuallyadditions:item_crystal_empowered", 3))
        .register()

    mods.abyssaltweaker.ritual.recipeBuilder()
        .name("gateway:omothol_${it}")
        .output(omItem)
        .bookTier(3)
        .energy(1600)
        .centerItem(awItem)
        .input(
            item("nuclearcraft:plutonium", 5), item("actuallyadditions:item_crystal_empowered", 2), item("abyssalcraft:ethaxiumingot"),
            item("abyssalcraft:darkethaxiumbrick"), item("nuclearcraft:plutonium", 5), item("abyssalcraft:darkethaxiumbrick"),
            item("abyssalcraft:abyingot"), item("actuallyadditions:item_crystal_empowered", 2))
        .register()
}

// New ODB recipe
crafting.removeByOutput(item("abyssalcraft:odb"))
mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:odb"))
mods.abyssaltweaker.ritual.recipeBuilder()
    .name("gateway:odb")
    .output(item("abyssalcraft:odb"))
    .bookTier(4)
    .energy(75000)
    .dimension(54)
    .centerItem(item("evilcraft:lightning_bomb"))
    .input(
        item("essentialcraft:genitem", 36),
        item("openblocks:tank").withNbt(["tank": ["FluidName": "liquidantimatter", "Amount": 16000]]),
        item("thaumadditions:adaminite_ingot"), item("thaumadditions:adaminite_ingot"),
        item("essentialcraft:genitem", 37),
        item("thaumadditions:adaminite_ingot"), item("thaumadditions:adaminite_ingot"),
        item("openblocks:tank").withNbt(["tank": ["FluidName": "liquidcoralium", "Amount": 16000]]))
    .requiresSacrifice()
    .register()

// Chemical machines
crafting.remove("abyssalcraft:transmutator")
crafting.shapedBuilder()
    .output(item("abyssalcraft:transmutator"))
    .matrix("CCC", "CTC", "BcB")
    .key("C", item("actuallyadditions:item_crystal_empowered", 1))
    .key("T", item("abyssalcraft:transmutationgem:*"))
    .key("B", item("abyssalcraft:corblock"))
    .key("c", item("abyssalcraft:coralium_crystal_cluster"))
    .register()
crafting.remove("abyssalcraft:crystallizer")
crafting.shapedBuilder()
    .output(item("abyssalcraft:crystallizer"))
    .matrix("CCC", "CTC", "BcB")
    .key("C", item("actuallyadditions:item_crystal_empowered"))
    .key("T", item("abyssalcraft:transmutationgem:*"))
    .key("B", item("abyssalcraft:dreadiumblock"))
    .key("c", item("abyssalcraft:dreadium_crystal_cluster"))
    .register()

mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:transmutationgem"))
mods.abyssaltweaker.ritual.recipeBuilder()
    .name("gateway:transmutationgem")
    .output(item("abyssalcraft:transmutationgem"))
    .bookTier(1)
    .energy(500)
    .centerItem(item("minecraft:ender_eye"))
    .input(
        item("abyssalcraft:shadowgem"), item("minecraft:blaze_powder"), item("minecraft:ender_pearl"), item("thermalfoundation:material", 2049),
        item("abyssalcraft:shadowgem"), item("thermalfoundation:material", 2051), item("minecraft:ender_pearl"), item("thermalfoundation:material", 2053))
    .register()

crafting.remove("abyssalcraft:necronomicon")
inWorldCrafting.fluidToItem.recipeBuilder()
        .fluidInput(fluid("liquidcoralium"))
        .input(item("minecraft:book"))
        .output(item("abyssalcraft:necronomicon"))
        .register()

crafting.remove("abyssalcraft:necronomicon_cor")
crafting.shapedBuilder()
    .output(item("abyssalcraft:necronomicon_cor"))
    .matrix("EIE", "IBI", "EPE")
    .key("B", item("abyssalcraft:necronomicon"))
    .key("I", item("abyssalcraft:cingot"))
    .key("P", item("abyssalcraft:cpearl"))
    .key("E", item("abyssalcraft:essence_abyssalwasteland"))
    .register()

crafting.remove("abyssalcraft:necronomicon_omt")
crafting.shapedBuilder()
    .output(item("abyssalcraft:necronomicon_omt"))
    .matrix("EIE", "IBI", "EPE")
    .key("B", item("abyssalcraft:necronomicon_cor"))
    .key("I", item("abyssalcraft:ethaxiumingot"))
    .key("P", item("abyssalcraft:oc"))
    .key("E", item("abyssalcraft:essence_omothol"))
    .register()

crafting.remove("abyssalcraft:abyssalnomicon")
crafting.shapedBuilder()
    .output(item("abyssalcraft:abyssalnomicon"))
    .matrix("EIE", "IBI", "EPE")
    .key("B", item("abyssalcraft:necronomicon_omt"))
    .key("I", item("essentialcraft:genitem", 35))
    .key("P", item("abyssalcraft:gatekeeperessence"))
    .key("E", item("abyssalcraft:eldritchscale"))
    .register()

crafting.remove("abyssalcraft:charm")
crafting.shapedBuilder()
    .output(item("abyssalcraft:charm"))
    .matrix("GGG", "GAG", "GGG")
    .key("G", item("minecraft:gold_ingot"))
    .key("A", item("prodigytech:aeternus_crystal"))
    .register()

// Various adjustments to remove the gated items from recipes
crafting.remove("abyssalcraft:antidote_0")
crafting.shapelessBuilder()
    .output(item("abyssalcraft:coralium_antidote"))
    .input(item("minecraft:potion").withNbt(["Potion": "minecraft:water"]), item("abyssalcraft:wastelandsthorn"), item("abyssalcraft:ccluster3"))
    .register()

mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:drainstaff_omt"))
mods.abyssaltweaker.ritual.recipeBuilder()
    .name("gateway:drainstaff_omt")
    .output(item("abyssalcraft:drainstaff_omt"))
    .bookTier(3)
    .energy(2000)
    .dimension(52)
    .centerItem(item("abyssalcraft:drainstaff_aw"))
    .input(
        item("abyssalcraft:shadowgem"), item("abyssalcraft:omotholstone"), item("abyssalcraft:omotholflesh"), item("abyssalcraft:omotholstone"),
        item("abyssalcraft:omotholflesh"), item("abyssalcraft:omotholstone"), item("abyssalcraft:omotholflesh"), item("abyssalcraft:omotholstone"))
    .register()

mods.abyssaltweaker.ritual.removeByOutput(item("abyssalcraft:staff"))
mods.abyssaltweaker.ritual.recipeBuilder()
    .name("gateway:acstaff")
    .output(item("abyssalcraft:staff"))
    .bookTier(3)
    .energy(20000)
    .dimension(52)
    .centerItem(item("abyssalcraft:drainstaff_omt"))
    .input(
        item("abyssalcraft:coralium_crystal_cluster"), item("abyssalcraft:dreadium_crystal_cluster"), item("abyssalcraft:eldritchscale"),
        item("prodigytech:primordium"), item("abyssalcraft:gatewaykeyjzh"), item("prodigytech:primordium"),
        item("abyssalcraft:ethaxiumingot"), item("abyssalcraft:blaze_crystal_cluster"))
    .register()

inWorldCrafting.fluidToFluid.recipeBuilder()
        .fluidInput(fluid("sludge"))
        .input(item("enderio:item_material", 36))
        .fluidOutput(fluid("liquidcoralium"))
        .register()

inWorldCrafting.fluidToItem.recipeBuilder()
        .fluidInput(fluid("liquidcoralium"), 0.2f)
        .input(item("essentialcraft:genitem", 47))
        .output(item("abyssalcraft:shadowgem"))
        .register()
