import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("factorytech:${name}", k)
}

def decor = [
    mitem("crate"), mitem("scaffold"), mitem("hardhat"), mitem("safetyvest"), mitem("workpants"), mitem("steeltoeboots"), mitem("handbook"),
    mitem("buffercrate"),
]
for (def i in 0..5) decor.add(mitem("metal", i))
for (def i in 0..3) decor.add(mitem("bricks", i))
for (def i in 0..8) decor.add(mitem("smokestack", i))

def logistics = [
    mitem("stackmover"), mitem("filtermover"), mitem("bulkmover"), mitem("autopuller"), mitem("itempusher"), mitem("watercollector"),
    mitem("conveyor"), mitem("elevator"), mitem("bottomhatch"), mitem("rednotifier"),
    mitem("inventorysensor"), mitem("realelevator"), mitem("pulser"), mitem("pulsecounter"), mitem("compacthopper"),
    mitem("trapdoorconveyor"), mitem("pipe"), mitem("valve"), mitem("tankblock"), mitem("fluidpuller"),
    mitem("wrench"), mitem("redwatcher"), mitem("machinepart", 51),
]

def dwarven = [mitem("ore_dust", 16), mitem("ore_dust", 17), mitem("ingot", 6), mitem("ingot", 7)]
def obsidianTier = [mitem("decocoil")]

def removeRecipes = [mitem("batterygen"), mitem("coregen"), mitem("sluice"), mitem("ingot", 5), mitem("ore_dust", 15)]
for (def i in [50, 160, 180]) removeRecipes.add(mitem("machinepart", i))
def hideFromJei = [mitem("ore_dust", 3), mitem("ore_dust", 10)] + removeRecipes
for (def i in [1, 11, 20, 31, 71]) {
    hideFromJei.add(mitem("machinepart", i))
    hideFromJei.add(mitem("salvagepart", i))
    mods.factorytech.reclaimer.removeByInput(mitem("salvagepart", i))
}

TooltipEvents.setModTier("factorytech", 8)
for (def i in decor) TooltipEvents.setTier(i, 1)
for (def i in logistics) TooltipEvents.setTier(i, 3)
for (def i in dwarven) TooltipEvents.setTier(i, 4)
for (def i in obsidianTier) TooltipEvents.setTier(i, 5)
furnace.removeByInput(mitem("ore_dust", 3))
furnace.removeByInput(mitem("ore_dust", 10))
mods.factorytech.high_tech_furnace.removeByInput(mitem("ore_dust", 3))
mods.factorytech.high_tech_furnace.removeByInput(mitem("ore_dust", 10))
mods.factorytech.metal_cutter.removeByInput(mitem("ingot", 5))
mods.factorytech.metal_cutter.removeByInput(mitem("ingot", 6))
mods.factorytech.metal_cutter.removeByInput(mitem("ingot", 7))
mods.factorytech.grindstone.removeByInput(mitem("ingot", 7))
mods.factorytech.grindstone.removeByInput(mitem("machinepart", 11))
mods.factorytech.high_tech_furnace.removeByInput(mitem("ingot", 5))
mods.factorytech.high_tech_furnace.removeByInput(mitem("ingot", 6))
mods.factorytech.high_tech_furnace.removeByInput(mitem("ingot", 7))
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
