package net.fixer.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onPlayerJoin implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.GOLD + "[" + ChatColor.DARK_AQUA + "Server" + ChatColor.GOLD + "]" + ChatColor.AQUA + " Welcome back " + ChatColor.DARK_RED + player.getDisplayName() + ChatColor.AQUA + "!");
        e.getPlayer().setHealth(20);
        e.getPlayer().sendMessage(ChatColor.GREEN + "You have been healed!");
    }
}
