// Pure Daisy
inWorldCrafting.fluidToItem.recipeBuilder()
    .fluidInput(fluid("water"))
    .input(item("gateway:wilted_daisy"))
    .input(ore("petalWhite") * 4)
    .output(item("botania:specialflower").withNbt(["type": "puredaisy"]))
    .register()

// Mana Pool
def pools = [
    [0, item("botania:livingrock")],
    [2, item("botania:livingrock0slab")],
    [3, item("botania:shimmerrock")]
]
for (def it in pools) {
    crafting.remove("botania:pool_${it[0]}")
    crafting.shapedBuilder()
        .matrix("SDS", "SSS")
        .key("S", it[1])
        .key("D", item("essentialcraft:genitem", 20))
        .output(item("botania:pool", it[0]))
        .register()
}
