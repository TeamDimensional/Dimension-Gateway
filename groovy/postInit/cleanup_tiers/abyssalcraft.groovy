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
    mitem("corblock"), mitem("abycorore"),
    mitem("dghead"), mitem("phead"), mitem("whead"), mitem("ohead"), 
    mitem("transmutator"), 
    mitem("abyiroore"), mitem("abygolore"), mitem("abydiaore"), mitem("abypcorore"), mitem("abylcorore"), mitem("solidlava"),
    mitem("fusedabyssalsand"), mitem("abyssalsand"), mitem("abyssalsandglass"), mitem("luminousthistle"), mitem("wastelandsthorn"),
    mitem("rendingpedestal"), mitem("oc"), mitem("gatewaykey"),
    mitem("dead_tree_log"), mitem("powerstonetracker"), mitem("eoa"),
    mitem("monolithpillar"), mitem("overworld_energy_pedestal"), mitem("abyssal_wasteland_energy_pedestal"),
    mitem("overworld_sacrificial_altar"), mitem("abyssal_wasteland_sacrificial_altar"),
    mitem("overworld_energy_collector"), mitem("abyssal_wasteland_energy_collector"),
    mitem("overworld_energy_relay"), mitem("abyssal_wasteland_energy_relay"),
    mitem("overworld_energy_container"), mitem("abyssal_wasteland_energy_container"),
    mitem("coralium"), mitem("cpearl"), mitem("cingot"), mitem("transmutationgem"), mitem("corflesh"), mitem("corbone"),
    mitem("corhelmet"), mitem("corplate"), mitem("corlegs"), mitem("corboots"),
    mitem("depthshelmet"), mitem("depthsplate"), mitem("depthslegs"), mitem("depthsboots"),
    mitem("corhelmetp"), mitem("corplatep"), mitem("corlegsp"), mitem("corbootsp"),
    mitem("shadowfragment"), mitem("shadowshard"), mitem("shadowgem"), mitem("oblivionshard"), mitem("corbow"), mitem("cbrick"),
    mitem("cudgel"), mitem("soulreaper"), mitem("necronomicon"), mitem("necronomicon_cor"), mitem("shoggothflesh_overworld"),
    mitem("shoggothflesh_abyssal"), mitem("nugget_coralium"), mitem("drainstaff"), mitem("drainstaff_aw"),
    mitem("essence_abyssalwasteland"), mitem("interdimensionalcage"), mitem("scroll_lesser"), mitem("scroll_moderate"),
    mitem("coralium_antidote"),
] + statues
for (def i in 2..9) abyssalItems.add(mitem("ccluster${i}"))

def materials = [
    "iron", "gold", "sulfur", "carbon", "oxygen", "hydrogen", "nitrogen", "phosphorus", "potassium", "nitrate", "methane",
    "redstone", "abyssalnite", "coralium", "dreadium", "blaze", "tin", "copper", "silicon", "magnesium", "aluminium", "silica",
    "alumina", "magnesia", "zinc", "calcium", "beryllium", "beryl",
]

def omotholItems = [
    mitem("ethaxium"), mitem("omotholstone"), mitem("monolithstone"), mitem("ethaxiumblock"), mitem("ethaxiumbrick"), mitem("chiseled_ethaxium_brick"),
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
    mitem("anticorflesh"), mitem("anticorbone"), mitem("necronomicon_omt"), mitem("shoggothflesh_omothol"),
    mitem("shoggothflesh_shadow"), mitem("nugget_abyssalnite"), mitem("nugget_dreadium"), mitem("nugget_ethaxium"),
    mitem("drainstaff_omt"), mitem("essence_omothol"), mitem("gatekeeperessence"), mitem("scroll_greater"), mitem("scroll_unique_anti"),
    mitem("scroll_unique_oblivion"), mitem("configurator"), mitem("face_book"), mitem("ethaxiumbrickslab2"), mitem("darkethaxiumbrickslab2"),
]
for (def m in materials) omotholItems.add(mitem("${m}_crystal_cluster"))
for (def m in materials) omotholItems.add(mitem("${m}_crystal"))
for (def m in materials) omotholItems.add(mitem("${m}_crystal_shard"))
for (def m in materials) omotholItems.add(mitem("${m}_crystal_fragment"))
for (def i in 0..3) omotholItems.add(mitem("configurator_shard_${i}"))

def charmBuffs = ["", "_range", "_duration", "_power"]
for (def cb in charmBuffs) for (def g in gods) omotholItems.add(mitem("${g}charm${cb}"))
for (def cb in charmBuffs) omotholItems.add(mitem("charm${cb}"))

def tier13Items = [
    mitem("odb"), mitem("abyssalnomicon"), mitem("silver_key"), 
]

