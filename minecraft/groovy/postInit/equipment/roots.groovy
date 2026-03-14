import com.dimensional.gatewaycore.events.TooltipEvents

// Pouches
crafting.remove("roots:herb_pouch")
crafting.shapedBuilder()
    .name("tier2/roots_pouch")
    .output(item("roots:herb_pouch"))
    .matrix("SRS", "W W", "WWW")
    .key("S", ore("string"))
    .key("R", item("roots:runic_dust"))
    .key("W", ore("wool"))
    .register()

TooltipEvents.setTooltip(item("roots:herb_pouch"), "Has 9 slots for herbs.")
TooltipEvents.setTooltip(item("roots:component_pouch"), "Has 6 slots for herbs and 12 slots for items.")
TooltipEvents.setTooltip(item("roots:fey_pouch"), "Has 12 slots for herbs and 6 slots for items.")
TooltipEvents.setTooltip(item("roots:apothecary_pouch"), "Has 9 slots for herbs and 18 slots for items.")

// Gramary
crafting.remove("roots:gramary")
mods.roots.fey_crafter.recipeBuilder()
    .name("tier2/gramary")
    .input(item("minecraft:book"), item("natura:materials", 7), item("roots:bark_wildwood"), item("roots:terra_moss"), item("roots:spirit_herb"))
    .output(item("roots:gramary"))
    .register()

// Imbuer
crafting.remove("roots:imbuer")
crafting.shapedBuilder()
    .name("tier2/roots_imbuer")
    .output(item("roots:imbuer"))
    .matrix("S S", " R ", "S S")
    .key("S", item("naturesaura:ancient_stick"))
    .key("R", item("roots:runestone"))
    .register()

// Staff
crafting.remove("roots:staff")
crafting.shapedBuilder()
    .name("tier2/staff")
    .mirrored()
    .output(item("roots:staff"))
    .matrix(" WC", " SW", "S  ")
    .key("S", ore("stickWood"))
    .key("W", ore("logWood"))
    .key("C", item("roots:cloud_berry"))
    .register()

// Spells (move things to tier 2, except shatter)
mods.roots.spells.recipeBuilder()
    .spell(spell("spell_rose_thorns"))
    .input(item("minecraft:cactus"), item("minecraft:double_plant", 4), item("minecraft:trapdoor"), item("theaurorian:stickyspiker"), item("roots:terra_moss"))
    .register()

mods.roots.spells.recipeBuilder()
    .spell(spell("spell_growth_infusion"))
    .input(item("roots:dewgonia"), ore("treeSapling"), item("roots:terra_moss"), item("mysticalworld:aubergine"), item("roots:wildewheet"))
    .register()

mods.roots.spells.recipeBuilder()
    .spell(spell("spell_natures_scythe"))
    .input(item("roots:wildroot"), item("roots:stalicripe"), item("mysticalworld:aubergine"), item("theaurorian:moonstonesickle"), ore("tallgrass"))
    .register()

mods.roots.spells.recipeBuilder()
    .spell(spell("spell_radiance"))
    .input(item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:overworld"]), ore("torch"), ore("dyeYellow"),
           item("roots:cloud_berry"), item("roots:pereskia"))
    .register()

mods.roots.spells.recipeBuilder()
    .spell(spell("spell_wild_fire"))
    .input(item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:nether"]), ore("dyeOrange"), item("immersiveengineering:material", 6),
           item("roots:infernal_bulb"), item("minecraft:gunpowder"))
    .register()

mods.roots.spells.recipeBuilder()
    .spell(spell("spell_shatter"))
    .input(item("naturesaura:crushing_catalyst"), item("calculator:endforgedpickaxe"), item("roots:stalicripe"), item("calculator:grenade"), item("gateway:starsteel_ingot"))
    .register()

// Rituals
mods.roots.rituals.recipeBuilder()
    .ritual(ritual("warding_protection"))
    .input(item("minecraft:quartz"), item("roots:stalicripe"), ore("rootsBark"), item("minecraft:shield"), item("minecraft:melon"))
    .register()
