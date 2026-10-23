#reloadable
#priority 1000

import crafttweaker.util.Position3f;
import crafttweaker.command.ICommandSender;
import mods.modularmachinery.IMachineController;
import crafttweaker.item.IItemStack;
import native.hellfirepvp.modularmachinery.common.tiles.base.TileMultiblockMachineController;
import native.hellfirepvp.modularmachinery.common.crafting.command.ControllerCommandSender;

function getControllerSender(controller as IMachineController) as ICommandSender {
    var sender = ControllerCommandSender(controller as TileMultiblockMachineController) as native.net.minecraft.command.ICommandSender;
    return sender.wrapper;
}

function exec(sender as ICommandSender, command as string) {
    logger.logInfo("command: " + command);
    server.commandManager.executeCommand(sender, command);
}

function setBlock(sender as ICommandSender, position as Position3f, block as IItemStack) {
    val blockId = block.definition.id;
    val blockMeta = block.damage;
    setBlockById(sender, position, blockId, blockMeta);
}

function setBlockById(sender as ICommandSender, position as Position3f, blockId as string, blockMeta as int) {
    exec(sender, 'fill ' + position.x + ' ' + position.y + ' ' + position.z + ' ' + position.x + ' ' + position.y + ' ' + position.z + ' ' + blockId + ' ' + blockMeta);
}

function addPos(lhs as Position3f, rhs as Position3f) as Position3f {
    return Position3f.create(lhs.x + rhs.x, lhs.y + rhs.y, lhs.z + rhs.z);
}

function getAbsolutePos(controller as IMachineController, delta as Position3f) as Position3f {
    val ctrlPos = controller.pos;
    val rotatedPos = controller.rotateWithControllerFacing(Position3f.create(delta.x, delta.y, delta.z));
    return addPos(ctrlPos, rotatedPos);
}
