import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def redstoneItems = []
for (int i in 0..2) redstoneItems.add(item("storagedrawers:upgrade_redstone", i))
def controllerItems = [item("storagedrawers:controller"), item("storagedrawers:controllerslave")]
for (int i in 0..3) controllerItems.add(item("storagedrawers:keybutton", i))
def basicUpgrades = [item("storagedrawers:upgrade_void")]
for (int i in 0..2) basicUpgrades.add(item("storagedrawers:upgrade_storage", i))
def advancedUpgrades = [item("storagedrawers:upgrade_storage", 3), item("storagedrawers:upgrade_storage", 4)]
def creativeUpgrades = [item("storagedrawers:upgrade_creative"), item("storagedrawers:upgrade_creative", 1)]

for (def it in redstoneItems) TooltipEvents.setTier(it, 3)
for (def it in controllerItems) TooltipEvents.setTier(it, 4)
for (def it in basicUpgrades) TooltipEvents.setTier(it, 4)
for (def it in advancedUpgrades) TooltipEvents.setTier(it, 5)
for (def it in creativeUpgrades) TooltipEvents.setTier(it, 17)
TooltipEvents.setTier(item("storagedrawers:compdrawers"), 2)

/*
recipes needed:
- void upgrade (tier 5 -> tier 4)
- keys (tier 3 -> tier 1)
- concealment key (tier 6 -> tier 1)
- upgrades (tier 1-5 -> tier 4)
- advanced upgrades (tier 4 -> tier 5)
- creative upgrades (tier 17)
*/
