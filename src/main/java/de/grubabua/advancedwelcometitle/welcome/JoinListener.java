package de.grubabua.advancedwelcometitle.welcome;

import de.grubabua.advancedwelcometitle.AdvancedWelcomeTitle;
import de.grubabua.advancedwelcometitle.gradientlist.Gradients;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.text.MessageFormat;


public class JoinListener implements Listener {
    private final AdvancedWelcomeTitle plugin;
    private final Gradients gradients;

    public JoinListener(AdvancedWelcomeTitle plugin, Gradients gradients) {
        this.plugin = plugin;
        this.gradients = gradients;
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        MiniMessage miniMessage = MiniMessage.miniMessage();
        Player player = event.getPlayer();

        if (plugin.config.getBoolean("welcometitle.suppressJoinMessage")) {
            event.setJoinMessage(" ");
        } else {
            event.setJoinMessage(MessageFormat.format("§e{0} just joined", player.getName()));
        }

        String playerName = plugin.config.getString("welcometitle.playercolor") != null ?
                plugin.config.getString("welcometitle.playercolor") + " " + player.getName() :
                "<white> " + player.getName();

        Component title = miniMessage.deserialize(plugin.config.getString("welcometitle.firsttext") != null ?
                plugin.config.getString("welcometitle.firsttext") + playerName :
                gradients.createGradientMessage("Welcome", 1) + playerName
        );

        Component subtitle = miniMessage.deserialize(plugin.config.getString("welcometitle.secondtext") != null ?
                plugin.config.getString("welcometitle.secondtext") :
                gradients.createGradientMessage("use /help AdvancedWelcomeTitle for help", 1)
        );
        player.showTitle(net.kyori.adventure.title.Title.title(title, subtitle));
    }
}