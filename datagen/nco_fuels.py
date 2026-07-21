import functools
from dataclasses import dataclass
from typing import Any

from datagen.base import (
    Color,
    ColorModifier,
    Desaturate,
    MultiplyColor,
    NoOp,
    Overlay,
    build_model,
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
    make_triso: bool = False


def make_triso_model(name: str, data: dict[str, Any]):
    data["textures"] = {"layer0": f"gateway:items/{name}"}


def generate(fuels: list[Fuel], operators: list[Operator]):
    for fuel in fuels:
        for operator in operators:
            target_filename = f"items/{fuel.name}_{operator.name}.png"
            build_texture(
                "nco_fuel_base.png",
                target_filename,
                MultiplyColor(operator.modifier.apply(fuel.color)),
            )

            if operator.make_triso:
                triso_filename = operator.name.replace("carbide", "triso")
                target_filename = f"items/{fuel.name}_{triso_filename}.png"
                build_texture(
                    "triso_fuel_base.png",
                    target_filename,
                    Overlay(
                        "triso_fuel_core.png",
                        MultiplyColor(operator.modifier.apply(fuel.color)),
                    ),
                )

        build_model(
            "triso_model.json",
            f"item/{fuel.name}_fuel_triso.json",
            functools.partial(make_triso_model, f"{fuel.name}_fuel_triso"),
        )
        build_model(
            "triso_model.json",
            f"item/{fuel.name}_depleted_fuel_triso.json",
            functools.partial(make_triso_model, f"{fuel.name}_depleted_fuel_triso"),
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
    Operator("fuel_carbide", Desaturate(0.6, Color.fromHex(0xAA7543)), make_triso=True),
]


if __name__ == "__main__":
    generate(fuels, operators)
