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

public class setFirstTitle implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;
    private final Gradients gradients;

    public setFirstTitle(AdvancedWelcomeTitle plugin, Gradients gradients) {
        this.plugin = plugin;
        this.gradients = gradients;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (sender.hasPermission("WelcomeOperator")) {
            if (args.length < 2) {
                sender.sendMessage("§cUsage: /setFirstTitle <gradientnumber> <message>" );
                return true;
            }

            int gradientNumber = Integer.parseInt(args[0]);
            StringJoiner messageBuilder = new StringJoiner(" ");
            for (int i = 1; i < args.length; i++) {
                messageBuilder.add(args[i]);
            }

            String message = messageBuilder.toString();


            if (gradientNumber <= 7) {
                String gradientTitle = gradients.createGradientMessage(message, gradientNumber);
//                sender.sendMessage("§aFirst title set to: " + gradientTitle);
                plugin.sendMiniMessage(player, "First title set to: " + gradientTitle);
                plugin.getConfig().set("welcometitle.firsttext", gradientTitle);
                plugin.saveConfig();

                //TODO: Delete old Method INMW
                /*if (gradient.equals("1")){
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
                }*/
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

