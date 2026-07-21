package classes

import com.cleanroommc.groovyscript.api.IIngredient

class FuelReprocessing {
    static void run() {}

    public static FuelReprocessingBuilder builder() {
        return new FuelReprocessingBuilder()
    }

    static class FuelReprocessingBuilder {
        def centrifugeBuilder = null
        def reprocessorBuilder = null
        def carbideReprocessorBuilder = null

        FuelReprocessingBuilder() {
            this.centrifugeBuilder = mods.nuclearcraft.centrifuge.builder()
            this.reprocessorBuilder = mods.nuclearcraft.fuel_reprocessor.builder()
            this.carbideReprocessorBuilder = mods.nuclearcraft.fuel_reprocessor.builder()
            this.carbideReprocessorBuilder.output(item("nuclearcraft:alloy", 13), item("nuclearcraft:dust", 8) * 4)
        }

        FuelReprocessingBuilder input(String name, int count) {
            this.centrifugeBuilder.fluidInput(fluid("${name}_depleted_fuel") * (16 * count))
            this.reprocessorBuilder.input(item("gateway:${name}_depleted_fuel_ox") * count)
            this.carbideReprocessorBuilder.input(item("gateway:${name}_depleted_fuel_triso") * count)
            return this
        }

        FuelReprocessingBuilder name(String name) {
            return this
        }

        FuelReprocessingBuilder output(String material, int isotopeIdx, int isotope, int count) {
            this.reprocessorBuilder.output(item("nuclearcraft:${material}", isotopeIdx + 2) * count)
            this.carbideReprocessorBuilder.output(item("nuclearcraft:${material}", isotopeIdx + 1) * count)
            this.centrifugeBuilder.fluidOutput(fluid("${material}_${isotope}") * (16 * count))
            return this
        }

        void register() {
            this.centrifugeBuilder.register()
            this.reprocessorBuilder.register()
            this.carbideReprocessorBuilder.register()
        }
    }
}
