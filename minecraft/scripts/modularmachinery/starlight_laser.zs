#reloadable

import crafttweaker.text.ITextComponent;
import crafttweaker.item.IItemStack;

import mods.modularmachinery.RecipeBuilder;
import mods.modularmachinery.RecipeCheckEvent;
import mods.modularmachinery.RecipeFinishEvent;
import mods.modularmachinery.RecipeEvent;
import mods.modularmachinery.RecipeTickEvent;
import native.com.dimensional.gatewaycore.mmce.MMCEUtils;
import native.hellfirepvp.modularmachinery.common.crafting.helper.RequirementComponents;
import native.hellfirepvp.modularmachinery.common.crafting.requirement.RequirementItem;
import native.hellfirepvp.modularmachinery.common.machine.IOType;
import native.net.minecraft.item.ItemStack;

RecipeBuilder.newBuilder("priming", "starlight_laser", 1200)
    .addItemInput(<theaurorian:aurorianiteingot> * 16)
    .addItemInput(<theaurorian:crystallineingot> * 16)
    .addItemInput(<theaurorian:umbraingot> * 16)
    .addItemInput(<essentialcraft:blockpale> * 16)
    .addStarlightInput(400)
    .addEnergyPerTickInput(4000)
    .addItemOutput(<item:gateway:starlight_fragment_midnight>)
    .addRecipeTooltip(
        ITextComponent.fromTranslation(
            "tile.modularmachinery.starlight_laser.desc.next_state",
            [ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.midnight").formattedText]).formattedText)
    .addFinishHandler(function(event as RecipeFinishEvent) { setState(event, "midnight"); })
    .build();

RecipeBuilder.newBuilder("night", "starlight_laser", 20)
    .addItemInput(<essentialcraft:genitem:39>)
    .addStarlightInput(5)
    .addEnergyPerTickInput(1000)
    .addItemInput(<item:gateway:starlight_fragment_midnight>)
    .addItemOutput(<item:gateway:starlight_fragment_dawn>)
    .addItemOutput(<item:gateway:starlight_fragment_noon>)
    .addItemOutput(<item:gateway:starlight_fragment_dusk>)
    .addItemOutput(<item:gateway:catalyzed_starlight>).setChance(0.25)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.next_state_random").formattedText)
    .addRecipeTooltip(
        ITextComponent.fromTranslation(
            "tile.modularmachinery.starlight_laser.desc.current_state",
            [ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.midnight").formattedText]).formattedText)
    .addPostCheckHandler(function(event as RecipeCheckEvent) { chooseNextState(event, "midnight", ["dawn", "noon", "dusk"]); })
    .addFinishHandler(function(event as RecipeFinishEvent) { setActiveState(event); })
    .addPostTickHandler(function(event as RecipeTickEvent) { removeWrongFragments(event); })
    .build();

RecipeBuilder.newBuilder("dawn", "starlight_laser", 20)
    .addItemInput(<theaurorian:scrapaurorianite>)
    .addStarlightInput(5)
    .addEnergyPerTickInput(1000)
    .addItemInput(<item:gateway:starlight_fragment_dawn>)
    .addItemOutput(<item:gateway:starlight_fragment_noon>)
    .addItemOutput(<item:gateway:starlight_fragment_dusk>)
    .addItemOutput(<item:gateway:starlight_fragment_midnight>)
    .addItemOutput(<item:gateway:catalyzed_starlight>).setChance(0.25)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.next_state_random").formattedText)
    .addRecipeTooltip(
        ITextComponent.fromTranslation(
            "tile.modularmachinery.starlight_laser.desc.current_state",
            [ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.dawn").formattedText]).formattedText)
    .addPostCheckHandler(function(event as RecipeCheckEvent) { chooseNextState(event, "dawn", ["noon", "dusk", "midnight"]); })
    .addFinishHandler(function(event as RecipeFinishEvent) { setActiveState(event); })
    .addPostTickHandler(function(event as RecipeTickEvent) { removeWrongFragments(event); })
    .build();

RecipeBuilder.newBuilder("noon", "starlight_laser", 20)
    .addItemInput(<theaurorian:scrapcrystalline>)
    .addStarlightInput(5)
    .addEnergyPerTickInput(1000)
    .addItemInput(<item:gateway:starlight_fragment_noon>)
    .addItemOutput(<item:gateway:starlight_fragment_dusk>)
    .addItemOutput(<item:gateway:starlight_fragment_midnight>)
    .addItemOutput(<item:gateway:starlight_fragment_dawn>)
    .addItemOutput(<item:gateway:catalyzed_starlight>).setChance(0.25)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.next_state_random").formattedText)
    .addRecipeTooltip(
        ITextComponent.fromTranslation(
            "tile.modularmachinery.starlight_laser.desc.current_state",
            [ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.noon").formattedText]).formattedText)
    .addPostCheckHandler(function(event as RecipeCheckEvent) { chooseNextState(event, "noon", ["dusk", "midnight", "dawn"]); })
    .addFinishHandler(function(event as RecipeFinishEvent) { setActiveState(event); })
    .addPostTickHandler(function(event as RecipeTickEvent) { removeWrongFragments(event); })
    .build();

RecipeBuilder.newBuilder("dusk", "starlight_laser", 20)
    .addItemInput(<theaurorian:scrapumbra>)
    .addStarlightInput(5)
    .addEnergyPerTickInput(1000)
    .addItemInput(<item:gateway:starlight_fragment_dusk>)
    .addItemOutput(<item:gateway:starlight_fragment_midnight>)
    .addItemOutput(<item:gateway:starlight_fragment_dawn>)
    .addItemOutput(<item:gateway:starlight_fragment_noon>)
    .addItemOutput(<item:gateway:catalyzed_starlight>).setChance(0.25)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.next_state_random").formattedText)
    .addRecipeTooltip(
        ITextComponent.fromTranslation(
            "tile.modularmachinery.starlight_laser.desc.current_state",
            [ITextComponent.fromTranslation("tile.modularmachinery.starlight_laser.desc.dusk").formattedText]).formattedText)
    .addPostCheckHandler(function(event as RecipeCheckEvent) { chooseNextState(event, "dusk", ["midnight", "dawn", "noon"]); })
    .addFinishHandler(function(event as RecipeFinishEvent) { setActiveState(event); })
    .addPostTickHandler(function(event as RecipeTickEvent) { removeWrongFragments(event); })
    .build();


function setState(event as RecipeEvent, state as string) as void {
    event.controller.customData = {"state": state};
}

function setActiveState(event as RecipeFinishEvent) as void {
    if (isNull(event.controller.customData) || isNull(event.controller.customData.nextState)) {
        logger.logError("Starlight Laser is not attuned! This should not happen, report a bug.");
        return;
    }

    event.controller.customData = {"state": event.controller.customData.nextState};
}

static nameToItem as IItemStack[string] = {
    midnight: <item:gateway:starlight_fragment_midnight>,
    noon: <item:gateway:starlight_fragment_noon>,
    dawn: <item:gateway:starlight_fragment_dawn>,
    dusk: <item:gateway:starlight_fragment_dusk>,
};
static stateNames as string[] = ["midnight", "noon", "dawn", "dusk"];

function shouldRemoveItem(rc as RequirementComponents, chosenState as string) as bool {
    if (rc.requirement().actionType != IOType.OUTPUT) return false;
    if (!(rc.requirement() instanceof RequirementItem)) return false;
    val ri = rc.requirement() as RequirementItem;
    val stack = ri.required;
    for state in stateNames {
        if state != chosenState && stack.wrapper.name == nameToItem[state].name {
            return true;
        }
    }
    return false;
}

function removeWrongFragments(event as RecipeEvent) {
    val ctx = MMCEUtils.getContext(event);
    val nextState = event.controller.customData.nextState as string;
    var components = ctx.currentComponents as [RequirementComponents];
    var newComponents = [] as [RequirementComponents];
    for comp in components {
        if !shouldRemoveItem(comp, nextState) {
            newComponents.add(comp);
        }
    }
    components.clear();
    for comp in newComponents {
        components.add(comp);
    }
}

function chooseNextState(event as RecipeCheckEvent, currentState as string, nextStates as string[]) as void {
    if (isNull(event.controller.customData) || isNull(event.controller.customData.state)) {
        event.setFailed("Starlight Laser is not attuned!");
        return;
    }
    val state = event.controller.customData.state as string;
    if (state != currentState) {
        event.setFailed("Current state does not match!\nExpected " ~ currentState ~ ", got " ~ state);
        return;
    }

    val next = nextStates[event.controller.world.random.nextInt(nextStates.length)];
    event.controller.customData = {"state": currentState, "nextState": next};
    removeWrongFragments(event);
}
