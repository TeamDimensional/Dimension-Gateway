#reloadable

import mods.modularmachinery.RecipeBuilder;
import mods.modularmachinery.RecipeFinishEvent;
import mods.modularmachinery.RecipeCheckEvent;
import mods.modularmachinery.IMachineController;
import mods.modularmachinery.ControllerGUIRenderEvent;
import mods.modularmachinery.MMEvents;

import crafttweaker.util.Position3f;
import crafttweaker.text.ITextComponent;

import scripts.modularmachinery.utils.getControllerSender;
import scripts.modularmachinery.utils.setBlockById;
import scripts.modularmachinery.utils.getAbsolutePos;

RecipeBuilder.newBuilder("charge", "wizards_nightmare", 10)
    .addBiomeInput("ebt:rainforest")
    .addFluidInput(<fluid:corium> * 4000)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.wizards_nightmare.desc.creates_charge", [40]).formattedText)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.wizards_nightmare.desc.consumes_block.1").formattedText)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.wizards_nightmare.desc.consumes_block.2").formattedText)
    // .addPotentialEnergyInput(500)
    .addPostCheckHandler(function(event as RecipeCheckEvent) {
        checkMaxCharge(event, 60);
    })
    .addFinishHandler(function(event as RecipeFinishEvent) {
        logger.logInfo("finish handler called");
        addCharge(event, 40);
        consumeChargingBlock(event);
    })
    .build();

RecipeBuilder.newBuilder("gaia_spirit", "wizards_nightmare", 100)
    .addBiomeInput("essentialcraft:magiccorruption")
    .addBiomeInput("advancedrocketry:alien_forest")
    .addItemInput(<extrabotany:material:1>).setChance(0)
    .addItemInput(<ee:eye_stone_lit>)
    .addItemInput(<extrautils2:decorativesolid:8>)
    .addItemInput(<witchery:condensed_fear>).setChance(0.1)
    .addItemInput(<theaurorian:absorptionorb:*>).consumeDurability(10)
    .addItemInput(<witchery:spectral_stone>).setChance(0.02)
    .addItemOutput(<botania:manaresource:5> * 2)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.wizards_nightmare.desc.consumes_charge", [5]).formattedText)
    .addPostCheckHandler(function(event as RecipeCheckEvent) {
        checkMinCharge(event, 5);
    })
    .addFinishHandler(function(event as RecipeFinishEvent) {
        addCharge(event, -5);
    })
    .build();

RecipeBuilder.newBuilder("medal_for_heroism", "wizards_nightmare", 500)
    .addBiomeInput("essentialcraft:magiccorruption")
    .addBiomeInput("advancedrocketry:crystalchasms")
    .addItemInput(<extrabotany:material:1>).setChance(0)
    .addItemInput(<ee:amber_ingot> * 3)
    .addItemInput(<aether_legacy:victory_medal>)
    .addItemInput(<witchery:focused_will>).setChance(0.25)
    .addItemInput(<theaurorian:absorptionorb:*>).consumeDurability(10)
    .addItemInput(<kami:ichor>)
    .addItemOutput(<extrabotany:material:3>)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.wizards_nightmare.desc.consumes_charge", [25]).formattedText)
    .addPostCheckHandler(function(event as RecipeCheckEvent) {
        checkMinCharge(event, 25);
    })
    .addFinishHandler(function(event as RecipeFinishEvent) {
        addCharge(event, -25);
    })
    .build();

function getCharge(controller as IMachineController) as int {
    var currentCharge = 0;
    if !isNull(controller.customData) && !isNull(controller.customData.charge) {
        currentCharge = controller.customData.charge as int;
    }
    return currentCharge;
}

MMEvents.onControllerGUIRender("wizards_nightmare", function(event as ControllerGUIRenderEvent) {
    val currentCharge = getCharge(event.controller);

    event.extraInfo =
        ITextComponent.fromTranslation("tile.modularmachinery.wizards_nightmare.desc.charge", currentCharge).formattedText;
});

function checkMaxCharge(event as RecipeCheckEvent, charge as int) as void {
    if getCharge(event.controller) > charge {
        event.setFailed(ITextComponent.fromTranslation("tile.modularmachinery.wizards_nightmare.error.already_charged").formattedText);
        return;
    }
}

function checkMinCharge(event as RecipeCheckEvent, charge as int) as void {
    if getCharge(event.controller) < charge {
        event.setFailed(ITextComponent.fromTranslation("tile.modularmachinery.wizards_nightmare.error.needs_more_charge").formattedText);
        return;
    }
}

function addCharge(event as RecipeFinishEvent, charge as int) as void {
    event.controller.customData = {"charge": getCharge(event.controller) + charge};
}

static catalystPositions as Position3f[] = [
    Position3f.create(-2, 0, 5),
    Position3f.create(0, 0, 5),
    Position3f.create(2, 0, 5),
];

function consumeChargingBlock(event as RecipeFinishEvent) as void {
    val delta = catalystPositions[event.controller.world.random.nextInt(catalystPositions.length)];
    val blockToReplace = getAbsolutePos(event.controller, delta);
    logger.logInfo("block: " + blockToReplace.x + " " + blockToReplace.y + " " + blockToReplace.z);
    setBlockById(getControllerSender(event.controller), blockToReplace, "minecraft:air", 0);
}