def removeRecipes = [
    mitem("door_drt"), mitem("coraliumstone"), mitem("odbcore"), mitem("dreadbrick"), mitem("chiseled_dreadstone_brick"), mitem("abydreadbrick"),
    mitem("chiseled_abyssalnite_stone_brick"),  mitem("dreadplanks"), mitem("dreadbrickstairs"),
    mitem("dreadbrickfence"), mitem("dreadbrickslab1"), mitem("abydreadbrickstairs"), mitem("abydreadbrickfence"), mitem("abydreadbrickslab1"),
    mitem("drtfence"), mitem("materializer"), mitem("sacrificialaltar"), mitem("energypedestal"), mitem("energycollector"), mitem("energyrelay"),
    mitem("dreadstonecobblestonestairs"), mitem("dreadstonecobblestoneslab1"), mitem("dreadstonecobblestonewall"),
    mitem("abyssalnitecobblestonestairs"), mitem("abyssalnitecobblestoneslab1"), mitem("abyssalnitecobblestonewall"),
    mitem("statetransformer"), mitem("energydepositioner"), mitem("sequential_brewing_stand"), mitem("platec"),
    mitem("dpick"), mitem("daxe"), mitem("dshovel"), mitem("dsword"), mitem("dhoe"),
    mitem("apick"), mitem("aaxe"), mitem("ashovel"), mitem("asword"), mitem("ahoe"),
    mitem("corpick"), mitem("coraxe"), mitem("corshovel"), mitem("corsword"), mitem("corhoe"),
    mitem("dreadiumpickaxe"), mitem("dreadiumaxe"), mitem("dreadiumshovel"), mitem("dreadiumsword"), mitem("dreadiumhoe"),
    mitem("ethaxiumpickaxe"), mitem("ethaxiumaxe"), mitem("ethaxiumshovel"), mitem("ethaxiumsword"), mitem("ethaxiumhoe"),
    mitem("carboncluster"), mitem("densecarboncluster"), mitem("dreadcloth"), mitem("dreadplate"), mitem("dreadblade"), mitem("dreadhilt"),
    mitem("coin"), mitem("necronomicon_dre"), mitem("skin_abyssalwasteland"), mitem("skin_dreadlands"), mitem("skin_omothol"),
    mitem("stonetablet"), mitem("dread_antidote"), mitem("cchunk"),
]
for (def it in ["small", "medium", "large", "huge"]) removeRecipes.add(mitem("crystalbag_${it}"))

def removeFurnace = [
    mitem("dreadstone"), mitem("abydreadstone"), mitem("charcoal"), mitem("cooked_generic_meat"), mitem("cracked_dreadstone_brick"),
    mitem("cracked_abyssalnite_stone_brick"),
]

def removeRitual = [
    mitem("psdl"), mitem("dreadaltartop"), mitem("dreadaltarbottom"), mitem("dreadlands_energy_pedestal"), mitem("dreadlands_sacrificial_altar"),
    mitem("energycontainer"), mitem("dreadlands_energy_collector"), mitem("dreadlands_energy_relay"), mitem("dreadlands_energy_container"),
    mitem("gatewaykeydl"), mitem("dhelmet"), mitem("dplate"), mitem("dlegs"), mitem("dboots"), mitem("jzaharcoin"),
    mitem("drainstaff_dl"), mitem("scroll_basic"),
]

def unobtainable = [
    mitem("portal_anchor"),
]

def hideFromJei = [
    mitem("dltleaves"), mitem("dltlog"), mitem("dltlog2"), mitem("dltsapling"), mitem("coraliumore"), mitem("abyore"), mitem("abydreadore"),
    mitem("dreadore"), mitem("dreadgrass"), mitem("dreadlog"), mitem("dreadleaves"), mitem("dreadsapling"), mitem("nitreore"),
    mitem("abynitore"), mitem("abytinore"), mitem("abycopore"), mitem("dreadlandsdirt"), mitem("idol_of_fading"), mitem("abyssal_abyssalnite_ore"),
    mitem("mural"), mitem("dreadshard"), mitem("dreadchunk"), mitem("abychunk"), mitem("dreadfragment"), mitem("dreadkey"),
    mitem("shoggothflesh_dreaded"), mitem("essence_dreadlands"), mitem("generic_meat"), mitem("lost_page"),
    mitem("dreadbrickslab2"), mitem("abydreadbrickslab2"), mitem("dreadguardspawner"), mitem("chagarothspawner"),
    mitem("jzaharspawner"), mitem("gatekeeperminionspawner"), mitem("fire"), mitem("dreadstonecobblestoneslab2"), mitem("abyssalnitecobblestoneslab2"),
    mitem("dreadstonecobblestone"), mitem("abyssalnitecobblestone"), 
] + removeRecipes + removeFurnace + removeRitual

for (def it in ["altar", "pedestal"]) {
    for (def mat in ["stone", "darkstone", "abyssal_stone", "coralium_stone"]) abyssalItems.add(mitem("ritual_${it}_${mat}"))
    for (def mat in ["dreadstone", "abyssalnite_stone"]) hideFromJei.add(mitem("ritual_${it}_${mat}"))
    for (def mat in ["ethaxium", "dark_ethaxium"]) omotholItems.add(mitem("ritual_${it}_${mat}"))
}

for (def it in abyssalItems) TooltipEvents.setTier(it, 10)
for (def it in omotholItems) TooltipEvents.setTier(it, 11)
for (def it in tier13Items) TooltipEvents.setTier(it, 13)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in unobtainable) TooltipEvents.setTier(it, 0)
for (def it in removeRecipes) crafting.removeByOutput(it)
for (def it in removeFurnace) furnace.removeByOutput(it)
TooltipEvents.setUnlock(mitem("gatewaykeyjzh"), 11)
