import net.minecraftforge.event.entity.player.ItemTooltipEvent

import classes.GatewayHelpers

event_manager.listen { ItemTooltipEvent event ->
    for (def entry in GatewayHelpers.tiers)
        if (event.getItemStack() in entry.key) {
            if (entry.value == -1)
                event.getToolTip() << "${textformat('YELLOW').toString()}Future content${textformat('RESET')}".toString()
            else
                event.getToolTip() << "${textformat('RED')}Tier: ${entry.value}${textformat('RESET')}".toString()
            
            break
        }
    for (def entry in GatewayHelpers.tooltips)
        if (event.getItemStack() in entry.key)
            event.getToolTip() << entry.value
}
