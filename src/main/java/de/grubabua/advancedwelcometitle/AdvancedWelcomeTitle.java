package de.grubabua.advancedwelcometitle;

import de.grubabua.advancedwelcometitle.commands.*;
import de.grubabua.advancedwelcometitle.welcome.WelcomeEvents;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class AdvancedWelcomeTitle extends JavaPlugin {
    private ConfigManager configManager;
    private File configFile;
    public static FileConfiguration config;

    @Override
    public void onEnable() {
        config = getConfig();
        configFile = new File(getDataFolder(), "config.yml");
        configManager = new ConfigManager(configFile);
        configManager.loadConfig();

        getServer().getPluginManager().registerEvents(new WelcomeEvents(), this);

        getCommand("setFirstTitle").setExecutor(new setFirstTitle(this));
        getCommand("setFirstTitle").setTabCompleter(new de.grubabua.advancedwelcometitle.tabcompleter.setFirstTitle());
        getCommand("setSecondTitle").setExecutor(new setSecondTitle(this));
        getCommand("setSecondTitle").setTabCompleter(new de.grubabua.advancedwelcometitle.tabcompleter.setSecondTitle());
        getCommand("setPlayerColor").setExecutor(new SetPlayerColor(this));
        getCommand("setPlayerColor").setTabCompleter(new de.grubabua.advancedwelcometitle.tabcompleter.setPlayerColor());
        getCommand("showGradientList").setExecutor(new showGradientList());
        getCommand("playerJoinMessage").setExecutor(new PlayerJoinMessage(this));


    }

    @Override
    public void onDisable() {
        configManager.saveConfig();
        saveConfig();
    }
    public void sendMiniMessage(Player player, String miniMessage) {
        Component message = MiniMessage.miniMessage().deserialize(miniMessage);
        player.sendMessage(String.valueOf(message));
    }
}


