import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("thaumcraft:${name}", k)
}
def gitem(name, k=0) {
    return item("thaumicaugmentation:${name}", k)
}
def eitem(name, k=0) {
    return item("thaumicenergistics:${name}", k)
}
def titem(name, k=0) {
    return item("thaumictinkerer:${name}", k)
}
def citem(name, k=0) {
    return item("congregamystica:${name}", k)
}
def witem(name, k=0) {
    return item("thaumicwonders:${name}", k)
}
def ritem(name, k=0) {
    return item("crimsonrevelations:${name}", k)
}

def tier1Items = [
    gitem("item_grate"), mitem("stone_arcane"), mitem("stone_arcane_brick"),
    mitem("slab_arcane_stone"), mitem("slab_arcane_brick"), titem("kamiresource", 1),
    mitem("log_silverwood"), mitem("leaves_silverwood"), mitem("sapling_silverwood"),
    mitem("slab_silverwood"), mitem("plank_silverwood"), mitem("stairs_silverwood"),
    citem("fence_silverwood"), citem("fence_gate_silverwood"),
]
for (def i in ["aer", "aqua", "ignis", "terra", "ordo", "perditio"]) tier1Items.add(mitem("crystal_${i}"))

def mainItems = [
    mitem("sapling_greatwood"), mitem("log_greatwood"), mitem("leaves_greatwood"), mitem("shimmerleaf"),
    mitem("cinderpearl"), mitem("vishroom"), mitem("plank_greatwood"), mitem("stairs_greatwood"),
    mitem("slab_greatwood"), mitem("flesh_block"),
    citem("mimic_fork"), citem("fence_greatwood"), citem("fence_gate_greatwood"), citem("caster_clockwork"), citem("caster_aura"),
    citem("drill_head_thaumium"), citem("upgrade_refining"),
    witem("hexamite"), witem("alkahest_vat"), witem("oblivion_essentia_jar"), witem("inspiration_engine"),
    witem("disjunction_cloth"), witem("panacea", 1), witem("panacea"), witem("lethe_water"), witem("warp_ring"),
]

def astralItems = [
    gitem("starfield_glass"), gitem("starfield_glass", 2), mitem("quicksilver"), mitem("nugget", 5), mitem("mirrored_glass"),
    mitem("sanity_checker"), titem("kamiresource"), citem("mimic_fork_ranged"),
    witem("flux_capacitor"), witem("vis_capacitor"), witem("flux_distiller"),
    witem("portal_generator"), witem("portal_anchor"), witem("portal_linker"), witem("structure_diviner"),
    witem("alchemist_stone"), witem("transmuter_stone"), witem("alienist_stone"), witem("catalyzation_chamber"), ritem("purifying_shovel"),
]

def transcendentalItems = [
    mitem("metal_alchemical_advanced"), mitem("thaumonomicon", 1), mitem("focus_2"), witem("cleansing_charm"),
]

def infusionItems = [
    gitem("autocaster_placer"), mitem("matrix_speed"), mitem("matrix_cost"),
    mitem("jar_brain"), mitem("infusion_matrix"), mitem("mirror"), mitem("mirror_essentia"), mitem("mind", 1), mitem("turret", 1),
    mitem("hand_mirror"), mitem("verdant_charm"), mitem("charm_undying"), item("gadothaumy:infusion_claw"),
    item("gadothaumy:essentia_compressor"), item("gadothaumy:item_element"), 
    witem("meteorb"), witem("everburning_urn"), witem("ore_diviner"),
    witem("bone_bow"), witem("flying_carpet"), witem("timewinder"), witem("shimmerleaf_seed"), witem("cinderpearl_seed"), witem("vishroom_spore"),
    witem("night_vision_goggles"), witem("sharing_tome"),
]

