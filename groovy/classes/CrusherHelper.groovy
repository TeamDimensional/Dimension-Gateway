package classes

import com.cleanroommc.groovyscript.api.IIngredient

class CrusherHelper {
    static void run() {}

    public static CrusherHelperBuilder builder() {
        return new CrusherHelperBuilder()
    }

    static class CrusherHelperBuilder {
        def rotaryBuilder = null
        def ieCrusherBuilders = null

        CrusherHelperBuilder() {
            this.rotaryBuilder = mods.prodigytech.rotary_grinder.recipeBuilder()
            // Temp hack until issue is fixed
            // https://github.com/CleanroomMC/GroovyScript/issues/195
            this.ieCrusherBuilders = []
        }

        CrusherHelperBuilder input(IIngredient input) {
            this.rotaryBuilder.input(input)
            for (def stack : input.getMatchingStacks()) {
                def crusherBuilder = mods.immersiveengineering.crusher.recipeBuilder()
                crusherBuilder.input(stack)
                this.ieCrusherBuilders.add(crusherBuilder)
            }
            return this
        }

        CrusherHelperBuilder name(String name) {
            return this
        }

        CrusherHelperBuilder power(int power) {
            for (def cb in this.ieCrusherBuilders) cb.energy(power)
            return this
        }

        CrusherHelperBuilder output(ItemStack... items) {
            this.rotaryBuilder.output(items)
            for (def cb in this.ieCrusherBuilders) cb.output(items)
            return this
        }

        void register() {
            this.rotaryBuilder.register()
            for (def cb in this.ieCrusherBuilders) cb.register()
        }
    }
}
