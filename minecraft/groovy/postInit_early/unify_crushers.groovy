// priority: 101
import classes.CrushingHelper

mods.actuallyadditions.crusher.removeAll()
mods.factorytech.ore_drill.removeAll()
// IE crusher can be used for either recipes or ore processing
mods.immersiveengineering.crusher.removeAll()
// These are used only for ore processing
mods.prodigytech.rotary_grinder.removeAll()
mods.thermalexpansion.pulverizer.removeAll()
mods.prodigytech.ore_refinery.removeAll()
mods.enderio.sag_mill.removeAll()

// Restore missing recipes
mods.factorytech.grindstone.recipeBuilder()
    .input(item("minecraft:obsidian"))
    .output(item("factorytech:intermediate"))
    .register()

mods.factorytech.ore_drill.recipeBuilder()
    .input(item("factorytech:mined_ore"))
    .output(item("factorytech:mined_ore", 2) * 2)
    .register()

mods.factorytech.ore_drill.recipeBuilder()
    .input(item("factorytech:mined_ore", 1))
    .output(item("factorytech:mined_ore", 3) * 2)
    .register()

// Add Niter for alternate source of gunpowder
CrushingHelper.builder()
    .name("sandstone_to_niter")
    .input(item("minecraft:sandstone:*"))
    .output(item("minecraft:sand") * 2)
    .chancedOutput(item("thermalfoundation:material", 772), 0.5)
    .register()
CrushingHelper.builder()
    .name("red_sandstone_to_niter")
    .input(item("minecraft:red_sandstone:*"))
    .output(item("minecraft:sand", 1) * 2)
    .chancedOutput(item("thermalfoundation:material", 772), 0.5)
    .register()

// Add Blaze Rod crushing
CrushingHelper.builder()
    .name("blaze_rod")
    .input(item("minecraft:blaze_rod"))
    .output(item("minecraft:blaze_powder") * 4)
    .chancedOutput(item("thermalfoundation:material", 771), 0.5)
    .register()

// Add recipes
def recipes = [
    [item("minecraft:bone"), item("minecraft:dye", 15) * 6],
    [item("minecraft:reeds"), item("minecraft:sugar") * 3],
    [item("minecraft:yellow_flower"), item("minecraft:dye", 11) * 3],
    [item("minecraft:red_flower"), item("minecraft:dye", 1) * 3],
    [item("minecraft:red_flower", 1), item("minecraft:dye", 12) * 3],
    [item("minecraft:red_flower", 2), item("minecraft:dye", 13) * 3],
    [item("minecraft:red_flower", 3), item("minecraft:dye", 7) * 3],
    [item("minecraft:red_flower", 4), item("minecraft:dye", 1) * 3],
    [item("minecraft:red_flower", 5), item("minecraft:dye", 14) * 3],
    [item("minecraft:red_flower", 6), item("minecraft:dye", 7) * 3],
    [item("minecraft:red_flower", 7), item("minecraft:dye", 9) * 3],
    [item("minecraft:red_flower", 8), item("minecraft:dye", 7) * 3],
    [item("minecraft:double_plant"), item("minecraft:dye", 11) * 4],
    [item("minecraft:double_plant", 1), item("minecraft:dye", 13) * 4],
    [item("minecraft:double_plant", 4), item("minecraft:dye", 1) * 4],
    [item("minecraft:double_plant", 5), item("minecraft:dye", 9) * 4],
    // Stone
    [item("minecraft:cobblestone"), item("minecraft:sand")],
    [item("minecraft:stone"), item("minecraft:gravel")],
    [item("minecraft:gravel"), item("minecraft:flint") * 2],
    // Ingots
    [item("minecraft:iron_ingot"), item("thermalfoundation:material")],
    [item("minecraft:gold_ingot"), item("thermalfoundation:material", 1)],
    [item("advancedrocketry:productingot"), item("advancedrocketry:productdust")],
    [item("advancedrocketry:productingot", 1), item("advancedrocketry:productdust"), 1],
    [item("astralsorcery:itemcraftingcomponent", 1), item("astralsorcery:itemcraftingcomponent", 2)],
    [item("nuclearcraft:ingot", 8), item("nuclearcraft:dust", 8)],
    [item("theaurorian:ceruleaningot"), item("jaopca:dust.cerulean")],
    [item("theaurorian:moonstoneingot"), item("jaopca:dust.moonstone")],
    [item("libvulpes:productingot", 7), item("libvulpes:productdust", 7)],
    // Gems
    [item("minecraft:coal"), item("thermalfoundation:material", 768)],
    [item("minecraft:coal", 1), item("thermalfoundation:material", 769)],
    [item("immersiveengineering:material", 6), item("immersiveengineering:material", 17)],
    [item("minecraft:diamond"), item("nuclearcraft:gem_dust")],
    [item("minecraft:quartz"), item("nuclearcraft:gem_dust", 2)],
    [item("minecraft:emerald"), item("prodigytech:emerald_dust")],
    [item("nuclearcraft:gem", 2), item("nuclearcraft:gem_dust", 5)],
    [item("nuclearcraft:gem", 3), item("nuclearcraft:gem_dust", 8)],
    [item("nuclearcraft:gem", 4), item("nuclearcraft:gem_dust", 9)],
    [item("appliedenergistics2:material"), item("appliedenergistics2:material", 2)],
    [item("appliedenergistics2:material", 7), item("appliedenergistics2:material", 8)],
    [item("prodigytech:energion_crystal_seed"), item("prodigytech:energion_dust")],
    [item("libvulpes:productgem"), item("libvulpes:productdust")],
    [item("actuallyadditions:item_misc", 5), item("actuallyadditions:item_dust", 7)],
    [item("minecraft:dye", 4), item("actuallyadditions:item_dust", 4)],
    // Blocks
    [item("minecraft:obsidian"), item("thermalfoundation:material", 770)],
    [item("minecraft:end_stone"), item("nuclearcraft:gem_dust", 11)],
    [item("appliedenergistics2:sky_stone_block"), item("appliedenergistics2:material", 45)],
]
for (def i in 128..136) recipes.add([item("thermalfoundation:material", i), item("thermalfoundation:material", i - 64)])
for (def i in 160..167) recipes.add([item("thermalfoundation:material", i), item("thermalfoundation:material", i - 64)])
for (def i in 3..11) recipes.add([item("nuclearcraft:ingot", i), item("nuclearcraft:dust", i)])
for (def i in 14..15) recipes.add([item("nuclearcraft:ingot", i), item("nuclearcraft:dust", i)])
for (def i in 0..6) recipes.add([item("nuclearcraft:ingot2", i), item("nuclearcraft:dust2", i)])
for (def i in [0, 1, 2, 6, 7, 8, 11, 12, 13, 14, 15]) recipes.add([item("qmd:ingot", i), item("qmd:dust", i)])
for (def i in 0..1) recipes.add([item("qmd:ingot2", i), item("qmd:dust2", i)])

for (def x in recipes) {
    CrushingHelper.builder()
        .name(x[0].toString())
        .input(x[0])
        .output(x[1])
        .register()
}
