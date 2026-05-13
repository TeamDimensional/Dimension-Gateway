import abc
from dataclasses import dataclass
from pathlib import Path
from typing import Callable, override

from PIL import Image
from PIL.Image import Image as ImageFile
from PIL.ImageChops import multiply, overlay


@dataclass(frozen=True)
class Color:
    r: int
    g: int
    b: int

    @property
    def asTuple(self):
        return self.r, self.g, self.b

    @classmethod
    def fromHex(cls, x: int):
        return cls(x >> 16, (x >> 8) & 255, x & 255)


def bound[T: (int, float)](low: T, mid: T, high: T):
    return min(high, max(low, mid))


class ColorModifier(abc.ABC):
    @abc.abstractmethod
    def apply(self, color: Color) -> Color: ...


class NoOp(ColorModifier):
    @override
    def apply(self, color: Color) -> Color:
        return color


@dataclass
class Lighten(ColorModifier):
    factor: int

    @override
    def apply(self, color: Color) -> Color:
        return Color(
            bound(0, color.r + self.factor, 255),
            bound(0, color.g + self.factor, 255),
            bound(0, color.b + self.factor, 255),
        )


@dataclass
class Desaturate(ColorModifier):
    factor: float
    target: Color = Color.fromHex(0x808080)

    @override
    def apply(self, color: Color) -> Color:
        return Color(
            int(color.r * (1 - self.factor) + self.target.r * self.factor),
            int(color.g * (1 - self.factor) + self.target.g * self.factor),
            int(color.b * (1 - self.factor) + self.target.b * self.factor),
        )


@dataclass
class ModifierArray(ColorModifier):
    modifiers: list[ColorModifier]

    @override
    def apply(self, color: Color) -> Color:
        for x in self.modifiers:
            color = x.apply(color)
        return color


def build_texture(
    source: Path | str, target: Path | str, operator: Callable[[ImageFile], ImageFile]
):
    file = Image.open(f"datagen/sources/{source}")
    modified = operator(file)
    modified.save(f"minecraft/groovy/assets/gateway/textures/{target}")


class ImageOperator(abc.ABC):
    def andThen(self, other: "ImageOperator"):
        return OpSequence(self, other)

    @abc.abstractmethod
    def __call__(self, image: ImageFile) -> ImageFile:
        pass


@dataclass
class OpSequence(ImageOperator):
    left: ImageOperator
    right: ImageOperator

    @override
    def __call__(self, image: ImageFile) -> ImageFile:
        return self.right(self.left(image))


@dataclass
class MultiplyColor(ImageOperator):
    color: Color

    @override
    def __call__(self, image: ImageFile):
        colored = Image.new(image.mode, image.size, self.color.asTuple)
        return multiply(image, colored)


@dataclass
class Overlay(ImageOperator):
    file: str

    @override
    def __call__(self, image: ImageFile):
        return overlay(image, Image.open(f"datagen/sources/{self.file}"))
