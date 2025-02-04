// Unlock piston in tier 2 to allow using it for piston crafts
crafting.shapedBuilder()
        .name("tier2/aurorian_piston")
        .output(item("minecraft:piston"))
        .matrix("PPP", "SCS", "ScS")
        .key("P", item("theaurorian:silentwoodplanks")).key("C", ore("ingotCerulean")).key("S", item("theaurorian:auroriancobblestone"))
        .key("c", item("theaurorian:crystal"))
        .register()

// Gold Fiber
crafting.remove("naturesaura:gold_fiber")
// TODO: wait until Aurorian integration is available to add this recipe.

// Bottle and cork
crafting.remove("naturesaura:bottle_two_the_rebottling")
crafting.shapelessBuilder()
        .name("tier2/nature_bottle")
        .output(item("naturesaura:bottle_two_the_rebottling"))
        .input(item("minecraft:glass_bottle"), item("naturesaura:ancient_planks"))
        .register()

// Environmental Eye (required Gold)
mods.naturesaura.ritual.removeByOutput(item("naturesaura:eye"))
mods.naturesaura.ritual.recipeBuilder()
    .name("tier2/env_eye")
    .input(item("minecraft:spider_eye"), ore("ingotCopper"), item("naturesaura:gold_leaf"), item("naturesaura:gold_leaf"))
    .output(item("naturesaura:eye"))
    .time(250)
    .sapling(item("theaurorian:weepingwillowsapling"))
    .register()

// Token of Anger (required Ender pearls)
mods.naturesaura.ritual.removeByOutput(item("naturesaura:token_anger"))
mods.naturesaura.ritual.recipeBuilder()
    .name("tier2/anger")
    .input(item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:nether"]),
           item("naturesaura:gold_leaf"), item("minecraft:blaze_powder"), item("minecraft:magma"),
           item("minecraft:gunpowder"), item("theaurorian:soullessflesh"))
    .output(item("naturesaura:token_anger") * 2)
    .time(200)
    .sapling(item("minecraft:sapling"))
    .register()

// Explosion Furnace
crafting.remove("prodigytech:machine/explosion_furnace")
crafting.shapedBuilder()
        .name("tier2/explosion_furnace")
        .output(item("prodigytech:explosion_furnace"))
        .matrix("BBB", "BAB", "BBB")
        .key("B", ore("bricksStone")).key("A", item("naturesaura:token_anger"))
        .register()

// Gold Powder
crafting.remove("naturesaura:gold_powder")
inWorldCrafting.pistonPush.recipeBuilder()
    .input(item("naturesaura:gold_leaf"))
    .output(item("naturesaura:gold_powder"))
    .minHarvestLevel(1)
    .maxConversionsPerPush(16)
    .register()

// Incinerator
crafting.remove("prodigytech:machine/incinerator")
crafting.shapedBuilder()
        .name("tier2/incinerator")
        .output(item("prodigytech:incinerator"))
        .matrix("FUF", "FUF", "FSF")
        .key("F", ore("ingotFerramic")).key("U", item("theaurorian:scrapumbra")).key("S", item("naturesaura:token_sorrow"))
        .register()

// Seared Brick
furnace.removeByOutput(item("tconstruct:materials"))
mods.roots.pyre.recipeBuilder()
    .name("tier2/seared_brick")
    .input(item("minecraft:brick"), item("minecraft:brick"), item("minecraft:netherbrick"),
           item("minecraft:netherbrick"), ore("dustAsh"))
    .output(item("tconstruct:materials") * 4)
    .burnTime(160)
    .register()

// Gold Leaf info
mods.jei.description.add(item("naturesaura:golden_leaves"),
                         ["Spreads to the nearby Leaves blocks when grown.", "Only fully grown Leaves can drop Gold Leaf!"])
mods.jei.description.add(item("naturesaura:gold_leaf"), ["Only fully grown Leaves can drop Gold Leaf!"])
