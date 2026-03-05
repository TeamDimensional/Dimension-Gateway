import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("projecte:${name}", k)
}
def fitem(name, k=0) {
    return item("projecte:item.pe_${name}", k)
}

def t2Items = [
    mitem("transmutation_table"), fitem("transmutation_tablet"), fitem("tome"), fitem("manual"),
]

def removeRecipes = [
    mitem("collector_mk1"), mitem("collector_mk2"), mitem("collector_mk3"),
    mitem("relay_mk1"), mitem("relay_mk2"), mitem("relay_mk3"),
    mitem("dm_furnace"), mitem("rm_furnace"),
    mitem("fuel_block"), mitem("fuel_block", 1), mitem("fuel_block", 2),
    mitem("nova_catalyst"), mitem("nova_cataclysm"),
    fitem("fuel"), fitem("fuel", 1), fitem("fuel", 2),
    fitem("covalence_dust"), fitem("covalence_dust", 1), fitem("covalence_dust", 2),
    fitem("divining_rod_1"), fitem("divining_rod_2"), fitem("divining_rod_3"), fitem("gem_density"), fitem("void_ring"), fitem("volcanite_amulet"),
]

for (def it in 0..15) removeRecipes.add(fitem("alchemical_bag", it))
for (def it in 0..5) removeRecipes.add(fitem("klein_star", it))

def magicItems = [
    fitem("evertide_amulet"), mitem("condenser_mk1"), mitem("condenser_mk2"), mitem("alchemical_chest"),
]

def midgameItems = [
    mitem("interdiction_torch"), fitem("repair_talisman"),
    fitem("ring_iron_band"), fitem("black_hole"), fitem("archangel_smite"),
    fitem("harvest_god"), fitem("ignition"), fitem("zero_ring"),
    fitem("body_stone"), fitem("soul_stone"), fitem("mind_stone"), fitem("life_stone"),
]

def endgameItems = [
    mitem("dm_pedestal"), fitem("philosophers_stone"),
    mitem("matter_block"), mitem("matter_block", 1),
    fitem("matter"), fitem("matter", 1),
    fitem("rm_katar"), fitem("rm_morning_star"), fitem("swrg"),
    fitem("time_watch"), fitem("mercurial_eye"), fitem("arcana_ring"),
    fitem("destruction_catalyst"), fitem("hyperkinetic_lens"), fitem("catalitic_lens"),
]

for (def mat in ["rm", "dm"]) {
    for (def tool in ["pick", "axe", "shovel", "sword", "hoe", "shears", "hammer"]) {
        endgameItems.add(fitem("${mat}_${tool}"))
    }
}
for (def mat in ["rm", "dm", "gem"]) {
    for (def i in 0..3) {
        endgameItems.add(fitem("${mat}_armor_${i}"))
    }
}

def hideFromJei = [
    fitem("water_orb"), fitem("lava_orb"), fitem("randomizer"), fitem("lens_explosive"), fitem("fire_projectile"), fitem("wind_projectile")
] + removeRecipes

for (def it in t2Items) TooltipEvents.setTier(it, 2)
for (def it in magicItems) TooltipEvents.setTier(it, 5)
for (def it in midgameItems) TooltipEvents.setTier(it, 10)
for (def it in endgameItems) TooltipEvents.setTier(it, 15)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)
