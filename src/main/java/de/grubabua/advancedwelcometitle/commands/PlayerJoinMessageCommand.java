package de.grubabua.advancedwelcometitle.commands;

import de.grubabua.advancedwelcometitle.AdvancedWelcomeTitle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerJoinMessageCommand implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;
    public PlayerJoinMessageCommand(AdvancedWelcomeTitle plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //if variable is true: join message is suppressed
        boolean suppressJoinMessage = plugin.getConfig().getBoolean("welcometitle.suppressJoinMessage");
        Player player = (Player) sender;
        if (!sender.hasPermission("advancedwelcometitle.admin")) {
            sender.sendMessage("§cYou have no Permission for this");
            return false;
        }

        if (!suppressJoinMessage) {
            sender.sendMessage("§cJoin message turned off");
            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1, 5);
            suppressJoinMessage = true;
            plugin.getConfig().set("welcometitle.suppressJoinMessage", suppressJoinMessage);
        } else {
            sender.sendMessage("§aJoin message turned on");
            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1, 5);
            suppressJoinMessage = false;
            plugin.getConfig().set("welcometitle.suppressJoinMessage", suppressJoinMessage);
        }
        plugin.saveConfig();
        return true;
    }
    //TODO: Remove oldMethod if playerJoinMessage works
    void oldMethod(Player player, CommandSender sender) {
        plugin.getConfig().set("welcometitle.jointext", "§e" + ((Player) sender).getPlayer().getName() + " just joined!");
        plugin.saveConfig();
        sender.sendMessage("§aJoin message turned on");
        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1, 5);
    }
}
