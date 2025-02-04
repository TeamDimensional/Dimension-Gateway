import classes.GatewayHelpers

def removedMetals = [
    ["Copper", 0],
    ["Tin", 1],
    ["Lead", 2],
    ["Aluminum", 12],
    ["Silver", 13]
]

def removedAlloys = [
    ["Bronze", 0],
    ["Steel", 5],
]

def removedMaterialBlocks = [
    ["Cobalt", 2],
    ["Nickel", 3],
    ["Platinum", 4],
]

def removedQMDMetals = [
    ["Titanium", 3],
    ["Cobalt", 4],
    ["Nickel", 5],
    ["Iridium", 9],
    ["Platinum", 10],
]

def types = [
    ["ingot", "nuclearcraft:ingot"],
    ["dust", "nuclearcraft:dust"],
    ["block", "nuclearcraft:ingot_block"],
]

def typesAlloy = [
    ["ingot", "nuclearcraft:alloy"],
]

def typesQMD = [
    ["ingot", "qmd:ingot"],
    ["dust", "qmd:dust"],
]

def typesMaterialBlock = [
    ["block", "nuclearcraft:material_block"],
]

def removalNodes = [
    [removedMetals, types],
    [removedAlloys, typesAlloy],
    [removedMaterialBlocks, typesMaterialBlock],
    [removedQMDMetals, typesQMD],
]

// The mod doesn't add wrong recipes, so we just delete a bunch of oredicts
for (def pair in removalNodes) {
    def metalsList = pair[0]
    def typesList = pair[1]
    for (def it in metalsList) {
        def name = it[0]
        def key = it[1]
        for (def type in typesList) {
            def theThing = item(type[1], key)
            ore(type[0] + name).remove(theThing)
            GatewayHelpers.hide(theThing)
        }
    }
}

// Also remove the wrong block recipes
crafting.remove("nuclearcraft:material_block")
crafting.remove("nuclearcraft:storage_5")
crafting.remove("nuclearcraft:storage_6")

// Also remove the wrong Aluminium
ore("ingotAluminium").remove(item("nuclearcraft:ingot", 12))
ore("dustAluminium").remove(item("nuclearcraft:dust", 12))
ore("blockAluminium").remove(item("nuclearcraft:ingot_block", 12))

// TODO: fix cobalt dust and titanium stuff
