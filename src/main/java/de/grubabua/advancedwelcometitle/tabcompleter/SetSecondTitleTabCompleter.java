package de.grubabua.advancedwelcometitle.tabcompleter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class SetSecondTitleTabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("WelcomeOperator")) {
            Player player = (Player) sender;
            if (args.length == 1) {
                ArrayList<String> gradients = new ArrayList<>();

                gradients.add("1");
                gradients.add("2");
                gradients.add("3");
                gradients.add("4");
                gradients.add("5");
                gradients.add("6");
                gradients.add("7");
                gradients.add("own");
                return gradients;
            }
        }

        return null;
    }
}