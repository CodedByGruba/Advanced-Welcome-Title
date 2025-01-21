package de.grubabua.advancedwelcometitle.commands;

import de.grubabua.advancedwelcometitle.gradientlist.Gradients;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ShowGradientListCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("WelcomeOperator")){

            //TODO: Create Better Funktion
//            String gradientTitle = gradients.createGradientMessage(message, gradientNumber);

            /*sender.sendMessage(Gradients.createGradientTitle1("This is color gradient 1"));
            sender.sendMessage(Gradients.createGradientTitle2("This is color gradient 2"));
            sender.sendMessage(Gradients.createGradientTitle3("This is color gradient 3"));
            sender.sendMessage(Gradients.createGradientTitle4("This is color gradient 4"));
            sender.sendMessage(Gradients.createGradientTitle5("This is color gradient 5"));
            sender.sendMessage(Gradients.createGradientTitle6("This is color gradient 6"));
            sender.sendMessage(Gradients.createGradientTitle7("This is color gradient 7"));*/

            return true;
        }
        else if (!sender.hasPermission("WelcomeOperator")) {
            sender.sendMessage("§cYou can't do that! Usage: Missing Operator Permission");
            return true;
        }
        return false;
    }
}
