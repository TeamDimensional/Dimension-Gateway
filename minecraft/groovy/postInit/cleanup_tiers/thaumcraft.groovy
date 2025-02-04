import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("thaumcraft:${name}", k)
}
def aitem(name, k=0) {
    return item("thaumadditions:${name}", k)
}
def gitem(name, k=0) {
    return item("thaumicaugmentation:${name}", k)
}
def eitem(name, k=0) {
    return item("thaumicenergistics:${name}", k)
}

def tier1Items = [
    gitem("item_grate"), aitem("iron_framed_greatwood"), aitem("chiseled_greatwood"), mitem("stone_arcane"), mitem("stone_arcane_brick"),
    mitem("slab_arcane_stone"), mitem("slab_arcane_brick"),
]
for (def i in ["aer", "aqua", "ignis", "terra", "ordo", "perditio"]) tier1Items.add(mitem("crystal_${i}"))

def mainItems = [
    aitem("odour_powder"), aitem("fragnant_pendant"), aitem("traveller_belt"), aitem("bone_eye"), aitem("vis_scribing_tools", 32767),
    aitem("knowledge_tome"), aitem("disenchant_fabric"), aitem("dawn_totem"), aitem("twilight_totem"), aitem("seal_globe"), aitem("seal"),
    aitem("thaumic_lectern"), aitem("essentia_sink"), aitem("jar_brass"), aitem("jar_thaumium"), aitem("crystal_block"),
    aitem("flux_concentrator"), aitem("taintkin"), aitem("taintkin_lit"), aitem("taintwood_planks"), aitem("chiseled_amber_block"),
    aitem("brass_plated_silverwood"), aitem("amber_lamp"), aitem("crystal_lamp"), mitem("sapling_greatwood"), mitem("sapling_silverwood"),
    mitem("log_greatwood"), mitem("log_silverwood"), mitem("leaves_greatwood"), mitem("leaves_silverwood"), mitem("shimmerleaf"),
    mitem("cinderpearl"), mitem("vishroom"), mitem("plank_greatwood"), mitem("plank_silverwood"), mitem("stairs_greatwood"),
    mitem("stairs_silverwood"), mitem("slab_greatwood"), mitem("slab_silverwood"), mitem("flesh_block"),
]

def tier7Items = [
    gitem("starfield_glass"), gitem("starfield_glass", 2), mitem("quicksilver"), mitem("nugget", 5), mitem("mirrored_glass"),
    mitem("sanity_checker"),
]

def mithrilliumItems = [
    aitem("mithrillium_nugget"), aitem("mithrillium_ingot"), aitem("mithrillium_plate"), aitem("the_beheader"), aitem("mithrillium_smelter"),
    aitem("jar_mithrillium"), aitem("mithrillium_block"), mitem("metal_alchemical_advanced"), mitem("thaumonomicon", 1), mitem("focus_2"),
]

def infusionItems = [
    eitem("essentia_cell_64k"), eitem("essentia_component_64k"), eitem("upgrade_arcane"), eitem("infusion_provider"),
    gitem("autocaster_placer"), aitem("seal_symbol"), mitem("matrix_speed"), mitem("matrix_cost"),
    mitem("jar_brain"), mitem("infusion_matrix"), mitem("mirror"), mitem("mirror_essentia"), mitem("mind", 1), mitem("turret", 1),
    mitem("hand_mirror"), mitem("verdant_charm"), mitem("charm_undying"),
]

def hoannaItems = [
    gitem("rift_monitor"), gitem("stairs_eldritch_tile"), gitem("starfield_glass", 1), gitem("elytra_harness"), aitem("void_anvil"),
    aitem("jar_eldritch"), mitem("stone_eldritch_tile"), mitem("slab_eldritch"), mitem("pedestal_eldritch"),
]

