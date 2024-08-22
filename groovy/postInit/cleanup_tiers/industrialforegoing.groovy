import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("industrialforegoing:${name}", k)
}

def tier3Items = [item("teslacorelib:wrench")]

def devices = [
    mitem("enchantment_refiner"), mitem("animal_independence_selector"), mitem("animal_stock_increaser"), mitem("black_hole_unit"),
    mitem("water_condensator"), mitem("block_placer"), mitem("block_destroyer"), mitem("mob_detector"), mitem("bioreactor"),
    mitem("dye_mixer"), mitem("enchantment_invoker"), mitem("animal_growth_increaser"), mitem("fluid_pump"),
    mitem("fluid_crafter"), mitem("item_splitter"), mitem("froster"), mitem("adult_filter"), mitem("black_hole_label"),
]
for (def i in 0..11) devices.add(mitem("range_addon", i))
for (def i in 0..15) devices.add(mitem("artificial_dye", i))

def advDevices = [
    mitem("black_hole_controller_reworked"),
]

def items = [
    mitem("enchantment_extractor"), mitem("enchantment_aplicator"), mitem("mob_relocator"), mitem("potion_enervator"),
    mitem("crop_sower"), mitem("crop_enrich_material_injector"), mitem("crop_recolector"), mitem("water_resources_collector"),
    mitem("animal_resource_harvester"), mitem("mob_slaughter_factory"), mitem("mob_duplicator"), mitem("tree_fluid_extractor"),
    mitem("latex_processing_unit"), mitem("sewage_composter_solidifier"), mitem("animal_byproduct_recolector"),
    mitem("sludge_refiner"), mitem("lava_fabricator"), mitem("spores_recreator"), mitem("material_stonework_factory"),
    mitem("black_hole_tank"), mitem("hydrator"), mitem("wither_builder"), mitem("plant_interactor"),
    mitem("ore_washer"), mitem("ore_fermenter"), mitem("ore_sieve"), mitem("tinydryrubber"), mitem("plastic"), mitem("fertilizer"),
    mitem("meat_feeder"), mitem("mob_imprisonment_tool"), mitem("pink_slime"), mitem("pink_slime_ingot"), mitem("infinity_drill"),
    mitem("energy_field_provider"), mitem("energy_field_addon"), mitem("leaf_shearing"), mitem("fortune_addon"),
    item("teslacorelib:base_addon"), item("teslacorelib:energy_tier1"), item("teslacorelib:energy_tier2"),
    item("teslacorelib:speed_tier1"), item("teslacorelib:speed_tier2"),
]
for (def i in 0..6) items.add(mitem("conveyor_upgrade", i))
for (def i in 0..15) items.add(mitem("conveyor", i))
for (def a in ["itemstack", "fluid"]) for (def b in ["pull", "push"]) items.add(mitem("${a}_transfer_addon_${b}"))

def removeCrafting = [
    mitem("ore_processor"), mitem("laser_base"), mitem("laser_drill"), mitem("resourceful_furnace"), mitem("villager_trade_exchanger"),
    mitem("oredictionary_converter"), mitem("protein_reactor"), mitem("fluiddictionary_converter"),
    mitem("dryrubber"), mitem("straw"),
]
for (def i in 0..15) {
    removeCrafting.add(mitem("laser_lens", i))
    removeCrafting.add(mitem("laser_lens_inverted", i))
}

def hideFromJei = [
    mitem("black_hole_controller"), mitem("protein_generator"),
] + removeCrafting

for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in devices) TooltipEvents.setTier(it, 7)
for (def it in advDevices) TooltipEvents.setTier(it, 8)
for (def it in items) TooltipEvents.setTier(it, 10)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeCrafting) crafting.removeByOutput(it)

TooltipEvents.setTier(fluid("if.protein"), 0)
mods.jei.ingredient.hide(fluid("if.protein"))
TooltipEvents.setUnlock(item("teslacorelib:machine_case"), 10)
