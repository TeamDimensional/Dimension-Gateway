import re
from pathlib import Path

ores = {
    # Simple Metals
    "Aluminum": ["metallum", "lava"],
    "Cerulean": ["metallum", "lava"],
    "Copper": ["metallum", "lava"],
    "Gold": ["metallum", "lava"],
    "Iron": ["metallum", "lava"],
    "Lead": ["metallum", "lava"],
    "Moonstone": ["metallum", "lava"],
    "Nickel": ["metallum", "lava"],
    "Silver": ["metallum", "lava"],
    "Tin": ["metallum", "lava"],
    # Complicated Metals
    "Ardite": ["metallum", "blaze_superfuel"],
    "AstralStarmetal": ["metallum", "blaze_superfuel"],
    "Boron": ["metallum", "blaze_superfuel"],
    "Cobalt": ["metallum", "blaze_superfuel"],
    "Lithium": ["metallum", "blaze_superfuel"],
    "Magnesium": ["metallum", "blaze_superfuel"],
    "Titanium": ["metallum", "blaze_superfuel"],
    # Gems
    "Amber": ["vitreus", "crystaloil"],
    "Ambrosium": ["vitreus", "crystaloil"],
    "Aquamarine": ["vitreus", "crystaloil"],
    "AurorianGeode": ["vitreus", "crystaloil"],
    "Diamond": ["vitreus", "crystaloil"],
    "Emerald": ["vitreus", "crystaloil"],
    "Lapis": ["vitreus", "crystaloil"],
    "Quartz": ["vitreus", "crystaloil"],
    "Zanite": ["vitreus", "crystaloil"],
    # Fuels
    "AurorianCoal": ["potentia", "crystaloil"],
    "Coal": ["potentia", "crystaloil"],
    "Redstone": ["potentia", "crystaloil"],
    "Resonating": ["potentia", "crystaloil"],
    # Elemental
    "AirElemental": ["ordo", "quartz"],
    "EarthElemental": ["ordo", "quartz"],
    "FireElemental": ["ordo", "quartz"],
    "WaterElemental": ["ordo", "quartz"],
    # Special
    "Aether": ["auram", "purifying_fluid"],
    "Dilithium": ["mortuus", "liquid_death"],
    "DimensionalShard": ["auram", "purifying_fluid"],
    "Iridium": ["auram", "enrichedlava"],
    "LiquifiedCoralium": ["mortuus", "liquid_death"],
    "Mithriline": ["auram", "purifying_fluid"],
    "Thorium": ["exanimis", "liquid_death"],
    "Uranium": ["exanimis", "liquid_death"],
}


output: list[str] = ["#reloadable", "import mods.modularmachinery.RecipeBuilder;"]

template = """RecipeBuilder.newBuilder("%(NAME)s_%(EXTRA)s", "dawnstone_refinery", 20)
    .addItemInput(<ore:ore%(NAME)s>)
    .addItemOutput(<item:jaopca:ore_cluster.%(CLUSTER)s>)
    .addItemOutput(<item:jaopca:ore_cluster.%(CLUSTER)s>).setChance(%(CHANCE)s)
    .addItemInput(<%(PICKAXE)s:*>).consumeDurability(1)
    .%(ASPECT_INPUT)s("%(ASPECT)s", 2)
    .setLoadJEI(%(LOAD_JEI)s)
    .addFluidInput(<fluid:%(FLUID)s> * 10)
    .build();"""

snake_case_regex = re.compile("([a-z])([A-Z])")


def generate_all():
    for ore, (aspect, fluid) in ores.items():
        for i, (aspectInput, loadJEI) in enumerate(
            [("addAspectInput", False), ("addEssentiaInput", True)]
        ):
            for j, (pick, efficiency) in enumerate(
                [
                    ("thaumcraft:elemental_pick", 0.4),
                    ("theaurorian:crystallinepickaxe", 0.2),
                ]
            ):
                data = {
                    "NAME": ore,
                    "EXTRA": i + j * 10,
                    "CLUSTER": snake_case_regex.sub(r"\1_\2", ore).lower(),
                    "CHANCE": efficiency,
                    "PICKAXE": pick,
                    "ASPECT_INPUT": aspectInput,
                    "ASPECT": aspect,
                    "FLUID": fluid,
                    "LOAD_JEI": str(loadJEI).lower(),
                }
                output.append(template % data)

    target = "minecraft/scripts/modularmachinery/dawnstone_refinery.zs"
    Path(target).write_text("\n\n".join(output))
