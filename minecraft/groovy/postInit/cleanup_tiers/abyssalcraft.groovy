import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("abyssalcraft:${name}", k)
}

def gods = ["cthulhu", "hastur", "jzahar", "azathoth", "nyarlathotep", "yogsothoth", "shubniggurath"]
def statues = []
for (def g in gods) statues.add(mitem("${g}statue"))
for (def g in gods) statues.add(mitem("decorative${g}statue"))

def abyssalItems = [
    mitem("darkstone"), mitem("dsbutton"), mitem("dspplate"), mitem("darkstone_cobble"), mitem("darkstone_brick"), mitem("chiseled_darkstone_brick"),
    mitem("cracked_darkstone_brick"), mitem("dsglow"), mitem("darkbrickslab1"), mitem("darkcobbleslab1"), mitem("dbstairs"), mitem("dcstairs"),
    mitem("dscwall"), mitem("darkstoneslab1"), mitem("dsbfence"), mitem("darkbrickslab2"), mitem("darkcobbleslab2"), mitem("darkstoneslab2"),
    mitem("dltbutton"), mitem("dltpplate"), mitem("door_dlt"), mitem("dltslab2"), mitem("dltplank"), mitem("dltstairs"), mitem("dltslab1"),
    mitem("dltfence"),
    mitem("abystone"), mitem("abybutton"), mitem("abypplate"), mitem("abyssalcobblestone"), mitem("abybrick"), mitem("chiseled_abyssal_stone_brick"),
    mitem("cracked_abyssal_stone_brick"), mitem("abyslab1"), mitem("abystairs"), mitem("abyfence"), mitem("abyssalcobblestonestairs"),
    mitem("abyssalcobblestoneslab1"), mitem("abyssalcobblestonewall"), mitem("abyslab2"), mitem("abyssalcobblestoneslab2"),
    mitem("cstone"), mitem("cstonebutton"), mitem("cstonepplate"), mitem("coraliumcobblestone"), mitem("cstonebrick"),
    mitem("chiseled_coralium_stone_brick"), mitem("cracked_coralium_stone_brick"), mitem("cstonebrickfence"), mitem("cstonebrickslab1"),
    mitem("cstonebrickstairs"), mitem("coraliumcobblestonestairs"), mitem("coraliumcobblestoneslab1"), mitem("coraliumcobblestonewall"),
    mitem("cstonebrickslab2"), mitem("coraliumcobblestoneslab2"),
    mitem("corblock"),
    mitem("dghead"), mitem("phead"), mitem("whead"), mitem("ohead"), 
    mitem("abyiroore"), mitem("abygolore"), mitem("abydiaore"), mitem("abypcorore"), mitem("abylcorore"), mitem("solidlava"),
    mitem("fusedabyssalsand"), mitem("abyssalsand"), mitem("abyssalsandglass"), mitem("luminousthistle"), mitem("wastelandsthorn"),
    mitem("rendingpedestal"), mitem("oc"), mitem("gatewaykey"),
    mitem("dead_tree_log"), mitem("powerstonetracker"), mitem("eoa"),
    mitem("monolithpillar"), mitem("overworld_energy_pedestal"), mitem("abyssal_wasteland_energy_pedestal"),
    mitem("overworld_sacrificial_altar"), mitem("abyssal_wasteland_sacrificial_altar"),
    mitem("overworld_energy_collector"), mitem("abyssal_wasteland_energy_collector"),
    mitem("overworld_energy_relay"), mitem("abyssal_wasteland_energy_relay"),
    mitem("overworld_energy_container"), mitem("abyssal_wasteland_energy_container"),
    mitem("coralium"), mitem("cpearl"), mitem("cingot"), mitem("transmutationgem", 32767), mitem("corflesh"),
    mitem("corhelmet"), mitem("corplate"), mitem("corlegs"), mitem("corboots"),
    mitem("depthshelmet"), mitem("depthsplate"), mitem("depthslegs"), mitem("depthsboots"),
    mitem("corhelmetp"), mitem("corplatep"), mitem("corlegsp"), mitem("corbootsp"),
    mitem("shadowfragment"), mitem("shadowshard"), mitem("oblivionshard"), mitem("corbow"), mitem("cbrick"),
    mitem("cudgel"), mitem("soulreaper"), mitem("necronomicon"), mitem("necronomicon_cor"), mitem("shoggothflesh_overworld"),
    mitem("shoggothflesh_abyssal"), mitem("nugget_coralium"), mitem("drainstaff"), mitem("drainstaff_aw"),
    mitem("essence_abyssalwasteland"), mitem("interdimensionalcage"), mitem("scroll_lesser"), mitem("scroll_moderate"),
    mitem("coralium_antidote"), mitem("monolithstone"), mitem("darklands_oak_fence_gate"),
    mitem("spirit_altar"), mitem("spirit_tablet"),
    mitem("ghoul_flesh"), mitem("abyssal_ghoul_flesh"), mitem("shadow_ghoul_flesh"), mitem("anti_ghoul_flesh"),
    mitem("ring"), mitem("ring_overworld"), mitem("ring_abyssal_wasteland"),
] + statues
for (def i in 2..9) abyssalItems.add(mitem("ccluster${i}"))
for (def i in 0..3) abyssalItems.add(mitem("spirit_tablet_shard_${i}"))