def crimsonItems = [
    ritem("crimson_fabric"), ritem("embellished_crimson_fabric"), ritem("crimson_plate"), ritem("crimson_sword"), ritem("execution_axe"),
    ritem("crimson_archer_helmet"), ritem("crimson_archer_chestplate"), ritem("crimson_archer_leggings"),
    mitem("crimson_blade"), mitem("crimson_plate_helm"), mitem("crimson_plate_chest"), mitem("crimson_plate_legs"), mitem("crimson_boots"),
    mitem("crimson_robe_helm"), mitem("crimson_robe_chest"), mitem("crimson_robe_legs"), mitem("crimson_praetor_helm"),
    mitem("crimson_praetor_chest"), mitem("crimson_praetor_legs"), 
]

def hoannaItems = [
    gitem("rift_monitor"), gitem("stairs_eldritch_tile"), gitem("starfield_glass", 1), gitem("elytra_harness"),
    mitem("stone_eldritch_tile"), mitem("slab_eldritch"), mitem("pedestal_eldritch"),
    witem("coalescence_matrix"), witem("coalescence_matrix_precursor"),
]

def ichorItems = [
    titem("sky_pearl"), titem("warp_gate"), titem("bedrock_portal"), titem("ichor_block"),
]
for (def i in ["pick", "axe", "shovel", "sword"]) {
    for (def j in ["", "_adv"]) {
        ichorItems.add(titem("ichorium_${i}${j}"))
    }
}
for (def i in ["ichor", "kami"]) {
    for (def j in ["helm", "chest", "legs", "boots"]) {
        ichorItems.add(titem("${i}_${j}"))
    }
}

for (def i in 2..5) ichorItems.add(titem("kamiresource", i))

def voidItems = [
    gitem("impetus_drainer"), gitem("impetus_relay"), gitem("impetus_diffuser"), gitem("impetus_matrix"), gitem("impetus_matrix_base"),
    gitem("rift_feeder"), gitem("rift_mover_input"), gitem("rift_mover_output"), gitem("void_recharge_pedestal"), gitem("arcane_terraformer"),
    gitem("impetus_generator"), gitem("impetus_gate"), gitem("stairs_ancient"), gitem("slab"), gitem("bars"), gitem("strange_crystal"),
    gitem("gauntlet", 1), gitem("void_boots"), gitem("rift_seed", 1), gitem("augment_caster_rift_energy_storage"), gitem("fracture_locator"),
    gitem("primal_cutter"), gitem("impetus_mirror"), gitem("impetus_linker"), gitem("elytra_harness_augment"), gitem("impulse_cannon"),
    gitem("impulse_cannon_augment"), gitem("impulse_cannon_augment", 1), gitem("focus_ancient"), gitem("research_notes"),
    mitem("stone_ancient"), mitem("stone_ancient_tile"), mitem("stone_ancient_rock"), mitem("stone_ancient_glyphed"),
    mitem("stone_ancient_doorway"), mitem("stairs_ancient"), mitem("slab_ancient"), mitem("pedestal_ancient"),
    mitem("metal_void"), mitem("void_siphon"), mitem("primordial_pearl", 32767), mitem("ingot", 1), mitem("nugget", 7), mitem("plate", 3),
    mitem("void_seed"), mitem("void_axe"), mitem("void_sword"), mitem("void_shovel"), mitem("void_pick"), mitem("void_hoe"),
    mitem("primal_crusher"), mitem("void_helm"), mitem("void_chest"), mitem("void_legs"), mitem("void_boots"),
    mitem("void_robe_helm"), mitem("void_robe_chest"), mitem("void_robe_legs"), mitem("voidseer_charm"), mitem("focus_3"), mitem("causality_collapser"),
    citem("drill_head_void"), witem("dimensional_ripper"), witem("primordial_siphon"), witem("madness_engine"), witem("meaty_orb"),
    witem("void_beacon"), witem("primal_destroyer"), witem("primordial_grain"),
    witem("void_fortress_helm"), witem("void_fortress_chest"), witem("void_fortress_legs"),
    witem("voidcaller_helm"), witem("voidcaller_chest"), witem("voidcaller_legs"), witem("void_walker_boots"),
    ritem("ancient_crimson_helmet"), ritem("ancient_crimson_chestplate"), ritem("ancient_crimson_leggings"),
    ritem("crimson_ranger_helmet"), ritem("crimson_ranger_chestplate"), ritem("crimson_ranger_leggings"),
    ritem("crimson_paladin_helmet"), ritem("crimson_paladin_chestplate"), ritem("crimson_paladin_leggings"),
    ritem("primordial_scribing_tools"),
]
for (int i in 0..2) voidItems.add(mitem("loot_bag", i))
for (int i in 0..11) voidItems.add(gitem("stone", i))
for (int i in 0..2) voidItems.add(gitem("urn", i))
for (int i in [3, 5]) voidItems.add(gitem("material", i))
for (int i in 0..3) voidItems.add(gitem("eldritch_lock_key", i))

