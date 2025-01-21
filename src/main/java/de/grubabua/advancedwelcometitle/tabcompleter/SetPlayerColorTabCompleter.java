package de.grubabua.advancedwelcometitle.tabcompleter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class SetPlayerColorTabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("WelcomeOperator")) {
            Player player = (Player) sender;
            if (args.length == 1) {
                String input = args[0].toLowerCase();
                ArrayList<String> suggestions = new ArrayList<>();


                String[] colors = {"Black", "DarkBlue", "DarkGreen", "DarkAqua", "DarkRed", "DarkPurple", "Gold",
                        "Gray", "DarkGray", "Blue", "Green", "Aqua", "Red", "LightPurple", "Yellow", "Reset"};


                for (String color : colors) {
                    if (color.toLowerCase().startsWith(input)) {
                        suggestions.add(color);
                    }
                }

                return suggestions;
            }
        }
        return null;
    }
}

