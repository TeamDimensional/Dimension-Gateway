#reloadable

import crafttweaker.text.ITextComponent;
import crafttweaker.world.IBlockPos;
import crafttweaker.util.Position3f;
import crafttweaker.item.IItemStack;
import crafttweaker.command.ICommandSender;
import mods.modularmachinery.RecipeBuilder;
import mods.modularmachinery.IMachineController;
import mods.modularmachinery.RecipeTickEvent;

import native.com.gildedgames.the_aether.entities.bosses.EntityValkyrie;
import native.net.minecraft.util.math.AxisAlignedBB;
import native.net.minecraft.util.DamageSource;
import native.net.minecraftforge.fml.common.registry.EntityEntry;
import native.net.minecraftforge.fml.common.registry.EntityRegistry;
import native.hellfirepvp.modularmachinery.common.crafting.command.ControllerCommandSender;
import native.hellfirepvp.modularmachinery.common.tiles.base.TileMultiblockMachineController;
import native.com.dimensional.gatewaycore.mmce.MMCEUtils;

MMCEUtils.registerNoHatchMultiblock("divinity_inverter");

RecipeBuilder.newBuilder("ackronite", "divinity_inverter", 600)
    .addItemInput(<item:essentialcraft:genitem:53>)
    .addItemOutput(<item:essentialcraft:genitem:52>).setChance(0).setIgnoreOutputCheck(true)
    .addFluidInput(<fluid:xu_evil_metal> * 576)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.divinity_inverter.desc", [15]).formattedText)
    .addRecipeTooltip(
        ITextComponent.fromTranslation("tile.modularmachinery.divinity_inverter.desc.angel_input",
        [ITextComponent.fromTranslation("entity.valkyrie.name").formattedText]).formattedText)
    .addPostTickHandler(function(event as RecipeTickEvent) {
        invert(event, 40, true, "aether_legacy:valkyrie", -1, "abyssalcraft:omotholghoul", 666,
               "Herald of Demons", <item:essentialcraft:genitem:52>);
    })
    .build();

static demonPos as int[string] = {x: -8, y: 2, z: 2};
static angelPos as int[string] = {x: 8, y: 5, z: 2};

function getControllerSender(controller as IMachineController) as ICommandSender {
  var sender = ControllerCommandSender(controller as TileMultiblockMachineController) as native.net.minecraft.command.ICommandSender;
  return sender.wrapper;
}

function invert(event as RecipeTickEvent, ticks as int, inputAngel as bool, inputMob as string, damageAmount as int, outputMob as string, maxHP as int, outputMobName as string, outputItem as IItemStack) as void {
    var activeRecipe = event.activeRecipe;
    if !isNull(activeRecipe) && (activeRecipe.tick + 1) % ticks == 0 && !event.controller.world.remote {
        var ctrlPos = event.controller.pos;
        var deltaInput = inputAngel ? angelPos : demonPos;
        var deltaOutput = inputAngel ? demonPos : angelPos;
        val inputPos = event.controller.rotateWithControllerFacing(Position3f.create(deltaInput.x, deltaInput.y, deltaInput.z));
        val outputPos = event.controller.rotateWithControllerFacing(Position3f.create(deltaOutput.x, deltaOutput.y + 1, deltaOutput.z));
        event.controller.world.native.getMinecraftServer().addScheduledTask(function() as void {
            val aabb = AxisAlignedBB(
                inputPos.x + ctrlPos.x - 2.5f, inputPos.y + ctrlPos.y - 0.5f, inputPos.z + ctrlPos.z - 2.5f,
                inputPos.x + ctrlPos.x + 2.5f, outputPos.y + ctrlPos.y + 4.5f, outputPos.z + ctrlPos.z + 2.5f);
            val entities = event.controller.world.native.getEntitiesWithinAABB(EntityValkyrie.class, aabb);

            for entity in entities {
                val entityEntry = EntityRegistry.getEntry(entity.getClass());
                if entityEntry.registryName.toString() == inputMob {
                    val entityObj = entity as EntityValkyrie;
                    if (damageAmount > 0) {
                        entityObj.attackEntityFrom(<damageSource:GENERIC>, damageAmount);
                    } else {
                        entityObj.spawnExplosionParticle();
                        entityObj.setDead();
                    }
                    // Forgive me please
                    val outputItemId = outputItem.definition.id;
                    val outputItemMeta = outputItem.damage;
                    server.commandManager.executeCommand(getControllerSender(event.controller), 'summon ' + outputMob + ' ' + (outputPos.x + ctrlPos.x) + ' ' + (outputPos.y + ctrlPos.y) + ' ' + (outputPos.z + ctrlPos.z) + ' {HandItems:[{Count:1,id:"' + outputItemId + '",Damage:' + outputItemMeta + 's},{}],HandDropChances:[1.0f,0.0f],CustomName:"' + outputMobName + '",Attributes:[{Name:generic.maxHealth, Base:' + maxHP + 'f}],Health:' + maxHP + 'f}');
                    break;
                }
            }
        });
    }
}
