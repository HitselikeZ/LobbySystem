package de.hitselikez.invs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Inv_prot implements Listener {

    @EventHandler
    public void oninv(InventoryClickEvent e) {

        e.setCancelled(true);

    }

}
