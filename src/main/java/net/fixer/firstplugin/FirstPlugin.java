package net.fixer.firstplugin;

import net.fixer.firstplugin.commands.*;
import net.fixer.firstplugin.events.onDeath;
import net.fixer.firstplugin.events.onPlayerJoin;
import net.fixer.firstplugin.events.onPlayerLeave;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("This is now starting up!");
        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new onDeath(), this);
        getServer().getPluginManager().registerEvents(new onPlayerLeave(), this);
        getServer().getPluginManager().registerEvents(new onDeath(), this);
        // Events
        getCommand("god").setExecutor(new God());
        getCommand("heal").setExecutor(new HealCMD());
        getCommand("list").setExecutor(new ListCMD());
        getCommand("feed").setExecutor(new FeedCMD());
        getCommand("explode").setExecutor(new Explode());
        getCommand("sendWord").setExecutor(new sendWord());
        getCommand("Kill").setExecutor(new Kill());
        getCommand("vault").setExecutor(new VaultCommand());
        // Commands
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        // Config

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("This is now shut down!");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equals("printMessageFromConfig")){
            Player player = (Player) sender;
            String food = getConfig().getString("Food");
            int number = getConfig().getInt("Number");
            boolean Boolean = getConfig().getBoolean("Boolean");
            String thirditem = getConfig().getStringList("FoodList").get(2);
            player.sendMessage(ChatColor.AQUA + "The food in the config.yml is " + ChatColor.RED + food + ChatColor.AQUA + "!");
        }else if(command.getName().equals("setFood")){
            getConfig().set("Food", "Shrimp");
        }

        return false;
    }
}
