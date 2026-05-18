import classes.FuelReprocessing

def defineDefaultNcOperations(name) {
    for (def subname in ["", "_depleted"]) {
        if (subname == "") {
            mods.nuclearcraft.infuser.builder()
                .input(item("gateway:${name}${subname}_fuel"))
                .fluidInput(fluid("oxygen") * 1000)
                .output(item("gateway:${name}${subname}_fuel_ox"))
                .register()
            furnace.recipeBuilder()
                .input(item("gateway:${name}${subname}_fuel_ox"))
                .output(item("gateway:${name}${subname}_fuel"))
                .register()
        }
        
        if (subname == "") {
            mods.nuclearcraft.melter.builder()
                .input(item("gateway:${name}${subname}_fuel"))
                .fluidOutput(fluid("${name}${subname}_fuel") * 144)
                .register()
            mods.nuclearcraft.ingot_former.builder()
                .fluidInput(fluid("${name}${subname}_fuel") * 144)
                .output(item("gateway:${name}${subname}_fuel"))
                .register()
        }
        
        if (subname == "") {
            mods.nuclearcraft.chemical_reactor.builder()
                .fluidInput(fluid("${name}${subname}_fuel") * 72)
                .fluidInput(fluid("fluorine") * 500)
                .fluidOutput(fluid("${name}${subname}_fuel_f4") * 72)
                .timeMultiplier(0.5)
                .powerMultiplier(0.5)
                .register()
        }
        mods.nuclearcraft.electrolyzer.builder()
            .fluidOutput(fluid("${name}${subname}_fuel") * 72)
            .fluidOutput(fluid("fluorine") * 500)
            .fluidInput(fluid("${name}${subname}_fuel_f4") * 72)
            .timeMultiplier(0.5)
            .register()
        
        if (subname == "") {
            mods.nuclearcraft.salt_mixer.builder()
                .fluidInput(fluid("${name}${subname}_fuel_f4") * 72)
                .fluidInput(fluid("flibe") * 72)
                .fluidOutput(fluid("${name}${subname}_fuel_flibe") * 72)
                .timeMultiplier(0.5)
                .register()
        }
        mods.nuclearcraft.centrifuge.builder()
            .fluidOutput(fluid("${name}${subname}_fuel_f4") * 72)
            .fluidOutput(fluid("flibe") * 72)
            .fluidInput(fluid("${name}${subname}_fuel_flibe") * 72)
            .timeMultiplier(0.5)
            .register()
    }
}

defineDefaultNcOperations("natural")
defineDefaultNcOperations("arcane")
defineDefaultNcOperations("lunar")
defineDefaultNcOperations("skybound")
defineDefaultNcOperations("botanical")
defineDefaultNcOperations("crystalline")
defineDefaultNcOperations("nightmare")

/*
Fuel        Mod             Crit    Life    Rads    Effi    Heat    SP
Natural     Nature's Aura   55      220 s   HEU-235 1.3x    LEP-239 
    Moderate fuel in all ways
Arcane      Thaumcraft      150     450 s   HEN-236 0.8x    HEN-236
    Good for irradiation due to lifetime and criticality
Lunar       Astral Sorcery  70      330 s   HEN-236 1.85x   HEA-242
    Long-lived and hot
Skybound    Aetherworks     15      240 s   LEU-235 1.6x    2x TBU
    Cold and low criticality
Botanical   Botania         60      160 s   2x HECf 2.4x    HEP-239 x
    source of pure radiation and high efficiency
Crystalline EC4             120     400 s   LEU-235 1.7x    HEB-248 x
    Long-lived and hot, but this time with high criticality
Nightmare   Witchery        40      240 s   0       2.8x    LEU-233
    powerful fuel
*/

def urad = 1e-6
def mrad = 1e-3
def rad = 1