def materials = [
    "iron", "gold", "sulfur", "carbon", "oxygen", "hydrogen", "nitrogen", "phosphorus", "potassium", "nitrate", "methane",
    "redstone", "abyssalnite", "coralium", "dreadium", "blaze", "silicon", "magnesium", "aluminium", "silica",
    "alumina", "magnesia", "zinc", "calcium", "beryllium", "beryl",
]

def crystalClusters = []
for (def m in materials) crystalClusters.add(mitem("${m}_crystal_cluster"))
def omotholItems = [
    mitem("ethaxium"), mitem("omotholstone"), mitem("ethaxiumblock"), mitem("ethaxiumbrick"), mitem("chiseled_ethaxium_brick"),
    mitem("cracked_ethaxium_brick"), mitem("ethaxiumpillar"), mitem("ethaxiumbrickstairs"), mitem("ethaxiumbrickslab1"), mitem("ethaxiumfence"),
    mitem("darkethaxiumbrick"), mitem("chiseled_dark_ethaxium_brick"), mitem("cracked_dark_ethaxium_brick"), mitem("darkethaxiumpillar"),
    mitem("darkethaxiumbrickstairs"), mitem("darkethaxiumbrickslab1"), mitem("darkethaxiumbrickfence"), mitem("shoggothblock"),
    mitem("shoggothbiomass"), mitem("omothol_energy_pedestal"), mitem("omothol_sacrificial_altar"), mitem("crystallizer"),
    mitem("abyblock"), mitem("dreadiumblock"), mitem("omothol_energy_collector"), mitem("omothol_energy_relay"), mitem("omothol_energy_container"),
    mitem("calcifiedstone"), mitem("staff"), mitem("abyingot"), mitem("dreadiumingot"), 
    mitem("ahelmet"), mitem("aplate"), mitem("alegs"), mitem("aboots"),
    mitem("dreadiumhelmet"), mitem("dreadiumplate"), mitem("dreadiumlegs"), mitem("dreadiumboots"), mitem("methane"), mitem("dreadkatana"),
    mitem("dreadiumsamuraihelmet"), mitem("dreadiumsamuraiplate"), mitem("dreadiumsamurailegs"), mitem("dreadiumsamuraiboots"),
    mitem("antibeef"), mitem("antichicken"), mitem("antipork"), mitem("antiflesh"), mitem("antibone"), mitem("antispidereye"),
    mitem("ethbrick"), mitem("ethaxiumingot"), mitem("lifecrystal"), mitem("eldritchscale"), mitem("omotholflesh"),
    mitem("ethaxiumhelmet"), mitem("ethaxiumplate"), mitem("ethaxiumlegs"), mitem("ethaxiumboots"),
    mitem("anticorflesh"), mitem("necronomicon_omt"), mitem("shoggothflesh_omothol"),
    mitem("shoggothflesh_shadow"), mitem("nugget_abyssalnite"), mitem("nugget_dreadium"), mitem("nugget_ethaxium"),
    mitem("drainstaff_omt"), mitem("essence_omothol"), mitem("gatekeeperessence"), mitem("scroll_greater"), mitem("scroll_unique_anti"),
    mitem("scroll_unique_oblivion"), mitem("face_book"), mitem("ethaxiumbrickslab2"), mitem("darkethaxiumbrickslab2"),
    mitem("transmutator"), mitem("unchained_portal_anchor"),
    mitem("odb"), mitem("abyssalnomicon"), mitem("silver_key"), mitem("ring_omothol"), mitem("gatewaykeyjzh"),
] + crystalClusters
for (def m in materials) omotholItems.add(mitem("${m}_crystal"))
for (def m in materials) omotholItems.add(mitem("${m}_crystal_shard"))

