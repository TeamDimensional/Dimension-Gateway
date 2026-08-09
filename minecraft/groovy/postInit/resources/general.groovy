import nc.recipe.ingredient.ChanceItemIngredient
import nc.recipe.ingredient.ItemIngredient

// Remove crafting recipes for IE plates, wires, etc. #UseTheMetalPress
crafting.removeByInput(item("immersiveengineering:tool"))
crafting.removeByInput(item("immersiveengineering:tool", 1))

// Remove crafting recipes for gears
for (int i in [24, 25, 26, 27, 256, 257, 258, 259, 260, 261, 262, 263, 264, 288, 289, 290, 291, 292, 293, 294, 295])
    crafting.removeByOutput(item("thermalfoundation:material", i))
crafting.removeByOutput(item("prodigytech:ferramic_gear"))
// Remove also gear casting
mods.tconstruct.casting_table.removeByCast(item("tconstruct:cast_custom", 4))
mods.tconstruct.casting_table.removeByOutput(item("tconstruct:cast_custom", 4))
// Add gemstone metal pressing
mods.immersiveengineering.metal_press.recipeBuilder()
    .mold(item("immersiveengineering:mold", 1))
    .input(item("minecraft:diamond") * 4)
    .output(item("thermalfoundation:material", 26))
    .register()

mods.immersiveengineering.metal_press.recipeBuilder()
    .mold(item("immersiveengineering:mold", 1))
    .input(item("minecraft:emerald") * 4)
    .output(item("thermalfoundation:material", 27))
    .register()

// Signalum, Lumium, Enderium
crafting.remove("thermalfoundation:dust_signalum")
crafting.remove("thermalfoundation:dust_lumium")
crafting.remove("thermalfoundation:dust_enderium")
// TODO: readd these recipes

// Diamond, Emerald dusts
mods.prodigytech.magnetic_reassembler.removeByInput(item("nuclearcraft:gem_dust"))
mods.prodigytech.magnetic_reassembler.removeByInput(item("prodigytech:emerald_dust"))

// Tiny piles
mods.prodigytech.magnetic_reassembler.removeByInput(item("prodigytech:iron_dust_tiny"))
mods.prodigytech.magnetic_reassembler.removeByInput(item("prodigytech:gold_dust_tiny"))
mods.prodigytech.magnetic_reassembler.removeByInput(item("prodigytech:ferramic_dust_tiny"))

// Rock Crushing for Alloys
// Forest (Dark green): Uranium, Vibrant Alloy, Nichromite
// Plains (Dark green/yellow): Constantan, Bronze, Infinity Grains
// Mountain (Dark brown): Thorium, Dark Steel, Dysprholminite
// Fungal (Purple): Lunar Reactive Dust, Radium, Magical Essence
// Swamp (Dark cyan): Invar, Ruthenium Oxide, Stardust
// Desert (Orange): Electrum, Energetic Alloy, Barite
// Taiga (Cyan): Mithril, Pulsating Iron, Energion
// Mesa (Red): Signalum, Redstone Alloy, Crystal Binder
//
// Thermal:
//   Electrum => Desert
//   Invar => Swamp
//   Bronze => Plains
//   Constantan => Plains
//   Signalum => Mesa
//   Mithril => Taiga
//
// EnderIO:
//   Infinity Grains => Plains
//   Dark Steel => Mountain
//   Pulsating Iron => Taiga
//   Vibrant Alloy => Forest
//   Energetic Alloy => Desert
//
// Nuclearcraft:
//    Barite => Desert
//    Nichromite => Forest
//    Dysprholminite => Mountain
//    Crystal Binder => Mesa
//    Ruthenium Oxide => Swamp
//    Radium => Fungal
//    Uranium => Forest
//    Thorium => Mountain
//
// Other:
//    Energion => Taiga
//    Stardust => Swamp
//    Magical Essence => Fungal
//    Lunar Reactive => Fungal
mods.nuclearcraft.rock_crusher.builder()
    .input(item("botania:biomestonea"))
    .output(new ChanceItemIngredient(new ItemIngredient(item("gateway:vibrant_alloy_dust") * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("nuclearcraft:dust", 4) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("nuclearcraft:gem_dust", 13) * 4), 35))
    .register()

