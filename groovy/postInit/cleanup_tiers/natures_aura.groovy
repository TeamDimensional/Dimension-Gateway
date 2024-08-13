import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("naturesaura:${name}", k)
}

forestItems = [
    mitem("ancient_log"), mitem("ancient_bark"), mitem("ancient_planks"), mitem("ancient_stairs"), mitem("ancient_slab"), mitem("ancient_leaves"),
    mitem("ancient_sapling"), mitem("gold_powder"), mitem("wood_stand"), mitem("gold_brick"), mitem("gold_fiber"), mitem("gold_leaf"),
    mitem("ancient_stick"), mitem("bottle_two_the_rebottling"), mitem("eye"),
    mitem("token_joy"), mitem("token_fear"), mitem("token_anger"), mitem("token_sorrow"), mitem("golden_leaves"),
]
unobtainableItems = [mitem("decayed_leaves")]
altarItems = [
    mitem("infused_stone"), mitem("infused_stairs"), mitem("infused_slab"), mitem("infused_brick"), mitem("infused_brick_stairs"),
    mitem("infused_brick_slab"), mitem("furnace_heater"), mitem("crushing_catalyst"), mitem("flower_generator"),
    mitem("placer"), mitem("infused_iron_block"), mitem("pickup_stopper"), mitem("grated_chute"), mitem("moss_generator"), mitem("powder_placer"),
    mitem("infused_iron"), mitem("aura_cache"), mitem("farming_stencil"), mitem("birth_spirit"), 
    mitem("cave_finder"), mitem("hopper_upgrade"), mitem("aura_detector"), mitem("nature_altar"), mitem("range_visualizer"),
    mitem("infused_slab_double"), mitem("infused_brick_slab_double"),
]

// the botanist's tools are not disabled due to their custom abilities
for (def tool in ["pickaxe", "axe", "shovel", "sword", "hoe", "helmet", "chest", "pants", "shoes"])
    altarItems.add(mitem("infused_iron_${tool}"))

offeringItems = [
    mitem("potion_generator"), mitem("conversion_catalyst"), mitem("offering_table"), mitem("spawn_lamp"), mitem("animal_generator"),
    mitem("mover_cart"), mitem("effect_powder"), mitem("animal_spawner"), mitem("time_changer"), mitem("generator_limit_remover"),
    mitem("firework_generator"), mitem("projectile_generator"), mitem("color_changer"), mitem("shockwave_creator"), mitem("sky_ingot"),
    mitem("calling_spirit"), mitem("clock_hand"), mitem("eye_improved"), mitem("aura_trove"), 
    mitem("token_euphoria"), mitem("token_terror"), mitem("token_rage"), mitem("token_grief"),
]

enderItems = [
    mitem("end_flower"), mitem("ender_crate"), mitem("chunk_loader"), mitem("ender_access"),
]

removedItems = [
    mitem("oak_generator"), mitem("auto_crafter"), mitem("rf_converter"),
    mitem("dimension_rail_overworld"), mitem("dimension_rail_nether"), mitem("dimension_rail_end"),
]
hiddenItems = [mitem("multiblock_maker")] + removedItems

automationItems = [
    // This has to be gated because of harvest level issues
    mitem("field_creator"),
]

def setBottleTier(name, tier) {
    def bottle = mitem("aura_bottle").withNbt(["stored_type": "naturesaura:" + name])
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
for (def it in hiddenItems) GatewayHelpers.hide(it)

setBottleTier("overworld", 2)
setBottleTier("nether", 2)
setBottleTier("other", 2)
setBottleTier("end", 6)
