import com.dimensional.gatewaycore.events.TooltipEvents

def isotopes = [
    "Uranium233",  // "Uranium235", "Uranium238",
    "Neptunium236", "Neptunium237",
    "Plutonium238", "Plutonium239", "Plutonium241", "Plutonium242",
    "Americium241", "Americium242", "Americium243",
    "Curium243", "Curium245", "Curium246", "Curium247",
    "Berkelium247", "Berkelium248",
    "Californium249", "Californium250", "Californium251", "Californium252",
]

for (def iso in isotopes) {
    for (def it in ore("ingot${iso}All").getMatchingStacks()) {
        TooltipEvents.setTooltip(it, "tooltip.gateway.obtain.nc_isotope.${iso}")
    }
}

TooltipEvents.setTooltip(item("nuclearcraft:fission_dust", 5), "tooltip.gateway.obtain.fission_sr")
TooltipEvents.setTooltip(item("nuclearcraft:fission_dust", 6), "tooltip.gateway.obtain.fission_mo")
TooltipEvents.setTooltip(item("nuclearcraft:fission_dust", 7), "tooltip.gateway.obtain.fission_ru")
TooltipEvents.setTooltip(item("nuclearcraft:fission_dust", 8), "tooltip.gateway.obtain.fission_cs")
TooltipEvents.setTooltip(item("nuclearcraft:fission_dust", 9), "tooltip.gateway.obtain.fission_pm")
TooltipEvents.setTooltip(item("nuclearcraft:fission_dust", 10), "tooltip.gateway.obtain.fission_eu")

TooltipEvents.setTooltip(item("nuclearcraft:ingot", 11), "tooltip.gateway.obtain.nc_rare_earth.manganese")
TooltipEvents.setTooltip(item("nuclearcraft:ingot2", 1), "tooltip.gateway.obtain.nc_rare_earth.palladium")
TooltipEvents.setTooltip(item("nuclearcraft:ingot2", 7), "tooltip.gateway.obtain.nc_rare_earth.holmium")
TooltipEvents.setTooltip(item("nuclearcraft:ingot2", 8), "tooltip.gateway.obtain.nc_rare_earth.dysprosium")
TooltipEvents.setTooltip(item("nuclearcraft:ingot2", 9), "tooltip.gateway.obtain.nc_rare_earth.gadolinium")
TooltipEvents.setTooltip(item("nuclearcraft:alloy", 18), "tooltip.gateway.obtain.nc_rare_earth.samarium")

TooltipEvents.setTooltip(item("extrautils2:decorativesolid", 8), "tooltip.gateway.obtain.rainbow_stone")
