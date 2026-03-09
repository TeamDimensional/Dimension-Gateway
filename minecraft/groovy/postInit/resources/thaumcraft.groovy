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
    .output(item("gateway:moonlight_powder"))
    .register()
