package de.hitselikez.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {

        Player p = (Player) e.getPlayer();

        if (p.hasPermission("join.admin")) {

            e.setQuitMessage("§a--> §7Der Spieler §4" + p.getName() + " §7hat den Server verlassen !");

        } else {

            e.setQuitMessage("§a--> §7Der Spieler §6" + p.getName() + " §7hat den Server verlassen !");

        }

    }

}
