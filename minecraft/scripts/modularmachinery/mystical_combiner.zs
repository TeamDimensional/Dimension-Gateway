#reloadable

import mods.modularmachinery.RecipeBuilder;

RecipeBuilder.newBuilder("clump", "mystical_combiner", 400)
    .addItemInput(<item:tconstruct:ingots:3>)
    .addItemInput(<item:tconstruct:ingots:2>)
    .addItemInput(<item:extrautils2:ingredients:12>)
    .addItemInput(<item:netherized:netherite_ingot>)
    .addItemInput(<item:factorytech:ingot:6>)
    .addItemInput(<item:factorytech:ingot:7>)
    .addItemInput(<item:soot:ingot_antimony>)
    .addItemInput(<item:aetherworks:item_resource:4>)
    .addItemInput(<item:woot:stygianironingot>)
    .addItemInput(<item:witchery:koboldite_ingot>)
    .addItemInput(<item:abyssalcraft:cingot>)
    .addItemInput(<item:botania:manaresource:7>)
    .addItemInput(<item:kami:ichorium_ingot>)
    .addItemInput(<item:gateway:transcendental_matrix>)
    .addItemInput(<item:enderio:item_alloy_endergy_ingot:1>)
    .addItemInput(<item:enderio:item_alloy_endergy_ingot:3>)
    .addFluidInput(<fluid:mana> * 2000)
    .addEnergyPerTickInput(20000)
    .addFluxInput(40)
    .addVisInput(40)
    .addPotentialEnergyInput(500)
    .addItemOutput(<item:gateway:mystical_metal_clump>)
    .build();