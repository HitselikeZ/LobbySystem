package de.hitselikez.listeners;

import de.hitselikez.invs.Startinv;
import de.hitselikez.main.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e ) {

        Player p = (Player) e.getPlayer();

        Main.build.put(p, false);

        new Startinv(p);


        if (p.hasPermission("join.admin")) {

            e.setJoinMessage("§a--> §7Der Spieler §4" + p.getName() + " §7ist dem Server beigetreten !");

        } else {

            e.setJoinMessage("§a--> §7Der Spieler §6" + p.getName() + " §7ist dem Server beigetreten !");

        }

    }

}
