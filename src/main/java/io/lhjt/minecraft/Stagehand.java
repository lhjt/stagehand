package io.lhjt.minecraft;

import org.bukkit.permissions.PermissionDefault;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.permission.ChildPermission;
import org.bukkit.plugin.java.annotation.permission.Permission;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion.Target;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@Plugin(name = "stagehand", version = "0.1.0")
@ApiVersion(value = Target.v1_17)
@Author(value = "lhjt")
@Description(value = "A management plugin to set the scene of the server.")
@Permission(name = "stagehand.borderControl", desc = "Allow managing of stagehand border controls", defaultValue = PermissionDefault.FALSE)
@Permission(name = "stagehand.*", desc = "Wildcard permission", defaultValue = PermissionDefault.FALSE, children = {
        @ChildPermission(name = "stagehand.borderControl") })
public class Stagehand extends JavaPlugin {
    @Override
    public void onEnable() {
        super.onEnable();
        this.loadConfig();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    private void loadConfig() {
        var config = this.getConfig();

        // Set the defaults
        config.addDefault("enabled", false); // Whether the plugin is enabled

        config.options().copyDefaults(true);
        this.saveConfig();
    }
}
