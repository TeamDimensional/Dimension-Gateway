#reloadable

import mods.modularmachinery.RecipeBuilder;

RecipeBuilder.newBuilder("cerulean", "moonlight_fabricator", 100)
    .addItemInput(<roots:moonglow_leaf>)
    .addItemInput(<thermalfoundation:material:132>)
    .addAuraInput("other", 200)
    .addItemOutput(<theaurorian:ceruleaningot>)
    .build();

RecipeBuilder.newBuilder("moonstone", "moonlight_fabricator", 100)
    .addItemInput(<roots:moonglow_leaf> * 2)
    .addItemInput(<thermalfoundation:material:131>)
    .addAuraInput("other", 200)
    .addItemOutput(<theaurorian:moonstoneingot>)
    .build();

RecipeBuilder.newBuilder("crystal", "moonlight_fabricator", 100)
    .addItemInput(<roots:moonglow_leaf> * 2)
    .addItemInput(<actuallyadditions:item_crystal:1>)
    .addAuraInput("other", 200)
    .addItemOutput(<theaurorian:crystal>)
    .build();

RecipeBuilder.newBuilder("aurorianite", "moonlight_fabricator", 200)
    .addItemInput(<prodigytech:emerald_dust>)
    .addItemInput(<theaurorian:moonstoneingot>)
    .addItemInput(<theaurorian:aurorianiteingot>).setChance(0)
    .addAuraInput("other", 500)
    .addItemOutput(<theaurorian:aurorianiteingot>)
    .build();

RecipeBuilder.newBuilder("umbra", "moonlight_fabricator", 200)
    .addItemInput(<nuclearcraft:gem_dust>)
    .addItemInput(<theaurorian:ceruleaningot>)
    .addItemInput(<theaurorian:umbraingot>).setChance(0)
    .addAuraInput("other", 500)
    .addItemOutput(<theaurorian:umbraingot>)
    .build();

RecipeBuilder.newBuilder("crystalline", "moonlight_fabricator", 200)
    .addItemInput(<theaurorian:crystal>)
    .addItemInput(<embers:ingot_dawnstone>)
    .addItemInput(<theaurorian:crystallineingot>).setChance(0)
    .addAuraInput("other", 500)
    .addItemOutput(<theaurorian:crystallineingot>)
    .build();

RecipeBuilder.newBuilder("moongem", "moonlight_fabricator", 400)
    .addItemInput(<essentialcraft:compressed:4>)
    .addItemInput(<tconstruct:clear_stained_glass:10>)
    .addItemInput(<theaurorian:moongem>).setChance(0)
    .addAuraInput("other", 2000)
    .addItemOutput(<theaurorian:moongem> * 2)
    .build();
