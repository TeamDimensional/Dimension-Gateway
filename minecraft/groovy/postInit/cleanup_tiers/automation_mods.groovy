import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("integrateddynamics:${name}", k)
}

def titem(name, k=0) {
    return item("integratedtunnels:${name}", k)
}

TooltipEvents.setModTier("modularrouters", 4)
TooltipEvents.setModTier("integratedcrafting", 7)
TooltipEvents.setModTier("integrateddynamics", 7)
TooltipEvents.setModTier("integratedterminals", 7)
TooltipEvents.setModTier("integratedtunnels", 7)

def enderItems = [item("modularrouters:module", 7), item("modularrouters:module", 13)]

def advancedItems = [
    mitem("part_connector_omni_directional_item"), mitem("logic_director"),
    item("integratednbt:nbt_extractor"), item("integratednbt:nbt_extractor_remote"),
    titem("part_importer_world_item_item"), titem("part_exporter_world_item_item"),
    titem("part_importer_world_fluid_item"), titem("part_exporter_world_fluid_item"),
    titem("part_importer_world_block_item"), titem("part_exporter_world_block_item"),
    titem("part_interface_energy_item"), titem("part_importer_energy_item"), titem("part_exporter_energy_item"),
    item("integratedterminals:chorus_glass"), mitem("crystalized_chorus_chunk"), mitem("crystalized_chorus_brick_stairs"),
    mitem("crystalized_chorus_block_stairs"), mitem("crystalized_chorus_brick"), mitem("crystalized_chorus_block"),
]

def removeRecipes = [
    mitem("part_entity_writer_item"),
    mitem("part_machine_writer_item"),
    mitem("part_inventory_writer_item"),
    titem("part_importer_world_energy_item"),
    titem("part_exporter_world_energy_item"),
]

def hideFromJei = [
    mitem("creative_energy_battery"), item("modularrouters:template_frame"), item("modularrouters:override_card")
] + removeRecipes

for (def it in enderItems) TooltipEvents.setTier(it, 6)
for (def it in advancedItems) TooltipEvents.setTier(it, 8)
TooltipEvents.setTier(titem("part_player_simulator_item"), 8)
TooltipEvents.setTier(mitem("on_the_dynamics_of_integration"), 1)
TooltipEvents.setTier(item("guideapi:modularrouters-guidebook"), 1)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
