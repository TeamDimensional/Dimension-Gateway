#reloadable

import mods.legacyponder.ManualRegistry;
import mods.legacyponder.IEntry;
import mods.legacyponder.Page;
import mods.legacyponder.HoverComponent;
import mods.legacyponder.DrawableBuilder;
import mods.legacyponder.DrawableBase;


val hover1 = HoverComponent.build(1.5, 1.5, 1.5, function(width as int, height as int) as DrawableBase {
    val drawable = DrawableBuilder.group();
    val bucketText = DrawableBuilder.formattedText("ponder.chapter1.mortar.tooltip1", 0xFFFFFFFF).setMaxWidth(150);
    drawable.addChild(bucketText);
    drawable.addChild(DrawableBuilder.item(<item:roots:pestle>), 0, 32);
    return drawable;
});
hover1.setDefaultOffset(-200, -80);

val page1 = Page.fromStructure("chapter1/mortar");
page1.addHoverComponent(hover1);
page1.addHighlightArea(1, 1, 1, 2, 2, 2, 0xFFCC00);
page1.setOverlay(function(width as int, height as int) as DrawableBase {
    val group = DrawableBuilder.group();
    group.addChild(DrawableBuilder.formattedText("ponder.chapter1.mortar.desc", 0xFFFFFFFF), 2, 2);
    return group;
});

val entry = IEntry.createEntry("ponder.chapter1.mortar.name", "ponder.chapter1.mortar.tooltip");
entry.addPage(page1);

entry.addItem(<item:roots:mortar>);
entry.addItem(<item:roots:runic_dust>);
entry.addItem(<item:gateway:magical_crystal_mixture>);

ManualRegistry.add("chapter1/mortar", entry);
