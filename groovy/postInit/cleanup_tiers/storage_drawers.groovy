import classes.GatewayHelpers
import com.dimensional.gatewaycore.events.TooltipEvents

def mitem(name, k=0) {
    return item("storagedrawers:${name}", k)
}

def redstoneItems = []
for (int i in 0..2) redstoneItems.add(mitem("upgrade_redstone", i))
def controllerItems = [mitem("controller"), mitem("controllerslave")]
for (int i in 0..3) controllerItems.add(mitem("keybutton", i))
def basicUpgrades = [mitem("upgrade_void")]
for (int i in 0..2) basicUpgrades.add(mitem("upgrade_storage", i))
def advancedUpgrades = [mitem("upgrade_storage", 3), mitem("upgrade_storage", 4)]
def creativeUpgrades = [mitem("upgrade_creative", 1)]

for (def it in redstoneItems) TooltipEvents.setTier(it, 3)
for (def it in controllerItems) TooltipEvents.setTier(it, 4)
for (def it in basicUpgrades) TooltipEvents.setTier(it, 4)
for (def it in advancedUpgrades) TooltipEvents.setTier(it, 5)
for (def it in creativeUpgrades) TooltipEvents.setTier(it, 15)
TooltipEvents.setTier(mitem("compdrawers"), 2)
TooltipEvents.setUnlock(mitem("upgrade_creative"), 15)
