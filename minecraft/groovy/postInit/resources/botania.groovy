import classes.AlloyHelper

//// Quartzline
// Smokey Quartz
crafting.remove("botania:quartz_0")
mods.naturesaura.offering.recipeBuilder()
    .name("offered_quartz")
    .input(item("botania:quartz", 1))
    .catalyst(item("roots:runic_dust"))
    .output(item("botania:quartz"))
    .register()

// Blaze Quartz
crafting.remove("botania:quartz_2")
mods.factorytech.agitator.recipeBuilder()
    .input(item("botania:quartz", 1))
    .output(item("botania:quartz", 2))
    .fluidInput(fluid("pyro_cinnabar_mixture") * 100)
    .register()

// Red Quartz
crafting.remove("botania:quartz_4")
AlloyHelper.builder()
    .minTier(2)
    .input(item("botania:quartz", 2), item("essentialcraft:elementalfuel"))
    .output(item("botania:quartz", 4))
    .time(200)
    .register()

// Sunny Quartz
crafting.remove("botania:quartz_6")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("minecraft:double_plant"))
    .output(item("botania:quartz", 6) * 8)
    .aspect(aspect("lux") * 32)
    .input(item("botania:quartz", 4))
    .input(item("botania:quartz", 4))
    .input(item("botania:quartz", 4))
    .input(item("botania:quartz", 4))
    .input(item("botania:quartz", 4))
    .input(item("botania:quartz", 4))
    .input(item("botania:quartz", 4))
    .input(item("botania:quartz", 4))
    .instability(4)
    .register()

// Lavender Quartz
crafting.remove("botania:quartz_3")
mods.prodigytech.atomic_reshaper.recipeBuilder()
    .input(item("botania:quartz", 6))
    .output(item("botania:quartz", 3))
    .primordium(7)
    .register()

// Elven Quartz
mods.botania.elven_trade.removeByOutputs(item("botania:quartz", 5))
mods.botania.elven_trade.recipeBuilder()
    .input(item("botania:quartz", 3))
    .input(item("bloodmagic:item_demon_crystal", 1))
    .input(item("nuclearcraft:uranium"))  // U-233
    .output(item("botania:quartz", 5))
    .register()

//// Mana Resources
// Manasteel
mods.botania.mana_infusion.removeByOutput(item("botania:manaresource"))
mods.botania.mana_infusion.recipeBuilder()
    .input(item("gateway:starsteel_ingot"))
    .output(item("botania:manaresource"))
    .mana(3000)
    .register()
mods.botania.mana_infusion.recipeBuilder()
    .input(item("prodigytech:zorrasteel_ingot"))
    .output(item("botania:manaresource") * 2)
    .mana(4000)
    .register()
mods.botania.mana_infusion.removeByOutput(item("botania:storage"))

// Mana Pearl
mods.botania.mana_infusion.removeByOutput(item("botania:manaresource", 1))
mods.botania.mana_infusion.recipeBuilder()
    .input(item("minecraft:ender_eye"))
    .output(item("botania:manaresource", 1))
    .mana(8000)
    .register()

// Mana Diamond
mods.botania.mana_infusion.removeByOutput(item("botania:manaresource", 2))
mods.botania.mana_infusion.recipeBuilder()
    .input(item("calculator:enddiamond"))
    .output(item("botania:manaresource", 2))
    .mana(12000)
    .register()
mods.botania.mana_infusion.removeByOutput(item("botania:storage", 3))
mods.botania.mana_infusion.recipeBuilder()
    .input(item("calculator:material", 8))
    .output(item("botania:storage", 3))
    .mana(96000)
    .register()

// Mana Powder
mods.botania.mana_infusion.removeByOutput(item("botania:manaresource", 23))
mods.botania.mana_infusion.recipeBuilder()
    .input(item("essentialcraft:genitem", 46))
    .output(item("botania:manaresource", 23))
    .mana(1000)
    .register()
mods.botania.mana_infusion.recipeBuilder()
    .input(item("essentialcraft:genitem", 20))
    .output(item("botania:manaresource", 23))
    .mana(4000)
    .register()

// Mana Glass
mods.botania.mana_infusion.removeByOutput(item("botania:managlass"))
mods.botania.mana_infusion.recipeBuilder()
    .input(item("calculator:flawlessglass"))
    .output(item("botania:managlass"))
    .mana(2500)
    .register()

// Gaia Ingot
crafting.removeByOutput(item("botania:manaresource", 14))
AlloyHelper.builder()
    .minTier(3)
    .input(item("thaumictinkerer:kamiresource", 3), item("botania:manaresource", 5) * 4, item("thaumcraft:ingot", 1) * 2)
    .output(item("botania:manaresource", 14))
    .time(500)
    .register()

//// Runes
def manaPowder = item("botania:manaresource", 23)
def manaSteel = item("botania:manaresource")
def manaGlass = item("botania:managlass")
def terrasteel = item("botania:manaresource", 4)

def t1Cost = 5000
def t2Cost = 10000
def t3Cost = 15000

mods.botania.rune_altar.removeAll()

