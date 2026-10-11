import abc
import json
from dataclasses import dataclass
from enum import Enum, IntEnum, auto
from pathlib import Path
from typing import override


class HatchLevel(IntEnum):
    Tiny = auto()
    Small = auto()
    Normal = auto()
    Reinforced = auto()
    Big = auto()
    Huge = auto()
    Ludicrous = auto()
    Ultimate = auto()
    AE2 = auto()


class HatchType(Enum):
    ItemInput = auto()
    ItemOutput = auto()
    FluidInput = auto()
    EnergyInput = auto()
    VisInput = auto()
    FluxInput = auto()
    PotentialInput = auto()
    EssentiaInput = auto()
    EssentiaOutput = auto()
    Biome = auto()
    AuraInput = auto()
    ItemFluidInput = auto()
    ManaInput = auto()
    RedstoneScan = auto()
    StarlightInput = auto()


@dataclass
class Tier:
    casing: str
    valid_levels: list[HatchLevel]


Normal = Tier("modularmachinery:blockcasing@0", list(HatchLevel))
Reinforced = Tier("modularmachinery:blockcasing@4", [x for x in HatchLevel if x >= HatchLevel.Reinforced])
SmallOnly = Tier("modularmachinery:blockcasing@0", [HatchLevel.Small])
NonAE2 = Tier("modularmachinery:blockcasing@0", [x for x in HatchLevel if x != HatchLevel.AE2])


@dataclass
class MachineDef:
    name: str
    tier: Tier
    can_be_casing: bool
    hatch_types: list[HatchType]


class RequirementDef(abc.ABC):
    @abc.abstractmethod
    def allowed(self, machine: MachineDef) -> bool: ...

    def __or__(self, other: "RequirementDef"):
        return Or(self, other)

    def __and__(self, other: "RequirementDef"):
        return And(self, other)


@dataclass
class HT(RequirementDef):
    hatch_type: HatchType

    @override
    def allowed(self, machine: MachineDef):
        return self.hatch_type in machine.hatch_types


@dataclass
class And(RequirementDef):
    lhs: RequirementDef
    rhs: RequirementDef

    @override
    def allowed(self, machine: MachineDef):
        return self.lhs.allowed(machine) and self.rhs.allowed(machine)


@dataclass
class Or(RequirementDef):
    lhs: RequirementDef
    rhs: RequirementDef

    @override
    def allowed(self, machine: MachineDef):
        return self.lhs.allowed(machine) or self.rhs.allowed(machine)


class ConnShare(RequirementDef):
    @override
    def allowed(self, machine: MachineDef) -> bool:
        return sum(1 for x in machine.hatch_types if x in [HatchType.ItemInput, HatchType.FluidInput, HatchType.ItemFluidInput, HatchType.EssentiaInput]) >= 2


@dataclass
class HatchDef:
    name: str
    block: str
    level: HatchLevel | None
    requirements: RequirementDef


@dataclass
class HatchCat:
    name: str
    block_base: str
    levels: list[HatchLevel]
    requirements: RequirementDef
    start_tier: int = 0


DualLevels = [HatchLevel.Tiny, HatchLevel.Normal, HatchLevel.Big, HatchLevel.Huge, HatchLevel.Ludicrous]
HatchCategories = [
    HatchCat("item_input", "modularmachinery:blockinputbus", [x for x in HatchLevel if x <= HatchLevel.Ludicrous], HT(HatchType.ItemInput)),
    HatchCat("item_output", "modularmachinery:blockoutputbus", [x for x in HatchLevel if x <= HatchLevel.Ludicrous], HT(HatchType.ItemOutput)),
    HatchCat("fluid_input", "modularmachinery:blockfluidinputhatch", [x for x in HatchLevel if x <= HatchLevel.Ultimate], HT(HatchType.FluidInput)),
    HatchCat("4x_fluid_input", "mmce_complement:quad_fluid_input_hatch_tiny", [x for x in HatchLevel if x <= HatchLevel.Ultimate], HT(HatchType.FluidInput)),
    HatchCat("energy_input", "modularmachinery:blockenergyinputhatch", [x for x in HatchLevel if x <= HatchLevel.Ultimate], HT(HatchType.EnergyInput)),
    HatchCat("dual_input", "mmce_complement:input_assembly_hatch", DualLevels, (HT(HatchType.ItemInput) & HT(HatchType.FluidInput)) | HT(HatchType.ItemFluidInput)),
]

