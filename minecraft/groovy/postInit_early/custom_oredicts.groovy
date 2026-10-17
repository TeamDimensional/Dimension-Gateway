import classes.GatewayHelpers

def citem(name, k=0) {
    return item("gateway:${name}", k)
}

ore("ingotStarsteel").add(citem("starsteel_ingot"))
ore("dustRedstoneAlloy").add(citem("redstone_alloy_dust"))
ore("dustVibrantAlloy").add(citem("vibrant_alloy_dust"))
ore("dustEnergeticAlloy").add(citem("energetic_alloy_dust"))
ore("dustDarkSteel").add(citem("dark_steel_dust"))
ore("dustPulsatingIron").add(citem("pulsating_iron_dust"))

// Variations of Dimensional Shard Ore
ore("oreDimensionalShard").remove(item("rftools:dimensional_shard_ore"))
ore("oreDimensionalShard").remove(item("rftools:dimensional_shard_ore:*"))
ore("oreDimensionalShard").remove(item("rftools:dimensional_shard_ore", 1))
ore("oreDimensionalShard").add(item("rftools:dimensional_shard_ore", 2))
GatewayHelpers.hide(item("rftools:dimensional_shard_ore"))
GatewayHelpers.hide(item("rftools:dimensional_shard_ore", 1))

ore("blockAshedStone").add(item("ee:end_ash"))
ore("oreDenseAquamarine").add(citem("dense_aquamarine_ore"))
ore("oreDenseGravitite").add(citem("dense_gravitite_ore"))
ore("oreDenseIron").add(citem("dense_iron_ore"))
ore("oreDenseGold").add(citem("dense_gold_ore"))
ore("oreDenseCopper").add(citem("dense_copper_ore"))
ore("oreDenseTin").add(citem("dense_tin_ore"))
ore("oreDenseLead").add(citem("dense_lead_ore"))
ore("oreDenseSilver").add(citem("dense_silver_ore"))
