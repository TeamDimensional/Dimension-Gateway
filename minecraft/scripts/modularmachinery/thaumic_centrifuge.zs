#reloadable

import mods.modularmachinery.RecipeBuilder;

RecipeBuilder.newBuilder("aer", "thaumic_centrifuge", 200)
    .addFluidInput(<fluid:aerotheum> * 50)
    .addAspectOutput("aer", 16)
    .addAspectOutput("motus", 16)
    .addAspectOutput("volatus", 16)
    .addAspectOutput("spiritus", 16)
    .addAspectOutput("sensus", 16)
    .addAspectOutput("permutatio", 16)
    .addManaInput(10000, false)
    .build();

RecipeBuilder.newBuilder("aer2", "thaumic_centrifuge", 100)
    .addFluidInput(<fluid:tritium> * 50)
    .addAspectOutput("aer", 64)
    .addAspectOutput("motus", 64)
    .addAspectOutput("volatus", 64)
    .addAspectOutput("spiritus", 64)
    .addAspectOutput("sensus", 64)
    .addAspectOutput("permutatio", 64)
    .addManaInput(4000, false)
    .build();

RecipeBuilder.newBuilder("ignis", "thaumic_centrifuge", 200)
    .addFluidInput(<fluid:pyrotheum> * 50)
    .addAspectOutput("ignis", 16)
    .addAspectOutput("potentia", 16)
    .addAspectOutput("lux", 16)
    .addAspectOutput("aversio", 16)
    .addAspectOutput("cognitio", 16)
    .addAspectOutput("desiderium", 16)
    .addManaInput(10000, false)
    .build();

RecipeBuilder.newBuilder("ignis2", "thaumic_centrifuge", 100)
    .addFluidInput(<fluid:hydrogen_hot> * 50)
    .addAspectOutput("ignis", 64)
    .addAspectOutput("potentia", 64)
    .addAspectOutput("lux", 64)
    .addAspectOutput("aversio", 64)
    .addAspectOutput("cognitio", 64)
    .addAspectOutput("desiderium", 64)
    .addManaInput(4000, false)
    .build();

RecipeBuilder.newBuilder("aqua", "thaumic_centrifuge", 200)
    .addFluidInput(<fluid:cryotheum> * 50)
    .addAspectOutput("aqua", 16)
    .addAspectOutput("gelum", 16)
    .addAspectOutput("bestia", 16)
    .addAspectOutput("humanus", 16)
    .addAspectOutput("alkimia", 16)
    .addAspectOutput("victus", 16)
    .addManaInput(10000, false)
    .build();

RecipeBuilder.newBuilder("aqua2", "thaumic_centrifuge", 100)
    .addFluidInput(<fluid:heavy_water> * 50)
    .addAspectOutput("aqua", 64)
    .addAspectOutput("gelum", 64)
    .addAspectOutput("bestia", 64)
    .addAspectOutput("humanus", 64)
    .addAspectOutput("alkimia", 64)
    .addAspectOutput("victus", 64)
    .addManaInput(4000, false)
    .build();

RecipeBuilder.newBuilder("terra", "thaumic_centrifuge", 200)
    .addFluidInput(<fluid:petrotheum> * 50)
    .addAspectOutput("terra", 16)
    .addAspectOutput("herba", 16)
    .addAspectOutput("vinculum", 16)
    .addAspectOutput("praemunio", 16)
    .addAspectOutput("vitreus", 16)
    .addAspectOutput("metallum", 16)
    .addAspectOutput("instrumentum", 16)
    .addManaInput(10000, false)
    .build();

RecipeBuilder.newBuilder("terra2", "thaumic_centrifuge", 100)
    .addFluidInput(<fluid:americium_243> * 50)
    .addAspectOutput("terra", 64)
    .addAspectOutput("herba", 64)
    .addAspectOutput("vinculum", 64)
    .addAspectOutput("praemunio", 64)
    .addAspectOutput("vitreus", 64)
    .addAspectOutput("metallum", 64)
    .addAspectOutput("instrumentum", 64)
    .addManaInput(4000, false)
    .build();

RecipeBuilder.newBuilder("ordo", "thaumic_centrifuge", 200)
    .addFluidInput(<fluid:purifying_fluid> * 50)
    .addAspectOutput("ordo", 16)
    .addAspectOutput("auram", 16)
    .addAspectOutput("praecantatio", 16)
    .addAspectOutput("fabrico", 16)
    .addAspectOutput("machina", 16)
    .addAspectOutput("alienis", 16)
    .addManaInput(10000, false)
    .build();

RecipeBuilder.newBuilder("ordo2", "thaumic_centrifuge", 100)
    .addFluidInput(<fluid:neon> * 50)
    .addAspectOutput("ordo", 64)
    .addAspectOutput("auram", 64)
    .addAspectOutput("praecantatio", 64)
    .addAspectOutput("fabrico", 64)
    .addAspectOutput("machina", 64)
    .addAspectOutput("alienis", 64)
    .addManaInput(4000, false)
    .build();

RecipeBuilder.newBuilder("perditio", "thaumic_centrifuge", 200)
    .addFluidInput(<fluid:liquid_death> * 50)
    .addAspectOutput("perditio", 16)
    .addAspectOutput("tenebrae", 16)
    .addAspectOutput("exanimis", 16)
    .addAspectOutput("mortuus", 16)
    .addAspectOutput("vitium", 16)
    .addAspectOutput("vacuos", 16)
    .addManaInput(10000, false)
    .build();

RecipeBuilder.newBuilder("perditio2", "thaumic_centrifuge", 100)
    .addFluidInput(<fluid:bare_acid> * 50)
    .addAspectOutput("perditio", 64)
    .addAspectOutput("tenebrae", 64)
    .addAspectOutput("exanimis", 64)
    .addAspectOutput("mortuus", 64)
    .addAspectOutput("vitium", 64)
    .addAspectOutput("vacuos", 64)
    .addManaInput(4000, false)
    .build();
