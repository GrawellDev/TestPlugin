package net.fixer.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sendWord implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (args.length > 0){

                // Si puede usarse cualquier palabra y se busca limitar los caracteres, entonces usa:
                //player.sendMessage(args[0]);

                if (args[0].equals("garbage")){
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are garbage");
                }else if (args[0].equalsIgnoreCase("tree")){
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are a tree");
                }else{
                    player.sendMessage(ChatColor.DARK_RED + "Specify: tree or garbage");
                }
            }else{
                player.sendMessage(ChatColor.RED + "You need to give the command an argument");
                player.sendMessage(ChatColor.AQUA + "/sendWord <args>");
            }

        }else{
            System.out.println("This command can't be issued from console");
        }

        return false;
    }
}
