#reloadable

import mods.legacyponder.ManualRegistry;
import mods.legacyponder.IEntry;
import mods.legacyponder.Page;
import mods.legacyponder.HoverComponent;
import mods.legacyponder.DrawableBuilder;
import mods.legacyponder.DrawableBase;


val hover1 = HoverComponent.build(5.5, 1.1, 5.5, function(width as int, height as int) as DrawableBase {
    val drawable = DrawableBuilder.group();
    val bucketText = DrawableBuilder.formattedText("ponder.chapter7.soul_shard.tooltip1", 0xFFFFFFFF).setMaxWidth(250);
    drawable.addChild(bucketText);
    drawable.addChild(DrawableBuilder.item(<item:gateway:unholy_symbol>), 0, 40);
    return drawable;
});
hover1.setDefaultOffset(-300, -80);

val page1 = Page.fromStructure("chapter7/soul_shard");
page1.addHoverComponent(hover1);
page1.addHighlightArea(5, 0, 5, 6, 1, 6, 0xFFCC00);
page1.setOverlay(function(width as int, height as int) as DrawableBase {
    val group = DrawableBuilder.group();
    group.addChild(DrawableBuilder.formattedText("ponder.chapter7.soul_shard.desc", 0xFFFFFFFF), 2, 2);
    return group;
});

val entry = IEntry.createEntry("ponder.chapter7.soul_shard.name", "ponder.chapter7.soul_shard.tooltip");
entry.addPage(page1);

entry.addItem(<item:gateway:unholy_symbol>);
entry.addItem(<item:ee:ash_brick>);
entry.addItem(<item:thaumictinkerer:arcane_quartz_block>);
entry.addItem(<item:minecraft:glowstone>);
entry.addItem(<item:soulshardsrespawn:soul_shard>);

ManualRegistry.add("chapter7/soul_shard", entry);
