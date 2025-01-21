package de.grubabua.advancedwelcometitle.commands;

import de.grubabua.advancedwelcometitle.AdvancedWelcomeTitle;
import de.grubabua.advancedwelcometitle.gradientlist.Gradients;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.StringJoiner;

public class SetFirstTitleCommand implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;
    private final Gradients gradients;

    public SetFirstTitleCommand(AdvancedWelcomeTitle plugin, Gradients gradients) {
        this.plugin = plugin;
        this.gradients = gradients;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.hasPermission("WelcomeOperator")) {
            sender.sendMessage("§cMissing §e'WelcomeOperator'§c permission!");
            return false;
        }
        if (args.length < 2) {
            sender.sendMessage("§cUsage: /setFirstTitle <gradientnumber> <message>" );
            return false;
        }

        Player player = (Player) sender;
        int gradientNumber = Integer.parseInt(args[0]);
        StringJoiner messageBuilder = new StringJoiner(" ");
        for (int i = 1; i < args.length; i++) {
            messageBuilder.add(args[i]);
        }

        String message = messageBuilder.toString();


        if (gradientNumber <= 7) {
            String gradientTitle = gradients.createGradientMessage(message, gradientNumber);
            plugin.sendMiniMessage(player, "First title set to: " + gradientTitle);
            plugin.getConfig().set("welcometitle.firsttext", gradientTitle);
            plugin.saveConfig();

            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
            return true;
        } else {
            player.sendMessage("§cUsage: Invalid Gradient Number.");
        }
        return true;
    }
}

