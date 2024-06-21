package classes

import net.minecraft.util.text.TextFormatting

class GatewayHelpers {
    static def colors = ["white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                         "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"]

    static def tooltips = [:]
    static def tiers = [:]

    static void addTooltip(ItemStack itemStack, String line, TextFormatting color) {
        tooltips[itemStack] = "${color}${line}".toString()
    }

    static void addTooltip(ItemStack itemStack, String line) {
        addTooltip(itemStack, line, textformat("YELLOW"))
    }

    static void setTier(ItemStack itemStack, int tier) {
        tiers[itemStack] = tier
    }

    static void banTool(ItemStack itemStack) {
        itemStack.getItem().setMaxDamage(10)
        addTooltip(itemStack, "This item is nerfed! Use Tinker's Construct tools instead.", textformat("RED"))
    }

    static void run() {}
}
