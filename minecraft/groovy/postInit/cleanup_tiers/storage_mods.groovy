import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("functionalstoragelegacy:${name}", k)
}
def bitem(name, k=0) {
    return item("retro_sophisticated_backpacks:${name}", k)
}

def tier2Items = [
    mitem("copper_upgrade"), mitem("compacting_drawer"), mitem("simple_compacting_drawer"), bitem("stack_upgrade_starter_tier"),
]

def tier3Items = [
    mitem("gold_upgrade"), mitem("redstone_upgrade"), mitem("fluid_1"), mitem("fluid_2"), mitem("fluid_4"), bitem("feeding_upgrade"),
    bitem("backpack_iron"), bitem("pickup_upgrade"), bitem("filter_upgrade"), bitem("restock_upgrade"), bitem("deposit_upgrade"),
]

def tier4Items = [
    mitem("diamond_upgrade"), mitem("void_upgrade"), mitem("collector_upgrade"), mitem("linking_tool"),
    mitem("storage_controller"), mitem("controller_extension"), bitem("stack_upgrade_tier_1"),
    bitem("advanced_pickup_upgrade"), bitem("advanced_feeding_upgrade"),
    bitem("advanced_deposit_upgrade"), bitem("advanced_restock_upgrade"), bitem("advanced_filter_upgrade"),
]

def tier5Items = [mitem("netherite_upgrade"), bitem("backpack_gold")]

def tier6Items = [bitem("stack_upgrade_tier_2")]

def tier7Items = [
    bitem("backpack_diamond"), mitem("ender_drawer"), mitem("armory_cabinet"), bitem("stack_upgrade_tier_3"),
]

def tier10Items = [bitem("stack_upgrade_tier_4"), bitem("inception_upgrade"), bitem("backpack_obsidian")]

def tier11Items = [bitem("exponential_stack_upgrade")]

def creativeItems = [mitem("creative_vending_upgrade")]

for (def it in tier2Items) TooltipEvents.setTier(it, 2)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in tier5Items) TooltipEvents.setTier(it, 5)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in tier10Items) TooltipEvents.setTier(it, 10)
for (def it in tier12Items) TooltipEvents.setTier(it, 11)
for (def it in creativeItems) TooltipEvents.setTier(it, 14)