def registerFuel(name, criticality, efficiency, radiation, time, heat, selfPriming = false) {
    mods.nuclearcraft.solid_fission.builder()
        .input(item("gateway:${name}_fuel_ox"))
        .output(item("gateway:${name}_depleted_fuel_ox"))
        .criticality(criticality).efficiency(efficiency).radiation(radiation).time(time).heat(heat).selfPriming(selfPriming).register()
    mods.nuclearcraft.salt_fission.builder()
        .fluidInput(fluid("${name}_fuel_flibe"))
        .fluidOutput(fluid("${name}_depleted_fuel_flibe"))
        .criticality(criticality).efficiency(efficiency).radiation(radiation).time((int) (time * 1.3 / 144)).heat(heat).selfPriming(selfPriming).register()
}

registerFuel("natural", 55, 1.3, 48 * urad, 4400, 160)
registerFuel("arcane", 150, 0.8, 160 * urad, 9000, 660)
registerFuel("lunar", 70, 1.85, 210 * urad, 6600, 1050)
registerFuel("skybound", 23, 1.6, 17 * urad, 4800, 300)
registerFuel("botanical", 60, 2.4, 18.2 * mrad, 3200, 430, true)
registerFuel("crystalline", 120, 1.7, 24 * urad, 8000, 850, true)
registerFuel("nightmare", 40, 3.8, 0, 5400, 210)

// Unprepared recipes
def items = [
    ["natural", item("naturesaura:infused_iron")],
    ["arcane", item("thaumcraft:ingot")],
    ["lunar", item("astralsorcery:itemcraftingcomponent", 1)],
    ["skybound", item("aetherworks:item_resource", 4)],
    ["botanical", item("botania:quartz", 6)],
    ["crystalline", item("essentialcraft:genitem", 79)],
    // ["nightmare", item("witchery:tormented_twine")],
]

for (def it in items) {
    def name = it[0]
    def component = it[1]
    crafting.shapelessBuilder()
        .input(component)
        .output(item("gateway:${name}_fuel_unprepared") * 8)
        // U-235
        .input(item("nuclearcraft:uranium", 5))
        .input(item("nuclearcraft:uranium", 5))
        // U-238
        .input(item("nuclearcraft:uranium", 10))
        .input(item("nuclearcraft:uranium", 10))
        .input(item("nuclearcraft:uranium", 10))
        .input(item("nuclearcraft:uranium", 10))
        .input(item("nuclearcraft:uranium", 10))
        .input(item("nuclearcraft:uranium", 10))
        .register()
}

// TODO: groovyscript support.
// TODO: fix mixin so this recipe can render.
import com.smokeythebandicoot.witcherycompanion.api.KettleApi

KettleApi.registerRecipe(resource("gateway:unprepared_nightmare_fuel"),
    item("gateway:nightmare_fuel_unprepared") * 6,
    1200.0f,
    2,
    null,
    null,
    false,
    // Fertile isotopes (4, because cauldron only supports 6 inputs)
    item("nuclearcraft:neptunium", 5).toMcIngredient(), item("nuclearcraft:curium", 10).toMcIngredient(),
    item("nuclearcraft:berkelium").toMcIngredient(), item("nuclearcraft:californium", 15).toMcIngredient(),
    // Fissile isotopes (2)
    item("nuclearcraft:plutonium", 5).toMcIngredient(), item("nuclearcraft:americium", 5).toMcIngredient())

KettleApi.registerRecipe(resource("gateway:unprepared_nightmare_fuel_ox"),
    item("gateway:nightmare_fuel_unprepared") * 6,
    1200.0f,
    2,
    null,
    null,
    false,
    // Fertile isotopes (4, because cauldron only supports 6 inputs)
    item("nuclearcraft:neptunium", 7).toMcIngredient(), item("nuclearcraft:curium", 12).toMcIngredient(),
    item("nuclearcraft:berkelium", 2).toMcIngredient(), item("nuclearcraft:californium", 17).toMcIngredient(),
    // Fissile isotopes (2)
    item("nuclearcraft:plutonium", 7).toMcIngredient(), item("nuclearcraft:americium", 7).toMcIngredient())

// Preparing fuels
mods.naturesaura.altar.recipeBuilder()
    .input(item("gateway:natural_fuel_unprepared"))
    .output(item("gateway:natural_fuel"))
    .catalyst(item("naturesaura:conversion_catalyst"))
    .aura(2500)
    .time(60)
    .register()

