package classes

import net.minecraft.util.text.TextFormatting
import net.darkhax.gamestages.GameStageHelper
import net.minecraft.entity.player.EntityPlayer

class GatewayHelpers {
    static def colors = ["white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                         "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"]

    static def tooltips = [:]
    static def tiers = [:]
    static def unlocks = [:]
    static def tierPredicates = []

    static void addTooltip(ItemStack itemStack, String line, TextFormatting color) {
        tooltips[stringify(itemStack)] = "${color}${line}".toString()
    }

    static String stringify(ItemStack itemStack) {
        if (itemStack == null) return "null"
        return "${itemStack.getItem().getRegistryName()}@${itemStack.getMetadata()}"
    }

    static void addTooltip(ItemStack itemStack, String line) {
        addTooltip(itemStack, line, textformat("YELLOW"))
    }

    static String getTooltip(ItemStack itemStack) {
        return tooltips[stringify(itemStack)]
    }

    static void setTier(ItemStack itemStack, int tier) {
        tiers[stringify(itemStack)] = tier
    }

    static void setPredicateTier(predicate, int tier) {
        tierPredicates.add([predicate, tier])
    }

    static void setUnlocksTier(ItemStack itemStack, int tier) {
        setTier(itemStack, tier - 1)
        unlocks[stringify(itemStack)] = tier
    }

    static void setUnobtainable(ItemStack itemStack) {
        setTier(itemStack, 0)
    }

    static int getTier(ItemStack itemStack) {
        def maybeTier = tiers[stringify(itemStack)]
        if (maybeTier != null) {
            return maybeTier
        }
        for (def entry in tierPredicates) {
            if (entry[0](itemStack)) return entry[1]
        }
        return 1
    }

    static int getUnlock(ItemStack itemStack) {
        def maybeTier = unlocks[stringify(itemStack)]
        return maybeTier == null ? 0 : maybeTier
    }

    static boolean hasTier(EntityPlayer player, int tier) {
        if (tier == 1) return true
        return GameStageHelper.hasStage(player, "tier${tier}".toString())
    }

    static void banTool(ItemStack itemStack) {
        itemStack.getItem().setMaxDamage(1)
        addTooltip(itemStack, "This item is disabled! Use Tinker's Construct tools instead.", textformat("RED"))
    }

    static void run() {}
}
