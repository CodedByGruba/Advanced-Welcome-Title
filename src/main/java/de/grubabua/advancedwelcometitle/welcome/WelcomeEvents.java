package de.grubabua.advancedwelcometitle.welcome;

import de.grubabua.advancedwelcometitle.AdvancedWelcomeTitle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.text.MessageFormat;


public class WelcomeEvents implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (AdvancedWelcomeTitle.config.getBoolean("welcometitle.suppressJoinMessage")) {
            event.setJoinMessage(" ");
        } else {
            event.setJoinMessage(MessageFormat.format("§e{0} just joined", player.getName()));
        }

        if (AdvancedWelcomeTitle.config.getString("welcometitle.firsttext") == null){
            event.getPlayer().sendTitle("§x§F§B§0§0§0§0W§x§F§C§2§B§2§Be§x§F§C§5§5§5§5l§x§F§D§8§0§8§0c§x§F§E§A§A§A§Ao§x§F§E§D§5§D§5m§x§F§F§F§F§F§Fe" + "§r " + event.getPlayer().getName(),"§x§F§B§0§0§0§0U§x§F§B§0§8§0§8s§x§F§B§0§F§0§Fe §x§F§B§1§7§1§7/§x§F§B§1§E§1§Eh§x§F§C§2§6§2§6e§x§F§C§2§D§2§Dl§x§F§C§3§5§3§5p §x§F§C§3§C§3§CA§x§F§C§4§4§4§4d§x§F§C§4§B§4§Bv§x§F§C§5§3§5§3a§x§F§C§5§A§5§An§x§F§D§6§2§6§2c§x§F§D§6§9§6§9e§x§F§D§7§1§7§1d§x§F§D§7§8§7§8W§x§F§D§8§0§8§0e§x§F§D§8§7§8§7l§x§F§D§8§F§8§Fc§x§F§D§9§6§9§6o§x§F§D§9§E§9§Em§x§F§E§A§5§A§5e§x§F§E§A§D§A§DT§x§F§E§B§4§B§4i§x§F§E§B§C§B§Ct§x§F§E§C§3§C§3l§x§F§E§C§B§C§Be §x§F§E§D§2§D§2f§x§F§E§D§A§D§Ao§x§F§F§E§1§E§1r §x§F§F§E§9§E§9h§x§F§F§F§0§F§0e§x§F§F§F§8§F§8l§x§F§F§F§F§F§Fp");
        }
        else if (AdvancedWelcomeTitle.config.getString("welcometitle.secondtext") == null) {
            event.getPlayer().sendTitle("§x§F§B§0§0§0§0W§x§F§C§2§B§2§Be§x§F§C§5§5§5§5l§x§F§D§8§0§8§0c§x§F§E§A§A§A§Ao§x§F§E§D§5§D§5m§x§F§F§F§F§F§Fe" + "§r "  + event.getPlayer().getName(),"§x§F§B§0§0§0§0U§x§F§B§0§8§0§8s§x§F§B§0§F§0§Fe §x§F§B§1§7§1§7/§x§F§B§1§E§1§Eh§x§F§C§2§6§2§6e§x§F§C§2§D§2§Dl§x§F§C§3§5§3§5p §x§F§C§3§C§3§CA§x§F§C§4§4§4§4d§x§F§C§4§B§4§Bv§x§F§C§5§3§5§3a§x§F§C§5§A§5§An§x§F§D§6§2§6§2c§x§F§D§6§9§6§9e§x§F§D§7§1§7§1d§x§F§D§7§8§7§8W§x§F§D§8§0§8§0e§x§F§D§8§7§8§7l§x§F§D§8§F§8§Fc§x§F§D§9§6§9§6o§x§F§D§9§E§9§Em§x§F§E§A§5§A§5e§x§F§E§A§D§A§DT§x§F§E§B§4§B§4i§x§F§E§B§C§B§Ct§x§F§E§C§3§C§3l§x§F§E§C§B§C§Be §x§F§E§D§2§D§2f§x§F§E§D§A§D§Ao§x§F§F§E§1§E§1r §x§F§F§E§9§E§9h§x§F§F§F§0§F§0e§x§F§F§F§8§F§8l§x§F§F§F§F§F§Fp");
        }

        if (AdvancedWelcomeTitle.config.get("welcometitle.firsttext") != null && AdvancedWelcomeTitle.config.get("welcometitle.secondtext") != null){
            event.getPlayer().sendTitle(AdvancedWelcomeTitle.config.getString("welcometitle.firsttext") + "§r " + AdvancedWelcomeTitle.config.getString("welcometitle.playercolor") + event.getPlayer().getName(), AdvancedWelcomeTitle.config.getString("welcometitle.secondtext"));
        }

    }
}