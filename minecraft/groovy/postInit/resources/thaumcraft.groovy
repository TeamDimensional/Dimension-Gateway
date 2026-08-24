import classes.CrushingHelper

// Salis Mundus
crafting.removeByOutput(item("thaumcraft:salis_mundus"))
mods.jei.description.remove(item("thaumcraft:salis_mundus"))
mods.roots.fey_crafter.recipeBuilder()
    .name("tier4/salis_mundus")
    .input(item("minecraft:redstone"), item("minecraft:glowstone_dust"), item("gateway:moonlight_powder"), item("actuallyadditions:item_dust", 7), item("roots:runic_dust"))
    .output(item("thaumcraft:salis_mundus") * 4)
    .xp(20)
    .register()

CrushingHelper.builder()
    .input(item("theaurorian:moongem"))
    .output(item("gateway:moonlight_powder") * 2)
    .register()

// Crystal Cluster
mods.thaumcraft.crucible.removeByOutput(item("kamitesque:crystal_cluster"))
mods.thaumcraft.crucible.removeByOutput(item("kamitesque:pure_shard"))
mods.essentialcraft.radiating_chamber.recipeBuilder()
    .input(item("thaumicaugmentation:strange_crystal"), item("essentialcraft:genitem", 48))
    .output(item("kamitesque:crystal_cluster"))
    .time(80)
    .mruPerTick(12.0f)
    .register()

// Pure Shard
furnace.removeByInput(item("kamitesque:crystal_cluster"))
furnace.removeByOutput(item("kamitesque:pure_shard"))
mods.thaumcraft.smelting_bonus.removeByOutput(item("kamitesque:pure_shard"))
furnace.add(item("kamitesque:crystal_cluster"), item("ee:star_shard") * 8)
mods.thaumcraft.smelting_bonus.recipeBuilder()
    .input(item("kamitesque:crystal_cluster"))
    .output(item("kamitesque:pure_shard"))
    .chance(1.0F)
    .register()

mods.advancedrocketry.crystallizer.recipeBuilder()
    .input(item("thaumicaugmentation:strange_crystal"), item("ee:star_shard") * 4, item("astralsorcery:itemcraftingcomponent", 4))
    .output(item("thaumicaugmentation:strange_crystal") * 2)
    .power(400)
    .time(160)
    .register()
