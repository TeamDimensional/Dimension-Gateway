// Angelheart Vial
crafting.remove("xreliquary:items/angelheart_vial")
crafting.shapedBuilder()
    .name("equipment/reliquary/angelheart_vial")
    .matrix("GPG", "GIG", " G ")
    .key("P", fluid("purifying_fluid") * 1000)
    .key("G", item("thaumicaugmentation:fortified_glass_pane"))
    .key("I", item("xreliquary:mob_ingredient", 3))
    .output(item("xreliquary:angelheart_vial") * 4)
    .register()

// Destruction Catalyst
crafting.remove("xreliquary:items/destruction_catalyst")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("minecraft:flint_and_steel"))
    .output(item("xreliquary:destruction_catalyst"))
    .aspect(aspect("ignis") * 20, aspect("perditio") * 20)
    .input(item("xreliquary:mob_ingredient", 7))
    .input(item("xreliquary:mob_ingredient", 3))
    .input(item("naturesaura:token_anger"))
    .instability(4)
    .register()

// Emperor's Chalice
crafting.remove("xreliquary:items/emperor_chalice")
mods.naturesaura.ritual.recipeBuilder()
    .name("tier3/emperor_chalice")
    .input(item("minecraft:water_bucket"), item("minecraft:gold_ingot"), item("naturesaura:infused_iron"), item("xreliquary:mob_ingredient", 4))
    .output(item("xreliquary:emperor_chalice"))
    .time(250)
    .sapling(item("theaurorian:weepingwillowsapling"))
    .register()

// Infernal Chalice
crafting.remove("xreliquary:items/infernal_chalice")
mods.naturesaura.ritual.recipeBuilder()
    .name("tier3/infernal_chalice")
    .input(item("minecraft:lava_bucket"), item("extrautils2:ingredients", 11), item("naturesaura:infused_iron"), item("xreliquary:mob_ingredient", 7))
    .output(item("xreliquary:infernal_chalice"))
    .time(250)
    .sapling(item("natura:nether_sapling", 1))
    .register()

// Glacial Stuff
crafting.remove("xreliquary:items/glacial_staff")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("xreliquary:void_tear"))
    .output(item("xreliquary:glacial_staff"))
    .aspect(aspect("gelum") * 20, aspect("aqua") * 20, aspect("aversio") * 20)
    .input(item("xreliquary:ice_magus_rod"))
    .input(item("xreliquary:mob_ingredient", 10))
    .input(item("naturesaura:token_sorrow"))
    .instability(6)
    .register()

// Glacial Stuff
crafting.remove("xreliquary:items/pyromancer_staff")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("xreliquary:void_tear"))
    .output(item("xreliquary:pyromancer_staff"))
    .aspect(aspect("ignis") * 20, aspect("potentia") * 20, aspect("aversio") * 20)
    .input(item("xreliquary:infernal_claws"))
    .input(item("xreliquary:mob_ingredient", 7))
    .input(item("naturesaura:token_anger"))
    .instability(6)
    .register()

// Serpent Staff
crafting.remove("xreliquary:items/serpent_staff")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("aether_legacy:cloud_staff"))
    .output(item("xreliquary:serpent_staff"))
    .aspect(aspect("aqua") * 10, aspect("aversio") * 40)
    .input(item("xreliquary:mob_ingredient", 2))
    .input(item("calculator:weakeneddiamond"))
    .input(item("naturesaura:token_grief"))
    .instability(9)
    .register()

// Rending Gale
crafting.remove("xreliquary:items/rending_gale")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("minecraft:blaze_rod"))
    .output(item("xreliquary:rending_gale"))
    .aspect(aspect("volatus") * 35, aspect("potentia") * 20)
    .input(item("roots:mystic_feather"))
    .input(item("xreliquary:mob_ingredient", 5))
    .input(item("naturesaura:token_joy"))
    .instability(8)
    .register()

