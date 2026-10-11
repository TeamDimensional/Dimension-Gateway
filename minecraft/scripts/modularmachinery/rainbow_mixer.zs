#reloadable

import mods.modularmachinery.RecipeBuilder;
import crafttweaker.liquid.ILiquidStack;

static blueInputs as ILiquidStack[] = [
    <fluid:lapis_nak_hot>,
    <fluid:manganese_nak_hot>,
    <fluid:diamond_nak_hot>,
    <fluid:cryotheum_nak_hot>,
];

static redInputs as ILiquidStack[] = [
    <fluid:iron_nak_hot>,
    <fluid:redstone_nak_hot>,
    <fluid:villiaumite_nak_hot>,
    <fluid:liquid_helium_nak_hot>,
];

static greenInputs as ILiquidStack[] = [
    <fluid:slime_nak_hot>,
    <fluid:fluorite_nak_hot>,
    <fluid:emerald_nak_hot>,
    <fluid:liquid_nitrogen_nak_hot>,
];

static controllerPositions as int[string][] = [
    {x: 0, y: 4, z: 1},
    {x: 0, y: 4, z: 2},
    {x: 0, y: 4, z: 3},
    {x: -1, y: 4, z: 1},
    {x: -1, y: 4, z: 3},
    {x: -2, y: 4, z: 1},
    {x: -2, y: 4, z: 3},
    {x: 1, y: 4, z: 1},
    {x: 1, y: 4, z: 3},
    {x: 2, y: 4, z: 1},
    {x: 2, y: 4, z: 3},
];

for red, redInput in redInputs {
    for green, greenInput in greenInputs {
        for blue, blueInput in blueInputs {
            val boost = red + green + blue;
            val builder = RecipeBuilder.newBuilder("rainbow_stone_" + red + "_" + green + "_" + blue, "rainbow_mixer", 200)
                .addFluidInput(redInput * 50).addFluidInput(greenInput * 50).addFluidInput(blueInput * 50)
                .addItemInput(<item:abyssalcraft:monolithstone>)
                .addEnergyPerTickInput(10000)
                .addItemOutput(<item:extrautils2:decorativesolid:8> * (1 + boost));
            if boost > 0 {
                builder.addRadiationInput(2, 1);
            }
            builder.build();
        }
    }
}
