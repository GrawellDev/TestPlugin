package net.fixer.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("feed")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                if (player.hasPermission("firstplugin.feed")){
                    player.setFoodLevel(20);
                    player.setSaturation(20);
                    player.setExhaustion(0);
                    player.sendMessage(ChatColor.GREEN + "Your hunger has been restored!");
                }else{
                    player.sendMessage(ChatColor.RED + "You don't have access to this command.");
                }
            }
        }else{
            System.out.println("You need to be a player to do this.");
        }
        return false;
    }
}
