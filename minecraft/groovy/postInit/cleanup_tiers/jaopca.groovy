import com.dimensional.gatewaycore.events.TooltipEvents

def fluid_materials = [
    "aluminum": 1,
    "ardite": 7,
    "boron": 8,
    "coal": 1,
    "cobalt": 7,
    "copper": 2,
    "diamond": 4,
    "emerald": 4,
    "gold": 3,
    "iridium": 12,
    "iron": 1,
    "lapis": 2,
    "lead": 3,
    "liquified_coralium": 10,
    "lithium": 8,
    "magnesium": 8,
    "nickel": 3,
    "quartz": 2,
    "redstone": 3,
    "silver": 3,
    "tin": 2,
    "thorium": 8,
    "titanium": 7,
    "uranium": 8,
    "cerulean": 2,
    "moonstone": 2,
]

def all_materials = fluid_materials + [
    "air_elemental": 1,
    "amber": 5,
    "dilithium": 8,
    "dimensional_shard": 7,
    "earth_elemental": 1,
    "fire_elemental": 1,
    "mithriline": 8,
    "water_elemental": 1,
    "zanite": 6,
    "ambrosium": 6,
    "resonating": 7,
    "aether": 6,
    "aurorian_coal": 2,
    "aurorian_geode": 2,
]

def prefixes = [
    "ore_cluster": 5,
    "ore_crystal": 3,
    "shard": 7,
    "clump": 3,
    "dirty_dust": 3,
]

def fluid_prefixes = [
    "solution": 6,
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
