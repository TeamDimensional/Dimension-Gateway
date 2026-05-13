from dataclasses import dataclass

from datagen.base import (
    Color,
    ColorModifier,
    Desaturate,
    MultiplyColor,
    NoOp,
    build_texture,
)


@dataclass
class Fuel:
    name: str
    color: Color


@dataclass
class Operator:
    name: str
    modifier: ColorModifier


def generate(fuels: list[Fuel], operators: list[Operator]):
    for fuel in fuels:
        for operator in operators:
            target_filename = f"items/{fuel.name}_{operator.name}.png"
            build_texture(
                "nco_fuel_base.png",
                target_filename,
                MultiplyColor(operator.modifier.apply(fuel.color)),
            )


fuels = [
    Fuel("natural", Color.fromHex(0x55FF55)),
    Fuel("arcane", Color.fromHex(0xFF55FF)),
    Fuel("lunar", Color.fromHex(0x5555FF)),
    Fuel("skybound", Color.fromHex(0x55FFFF)),
    Fuel("botanical", Color.fromHex(0xFFFF55)),
    Fuel("crystalline", Color.fromHex(0xFFAA00)),
    Fuel("nightmare", Color.fromHex(0xFF5555)),
]

operators = [
    Operator("fuel_unprepared", Desaturate(0.7)),
    Operator("fuel", NoOp()),
    Operator("fuel_ox", Desaturate(0.32, Color.fromHex(0x6666FF))),
    Operator("depleted_fuel_ox", Desaturate(0.45, Color.fromHex(0xAAAAFF))),
]


if __name__ == "__main__":
    generate(fuels, operators)
