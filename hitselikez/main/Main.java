package de.hitselikez.main;

import de.hitselikez.cmds.Build;
import de.hitselikez.listeners.JoinListener;
import de.hitselikez.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class Main extends JavaPlugin {

    public static HashMap<Player, Boolean> build = new HashMap<Player, Boolean>();
    public static String sys = "§6[System] §7 ";
    public static String noperms = sys + "Dazu hast du keine Rechte";

    @Override
    public void onEnable() {

        Bukkit.getServer().getConsoleSender().sendMessage("§aDas Plugin wurde gestartet !");

        //Commands: ----------------------------------------------------------------------------------------------------

        getCommand("build").setExecutor(new Build());

        //Listeners: ---------------------------------------------------------------------------------------------------

        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new QuitListener(), this);

    }

    @Override
    public void onDisable() {

        Bukkit.getServer().getConsoleSender().sendMessage("§4Das Plugin wurde gestoppt !");


    }
}
