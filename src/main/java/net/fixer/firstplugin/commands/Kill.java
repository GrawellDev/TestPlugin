package net.fixer.firstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kill implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (args.length == 0){
                player.sendMessage(ChatColor.DARK_RED + "You have just killed yourself!");
                player.setHealth(0);
            }else{
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player){
                    target.sendMessage(ChatColor.RED + "You just got killed son.");
                    target.setHealth(0);
                    player.sendMessage(ChatColor.AQUA + "You just killed a man named " + target.getDisplayName());
                }else{
                    player.sendMessage(ChatColor.RED + "That player does not exists.");
                }
            }
        }
        return false;
    }
}
