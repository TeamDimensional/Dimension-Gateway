import com.dimensional.gatewaycore.events.TooltipEvents

mods.prodigytech.atomic_reshaper.removeByInput(ore("stone"))

// Processing Cobalt and Nickel through the most advanced tier 7 technology
// (Essentia Infuser -> Atomic Calculator -> Natural Altar -> Embers) yields a bit below 0.37 Cobalt ingots per substrate
TooltipEvents.setTier(item("gateway:metallic_substrate"), 7)
mods.extrautils2.enchanter.recipeBuilder()
    .input(item("gateway:mundane_substrate") * 3, item("tconstruct:ingots"))
    .output(item("gateway:metallic_substrate") * 3)
    .energy(84000)
    .time(1200)
    .register()
mods.prodigytech.atomic_reshaper.recipeBuilder()
    .input(item("gateway:metallic_substrate"))
    .output(item("thermalfoundation:ore", 0), 12)  // copper
    .output(item("thermalfoundation:ore", 1), 10)  // tin
    .output(item("thermalfoundation:ore", 2), 7)   // silver
    .output(item("thermalfoundation:ore", 4), 5)   // aluminium
    .output(item("thermalfoundation:ore", 5), 5)   // nickel
    .output(item("minecraft:iron_ore"), 15)
    .output(item("tconstruct:ore"), 4)  // cobalt
    .primordium(25)
    .time(200)
    .register()

// Processing Boron and Lithium through the most advanced tier 11 technology
// (Essentia Infuser -> Atomic Calculator -> SAG Mill -> Fluid Infuser -> Magmatic Smeltery -> Fluid Infuser) yields around 1.3 ingots of each.
// Not doing first Fluid Infuser yields slightly under 1 ingot. This should require tight margins,
// as Boron is a key component of Radioinfused Tanzanite and cheesing it should not be realistic.
TooltipEvents.setTier(item("gateway:light_metal_substrate"), 10)
mods.advancedrocketry.crystallizer.recipeBuilder()
    .input(item("gateway:metallic_substrate"), item("minecraft:stone") * 3, item("nuclearcraft:ingot", 5) * 4, item("nuclearcraft:ingot", 6) * 4)
    .output(item("gateway:light_metal_substrate") * 4)
    .power(500)
    .time(800)
    .register()
mods.prodigytech.atomic_reshaper.recipeBuilder()
    .input(item("gateway:light_metal_substrate"))
    .output(item("theaurorian:ceruleanore"), 5)
    .output(item("theaurorian:moonstoneore"), 5)
    .output(item("nuclearcraft:ore", 5), 7)       // boron
    .output(item("nuclearcraft:ore", 6), 7)       // lithium
    .output(item("nuclearcraft:ore", 7), 12)      // magnesium
    .output(item("thermalfoundation:ore", 4), 8)  // aluminium
    .output(item("libvulpes:ore0", 8), 6)         // rutile
    .primordium(40)
    .time(300)
    .register()

// Similar math to the previous one using Thorium and Uranium. Though these margins are much less tight.
TooltipEvents.setTier(item("gateway:heavy_metal_substrate"), 10)
mods.advancedrocketry.crystallizer.recipeBuilder()
    .input(item("gateway:metallic_substrate"), item("minecraft:stone") * 3, item("nuclearcraft:ingot", 4) * 3, item("nuclearcraft:ingot", 3) * 2)
    .output(item("gateway:heavy_metal_substrate") * 4)
    .power(500)
    .time(800)
    .register()
mods.prodigytech.atomic_reshaper.recipeBuilder()
    .input(item("gateway:heavy_metal_substrate"))
    .output(item("minecraft:gold_ore"), 12)
    .output(item("deepresonance:resonating_ore", 2), 8)
    .output(item("tconstruct:ore", 1), 6)           // ardite
    .output(item("thermalfoundation:ore", 3), 12)   // lead
    .output(item("nuclearcraft:ore", 3), 9)         // thorium
    .output(item("nuclearcraft:ore", 4), 12)        // uranium
    .primordium(40)
    .time(300)
    .register()

// This is intentionally cheap. Free redstone
TooltipEvents.setTier(item("gateway:mundane_substrate"), 5)
mods.immersiveengineering.bottling_machine.recipeBuilder()
    .input(item("minecraft:stone"))
    .fluidInput(fluid("sludge") * 250)
    .output(item("gateway:mundane_substrate"))
    .register()
mods.thaumcraft.crucible.recipeBuilder()
    .researchKey("UNLOCKALCHEMY@3")
    .catalyst(item("roots:runestone"))
    .output(item("gateway:mundane_substrate"))
    .aspect(aspect("alkimia") * 10)
    .register()
mods.prodigytech.atomic_reshaper.recipeBuilder()
    .input(item("gateway:mundane_substrate"))
    .output(item("minecraft:coal_ore"), 15)
    .output(item("minecraft:lapis_ore"), 10)
    .output(item("minecraft:redstone_ore"), 8)
    .output(item("theaurorian:auroriancoalore"), 8)
    .output(item("essentialcraft:oredrops", 6), 5)  // fire
    .output(item("essentialcraft:oredrops", 7), 5)  // water
    .output(item("essentialcraft:oredrops", 8), 5)  // earth
    .output(item("essentialcraft:oredrops", 9), 5)  // air
    .primordium(10)
    .time(100)
    .register()

// Cheap, but needs infra
TooltipEvents.setTier(item("gateway:gemstone_substrate"), 8)
mods.factorytech.agitator.recipeBuilder()
    .input(item("gateway:mundane_substrate"))
    .fluidInput(fluid("blaze_superfuel") * 500)
    .fluidInput(fluid("menrilresin") * 500)
    .output(item("gateway:gemstone_substrate"))
    .register()
mods.prodigytech.atomic_reshaper.recipeBuilder()
    .input(item("gateway:gemstone_substrate"))
    .output(item("thaumcraft:ore_amber"), 10)
    .output(item("aether_legacy:ambrosium_ore"), 8)
    .output(item("aether_legacy:zanite_ore"), 8)
    .output(item("astralsorcery:blockcustomsandore"), 10)  // aquamarine
    .output(item("theaurorian:geodeore"), 6)
    .output(item("minecraft:diamond_ore"), 5)
    .output(item("minecraft:emerald_ore"), 5)
    .output(item("minecraft:quartz_ore"), 13)
    .primordium(25)
    .time(200)
    .register()
