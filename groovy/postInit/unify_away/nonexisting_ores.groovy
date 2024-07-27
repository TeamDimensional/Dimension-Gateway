import classes.GatewayHelpers

// Variations of Quartz
ore("oreCertusQuartz").remove(item("appliedenergistics2:quartz_ore"))
ore("oreCertusQuartz").remove(item("appliedenergistics2:charged_quartz_ore"))
ore("oreChargedCertusQuartz").remove(item("appliedenergistics2:charged_quartz_ore"))
ore("oreQuartzBlack").remove(item("actuallyadditions:block_misc", 3))
ore("oreQuartz").remove(item("embers:ore_quartz"))
ore("oreQuartz").remove(item("thaumcraft:ore_quartz"))
GatewayHelpers.hide(item("appliedenergistics2:quartz_ore"))
GatewayHelpers.hide(item("appliedenergistics2:charged_quartz_ore"))
GatewayHelpers.hide(item("actuallyadditions:block_misc", 3))
GatewayHelpers.hide(item("embers:ore_quartz"))
GatewayHelpers.hide(item("thaumcraft:ore_quartz"))

// Variations of Resonating Ore
// TODO: adjust the JEI handler for DR Smelter so it properly displays that the End variation is smeltable
ore("oreResonating").remove(item("deepresonance:resonating_ore"))
ore("oreResonating").add(item("deepresonance:resonating_ore", 2))
GatewayHelpers.hide(item("deepresonance:resonating_ore"))
GatewayHelpers.hide(item("deepresonance:resonating_ore", 1))

// Dark Ore
ore("oreDark").remove(item("evilcraft:dark_ore"))
GatewayHelpers.hide(item("evilcraft:dark_ore"))

// Copper, Tin, etc.
ore("oreCopper").remove(item("nuclearcraft:ore"))
ore("oreCopper").remove(item("libvulpes:ore0", 4))
ore("oreTin").remove(item("nuclearcraft:ore", 1))
ore("oreTin").remove(item("libvulpes:ore0", 5))
ore("oreLead").remove(item("nuclearcraft:ore", 2))
ore("oreAluminum").remove(item("libvulpes:ore0", 9))
GatewayHelpers.hide(item("nuclearcraft:ore"))
GatewayHelpers.hide(item("nuclearcraft:ore", 1))
GatewayHelpers.hide(item("nuclearcraft:ore", 2))
GatewayHelpers.hide(item("libvulpes:ore0", 4))
GatewayHelpers.hide(item("libvulpes:ore0", 5))
GatewayHelpers.hide(item("libvulpes:ore0", 9))

// Variations of Dimensional Shard Ore
ore("oreDimensionalShard").remove(item("rftools:dimensional_shard_ore"))
ore("oreDimensionalShard").remove(item("rftools:dimensional_shard_ore", 1))
GatewayHelpers.hide(item("rftools:dimensional_shard_ore"))
GatewayHelpers.hide(item("rftools:dimensional_shard_ore", 1))