def charmBuffs = ["", "_range", "_duration", "_power"]
for (def cb in charmBuffs) for (def g in gods) omotholItems.add(mitem("${g}charm${cb}"))
for (def cb in charmBuffs) omotholItems.add(mitem("charm${cb}"))

def removeRecipes = [
    mitem("door_drt"), mitem("coraliumstone"), mitem("odbcore"), mitem("dreadbrick"), mitem("chiseled_dreadstone_brick"),
    mitem("dreadplanks"), mitem("dreadbrickstairs"),
    mitem("dreadbrickfence"), mitem("dreadbrickslab1"),
    mitem("drtfence"), mitem("materializer"), mitem("sacrificialaltar"), mitem("energypedestal"), mitem("energycollector"), mitem("energyrelay"),
    mitem("dreadstonecobblestonestairs"), mitem("dreadstonecobblestoneslab1"), mitem("dreadstonecobblestonewall"),
    mitem("statetransformer"), mitem("energydepositioner"), mitem("sequential_brewing_stand"), mitem("platec"),
    mitem("apick"), mitem("aaxe"), mitem("ashovel"), mitem("asword"), mitem("ahoe"),
    mitem("corpick"), mitem("coraxe"), mitem("corshovel"), mitem("corsword"), mitem("corhoe"),
    mitem("dreadiumpickaxe"), mitem("dreadiumaxe"), mitem("dreadiumshovel"), mitem("dreadiumsword"), mitem("dreadiumhoe"),
    mitem("ethaxiumpickaxe"), mitem("ethaxiumaxe"), mitem("ethaxiumshovel"), mitem("ethaxiumsword"), mitem("ethaxiumhoe"),
    mitem("carboncluster"), mitem("densecarboncluster"), mitem("dreadcloth"), mitem("dreadplate"), mitem("dreadblade"), mitem("dreadhilt"),
    mitem("coin"), mitem("necronomicon_dre"), mitem("skin_abyssalwasteland"), mitem("skin_dreadlands"), mitem("skin_omothol"),
    mitem("stonetablet"), mitem("dread_antidote"), mitem("cchunk"),
    mitem("dreadwood_button"), mitem("dreadwood_pplate"), mitem("dreadwood_fence_gate"),
    mitem("elysian_stone_brick"), mitem("chiseled_elysian_stone_brick"), mitem("elysian_stone_brick_stairs"),
    mitem("elysian_stone_brick_fence"), mitem("elysian_stone_brick_slab1"), mitem("elysiancobblestonestairs"),
    mitem("elysiancobblestoneslab1"), mitem("elysiancobblestonewall"), mitem("dreadwood_slab1"),
    mitem("dreadwood_stairs"), mitem("research_table"),
]
for (def m in materials) removeRecipes.add(mitem("${m}_crystal_fragment"))
for (def it in ["small", "medium", "large", "huge"]) removeRecipes.add(mitem("crystalbag_${it}"))

def removeCrystallizer = [
    mitem("dreaded_ghoul_flesh"),
]

def removeFurnace = [
    mitem("dreadstone"), mitem("charcoal"), mitem("cooked_generic_meat"), mitem("cracked_dreadstone_brick"),
    mitem("cracked_elysian_stone_brick"), mitem("elysian_stone"),
]

def removeRitual = [
    mitem("psdl"), mitem("dreadlands_energy_pedestal"), mitem("dreadlands_sacrificial_altar"),
    mitem("energycontainer"), mitem("dreadlands_energy_collector"), mitem("dreadlands_energy_relay"), mitem("dreadlands_energy_container"),
    mitem("gatewaykeydl"), mitem("jzaharcoin"),
    mitem("drainstaff_dl"), mitem("scroll_basic"), mitem("face_book"), mitem("sealing_key"), mitem("ring_dreadlands"),
]

