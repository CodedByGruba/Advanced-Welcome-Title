package de.grubabua.advancedwelcometitle;

import de.grubabua.advancedwelcometitle.commands.*;
import de.grubabua.advancedwelcometitle.gradientlist.Gradients;
import de.grubabua.advancedwelcometitle.welcome.WelcomeEvents;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class AdvancedWelcomeTitle extends JavaPlugin {
    public FileConfiguration config;
    private ConfigManager configManager;
    private File configFile;
    private Gradients gradients;

    @Override
    public void onEnable() {
        config = getConfig();
        configFile = new File(getDataFolder(), "config.yml");
        configManager = new ConfigManager(configFile);
        configManager.loadConfig();

        gradients = new Gradients();

        registerListener();
        registerCommands();
    }

    @Override
    public void onDisable() {
        configManager.saveConfig();
        saveConfig();
    }

    public void sendMiniMessage(Player player, String message) {
        Component parsedMessage = MiniMessage.miniMessage().deserialize(message);
        player.sendMessage(parsedMessage);
    }

    private void registerCommands() {
        getCommand("setFirstTitle").setExecutor(new setFirstTitle(this, gradients));
        getCommand("setFirstTitle").setTabCompleter(new de.grubabua.advancedwelcometitle.tabcompleter.setFirstTitle());
        getCommand("setSecondTitle").setExecutor(new setSecondTitle(this));
        getCommand("setSecondTitle").setTabCompleter(new de.grubabua.advancedwelcometitle.tabcompleter.setSecondTitle());
        getCommand("setPlayerColor").setExecutor(new SetPlayerColor(this));
        getCommand("setPlayerColor").setTabCompleter(new de.grubabua.advancedwelcometitle.tabcompleter.setPlayerColor());
        getCommand("showGradientList").setExecutor(new showGradientList());
        getCommand("playerJoinMessage").setExecutor(new PlayerJoinMessage(this));
    }
    private void registerListener() {
        getServer().getPluginManager().registerEvents(new WelcomeEvents(this), this);
    }
}


