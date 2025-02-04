import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("evilcraft:${name}", k)
}

def items = [
    mitem("dark_block"), mitem("blood_infuser"), mitem("bloody_cobblestone"), mitem("hardened_blood"), mitem("obscured_glass"),
    mitem("blood_chest"), mitem("undead_leaves"), mitem("undead_sapling"), mitem("undead_plank"), mitem("undead_log"),
    mitem("purifier"), mitem("dark_brick"), mitem("dark_blood_brick"), mitem("dark_tank"), mitem("sanguinary_pedestal"),
    mitem("sanguinary_pedestal", 1), mitem("dark_power_gem_block"), mitem("blood_waxed_coal_block"),
    mitem("colossal_blood_chest"), mitem("reinforced_undead_plank"), mitem("undead_plank_stairs"), mitem("reinforced_undead_plank_stairs"),
    mitem("dark_brick_stairs"), mitem("dark_blood_brick_stairs"), mitem("blood_extractor"), mitem("dark_stick"),
    mitem("broom"), mitem("hardened_blood_shard"), mitem("dark_power_gem"), mitem("blood_infusion_core"), mitem("blook"),
    mitem("kineticator"), mitem("kineticator", 1), mitem("dark_gem_crushed"), mitem("vein_sword"), mitem("exalted_crafter", 1),
    mitem("invigorating_pendant"), mitem("promise"), mitem("promise", 1), mitem("promise_acceptor"), mitem("promise_acceptor", 1),
    mitem("bowl_of_promises"), mitem("bowl_of_promises", 1), mitem("blood_waxed_coal"), mitem("blood_potash"), mitem("blood_orb", 1),
    mitem("sceptre_of_thunder"), mitem("origins_of_darkness"), mitem("darkened_apple"), mitem("biome_extract"), mitem("spikey_claws"),
    mitem("broom_part"), mitem("exalted_crafter", 3),
]
for (int i in 0..4) items.add(mitem("bowl_of_promises", i))

def thaumItems = [mitem("veined_scribing_tools")]

def enderItems = [
    mitem("blood_pearl_of_teleportation"), mitem("exalted_crafter"), mitem("ender_tear"), mitem("environmental_accumulation_core"),
    mitem("exalted_crafter", 2),
]

def advancedItems = [
    mitem("lightning_bomb"), mitem("spirit_furnace"), mitem("spiked_plate"), mitem("spirit_reanimator"), mitem("gem_stone_torch"),
    mitem("eternal_water_block"), mitem("lightning_grenade"), mitem("inverted_potentia"), mitem("inverted_potentia", 1),
    mitem("mace_of_distortion"), mitem("vengeance_ring"), mitem("vengeance_focus"), mitem("vengeance_pickaxe"),
    mitem("necromancer_staff"), mitem("corrupted_tear"), mitem("entangled_chalice"), mitem("promise", 2), mitem("promise", 3),
    mitem("promise", 4), mitem("promise_acceptor", 2), mitem("bowl_of_promises", 5), mitem("bucket_eternal_water"),
    mitem("effortless_ring"), mitem("rejuvenated_flesh"), mitem("primed_pendant"), mitem("mace_of_destruction"),
    mitem("garmonbozia"), mitem("vengeance_essence"), mitem("vengeance_essence", 1), mitem("piercing_vengeance_focus"),
    mitem("spectral_glasses"), mitem("box_of_eternal_closure"), mitem("burning_gem_stone"), mitem("dark_spike"),
]
for (def i in 0..3) advancedItems.add(mitem("weather_container", i))

def particleItems = [
    mitem("sanguinary_environmental_accumulator")
]

def creativeItems = [
    mitem("creative_blood_drop")
]

def removeRecipes = [
    mitem("potentia_sphere"), mitem("dull_dust"), mitem("golden_string"),
]

def hideFromJei = [
    mitem("nether_monster_block"), mitem("nether_monster_block", 1), mitem("nether_monster_block", 2), mitem("spirit_portal"),
    mitem("redstone_grenade"), mitem("blood_orb"),
] + removeRecipes

for (def it in items) TooltipEvents.setTier(it, 4)
for (def it in thaumItems) TooltipEvents.setTier(it, 5)
for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in advancedItems) TooltipEvents.setTier(it, 9)
for (def it in particleItems) TooltipEvents.setTier(it, 13)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
TooltipEvents.setUnlock(mitem("dark_gem"), 4)

def setBroomPartTier(name, tier) {
    def upgrade = mitem("broom_part").withNbt(["broom_parts_tag": [name]])
    def predicate = stack -> stack in upgrade
    TooltipEvents.addTierPredicate("evilcraftbroom:" + name, predicate, tier)
}

setBroomPartTier("evilcraft:rod_obsidian", 5)
setBroomPartTier("evilcraft:cap_metal_thaumium", 5)
setBroomPartTier("evilcraft:rod_endstone", 6)
setBroomPartTier("evilcraft:rod_purpur", 6)
setBroomPartTier("evilcraft:cap_metal_ardite", 7)
setBroomPartTier("evilcraft:cap_metal_cobalt", 7)
setBroomPartTier("evilcraft:cap_metal_manyullyn", 7)