// Sojourner's Staff
crafting.remove("xreliquary:items/sojourner_staff")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("minecraft:blaze_rod"))
    .output(item("xreliquary:sojourner_staff"))
    .aspect(aspect("lux") * 20, aspect("vacuos") * 20)
    .input(item("thaumcraft:nitor_yellow"))
    .input(item("xreliquary:mob_ingredient", 7))
    .input(item("naturesaura:token_joy"))
    .instability(5)
    .register()

// Harvest Rod
crafting.remove("xreliquary:items/harvest_rod")
crafting.shapedBuilder()
    .name("equipment/reliquary/harvest_rod")
    .matrix(" RE", "VCR", "SV ")
    .key("R", item("minecraft:double_plant", 4))
    .key("E", item("xreliquary:mob_ingredient", 9))
    .key("V", item("minecraft:vine"))
    .key("S", item("minecraft:stick"))
    .key("C", item("ironchest:iron_chest"))
    .output(item("xreliquary:harvest_rod"))
    .register()

// Hero's Medallion
crafting.remove("xreliquary:items/hero_medallion")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("xreliquary:fortune_coin"))
    .output(item("xreliquary:hero_medallion"))
    .aspect(aspect("sensus") * 20, aspect("desiderium") * 20)
    .input(item("xreliquary:mob_ingredient", 11))
    .input(item("thermalfoundation:tome_experience"))
    .input(item("naturesaura:token_joy"))
    .instability(8)
    .register()

// Kraken Shell
crafting.remove("xreliquary:items/kraken_shell")
crafting.shapedBuilder()
    .name("equipment/reliquary/kraken_shell")
    .matrix("S S", "SPS", "SWS")
    .key("S", item("xreliquary:mob_ingredient", 12))
    .key("P", item("xreliquary:mob_ingredient", 4))
    .key("W", item("essentialcraft:compressed", 1))
    .output(item("xreliquary:kraken_shell"))
    .register()

// Infernal Claws
crafting.remove("xreliquary:items/infernal_claws")
crafting.shapedBuilder()
    .name("equipment/reliquary/infernal_claws")
    .matrix("L L", "CPC", "BWB")
    .key("C", item("xreliquary:mob_ingredient", 7))
    .key("B", item("xreliquary:mob_ingredient"))
    .key("L", item("minecraft:leather"))
    .key("P", item("xreliquary:mob_ingredient", 4))
    .key("W", item("essentialcraft:compressed"))
    .output(item("xreliquary:infernal_claws"))
    .register()

// Magicbane
crafting.remove("xreliquary:items/magicbane")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("aether_legacy:lightning_sword"))
    .output(item("xreliquary:magicbane"))
    .aspect(aspect("motus") * 40, aspect("alienis") * 50, aspect("aversio") * 50)
    .input(item("thaumicwonders:panacea", 1))
    .input(item("xreliquary:mob_ingredient", 11))
    .input(item("naturesaura:token_terror"))
    .instability(12)
    .register()

// Charm Belt
crafting.remove("xreliquary:items/mob_charm_belt")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("thaumcraft:baubles", 6))
    .output(item("xreliquary:mob_charm_belt"))
    .aspect(aspect("bestia") * 30, aspect("tenebrae") * 30)
    .input(item("xreliquary:mob_ingredient", 5))
    .input(item("xreliquary:mob_ingredient", 6))
    .input(item("naturesaura:token_terror"))
    .instability(7)
    .register()

// Magicbane
crafting.remove("xreliquary:items/rod_of_lyssa")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("minecraft:fishing_rod"))
    .output(item("xreliquary:rod_of_lyssa"))
    .aspect(aspect("desiderium") * 25, aspect("vacuos") * 15)
    .input(item("xreliquary:mob_ingredient", 11))
    .input(item("actuallyadditions:item_suction_ring"))
    .input(item("naturesaura:token_euphoria"))
    .instability(9)
    .register()