def creativeItems = [
    gitem("impetus_creative"), gitem("impetus_creative", 1), gitem("rift_seed"), mitem("creative_flux_sponge"), eitem("essentia_cell_creative"),
    witem("creative_essentia_jar"),
]

def removeCrafting = [
    mitem("table_stone"), titem("black_quartz"), titem("black_quartz_block")
]

def removeArcaneCrafting = [
    mitem("smelter_void")
]

def hideFromJei = [
    gitem("crab_vent"), gitem("eldritch_lock_impetus"), gitem("material", 2), gitem("autocaster_placer", 1),
    mitem("ore_cinnabar"), mitem("grass_ambient"),
    mitem("pillar_eldritch"), mitem("pillar_ancient"), mitem("pillar_arcane"),
    mitem("effect_shock"), mitem("effect_sap"), mitem("effect_glimmer"), mitem("empty"), mitem("pech_wand"),
    mitem("enchanted_placeholder"), titem("enchantment_pillar"),
] + removeCrafting + removeArcaneCrafting
for (int i in 0..3) hideFromJei.add(gitem("capstone", i))
for (int i in 0..3) hideFromJei.add(gitem("eldritch_lock", i))
for (int i in 0..1) hideFromJei.add(gitem("obelisk_placer", i))
for (int i in 0..6) hideFromJei.add(mitem("curio", i))
for (int i in 0..7) hideFromJei.add(mitem("cluster", i))
for (def i in 0..8) hideFromJei.add(witem("eldritch_cluster", i))
for (def a in ["rare", "uncommon", "common"]) for (def b in ["crate", "urn"]) hideFromJei.add(mitem("loot_${b}_${a}"))

TooltipEvents.setModTier("thaumcraft", 5)
TooltipEvents.setModTier("thaumictinkerer", 5)
TooltipEvents.setModTier("thaumicaugmentation", 5)
TooltipEvents.setModTier("thaumicenergistics", 9)
TooltipEvents.setModTier("crimsonrevelations", 5)
ore("quartzDark").remove(titem("black_quartz"))
ore("blockQuartzDark").remove(titem("black_quartz_block"))
TooltipEvents.setTooltip(titem("bedrock_portal"), "Created by breaking Bedrock with Awakened Ichorium Pickaxe.")

def predicateBook = stack -> {
    return stack in gitem("augment_builder_power").withNbt(["id": "thaumicaugmentation:strength_emptiness"])
}
TooltipEvents.addTierPredicate("emptiness", predicateBook, 14)

for (def it in tier1Items) TooltipEvents.setTier(it, 1)
for (def it in mainItems) TooltipEvents.setTier(it, 5)
for (def it in astralItems) TooltipEvents.setTier(it, 6)
for (def it in transcendentalItems) TooltipEvents.setTier(it, 9)
for (def it in infusionItems) TooltipEvents.setTier(it, 5)
for (def it in crimsonItems) TooltipEvents.setTier(it, 7)
for (def it in ichorItems) TooltipEvents.setTier(it, 11)
for (def it in hoannaItems) TooltipEvents.setTier(it, 13)
for (def it in voidItems) TooltipEvents.setTier(it, 9)
for (def it in creativeItems) TooltipEvents.setTier(it, 14)
for (def it in removeCrafting) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)

TooltipEvents.setTier(citem("caster_bound"), 11)
TooltipEvents.setTier(citem("caster_elementium"), 14)
TooltipEvents.setTier(citem("blood_scribing_tools"), 11)

// TODO: remove Catalyzation Chamber recipes.
