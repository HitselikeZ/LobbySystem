package de.hitselikez.listeners;

import de.hitselikez.main.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class Prot_Listener implements Listener {

    @EventHandler
    public void onBreake(BlockBreakEvent e) {

        Player p = e.getPlayer();

        if (!Main.build.get(p)) {

            e.setCancelled(true);
            p.sendMessage("§4Kein Zugriff !");

        }


    }

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {

        Player p = e.getPlayer();

        if (!Main.build.get(p)) {

            e.setCancelled(true);
            p.sendMessage("§4Kein Zugriff !");

        }


    }

}
