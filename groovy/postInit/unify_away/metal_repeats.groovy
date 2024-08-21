import classes.GatewayHelpers

def duplicateRecipes = [
    // Vanilla not using oredict
    "minecraft:coal",
    "minecraft:diamond",
    "minecraft:emerald",
    "minecraft:gold_ingot_from_block",
    "minecraft:iron_ingot_from_block",
    "minecraft:lapis_lazuli",
    "minecraft:redstone",
    // Chisel
    "chisel:uncraft_blockaluminum",
    "chisel:charcoal_uncraft",
    "chisel:uncraft_blockcobalt",
    "chisel:uncraft_blockfuelcoke",
    "chisel:uncraft_blockcopper",
    "chisel:uncraft_blockelectrum",
    "chisel:uncraft_blockinvar",
    "chisel:uncraft_blocknickel",
    "chisel:uncraft_blockplatinum",
    "chisel:uncraft_blocksilver",
    "chisel:uncraft_blocksteel",
    "chisel:uncraft_blocktin",
    // ActAdd
    "actuallyadditions:recipes122",
    // Nuclearcraft
    "nuclearcraft:material",
    "nuclearcraft:material_1",
    "nuclearcraft:material_3",
    "nuclearcraft:storage_1",
    "nuclearcraft:ingot_1",
    // Immersive Engineering
    "immersiveengineering:stone_decoration/cokeblock_uncraft",
    // Translocators
    "translocators:diamond_nugget",
    "translocators:diamond_nugget_un",
    // Thaumcraft
    "thaumcraft:ironnuggetconvert",
    "thaumcraft:coppertonuggets",
    "thaumcraft:coppernuggetstoingot",
    "thaumcraft:tintonuggets",
    "thaumcraft:tinnuggetstoingot",
    "thaumcraft:silvertonuggets",
    "thaumcraft:silvernuggetstoingot",
    "thaumcraft:leadtonuggets",
    "thaumcraft:leadnuggetstoingot",
]

ore("blockCoalCoke").add(item("immersiveengineering:stone_decoration", 3))
for (def it in duplicateRecipes) crafting.remove(it)
crafting.shapelessBuilder()
        .name("unify/coal_coke_from_block")
        .output(item("immersiveengineering:material", 6) * 9)
        .input(ore("blockCoalCoke"))
        .register()
crafting.shapelessBuilder()
        .name("unify/lapis_from_block")
        .output(item("minecraft:dye", 4) * 9)
        .input(ore("blockLapis"))
        .register()

ore("nuggetDiamond").remove(item("translocators:diamond_nugget"))
ore("nuggetIron").remove(item("thaumcraft:nugget"))
ore("nuggetCopper").remove(item("thaumcraft:nugget", 1))
ore("nuggetTin").remove(item("thaumcraft:nugget", 2))
ore("nuggetSilver").remove(item("thaumcraft:nugget", 3))
ore("nuggetLead").remove(item("thaumcraft:nugget", 4))
ore("ingotCopper").remove(item("abyssalcraft:copperingot"))
ore("ingotTin").remove(item("abyssalcraft:tiningot"))
ore("ingotCopper").remove(item("projectred-core:resource_item", 100))
ore("ingotTin").remove(item("projectred-core:resource_item", 101))
ore("ingotSilver").remove(item("projectred-core:resource_item", 102))
GatewayHelpers.hide(item("translocators:diamond_nugget"))
GatewayHelpers.hide(item("abyssalcraft:copperingot"))
GatewayHelpers.hide(item("abyssalcraft:tiningot"))
for (int i in 0..4) GatewayHelpers.hide(item("thaumcraft:nugget", i))
for (int i in 0..5) GatewayHelpers.hide(item("thaumcraft:chunk", i))
for (int i in 100..102) GatewayHelpers.hide(item("projectred-core:resource_item", i))
