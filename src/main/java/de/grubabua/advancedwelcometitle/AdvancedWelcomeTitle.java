package de.grubabua.advancedwelcometitle;

import de.grubabua.advancedwelcometitle.commands.*;
import de.grubabua.advancedwelcometitle.gradientlist.Gradients;
import de.grubabua.advancedwelcometitle.tabcompleter.SetFirstTitleTabCompleter;
import de.grubabua.advancedwelcometitle.tabcompleter.SetPlayerColorTabCompleter;
import de.grubabua.advancedwelcometitle.tabcompleter.SetSecondTitleTabCompleter;
import de.grubabua.advancedwelcometitle.welcome.JoinListener;
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
        registerTabCompleter();
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

    private void registerListener() {
        getServer().getPluginManager().registerEvents(new JoinListener(this, gradients), this);
    }
    private void registerCommands() {
        getCommand("setFirstTitle").setExecutor(new SetFirstTitleCommand(this, gradients));
        getCommand("setSecondTitle").setExecutor(new SetSecondTitleCommand(this, gradients));
        getCommand("setPlayerColor").setExecutor(new SetPlayerColor(this));
        getCommand("gradientList").setExecutor(new GradientListCommand(this, gradients));
        getCommand("playerJoinMessage").setExecutor(new PlayerJoinMessageCommand(this));
    }
    private void registerTabCompleter() {
        getCommand("setFirstTitle").setTabCompleter(new SetFirstTitleTabCompleter());
        getCommand("setSecondTitle").setTabCompleter(new SetSecondTitleTabCompleter());
        getCommand("setPlayerColor").setTabCompleter(new SetPlayerColorTabCompleter());
    }
}


