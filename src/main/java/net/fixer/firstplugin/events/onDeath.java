package net.fixer.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class onDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        e.getEntity().sendMessage(ChatColor.AQUA + "Thank you for playing a UHC provided by the Fixer Network!");
        e.getEntity().sendMessage(ChatColor.AQUA + "You can now spectate other players but will be unable to interact with the game");
        e.getEntity().setGameMode(GameMode.CREATIVE);
        e.getEntity().setFlying(true);
    }

}
