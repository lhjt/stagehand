package io.lhjt.minecraft;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion.Target;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@Plugin(name = "stagehand", version = "0.1.0")
@ApiVersion(value = Target.v1_17)
@Author(value = "lhjt")
@Description(value = "A management plugin to set the scene of the server.")
public class Stagehand extends JavaPlugin {
    @Override
    public void onEnable() {
        // TODO Auto-generated method stub
        super.onEnable();
    }

    @Override
    public void onDisable() {
        // TODO Auto-generated method stub
        super.onDisable();
    }
}
