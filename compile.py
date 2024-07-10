import dataclasses
import tomllib
import os
import json
import shutil


@dataclasses.dataclass
class File:
    projectID: int
    fileID: int
    required: bool = True


@dataclasses.dataclass
class ModLoader:
    id: str
    primary: bool = True


@dataclasses.dataclass
class Minecraft:
    version: str
    modLoaders: list[ModLoader]


@dataclasses.dataclass
class Manifest:
    minecraft: Minecraft
    name: str
    version: str
    author: str
    files: list[File]
    manifestType: str = "minecraftModpack"
    manifestVersion: int = 1
    overrides: str = "overrides"


def make_manifest(pack: dict, files: list[dict], dev: bool):
    mc = Minecraft(version=pack["version"], modLoaders=[ModLoader(pack["versions"]["forge"])])
    filesConverted = [
        File(f["update"]["curseforge"]["project-id"], f["update"]["curseforge"]["file-id"])
        for f in files
        if dev or not f.get("dev_only")
    ]
    return Manifest(mc, pack["name"], pack["version"], pack["author"], filesConverted)


def run(dev: bool = False, suffix: str = ""):
    with open("metadata/pack.toml", "rb") as f:
        data = tomllib.load(f)
    files = []
    for f in os.listdir("metadata/mods"):
        with open("metadata/mods/" + f, "rb") as fp:
            files.append(tomllib.load(fp))
    manifest = make_manifest(data, files, dev)

    shutil.rmtree("build", ignore_errors=True)
    os.makedirs("build/overrides/mods", exist_ok=True)
    with open("build/manifest.json", "w") as f:
        json.dump(dataclasses.asdict(manifest), f)
    shutil.copytree("config", "build/overrides/config")
    shutil.copytree("groovy", "build/overrides/groovy")
    for f in os.listdir("mods"):
        if f.startswith("gatewaycore"):
            shutil.copy("mods/" + f, "build/overrides/mods/" + f)
    shutil.make_archive("dimension-gateway-" + data["version"] + suffix, "zip", "build", ".")
    return data["version"]


if __name__ == "__main__":
    version1 = run(dev=False)
    version2 = run(dev=True, suffix="-dev")
    shutil.move("dimension-gateway-" + version1 + ".zip", "build")
    shutil.move("dimension-gateway-" + version2 + "-dev.zip", "build")
