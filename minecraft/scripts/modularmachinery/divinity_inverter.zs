#reloadable

import crafttweaker.text.ITextComponent;
import crafttweaker.world.IBlockPos;
import crafttweaker.util.Position3f;
import crafttweaker.item.IItemStack;
import mods.modularmachinery.RecipeBuilder;
import mods.modularmachinery.RecipeTickEvent;

import native.net.minecraft.entity.EntityLiving;
import native.net.minecraft.util.math.AxisAlignedBB;
import native.net.minecraft.util.DamageSource;
import native.net.minecraftforge.fml.common.registry.EntityEntry;
import native.net.minecraftforge.fml.common.registry.EntityRegistry;
import native.com.dimensional.gatewaycore.mmce.MMCEUtils;

import scripts.modularmachinery.utils.getControllerSender;
import scripts.modularmachinery.utils.getAbsolutePos;
import scripts.modularmachinery.utils.addPos;

MMCEUtils.registerNoHatchMultiblock("divinity_inverter");

RecipeBuilder.newBuilder("ackronite", "divinity_inverter", 600)
    .addItemInput(<item:essentialcraft:genitem:53>)
    .addItemOutput(<item:essentialcraft:genitem:52>).setChance(0).setIgnoreOutputCheck(true)
    .addFluidInput(<fluid:xu_demonic_metal> * 2304)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.divinity_inverter.desc", [15]).formattedText)
    .addRecipeTooltip(
        ITextComponent.fromTranslation("tile.modularmachinery.divinity_inverter.desc.angel_input",
        [ITextComponent.fromTranslation("entity.valkyrie.name").formattedText]).formattedText)
    .addPostTickHandler(function(event as RecipeTickEvent) {
        invert(event, 40, true, "aether_legacy:valkyrie", -1, "abyssalcraft:omotholghoul", 666,
               "Herald of Demons", <item:essentialcraft:genitem:52>);
    })
    .build();

RecipeBuilder.newBuilder("unholy_symbol", "divinity_inverter", 600)
    .addItemInput(<item:gateway:catalyzed_starlight> * 5)
    .addItemOutput(<item:gateway:unholy_symbol>).setChance(0).setIgnoreOutputCheck(true)
    .addFluidInput(<fluid:xu_evil_metal> * 576)
    .addRecipeTooltip(ITextComponent.fromTranslation("tile.modularmachinery.divinity_inverter.desc", [5]).formattedText)
    .addRecipeTooltip(
        ITextComponent.fromTranslation("tile.modularmachinery.divinity_inverter.desc.angel_input",
        [ITextComponent.fromTranslation("entity.any_villager.name").formattedText]).formattedText)
    .addPostTickHandler(function(event as RecipeTickEvent) {
        invert(event, 120, true, "minecraft:villager", -1, "minecraft:witch", 50,
               "The Supernatural", <item:gateway:unholy_symbol>);
    })
    .build();



static demonPos as Position3f = Position3f.create(-8, 2, 2);
static angelPos as Position3f = Position3f.create(8, 5, 2);

function invert(event as RecipeTickEvent, ticks as int, inputAngel as bool, inputMob as string, damageAmount as int, outputMob as string, maxHP as int, outputMobName as string, outputItem as IItemStack) as void {
    var activeRecipe = event.activeRecipe;
    if !isNull(activeRecipe) && (activeRecipe.tick + 1) % ticks == 0 && !event.controller.world.remote {
        var ctrlPos = event.controller.pos;
        var deltaInput = inputAngel ? angelPos : demonPos;
        var deltaOutput = inputAngel ? demonPos : angelPos;
        val inputPos = getAbsolutePos(event.controller, deltaInput);
        val inputPos1 = addPos(inputPos, Position3f.create(-2.5f, -0.5f, -2.5f));
        val inputPos2 = addPos(inputPos, Position3f.create(2.5f, 4.5f, 2.5f));
        val outputPos = addPos(getAbsolutePos(event.controller, deltaOutput), Position3f.create(0.0f, 1.0f, 0.0f));
        event.controller.world.native.getMinecraftServer().addScheduledTask(function() as void {
            val aabb = AxisAlignedBB(inputPos1.x, inputPos1.y, inputPos1.z, inputPos2.x, inputPos2.y, inputPos2.z);
            val entities = event.controller.world.native.getEntitiesWithinAABB(EntityLiving.class, aabb);

            for entity in entities {
                val entityEntry = EntityRegistry.getEntry(entity.getClass());
                if entityEntry.registryName.toString() == inputMob {
                    val entityObj = entity as EntityLiving;
                    if (damageAmount > 0) {
                        entityObj.attackEntityFrom(<damageSource:GENERIC>, damageAmount);
                    } else {
                        entityObj.spawnExplosionParticle();
                        entityObj.setDead();
                    }
                    // Forgive me please
                    val outputItemId = outputItem.definition.id;
                    val outputItemMeta = outputItem.damage;
                    server.commandManager.executeCommand(getControllerSender(event.controller), 'summon ' + outputMob + ' ' + outputPos.x + ' ' + outputPos.y + ' ' + outputPos.z + ' {HandItems:[{Count:1,id:"' + outputItemId + '",Damage:' + outputItemMeta + 's},{}],HandDropChances:[1.0f,0.0f],CustomName:"' + outputMobName + '",Attributes:[{Name:generic.maxHealth, Base:' + maxHP + 'f}],Health:' + maxHP + 'f}');
                    break;
                }
            }
        });
    }
}