def voidItems = [
    gitem("impetus_drainer"), gitem("impetus_relay"), gitem("impetus_diffuser"), gitem("impetus_matrix"), gitem("impetus_matrix_base"),
    gitem("rift_feeder"), gitem("rift_mover_input"), gitem("rift_mover_output"), gitem("void_recharge_pedestal"), gitem("arcane_terraformer"),
    gitem("impetus_generator"), gitem("impetus_gate"), gitem("stairs_ancient"), gitem("slab"), gitem("bars"), gitem("strange_crystal"),
    gitem("gauntlet", 1), gitem("void_boots"), gitem("rift_seed", 1), gitem("augment_caster_rift_energy_storage"), gitem("fracture_locator"),
    gitem("primal_cutter"), gitem("impetus_mirror"), gitem("impetus_linker"), gitem("elytra_harness_augment"), gitem("impulse_cannon"),
    gitem("impulse_cannon_augment"), gitem("impulse_cannon_augment", 1), gitem("focus_ancient"), gitem("research_notes"),
    aitem("void_thaumometer"), aitem("wormhole_mirror"), aitem("void_seed"), aitem("chester"), aitem("void_fruit"),
    mitem("stone_ancient"), mitem("stone_ancient_tile"), mitem("stone_ancient_rock"), mitem("stone_ancient_glyphed"),
    mitem("stone_ancient_doorway"), mitem("stairs_ancient"), mitem("slab_ancient"), mitem("pedestal_ancient"),
    mitem("metal_void"), mitem("void_siphon"), mitem("primordial_pearl", 32767), mitem("ingot", 1), mitem("nugget", 7), mitem("plate", 3),
    mitem("void_seed"), mitem("void_axe"), mitem("void_sword"), mitem("void_shovel"), mitem("void_pick"), mitem("void_hoe"),
    mitem("primal_crusher"), mitem("void_helm"), mitem("void_chest"), mitem("void_legs"), mitem("void_boots"),
    mitem("void_robe_helm"), mitem("void_robe_chest"), mitem("void_robe_legs"), mitem("voidseer_charm"), mitem("focus_3"),
]
for (int i in 0..11) voidItems.add(gitem("stone", i))
for (int i in 0..2) voidItems.add(gitem("urn", i))
for (int i in [3, 5]) voidItems.add(gitem("material", i))
for (int i in 0..3) voidItems.add(gitem("eldritch_lock_key", i))
for (def t in ["pickaxe", "axe", "shovel", "hoe"]) voidItems.add(aitem("void_elemental_${t}"))

def creativeItems = [gitem("impetus_creative"), gitem("impetus_creative", 1), gitem("rift_seed"), mitem("creative_flux_sponge")]

def unknownItems = [
    mitem("crimson_blade"), mitem("crimson_plate_helm"), mitem("crimson_plate_chest"), mitem("crimson_plate_legs"), mitem("crimson_boots"),
    mitem("crimson_robe_helm"), mitem("crimson_robe_chest"), mitem("crimson_robe_legs"), mitem("crimson_praetor_helm"),
    mitem("crimson_praetor_chest"), mitem("crimson_praetor_legs"), 
]

def removeCrafting = [
    mitem("table_stone"),
]

def removeArcaneCrafting = [
    mitem("smelter_void")
]

def hideFromJei = [
    gitem("crab_vent"), gitem("eldritch_lock_impetus"), gitem("material", 2), gitem("autocaster_placer", 1),
    aitem("recharge_charm"), mitem("ore_cinnabar"), mitem("grass_ambient"),
    mitem("pillar_eldritch"), mitem("pillar_ancient"), mitem("pillar_arcane"),
    mitem("effect_shock"), mitem("effect_sap"), mitem("effect_glimmer"), mitem("empty"), mitem("pech_wand"),
    mitem("enchanted_placeholder"),
] + removeCrafting + removeArcaneCrafting
for (int i in 0..3) hideFromJei.add(gitem("capstone", i))
for (int i in 0..3) hideFromJei.add(gitem("eldritch_lock", i))
for (int i in 0..1) hideFromJei.add(gitem("obelisk_placer", i))
for (int i in 0..6) hideFromJei.add(mitem("curio", i))
for (int i in 0..2) hideFromJei.add(mitem("loot_bag", i))
for (def a in ["rare", "uncommon", "common"]) for (def b in ["crate", "urn"]) hideFromJei.add(mitem("loot_${b}_${a}"))

TooltipEvents.setModTier("thaumcraft", 5)
TooltipEvents.setModTier("thaumadditions", 12)
TooltipEvents.setModTier("thaumicaugmentation", 5)
TooltipEvents.setModTier("thaumicenergistics", 9)
TooltipEvents.setUnlock(mitem("causality_collapser"), 14)

def predicateBook = stack -> {
    return stack in gitem("augment_builder_power").withNbt(["id": "thaumicaugmentation:strength_emptiness"])
}
TooltipEvents.addTierPredicate("emptiness", predicateBook, 14)

for (def it in tier1Items) TooltipEvents.setTier(it, 1)
for (def it in mainItems) TooltipEvents.setTier(it, 5)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in mithrilliumItems) TooltipEvents.setTier(it, 9)
for (def it in infusionItems) TooltipEvents.setTier(it, 12)
for (def it in hoannaItems) TooltipEvents.setTier(it, 13)
for (def it in voidItems) TooltipEvents.setTier(it, 14)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in removeCrafting) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)
