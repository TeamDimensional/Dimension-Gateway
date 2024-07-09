import com.dimensional.gatewaycore.events.TooltipEvents

def tier2Materials = ["silentwood", "aurorianstone", "crystal", "ancientwood"]

def setMaterialTier(name, tier) {
    def predicate = stack -> {
        return stack.getItem().getCreatorModId(stack) == "tconstruct" &&
                stack.getTagCompound() != null &&
                stack.getTagCompound().getString("Material") == "gateway_" + name
    }
    TooltipEvents.addTierPredicate("tinker:" + name, predicate, tier)
}

for (def mat in tier2Materials) setMaterialTier(mat, 2)
