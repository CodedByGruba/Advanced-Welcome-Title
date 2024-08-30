package de.grubabua.advancedwelcometitle.commands;

import de.grubabua.advancedwelcometitle.AdvancedWelcomeTitle;
import de.grubabua.advancedwelcometitle.gradientlist.gradients;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.StringJoiner;

public class setFirstTitle implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;

    public setFirstTitle(AdvancedWelcomeTitle plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (sender.hasPermission("WelcomeOperator")) {
            if (args.length < 2) {
                sender.sendMessage("§cUsage: /setFirstTitle <gradientnumber> <message>" );
                return true;
            }

            String gradient = args[0].toLowerCase();
            StringJoiner messageBuilder = new StringJoiner(" ");
            for (int i = 1; i < args.length; i++) {
                messageBuilder.add(args[i]);
            }


            String wowsmessage = messageBuilder.toString().replaceAll("\\s", "");
            int length = wowsmessage.length();
            String message = messageBuilder.toString();



            if (length >= 11) {
                sender.sendMessage("§cUsage: Title can't be longer then 10");
                return true;
            }


            if (gradient.matches("[1-7]")) {
                if (gradient.equals("1")){
                    String gradientTitle = gradients.createGradientTitle1(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.firsttext", gradientTitle);
                    plugin.saveConfig();
                }
                if (gradient.equals("2")){
                    String gradientTitle = gradients.createGradientTitle2(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.firsttext", gradientTitle);
                    plugin.saveConfig();
                }
                if (gradient.equals("3")){
                    String gradientTitle = gradients.createGradientTitle3(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.firsttext", gradientTitle);
                    plugin.saveConfig();
                }
                if (gradient.equals("4")){
                    String gradientTitle = gradients.createGradientTitle4(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.firsttext", gradientTitle);
                    plugin.saveConfig();
                }
                if (gradient.equals("5")){
                    String gradientTitle = gradients.createGradientTitle5(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.firsttext", gradientTitle);
                    plugin.saveConfig();
                }
                if (gradient.equals("6")){
                    String gradientTitle = gradients.createGradientTitle6(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.firsttext", gradientTitle);
                    plugin.saveConfig();
                }
                if (gradient.equals("7")){
                    String gradientTitle = gradients.createGradientTitle7(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.firsttext", gradientTitle);
                    plugin.saveConfig();
                }
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                return true;

            } else {
                sender.sendMessage("§cUsage: Invalid Gradient Number.");
            }



        }
        else if (!sender.hasPermission("WelcomeOperator")) {
            sender.sendMessage("§cYou can't do that. Usage: Missing Operator Permission");
        }
        return false;
    }
}

