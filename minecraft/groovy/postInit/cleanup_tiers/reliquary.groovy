import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("xreliquary:${name}", k)
}

def tier2Items = []
for (def i in 0..15) tier2Items.add(mitem("pedestal_passive", i))

def tier3Items = [
    mitem("mercy_cross"), mitem("emperor_chalice"), mitem("holy_hand_grenade"), mitem("infernal_chalice"),
]

def tier4Items = [
    mitem("witch_hat"), mitem("shears_of_winter"),
]
for (def i in 0..15) tier4Items.add(mitem("pedestal", i))

def tier5Items = [
    mitem("angelheart_vial"), mitem("destruction_catalyst"), mitem("rending_gale"), mitem("sojourner_staff"),
    mitem("twilight_cloak"), mitem("apothecary_cauldron"), mitem("apothecary_mortar"), mitem("potion_essence"),
]

def tier6Items = [
    mitem("alkahestry_tome", 32767), mitem("mob_ingredient", 11), mitem("angelic_feather"), mitem("phoenix_down"), mitem("ender_staff"),
    mitem("fortune_coin"), mitem("glacial_staff"), mitem("hero_medallion"), mitem("ice_magus_rod"), mitem("mob_charm"), mitem("midas_touchstone"),
    mitem("pyromancer_staff"), mitem("void_tear"), mitem("handgun"), mitem("interdiction_torch"), mitem("wraith_node"),
    mitem("tipped_arrow"), mitem("salamander_eye"),
]
for (def i in 0..9) {
    tier6Items.add(mitem("bullet", i))
    tier6Items.add(mitem("magazine", i))
}
for (def i in 0..2) tier6Items.add(mitem("gun_part", i))

def tier7Items = [
    mitem("magicbane"), mitem("mob_charm_belt"), mitem("rod_of_lyssa"), mitem("serpent_staff"),
]

def removeRecipes = [
    mitem("mob_ingredient", 13), mitem("mob_ingredient", 14), mitem("mob_ingredient", 15), mitem("infernal_tear"), mitem("fertile_lilypad"), mitem("altar"),
]
for (def i in 0..13) removeRecipes.add(mitem("mob_charm_fragment", i))

def removeJeiDescriptions = [] + removeRecipes
for (def i in 0..16) removeJeiDescriptions.add(mitem("mob_ingredient", i))

for (def it in tier2Items) TooltipEvents.setTier(it, 2)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in tier5Items) TooltipEvents.setTier(it, 5)
for (def it in tier6Items) TooltipEvents.setTier(it, 6)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in removeRecipes) {
    crafting.removeByOutput(it)
    GatewayHelpers.hide(it)
}
for (def it in removeJeiDescriptions) mods.jei.description.remove(it)

def potion = mitem("potion")
def lingeringPotion = mitem("potion").withNbt(["lingering": 1])
def predicate = stack -> stack in lingeringPotion
TooltipEvents.addTierPredicate("xreliquary:lingering", predicate, 6)
def predicate = stack -> stack in potion && stack not in lingeringPotion
TooltipEvents.addTierPredicate("xreliquary:lingering", predicate, 5)