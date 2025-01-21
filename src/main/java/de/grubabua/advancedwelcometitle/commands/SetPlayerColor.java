package de.grubabua.advancedwelcometitle.commands;

import de.grubabua.advancedwelcometitle.AdvancedWelcomeTitle;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.common.value.qual.IntRangeFromGTENegativeOne;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class SetPlayerColor implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;

    public SetPlayerColor(AdvancedWelcomeTitle plugin) {
        this.plugin = plugin;
    }

    private Map<String, String> playerColorMap = Map.ofEntries(
            Map.entry("black", "<black>"),
            Map.entry("darkblue", "<dark_blue>"),
            Map.entry("darkgreen", "<dark_green>"),
            Map.entry("darkaqua", "<dark_aqua>"),
            Map.entry("darkred", "<dark_red>"),
            Map.entry("darkpurple", "<dark_purple>"),
            Map.entry("gold", "<gold>"),
            Map.entry("gray", "<gray>"),
            Map.entry("darkgray", "<dark_gray>"),
            Map.entry("blue", "<blue>"),
            Map.entry("green", "<green>"),
            Map.entry("aqua", "<aqua>"),
            Map.entry("red", "<red>"),
            Map.entry("lightpurple", "<light_purple>"),
            Map.entry("yellow", "<yellow>"),
            Map.entry("reset", "<reset>")
    );

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.hasPermission("advancedwelcometitle.admin")) {
            sender.sendMessage("§cYou have no Permission for this");
            return false;
        }
        String color = args[0].toLowerCase();
        Player player = (Player) sender;
        String playerColor = playerColorMap.get(color);
        sender.sendMessage("§aPlayer welcome color set to " + playerColor + args[0]);
        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1, 5);
        plugin.getConfig().set("welcometitle.playercolor", playerColor);
        return true;
    }
}
