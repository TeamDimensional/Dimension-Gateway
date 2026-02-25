// priority: 200
import classes.GatewayHelpers

def duplicateRecipes = []

for (def x in ["copper", "nickel", "invar"]) {
    duplicateRecipes.add("factorytech:ore/${x}iton")
    duplicateRecipes.add("factorytech:ore/ingot${x}")
    duplicateRecipes.add("factorytech:ore/block${x}")
    duplicateRecipes.add("factorytech:ore/uncraft${x}")
}
for (def it in duplicateRecipes) crafting.remove(it)

def ftMetals = [
    ["Copper", 0],
    ["Nickel", 1],
    ["Invar", 3],
]

for (def it in ftMetals) {
    def metal = it[0]
    def idx = it[1]
    ore("ingot${metal}").remove(item("factorytech:ingot", idx))
    ore("block${metal}").remove(item("factorytech:oreblock", idx))
    ore("nugget${metal}").remove(item("factorytech:ore_dust", idx + 4))
    ore("dust${metal}").remove(item("factorytech:ore_dust", idx + 8))
    furnace.removeByInput(item("factorytech:ore_dust", idx + 8))
    mods.factorytech.high_tech_furnace.removeByInput(item("factorytech:ore_dust", idx + 8))
    mods.factorytech.electroplater.removeByInput(item("factorytech:ore_dust", idx + 8))
}

ore("dustIron").remove(item("factorytech:ore_dust", 6))
ore("dustGold").remove(item("factorytech:ore_dust", 7))

def centrifugeReplacements = [
    [item("factorytech:ore_dust", 4), item("thermalfoundation:material", 192)],
    [item("factorytech:ore_dust", 5), item("thermalfoundation:material", 197)],
    [item("factorytech:ore_dust", 6), item("thermalfoundation:material")],
    [item("factorytech:ore_dust", 7), item("thermalfoundation:material", 1)],
    [item("factorytech:ore_dust", 8), item("thermalfoundation:material", 64)],
    [item("factorytech:ore_dust", 9), item("thermalfoundation:material", 69)],
    [item("factorytech:ore_dust", 18), item("thermalfoundation:material", 226)],
    [item("factorytech:ingot"), item("thermalfoundation:material", 128)],
    [item("factorytech:ingot", 1), item("thermalfoundation:material", 133)],
    [item("factorytech:ingot", 3), item("thermalfoundation:material", 162)],
]
def removedItems = [item("factorytech:ore_dust", 3), item("factorytech:ore_dust", 10)]
def electroplaterReplacements = [
    item("libvulpes:productdust", 4),
    item("immersiveengineering:metal", 9),
    item("nuclearcraft:dust"),
    item("qmd:dust", 5),
    item("immersiveengineering:metal", 13),
]

def replaceOutput(recipe, addition) {
    for (def it in centrifugeReplacements) {
        def bad = it[0]
        def good = it[1]
        if (recipe.output() == bad) {
            recipe.remove()
            addition(good)
        }
    }
}

def fixedRecipes = []

mods.factorytech.centrifuge.streamRecipes()
    .filter(recipe -> {
        def outItems = []
        def foundBad = false
        for (def it in centrifugeReplacements) {
            if (it[0] in recipe.input()) {
                return true // FT makes oredicted recipes, so it's fine.
            }
        }
        for (def it in removedItems) {
            if (it in recipe.input()) {
                return true
            }
        }
        for (def x in recipe.output()) {
            def thisBad = false
            for (def it in centrifugeReplacements) {
                if (it[0] in x) {
                    foundBad = thisBad = true
                    outItems.add(it[1] * x.count)
                    break
                }
            }
            if (!thisBad) {
                outItems.add(x)
            }
        }
        if (foundBad) {
            b = mods.factorytech.centrifuge.recipeBuilder()
                .input(recipe.input())
                .output(outItems as ItemStack[])
                .allowStoneParts(recipe.worksWithBad())
            fixedRecipes.add(b)
            return true
        }
        return false
    })
    .removeAll()

mods.factorytech.electroplater.streamRecipes()
    .filter(recipe -> {
        def replacement = null
        for (def it in electroplaterReplacements) {
            if (it in recipe.input()) {
                return true // FT makes oredicted recipes, so it's fine.
            }
        }
        for (def it in centrifugeReplacements) {
            if (it[0] in recipe.input()) {
                return true // FT makes oredicted recipes, so it's fine.
            }
        }
        for (def it in centrifugeReplacements) {
            if (it[0] in recipe.output()) {
                replacement = it[1] * recipe.output().count
                break
            }
        }
        if (replacement != null) {
            b = mods.factorytech.electroplater.recipeBuilder()
                .input(recipe.input())
                .output(replacement)
                .allowStoneParts(recipe.worksWithBad())
            fixedRecipes.add(b)
            return true
        }
        return false
    })
    .removeAll()
for (def x in fixedRecipes) x.register() 

for (def x in centrifugeReplacements) {
    GatewayHelpers.hide(x[0])
}

// Removing FT Glowstone to improve cross-mod interactions
mods.factorytech.agitator.removeByOutput(fluid("energite"))
mods.factorytech.agitator.recipeBuilder()
    .fluidInput(fluid("h2so4") * 100, fluid("aetherworks.impure_aetherium_gas") * 48)
    .input(item("factorytech:intermediate", 3))
    .fluidOutput(fluid("energite") * 200)
    .register()
mods.factorytech.refrigerator.removeByOutput(item("minecraft:glowstone"))
mods.factorytech.compressor.removeByOutput(item("factorytech:tank", 6))
mods.factorytech.compressor.recipeBuilder()
    .fluidInput(fluid("glowstone") * 2500)
    .input(item("factorytech:tank"))
    .output(item("factorytech:tank", 6))
    .register()
