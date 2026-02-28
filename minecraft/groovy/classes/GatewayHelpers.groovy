package classes

import net.minecraft.util.text.TextFormatting
import net.darkhax.gamestages.GameStageHelper
import net.minecraft.entity.player.EntityPlayer
import com.dimensional.gatewaycore.events.TooltipEvents
import com.dimensional.gatewaycore.events.ToolUtils
import net.minecraft.item.ItemTool

class GatewayHelpers {
    static def colors = ["white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                         "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"]
    
    static def qmdChemiFluids = [
        "hydrochloric_acid", "nitric_acid", "sodium_chloride_solution", "sodium_nitrate_solution", "lead_nitrate_solution",
        "liquid_hydrogen", "argon", "liquid_argon", "neon", "liquid_neon", "liquid_oxygen", "chlorine", "nitric_oxide",
        "nitrogen_dioxide", "compressed_air", "titanium", "carbon", "sodium_chloride", "liquid_air",
    ]

    static void banTool(ItemStack itemStack) {
        itemStack.getItem().setMaxDamage(1)
        itemStack.getItem().setHarvestLevel("pickaxe", -1)
        if (itemStack.getItem() instanceof ItemTool)
            ToolUtils.deleteToolType(itemStack)
        TooltipEvents.setTooltip(itemStack, "This item is disabled! Use Tinker's Construct tools or other materials instead.", textformat("RED"))
    }

    static void run() {}

    static void hide(ItemStack itemStack) {
        TooltipEvents.setTier(itemStack, 0)
        mods.jei.ingredient.hide(itemStack)
    }
}
