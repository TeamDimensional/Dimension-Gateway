package classes

import com.cleanroommc.groovyscript.api.IIngredient
import net.minecraftforge.fluids.FluidStack

class MachineHelper {
    static void run() {}

    public static AlloyBuilder alloy() {
        return new AlloyBuilder()
    }

    public static CrusherBuilder crushing() {
        return new CrusherBuilder()
    }

    public static CrystallizerBuilder crystallization() {
        return new CrystallizerBuilder()
    }

    public static MeltingBuilder melting() {
        return new MeltingBuilder()
    }

    static class AlloyBuilder {
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

        AlloyBuilder() {
            this.kilnBuilder = mods.immersiveengineering.alloy_kiln.recipeBuilder()
            this.ieArcBuilder = mods.immersiveengineering.arc_furnace.recipeBuilder().ores().energyPerTick(256)
            this.eioBuilder = mods.enderio.alloy_smelter.recipeBuilder()
            this.inductionBuilder = mods.thermalexpansion.smelter.recipeBuilder()
            this.arArcBuilder = mods.advancedrocketry.electric_arc_furnace.recipeBuilder().power(128)
            this.ncBuilder = mods.nuclearcraft.alloy_furnace.builder().powerMultiplier(3)
            timeMultiplier(1.0)
        }

        AlloyBuilder minTier(int minTier) {
            this.minTier = minTier
            return this
        }

        AlloyBuilder maxTier(int maxTier) {
            this.maxTier = maxTier
            return this
        }

        AlloyBuilder input(IIngredient... items) {
            inputCount += items.length
            this.kilnBuilder.input(items)
            this.ieArcBuilder.input(items)
            this.inductionBuilder.input(items)
            this.eioBuilder.input(items)
            for (def it in items) this.arArcBuilder.input(it * (it.getAmount() * 4))
            this.ncBuilder.input(items)
            return this
        }

        AlloyBuilder timeMultiplier(double multiplier) {
            this.kilnBuilder.time((int) (multiplier * 200))
            this.ieArcBuilder.time((int) (multiplier * 100))
            this.eioBuilder.energy((int) (multiplier * 3600))
            this.inductionBuilder.energy((int) (multiplier * 4000))
            this.arArcBuilder.time((int) (multiplier * 80))
            this.ncBuilder.timeMultiplier(multiplier)
            return this
        }

