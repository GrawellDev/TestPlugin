package net.fixer.firstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ListCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("list")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.sendMessage(ChatColor.GOLD + "====================");
                player.sendMessage(ChatColor.AQUA + "Player List");
                player.sendMessage(ChatColor.WHITE + " ");
                player.sendMessage(ChatColor.BLUE + "Total Players Online:" + ChatColor.GOLD + "[" + ChatColor.DARK_AQUA + Bukkit.getOnlinePlayers().size() +
                        ChatColor.RED + "/" + ChatColor.DARK_AQUA + "20" + ChatColor.GOLD + "]");
                player.sendMessage(ChatColor.WHITE + " ");
                player.sendMessage(ChatColor.GOLD + "====================");
            }else{
                System.out.println("You need to be a player to do this.");
            }
        }return true;
    }
}
