import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("projecte:${name}", k)
}
def fitem(name, k=0) {
    return item("projecte:item.pe_${name}", k)
}

def t2Items = [
    mitem("transmutation_table"), fitem("transmutation_tablet"), fitem("tome"),
]

def removeRecipes = [
    mitem("collector_mk1"), mitem("collector_mk2"), mitem("collector_mk3"),
    mitem("relay_mk1"), mitem("relay_mk2"), mitem("relay_mk3"),
    mitem("dm_furnace"), mitem("rm_furnace"),
    mitem("fuel_block"), mitem("fuel_block", 1), mitem("fuel_block", 2),
    mitem("nova_catalyst"), mitem("nova_cataclysm"), mitem("interdiction_torch"),
    fitem("fuel"), fitem("fuel", 1), fitem("fuel", 2),
    fitem("covalence_dust"), fitem("covalence_dust", 1), fitem("covalence_dust", 2),
    fitem("divining_rod_1"), fitem("divining_rod_2"), fitem("divining_rod_3"), fitem("gem_density"), fitem("void_ring"), fitem("volcanite_amulet"),
    fitem("mercurial_eye"),
]

for (def it in 0..15) removeRecipes.add(fitem("alchemical_bag", it))
for (def it in 0..5) removeRecipes.add(fitem("klein_star", it))

def magicItems = [
    fitem("evertide_amulet"), mitem("condenser_mk1"), mitem("condenser_mk2"), mitem("alchemical_chest"),
]

def midgameItems = [
    fitem("ring_iron_band"), fitem("black_hole"), fitem("archangel_smite"),
    fitem("harvest_god"), fitem("ignition"), fitem("zero_ring"),
    fitem("body_stone"), fitem("soul_stone"), fitem("mind_stone"), fitem("life_stone"),
    mitem("matter_block"), fitem("matter"), fitem("time_watch"),
]

def endgameItems = [
    mitem("dm_pedestal"), fitem("philosophers_stone"),
    mitem("matter_block", 1), fitem("matter", 1),
    fitem("rm_katar"), fitem("rm_morning_star"), fitem("swrg"), fitem("arcana_ring"),
    fitem("destruction_catalyst"), fitem("hyperkinetic_lens"), fitem("catalitic_lens"),
]

for (def tool in ["pick", "axe", "shovel", "sword", "hoe", "shears", "hammer"]) {
    midgameItems.add(fitem("dm_${tool}"))
    endgameItems.add(fitem("rm_${tool}"))
}
for (def i in 0..3) {
    midgameItems.add(fitem("dm_armor_${i}"))
    endgameItems.add(fitem("rm_armor_${i}"))
    endgameItems.add(fitem("gem_armor_${i}"))
}

def hideFromJei = [
    fitem("water_orb"), fitem("lava_orb"), fitem("randomizer"), fitem("lens_explosive"), fitem("fire_projectile"), fitem("wind_projectile")
] + removeRecipes

for (def it in t2Items) TooltipEvents.setTier(it, 2)
for (def it in magicItems) TooltipEvents.setTier(it, 5)
for (def it in midgameItems) TooltipEvents.setTier(it, 10)
TooltipEvents.setTier(fitem("repair_talisman"), 11)
for (def it in endgameItems) TooltipEvents.setTier(it, 14)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)
