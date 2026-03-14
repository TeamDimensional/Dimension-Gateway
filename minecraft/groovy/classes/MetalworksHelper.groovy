package classes

import com.cleanroommc.groovyscript.api.IIngredient

class MetalworksHelper {
    static void run() {}

    public static MetalworksHelperBuilder builder() {
        return new MetalworksHelperBuilder()
    }

    static class MetalworksHelperBuilder {
        def thermalBuilder = null
        def immersiveBuilder = null

        MetalworksHelperBuilder() {
            this.immersiveBuilder = mods.immersiveengineering.metal_press.recipeBuilder()
            this.thermalBuilder = mods.thermalexpansion.compactor.recipeBuilder()
        }

        MetalworksHelperBuilder input(IIngredient item) {
            this.immersiveBuilder.input(item)
            this.thermalBuilder.input(item)
            return this
        }

        MetalworksHelperBuilder plate() {
            this.immersiveBuilder.mold(item("immersiveengineering:mold"))
            this.thermalBuilder.mode(compactorMode("plate"))
            return this
        }

        MetalworksHelperBuilder gear() {
            this.immersiveBuilder.mold(item("immersiveengineering:mold", 1))
            this.thermalBuilder.mode(compactorMode("gear"))
            return this
        }

        MetalworksHelperBuilder name(String name) {
            return this
        }

        MetalworksHelperBuilder output(ItemStack item) {
            this.immersiveBuilder.output(item)
            this.thermalBuilder.output(item)
            return this
        }

        void register() {
            this.immersiveBuilder.register()
            this.thermalBuilder.register()
        }
    }
}
