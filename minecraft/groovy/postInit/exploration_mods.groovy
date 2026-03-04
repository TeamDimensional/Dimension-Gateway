// Aurorian Book
def aurorianBook = item('patchouli:guide_book').withNbt(['patchouli:book': 'theaurorian:the_aurorian_guide'])
crafting.removeByOutput(aurorianBook)
crafting.shapelessBuilder()
        .name("tier1/aurorian_book")
        .output(aurorianBook)
        .input(item("minecraft:book"), ore("treeSapling"), ore("treeSapling"), ore("gemWaterElemental"))
        .register()

// Aurorian Portal
crafting.remove("theaurorian:blocks/aurorianstone")
mods.botania.pure_daisy.recipeBuilder()
    .input(blockstate("essentialcraft:compressed:4"))
    .output(blockstate("theaurorian:aurorianportalframebricks"))
    .time(30)
    .register()
