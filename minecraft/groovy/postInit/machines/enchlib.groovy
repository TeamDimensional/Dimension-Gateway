import com.dimensional.gatewaycore.events.TooltipEvents

TooltipEvents.setTier(item("enchlib:enchantment_library"), 6)
crafting.remove("enchlib:enchantment_library")
crafting.shapedBuilder()
    .matrix("DPD", "PBP", "OPO")
    .key("D", item("minecraft:diamond"))
    .key("B", item("minecraft:enchanted_book"))
    .key("P", item("calculator:pearplanks"))
    .key("O", item("minecraft:obsidian"))
    .output(item("enchlib:enchantment_library"))
    .register()
