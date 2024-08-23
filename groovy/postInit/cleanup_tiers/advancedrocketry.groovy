import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("advancedrocketry:${name}", k)
}

def tier3Items = [
    mitem("thermitetorch"), mitem("circlelight"), mitem("thermite"), mitem("smallairlockdoor"), item("libvulpes:productrod", 4),
]

def tier7Items = [
    item("libvulpes:productdust", 7), item("libvulpes:productingot", 7), item("libvulpes:productnugget", 7),
    item("libvulpes:productplate", 7), item("libvulpes:productrod", 7), item("libvulpes:productgear", 7), item("libvulpes:ore0", 8),
    item("libvulpes:metal0", 7),
]

def tier8Items = [
    mitem("blocklens"), mitem("solarpanel"), mitem("solararraypanel"), mitem("forcefieldprojector"),
    mitem("blockpump"), mitem("suitworkstation"), mitem("liquidtank"), mitem("wirelesstransciever"),
    mitem("arcfurnace"), mitem("crystallizer"), mitem("precisionassemblingmachine"), mitem("chemicalreactor"),
    mitem("solararray"), mitem("launchpad"), mitem("landingpad"), mitem("seat"), mitem("rocketmotor"),
    mitem("fueltank"), mitem("guidancecomputer"), mitem("intake"), mitem("rocketbuilder"),
    mitem("loader", 2), mitem("loader", 3), mitem("loader", 4), mitem("loader", 5), mitem("fuelingstation"),
    mitem("oxygencharger"), mitem("oxygendetection"), mitem("pipesealer"), mitem("moonturf"), mitem("moonturf_dark"),
    // Titanium Aluminide
    mitem("productdust"), mitem("productingot"), mitem("productnugget"), mitem("productplate"), mitem("productrod"),
    mitem("productsheet"), mitem("productgear"), mitem("metal0"), mitem("planetidchip"),
    mitem("spacehelmet"), mitem("spacechestplate"), mitem("spaceleggings"), mitem("spaceboots"), mitem("jetpack"), mitem("atmanalyser"),
    mitem("sealdetector"), mitem("jackhammer"), mitem("iquartzcrucible"), mitem("lens"), mitem("hovercraft"), mitem("structuretower"),
    item("libvulpes:forgepowerinput"), item("libvulpes:forgepoweroutput"), item("libvulpes:motor"), item("libvulpes:advancedmotor"),
    item("libvulpes:enhancedmotor"), item("libvulpes:productdust"), item("libvulpes:productgem"), item("libvulpes:ore0"),
    item("libvulpes:coil0", 2), item("libvulpes:coil0", 4), item("libvulpes:coil0", 7), item("libvulpes:coil0", 9),
    item("libvulpes:linker"), item("libvulpes:holoprojector"),
]
for (def i in 0..3) tier8Items.add(mitem("pressuretank", i))
for (def i in 0..5) tier8Items.add(mitem("itemupgrade", i))
for (def i in 0..3) tier8Items.add(item("libvulpes:hatch", i))

def tier12Items = [
    mitem("vacuumlaser"), mitem("precisionlaseretcher"), mitem("observatory"), mitem("planetanalyser"), mitem("satellitebuilder"),
    mitem("blackholegenerator"), mitem("microwavereciever"), mitem("warpcore"), mitem("biomescanner"),
    mitem("spaceelevatorcontroller"), mitem("gravitymachine"), mitem("spacelaser"), mitem("stationmarker"),
    mitem("advrocketmotor"), mitem("nuclearrocketmotor"), mitem("nuclearfueltank"), mitem("nuclearcore"),
    mitem("drill"), mitem("stationbuilder"), mitem("deployablerocketbuilder"), mitem("loader"), mitem("loader", 1), mitem("loader", 6),
    mitem("monitoringstation"), mitem("satellitecontrolcenter"), mitem("warpmonitor"), mitem("orientationcontroller"),
    mitem("gravitycontroller"), mitem("altitudecontroller"), mitem("planetselector"), mitem("planetholoselector"),
    mitem("oxygenscrubber"), mitem("oxygenvent"), mitem("hotturf"), mitem("basalt"), mitem("geode"), mitem("vitrifiedsand"),
    mitem("charcoallog"), mitem("electricmushroom"), mitem("alienwood"), mitem("alienleaves"), mitem("aliensapling"),
    mitem("planks"), item("libvulpes:ore0", 10),
    // Titanium Iridium
    mitem("productdust", 1), mitem("productingot", 1), mitem("productnugget", 1), mitem("productplate", 1), mitem("productrod", 1),
    mitem("productsheet", 1), mitem("productgear", 1), mitem("metal0", 1), item("libvulpes:productrod", 10),
    mitem("dataunit"), mitem("satellitepowersource"), mitem("satellitepowersource", 1), mitem("orescanner"),
    mitem("carbonscrubbercartridge"), mitem("satellite"), item("libvulpes:advstructuremachine"), item("libvulpes:elitemotor"),
]
for (def i in 0..5) tier12Items.add(mitem("crystal", i))
for (def it in ["satelliteid", "asteroid", "elevator", "spacestation"]) tier12Items.add(mitem("${it}chip"))
for (def i in 0..6) tier12Items.add(mitem("satelliteprimaryfunction", i))

def creativeItems = [item("libvulpes:creativepowerbattery")]

def removeRecipes = [
    mitem("platepress"), mitem("solargenerator"),
    mitem("rollingmachine"), mitem("lathe"), mitem("cuttingmachine"), mitem("electrolyser"), mitem("centrifuge"),
    mitem("beacon"), mitem("railgun"), mitem("bipropellantrocketmotor"), mitem("advbipropellantrocketmotor"),
    mitem("bipropellantfueltank"), mitem("oxidizerfueltank"), mitem("terraformingterminal"), mitem("ic", 3), mitem("ic", 4), mitem("ic", 5),
    mitem("misc", 1), mitem("sawblade"), mitem("sawbladeiron"), item("libvulpes:coalgenerator"), item("libvulpes:productfan", 6),
    item("libvulpes:coil0", 10), item("libvulpes:battery"), item("libvulpes:battery", 1),
]

def removeCutting = [
    mitem("wafer"), mitem("ic"), mitem("ic", 2),
]
def removeAssembler = [
    mitem("itemcircuitplate", 1), mitem("itemcircuitplate"), mitem("ic", 1), mitem("ic", 3), mitem("ic", 4), mitem("ic", 5),
    mitem("beaconfinder"),
]
def removeCrystallizer = [
    item("libvulpes:productboule", 3),
]

def hideFromJei = [
    mitem("landingfloat"), mitem("basiclasergun"), mitem("unlittorch"),
] + removeRecipes + removeCutting + removeAssembler + removeCrystallizer

for (def it in tier3Items) TooltipEvents.setTier(it, 3)
for (def it in tier7Items) TooltipEvents.setTier(it, 7)
for (def it in tier8Items) TooltipEvents.setTier(it, 8)
for (def it in tier12Items) TooltipEvents.setTier(it, 12)
for (def it in creativeItems) TooltipEvents.setTier(it, 15)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)

TooltipEvents.setUnlock(item("libvulpes:structuremachine"), 8)
