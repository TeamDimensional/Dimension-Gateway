import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def removeCrafting = [
    // Gate to tier 2
    item("tconstruct:smeltery_controller"),
    // Gate to tier 3
    item("immersiveengineering:stone_decoration", 1), item("immersiveengineering:material", 11), item("immersiveengineering:material", 12),
    item("immersiveengineering:material", 10), item("immersiveengineering:tool", 1), item("tconstruct:materials", 18),
    item("tconstruct:casting", 1),
    item("immersiveengineering:connector", 2), item("immersiveengineering:connector", 3),
    item("immersiveengineering:connector", 4), item("immersiveengineering:connector", 5),
    item("roots:grove_stone"), item("roots:fey_crafter"), item("prodigytech:solid_fuel_aeroheater"),
    item("immersiveengineering:material", 8), item("immersiveengineering:material", 13),
    // Gate to tier 4
    item("tconstruct:materials", 15), item("roots:gramary"), item("roots:herb_pouch"),
    item("tconstruct:slimesling"), item("tconstruct:slimesling", 1), item("tconstruct:slimesling", 2),
    item("tconstruct:slimesling", 4), item("tconstruct:slimesling", 3),
    item("storagedrawers:keybutton"), item("storagedrawers:keybutton", 1),
    item("storagedrawers:keybutton", 2), item("storagedrawers:keybutton", 3), item("roots:imbuer"), item("roots:imposer"),
    item("storagedrawers:upgrade_storage", 1), item("tconstruct:toolforge"), item("minecraft:brewing_stand"), item("roots:staff"),
    // Gate to tier 5
    item("essentialcraft:genitem", 1), item("essentialcraft:genitem", 25), item("essentialcraft:genitem", 26), item("essentialcraft:bound_gem"),
    // Gate to tier 8
    item("botania:altar"),
    // Gate to tier 9
    item("botania:manaresource", 3), item("botania:manaresource", 11), 
    item("botania:pool"), item("botania:pool", 2), item("botania:incenseplate"),
    // Gate to tier 12
    item("botania:cellblock"),
    // Gate to tier 15
    item("minecraft:beacon"), item("essentialcraft:soulscriber"),
]

def removePyre = [
    item("roots:baffle_cap_mushroom"), item("roots:cloud_berry"), item("roots:infernal_bulb"), item("roots:dewgonia"),
    item("roots:moonglow_leaf"),
]

def makeUncraftable = removeCrafting + removePyre + [item("roots:ritual_summon_creatures")]

for (def it in removeCrafting) crafting.removeByOutput(it)
for (def it in removePyre) mods.roots.pyre.removeByOutput(it)
for (def it in makeUncraftable) TooltipEvents.setGated(it)
