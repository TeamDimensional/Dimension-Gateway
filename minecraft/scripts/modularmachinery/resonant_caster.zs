#reloadable

import mods.modularmachinery.RecipeBuilder;
import crafttweaker.text.ITextComponent;
import mods.modularmachinery.RecipeCheckEvent;

import native.hellfirepvp.modularmachinery.common.crafting.helper.RecipeCraftingContext;
import native.hellfirepvp.modularmachinery.common.crafting.helper.RequirementComponents;
import native.hellfirepvp.modularmachinery.common.crafting.helper.ProcessingComponent;
import native.hellfirepvp.modularmachinery.common.crafting.requirement.RequirementFluid;
import native.hellfirepvp.modularmachinery.common.machine.IOType;
import native.hellfirepvp.modularmachinery.common.util.nbt.NBTMatchingHelper;
import native.hellfirepvp.modularmachinery.common.util.nbt.NBTJsonDeserializer;
import native.net.minecraftforge.fluids.capability.IFluidHandler;
import native.net.minecraftforge.fluids.FluidStack;
import native.com.dimensional.gatewaycore.mmce.MMCEUtils;
import native.mcjty.deepresonance.fluid.LiquidCrystalFluidTagData;

RecipeBuilder.newBuilder("resonating_gem", "resonant_caster", 150)
    .addItemInput(<gateway:impure_resonating_gem>)
    .addFluidInput(<fluid:liquid_crystal> * 250)
    .addItemOutput(<gateway:resonating_gem>)
    .addRecipeTooltip("")
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.resonant_caster.desc1", [50]).formattedText)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.resonant_caster.desc2", [20, 20]).formattedText)
    .addPostCheckHandler(function(event as RecipeCheckEvent) { checkRCL(event, 50, 20, 20); })
    .build();

RecipeBuilder.newBuilder("red_matter", "resonant_caster", 900)
    .addItemInput(<projecte:item.pe_matter>)
    .addFluidInput(<fluid:liquid_crystal> * 1500)
    .addItemOutput(<projecte:item.pe_matter:1>)
    .addRecipeTooltip("")
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.resonant_caster.desc1", [80]).formattedText)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.resonant_caster.desc2", [80, 80]).formattedText)
    .addPostCheckHandler(function(event as RecipeCheckEvent) { checkRCL(event, 80, 80, 80); })
    .build();


function checkRCL(event as RecipeCheckEvent, minPurity as int, minStrength as int, minEfficiency as int) as void {
    var activeRecipe = event.activeRecipe;
    print("checkRCL " ~ minPurity);
    if isNull(activeRecipe) {
        print("null");
        return;
    }

    val ctx = MMCEUtils.getContext(event);        // RecipeCraftingContext
    val reqComps = ctx.getCurrentComponents();    // List<RequirementComponents>

    for rc in reqComps {
        val requirement = rc.requirement();       // ComponentRequirement<?, ?>
        if (requirement instanceof RequirementFluid && requirement.getActionType() == IOType.INPUT) {
            for pc in rc.components() {           // List<ProcessingComponent<?>>
                val provided = pc.getProvidedComponent();  // IFluidHandler for fluid components
                if (provided instanceof IFluidHandler) {   // filters out gas/Mekanism handlers
                    val tank = provided as IFluidHandler;
                    for prop in tank.getTankProperties() { // IFluidTankProperties[]
                        val fluidStack = prop.getContents(); // FluidStack, may be null (empty slot)
                        val rclData = LiquidCrystalFluidTagData.fromStack(fluidStack);
                        if (rclData != null) {
                            val purity = (rclData.getPurity() * 100) as int;
                            val strength = (rclData.getStrength() * 100) as int;
                            val efficiency = (rclData.getEfficiency() * 100) as int;

                            var errorStatus = "";
                            if (purity < minPurity) {
                                errorStatus = errorStatus ~ "RCL is not pure enough\n(required " ~ minPurity ~ ", got " ~ purity ~ ")\n";
                            }
                            
                            if (strength < minStrength) {
                                errorStatus = errorStatus ~ "RCL is not strong enough\n(required " ~ minStrength ~ ", got " ~ strength ~ ")\n";
                            }
                            
                            if (efficiency < minEfficiency) {
                                errorStatus = errorStatus ~ "RCL is not efficient enough\n(required " ~ minEfficiency ~ ", got " ~ efficiency ~ ")\n";
                            }

                            if (errorStatus != "") {
                                event.setFailed(errorStatus);
                                print(errorStatus);
                            }
                        }
                    }
                }
            }
        }
    }
}
