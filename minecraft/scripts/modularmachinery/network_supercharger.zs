#reloadable

import mods.modularmachinery.RecipeBuilder;
import crafttweaker.text.ITextComponent;
import mods.modularmachinery.RecipeTickEvent;
import crafttweaker.world.IBlockPos;
import crafttweaker.util.Position3f;

import native.appeng.api.config.PowerUnits;
import native.appeng.api.config.Actionable;
import native.appeng.tile.networking.TileController;

RecipeBuilder.newBuilder("crude", "network_supercharger", 1200)
    .addItemInput(<prodigytech:circuit_crude>).setChance(0)
    .addEnergyPerTickInput(250)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.network_supercharger.desc.seconds", [20]).formattedText)
    .addPostTickHandler(function(event as RecipeTickEvent) { supercharge(event, 400); })
    .build();

RecipeBuilder.newBuilder("refined", "network_supercharger", 1200)
    .addItemInput(<prodigytech:circuit_refined>).setChance(0)
    .addItemInput(<prodigytech:aeternus_crystal>).setChance(0.3)
    .addItemInput(<embers:aspectus_dawnstone>).setChance(0.3)
    .addItemInput(<thaumcraft:salis_mundus>).setChance(0.3)
    .addItemInput(<immersiveengineering:metal_decoration0:2>).setChance(0.3)
    .addEnergyPerTickInput(1000)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.network_supercharger.desc.seconds", [5]).formattedText)
    .addPostTickHandler(function(event as RecipeTickEvent) { supercharge(event, 100); })
    .build();

RecipeBuilder.newBuilder("energy_flow", "network_supercharger", 1200)
    .addItemInput(<calculator:circuitboard:9>).setChance(0)
    .addItemInput(<thermalfoundation:material:295>).setChance(0.2)
    .addItemInput(<factorytech:machinepart:170>).setChance(0.2)
    .addItemInput(<naturesaura:token_euphoria>).setChance(0.2)
    .addItemInput(<calculator:electricdiamond>).setChance(0.2)
    .addEnergyPerTickInput(5000)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.network_supercharger.desc.ticks", [20]).formattedText)
    .addPostTickHandler(function(event as RecipeTickEvent) { supercharge(event, 20); })
    .build();

RecipeBuilder.newBuilder("perfected", "network_supercharger", 1200)
    .addItemInput(<prodigytech:circuit_perfected>).setChance(0)
    .addItemInput(<essentialcraft:genitem>).setChance(0.1)
    .addItemInput(<botania:rune:8>).setChance(0.1)
    .addItemInput(<gateway:resonating_gem>).setChance(0.1)
    .addItemInput(<thermaldynamics:duct_0:5>).setChance(0.1)
    .addEnergyPerTickInput(25000)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.network_supercharger.desc.ticks", [5]).formattedText)
    .addPostTickHandler(function(event as RecipeTickEvent) { supercharge(event, 5); })
    .build();


static controllerPositions as int[string][] = [
    {x: 0, y: 4, z: 1},
    {x: 0, y: 4, z: 2},
    {x: 0, y: 4, z: 3},
    {x: -1, y: 4, z: 1},
    {x: -1, y: 4, z: 3},
    {x: -2, y: 4, z: 1},
    {x: -2, y: 4, z: 3},
    {x: 1, y: 4, z: 1},
    {x: 1, y: 4, z: 3},
    {x: 2, y: 4, z: 1},
    {x: 2, y: 4, z: 3},
];

function supercharge(event as RecipeTickEvent, ticks as int) as void {
    var activeRecipe = event.activeRecipe;
    if !isNull(activeRecipe) && (activeRecipe.tick + 1) % ticks == 0 {
        var ctrlPos = event.controller.pos;
        var positions = [] as IBlockPos[];
        for delta in controllerPositions {
            val rotatedPos = event.controller.rotateWithControllerFacing(Position3f.create(delta.x, delta.y, delta.z));
            positions += Position3f.create(rotatedPos.x + ctrlPos.x, rotatedPos.y + ctrlPos.y, rotatedPos.z + ctrlPos.z);
        }
        event.controller.world.native.getMinecraftServer().addScheduledTask(function() as void {
            for pos in positions {
                var te = event.controller.world.native.getTileEntity(pos);
                if te != null && te instanceof TileController {
                    var ctrlTE = te as TileController;
                    ctrlTE.injectExternalPower(PowerUnits.AE, 8000, Actionable.MODULATE);
                }
            }
        });
    }
}
