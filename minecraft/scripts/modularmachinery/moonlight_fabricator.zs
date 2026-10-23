#reloadable

import mods.modularmachinery.RecipeBuilder;

RecipeBuilder.newBuilder("cerulean", "moonlight_fabricator", 100)
    .addItemInput(<roots:moonglow_leaf>)
    .addItemInput(<thermalfoundation:material:132>)
    .addAuraInput("other", 2000)
    .addItemOutput(<theaurorian:ceruleaningot>)
    .build();

RecipeBuilder.newBuilder("moonstone", "moonlight_fabricator", 100)
    .addItemInput(<roots:moonglow_leaf> * 2)
    .addItemInput(<thermalfoundation:material:130>)
    .addAuraInput("other", 2000)
    .addItemOutput(<theaurorian:moonstoneingot>)
    .build();

RecipeBuilder.newBuilder("crystal", "moonlight_fabricator", 100)
    .addItemInput(<roots:moonglow_leaf> * 2)
    .addItemInput(<actuallyadditions:item_crystal:1>)
    .addAuraInput("other", 2000)
    .addItemOutput(<theaurorian:crystal>)
    .build();

RecipeBuilder.newBuilder("aurorianite", "moonlight_fabricator", 200)
    .addItemInput(<theaurorian:aurorianiteingot>).setChance(0)
    .addItemInput(<prodigytech:emerald_dust>)
    .addItemInput(<theaurorian:moonstoneingot>)
    .addAuraInput("other", 5000)
    .addItemOutput(<theaurorian:aurorianiteingot>)
    .build();

RecipeBuilder.newBuilder("umbra", "moonlight_fabricator", 200)
    .addItemInput(<theaurorian:umbraingot>).setChance(0)
    .addItemInput(<nuclearcraft:gem_dust>)
    .addItemInput(<theaurorian:ceruleaningot>)
    .addAuraInput("other", 5000)
    .addItemOutput(<theaurorian:umbraingot>)
    .build();

RecipeBuilder.newBuilder("crystalline", "moonlight_fabricator", 200)
    .addItemInput(<theaurorian:crystallineingot>).setChance(0)
    .addItemInput(<theaurorian:crystal>)
    .addItemInput(<embers:ingot_dawnstone>)
    .addAuraInput("other", 5000)
    .addItemOutput(<theaurorian:crystallineingot>)
    .build();

RecipeBuilder.newBuilder("moongem", "moonlight_fabricator", 400)
    .addItemInput(<theaurorian:moongem>).setChance(0)
    .addItemInput(<essentialcraft:compressed:4>)
    .addItemInput(<tconstruct:clear_stained_glass:10>)
    .addAuraInput("other", 20000)
    .addItemOutput(<theaurorian:moongem> * 2)
    .build();

RecipeBuilder.newBuilder("moonstone_xu2", "moonlight_fabricator", 400)
    .addItemInput(<extrautils2:ingredients:5>).setChance(0)
    .addItemInput(<ore:ingotUnstable>)
    .addItemInput(<thaumcraft:quicksilver>)
    .addItemInput(<extrautils2:ingredients:3>)
    .addItemInput(<roots:moonglow_leaf>)
    .addAuraInput("end", 20000)
    .addItemOutput(<extrautils2:ingredients:5> * 2)
    .build();
