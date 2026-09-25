import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("modularmachinery:${name}", k)
}
def aitem(name, k=0) {
    return item("modularmachineryaddons:${name}", k)
}
def citem(name, k=0) {
    return item("mmce_complement:${name}", k)
}

def removed = [
    aitem("blockradiationprovideroutput"), aitem("blockmeessentiaoutputbus"), aitem("blockvisprovideroutput"), aitem("blockpotentialenergyprovideroutput"),
    aitem("blockdimensionproviderinput"), aitem("inactiveradiationsponge"), /* mitem("itemblueprint"), mitem("blockcontroller"), */
    mitem("blockfactorycontroller"), mitem("blocksmartinterface"), mitem("blockmefluidoutputbus"),
    mitem("blockmepatternprovider"), mitem("blockmepatternmirrorimage"), mitem("blockimpetusprovideroutput"),
    mitem("blockgridproviderinput"), mitem("blockgridprovideroutput"), mitem("blockrainbowprovider"), mitem("blockstarlightprovideroutput"),
    mitem("blockauraprovideroutput"), mitem("blockmanaprovideroutput"), mitem("crushing_wheels"), mitem("blockconstellationprovider"),
    mitem("itemmodularium"), citem("machine_glass"), citem("filtered_item_output_hatch"), citem("filtered_fluid_output_hatch"),
    citem("attachment_construct_tool"), citem("self_cycle_assembly_hatch"), citem("me_pattern_provider_ii"), citem("me_channel_input_hatch"),
    citem("me_full_exposure_assembly"), citem("redstone_control_hatch"), citem("redstone_signal_input_hatch"), citem("batch_hatch"),
]
for (def i in 0..6) {
    removed.add(aitem("blocksingularityiteminputbus", i))
    removed.add(aitem("blocksingularityitemoutputbus", i))
}
for (def i in [1, 2, 3, 5]) {
    removed.add(mitem("blockcasing", i))
}
for (def i in 0..4) {
    removed.add(mitem("blockparallelcontroller", i))
    removed.add(mitem("blockupgradebus", i))
    removed.add(citem("data_input_assembly_hatch", i))
}
for (def i in 0..5) {
    removed.add(citem("thread_hatch", i))
    removed.add(citem("overclock_hatch", i))
}

for (def i in 0..7) {
    removed.add(mitem("blockfluidoutputhatch", i))
    removed.add(mitem("blockenergyoutputhatch", i))
    removed.add(citem("accelerator_hatch", i))
    removed.add(citem("liquid_energizer_hatch", i))
    removed.add(citem("quad_fluid_output_hatch_tiny", i))
    removed.add(citem("nine_fluid_input_hatch_normal", i))
    removed.add(citem("nine_fluid_output_hatch_normal", i))
}

def devTools = [
    aitem("advancedconstructtool"), mitem("itemconstructtool"), mitem("itemblueprint"), mitem("blockcontroller"),
]

// Per-multiblock
def theGate = []
for (def i in 0..5) theGate.add(citem("blockcasing", i))
def corruptionAltar = [aitem("blockfluxproviderinput"), aitem("blockpotentialenergyproviderinput")]
def rainbowColoringStation = [aitem("blockradiationproviderinput"), aitem("radiationsponge")]
def largeScrubber = [aitem("blockscrubberproviderinput"), mitem("blockmanaproviderinput")]
def thaumicCentrifuge = [mitem("blockmanaproviderinput"), mitem("blockaspectprovideroutput")]
def resonantCaster = []
def riftEmpowerer = [aitem("blockfluxprovideroutput"), aitem("blockbiomeproviderinput"), mitem("blockimpetusproviderinput")]
def networkSupercharger = []
def starlightLaser = [mitem("blockstarlightproviderinput"), aitem("blockvisproviderinput")]
def dawnstoneRefinery = [mitem("blockaspectproviderinput")]
def moonlightFabricator = [mitem("blockauraproviderinput")]
def glassworkingChamber = [citem("redstone_signal_output_hatch")]

