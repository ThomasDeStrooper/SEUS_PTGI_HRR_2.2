<h1 style="text-align:center;">SnowCraft: Final Edition</h1>

<p style="text-align:center;">
Discover a unique Minecraft multiplayer experience like never before
</p>

[![GitHub Release](https://img.shields.io/github/v/release/Archy-X/AuraSkills?style=flat-square)](https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/releases/latest)

  &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="https://discord.gg/w4eFd4WMhZ">Discord</a>
</p>

## About

**Snowcraft** is a unique Minecraft server like no other, transporting you to an entirely new world 
filled with endless adventures. Engage in epic battles against formidable monsters, 
explore uncharted territories, and uncover hidden secrets. Master custom skills tailored to enhance 
your gameplay, wield powerful new weapons, and take on mighty dragons in thrilling encounters. 
This open-world MMORPG survival server offers a rich and immersive experience where everyone 
is welcome to join and play. Whether you’re a seasoned player or new to the game, 
Snowcraft promises an unforgettable journey.

Features include:
- **Skills** - Gain skill XP to level skills through general Minecraft tasks, such as Farming or Mining.
- **Stats** - Get player buffs like increased health and damage by leveling skills, which can be as independent modifiers and on items.
- **Abilities** - Skills have passive and active abilities that add gameplay mechanics, plus a full mana system.
- **Menus** - Players can see everything related to skills in fully-configurable inventory GUIs.
- **Rewards** - Customize rewards given for leveling skills, such as running commands or giving items.
- **Loot** - Create custom loot tables for fishing, blocks, and mobs.

See the [official website](https://aurelium.dev/auraskills) and [wiki](https://wiki.aurelium.dev/auraskills) for a more complete list of features. The wiki also contains the list of [server requirements](https://wiki.aurelium.dev/auraskills/server-requirements) to run the plugin.

## API

SnowCraft has an extensive developer API.

Release versions are published to the Maven central repository.

### Maven

```xml
<dependency>
    <groupId>dev.thomasdestrooper</groupId>
    <artifactId>snowcraft-api-bukkit</artifactId>
    <version>2.2.0</version>
    <scope>provided</scope>
</dependency>
```
### Gradle

**Groovy DSL:**
```gradle
repositories {
    mavenCentral()
}

dependencies {
    compileOnly 'dev.thomasdestrooper:snowcraft-api-bukkit:2.2.0'
}
```
**Kotlin DSL:**
```Gradle Kotlin DSL
repositories { 
    mavenCentral()
}

dependencies { 
    compileOnly("dev.thomasdestrooper:snowcraft-api-bukkit:2.2.0")
}
```

## Contributing
Contributions are welcome, just open a pull request.
