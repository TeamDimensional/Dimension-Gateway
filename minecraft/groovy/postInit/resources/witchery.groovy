import com.smokeythebandicoot.witcherycompanion.api.DistilleryApi
import com.smokeythebandicoot.witcherycompanion.api.KettleApi

DistilleryApi.removeRecipe(resource("witchery:distillery/ender_dew"))
DistilleryApi.registerRecipe(resource("witchery:ender_dew"),
    item("rftools:infused_enderpearl").toMcIngredient(), item("botania:rune", 12).toMcIngredient(), 4,
    item("witchery:ender_dew"), item("witchery:ender_dew"), item("witchery:magic_whiff"), item("witchery:magic_whiff"))

DistilleryApi.removeRecipe(resource("witchery:distillery/goddess_tear"))
DistilleryApi.registerRecipe(resource("witchery:goddess_tear"),
    item("witchery:goddess_breath").toMcIngredient(), item("botania:rune", 9).toMcIngredient(), 3,
    item("witchery:goddess_tear"), item("witchery:magic_whiff"), item("minecraft:slime_ball"), item("witchery:foul_fume"))

DistilleryApi.removeRecipe(resource("witchery:distillery/diamong_vapor"))  // sic
DistilleryApi.registerRecipe(resource("witchery:diamond_vapor"),
    item("rftools:infused_diamond").toMcIngredient(), item("botania:rune", 11).toMcIngredient(), 4,
    item("witchery:diamond_vapor"), item("witchery:diamond_vapor"), item("witchery:purity_odor"), item("witchery:purity_odor"))


KettleApi.removeRecipe(resource("witchery:kettle/redstone_soup"))
KettleApi.registerRecipe(resource("witchery:redstone_soup"),
    item("witchery:redstone_soup"),
    2500.0f,
    0,
    null,
    null,
    false,
    item("enderio:block_alloy", 3).toMcIngredient(), item("extrautils2:ingredients", 2).toMcIngredient(),
    item("witchery:luck_drop").toMcIngredient(), item("witchery:belladonna_flower").toMcIngredient(),
    item("witchery:dog_tongue").toMcIngredient(), item("botania:rune", 10).toMcIngredient())
