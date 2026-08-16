#sideonly client
#reloadable

import mods.modularmachinery.ControllerGUIRenderEvent;
import mods.modularmachinery.MMEvents;
import crafttweaker.text.ITextComponent;
import native.com.dimensional.gatewaycore.mmce.MMCEUtils;
import native.hellfirepvp.modularmachinery.common.tiles.base.TileMultiblockMachineController;
import native.de.ellpeck.actuallyadditions.mod.util.AssetUtil;
import crafttweaker.util.Position3f;

MMEvents.onControllerGUIRender("starlight_laser", function(event as ControllerGUIRenderEvent) {
    var state = null as string;
    var nextState = null as string;
    if !isNull(event.controller.customData) {
        val actualState = event.controller.customData.state;
        if !isNull(actualState) {
            state = actualState as string;
        }
        val actualNextState = event.controller.customData.nextState;
        if !isNull(actualNextState) {
            nextState = actualNextState as string;
        }
    }

    if isNull(state) {
        if !isNull(nextState) {
            event.extraInfo =
                ITextComponent.fromTranslation(
                    "tile.modularmachinery.starlight_laser.desc.currently_attuning",
                    [ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc." ~ nextState).formattedText]).formattedText;
        } else {
            event.extraInfo =
                ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.not_attuned").formattedText;
        }
    } else {
        event.extraInfo =
            ITextComponent.fromTranslation(
                "tile.modularmachinery.starlight_laser.desc.current",
                [ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc." ~ state).formattedText]).formattedText;
        if !isNull(nextState) {
            event.extraInfo =
                ITextComponent.fromTranslation(
                    "tile.modularmachinery.starlight_laser.desc.next",
                    [ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc." ~ nextState).formattedText]).formattedText;
        }
    }
});

static laserPositions as int[string][string] = {
    midnight: {x: 0, y: 3, z: 0},
    dawn: {x: -3, y: 3, z: 3},
    noon: {x: 0, y: 3, z: 6},
    dusk: {x: 3, y: 3, z: 3},
};

static crystalPosition as int[string]= {x: 0, y: 3, z: 3};

static laserColors as float[][string] = {
    midnight: [0.184 / 3, 0.157 / 3, 0.271 / 3],
    dawn: [0.992 / 3, 0.851 / 3, 0.745 / 3],
    noon: [0.682 / 3, 0.827 / 3, 0.898 / 3],
    dusk: [0.365 / 3, 0.376 / 3, 0.467 / 3],
};


function renderState(tile as TileMultiblockMachineController, state as string, beamWidth as float) {
    val colors = laserColors[state];
    val delta = laserPositions[state];
    val laserOffset = tile.rotateWithControllerFacing(Position3f.create(delta.x, delta.y, delta.z));
    val crystalOffset = tile.rotateWithControllerFacing(Position3f.create(crystalPosition.x, crystalPosition.y, crystalPosition.z));

    AssetUtil.renderLaser(
        (tile.pos.x + crystalOffset.x) as float + 0.5f, (tile.pos.y + crystalOffset.y) as float + 0.5f, (tile.pos.z + crystalOffset.z) as float + 0.5f,
        (tile.pos.x + laserOffset.x) as float + 0.5, (tile.pos.y + laserOffset.y) as float + 0.5, (tile.pos.z + laserOffset.z) as float + 0.5,
        80, 0.8f, beamWidth, colors);
}


MMCEUtils.registerRenderer("starlight_laser", function(controller as TileMultiblockMachineController, x as double, y as double, z as double) {
    val hasNextState = !isNull(controller.customData) && !isNull(controller.customData.nextState);
    if !isNull(controller.customData) && !isNull(controller.customData.state) {
        renderState(controller, controller.customData.state as string, hasNextState ? 0.15 : 0.225);
    }
    if hasNextState {
        renderState(controller, controller.customData.nextState as string, 0.075);
    }
});
