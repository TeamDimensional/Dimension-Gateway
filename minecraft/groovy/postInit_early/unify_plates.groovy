def plates = [
    // Plate, Block, Ingot, Fluid, Config
    [item("advancedrocketry:productplate"), item("advancedrocketry:metal0"), item("advancedrocketry:productingot"), fluid("titanium_aluminide") * 144, "strong"],
    [item("advancedrocketry:productplate", 1), item("advancedrocketry:metal0", 1), item("advancedrocketry:productingot", 1), null, "strong"],
    [item("aetherworks:item_resource", 3), item("aetherworks:block_aether"), item("aetherworks:item_resource", 4), null, "magic"],
    [item("embers:plate_dawnstone"), item("embers:block_dawnstone"), item("embers:ingot_dawnstone"), fluid("dawnstone") * 144, "metal"],
    [item("essentialcraft:genitem", 7), null, item("thaumcraft:salis_mundus"), null, "magic"],
    [item("essentialcraft:genitem", 21), item("minecraft:diamond_block"), item("minecraft:diamond"), fluid("diamond") * 666, "magic"],
    [item("essentialcraft:genitem", 22), item("minecraft:emerald_block"), item("minecraft:emerald"), fluid("emerald") * 666, "magic"],
    [item("essentialcraft:genitem", 31), null, item("minecraft:obsidian"), fluid("obsidian") * 288, "magic"],
    [item("essentialcraft:genitem", 35), null, item("essentialcraft:voidstone"), null, "magic"],
    [item("essentialcraft:genitem", 41), null, item("essentialcraft:genitem", 39), null, "metal"],
    [item("essentialcraft:genitem", 49), null, item("essentialcraft:genitem", 50), null, "metal"],
    [item("essentialcraft:genitem", 54), null, item("essentialcraft:genitem", 52), null, "magic"],
    [item("thaumcraft:plate"), item("thaumcraft:metal_brass"), item("thaumcraft:ingot", 2), fluid("brass") * 144, "metal"],
    [item("thaumcraft:plate", 2), item("thaumcraft:metal_thaumium"), item("thaumcraft:ingot"), null, "metal"],
    [item("thaumcraft:plate", 3), item("thaumcraft:metal_void"), item("thaumcraft:ingot", 1), null, "metal"],
    [item("thermalfoundation:material", 32), item("minecraft:iron_block"), item("minecraft:iron_ingot"), fluid("iron") * 144, "metal"],
    [item("thermalfoundation:material", 33), item("minecraft:gold_block"), item("minecraft:gold_ingot"), fluid("gold") * 144, "metal"],
    [item("thermalfoundation:material", 320), item("thermalfoundation:storage"), item("thermalfoundation:material", 128), fluid("copper") * 144, "metal"],
    [item("thermalfoundation:material", 321), item("thermalfoundation:storage", 1), item("thermalfoundation:material", 129), fluid("tin") * 144, "metal"],
    [item("thermalfoundation:material", 322), item("thermalfoundation:storage", 2), item("thermalfoundation:material", 130), fluid("silver") * 144, "metal"],
    [item("thermalfoundation:material", 323), item("thermalfoundation:storage", 3), item("thermalfoundation:material", 131), fluid("lead") * 144, "metal"],
    [item("thermalfoundation:material", 324), item("thermalfoundation:storage", 4), item("thermalfoundation:material", 132), fluid("aluminum") * 144, "metal"],
    [item("thermalfoundation:material", 325), item("thermalfoundation:storage", 5), item("thermalfoundation:material", 133), fluid("nickel") * 144, "metal"],
    [item("thermalfoundation:material", 326), item("thermalfoundation:storage", 6), item("thermalfoundation:material", 134), fluid("platinum") * 144, "metal"],
    [item("thermalfoundation:material", 327), item("thermalfoundation:storage", 7), item("thermalfoundation:material", 135), fluid("iridium") * 144, "strong"],
    [item("thermalfoundation:material", 328), item("thermalfoundation:storage", 8), item("thermalfoundation:material", 136), null, "strong"],
    [item("thermalfoundation:material", 352), item("immersiveengineering:storage", 8), item("thermalfoundation:material", 160), fluid("steel") * 144, "metal"],
    [item("thermalfoundation:material", 355), item("thermalfoundation:storage_alloy", 3), item("thermalfoundation:material", 163), fluid("bronze") * 144, "metal"],
    [item("thermalfoundation:material", 356), item("thermalfoundation:storage_alloy", 4), item("thermalfoundation:material", 164), fluid("constantan") * 144, "metal"],
    [item("thermalfoundation:material", 357), item("thermalfoundation:storage_alloy", 5), item("thermalfoundation:material", 165), fluid("signalum") * 144, "metal"],
    [item("thermalfoundation:material", 358), item("thermalfoundation:storage_alloy", 6), item("thermalfoundation:material", 166), fluid("lumium") * 144, "metal"],
    [item("thermalfoundation:material", 359), item("thermalfoundation:storage_alloy", 7), item("thermalfoundation:material", 167), fluid("enderium") * 144, "metal"],
    [item("libvulpes:productplate", 7), item("libvulpes:metal0", 7), item("libvulpes:productingot", 7), fluid("titanium") * 144, "strong"],
    [item("woot:stygianironplate"), item("woot:stygianiron"), item("woot:stygianironingot"), null, "strong"],
    [item("prodigytech:carbon_plate"), null, item("immersiveengineering:material", 17) * 4, null, "dust"],
]

