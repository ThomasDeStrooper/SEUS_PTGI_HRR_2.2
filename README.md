![bannersnowcraft](https://github.com/user-attachments/assets/a49ddac0-66f7-4c30-9e34-9f84f844314e)

<h1 style="text-align:center;">SnowCraft: Final Edition</h1>

<p style="text-align:center;">
☄️ Discover a unique Minecraft multiplayer experience like never before
  
[![GitHub Release](https://img.shields.io/badge/release-v2.2.8-blue)](https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/releases/latest)
[![GitHub License](https://img.shields.io/badge/license-GNU-green)](https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/blob/main/LICENSE.md)
[![Resourcepack](https://img.shields.io/badge/resourcepack-download-red)](https://www.googleapis.com/drive/v3/files/1szSuDClQ68SyObEokfP-ka-IrTvdQDbT?alt=media&key=AIzaSyAjiCJAPplrXZ9gW6n-MQsOM7Z-qiP-FQ0)
[![Version](https://img.shields.io/badge/version-1.19.4/1.21.1-yellow)]()

<a href="https://discord.gg/w4eFd4WMhZ">Discord</a> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  <a href="https://www.patreon.com/c/thomasdestrooper">Patreon</a> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  <a href="https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/issues">Issues</a> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  <a href="https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/blob/main/LICENSE.md">License</a>


## About

**SnowCraft: Final Edition** _(formerly **SnowCraft**)_ is a unique Minecraft server like no other, transporting you to an entirely new world 
filled with endless adventures. Engage in epic battles against formidable monsters, 
explore uncharted territories, and uncover hidden secrets. Master custom skills tailored to enhance 
your gameplay, wield powerful new weapons, and take on mighty dragons in thrilling encounters. 
This open-world MMORPG survival server offers a rich and immersive experience where everyone 
is welcome to join and play. Whether you’re a seasoned player or new to the game, 
Snowcraft promises an unforgettable journey.

## Features include:
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
- **Blacksmith** - Buy a wide variety of weapons with coins to improve your strength through the blacksmith system.
- **Thirst & Stamina** – Your character becomes thirsty over time and must drink to survive. Failure to hydrate will lead to death. Running or swimming drains stamina, requiring rest to recover. Manage both to stay alive.
  
## Features coming soon:
- **Ores** - There are over 60 unique and rare ores scattered throughout the underground, waiting to be discovered and mined for valuable resources.
- **Recipies** - Craft custom items, including unique weapons, melt rare ores into valuable materials, and create a wide variety of other specialized gear to enhance your adventure.
- **Achievements** - A new system allows you to choose from a variety of achievements, such as catching custom fish, mining rare ores, defeating custom mobs and bosses, and much more. As you complete these achievements, you'll earn Achievement Points.
- **Loot Drops** - Custom mobs and bosses drop unique, custom loot upon their defeat, offering players exclusive rewards that can't be found elsewhere.
- **Treasure Chests** - Treasure chests randomly spawn throughout the world, each containing unique and custom loot that offers valuable rewards for those who seek them out.
- **Classes** - Join different classes, level up your character, and unlock a wide range of powerful abilities that will enhance your skills and give you an edge in battle.
- **Codex** - When you defeat mobs and bosses or discover new regions, they will be added to the Codex system, and you'll receive rewards.
- **Pets** - Pets are cosmetic companions on our server that can be unlocked by purchasing a rank. While they primarily serve as a fun visual feature, some pets can also assist you during fights. Even the default rank, which is free and available to everyone, includes a wide variety of pets for you to enjoy.
  
If you have additional questions feel free to report an issue on our [issues](https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/issues) page or join our [discord](https://discord.gg/w4eFd4WMhZ) community, where you can connect with other users and get support from our team.

## Resource pack

SnowCraft uses a custom resource pack.

#### How to install the resource pack

First, click the link to download the [resource pack](https://www.googleapis.com/drive/v3/files/1szSuDClQ68SyObEokfP-ka-IrTvdQDbT?alt=media&key=AIzaSyAjiCJAPplrXZ9gW6n-MQsOM7Z-qiP-FQ0) (Optifine is recommended but not required):

#### Then open your pack folders on your operating system:

```
Options\Resource Packs\Open Pack Folder
```

#### And drag and drop the resource pack in the directory:

```
User\AppData\Roaming\.minecraft\resourcepacks
```

SnowCraft `automatically` sends you a resource pack, but this resource pack is only for the `models and sounds`.


## API

**SnowCraft** has an extensive developer API.
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

## License

*Click here to read [the entire license](https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/blob/main/LICENSE.md)*

The Snowcraft Resource Pack is free to use on the Snowcraft server, but its distribution, whether modified or intact, is strictly prohibited. This includes compiled versions, source files, or partial components of the pack. Public forks or derivatives are not allowed under this license. While you are welcome to suggest improvements or propose contributions, they must comply with the terms of this license. Using the resource pack solely on the Snowcraft server helps protect the integrity of the work and supports the experience I’ve designed for the community.

## Credit

*Click here to read [the entire credit](https://github.com/ThomasDeStrooper/SnowCraft-Final-Edition/blob/main/CREDIT.md)*

The Snowcraft Resource Pack uses some resources from other developers, which have been utilized in accordance with their respective distribution terms. These resources were sourced from publicly available platforms offering them for free use, and I acknowledge the contributions of the creators.
