#reloadable

import mods.legacyponder.ManualRegistry;
import mods.legacyponder.IEntry;
import mods.legacyponder.Page;
import mods.legacyponder.HoverComponent;
import mods.legacyponder.DrawableBuilder;
import mods.legacyponder.DrawableBase;


val hover1 = HoverComponent.build(6.5, 5.1, 2.1, function(width as int, height as int) as DrawableBase {
    val drawable = DrawableBuilder.group();
    val bucketText = DrawableBuilder.formattedText("ponder.chapter1.nether.tooltip1", 0xFFFFFFFF).setMaxWidth(150);
    drawable.addChild(bucketText);
    drawable.addChild(DrawableBuilder.item(<item:minecraft:lava_bucket>), 0, 32);
    return drawable;
});
hover1.setDefaultOffset(-200, 20);

val hover2 = HoverComponent.build(8.5, 4, 6.5, function(width as int, height as int) as DrawableBase {
    val drawable = DrawableBuilder.group();
    val bucketText = DrawableBuilder.formattedText("ponder.chapter1.nether.tooltip2", 0xFFFFFFFF).setMaxWidth(150);
    drawable.addChild(bucketText);
    drawable.addChild(DrawableBuilder.item(<item:minecraft:flint_and_steel>), 0, 32);
    return drawable;
});
hover2.setDefaultOffset(100, 20);

val page1 = Page.fromStructure("chapter1/nether");
page1.addHoverComponent(hover1);
page1.addHoverComponent(hover2);
page1.addHighlightArea(7, 3, 2, 3, 8, 3, 0xFFCC00);
page1.setOverlay(function(width as int, height as int) as DrawableBase {
    val group = DrawableBuilder.group();
    group.addChild(DrawableBuilder.formattedText("ponder.chapter1.nether.desc", 0xFFFFFFFF), 2, 2);
    return group;
});

val entry = IEntry.createEntry("ponder.chapter1.nether.name", "ponder.chapter1.nether.tooltip");
entry.addPage(page1);

entry.addItem(<item:minecraft:flint_and_steel>);
entry.addItem(<item:minecraft:netherrack>);
entry.addItem(<item:minecraft:gunpowder>);
entry.addFluid(<fluid:lava>);
entry.addItems([<item:essentialcraft:oredrops:6>, <item:essentialcraft:oredrops:7>, <item:essentialcraft:oredrops:8>, <item:essentialcraft:oredrops:9>]);

ManualRegistry.add("chapter1/nether", entry);
