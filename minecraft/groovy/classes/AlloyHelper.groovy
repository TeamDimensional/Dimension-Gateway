package classes

import com.cleanroommc.groovyscript.api.IIngredient

class AlloyHelper {
    static void run() {}

    public static AlloyHelperBuilder builder() {
        return new AlloyHelperBuilder()
    }

    static class AlloyHelperBuilder {
        def kilnBuilder = null
        def ieArcBuilder = null
        def inductionBuilder = null
        def eioBuilder = null
        def arArcBuilder = null

        def inputCount = 0
        def minTier = 0
        def maxTier = 4

        AlloyHelperBuilder() {
            this.kilnBuilder = mods.immersiveengineering.alloy_kiln.recipeBuilder()
            this.ieArcBuilder = mods.immersiveengineering.arc_furnace.recipeBuilder().ores().energyPerTick(128)
            this.eioBuilder = mods.enderio.alloy_smelter.recipeBuilder()
            this.inductionBuilder = mods.thermalexpansion.smelter.recipeBuilder()
            this.arArcBuilder = mods.advancedrocketry.electric_arc_furnace.recipeBuilder().power(100)
        }

        AlloyHelperBuilder minTier(int minTier) {
            this.minTier = minTier
            return this
        }

        AlloyHelperBuilder maxTier(int maxTier) {
            this.maxTier = maxTier
            return this
        }

        AlloyHelperBuilder input(IIngredient... items) {
            inputCount += items.length
            this.kilnBuilder.input(items)
            this.ieArcBuilder.input(items)
            this.inductionBuilder.input(items)
            this.eioBuilder.input(items)
            this.arArcBuilder.input(items)
            return this
        }

        AlloyHelperBuilder name(String name) {
            return this
        }

        AlloyHelperBuilder time(int ticks) {
            this.kilnBuilder.time(ticks)
            this.ieArcBuilder.time((int)(ticks * 0.75))
            this.eioBuilder.energy(128 * ticks)
            this.inductionBuilder.energy(64 * ticks)
            this.arArcBuilder.time(ticks)
            return this
        }

        AlloyHelperBuilder output(ItemStack... items) {
            this.kilnBuilder.output(items)
            this.ieArcBuilder.output(items)
            this.eioBuilder.output(items)
            this.inductionBuilder.output(items)
            this.arArcBuilder.output(items)
            return this
        }

        void register() {
            if (this.minTier <= 0 && this.maxTier >= 0 && this.inputCount <= 2)
                this.kilnBuilder.register()
            if (this.minTier <= 1 && this.maxTier >= 1 && this.inputCount <= 5)
                this.ieArcBuilder.register()
            if (this.minTier <= 2 && this.maxTier >= 2 && this.inputCount <= 2)
                this.inductionBuilder.register()
            if (this.minTier <= 3 && this.maxTier >= 3)
                this.arArcBuilder.register()
            if (this.minTier <= 4 && this.maxTier >= 4 && this.inputCount <= 3)
                this.eioBuilder.register()
        }
    }
}
