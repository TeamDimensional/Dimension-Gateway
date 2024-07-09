package classes

import com.cleanroommc.groovyscript.api.IIngredient

class AlloyHelper {
    static void run() {}

    public static AlloyHelperBuilder builder() {
        return new AlloyHelperBuilder()
    }

    static class AlloyHelperBuilder {
        def kilnBuilder = null
        def arcBuilder = null

        AlloyHelperBuilder() {
            this.kilnBuilder = mods.immersiveengineering.alloy_kiln.recipeBuilder()
            this.arcBuilder = mods.immersiveengineering.arc_furnace.recipeBuilder().ores().energyPerTick(256)
        }

        AlloyHelperBuilder input(IIngredient... items) {
            this.kilnBuilder.input(items)
            this.arcBuilder.input(items)
            return this
        }

        AlloyHelperBuilder name(String name) {
            return this
        }

        AlloyHelperBuilder time(int ticks) {
            this.kilnBuilder.time(ticks)
            this.arcBuilder.time((int)(ticks / 2))
            return this
        }

        AlloyHelperBuilder power(int power) {
            this.arcBuilder.energyPerTick(power)
            return this
        }

        AlloyHelperBuilder output(ItemStack... items) {
            this.kilnBuilder.output(items)
            this.arcBuilder.output(items)
            return this
        }

        void register() {
            this.kilnBuilder.register()
            this.arcBuilder.register()
        }
    }
}
