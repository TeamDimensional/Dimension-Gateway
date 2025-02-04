import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("tconstruct:${name}", k)
}

def searedItems = [
    mitem("faucet"), mitem("channel"), mitem("smeltery_io"), mitem("casting"), mitem("tinker_tank_controller"), mitem("seared_glass"),
    mitem("seared_furnace_controller"), mitem("casting", 1), mitem("toolforge"),
]
for (int i in 2..11) searedItems.add(mitem("seared", i))
for (int i in 2..11) searedItems.add(mitem("seared_slab", i))
for (int i in 0..2) searedItems.add(mitem("seared_tank", i))
for (def i in ["paver", "brick", "brick_cracked", "brick_fancy", "brick_square", "brick_triangle", "brick_small", "road", "tile", "creeper"])
    searedItems.add(mitem("seared_stairs_${i}"))

def requiresSmeltery = [
    mitem("smeltery_controller"), mitem("casting", 1), mitem("firewood"), mitem("firewood", 1),
    mitem("nuggets", 3), mitem("nuggets", 4), mitem("nuggets", 5), mitem("ingots", 3), mitem("ingots", 4), mitem("ingots", 5),
    mitem("metal", 3), mitem("metal", 4), mitem("metal", 5), mitem("cast"), mitem("firewood_stairs"), mitem("lavawood_stairs"),
    mitem("firewood_slab"), mitem("firewood_slab", 1), mitem("edible", 33), mitem("clear_glass"), mitem("fancy_frame", 6), mitem("seared"),
    mitem("seared", 1), mitem("seared_slab"), mitem("seared_slab", 1), mitem("seared_stairs_stone"), mitem("seared_stairs_cobble"),
]
for (int i in 0..15) requiresSmeltery.add(mitem("clear_stained_glass", i))
for (int i in 0..3) requiresSmeltery.add(mitem("cast_custom", i))

def requiresFey = [mitem("materials", 18), mitem("materials", 19)]

def requiresGemstones = [mitem("materials", 15), mitem("materials", 16), mitem("metal", 6)]

def requiresEvilcraft = []
for (int i in 0..4) requiresEvilcraft.add(mitem("slimesling", i))

def requiresObsidian = [mitem("fancy_frame", 0), mitem("fancy_frame", 1), mitem("fancy_frame", 5), mitem("materials", 14)]
def requiresAoE = [mitem("materials", 12), mitem("materials", 13)]
def cobaltArditeItems = [
    mitem("fancy_frame", 2), mitem("fancy_frame", 3), mitem("fancy_frame", 4), mitem("ore"), mitem("ore", 1),
    mitem("nuggets"), mitem("nuggets", 1), mitem("nuggets", 2), mitem("ingots"), mitem("ingots", 1), mitem("ingots", 2),
    mitem("metal"), mitem("metal", 1), mitem("metal", 2),
]

def removeThese = [
    mitem("wooden_hopper"), mitem("throwball", 1), mitem("wood_rail"), mitem("wood_rail_trapdoor"), mitem("piggybackpack"), mitem("soil"),
]

def hideFromJei = [mitem("clay_cast"), mitem("cast_custom", 4)] + removeThese

def creativeItems = [mitem("materials", 50)]

for (def it in searedItems) TooltipEvents.setTier(it, 3)
for (def it in requiresSmeltery) TooltipEvents.setTier(it, 3)
for (def it in requiresFey) TooltipEvents.setTier(it, 3)
for (def it in requiresGemstones) TooltipEvents.setTier(it, 4)
for (def it in requiresEvilcraft) TooltipEvents.setTier(it, 4)
for (def it in requiresAoE) TooltipEvents.setTier(it, 4)
for (def it in requiresObsidian) TooltipEvents.setTier(it, 5)
for (def it in cobaltArditeItems) TooltipEvents.setTier(it, 7)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in removeThese) crafting.removeByOutput(it)
for (def it in hideFromJei) GatewayHelpers.hide(it)

TooltipEvents.setUnlock(mitem("materials"), 3)
