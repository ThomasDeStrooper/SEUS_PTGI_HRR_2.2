![bannersnowcraft](https://github.com/user-attachments/assets/a49ddac0-66f7-4c30-9e34-9f84f844314e)

<h1 style="text-align:center;">SnowCraft: Final Edition</h1>

<p style="text-align:center;">
Discover a unique Minecraft multiplayer experience like never before
  
[![GitHub Release](https://img.shields.io/badge/release-v2.2.2-blue)](https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/releases/latest)
[![GitHub License](https://img.shields.io/badge/license-GNU-green)](https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/blob/main/LICENSE.md)
[![Resourcepack](https://img.shields.io/badge/resourcepack-b30-red)](https://drive.google.com/file/d/1Dbu38k6xkpL1BSKCEA7DnluJiGR7qeig/view?usp=sharing)

<a href="https://discord.gg/w4eFd4WMhZ">Discord</a> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  <a href="https://www.patreon.com/c/thomasdestrooper">Patreon</a> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  <a href="https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/issues">Issues</a>

## About

**SnowCraft: Final Edition** (formerly **SnowCraft**) is a unique Minecraft server like no other, transporting you to an entirely new world 
filled with endless adventures. Engage in epic battles against formidable monsters, 
explore uncharted territories, and uncover hidden secrets. Master custom skills tailored to enhance 
your gameplay, wield powerful new weapons, and take on mighty dragons in thrilling encounters. 
This open-world MMORPG survival server offers a rich and immersive experience where everyone 
is welcome to join and play. Whether you’re a seasoned player or new to the game, 
Snowcraft promises an unforgettable journey.

Features include:
- **Brand New World** - A vast, brand new world teeming with endless possibilities, where you can immerse yourself in exploration and uncover unique, intricate structures waiting to be discovered at every turn.
- **Custom Fishing Mechanics** - Catch a variety of new fish by completing exciting mini-games, earning valuable experience points with every successful challenge you conquer, and unlock a range of new, specialized fishing rods to enhance your adventures.
- **Kits** - Claim powerful kits to boost your strength and enhance your abilities, helping you become even more formidable in your journey.
- **Skills** - Gain skill XP to level skills through general Minecraft tasks, such as Farming, Mining and more.
- **Quests** - Earn exciting rewards and exclusive bonuses by completing challenging quests and unlocking new adventures along the way.
- **Storage** - Free up valuable space in your inventory by storing your items in the /storage, ensuring you have room for new treasures and essential gear.
- **Jobs** - Take on various jobs to earn money, gain experience, and unlock new opportunities as you progress.
- **Items** - You can discover and acquire over 120 brand-new custom items, which can be purchased or crafted using a variety of unique custom ores, offering endless possibilities for creativity and personalization.
- **Seasons** - The game features four distinct seasons, each bringing transformative changes to the world that leave a lasting impact on the gameplay and environment.
- **Factions** - You can choose to join one of three unique factions, each offering exclusive abilities that enhance your gameplay experience and define your journey in the game.
- **Mobs & Bosses** - The game is filled with unique custom mobs and powerful bosses, each presenting exciting challenges for you to overcome and rewarding victories to claim.
- **Battle Pass** - Take on exciting weekly and daily quests to earn rewards upon completion! For even more quests and exclusive rewards, you can unlock the premium pass by purchasing a rank, giving you access to additional challenges and bigger prizes.
- **Blacksmith** - Buy a wide variety of weapons and ores to improve your strength through the blacksmith system.

Features coming soon:
- **Ores** - There are over 60 unique and rare ores scattered throughout the underground, waiting to be discovered and mined for valuable resources.
- **Recipies** - Craft custom items, including unique weapons, melt rare ores into valuable materials, and create a wide variety of other specialized gear to enhance your adventure.
- **Achievements** - A new system allows you to choose from a variety of achievements, such as catching custom fish, mining rare ores, defeating custom mobs and bosses, and much more. As you complete these achievements, you'll earn Achievement Points.
- **Loot Drops** - Custom mobs and bosses drop unique, custom loot upon their defeat, offering players exclusive rewards that can't be found elsewhere.
- **Treasure Chests** - Treasure chests randomly spawn throughout the world, each containing unique and custom loot that offers valuable rewards for those who seek them out.
- **Classes** - Join different classes, level up your character, and unlock a wide range of powerful abilities that will enhance your skills and give you an edge in battle.
- **Codex** - When you defeat mobs and bosses or discover new regions, they will be added to the Codex system, and you'll receive rewards.
- **Pets** - Pets are cosmetic companions on our server that can be unlocked by purchasing a rank. While they primarily serve as a fun visual feature, some pets can also assist you during fights. Even the default rank, which is free and available to everyone, includes a wide variety of pets for you to enjoy.
  
If you have additional questions feel free to report an issue on our [issues](https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/issues) page or join our [discord](https://discord.gg/w4eFd4WMhZ) community, where you can connect with other users and get support from our team.

## Resourcepack

SnowCraft uses a custom resourcepack.

#### Compiling from source

First, click the link below to download the resourcepack (Optifine is recommended but not required):

```
https://drive.google.com/file/d/1Dbu38k6xkpL1BSKCEA7DnluJiGR7qeig/view?usp=sharing
```

Then open your pack folders on your operating system:

```
.\Options > Resource Packs > Open Pack Folder
```

And drag and drop the resource pack in the directory:

```
.minecraft/resourcepacks
```
SnowCraft `automatically` sends you a resource pack, but this resource pack is only for the `models and sound`.


## API

**SnowCraft** has an extensive &ndeveloper API.
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
