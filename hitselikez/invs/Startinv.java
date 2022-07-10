package de.hitselikez.invs;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Startinv {

    ItemStack navigator;
    ItemMeta navigator_meta;

    ItemStack extras;
    ItemMeta extras_meta;

    ItemStack freunde;
    ItemMeta freunde_meta;

    public Startinv(Player p) {

        navigator = new ItemStack(Material.COMPASS);
        navigator_meta = navigator.getItemMeta();
        navigator_meta.setDisplayName("§6Navigator");
        navigator.setItemMeta(navigator_meta);

        extras = new ItemStack(Material.NETHER_STAR);
        extras_meta = extras.getItemMeta();
        extras_meta.setDisplayName("§aExtras");
        extras.setItemMeta(extras_meta);

        freunde = new ItemStack(Material.PLAYER_HEAD);
        freunde_meta = freunde.getItemMeta();
        freunde_meta.setDisplayName("§2Freunde");
        freunde.setItemMeta(freunde_meta);


        p.getInventory().clear();
        p.getInventory().setItem(4, navigator);
        p.getInventory().setItem(2, extras);
        p.getInventory().setItem(6, freunde);

    }


}