// Water
mods.botania.rune_altar.recipeBuilder()
    .input(manaPowder, manaSteel, item("essentialcraft:elementalfuel", 1), item("roots:dewgonia"), item("minecraft:reeds"))
    .output(item("botania:rune", 0) * 2)
    .mana(t1Cost)
    .register()
// Fire
mods.botania.rune_altar.recipeBuilder()
    .input(manaPowder, manaSteel, item("essentialcraft:elementalfuel", 0), item("roots:infernal_bulb"), item("immersiveengineering:material", 6))
    .output(item("botania:rune", 1) * 2)
    .mana(t1Cost)
    .register()
// Earth
mods.botania.rune_altar.recipeBuilder()
    .input(manaPowder, manaSteel, item("essentialcraft:elementalfuel", 2), item("roots:stalicripe"), item("prodigytech:charred_cobblestone"))
    .output(item("botania:rune", 2) * 2)
    .mana(t1Cost)
    .register()
// Air
mods.botania.rune_altar.recipeBuilder()
    .input(manaPowder, manaSteel, item("essentialcraft:elementalfuel", 3), item("roots:cloud_berry"), item("roots:mystic_feather"))
    .output(item("botania:rune", 3) * 2)
    .mana(t1Cost)
    .register()

// Spring
mods.botania.rune_altar.recipeBuilder()
    .input(manaGlass, item("botania:rune", 0), item("botania:rune", 1), item("naturesaura:token_euphoria"), item("aether_legacy:golden_oak_sapling"), item("natura:overworld_sapling2", 3))
    .output(item("botania:rune", 4) * 2)
    .mana(t2Cost)
    .register()
// Summer
mods.botania.rune_altar.recipeBuilder()
    .input(manaGlass, item("botania:rune", 2), item("botania:rune", 3), item("naturesaura:token_rage"), item("minecraft:melon"), item("calculator:fiddledewfruit"))
    .output(item("botania:rune", 5) * 2)
    .mana(t2Cost)
    .register()
// Autumn
mods.botania.rune_altar.recipeBuilder()
    .input(manaGlass, item("botania:rune", 1), item("botania:rune", 3), item("naturesaura:token_terror"), item("minecraft:spider_eye"), item("thaumcraft:quicksilver"))
    .output(item("botania:rune", 6) * 2)
    .mana(t2Cost)
    .register()
// Winter
mods.botania.rune_altar.recipeBuilder()
    .input(manaGlass, item("botania:rune", 0), item("botania:rune", 2), item("naturesaura:token_grief"), item("minecraft:cake"), item("minecraft:packed_ice"))
    .output(item("botania:rune", 7) * 2)
    .mana(t2Cost)
    .register()

// Mana
mods.botania.rune_altar.recipeBuilder()
    .input(manaGlass, manaSteel, manaSteel, item("botania:manaresource", 2), item("botania:manaresource", 1), item("naturesaura:sky_ingot"))
    .output(item("botania:rune", 8))
    .mana(30000)
    .register()

// Lust
mods.botania.rune_altar.recipeBuilder()
    .input(terrasteel, item("botania:rune", 3), item("botania:rune", 5), item("minecraft:potion").withNbt(["Potion": "extrautils2:xu2.love"]), item("thaumcraft:tallow"))
    .output(item("botania:rune", 9))
    .mana(t3Cost)
    .register()
// Gluttony
mods.botania.rune_altar.recipeBuilder()
    .input(terrasteel, item("botania:rune", 1), item("botania:rune", 5), item("thermalfoundation:fertilizer", 2), item("botania:manacookie"))
    .output(item("botania:rune", 10))
    .mana(t3Cost)
    .register()
// Greed
mods.botania.rune_altar.recipeBuilder()
    .input(terrasteel, item("botania:rune", 0), item("botania:rune", 4), item("thermalfoundation:material", 134), item("minecraft:golden_apple", 1))
    .output(item("botania:rune", 11))
    .mana(t3Cost)
    .register()
// Sloth
mods.botania.rune_altar.recipeBuilder()
    .input(terrasteel, item("botania:rune", 3), item("botania:rune", 6), item("minecraft:potion").withNbt(["Potion": "minecraft:slowness"]), item("essentialcraft:genitem", 32))
    .output(item("botania:rune", 12))
    .mana(t3Cost)
    .register()
// Wrath
mods.botania.rune_altar.recipeBuilder()
    .input(terrasteel, item("botania:rune", 2), item("botania:rune", 7), item("soot:mug").withNbt(["Fluid": ["Amount": 250, "FluidName": "dwarven_ale"]]), item("netherized:netherite_sword"))
    .output(item("botania:rune", 13))
    .mana(t3Cost)
    .register()
// Envy
mods.botania.rune_altar.recipeBuilder()
    .input(terrasteel, item("botania:rune", 0), item("botania:rune", 7), item("essentialcraft:genitem", 55), item("essentialcraft:genitem", 22))
    .output(item("botania:rune", 14))
    .mana(t3Cost)
    .register()
// Pride
mods.botania.rune_altar.recipeBuilder()
    .input(terrasteel, item("botania:rune", 1), item("botania:rune", 5), item("ee:infused_crystal"), item("factorytech:machinepart", 170))
    .output(item("botania:rune", 15))
    .mana(t3Cost)
    .register()
