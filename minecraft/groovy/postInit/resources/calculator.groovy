import com.dimensional.gatewaycore.events.TooltipEvents

// Fire Diamond & End Diamond
mods.calculator.atomic_calculator.removeByOutput(item("calculator:firediamond"))
mods.calculator.scientific_calculator.recipeBuilder()
    .input(item("calculator:flawlessdiamond"), item("tconstruct:materials", 23))
    .output(item("calculator:firediamond"))
    .register()

mods.calculator.atomic_calculator.removeByOutput(item("calculator:enddiamond"))
mods.calculator.atomic_calculator.recipeBuilder()
    .input(item("actuallyadditions:block_misc", 6), item("calculator:enddiamond"), item("tconstruct:ingots"))
    .output(item("calculator:enddiamond"))
    .register()

// Flawless Glass alt recipe
mods.calculator.flawless_calculator.recipeBuilder()
    .input(item("enderio:item_material", 14), item("botania:managlass"), item("botania:managlass"), item("enderio:item_material", 14))
    .output(item("calculator:flawlessglass") * 10)
    .register()

// Reinforced Stone
mods.calculator.calculator.removeByOutput(item("sonarcore:reinforcedstoneblock"))
mods.calculator.calculator.recipeBuilder()
    .input(item("essentialcraft:fortifiedstone"), item("actuallyadditions:item_crystal", 3))
    .output(item("sonarcore:reinforcedstoneblock") * 2)
    .register()
mods.calculator.calculator.removeByOutput(item("sonarcore:reinforceddirtblock"))
mods.calculator.calculator.recipeBuilder()
    .input(item("essentialcraft:fortifiedstone"), item("actuallyadditions:item_crystal", 3))
    .output(item("sonarcore:reinforceddirtblock") * 8)
    .register()

crafting.remove("sonarcore:tile.stablestone_normal1")

// Redstone Ingot (buff recipe with ingot to make it possibly viable)
mods.calculator.scientific_calculator.removeByOutput(item("calculator:redstoneingot"))
mods.calculator.scientific_calculator.recipeBuilder()
    .input(item("calculator:reinforcedironingot"), item("minecraft:redstone"))
    .output(item("calculator:redstoneingot") * 5)
    .register()
mods.calculator.algorithm_separator.removeByInput(item("minecraft:redstone"))
mods.calculator.algorithm_separator.recipeBuilder()
    .input(item("minecraft:redstone"))
    .output(item("actuallyadditions:item_crystal"), item("calculator:redstoneingot"))
    .register()

// Controlled Fuel
mods.calculator.flawless_calculator.removeByOutput(item("calculator:controlledfuel"))
mods.calculator.flawless_calculator.recipeBuilder()
    .input(item("calculator:circuitboard"), item("calculator:purifiedcoal"), item("calculator:firecoal"), item("calculator:circuitboard"))
    .output(item("calculator:controlledfuel") * 4)
    .register()

// Calculator parts
crafting.remove("calculator:item.calculatorscreen125")
crafting.remove("calculator:item.calculatorassembly200")
mods.astralsorcery.starlight_altar.discoveryRecipeBuilder()
    .output(item("calculator:calculatorscreen"))
    .matrix("SGS", "GRG", "SGS")
    .key("S", item("thermalfoundation:material", 352))
    .key("G", item("essentialcraft:genitem", 9))
    .key("R", item("minecraft:redstone"))
    .starlight(200)
    .craftTime(20)
    .register()
mods.astralsorcery.starlight_altar.discoveryRecipeBuilder()
    .output(item("calculator:calculatorassembly") * 8)
    .matrix("SBS", "BSB", "SBS")
    .key("S", item("thermalfoundation:material", 352))
    .key("B", item("minecraft:stone_button"))
    .starlight(200)
    .craftTime(20)
    .register()

crafting.remove("calculator:item.flawlessassembly204")
crafting.shapedBuilder()
    .mirrored()
    .matrix("A1A", "2B3", "A4A")
    .key("A", item("calculator:advancedassembly"))
    .key("B", item("calculator:atomicassembly"))
    .key("1", item("calculator:circuitboard", 9))
    .key("2", item("calculator:circuitboard", 3))
    .key("3", item("calculator:circuitboard", 6))
    .key("4", item("calculator:circuitboard", 12))
    .output(item("calculator:flawlessassembly"))
    .register()