// Generic
def generic = [
    aitem("advancedmachineassembler"), aitem("advancedmachinedisassembler"), mitem("itemmodularium"), mitem("machine_projector"),
    mitem("blockcasing"),
]
for (def i in 0..1) {
    generic.add(citem("input_assembly_hatch", i))
    generic.add(citem("output_assembly_hatch", i))
}
for (def i in 0..2) {
    generic.add(mitem("blockinputbus", i))
    generic.add(mitem("blockoutputbus", i))
}

for (def i in 0..2) {
    dawnstoneRefinery.add(mitem("blockfluidinputhatch", i))
    dawnstoneRefinery.add(citem("quad_fluid_input_hatch_tiny", i))
    largeScrubber.add(mitem("blockfluidinputhatch", i))
}

def reinforced = [
    mitem("blockcasing", 4), citem("input_assembly_hatch", 2), citem("output_assembly_hatch", 2),
]
for (def i in 3..4) {
    reinforced.add(mitem("blockinputbus", i))
    reinforced.add(mitem("blockoutputbus", i))
    reinforced.add(mitem("blockfluidinputhatch", i))
    reinforced.add(mitem("blockenergyinputhatch", i))
    reinforced.add(citem("quad_fluid_input_hatch_tiny", i))
}

def huge = []
for (def i in 5..7) {
    huge.add(mitem("blockinputbus", i))
    huge.add(mitem("blockoutputbus", i))
    huge.add(mitem("blockfluidinputhatch", i))
    huge.add(mitem("blockenergyinputhatch", i))
    huge.add(citem("quad_fluid_input_hatch_tiny", i))
}
for (def i in 3..4) {
    huge.add(citem("input_assembly_hatch", i))
    huge.add(citem("output_assembly_hatch", i))
}

for (def i in 0..2) {
    starlightLaser.add(mitem("blockenergyinputhatch", i))
    networkSupercharger.add(mitem("blockenergyinputhatch", i))
}

// Per-mod-unlock
def thaumicAE2 = [aitem("blockmeessentiainputbus")]
def ae2 = [
    mitem("blockmeitemoutputbus"), mitem("blockmeiteminputbus"), mitem("blockmefluidinputbus"),
    citem("me_ore_dict_input_bus"), citem("me_item_inventory_input_bus"), citem("me_fluid_inventory_input_bus"),
]
def advancedAE2 = [citem("me_connection_share_hatch")]

crafting.remove("modularmachinery:controller") // OP, can be any controller at 0 cost
crafting.remove("modularmachinery:modularium_ingot")
crafting.remove("modularmachinery:casing_firebox")
crafting.remove("modularmachinery:energy_output_tiny")
crafting.remove("modularmachinery:energy_output_small")
crafting.remove("modularmachinery:fluid_output_tiny")
crafting.remove("modularmachinery:fluid_output_small")

// Applying
for (def it in removed) GatewayHelpers.hide(it)
for (def it in devTools) TooltipEvents.setTier(it, 0)
for (def it in corruptionAltar) TooltipEvents.setTier(it, 13)
for (def it in rainbowColoringStation) TooltipEvents.setTier(it, 12)
for (def it in largeScrubber) TooltipEvents.setTier(it, 11)
for (def it in thaumicCentrifuge) TooltipEvents.setTier(it, 10)
for (def it in resonantCaster) TooltipEvents.setTier(it, 10)
for (def it in riftEmpowerer) TooltipEvents.setTier(it, 9)
for (def it in networkSupercharger) TooltipEvents.setTier(it, 8)
for (def it in starlightLaser) TooltipEvents.setTier(it, 6)
for (def it in dawnstoneRefinery) TooltipEvents.setTier(it, 5)
for (def it in moonlightFabricator) TooltipEvents.setTier(it, 4)
for (def it in glassworkingChamber) TooltipEvents.setTier(it, 4)
for (def it in generic) TooltipEvents.setTier(it, 4)
for (def it in reinforced) TooltipEvents.setTier(it, 8)
for (def it in ae2) TooltipEvents.setTier(it, 8)
for (def it in huge) TooltipEvents.setTier(it, 9)
for (def it in thaumicAE2) TooltipEvents.setTier(it, 9)
for (def it in advancedAE2) TooltipEvents.setTier(it, 10)
for (def it in theGate) TooltipEvents.setTier(it, 14)
