import net.minecraftforge.event.entity.player.ItemTooltipEvent

import classes.GatewayHelpers

event_manager.listen { ItemTooltipEvent event ->
    def stack = event.getItemStack()
    def tier = GatewayHelpers.getTier(stack)
    if (tier == -1) {
        event.getToolTip() << "${textformat('YELLOW').toString()}Future content${textformat('RESET')}".toString()
    } else if (tier != 0) {
        def color = GatewayHelpers.hasTier(event.getEntityPlayer(), tier) ? 'GREEN' : 'RED'
        event.getToolTip() << "${textformat(color)}Tier: ${tier}${textformat('RESET')}".toString()
    }

    def tooltip = GatewayHelpers.getTooltip(stack)
    if (tooltip != null) {
        event.getToolTip() << tooltip
    }

    def unlock = GatewayHelpers.getUnlock(stack)
    if (unlock != 0) {
        event.getToolTip() << "${textformat('AQUA')}Unlocks tier ${unlock}${textformat('RESET')}".toString()
    }
}
