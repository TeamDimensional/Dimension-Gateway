// priority: 100

import classes.CrusherHelper
import classes.GatewayHelpers

// Flour
mods.prodigytech.rotary_grinder.removeByInput(item("minecraft:wheat"))
GatewayHelpers.hide(item("prodigytech:flour"))

CrusherHelper.builder()
    .input(item("minecraft:wheat"))
    .output(item("roots:flour"))
    .register()

// Sawdust
mods.prodigytech.rotary_grinder.removeByInput(ore("logWood"))
mods.prodigytech.rotary_grinder.removeByInput(ore("plankWood"))

mods.prodigytech.heat_sawmill.streamRecipes()
    .filter(r -> r.getSecondaryOutput() in item("prodigytech:sawdust") && r.getInput() != null && !r.getInput().isEmpty())
    .forEach(recipe -> {
        mods.prodigytech.heat_sawmill.recipeBuilder()
            .input(recipe.getInput())
            .output(recipe.getOutput(), item("thermalfoundation:material", 800))
            .register()
    })
    // Don't do removeAll because the new recipe overrides the old one

mods.prodigytech.heat_sawmill.removeByInput(ore("plankWood"))
mods.prodigytech.heat_sawmill.recipeBuilder()
    .input(ore("plankWood"))
    .output(item("minecraft:stick") * 4, item("thermalfoundation:material", 800))
    .register()

ore("dustWood").remove(item("prodigytech:sawdust"))
GatewayHelpers.hide(item("prodigytech:sawdust"))

CrusherHelper.builder()
    .input(ore("logWood"))
    .output(item("thermalfoundation:material", 800) * 4)
    .register()

CrusherHelper.builder()
    .input(ore("plankWood"))
    .output(item("thermalfoundation:material", 800))
    .register()

// Coal Dust
mods.prodigytech.rotary_grinder.removeByInput(ore("oreCoal"))
mods.prodigytech.rotary_grinder.removeByInput(ore("blockCoal"))
mods.prodigytech.rotary_grinder.removeByInput(ore("plateCarbon"))
mods.prodigytech.rotary_grinder.removeByInput(item("minecraft:coal"))
mods.prodigytech.ore_refinery.removeByInput(ore("oreCoal"))

CrusherHelper.builder()
    .input(ore("coal"))
    .output(item("thermalfoundation:material", 768))
    .register()

CrusherHelper.builder()
    .input(ore("blockCoal"))
    .output(item("thermalfoundation:material", 768) * 9)
    .register()

mods.prodigytech.rotary_grinder.recipeBuilder()
    .input(ore("oreCoal"))
    .output(item("minecraft:coal") * 3)
    .register()

mods.prodigytech.ore_refinery.recipeBuilder()
    .input(ore("oreCoal"))
    .output(item("minecraft:coal") * 3, item("thermalfoundation:material", 771))
    .secondaryChance(0.4)
    .register()

ore("dustCoal").remove(item("prodigytech:coal_dust"))
GatewayHelpers.hide(item("prodigytech:coal_dust"))

// Iron Dust
ore("dustIron").remove(item("prodigytech:iron_dust"))
ore("dustTinyIron").remove(item("prodigytech:iron_dust_tiny"))
crafting.remove("prodigytech:storage/iron_dust_tiny")
mods.prodigytech.rotary_grinder.removeByInput(ore("nuggetIron"))
GatewayHelpers.hide(item("prodigytech:iron_dust"))
GatewayHelpers.hide(item("prodigytech:iron_dust_tiny"))
// TODO: check tinker's and furnace

// Gold Dust - keeping the Tiny Dust for Solderer purposes
crafting.remove("prodigytech:storage/gold_dust_tiny_combine")
crafting.shapedBuilder()
        .name("unify/gold_dust_tiny")
        .output(item("thermalfoundation:material", 1))
        .matrix("ggg", "ggg", "ggg")
        .key("g", ore("dustTinyGold"))
        .register()
ore("dustGold").remove(item("prodigytech:gold_dust"))
GatewayHelpers.hide(item("prodigytech:gold_dust"))
// TODO: check tinker's and furnace
