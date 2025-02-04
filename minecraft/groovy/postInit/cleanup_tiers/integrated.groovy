import com.dimensional.gatewaycore.events.TooltipEvents
import classes.GatewayHelpers

def mitem(name, k=0) {
    return item("integrateddynamics:${name}", k)
}

def titem(name, k=0) {
    return item("integratedtunnels:${name}", k)
}

TooltipEvents.setModTier("integratedcrafting", 6)
TooltipEvents.setModTier("integrateddynamics", 6)
TooltipEvents.setModTier("integratedterminals", 6)
TooltipEvents.setModTier("integratedtunnels", 6)

def advancedItems = [
    mitem("part_connector_omni_directional_item"), mitem("logic_director"),
    item("integratednbt:nbt_extractor"), item("integratednbt:nbt_extractor_remote"),
    titem("part_importer_world_item_item"), titem("part_exporter_world_item_item"),
    titem("part_importer_world_fluid_item"), titem("part_exporter_world_fluid_item"),
    titem("part_importer_world_block_item"), titem("part_exporter_world_block_item"),
    titem("part_interface_energy_item"), titem("part_importer_energy_item"), titem("part_exporter_energy_item"),
]

def removeRecipes = [
    mitem("part_entity_writer_item"),
    mitem("part_machine_writer_item"),
    mitem("part_inventory_writer_item"),
    titem("part_importer_world_energy_item"),
    titem("part_exporter_world_energy_item"),
]

def hideFromJei = [mitem("creative_energy_battery")] + removeRecipes

for (def it in advancedItems) TooltipEvents.setTier(it, 8)
TooltipEvents.setTier(titem("part_player_simulator_item"), 9)
for (def it in hideFromJei) GatewayHelpers.hide(it)
for (def it in removeRecipes) crafting.removeByOutput(it)
