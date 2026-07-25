import com.dimensional.gatewaycore.events.TooltipEvents
import classes.EMCData


class PreInitEMCManager {
    def emcValues = [
        "Decor": 1,
        "Building": 1,
        "Speedup": 4,
        "Lighting": 16,
    ]

    def setEmcTooltip(it, value, hideTier = true) {
        TooltipEvents.setTooltip(it, "§eEMC:§r ${value}")
        if (hideTier) {
            TooltipEvents.setTier(it, 0)
        }
    }

    def chiselBlock(name, i, category = "Building") {
        int id = i / 16
        int meta = i % 16
        def idStr = id > 0 ? id : ""
        def it = item("chisel:${name}${idStr}", meta)
        ore("emc${category}Block").add(it)
        setEmcTooltip(it, emcValues[category])
        // mods.thaumcraft.aspect_helper.removeAll(it)
        return it
    }

    def configureItem(it, category = "Building", removeRecipe = true) {
        ore("emc${category}Block").add(it)
        setEmcTooltip(it, emcValues[category])
    }

    def configureCraftable(it) {
        TooltipEvents.setTooltip(it, "tooltip.gateway.obtain.emc_craftable")
        TooltipEvents.setTier(it, 0)
    }

    def ec4BlockConfig(name, category = "Building") {
        for (def i in 0..15) {
            def it = item("essentialcraft:fancyblock.${name}", i)
            configureItem(it, category)
        }
    }

    def bibliocraftBlockConfig(name, count, category = "Decor") {
        for (def i in 0..count) {
            def it = item("bibliocraft:${name}", i)
            configureItem(it, category)
        }
    }

    def removeByOutput(it) {}
}

// Lapis Core is used as an EMC source to make building blocks.
TooltipEvents.setTier(item("essentialcraft:genitem", 45), 2)
def mgr = new PreInitEMCManager()
mgr.setEmcTooltip(item("essentialcraft:genitem", 45), 256, false)
mgr.setEmcTooltip(item("projecte:item.pe_tome"), 1024, false)

EMCData.setup(mgr)