// Clean up involved categories
mods.nuclearcraft.pressurizer.removeAllRecipes()
mods.thermalexpansion.compactor.removeAll()
mods.advancedrocketry.small_plate_presser.removeAll()
mods.advancedrocketry.rolling_machine.removeAll()
mods.immersiveengineering.metal_press.removeByMold(item("immersiveengineering:mold"))
def pressurizerRecipes = [
    [item("nuclearcraft:gem_dust", 4), item("nuclearcraft:gem", 1)],
    [item("nuclearcraft:gem_dust", 5), item("nuclearcraft:gem", 2)],
    [item("nuclearcraft:gem_dust", 8), item("nuclearcraft:gem", 3)],
    [item("thermalfoundation:material", 96), item("nuclearcraft:part", 16)],
    [item("nuclearcraft:dust2"), item("nuclearcraft:part", 17)],
    [item("nuclearcraft:fission_dust", 6) * 9, item("nuclearcraft:material_block")],
    [item("qmd:chemical_dust", 4) * 9, item("nuclearcraft:material_block", 1)],
    [item("nuclearcraft:fission_dust", 5) * 9, item("qmd:strontium_90_block")],
    [item("roots:flour") * 2, item("nuclearcraft:graham_cracker")],
]
for (def x in pressurizerRecipes) {
    mods.nuclearcraft.pressurizer.builder().input(x[0]).output(x[1]).register()
}
crafting.remove("thaumcraft:brassplate")
crafting.remove("thaumcraft:thaumiumplate")
crafting.remove("thaumcraft:voidplate")
crafting.remove("essentialcraft:diamond_plate_v")
crafting.remove("essentialcraft:diamond_plate_h")
crafting.remove("essentialcraft:emerald_plate_v")
crafting.remove("essentialcraft:emerald_plate_h")
crafting.remove("essentialcraft:obsidian_plate")
crafting.remove("embers:ingotdawnstone_plate")
crafting.remove("prodigytech:materials/carbon_plate")
def removeMagician = [7, 35, 41, 49, 54]
for (def it in removeMagician) mods.essentialcraft.magician_table.removeByOutput(item("essentialcraft:genitem", it))
def removeStamping = [item("embers:plate_dawnstone")]
for (def it in [32, 33, 323, 322, 320, 324, 355, 353, 325, 321]) {
    removeStamping.add(item("thermalfoundation:material", it))
}
for (def x in removeStamping) {
    mods.embers.stamper.removeByOutput(x)
}
mods.tconstruct.casting_table.removeByOutput(item("tconstruct:cast_custom", 3))
mods.tconstruct.casting_table.removeByCast(item("tconstruct:cast_custom", 3))
ore("cast").remove(item("tconstruct:cast_custom", 3))

mods.advancedrocketry.rolling_machine.recipeBuilder()
    .input(item("advancedrocketry:productplate"))
    .output(item("advancedrocketry:productsheet"))
    .fluidInput(fluid("lubricant") * 100)
    .power(200)
    .time(100)
    .register()

for (def x in plates) {
    def plate = x[0]
    def block = x[1]
    def ingot = x[2]
    def liquid = x[3]
    def category = x[4]

    def doPlatePress = category == "metal" && block != null
    def doImmersive = category == "metal" || category == "dust"
    def doThermal = category == "metal" || category == "dust"
    def doNuclearcraft = category == "metal" || category == "dust"
    def doEmbers = (category == "metal" || category == "magic") && liquid != null
    def doMagician = category == "magic"
    def doRollingMachine = category == "metal" || category == "strong"

    if (doPlatePress) {
        mods.advancedrocketry.small_plate_presser.recipeBuilder()
            .input(block)
            .output(plate * 6)
            .register()
    }
    if (doImmersive) {
        mods.immersiveengineering.metal_press.recipeBuilder()
            .mold(item("immersiveengineering:mold"))
            .input(ingot)
            .output(plate)
            .energy(2000)
            .register()
    }
    if (doThermal) {
        mods.thermalexpansion.compactor.recipeBuilder()
            .input(ingot)
            .output(plate)
            .energy(4000)
            .register()
    }
    if (doNuclearcraft) {
        mods.nuclearcraft.pressurizer.builder()
            .input(ingot)
            .output(plate)
            .register()
    }
    if (doMagician) {
        mods.essentialcraft.magician_table.recipeBuilder()
            .input(item("essentialcraft:genitem", 24), ingot, ingot, ingot, ingot)
            .output(plate * 4)
            .mru(200)
            .register()
    }
    if (doRollingMachine) {
        mods.advancedrocketry.rolling_machine.recipeBuilder()
            .input(ingot * 4)
            .output(plate * 4)
            .fluidInput(fluid("lubricant") * 50)
            .power(500)
            .time(20)
            .register()
    }
    if (doEmbers) {
        def builder = mods.embers.stamper.recipeBuilder()
            .stamp(item("embers:stamp_plate"))
            .fluidInput(liquid)
            .output(plate)
            if (category == "magic") {
                builder.input(item("essentialcraft:genitem", 24))
            }
        builder.register()
    }
}