mods.thaumcraft.crucible.recipeBuilder()
    .researchKey("UNLOCKALCHEMY@3")
    .catalyst(item("gateway:arcane_fuel_unprepared"))
    .output(item("gateway:arcane_fuel"))
    .aspect(aspect("potentia") * 15, aspect("alkimia") * 10)
    .register()

mods.astralsorcery.infusion_altar.recipeBuilder()
    .input(item("gateway:lunar_fuel_unprepared"))
    .output(item("gateway:lunar_fuel"))
    .consumption(0.5f)
    .time(60)
    .register()

mods.aetherworks.anvil.recipeBuilder()
    .input(item("gateway:skybound_fuel_unprepared"))
    .output(item("gateway:skybound_fuel"))
    .difficulty(4)
    .embersPerHit(25)
    .hits(5)
    .minTemperature(1300)
    .maxTemperature(1600)
    .temperatureFluctuation(100)
    .register()

mods.botania.mana_infusion.recipeBuilder()
    .input(item("gateway:botanical_fuel_unprepared"))
    .output(item("gateway:botanical_fuel"))
    .mana(1250)
    .register()

mods.essentialcraft.wind_rune.recipeBuilder()
    .input(item("gateway:crystalline_fuel_unprepared"))
    .output(item("gateway:crystalline_fuel"))
    .espe(300)
    .register()

// TODO: fix mixin so this recipe can render.
import com.smokeythebandicoot.witcherycompanion.api.DistilleryApi

DistilleryApi.registerRecipe(resource("gateway:nightmare_fuel"),
    item("gateway:nightmare_fuel_unprepared").toMcIngredient(), item("witchery:disturbed_cotton").toMcIngredient(), 3,
    item("gateway:nightmare_fuel"), item("witchery:foul_fume"), item("witchery:foul_fume"), item("witchery:vitriol_oil"))


// Reprocessing
// Np: 236[F] -> Natural, 237[_] -> Lunar*
// Pu: 238[R] -> Arcane, 239[F] -> Natural*, 241[F] -> Lunar, 242[_] -> Botanical
// Am: 241[R] -> Skybound, 242[F] -> Botanical*, 243[_] -> Natural
// Cm: 243[F] -> Crystalline, 245[F] -> Skybound, 246[_] -> Arcane*, 247[F] -> Crystalline
// Bk: 247[_] -> Crystalline*, 248[F] -> Lunar
// Cf: 249[F] -> Arcane, 250[R] -> Crystalline, 251[F] -> Botanical, 252[_] -> Skybound*
FuelReprocessing.builder()
    .input("natural", 8)
    .output("neptunium", 0, 236, 3)   // fissile
    .output("plutonium", 5, 239, 2)   // fissile, nightmare part
    .output("americium", 10, 243, 2)  // fertile
    .register()

FuelReprocessing.builder()
    .input("arcane", 8)
    .output("plutonium", 0, 238, 3)    // RTG
    .output("curium", 10, 246, 2)      // fertile, nightmare part
    .output("californium", 0, 249, 2)  // fissile
    .register()

FuelReprocessing.builder()
    .input("lunar", 8)
    .output("neptunium", 5, 237, 3)   // fertile, nightmare part
    .output("plutonium", 10, 241, 2)  // fissile
    .output("berkelium", 5, 248, 2)   // fissile
    .register()

FuelReprocessing.builder()
    .input("skybound", 8)
    .output("americium", 0, 241, 3)     // rtg
    .output("curium", 5, 245, 2)        // fissile
    .output("californium", 15, 252, 2)  // fertile, nightmare part
    .register()

FuelReprocessing.builder()
    .input("botanical", 8)
    .output("plutonium", 15, 242, 2)    // fertile
    .output("americium", 5, 242, 3)     // fissile, nightmare part
    .output("californium", 10, 251, 2)  // fertile
    .register()

FuelReprocessing.builder()
    .input("crystalline", 8)
    .output("curium", 0, 243, 2)       // fissile
    .output("curium", 15, 247, 2)      // fissile
    .output("berkelium", 0, 247, 2)    // fertile, nightmare part
    .output("californium", 5, 250, 1)  // rtg
    .register()
