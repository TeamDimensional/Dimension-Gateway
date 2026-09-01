package classes

import com.cleanroommc.groovyscript.api.IIngredient

class AlloyHelper {
    static void run() {}

    public static AlloyHelperBuilder builder() {
        return new AlloyHelperBuilder()
    }

    static class AlloyHelperBuilder {
        // Kiln: default time 10 seconds
        // Arc: default time 5 seconds, energy 256 RF/t
        // Induction: default energy 4000 RF (consumption 600 RF/t max at x1.9 energy -> 13 ticks per recipe @ 600 RF/t)
        // NC: default time 20 seconds, 30 RF/t (max speed multiplier: 65 -> 7 ticks per recipe @ 2100 RF/t)
        // AR: default time 4 seconds, x4 parallel (speed x2.33 with Titanium coils -> 9 ticks per recipe @ 128 RF/t, x8 with Iridium coils -> 2.5 ticks @ 128 RF/t)
        // EIO: default cost 3600 RF / 6 seconds at Basic+Basic, speed multiplier x18 with Melodic+Enhanced -> 7 ticks @ 360 RF/t

        def kilnBuilder = null
        def ieArcBuilder = null
        def inductionBuilder = null
        def eioBuilder = null
        def arArcBuilder = null
        def ncBuilder = null

        def inputCount = 0
        def minTier = 0
        def maxTier = 5

        AlloyHelperBuilder() {
            this.kilnBuilder = mods.immersiveengineering.alloy_kiln.recipeBuilder()
            this.ieArcBuilder = mods.immersiveengineering.arc_furnace.recipeBuilder().ores().energyPerTick(256)
            this.eioBuilder = mods.enderio.alloy_smelter.recipeBuilder()
            this.inductionBuilder = mods.thermalexpansion.smelter.recipeBuilder()
            this.arArcBuilder = mods.advancedrocketry.electric_arc_furnace.recipeBuilder().power(128)
            this.ncBuilder = mods.nuclearcraft.alloy_furnace.builder().powerMultiplier(3)
            timeMultiplier(1.0)
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
            for (def it in items) this.arArcBuilder.input(it * (it.getAmount() * 4))
            this.ncBuilder.input(items)
            return this
        }

        AlloyHelperBuilder timeMultiplier(double multiplier) {
            this.kilnBuilder.time((int) (multiplier * 200))
            this.ieArcBuilder.time((int) (multiplier * 100))
            this.eioBuilder.energy((int) (multiplier * 3600))
            this.inductionBuilder.energy((int) (multiplier * 4000))
            this.arArcBuilder.time((int) (multiplier * 80))
            this.ncBuilder.timeMultiplier(multiplier)
            return this
        }

        AlloyHelperBuilder output(ItemStack... items) {
            this.kilnBuilder.output(items)
            this.ieArcBuilder.output(items)
            this.eioBuilder.output(items)
            this.inductionBuilder.output(items)
            for (def it in items) this.arArcBuilder.output(it * (it.getAmount() * 4))
            this.ncBuilder.output(items)
            return this
        }

        void register() {
            if (this.minTier <= 0 && this.maxTier >= 0 && this.inputCount <= 2)
                this.kilnBuilder.register()
            if (this.minTier <= 1 && this.maxTier >= 1 && this.inputCount <= 5)
                this.ieArcBuilder.register()
            if (this.minTier <= 2 && this.maxTier >= 2 && this.inputCount <= 2)
                this.inductionBuilder.register()
            if (this.minTier <= 3 && this.maxTier >= 3 && this.inputCount <= 2)
                this.ncBuilder.register()

            if (this.minTier <= 4 && this.maxTier >= 4)
                this.arArcBuilder.register()
            if (this.minTier <= 5 && this.maxTier >= 5 && this.inputCount <= 3)
                this.eioBuilder.register()
        }
    }
}
