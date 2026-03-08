// priority: 100

import classes.CrushingHelper
import classes.GatewayHelpers

// Flour
mods.nuclearcraft.manufactory.removeRecipeWithInput(item("minecraft:wheat"))
def flours = [item("prodigytech:flour"), item("appliedenergistics2:material", 4), item("enderio:item_material", 21), item("nuclearcraft:flour")]
for (def it in flours) {
    GatewayHelpers.hide(it)
    ore("dustWheat").remove(it)
}

CrushingHelper.builder()
    .input(item("minecraft:wheat"))
    .output(item("roots:flour"))
    .register()

// Sawdust
def fixedSawmillRecipes = []

mods.prodigytech.heat_sawmill.streamRecipes()
    .filter(r -> r.getSecondaryOutput() in item("prodigytech:sawdust") && r.getInput() != null && !r.getInput().isEmpty())
    .forEach(recipe -> {
        def newRecipe = 
            mods.prodigytech.heat_sawmill.recipeBuilder()
                .input(recipe.getInput())
                .output(recipe.getOutput(), item("thermalfoundation:material", 800))
        fixedSawmillRecipes.add(newRecipe)
    }).removeAll()

mods.prodigytech.heat_sawmill.removeByInput(ore("plankWood"))
mods.prodigytech.heat_sawmill.recipeBuilder()
    .input(ore("plankWood"))
    .output(item("minecraft:stick") * 4, item("thermalfoundation:material", 800))
    .register()
for (def it in fixedSawmillRecipes) {
    it.register()
}

ore("dustWood").remove(item("prodigytech:sawdust"))
GatewayHelpers.hide(item("prodigytech:sawdust"))

CrushingHelper.builder()
    .input(ore("logWood"))
    .output(item("thermalfoundation:material", 800) * 4)
    .register()

CrushingHelper.builder()
    .input(ore("plankWood"))
    .output(item("thermalfoundation:material", 800))
    .register()

// Coal Dust
CrushingHelper.builder()
    .input(ore("coal"))
    .output(item("thermalfoundation:material", 768))
    .register()

CrushingHelper.builder()
    .input(ore("blockCoal"))
    .output(item("thermalfoundation:material", 768) * 9)
    .register()

ore("dustCoal").remove(item("prodigytech:coal_dust"))
GatewayHelpers.hide(item("prodigytech:coal_dust"))

// Iron Dust
def ironDusts = [
    item("prodigytech:iron_dust"), item("appliedenergistics2:material", 49), item("actuallyadditions:item_dust"),
    item("bloodmagic:component", 19), item("enderio:item_material", 24),
]
for (def it in ironDusts) {
    ore("dustIron").remove(it)
    GatewayHelpers.hide(it)
}

// Gold Dust
def goldDusts = [
    item("prodigytech:gold_dust"), item("appliedenergistics2:material", 51), item("actuallyadditions:item_dust", 1),
    item("bloodmagic:component", 20), item("enderio:item_material", 25),
]
for (def it in goldDusts) {
    ore("dustGold").remove(it)
    GatewayHelpers.hide(it)
}

// Quartz Dust
CrushingHelper.builder()
    .input(ore("gemQuartz"))
    .output(item("nuclearcraft:gem_dust", 2))
    .register()

CrushingHelper.builder()
    .input(ore("blockQuartz"))
    .output(item("nuclearcraft:gem_dust", 2) * 4)
    .register()

def quartzDusts = [
    item("appliedenergistics2:material", 3), item("actuallyadditions:item_dust", 5), item("enderio:item_material", 33), item("prodigytech:quartz_dust")
]
for (def it in quartzDusts) {
    ore("dustQuartz").remove(it)
    GatewayHelpers.hide(it)
}

// Diamond Dust
CrushingHelper.builder()
    .input(ore("gemDiamond"))
    .output(item("nuclearcraft:gem_dust"))
    .register()

def diamondDusts = [
    item("actuallyadditions:item_dust", 2), item("prodigytech:diamond_dust")
]
for (def it in diamondDusts) {
    ore("dustDiamond").remove(it)
    GatewayHelpers.hide(it)
}

// Emerald Dust
ore("dustEmerald").remove(item("actuallyadditions:item_dust", 3))
GatewayHelpers.hide(item("actuallyadditions:item_dust", 3))

// Lapis Dust
ore("dustLapis").remove(item("enderio:item_material", 32))
GatewayHelpers.hide(item("enderio:item_material", 32))

// Coal Dust
def coalDusts = [
    item("nuclearcraft:gem_dust", 7), item("actuallyadditions:item_dust", 6),
    item("bloodmagic:component", 21), item("enderio:item_material", 23),
]
for (def it in coalDusts) {
    ore("dustCoal").remove(it)
    GatewayHelpers.hide(it)
}

// Sulfur Dust
mods.bloodmagic.alchemy_table.removeByOutput(item("bloodmagic:component", 23) * 8)
// mods.abyssalcraft.transmutation.removeByOutput(item("abyssalcraft:sulfur"))

def sulfurDusts = [
    item("nuclearcraft:gem_dust", 6), item("bloodmagic:component", 23), item("abyssalcraft:sulfur")
]
for (def it in sulfurDusts) {
    ore("dustSulfur").remove(it)
    GatewayHelpers.hide(it)
}

// Saltpeter Dust
mods.bloodmagic.alchemy_table.removeByOutput(item("bloodmagic:component", 24) * 4)
furnace.removeByOutput(item("abyssalcraft:nitre"))

def saltpeterDusts = [
    item("qmd:chemical_dust", 2), item("bloodmagic:component", 24), item("abyssalcraft:nitre")
]
for (def it in saltpeterDusts) {
    ore("dustSaltpeter").remove(it)
    GatewayHelpers.hide(it)
}

// Ashes
ore("dustAsh").remove(item("embers:dust_ash"))
ore("dustAshes").remove(item("embers:dust_ash"))
GatewayHelpers.hide(item("embers:dust_ash"))

// Copper
def copperDusts = [
    item("enderio:item_material", 26)
]
for (def it in copperDusts) {
    ore("dustCopper").remove(it)
    GatewayHelpers.hide(it)
}

// Tin
def tinDusts = [
    item("enderio:item_material", 27)
]
for (def it in tinDusts) {
    ore("dustTin").remove(it)
    GatewayHelpers.hide(it)
}

// Obsidian
def obsidianDusts = [
    item("enderio:item_material", 29), item("nuclearcraft:gem_dust", 3)
]
for (def it in obsidianDusts) {
    ore("dustObsidian").remove(it)
    GatewayHelpers.hide(it)
}

// TODO: remove charcoal block from AA
ore("coal").remove(item("abyssalcraft:charcoal"))
