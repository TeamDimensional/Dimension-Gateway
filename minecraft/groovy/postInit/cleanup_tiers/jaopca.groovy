import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def fluid_materials = [
    "aluminum": 1,
    "ardite": 6,
    "boron": 9,
    "coal": 1,
    "cobalt": 6,
    "copper": 2,
    "diamond": 4,
    "emerald": 4,
    "gold": 3,
    "iridium": 12,
    "iron": 1,
    "lapis": 2,
    "lead": 3,
    "liquified_coralium": 12,
    "lithium": 9,
    "magnesium": 9,
    "nickel": 3,
    "quartz": 2,
    "redstone": 3,
    "silver": 3,
    "tin": 2,
    "thorium": 10,  // TODO: this needs a fix?
    "titanium": 9,
    "uranium": 10,
    "cerulean": 2,
    "moonstone": 2,
    "aquamarine": 6,
    "astral_starmetal": 6,
]

def all_materials = fluid_materials + [
    "air_elemental": 1,
    "amber": 5,
    "dilithium": 10,
    "dimensional_shard": 7,
    "earth_elemental": 1,
    "fire_elemental": 1,
    "mithriline": 10,
    "water_elemental": 1,
    "zanite": 7,
    "ambrosium": 7,
    "resonating": 8,
    "aether": 7,
    "aurorian_coal": 2,
    "aurorian_geode": 2,
]

def prefixes = [
    "ore_cluster": 5,
    "ore_crystal": 3,
    "shard": 8,
    "clump": 3,
    "dirty_dust": 3,
]

def fluid_prefixes = [
    "solution": 4,
]

for (def m in all_materials) {
    for (def p in prefixes) {
        TooltipEvents.setTier(item("jaopca:${p.key}.${m.key}"), Math.max(m.value, p.value))
    }
}
for (def m in fluid_materials) {
    for (def p in fluid_prefixes) {
        TooltipEvents.setTier(fluid("${p.key}_${m.key}"), Math.max(m.value, p.value))
    }
}

GatewayHelpers.hide(item("jaopca:dust.aquamarine"))
GatewayHelpers.hide(item("jaopca:dust.liquified_coralium"))
GatewayHelpers.hide(item("jaopca:block.aquamarine"))
GatewayHelpers.hide(item("jaopca:block.astral_starmetal"))
GatewayHelpers.hide(item("jaopca:block.amber"))
ore("blockAmber").remove(item("jaopca:block.amber"))
GatewayHelpers.hide(item("jaopca:nugget.astral_starmetal"))
GatewayHelpers.hide(item("jaopca:thaumcraft_cluster.astral_starmetal"))
TooltipEvents.setTier(item("jaopca:dust.cerulean"), 3)
TooltipEvents.setTier(item("jaopca:dust.moonstone"), 3)
