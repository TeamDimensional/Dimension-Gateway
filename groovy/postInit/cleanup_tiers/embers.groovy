import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("embers:${name}", k)
}

def ashItems = [
    mitem("ashen_stone_slab"), mitem("ashen_brick_slab"), mitem("ashen_tile_slab"), mitem("ashen_brick"), mitem("ashen_stone"), mitem("ashen_tile"),
    mitem("stairs_ashen_brick"), mitem("stairs_ashen_stone"), mitem("stairs_ashen_tile"), mitem("wall_ashen_brick"), mitem("wall_ashen_stone"),
    mitem("wall_ashen_tile"), 
]

def earlyItems = [
    mitem("tinker_hammer"), mitem("tinker_lens"), mitem("ashen_amulet"), mitem("block_tank"), mitem("fluid_dropper"), mitem("fluid_gauge"),
    mitem("fluid_transfer"), mitem("item_dropper"), mitem("item_pipe"), mitem("item_pump"), mitem("item_transfer"), mitem("large_tank"),
    mitem("pipe"), mitem("pump"), mitem("stone_edge"), mitem("stone_valve"), mitem("vacuum"),
]

def items = [
    mitem("adhesive"), mitem("anti_tinker_lens"), mitem("ashen_cloak_boots"), mitem("ashen_cloak_chest"), mitem("ashen_cloak_head"),
    mitem("ashen_cloak_legs"), mitem("ashen_cloth"), mitem("aspectus_copper"), mitem("aspectus_dawnstone"), mitem("aspectus_iron"),
    mitem("aspectus_lead"), mitem("aspectus_silver"), mitem("axe_clockwork"), mitem("blasting_core"), mitem("caster_orb"),
    mitem("crystal_ember"), mitem("diffraction_barrel"), mitem("dust_ember"), mitem("eldritch_insignia"),
    mitem("ember_cartridge"), mitem("ember_cluster"), mitem("ember_detector"), mitem("ember_jar"), mitem("flame_barrier"),
    mitem("focal_lens"), mitem("glimmer_lamp"), mitem("glimmer_shard"), mitem("grandhammer"), mitem("ignition_cannon"),
    mitem("inflictor_gem"), mitem("intelligent_apparatus"), mitem("jet_augment"), mitem("pickaxe_clockwork"),
    mitem("resonating_bell"), mitem("shard_ember"), mitem("shifting_scales"), mitem("reaction_chamber"), mitem("staff_ember"),
    mitem("superheater"), mitem("wildfire_core"), mitem("winding_gears"), mitem("tyrfing"), mitem("ingot_dawnstone"), mitem("nugget_dawnstone"),
    mitem("plate_dawnstone"), mitem("dawnstone_mail"), mitem("ember_amulet"), mitem("ember_belt"), mitem("ember_ring"),
    mitem("explosion_charm"), mitem("ember_bulb"), mitem("nonbeliever_amulet"), mitem("alchemy_pedestal"), mitem("alchemy_tablet"),
    mitem("archaic_edge"), mitem("archaic_light"), mitem("auto_hammer"), mitem("beam_cannon"), mitem("beam_splitter"),
    mitem("block_furnace"), mitem("block_lantern"), mitem("boiler"), mitem("catalytic_plug"), mitem("catalyzer"), 
    mitem("clockwork_attenuator"), mitem("combustor"), mitem("copper_cell"), mitem("crystal_cell"), mitem("dawnstone_anvil"),
    mitem("ember_activator"), mitem("ember_bore"), mitem("ember_gauge"), mitem("ember_injector"), mitem("ember_relay"),
    mitem("ember_siphon"), mitem("geo_separator"), mitem("inferno_forge"), mitem("item_request"), mitem("mech_accessor"),
    mitem("mech_core"), mitem("mini_boiler"), mitem("mixer"), mitem("reaction_chamber"), mitem("reactor"), mitem("stirling"),
    mitem("seed_aluminum"), mitem("seed_copper"), mitem("seed_dawnstone"), mitem("block_dawnstone"), mitem("seed_gold"),
    mitem("seed_iron"), mitem("seed_lead"), mitem("seed_nickel"), mitem("seed_silver"), mitem("seed_tin"),
    mitem("ember_emitter"), mitem("ember_receiver"), mitem("ember_funnel"), mitem("ember_pulser"), mitem("charger"), mitem("ember_pipe"),
    mitem("explosion_pedestal"), mitem("heat_coil"),
]

def tier7Items = [mitem("breaker")]

def creativeItems = [mitem("creative_ember_source")]

def stamps = ["bar", "flat", "gear", "plate", "rod", "round"]
def removeRecipes = [
    mitem("archaic_circuit"), mitem("cinder_plinth"), mitem("field_chart"), mitem("mechanical_pump"), mitem("stamper"), mitem("stamper_base")
]
def removeFurnace = []
for (def it in stamps) {
    removeRecipes.add(mitem("stamp_${it}_raw"))
    removeFurnace.add(mitem("stamp_${it}"))
}
def removeAlchemy = [mitem("dust_metallurgic"), mitem("isolated_materia")]

def hideFromJei = [
    mitem("alchemic_waste"), mitem("spark_plug"), mitem("item_gauge"), mitem("turret"),
    mitem("ashen_brick_slab_double"), mitem("ashen_stone_slab_double"), mitem("ashen_tile_slab_double"), mitem("block_caminite_brick_slab_double")
] + removeRecipes + removeAlchemy + removeFurnace

for (def it in ashItems) TooltipEvents.setTier(it, 2)
for (def it in earlyItems) TooltipEvents.setTier(it, 3)
for (def it in items) TooltipEvents.setTier(it, 6)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in removeFurnace) furnace.removeByOutput(it)
