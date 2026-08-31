import com.smokeythebandicoot.witcherycompanion.api.DistilleryApi

DistilleryApi.registerRecipe(resource("gateway:nightmare_fuel"),
    item("gateway:nightmare_fuel_unprepared").toMcIngredient(), item("witchery:disturbed_cotton").toMcIngredient(), 3,
    item("gateway:nightmare_fuel"), item("witchery:foul_fume"), item("witchery:foul_fume"), item("witchery:vitriol_oil"))

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
