#reloadable

import mods.legacyponder.ManualRegistry;
import mods.legacyponder.IEntry;
import mods.legacyponder.Page;
import mods.legacyponder.HoverComponent;
import mods.legacyponder.DrawableBuilder;
import mods.legacyponder.DrawableBase;


val hover1 = HoverComponent.build(2.5, 2.5, 1.5, function(width as int, height as int) as DrawableBase {
    val drawable = DrawableBuilder.group();
    val bucketText = DrawableBuilder.formattedText("ponder.chapter1.pyre.tooltip1", 0xFFFFFFFF).setMaxWidth(150);
    drawable.addChild(bucketText);
    drawable.addChild(DrawableBuilder.item(<item:minecraft:gunpowder>), 0, 32);
    drawable.addChild(DrawableBuilder.item(<item:essentialcraft:compressed>), 16, 32);
    drawable.addChild(DrawableBuilder.item(<item:essentialcraft:compressed:1>), 32, 32);
    drawable.addChild(DrawableBuilder.item(<item:essentialcraft:compressed:2>), 48, 32);
    drawable.addChild(DrawableBuilder.item(<item:essentialcraft:compressed:3>), 64, 32);
    return drawable;
});
hover1.setDefaultOffset(60, -80);

val page1 = Page.fromStructure("chapter1/pyre");
page1.addHoverComponent(hover1);
page1.addHighlightArea(1.7, 2, 0.7, 3.3, 2.6, 2.3, 0xFFCC00);
page1.setOverlay(function(width as int, height as int) as DrawableBase {
    val group = DrawableBuilder.group();
    group.addChild(DrawableBuilder.formattedText("ponder.chapter1.pyre.desc", 0xFFFFFFFF), 2, 2);
    return group;
});

val entry = IEntry.createEntry("ponder.chapter1.pyre.name", "ponder.chapter1.pyre.tooltip");
entry.addPage(page1);

entry.addItem(<item:roots:pyre>);
entry.addItem(<item:essentialcraft:compressed:4>);
entry.addItem(<item:roots:ritual_spreading_forest>);
entry.addItem(<item:roots:ritual_germination>);
entry.addItem(<item:tconstruct:materials>);

ManualRegistry.add("chapter1/pyre", entry);
