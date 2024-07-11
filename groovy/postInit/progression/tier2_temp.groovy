import com.shiroroku.theaurorian.Recipes.ScrapperRecipe
import com.shiroroku.theaurorian.Recipes.ScrapperRecipeHandler

if (isReloading()) return

// Temporary recipe that gives out brilliant fiber while waiting for my PR
ScrapperRecipeHandler.addRecipe(new ScrapperRecipe(item("thermalfoundation:material", 163), item("naturesaura:gold_fiber")))
