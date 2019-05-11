package net.fixer.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("heal")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.setHealth(20.0);
                player.sendMessage(ChatColor.GREEN + "You have been healed!");
            }
        }else{
            System.out.println("You need to be a player to do this.");
        }
        return false;
    }
}
