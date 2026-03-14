package classes

import com.cleanroommc.groovyscript.api.IIngredient

class CrushingHelper {
    static void run() {}

    public static CrushingHelperBuilder builder() {
        return new CrushingHelperBuilder()
    }

    static class CrushingHelperBuilder {
        def rotaryGrinderBuilder = null
        def hasChancedOutput = false
        
        def factoryTechBuilder = null
        def immersiveBuilder = null
        def aaBuilder = null

        CrushingHelperBuilder() {
            this.immersiveBuilder = mods.immersiveengineering.crusher.recipeBuilder()
            this.factoryTechBuilder = mods.factorytech.ore_drill.recipeBuilder()
            this.aaBuilder = mods.actuallyadditions.crusher.recipeBuilder()
            this.rotaryGrinderBuilder = mods.prodigytech.rotary_grinder.recipeBuilder()
        }

        CrushingHelperBuilder input(IIngredient item) {
            this.immersiveBuilder.input(item)
            this.factoryTechBuilder.input(item)
            this.aaBuilder.input(item)
            this.rotaryGrinderBuilder.input(item)
            return this
        }

        CrushingHelperBuilder name(String name) {
            return this
        }

        CrushingHelperBuilder output(ItemStack item) {
            this.immersiveBuilder.output(item)
            this.factoryTechBuilder.output(item)
            this.aaBuilder.output(item)
            this.rotaryGrinderBuilder.output(item)
            return this
        }

        CrushingHelperBuilder chancedOutput(ItemStack item, float chance) {
            this.immersiveBuilder.secondaryOutput(item, chance)
            this.aaBuilder.output(item).chance((int) (chance * 100))
            this.hasChancedOutput = true
            return this
        }

        void register() {
            this.immersiveBuilder.register()
            this.aaBuilder.register()
            if (!this.hasChancedOutput) {
                this.factoryTechBuilder.register()
                this.rotaryGrinderBuilder.register()
            }
        }
    }
}
