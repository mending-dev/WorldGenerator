

# WorldGenerator

A collection of world generators for Paper or Spigot servers (version **1.21+**, Java 21).  
With **WorldGenerator**, server administrators can easily create customized worlds using the default Bukkit configuration system or world manager plugins such as [Multiverse-Core](https://github.com/Multiverse/Multiverse-Core) or [Worlds](https://github.com/mending-dev/Worlds).

---

## 🚀 Features

- **Custom Generators**  
  Provides a growing collection of lightweight and specialized world generators.

- **Current Generators**  
  - **VoidWorldGenerator** – Creates completely empty worlds without terrain or structures. Perfect for lobby worlds, minigames, or technical setups.

- **Compatible with World Managers**  
  Works seamlessly with plugins like **Multiverse-Core** and **Worlds**, allowing you to generate, import, and manage custom worlds effortlessly.

- **Paper & Spigot Support**  
  Fully compatible with both Paper and Spigot 1.21 servers.

---

## 📦 Usage

WorldGenerator does not add commands on its own. Instead, it provides world generators that can be referenced when creating or importing worlds.

### Example with **Multiverse-Core**

```bash
/mv create void_world normal -g VoidWorldGenerator
```

### Example with **Worlds**

```bash
/world create void_world NORMAL NORMAL VoidWorldGenerator
```

### ... or use it manually in your **bukkit.yml**

```yaml
worlds:
  world:
    generator: VoidWorldGenerator
```

This will create a completely empty world using the provided **VoidWorldGenerator**.

---

## 🗒️ Configuration

WorldGenerator itself does not require configuration.  
All settings are managed through Bukkit’s world configuration system or your chosen world manager plugin.

---

## ⚖️ License

WorldGenerator is licensed under the MIT License. See [LICENSE](LICENSE) for details.