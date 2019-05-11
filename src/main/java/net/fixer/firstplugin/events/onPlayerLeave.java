package net.fixer.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onPlayerLeave implements Listener {

    @EventHandler
    void onPlayerQuit(PlayerQuitEvent e){
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.GOLD + "[" + ChatColor.DARK_AQUA + "Server" + ChatColor.GOLD + "]" + ChatColor.AQUA + " Good bye " + ChatColor.RED + player.getDisplayName() + ChatColor.AQUA + "!");
    }
}