// Charms
def charms = [
    ["zombie", item("xreliquary:mob_ingredient", 6), item("xreliquary:mob_ingredient", 6), "exanimis"],
    ["skeleton", item("xreliquary:mob_ingredient", 0), item("xreliquary:mob_ingredient", 0), "mortuus"],
    ["wither_skeleton", item("xreliquary:mob_ingredient", 1), item("xreliquary:mob_ingredient", 6), "exanimis"],
    ["creeper", item("xreliquary:mob_ingredient", 3), item("xreliquary:mob_ingredient", 8), "perditio"],
    ["witch", item("minecraft:glowstone_dust"), item("minecraft:redstone"), "praecantatio"],
    ["zombie_pigman", item("xreliquary:mob_ingredient", 6), item("minecraft:gold_ingot"), "desiderium"],
    ["cave_spider", item("xreliquary:mob_ingredient", 2), item("minecraft:poisonous_potato"), "alkimia"],
    ["spider", item("xreliquary:mob_ingredient", 2), item("xreliquary:mob_ingredient", 2), "motus"],
    ["enderman", item("xreliquary:mob_ingredient", 11), item("minecraft:ender_eye"), "alienis"],
    ["ghast", item("xreliquary:mob_ingredient", 3), item("minecraft:ghast_tear"), "spiritus"],
    ["slime", item("xreliquary:mob_ingredient", 4), item("xreliquary:mob_ingredient", 4), "permutatio"],
    ["magma_cube", item("xreliquary:mob_ingredient", 4), item("xreliquary:mob_ingredient", 7), "ignis"],
    ["blaze", item("minecraft:blaze_rod"), item("xreliquary:mob_ingredient", 7), "ignis"],
    ["guardian", item("xreliquary:mob_ingredient", 12), item("xreliquary:mob_ingredient", 16), "aqua"],
]
def invis = item("minecraft:lingering_potion").withNbt(["Potion": "minecraft:long_invisibility"])
for (def i in 0..(charms.size() - 1)) {
    def output = item("xreliquary:mob_charm").withNbt(["type": (byte) i])
    def first = charms[i][1]
    def second = charms[i][2]
    crafting.remove("xreliquary:items/mob_charms/${charms[i][0]}")
    mods.thaumcraft.infusion_crafting.recipeBuilder()
        .researchKey("INFUSION")
        .mainInput(invis)
        .output(output)
        .aspect(aspect("bestia") * 15, aspect("tenebrae") * 15, aspect(charms[i][3]) * 10)
        .input(first)
        .input(second)
        .input(first)
        .input(second)
        .input(item("naturesaura:token_fear"))
        .instability(4)
        .register()
}

// Twilight Cloak
crafting.remove("xreliquary:items/twilight_cloak")
mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey("INFUSION")
    .mainInput(item("embers:ashen_cloak_chest"))
    .output(item("xreliquary:twilight_cloak"))
    .aspect(aspect("sensus") * 20, aspect("tenebrae") * 20)
    .input(item("essentialcraft:genitem", 8))
    .input(item("thaumcraft:fabric"))
    .input(item("naturesaura:token_fear"))
    .instability(6)
    .register()

// Gun Parts
crafting.remove("xreliquary:items/handgun_grip")
crafting.remove("xreliquary:items/handgun_barrel")
crafting.remove("xreliquary:items/handgun_hammer")
crafting.remove("xreliquary:items/handgun")
crafting.shapedBuilder()
    .name("component/reliquary/handgun_grip")
    .matrix("III", "IFI", "IMI")
    .key("I", item("calculator:reinforcedironingot"))
    .key("F", item("minecraft:magma_cream"))
    .key("M", item("xreliquary:magazine"))
    .output(item("xreliquary:gun_part"))
    .register()
