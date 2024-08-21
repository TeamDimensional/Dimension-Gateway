import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("chisel:${name}", k)
}

for (def metal in ["copper", "tin", "bronze"])
    for (def i in 0..6) TooltipEvents.setTier(mitem("block${metal}", i), 2)
for (def i in 0..15) TooltipEvents.setTier(mitem("laboratory", i), 2)
for (def i in 0..8) TooltipEvents.setTier(mitem("lapis", i), 2)
for (def i in 0..15) TooltipEvents.setTier(mitem("quartz", i), 2)
for (def i in 0..15) TooltipEvents.setTier(mitem("quartz1", i), 2)
for (def metal in ["electrum", "invar", "gold", "lead", "nickel", "silver", "steel"])
    for (def i in 0..6) TooltipEvents.setTier(mitem("block${metal}", i), 3)
for (def i in 0..13) TooltipEvents.setTier(mitem("gold", i), 3)
for (def i in 0..5) TooltipEvents.setTier(mitem("futura", i), 3)
for (def i in 0..15) TooltipEvents.setTier(mitem("redstone", i), 3)
for (def i in 0..11) TooltipEvents.setTier(mitem("redstone1", i), 3)
for (def i in 0..11) TooltipEvents.setTier(mitem("diamond", i), 4)
for (def i in 0..13) TooltipEvents.setTier(mitem("emerald", i), 4)
for (def i in 0..14) TooltipEvents.setTier(mitem("obsidian", i), 5)
for (def i in 0..15) TooltipEvents.setTier(mitem("certus", i), 6)
for (def i in 0..15) TooltipEvents.setTier(mitem("certus1", i), 6)
for (def i in 0..1) TooltipEvents.setTier(mitem("certus2", i), 6)
for (def i in 0..15) TooltipEvents.setTier(mitem("purpur", i), 6)
for (def i in 0..15) TooltipEvents.setTier(mitem("purpur1", i), 6)
for (def i in 0..4) TooltipEvents.setTier(mitem("purpur2", i), 6)
for (def i in 0..7) TooltipEvents.setTier(mitem("voidstone", i), 6)
for (def i in 0..7) TooltipEvents.setTier(mitem("energizedvoidstone", i), 6)
for (def i in 0..14) TooltipEvents.setTier(mitem("voidstonerunic", i), 6)
for (def i in 0..15) TooltipEvents.setTier(mitem("endstone", i), 6)
for (def i in 0..15) TooltipEvents.setTier(mitem("endstone1", i), 6)
for (def i in 0..6) TooltipEvents.setTier(mitem("endstone2", i), 6)
for (def i in 0..6) TooltipEvents.setTier(mitem("blockcobalt", i), 7)
for (def i in 0..6) TooltipEvents.setTier(mitem("blockplatinum", i), 7)
for (def i in 0..6) TooltipEvents.setTier(mitem("blockuranium", i), 8)

TooltipEvents.setTier(mitem("auto_chisel"), 3)
TooltipEvents.setTier(mitem("chisel_diamond"), 4)
TooltipEvents.setTier(mitem("chisel_hitech"), 5)
TooltipEvents.setTier(mitem("offsettool"), 6)

crafting.remove("chisel:voidstone")
