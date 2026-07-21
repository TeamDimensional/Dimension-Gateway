

// TODO: fix mixin so this recipe can render.
import com.smokeythebandicoot.witcherycompanion.api.DistilleryApi

DistilleryApi.registerRecipe(resource("gateway:nightmare_fuel"),
    item("gateway:nightmare_fuel_unprepared").toMcIngredient(), item("witchery:disturbed_cotton").toMcIngredient(), 3,
    item("gateway:nightmare_fuel"), item("witchery:foul_fume"), item("witchery:foul_fume"), item("witchery:vitriol_oil"))