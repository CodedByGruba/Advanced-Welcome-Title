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

public class SetPlayerColor implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;

    public SetPlayerColor(AdvancedWelcomeTitle plugin) {
        this.plugin = plugin;
        initializePlayerColorMap();
    }
    private HashMap<String, String> playerColorMap = new HashMap();
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
    void initializePlayerColorMap() {
        playerColorMap.put("black", "§0");
        playerColorMap.put("darkblue", "§1");
        playerColorMap.put("darkgreen", "§2");
        playerColorMap.put("darkaqua", "§3");
        playerColorMap.put("darkred", "§4");
        playerColorMap.put("darkpurple", "§5");
        playerColorMap.put("gold", "§6");
        playerColorMap.put("gray", "§7");
        playerColorMap.put("darkgray", "§8");
        playerColorMap.put("blue", "§9");
        playerColorMap.put("green", "§a");
        playerColorMap.put("aqua", "§b");
        playerColorMap.put("red", "§c");
        playerColorMap.put("lightpurple", "§d");
        playerColorMap.put("yellow", "§e");
        playerColorMap.put("reset", "§r");
    }
}