mods.nuclearcraft.rock_crusher.builder()
    .input(item("botania:biomestonea", 1))
    .output(new ChanceItemIngredient(new ItemIngredient(item("thermalfoundation:material", 99) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("thermalfoundation:material", 100) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("enderio:item_material", 20) * 4), 35))
    .register()

mods.nuclearcraft.rock_crusher.builder()
    .input(item("botania:biomestonea", 2))
    .output(new ChanceItemIngredient(new ItemIngredient(item("gateway:dark_steel_dust") * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("nuclearcraft:dust", 3) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("nuclearcraft:gem_dust", 14) * 4), 35))
    .register()

mods.nuclearcraft.rock_crusher.builder()
    .input(item("botania:biomestonea", 3))
    .output(new ChanceItemIngredient(new ItemIngredient(item("nuclearcraft:fission_dust", 1) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("extrautils2:ingredients", 3) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("essentialcraft:genitem", 3) * 4), 35))
    .register()

mods.nuclearcraft.rock_crusher.builder()
    .input(item("botania:biomestonea", 4))
    .output(new ChanceItemIngredient(new ItemIngredient(item("thermalfoundation:material", 98) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("nuclearcraft:dust2", 5) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("astralsorcery:itemcraftingcomponent", 2) * 4), 35))
    .register()

mods.nuclearcraft.rock_crusher.builder()
    .input(item("botania:biomestonea", 5))
    .output(new ChanceItemIngredient(new ItemIngredient(item("thermalfoundation:material", 97) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("gateway:energetic_alloy_dust") * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("nuclearcraft:gem_dust", 12) * 4), 35))
    .register()

mods.nuclearcraft.rock_crusher.builder()
    .input(item("botania:biomestonea", 6))
    .output(new ChanceItemIngredient(new ItemIngredient(item("thermalfoundation:material", 72) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("gateway:pulsating_iron_dust") * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("prodigytech:energion_dust") * 4), 35))
    .register()

mods.nuclearcraft.rock_crusher.builder()
    .input(item("botania:biomestonea", 7))
    .output(new ChanceItemIngredient(new ItemIngredient(item("thermalfoundation:material", 101) * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("gateway:redstone_alloy_dust") * 4), 35))
    .output(new ChanceItemIngredient(new ItemIngredient(item("nuclearcraft:compound", 1) * 4), 35))
    .register()

// New Alloys
def newAlloys = [
    [item("gateway:dark_steel_dust"), item("enderio:item_alloy_ingot", 6), fluid("dark_steel") * 144],
    [item("gateway:pulsating_iron_dust"), item("enderio:item_alloy_ingot", 5), fluid("pulsating_iron") * 144],
    [item("gateway:energetic_alloy_dust"), item("enderio:item_alloy_ingot", 1), fluid("energetic_alloy") * 144],
    [item("gateway:vibrant_alloy_dust"), item("enderio:item_alloy_ingot", 2), fluid("vibrant_alloy") * 144],
    [item("gateway:redstone_alloy_dust"), item("enderio:item_alloy_ingot", 3), fluid("redstone_alloy") * 144],
]
for (def it in newAlloys) {
    furnace.recipeBuilder()
        .input(it[0])
        .output(it[1])
        .register()
    
    mods.nuclearcraft.melter.builder()
        .input(it[0])
        .fluidOutput(it[2])
        .register()
    
    mods.thermalexpansion.crucible.recipeBuilder()
        .input(it[0])
        .fluidOutput(it[2])
        .energy(2000)
        .register()
}
