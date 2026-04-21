import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("witchery:${name}", k)
}

def tier1Items = [
    mitem("garlic"), mitem("wolf_head"), mitem("hellhound_head"), mitem("creeper_heart"), mitem("bat_wool"), mitem("dog_tongue"),
    mitem("dense_web"), mitem("wormy_apple"), mitem("stake"), mitem("wooden_bolt"), mitem("bone_needle"), mitem("bone_bolt"),
    mitem("splitting_bolt"), mitem("raw_meaty_stew"), mitem("meaty_stew"), mitem("glass_goblet"), mitem("earmuffs"),
]
for (def color in GatewayHelpers.colors) {
    tier1Items.add(mitem("${color}_shaded_glass"))
}

def tier3Items = [mitem("silver_bolt"), mitem("silver_sword")]
def tier4Items = [mitem("boline"), mitem("arthana")]

def demonicItems = [
    mitem("demon_heart"), mitem("blood_stained_wool"), mitem("mirror"), mitem("demonic_blood"), mitem("bloodied_wicker_bundle"),
    mitem("infernal_animus"), mitem("mystic_unguent"), mitem("infused_brew_base"), mitem("woven_cruor"), mitem("torn_page"),
    mitem("liliths_blood"), mitem("golden_heart"), mitem("demonic_contract"), mitem("torment_contract"), mitem("huntsmans_spear"),
    mitem("cane_sword"), mitem("devils_tongue_charm"), mitem("leonards_urn1"), mitem("leonards_urn2"), mitem("leonards_urn3"), mitem("leonards_urn4"),
    mitem("duplication_grenade"), mitem("ruby_slippers"), mitem("vampire_top_hat"), mitem("vampire_veil_hat"), mitem("vampire_helmet"),
    mitem("vampire_coat"), mitem("vampire_corset"), mitem("vampire_chestplate"), mitem("vampire_trousers"), mitem("vampire_skirt"),
    mitem("vampire_leggings"), mitem("vampire_shoes"), mitem("vampire_heels"), mitem("vampire_boots"),
]

def dreamItems = [
    mitem("pit_dirt"), mitem("pit_grass"), mitem("fleet_foot_dream_weaver"), mitem("iron_arm_dream_weaver"), mitem("fasting_dream_weaver"),
    mitem("nightmares_dream_weaver"), mitem("intensity_dream_weaver"), mitem("scarecrow"), mitem("trent_effigy"), mitem("mellifluous_hunger"),
    mitem("focused_will"), mitem("condensed_fear"), mitem("hollow_tears_brew"), mitem("flowing_spirit_brew"), mitem("wasting_brew"),
    mitem("substitution_brew"), mitem("sleeping_brew"), mitem("sleeping_apple"), mitem("congealed_spirit"),
    mitem("infused_soaring_brew"), mitem("infused_grave_brew"), mitem("symbology_book"), mitem("ent_twig"),
    mitem("disturbed_cotton"), mitem("fanciful_thread"), mitem("tormented_twine"), mitem("subdued_spirit"), mitem("subdued_village_spirit"),
    mitem("mystic_branch"), mitem("bark_belt"), mitem("fanciful_thinking_charm"),
]

def books = [
    mitem("collecting_fumes_book"), mitem("distilling_book"), mitem("circle_magic_book"), mitem("brews_and_infusions_book"),
    mitem("herbology_book"), mitem("symbology_book"), mitem("conjuration_and_fetishes_book"), mitem("biomes_book"),
    mitem("witches_brews_book"),
]

def unobtainable = [
    mitem("mirror_wall"), mitem("torment_stone"),
]

def removeRecipes = [
    mitem("soft_clay_jar"),
]
def hideFromJei = [
    // TODO: add a Ritual JEI handler and check whether these are made that way.
    // mitem("pit_podzol"), mitem("refilling_chest"), mitem("rock"),
    mitem("disguised_alder_door"), mitem("splash_brew_bottle"), mitem("brew_bottle"), mitem("lingering_brew_bottle"),
] + removeRecipes

def maxItems = [mitem("infinity_egg"), mitem("creative_medallion")]

for (def it in tier1Items) TooltipEvents.setTier(it, 1)
for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier4Items) TooltipEvents.setTier(it, 4)
for (def it in unobtainable) TooltipEvents.setTier(it, 0)
TooltipEvents.setModTier("witchery", 12)
for (def it in maxItems) TooltipEvents.setTier(it, 13)
for (def it in demonicItems) TooltipEvents.setTier(it, 13)
for (def it in dreamItems) TooltipEvents.setTier(it, 13)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)

TooltipEvents.setTooltip(fluid("witchery.hollow_tears"), "Obtained by throwing Brew of Hollow Tears.")
TooltipEvents.setTooltip(fluid("witchery.flowing_spirit"), "Obtained by throwing Brew of Flowing Spirit.")
for (def it in books) {
    TooltipEvents.setTooltip(it, "The Witchery Companion contains all information in this book!")
}

// TODO: remove Spectral Dust from Zombie and Skeleton loot tables.