def unobtainable = [
    mitem("portal_anchor"),
]

def creativeItems = [
    mitem("devsword"),
]

def hideFromJei = [
    mitem("dltleaves"), mitem("dltlog"), mitem("dltlog2"), mitem("dltsapling"), mitem("coraliumore"), mitem("abyore"), mitem("abydreadore"),
    mitem("dreadore"), mitem("dreadgrass"), mitem("dreadlog"), mitem("dreadleaves"), mitem("dreadsapling"), mitem("nitreore"),
    mitem("abynitore"), mitem("dreadlandsdirt"), mitem("idol_of_fading"), mitem("abyssal_abyssalnite_ore"),
    mitem("mural"), mitem("dreadshard"), mitem("dreadfragment"), mitem("dreadkey"),
    mitem("shoggothflesh_dreaded"), mitem("essence_dreadlands"), mitem("generic_meat"), mitem("lost_page"),
    mitem("dreadbrickslab2"), mitem("dreadguardspawner"), mitem("chagarothspawner"),
    mitem("jzaharspawner"), mitem("gatekeeperminionspawner"), mitem("fire"), mitem("dreadstonecobblestoneslab2"),
    mitem("dreadstonecobblestone"), mitem("abycorore"), mitem("scriptures_omniscience"), mitem("sealing_lock"), mitem("unlocked_sealing_lock"),
    mitem("dreadlands_muck"), mitem("elysian_stone_brick_slab2"), mitem("ritual_altar_elysian_stone"), mitem("ritual_pedestal_elysian_stone"),
    mitem("elysiancobblestoneslab2"), mitem("dreadwood_slab2"), mitem("elysian_cobblestone"), mitem("altar"),
    mitem("crystallizer_on"), mitem("transmutator_on"), mitem("engraver_on"), mitem("multiblock"),
    mitem("shoggoth_projectile"),
] + removeRecipes + removeFurnace + removeRitual + removeCrystallizer

for (def it in ["stone", "abyssal_stone", "coralium_stone", "darkstone", "dreadstone", "elysian_stone", "ethaxium", "monolith_stone", "omothol_stone"]) {
    hideFromJei.add(mitem("tombstone_${it}"))
}

for (def it in ["altar", "pedestal"]) {
    for (def mat in ["stone", "darkstone", "abyssal_stone", "coralium_stone"]) abyssalItems.add(mitem("ritual_${it}_${mat}"))
    for (def mat in ["dreadstone"]) hideFromJei.add(mitem("ritual_${it}_${mat}"))
    omotholItems.add(mitem("ritual_${it}_ethaxium"))
    omotholItems.add(mitem("ritual_${it}_dark_ethaxium"))
}

for (def it in abyssalItems) TooltipEvents.setTier(it, 13)
for (def it in omotholItems) TooltipEvents.setTier(it, 15)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in unobtainable) TooltipEvents.setTier(it, 0)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in removeFurnace) furnace.removeByOutput(it)
for (def it in removeRitual) mods.abyssaltweaker.ritual.removeByOutput(it)
for (def it in removeCrystallizer) mods.abyssaltweaker.crystallizer.removeByOutput(it)
for (def it in statues) TooltipEvents.setTooltip(it, "Can be looted in Omothol in tier 15.")
for (def it in crystalClusters) TooltipEvents.setTooltip(it, "Can be looted in Omothol before Crystallizer is available.")
TooltipEvents.setTooltip(item("abyssalcraft:odb"), "Turns Abyssal Wasteland into Nuclear Wasteland when used, which unlocks QMD.")
for (int i in 0..27) crafting.remove("abyssalcraft:crystalshard_${i}_alt")

// Fix fence gate
crafting.removeByOutput(mitem("darklands_oak_fence_gate"))
crafting.shapedBuilder()
        .output(mitem("darklands_oak_fence_gate"))
        .matrix("SPS", "SPS")
        .key("S", ore("stickWood"))
        .key("P", mitem("dltplank"))
        .register()
