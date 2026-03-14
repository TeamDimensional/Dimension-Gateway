// Only use if you need to create recipes of custom type, use recipes.shapedBuilder() by default

package classes

import net.minecraftforge.common.crafting.CraftingHelper
import com.cleanroommc.groovyscript.api.IIngredient

class ShapedCraftingHelper {
    static void run() {}

    public static CraftingHelperBuilder builder() {
        return new CraftingHelperBuilder()
    }

    static class CraftingHelperBuilder {
        def matrix = []
        def items = []
        def ctor = null
        def name = null
        def output = null

        CraftingHelperBuilder name(String name) {
            this.name = name
            return this
        }

        CraftingHelperBuilder ctor(ctor) {
            this.ctor = ctor
            return this
        }

        CraftingHelperBuilder matrix(String[] keys) {
            matrix = keys as List<Object>
            return this
        }

        CraftingHelperBuilder key_(char k, IIngredient e) {
            items.add(k)
            items.add(e)
            return this
        }

        CraftingHelperBuilder key(String k, IIngredient e) {
            return key_((char) k[0], e)
        }

        CraftingHelperBuilder output(ItemStack s) {
            this.output = s
            return this
        }

        void register() {
            def primer = CraftingHelper.parseShaped((matrix + items) as Object[])
            def recipe = ctor(output, primer)
            recipe.setRegistryName(resource(name))
            crafting.add(recipe)
        }
    }
}