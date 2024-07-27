import classes.GatewayHelpers

// Iron
ore("dustIron").remove(item("libvulpes:productdust", 1))
ore("plateIron").remove(item("libvulpes:productplate", 1))
ore("stickIron").remove(item("libvulpes:productrod", 1))
crafting.remove("advancedrocketry:stickiron")

// Gold
ore("dustGold").remove(item("libvulpes:productdust", 2))
ore("plateGold").remove(item("libvulpes:productplate", 2))

// Silicon
ore("itemSilicon").remove(item("libvulpes:productingot", 3))
ore("ingotSilicon").remove(item("libvulpes:productingot", 3))
ore("nuggetSilicon").remove(item("libvulpes:productnugget", 3))
ore("dustSilicon").remove(item("libvulpes:productdust", 3))
ore("plateSilicon").remove(item("libvulpes:productplate", 3))

crafting.remove("advancedrocketry:unpackingotsilicon")
crafting.remove("advancedrocketry:unpacknuggetsilicon")

// Copper
ore("dustCopper").remove(item("libvulpes:productdust", 4))
ore("plateCopper").remove(item("libvulpes:productplate", 4))
ore("stickCopper").remove(item("libvulpes:productrod", 4))
ore("nuggetCopper").remove(item("libvulpes:productnugget", 4))
ore("ingotCopper").remove(item("libvulpes:productingot", 4))
ore("blockCopper").remove(item("libvulpes:metal0", 4))

crafting.remove("advancedrocketry:stickcopper")
crafting.remove("advancedrocketry:unpackingotcopper")
crafting.remove("advancedrocketry:unpacknuggetcopper")
crafting.remove("advancedrocketry:unpackblockcopper")
crafting.remove("advancedrocketry:packblockcopper")

// Tin
ore("dustTin").remove(item("libvulpes:productdust", 5))
ore("plateTin").remove(item("libvulpes:productplate", 5))
ore("nuggetTin").remove(item("libvulpes:productnugget", 5))
ore("ingotTin").remove(item("libvulpes:productingot", 5))
ore("blockTin").remove(item("libvulpes:metal0", 5))

crafting.remove("advancedrocketry:unpackingottin")
crafting.remove("advancedrocketry:unpacknuggettin")
crafting.remove("advancedrocketry:unpackblocktin")
crafting.remove("advancedrocketry:packblocktin")

// Steel
ore("dustSteel").remove(item("libvulpes:productdust", 6))
ore("plateSteel").remove(item("libvulpes:productplate", 6))
ore("stickSteel").remove(item("libvulpes:productrod", 6))
ore("nuggetSteel").remove(item("libvulpes:productnugget", 6))
ore("ingotSteel").remove(item("libvulpes:productingot", 6))
ore("gearSteel").remove(item("libvulpes:productgear", 6))
ore("blockSteel").remove(item("libvulpes:metal0", 6))

crafting.remove("advancedrocketry:sticksteel")
crafting.remove("advancedrocketry:unpackingotsteel")
crafting.remove("advancedrocketry:unpacknuggetsteel")
crafting.remove("advancedrocketry:unpackblocksteel")
crafting.remove("advancedrocketry:packblocksteel")
crafting.remove("advancedrocketry:gearsteel")

// Aluminum
ore("dustAluminum").remove(item("libvulpes:productdust", 9))
ore("plateAluminum").remove(item("libvulpes:productplate", 9))
ore("nuggetAluminum").remove(item("libvulpes:productnugget", 9))
ore("ingotAluminum").remove(item("libvulpes:productingot", 9))
ore("blockAluminum").remove(item("libvulpes:metal0", 9))

crafting.remove("advancedrocketry:unpackingotaluminum")
crafting.remove("advancedrocketry:unpacknuggetaluminum")
crafting.remove("advancedrocketry:unpackblockaluminum")
crafting.remove("advancedrocketry:packblockaluminum")

// Iridium
ore("dustIridium").remove(item("libvulpes:productdust", 10))
ore("plateIridium").remove(item("libvulpes:productplate", 10))
ore("nuggetIridium").remove(item("libvulpes:productnugget", 10))
ore("ingotIridium").remove(item("libvulpes:productingot", 10))
ore("blockIridium").remove(item("libvulpes:metal0", 10))

crafting.remove("advancedrocketry:unpackingotiridium")
crafting.remove("advancedrocketry:unpacknuggetiridium")
crafting.remove("advancedrocketry:unpackblockiridium")
crafting.remove("advancedrocketry:packblockiridium")

// Hide all of them
hidden = [item("libvulpes:productgear", 6)]
for (def i in [1, 2, 3, 4, 5, 6, 9, 10]) hidden.add(item("libvulpes:productdust", i))
for (def i in [3, 4, 5, 6, 9, 10]) hidden.add(item("libvulpes:productingot", i))
for (def i in [3, 4, 5, 6, 9, 10]) hidden.add(item("libvulpes:productnugget", i))
for (def i in [3, 4, 5, 6, 9, 10]) hidden.add(item("libvulpes:metal0", i))
for (def i in [1, 2, 3, 4, 5, 6, 9, 10]) hidden.add(item("libvulpes:productplate", i))
for (def i in [1, 4, 6, 10]) hidden.add(item("libvulpes:productrod", i))

for (def it in hidden) GatewayHelpers.hide(it)

// Remove titanium components recipes
crafting.remove("advancedrocketry:sticktitanium")
crafting.remove("advancedrocketry:stickgear")
