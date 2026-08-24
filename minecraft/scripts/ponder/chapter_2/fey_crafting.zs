#reloadable

import mods.legacyponder.ManualRegistry;
import mods.legacyponder.IEntry;
import mods.legacyponder.Page;
import mods.legacyponder.HoverComponent;
import mods.legacyponder.DrawableBuilder;
import mods.legacyponder.DrawableBase;


val hover1 = HoverComponent.build(1.5, 2.5, 4.5, function(width as int, height as int) as DrawableBase {
    val drawable = DrawableBuilder.group();
    val bucketText = DrawableBuilder.formattedText("ponder.chapter2.fey_crafting.tooltip1", 0xFFFFFFFF).setMaxWidth(150);
    drawable.addChild(bucketText);
    drawable.addChild(DrawableBuilder.item(<item:roots:pestle>), 0, 32);
    return drawable;
});
hover1.setDefaultOffset(-200, -80);

val page1 = Page.fromStructure("chapter2/runic");
page1.addHoverComponent(hover1);
page1.addHighlightArea(1, 2, 4, 2, 3, 5, 0xFFCC00);
page1.setOverlay(function(width as int, height as int) as DrawableBase {
    val group = DrawableBuilder.group();
    group.addChild(DrawableBuilder.formattedText("ponder.chapter2.fey_crafting.desc", 0xFFFFFFFF), 2, 2);
    return group;
});

val entry = IEntry.createEntry("ponder.chapter2.fey_crafting.name", "ponder.chapter2.fey_crafting.tooltip");
entry.addPage(page1);

entry.addItem(<item:roots:fey_crafter>);
entry.addItem(<item:roots:elemental_soil>);
entry.addItem(<item:roots:runestone>);
entry.addItem(<item:roots:runed_obsidian>);
entry.addItem(<item:thaumcraft:salis_mundus>);
entry.addItem(<item:essentialcraft:genitem:45>);

ManualRegistry.add("chapter2/fey_crafting", entry);