crafting.shapedBuilder()
    .name("component/reliquary/handgun_barrel")
    .matrix("III", "HFH", "III")
    .key("I", item("calculator:reinforcedironingot"))
    .key("F", item("minecraft:magma_cream"))
    .key("H", item("xreliquary:mob_ingredient", 11))
    .output(item("xreliquary:gun_part", 1))
    .register()
crafting.shapedBuilder()
    .name("component/reliquary/handgun_hammer")
    .mirrored()
    .matrix("IIB", "RHI", "III")
    .key("I", item("calculator:reinforcedironingot"))
    .key("R", item("minecraft:blaze_rod"))
    .key("H", item("xreliquary:mob_ingredient", 7))
    .key("B", item("minecraft:stone_button"))
    .output(item("xreliquary:gun_part", 2))
    .register()
crafting.shapedBuilder()
    .name("component/reliquary/handgun")
    .mirrored()
    .matrix("BIH", "ISI", "IGI")
    .key("I", item("calculator:reinforcedironingot"))
    .key("B", item("xreliquary:gun_part", 1))
    .key("H", item("xreliquary:gun_part", 2))
    .key("G", item("xreliquary:gun_part"))
    .key("S", item("xreliquary:mob_ingredient", 4))
    .output(item("xreliquary:handgun"))
    .register()

// Bullets
def shots = [
    [1, item("minecraft:gunpowder"), item("minecraft:flint")],
    [3, item("minecraft:blaze_powder"), item("minecraft:blaze_rod")],
    [5, item("minecraft:gunpowder"), ore("slimeball")],
    [7, item("minecraft:gunpowder"), item("minecraft:dye", 4)],
    [8, item("minecraft:blaze_powder"), ore("sandstone")],
    [9, item("minecraft:gunpowder"), item("xreliquary:mob_ingredient", 3)],
]

def nugget = item("tconstruct:nuggets", 1)
for (def it in shots) {
    crafting.removeByOutput(item("xreliquary:bullet", it[0]))
    crafting.shapelessBuilder()
        .input(it[1], item("tconstruct:nuggets", 1), item("tconstruct:nuggets", 1), it[2])
        .output(item("xreliquary:bullet", it[0]) * 8)
        .register()
}

crafting.remove("xreliquary:items/gold_nugget")
crafting.remove("xreliquary:items/uncrafting/gold_nugget")
crafting.shapelessBuilder()
    .input(item("xreliquary:bullet"), item("xreliquary:bullet"), item("xreliquary:bullet"), item("xreliquary:bullet"))
    .output(item("tconstruct:nuggets", 1))
    .register()

// Apothecary Cauldron/Mortar
crafting.remove("xreliquary:blocks/apothecary_mortar")
crafting.shapedBuilder()
    .name("machine/reliquary/apothecary_mortar")
    .matrix("NQN", "QGQ", "QQQ")
    .key("Q", ore("blockQuartz"))
    .key("G", item("xreliquary:mob_ingredient", 3))
    .key("N", item("netherized:netherite_ingot"))
    .output(item("xreliquary:apothecary_mortar"))
    .register()

crafting.remove("xreliquary:blocks/apothecary_cauldron")
crafting.shapedBuilder()
    .name("machine/reliquary/apothecary_cauldron")
    .matrix("GCG", "NMN")
    .key("M", item("xreliquary:mob_ingredient", 7))
    .key("G", item("xreliquary:mob_ingredient", 3))
    .key("N", item("netherized:netherite_ingot"))
    .key("C", item("thaumcraft:crucible"))
    .output(item("xreliquary:apothecary_cauldron"))
    .register()

// Empty Potion
crafting.remove("xreliquary:items/potion_vial")
crafting.shapedBuilder()
    .name("component/reliquary/empty_potion")
    .matrix("G G", "G G", " G ")
    .key("G", item("thaumicaugmentation:fortified_glass_pane"))
    .output(item("xreliquary:potion") * 4)
    .register()
