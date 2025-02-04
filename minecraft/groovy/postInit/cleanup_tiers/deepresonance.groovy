import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("deepresonance:${name}", k)
}

def items = [
    mitem("dr_manual"), mitem("radiation_monitor"), mitem("resonating_plate"), mitem("filter"), mitem("spent_filter"),
    mitem("radiation_module"), mitem("rcl_module"), mitem("resonating_crystal"), mitem("generator"), mitem("generator_controller"),
    mitem("energy_collector"), mitem("crystalizer"), mitem("smelter"), mitem("tank"), mitem("purifier"),
    mitem("pedestal"), mitem("advanced_pedestal"), mitem("valve"), mitem("lens"), mitem("laser"),
    mitem("dense_glass"), mitem("dense_obsidian"), mitem("poisoned_dirt"), mitem("resonating_block"),
    mitem("resonating_ore", 2), mitem("radiation_sensor"), mitem("boots"), mitem("helmet"), mitem("chest"), mitem("leggings"),
]

def removeRecipes = [mitem("machine_frame")]

def hideFromJei = [mitem("insert_liquid"), mitem("debug_block")] + removeRecipes

for (def it in items) TooltipEvents.setTier(it, 7)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)

// Fix stupid book recipe before I forget
crafting.remove("deepresonance:dr_manual")
crafting.shapedBuilder()
        .name("tier7/deep_resonance_manual")
        .output(mitem("dr_manual"))
        .matrix(" O ", "RBR", " R ")
        .key("O", mitem("resonating_ore", 2)).key("B", item("minecraft:book")).key("R", ore("dustRedstone"))
        .register()
