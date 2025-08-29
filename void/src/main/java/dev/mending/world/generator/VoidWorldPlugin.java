package dev.mending.world.generator;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class VoidWorldPlugin extends JavaPlugin {

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        getLogger().log(Level.INFO, "Generator is used for minecraft:" + worldName);
        return new VoidWorldGenerator();
    }

}
