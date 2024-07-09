import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

forestItems = [
    item("naturesaura:ancient_log"), item("naturesaura:ancient_bark"), item("naturesaura:ancient_planks"),
    item("naturesaura:ancient_stairs"), item("naturesaura:ancient_slab"), item("naturesaura:ancient_leaves"),
    item("naturesaura:ancient_sapling"), item("naturesaura:gold_powder"), item("naturesaura:wood_stand"),
    item("naturesaura:gold_brick"), item("naturesaura:gold_fiber"), item("naturesaura:gold_leaf"),
    item("naturesaura:ancient_stick"), item("naturesaura:bottle_two_the_rebottling"), item("naturesaura:eye"), 
    item("naturesaura:token_joy"), item("naturesaura:token_fear"), item("naturesaura:token_anger"), item("naturesaura:token_sorrow"),
    item("naturesaura:golden_leaves"),
]
unobtainableItems = [item("naturesaura:decayed_leaves")]
altarItems = [
    item("naturesaura:infused_stone"), item("naturesaura:infused_stairs"), item("naturesaura:infused_slab"),
    item("naturesaura:infused_brick"), item("naturesaura:infused_brick_stairs"), item("naturesaura:infused_brick_slab"),
    item("naturesaura:furnace_heater"), item("naturesaura:crushing_catalyst"), item("naturesaura:flower_generator"),
    item("naturesaura:placer"), item("naturesaura:infused_iron_block"), item("naturesaura:pickup_stopper"),
    item("naturesaura:grated_chute"), item("naturesaura:moss_generator"), item("naturesaura:powder_placer"),
    item("naturesaura:infused_iron"), item("naturesaura:aura_cache"), item("naturesaura:farming_stencil"), item("naturesaura:birth_spirit"), 
    item("naturesaura:cave_finder"), item("naturesaura:hopper_upgrade"), item("naturesaura:aura_detector"),
    item("naturesaura:nature_altar"), item("naturesaura:range_visualizer"),
    item("naturesaura:infused_slab_double"), item("naturesaura:infused_brick_slab_double"),
]

// the botanist's tools are not disabled due to their custom abilities
for (def tool in ["pickaxe", "axe", "shovel", "sword", "hoe", "helmet", "chest", "pants", "shoes"])
    altarItems.add(item("naturesaura:infused_iron_${tool}"))

offeringItems = [
    item("naturesaura:potion_generator"), item("naturesaura:conversion_catalyst"), item("naturesaura:offering_table"),
    item("naturesaura:spawn_lamp"), item("naturesaura:animal_generator"), item("naturesaura:mover_cart"), item("naturesaura:effect_powder"),
    item("naturesaura:animal_spawner"), item("naturesaura:time_changer"), item("naturesaura:generator_limit_remover"),
    item("naturesaura:firework_generator"), item("naturesaura:projectile_generator"), item("naturesaura:color_changer"),
    item("naturesaura:shockwave_creator"), item("naturesaura:sky_ingot"), item("naturesaura:calling_spirit"),
    item("naturesaura:clock_hand"), item("naturesaura:eye_improved"), item("naturesaura:aura_trove"), 
    item("naturesaura:token_euphoria"), item("naturesaura:token_terror"), item("naturesaura:token_rage"), item("naturesaura:token_grief"),
]

enderItems = [
    item("naturesaura:end_flower"), item("naturesaura:ender_crate"), item("naturesaura:chunk_loader"), item("naturesaura:ender_access"),
]

removedItems = [
    item("naturesaura:oak_generator"), item("naturesaura:auto_crafter"), item("naturesaura:rf_converter"),
    item("naturesaura:dimension_rail_overworld"), item("naturesaura:dimension_rail_nether"), item("naturesaura:dimension_rail_end"),
]
hiddenItems = [item("naturesaura:multiblock_maker")] + removedItems

automationItems = [
    // This has to be gated because of harvest level issues
    item("naturesaura:field_creator"),
]

def setBottleTier(name, tier) {
    def bottle = item("naturesaura:aura_bottle").withNbt(["stored_type": "naturesaura:" + name])
    def predicate = stack -> {
        return stack in bottle
    }
    TooltipEvents.addTierPredicate("aura:" + name, predicate, tier)
}

for (def it in forestItems) TooltipEvents.setTier(it, 2)
for (def it in altarItems) TooltipEvents.setTier(it, 4)
for (def it in offeringItems) TooltipEvents.setTier(it, 6)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in automationItems) TooltipEvents.setTier(it, 8)
for (def it in unobtainableItems) TooltipEvents.setTier(it, 0)
for (def it in removedItems) crafting.removeByOutput(it)
for (def it in hiddenItems) mods.jei.ingredient.hide(it)

setBottleTier("overworld", 2)
setBottleTier("nether", 2)
setBottleTier("other", 4)  // betweenlands
setBottleTier("end", 6)

/*
Recipes needed:
Natural Altar (tier 3 -> tier 4)
Gold Powder (cannot be made in the crafting table)
Hopper Enhancement (tier 6 -> tier 4)
Aura Field Creator (tier 6 -> tier 8)
Offering Table (tier 4 -> tier 6)
Environmental Eye (tier 3 -> tier 2)
Brilliant Fiber (tier 3 -> tier 2)
Gold Leaf/Gold Leaves JEI, Bottles JEI
Bottle and Cork (tier 1 -> tier 2)
Spirit of Calling (tier 4 -> tier 6)
Powder of the Bountiful Core (tier 4 -> tier 6)
Spirit of Birthing JEI
Token of Anger (tier 6 -> tier 2)
Staff of Shadows (tier 6 -> tier 4)
*/
