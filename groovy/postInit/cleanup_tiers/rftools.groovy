import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("rftools:${name}", k)
}

def tier2Items = [mitem("smartwrench")]
def tier3Items = [
    mitem("rftools_manual"), mitem("rftools_shape_manual"), mitem("text_module"), mitem("inventory_module"), mitem("energy_module"),
    mitem("clock_module"), mitem("fluid_module"), mitem("machineinformation_module"), mitem("computer_module"),
    mitem("elevator_button_module"), mitem("redstone_module"), mitem("counter_module"), mitem("machine_base"), mitem("screen"),
    mitem("screen_controller"), mitem("sequencer_block"), mitem("counter_block"), mitem("logic_block"),
    mitem("invchecker_block"), mitem("sensor_block"), mitem("analog_block"), mitem("digit_block"), mitem("wire_block"), mitem("timer_block"),
    mitem("relay"), mitem("liquid_monitor"), mitem("item_filter"), mitem("elevator"), mitem("level_emitter"),
]
def tier4Items = [mitem("storage_module"), mitem("storage_module", 1), mitem("generic_module"), mitem("filter_module"), mitem("modular_storage")]
def tier5Items = [mitem("storage_module_tablet"), mitem("storage_module", 2)]
def tier6Items = [
    mitem("energyplus_module"), mitem("inventoryplus_module"), mitem("fluidplus_module"), mitem("counterplus_module"),
    mitem("redstone_transmitter_block"), mitem("redstone_receiver_block"), mitem("button_module"), mitem("simple_dialer"),
]

def advItems = [
    mitem("infused_enderpearl"), mitem("advanced_charged_porter"), mitem("matter_booster"), mitem("machine_infuser"),
    mitem("locator"), mitem("remote_scanner"), mitem("powercell_advanced"), mitem("shield_block4"),
]
for (int i in [3, 4, 6, 7]) advItems.add(mitem("shape_card", i))

def eliteItems = [
    mitem("infused_diamond"), mitem("regeneration_module"), mitem("regenerationplus_module"), mitem("speed_module"), mitem("speedplus_module"),
    mitem("haste_module"), mitem("hasteplus_module"), mitem("saturation_module"), mitem("saturationplus_module"), mitem("featherfalling_module"),
    mitem("featherfallingplus_module"), mitem("flight_module"), mitem("peace_essence"), mitem("peaceful_module"), mitem("waterbreathing_module"),
    mitem("nightvision_module"), mitem("blindness_module"), mitem("weakness_module"), mitem("poison_module"), mitem("slowness_module"),
    mitem("glowing_module"), mitem("noteleport_module"), mitem("luck_module"), mitem("environmental_controller"),
]

def unobtainable = [mitem("support_block")]

def removeCrafting = [mitem("network_monitor"), mitem("oredict_module"), mitem("rf_monitor")]

def hideFromJei = [
    mitem("shard_wand"), mitem("developers_delight"), mitem("teleport_probe"), mitem("creative_screen")
] + removeCrafting

def creativeItems = [mitem("powercell_creative")]

TooltipEvents.setModTier("rftools", 7)
for (def it in tier2Items) TooltipEvents.setTier(it, 2)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in tier5Items) TooltipEvents.setTier(it, 5)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in advItems) TooltipEvents.setTier(it, 8)
for (def it in eliteItems) TooltipEvents.setTier(it, 10)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in unobtainable) TooltipEvents.setTier(it, 0)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeCrafting) crafting.removeByOutput(it)
