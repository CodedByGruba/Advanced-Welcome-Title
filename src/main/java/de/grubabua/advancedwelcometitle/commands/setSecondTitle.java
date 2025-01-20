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

public class setSecondTitle implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;

    public setSecondTitle(AdvancedWelcomeTitle plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        String gradient = args[0].toLowerCase();
        if (sender.hasPermission("WelcomeOperator")) {
            if (args.length < 2) {
                sender.sendMessage("§cUsage: /setSecondTitle <Color Gradient> <Text>" );
                return true;
            }

            StringJoiner messageBuilder = new StringJoiner(" ");
            for (int i = 1; i < args.length; i++) {
                messageBuilder.add(args[i]);
            }


            String wowsmessage = messageBuilder.toString().replaceAll("\\s", "");
            int length = wowsmessage.length();
            String message = messageBuilder.toString();


            if (length >= 33) {
                sender.sendMessage("§cUsage: Title can't be longer then 32");
                return true;
            }
            if (length < 5) {
                sender.sendMessage("§cUsage: Title can,t be shorter then 5");
                return true;
            }

            if (gradient.matches("[1-7]")) {
                if (gradient.equals("1")){
                    String gradientTitle = Gradients.createGradientTitle1(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.secondtext", gradientTitle);
                    plugin.saveConfig();
                }
                else if (gradient.equals("2")) {
                    String gradientTitle = Gradients.createGradientTitle2(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.secondtext", gradientTitle);
                    plugin.saveConfig();
                }
                else if (gradient.equals("3")) {
                    String gradientTitle = Gradients.createGradientTitle3(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.secondtext", gradientTitle);
                    plugin.saveConfig();
                }
                else if (gradient.equals("4")) {
                    String gradientTitle = Gradients.createGradientTitle4(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.secondtext", gradientTitle);
                    plugin.saveConfig();
                }
                else if (gradient.equals("5")) {
                    String gradientTitle = Gradients.createGradientTitle5(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.secondtext", gradientTitle);
                    plugin.saveConfig();
                }
                else if (gradient.equals("6")) {
                    String gradientTitle = Gradients.createGradientTitle6(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.secondtext", gradientTitle);
                    plugin.saveConfig();
                }
                else if (gradient.equals("7")) {
                    String gradientTitle = Gradients.createGradientTitle7(message);
                    sender.sendMessage("§aFirst title set to: " + gradientTitle);
                    plugin.getConfig().set("welcometitle.secondtext", gradientTitle);
                    plugin.saveConfig();
                }
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                return true;

            } else {
                sender.sendMessage("§cUsage: Invalid Gradient Number");
            }

        }
        else if (!sender.hasPermission("WelcomeOperator")) {
            sender.sendMessage("§cYou can't do that. Usage: Missing Operator Permission");
        }
        return false;

    }


}

