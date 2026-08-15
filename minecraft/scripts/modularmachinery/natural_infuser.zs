#reloadable

import mods.modularmachinery.RecipeBuilder;

RecipeBuilder.newBuilder("skyroot", "natural_infuser", 480)
    .addItemInput(<minecraft:sapling:2>)
    .addFluidInput(<fluid:aetherworks.aetherium_gas> * 1600)
    .addItemOutput(<aether_legacy:skyroot_sapling>)
    .addEnergyPerTickInput(20)
    .build();

RecipeBuilder.newBuilder("disturbed_cotton", "natural_infuser", 25)
    .addItemInput(<witchery:wispy_cotton>)
    .addFluidInput(<fluid:nightmare_depleted_fuel> * 8)
    .addItemOutput(<witchery:disturbed_cotton>)
    .addEnergyPerTickInput(20)
    .build();