        AlloyBuilder output(ItemStack... items) {
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

    static class CrusherBuilder {
        def rotaryGrinderBuilder = null
        def hasChancedOutput = false
        
        def factoryTechBuilder = null
        def immersiveBuilder = null
        def aaBuilder = null

        CrusherBuilder() {
            this.immersiveBuilder = mods.immersiveengineering.crusher.recipeBuilder()
            this.factoryTechBuilder = mods.factorytech.ore_drill.recipeBuilder()
            this.aaBuilder = mods.actuallyadditions.crusher.recipeBuilder()
            this.rotaryGrinderBuilder = mods.prodigytech.rotary_grinder.recipeBuilder()
        }

        CrusherBuilder input(IIngredient item) {
            this.immersiveBuilder.input(item)
            this.factoryTechBuilder.input(item)
            this.aaBuilder.input(item)
            this.rotaryGrinderBuilder.input(item)
            return this
        }

        CrusherBuilder output(ItemStack item) {
            this.immersiveBuilder.output(item)
            this.factoryTechBuilder.output(item)
            this.aaBuilder.output(item)
            this.rotaryGrinderBuilder.output(item)
            return this
        }

        CrusherBuilder chancedOutput(ItemStack item, float chance) {
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

    static class CrystallizerBuilder {
        // NC: default time 80 seconds, 10 RF/t (max speed multiplier: 65 -> 25 ticks per recipe @ 700 RF/t)
        // AR: default time 4 seconds, x4 parallel, 128 RF/t, has no upgrades

        def ncBuilder = null
        def arBuilder = null

        CrystallizerBuilder() {
            this.ncBuilder = mods.nuclearcraft.crystallizer.builder()
            this.arBuilder = mods.advancedrocketry.crystallizer.recipeBuilder().time(80).power(128)
        }

        CrystallizerBuilder fluidInput(IIngredient item) {
            this.ncBuilder.fluidInput(item)
            this.arBuilder.fluidInput(item * (item.getAmount() * 4))
            return this
        }

        CrystallizerBuilder output(ItemStack item) {
            this.ncBuilder.output(item)
            this.arBuilder.output(item * (item.getAmount() * 4))
            return this
        }

        void register() {
            this.ncBuilder.register()
            this.arBuilder.register()
        }
    }

    static class MeltingBuilder {
        // Embers melter: 40 ticks without upgrades, 10 ticks with upgrades
        // FT Crucible: 15 ticks with max upgrades
        // Magma Crucible: default energy 8000 RF (consumption 1200 RF/t max at x1.9 energy -> 13 ticks per recipe @ 1200 RF/t)
        // NC: default time 40 seconds, 40 RF/t (max speed multiplier: 65 -> 14 ticks per recipe @ 2800 RF/t)

        def tconstructBuilders = null
        def embersBuilder = null
        def ftBuilder = null
        def thermalBuilder = null
        def ncBuilder = null

        def minTier = 0
        def maxTier = 3
        def timeMultiplier = 1.0

        MeltingBuilder() {
            this.tconstructBuilders = []
            this.embersBuilder = mods.embers.melter.recipeBuilder()
            this.ftBuilder = mods.factorytech.crucible.recipeBuilder()
            this.thermalBuilder = mods.thermalexpansion.crucible.recipeBuilder().energy(8000)
            this.ncBuilder = mods.nuclearcraft.melter.builder()
        }

        MeltingBuilder minTier(int minTier) {
            this.minTier = minTier
            return this
        }

        MeltingBuilder maxTier(int maxTier) {
            this.maxTier = maxTier
            return this
        }

        MeltingBuilder timeMultiplier(double multiplier) {
            this.timeMultiplier = multiplier
            this.thermalBuilder.energy((int) (8000 * multiplier))
            this.ncBuilder.timeMultiplier(multiplier)
            return this
        }

        MeltingBuilder input(IIngredient it) {
            for (def inputItem in it.getMatchingStacks()) {
                def builder = mods.tconstruct.melting.recipeBuilder()
                builder.input(inputItem)
                this.tconstructBuilders.add(builder)
            }
            this.embersBuilder.input(it)
            this.ftBuilder.input(it)
            this.thermalBuilder.input(it)
            this.ncBuilder.input(it)
            return this
        }

        MeltingBuilder fluidOutput(FluidStack it) {
            for (def builder in this.tconstructBuilders) {
                builder.fluidOutput(it)
                builder.temperature((int) ((it.getAmount() / 1296.0) ** 0.31546487678 * (it.fluid.temperature - 300)) + 300)
            }
            this.embersBuilder.fluidOutput(it)
            this.ftBuilder.fluidOutput(it)
            this.thermalBuilder.fluidOutput(it)
            this.ncBuilder.fluidOutput(it)
            return this
        }

        MeltingBuilder byproduct(FluidStack it) {
            this.embersBuilder.fluidOutput(it)
            return this
        }

        void register() {
            if (this.minTier <= 0 && this.maxTier >= 0)
                for (def builder in this.tconstructBuilders)
                    builder.register()
            if (this.minTier <= 1 && this.maxTier >= 1 && this.timeMultiplier <= 2)
                this.embersBuilder.register()
            if (this.minTier <= 2 && this.maxTier >= 2 && this.timeMultiplier <= 2)
                this.ftBuilder.register()
            if (this.minTier <= 2 && this.maxTier >= 2)
                this.thermalBuilder.register()
            if (this.minTier <= 3 && this.maxTier >= 3)
                this.ncBuilder.register()
        }
    }
}
