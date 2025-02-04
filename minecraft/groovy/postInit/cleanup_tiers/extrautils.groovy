import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("extrautils2:${name}", k)
}

def tier3Items = [
    mitem("soundmuffler"), mitem("trashcanenergy"), mitem("redstoneclock"), mitem("wrench"), mitem("filter"), mitem("filterfluids"),
    mitem("redstonelantern"), mitem("trashchest"), mitem("flattransfernode"), mitem("flattransfernode", 1),
]
for (def i in [0, 1, 2, 5, 6]) tier3Items.add(mitem("grocket", i))

def tier4Items = [
    mitem("itembuilderswand"), mitem("itemdestructionwand"), mitem("sickle_diamond"), mitem("pipe"), 
]

def tier5Items = [
    mitem("angelblock"),
]

def tier6Items = [
    mitem("grocket", 3), mitem("grocket", 4),
]

def items = [
    mitem("snowglobe"), mitem("snowglobe", 1), mitem("unstableingots"), mitem("unstableingots", 1), mitem("unstableingots", 2),
    mitem("supermobspawner"), mitem("cursedearth"), mitem("endershard"), mitem("resonator"), mitem("suncrystal", 32767), mitem("screen"),
    mitem("goldenlasso"), mitem("goldenlasso", 1), mitem("chickenring"), mitem("chickenring", 1), mitem("playerchest"),
    mitem("contract"), mitem("chunkloader"), mitem("bagofholding"), mitem("crafter"), mitem("scanner"), mitem("miner"), mitem("user"),
    mitem("machine"), mitem("teleporter"), mitem("teleporter", 1), mitem("spike_iron"), mitem("spike_gold"),
    mitem("spike_diamond"), mitem("magicapple"), mitem("interactionproxy"), mitem("decorativeglass", 5),
    mitem("decorativesolidwood"), mitem("decorativesolidwood", 1),
]
for (def i in [0, 1, 2, 3, 4, 5, 7, 8]) items.add(mitem("passivegenerator", i))
for (def i in 0..17) if (i != 14) items.add(mitem("ingredients", i))
for (def i in 0..3) items.add(mitem("ineffableglass", i))
for (def i in 1..3) items.add(mitem("drum", i))
for (def i in 0..2) items.add(mitem("simpledecorative", i))
for (def i in 0..7) items.add(mitem("luxsaber", i))
for (def i in [3, 6, 7]) items.add(mitem("decorativesolid", i))

def advancedItems = []
for (def i in 0..5) advancedItems.add(mitem("angelring", i))

def antimatterItems = [
    mitem("lawsword"), mitem("compoundbow"), mitem("fireaxe"),
]

def creativeItems = [
    mitem("itemcreativebuilderswand"), mitem("passivegenerator", 6), mitem("drum", 4), mitem("spike_creative"),
    mitem("creativechest"), mitem("creativeenergy"),
]

def removedMachines = [
    "generator_culinary", "generator", "generator_death", "generator_ender", "generator_potion", "crusher", "generator_overclock",
    "generator_netherstar", "generator_redstone", "generator_ice", "generator_dragonsbreath", "generator_survival", "generator_slime",
    "furnace", "generator_pink", "generator_enchant", "generator_tnt", "generator_lava",
]

def hideFromJei = [mitem("ingredients", 14), mitem("decorativesolid", 8)]

for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in tier5Items) TooltipEvents.setTier(it, 5)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in items) TooltipEvents.setTier(it, 9)
for (def it in advancedItems) TooltipEvents.setTier(it, 12)
for (def it in antimatterItems) TooltipEvents.setTier(it, 14)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removedMachines) {
    def a = mitem("machine").withNbt(["Type": "extrautils2:${it}".toString()])
    crafting.removeByOutput(a)
    mods.jei.ingredient.hide(a)
}
crafting.removeByOutput(mitem("machine"))
mods.jei.ingredient.hide(mitem("machine"))
mods.extrautils2.resonator.removeByOutput(item("extrautils2:decorativesolid", 8))
