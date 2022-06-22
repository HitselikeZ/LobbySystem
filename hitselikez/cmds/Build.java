package de.hitselikez.cmds;

import de.hitselikez.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Build implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        Player p = (Player) sender;

        if (args.length == 0) {

            if (p.hasPermission("Lobby.Build")) {

                if (!Main.build.get(p)) {

                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage(Main.sys + "Du bist nun im Build-Modus !");
                    Main.build.put(p , true);

                } else {

                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage(Main.sys + "Du bist nun nicht mehr im Build-Modus !");
                    Main.build.put(p , false);

                }

            } else {

                p.sendMessage(Main.noperms);

            }


        } else if (args.length == 1) {

            if (p.hasPermission("Lobby.Build.Other")) {

                Player t = Bukkit.getPlayer(args[0]);

                if (t.isOnline() && t.hasPlayedBefore()) {

                    if (!Main.build.get(t)) {

                        t.setGameMode(GameMode.CREATIVE);
                        t.sendMessage(Main.sys + "Du bist nun im Build-Modus !");
                        Main.build.put(t , true);

                        p.sendMessage(Main.sys + "Du hast den Spieler §6" + t.getName() + " §7in den Build-Modus gesetzt !");

                    } else {

                        t.setGameMode(GameMode.SURVIVAL);
                        t.sendMessage(Main.sys + "Du bist nun nicht mehr im Build-Modus !");
                        Main.build.put(t , false);

                        p.sendMessage(Main.sys + "Du hast den Spieler §6" + t.getName() + " §7aus dem Build-Modus gesetzt !");


                    }

                } else {

                    p.sendMessage(Main.sys + "Spieler nicht gefunden !");

                }

            } else {

                p.sendMessage(Main.noperms);

            }


        } else {

            p.sendMessage(Main.sys + "Nutze bitte: §1'/build [Player]' §7!");

        }

        return false;
    }
}