HatchDefinitions = [
    HatchDef("item_input_me", "modularmachinery:blockmeiteminputbus", HatchLevel.AE2, HT(HatchType.ItemInput)),
    HatchDef("adv_item_input_me", "mmce_complement:me_item_inventory_input_bus", HatchLevel.AE2, HT(HatchType.ItemInput)),
    HatchDef("ore_item_input_me", "mmce_complement:me_ore_dict_input_bus", HatchLevel.AE2, HT(HatchType.ItemInput)),
    HatchDef("item_output_me", "modularmachinery:blockmeitemoutputbus", HatchLevel.AE2, HT(HatchType.ItemOutput)),
    HatchDef("fluid_input_me", "modularmachinery:blockmefluidinputbus", HatchLevel.AE2, HT(HatchType.FluidInput)),
    HatchDef("connection_share", "mmce_complement:me_connection_share_hatch", HatchLevel.AE2, ConnShare()),
    HatchDef("adv_fluid_input_me", "mmce_complement:me_fluid_inventory_input_bus", HatchLevel.AE2, HT(HatchType.FluidInput)),
    HatchDef("mana_input", "modularmachinery:blockmanaproviderinput", None, HT(HatchType.ManaInput)),
    HatchDef("essentia_input", "modularmachinery:blockaspectproviderinput", None, HT(HatchType.EssentiaInput)),
    HatchDef("essentia_input_me", "modularmachineryaddons:blockmeessentiainputbus", HatchLevel.AE2, HT(HatchType.EssentiaInput)),
    HatchDef("essentia_output", "modularmachinery:blockaspectprovideroutput", None, HT(HatchType.EssentiaOutput)),
    HatchDef("aura_input", "modularmachinery:blockauraproviderinput", None, HT(HatchType.AuraInput)),
    HatchDef("biome", "modularmachineryaddons:blockbiomeproviderinput", None, HT(HatchType.Biome)),
    HatchDef("biome_adv", "mmce_complement:configurable_biome_provider", None, HT(HatchType.Biome)),
    HatchDef("redstone_scan", "mmce_complement:redstone_signal_output_hatch", None, HT(HatchType.RedstoneScan)),
    HatchDef("starlight_input", "modularmachinery:blockstarlightproviderinput", None, HT(HatchType.StarlightInput)),
    HatchDef("flux_input", "modularmachineryaddons:blockfluxproviderinput", None, HT(HatchType.FluxInput)),
    HatchDef("potential_input", "modularmachineryaddons:blockpotentialenergyproviderinput", None, HT(HatchType.PotentialInput)),
    HatchDef("vis_input", "modularmachineryaddons:blockvisproviderinput", None, HT(HatchType.VisInput)),
]
for hc in HatchCategories:
    for i, lv in enumerate(hc.levels):
        HatchDefinitions.append(HatchDef(f"{hc.name}_{i}", f"{hc.block_base}@{i + hc.start_tier}", lv, hc.requirements))


def generate_hatches(machine: MachineDef):
    hatches: set[str] = set()
    if machine.can_be_casing:
        hatches.add(machine.tier.casing)
    for hd in HatchDefinitions:
        if hd.requirements.allowed(machine) and (hd.level is None or hd.level in machine.tier.valid_levels):
            hatches.add(hd.block)
    return sorted(hatches)


MachineDefinitions = [
    MachineDef("dawnstone_refinery_item", Normal, False, [HatchType.ItemInput, HatchType.ItemOutput]),
    MachineDef("dawnstone_refinery_fluid", Normal, False, [HatchType.FluidInput]),
    MachineDef("dawnstone_refinery_essentia", Normal, False, [HatchType.EssentiaInput]),
    MachineDef("divinity_inverter", Normal, True, [HatchType.ItemInput, HatchType.FluidInput]),
    MachineDef("moonlight_fabricator", Normal, True, [HatchType.ItemInput, HatchType.ItemOutput, HatchType.AuraInput]),
    MachineDef("mystical_combiner", Reinforced, False, [HatchType.ItemFluidInput, HatchType.EnergyInput, HatchType.ItemOutput]),
    MachineDef("mystical_combiner_special", Reinforced, False, [HatchType.FluxInput, HatchType.VisInput, HatchType.PotentialInput]),
    MachineDef("natural_infuser", Normal, True, [HatchType.ItemInput, HatchType.FluidInput, HatchType.ItemOutput]),
    MachineDef("network_supercharger", Normal, False, [HatchType.ItemInput, HatchType.EnergyInput]),
    MachineDef("rainbow_mixer", Reinforced, True, [HatchType.ItemInput, HatchType.FluidInput, HatchType.EnergyInput, HatchType.ItemOutput]),
    MachineDef("resonant_caster", Reinforced, True, [HatchType.ItemInput, HatchType.FluidInput, HatchType.ItemOutput]),
    MachineDef("starlight_laser", SmallOnly, False, [HatchType.ItemInput, HatchType.EnergyInput, HatchType.ItemOutput]),
    MachineDef("thaumic_centrifuge_input", Reinforced, False, [HatchType.FluidInput, HatchType.ManaInput]),
]


def generate_all():
    target = "minecraft/config/modularmachinery/machinery/variables/casings.var.json"
    output = {"_comment": ["Autogenerated: do not edit manually"]}
    for machine in MachineDefinitions:
        output[f"{machine.name}_hatch"] = generate_hatches(machine)
    Path(target).write_text(json.dumps(output, indent=2))
