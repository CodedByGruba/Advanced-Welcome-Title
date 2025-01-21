package de.grubabua.advancedwelcometitle.commands;

import de.grubabua.advancedwelcometitle.AdvancedWelcomeTitle;
import de.grubabua.advancedwelcometitle.gradientlist.Gradients;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.text.MessageFormat;
import java.util.stream.Stream;

public class ShowGradientListCommand implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;
    private final Gradients gradients;

    public ShowGradientListCommand(AdvancedWelcomeTitle plugin, Gradients gradients) {
        this.plugin = plugin;
        this.gradients = gradients;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.hasPermission("WelcomeOperator")) {
            sender.sendMessage("§cMissing §e'WelcomeOperator'§c permission!");
            return false;
        }
        Player player = (Player) sender;
        
        for (int i = 0; i <= 7; i++) {
            plugin.sendMiniMessage(player, gradients.createGradientMessage(MessageFormat.format("This is color gradient {0}", i), i));
        }
        return true;
    }
}