// Fabrication Chamber rework
def circuit(id, stable=false) {
    return item("calculator:circuitboard", id).withNbt([Stable: stable, Analysed: 1])
}

crafting.remove("calculator:item.atomicbinder127")
mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(3), circuit(7))
    .output(item("calculator:atomicbinder"))
    .register()

mods.calculator.atomic_calculator.removeByOutput(item("calculator:speedupgrade"))
mods.calculator.atomic_calculator.removeByOutput(item("calculator:energyupgrade"))
mods.calculator.atomic_calculator.removeByOutput(item("calculator:voidupgrade"))
mods.calculator.atomic_calculator.removeByOutput(item("calculator:transferupgrade"))

mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(0, true), circuit(1, true), circuit(2, true), circuit(3, true), circuit(4, true), circuit(5, true), circuit(6, true),
           circuit(7, true), circuit(8, true), circuit(9, true), circuit(10, true), circuit(11, true), circuit(12, true), circuit(13, true))
    .output(item("calculator:atomicmodule"))
    .register()

mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(1))
    .output(item("calculator:calculatorscreen"))
    .register()

mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(7) * 25, circuit(4, true) * 3, circuit(6, true) * 3)
    .output(item("calculator:warpmodule"))
    .register()

mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(7) * 5, circuit(4) * 3, circuit(6) * 3)
    .output(item("calculator:jumpmodule"))
    .register()

mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(2), circuit(4))
    .output(item("calculator:speedupgrade"))
    .register()
mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(2), circuit(5))
    .output(item("calculator:energyupgrade"))
    .register()
mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(2), circuit(6))
    .output(item("calculator:voidupgrade"))
    .register()
mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(2), circuit(7))
    .output(item("calculator:transferupgrade"))
    .register()

mods.calculator.fabrication_chamber.recipeBuilder()
    .input(circuit(12))
    .output(item("calculator:calculatorassembly"))
    .register()

// Circuits
mods.calculator.precision_chamber.removeAll()
def dirtyRecipeBoost = 8
def items = [
    // Heating
    [item("prodigytech:inferno_crystal"), item("essentialcraft:elementalfuel"), 10],
    // Prospecting
    [item("actuallyadditions:item_misc", 18), item("deepresonance:spent_filter"), 8],
    // Upgrade
    [item("minecraft:prismarine_crystals"), item("nuclearcraft:part", 1), 9],
    // Atomic
    [item("soot:ingot_antimony"), item("nuclearcraft:alloy", 14), 9],
    // Speed
    [item("prodigytech:sugar_cube"), item("thermalfoundation:material", 1024), 8],
    // Efficiency
    [item("embers:ashen_cloth"), item("thermalfoundation:material", 1025), 8],
    // Algorithm
    [item("calculator:weakeneddiamond"), item("opencomputers:material", 9), 8],
    // Transport
    [item("xnet:connector"), item("integrateddynamics:logic_director"), 8],
    // Growth
    [item("naturesaura:infused_iron"), item("essentialcraft:elementalfuel", 2), 10],
    // Energy Flow
    [item("immersiveengineering:wirecoil", 2), item("enderio:item_alloy_ingot", 1), 11],
    // Circuit 11 (WIP)
    [item("minecraft:stone"), item("minecraft:dirt"), 1],
    // Circuit 12 (WIP)
    [item("minecraft:cobblestone"), item("minecraft:leaves"), 1],
    // Binary logic
    [item("essentialcraft:genitem", 42), item("cells:overclocked_processor", 2), 9],
    // Compression
    [item("minecraft:piston"), item("thermalfoundation:material", 894), 8],
]
for (def i in 0..13) {
    mods.calculator.precision_chamber.recipeBuilder()
        .input(items[i][0])
        .output(item("prodigytech:ash") * 2, item("calculator:circuitdamaged", i))
        .register()
    mods.calculator.precision_chamber.recipeBuilder()
        .input(items[i][1])
        .output(item("prodigytech:ash") * 8, item("calculator:circuitdirty", i) * dirtyRecipeBoost)
        .register()
    TooltipEvents.setTier(item("calculator:circuitdirty", i), items[i][2])
}
