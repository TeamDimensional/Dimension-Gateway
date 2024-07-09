package classes

import net.minecraft.util.text.TextFormatting
import net.darkhax.gamestages.GameStageHelper
import net.minecraft.entity.player.EntityPlayer
import com.dimensional.gatewaycore.events.TooltipEvents

class GatewayHelpers {
    static def colors = ["white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                         "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"]

    static void banTool(ItemStack itemStack) {
        itemStack.getItem().setMaxDamage(1)
        TooltipEvents.setTooltip(itemStack, "This item is disabled! Use Tinker's Construct tools instead.", textformat("RED"))
    }

    static void run() {}

    static void hide(ItemStack itemStack) {
        TooltipEvents.setTier(itemStack, 0)
        mods.jei.ingredient.hide(itemStack)
    }
}
