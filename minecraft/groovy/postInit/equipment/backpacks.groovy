import classes.ShapedCraftingHelper
import com.cleanroommc.retrosophisticatedbackpacks.crafting.ShapedBackpackUpgradeRecipe
import com.dimensional.gatewaycore.events.TooltipEvents


// Backpacks
def backpackUpgrade() {
    return (result, primer) -> new ShapedBackpackUpgradeRecipe(null, result, primer)
}

crafting.remove("retro_sophisticated_backpacks:backpack_iron")
ShapedCraftingHelper.builder()
    .name("backpacks/iron")
    .output(item("retro_sophisticated_backpacks:backpack_iron"))
    .matrix("SUS", "UBU", "SUS")
    .key("S", item("immersiveengineering:storage", 8))
    .key("U", item("thermalfoundation:material", 162))
    .key("B", item("retro_sophisticated_backpacks:backpack_leather"))
    .ctor(backpackUpgrade())
    .register()
TooltipEvents.setTooltip(item("retro_sophisticated_backpacks:backpack_iron"), "The actual recipe is on the last page of JEI!")

crafting.remove("retro_sophisticated_backpacks:backpack_gold")
ShapedCraftingHelper.builder()
    .name("backpacks/gold")
    .output(item("retro_sophisticated_backpacks:backpack_gold"))
    .matrix("SUS", "UBU", "SUS")
    .key("S", item("embers:block_dawnstone"))
    .key("U", item("essentialcraft:genitem", 10))
    .key("B", item("retro_sophisticated_backpacks:backpack_iron"))
    .ctor(backpackUpgrade())
    .register()
TooltipEvents.setTooltip(item("retro_sophisticated_backpacks:backpack_gold"), "The actual recipe is on the last page of JEI!")

crafting.remove("retro_sophisticated_backpacks:backpack_diamond")
ShapedCraftingHelper.builder()
    .name("backpacks/diamond")
    .output(item("retro_sophisticated_backpacks:backpack_diamond"))
    .matrix("SUS", "UBU", "SUS")
    .key("S", item("calculator:material", 5))
    .key("U", item("aetherworks:item_resource", 4))
    .key("B", item("retro_sophisticated_backpacks:backpack_gold"))
    .ctor(backpackUpgrade())
    .register()
TooltipEvents.setTooltip(item("retro_sophisticated_backpacks:backpack_diamond"), "The actual recipe is on the last page of JEI!")

crafting.remove("retro_sophisticated_backpacks:backpack_obsidian")
ShapedCraftingHelper.builder()
    .name("backpacks/obsidian")
    .output(item("retro_sophisticated_backpacks:backpack_obsidian"))
    .matrix("SUS", "UBU", "SUS")
    .key("S", item("thermalfoundation:storage_alloy", 7))
    .key("U", item("gateway:resonating_gem"))
    .key("B", item("retro_sophisticated_backpacks:backpack_diamond"))
    .ctor(backpackUpgrade())
    .register()
TooltipEvents.setTooltip(item("retro_sophisticated_backpacks:backpack_obsidian"), "The actual recipe is on the last page of JEI!")


// Upgrades
crafting.remove("retro_sophisticated_backpacks:stack_upgrade_starter_tier")
mods.roots.fey_crafter.recipeBuilder()
    .name("backpacks/basic_upgrade")
    .input(
        item("retro_sophisticated_backpacks:upgrade_base"),
        item("minecraft:coal_block"), item("minecraft:coal_block"), item("minecraft:coal_block"), item("minecraft:coal_block"))
    .output(item("retro_sophisticated_backpacks:stack_upgrade_starter_tier"))
    .register()

crafting.remove("retro_sophisticated_backpacks:stack_upgrade_tier_1")
mods.roots.fey_crafter.recipeBuilder()
    .name("backpacks/iron_upgrade")
    .input(
        item("retro_sophisticated_backpacks:stack_upgrade_starter_tier"),
        item("actuallyadditions:block_crystal", 5), item("actuallyadditions:block_crystal", 5),
        item("actuallyadditions:block_crystal", 5), item("actuallyadditions:block_crystal", 5))
    .output(item("retro_sophisticated_backpacks:stack_upgrade_tier_1"))
    .register()

crafting.remove("retro_sophisticated_backpacks:stack_upgrade_tier_2")
mods.roots.fey_crafter.recipeBuilder()
    .name("backpacks/gold_upgrade")
    .input(
        item("retro_sophisticated_backpacks:stack_upgrade_tier_1"),
        item("calculator:material", 2), item("calculator:material", 2), item("calculator:material", 2), item("calculator:material", 2))
    .output(item("retro_sophisticated_backpacks:stack_upgrade_tier_2"))
    .register()

crafting.remove("retro_sophisticated_backpacks:stack_upgrade_tier_3")
mods.roots.fey_crafter.recipeBuilder()
    .name("backpacks/diamond_upgrade")
    .input(
        item("retro_sophisticated_backpacks:stack_upgrade_tier_2"),
        item("aetherworks:block_aether"), item("aetherworks:block_aether"), item("aetherworks:block_aether"), item("aetherworks:block_aether"))
    .output(item("retro_sophisticated_backpacks:stack_upgrade_tier_3"))
    .register()

crafting.remove("retro_sophisticated_backpacks:stack_upgrade_tier_4")
mods.roots.fey_crafter.recipeBuilder()
    .name("backpacks/obsidian_upgrade")
    .input(
        item("retro_sophisticated_backpacks:stack_upgrade_tier_3"),
        item("essentialcraft:genitem"), item("essentialcraft:genitem"), item("essentialcraft:genitem"), item("essentialcraft:genitem"))
    .output(item("retro_sophisticated_backpacks:stack_upgrade_tier_4"))
    .register()

crafting.remove("retro_sophisticated_backpacks:exponential_stack_upgrade")
mods.astralsorcery.starlight_altar.constellationRecipeBuilder()
    .output(item("retro_sophisticated_backpacks:exponential_stack_upgrade"))
    .matrix(" r r ",
            "r c r",
            " uuu ",
            "r v r",
            " r r ")
    .key("r", item("botania:rune", 11))
    .key("u", item("retro_sophisticated_backpacks:stack_upgrade_tier_4"))
    //.key("c", item("bloodmagic:component", 14))
    .key("v", item("enderio:item_material", 17))
    .key("c", item("enderio:item_material", 17))
    .starlight(4000)
    .register()

crafting.remove("retro_sophisticated_backpacks:inception_upgrade")
mods.astralsorcery.starlight_altar.attunementRecipeBuilder()
    .output(item("retro_sophisticated_backpacks:inception_upgrade"))
    .matrix("s   s",
            " m m ",
            "  b  ",
            " m m ",
            "s   s")
    .key("b", item("retro_sophisticated_backpacks:upgrade_base"))
    .key("m", item("essentialcraft:genitem", 49))
    .key("s", item("minecraft:nether_star"))
    .starlight(2000)
    .register()

crafting.remove("retro_sophisticated_backpacks:feeding_upgrade")
crafting.shapedBuilder()
    .name("backpacks/feeding_upgrade")
    .mirrored()
    .matrix(" C ", "ABM", " P ")
    .key("C", item("minecraft:golden_carrot"))
    .key("A", item("minecraft:golden_apple"))
    .key("B", item("retro_sophisticated_backpacks:upgrade_base"))
    .key("M", item("minecraft:speckled_melon"))
    .key("P", item("prodigytech:meat_patty"))
    .output(item("retro_sophisticated_backpacks:feeding_upgrade"))
    .register()
