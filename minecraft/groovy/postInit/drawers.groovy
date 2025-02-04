def materials = [
    ["oak", item("minecraft:planks"), item("minecraft:wooden_slab")],
    ["spruce", item("minecraft:planks", 1), item("minecraft:wooden_slab", 1)],
    ["birch", item("minecraft:planks", 2), item("minecraft:wooden_slab", 2)],
    ["jungle", item("minecraft:planks", 3), item("minecraft:wooden_slab", 3)],
    ["acacia", item("minecraft:planks", 4), item("minecraft:wooden_slab", 4)],
    ["dark_oak", item("minecraft:planks", 5), item("minecraft:wooden_slab", 5)],
]

for (int i in 0..4) {
    crafting.removeByOutput(item("storagedrawers:basicdrawers", i))
    crafting.removeByOutput(item("storagedrawers:customdrawers", i))
}

def multiplier = 3
def multiplierSlab = 3
for (def row in materials) {
    def nbt = ["material": row[0]]
    def input = row[1]
    def slabInput = row[2]

    crafting.shapedBuilder()
        .name("drawer_${row[0]}")
        .output(item("storagedrawers:basicdrawers").withNbt(nbt) * multiplier)
        .matrix("PPP", " C ", "PPP")
        .key("C", item("ironchest:iron_chest")).key("P", input)
        .register()
    crafting.shapedBuilder()
        .name("drawer1_${row[0]}")
        .output(item("storagedrawers:basicdrawers", 1).withNbt(nbt) * (multiplier * 2))
        .matrix("PCP", "PPP", "PCP")
        .key("C", item("ironchest:iron_chest")).key("P", input)
        .register()
    crafting.shapedBuilder()
        .name("drawer2_${row[0]}")
        .output(item("storagedrawers:basicdrawers", 2).withNbt(nbt) * (multiplier * 4))
        .matrix("CPC", "PPP", "CPC")
        .key("C", item("ironchest:iron_chest")).key("P", input)
        .register()
    crafting.shapedBuilder()
        .name("drawer3_${row[0]}")
        .output(item("storagedrawers:basicdrawers", 3).withNbt(nbt) * (multiplierSlab * 2))
        .matrix("PCP", "PPP", "PCP")
        .key("C", item("ironchest:iron_chest")).key("P", slabInput)
        .register()
    crafting.shapedBuilder()
        .name("drawer4_${row[0]}")
        .output(item("storagedrawers:basicdrawers", 4).withNbt(nbt) * (multiplierSlab * 4))
        .matrix("CPC", "PPP", "CPC")
        .key("C", item("ironchest:iron_chest")).key("P", slabInput)
        .register()
}

crafting.shapedBuilder()
    .name("drawer_f")
    .output(item("storagedrawers:customdrawers") * multiplier)
    .matrix("SSS", " C ", "SSS")
    .key("C", item("ironchest:iron_chest")).key("S", ore("stickWood"))
    .register()
crafting.shapedBuilder()
    .name("drawer1_f")
    .output(item("storagedrawers:customdrawers", 1) * (multiplier * 2))
    .matrix("SCS", "SPS", "SCS")
    .key("C", item("ironchest:iron_chest")).key("S", ore("stickWood")).key("P", ore("plankWood"))
    .register()
crafting.shapedBuilder()
    .name("drawer2_f")
    .output(item("storagedrawers:customdrawers", 2) * (multiplier * 4))
    .matrix("CSC", "SPS", "CSC")
    .key("C", item("ironchest:iron_chest")).key("S", ore("stickWood")).key("P", ore("plankWood"))
    .register()
crafting.shapedBuilder()
    .name("drawer3_f")
    .output(item("storagedrawers:customdrawers", 3) * (multiplierSlab * 2))
    .matrix("SCS", "SPS", "SCS")
    .key("C", item("ironchest:iron_chest")).key("S", ore("stickWood")).key("P", ore("plankWood"))
    .register()
crafting.shapedBuilder()
    .name("drawer4_f")
    .output(item("storagedrawers:customdrawers", 4) * (multiplierSlab * 4))
    .matrix("CSC", "SPS", "CSC")
    .key("C", item("ironchest:iron_chest")).key("S", ore("stickWood")).key("P", ore("plankWood"))
    .register()
