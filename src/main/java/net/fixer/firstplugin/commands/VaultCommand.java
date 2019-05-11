package net.fixer.firstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class VaultCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;

            Inventory vault = Bukkit.createInventory(player, 64,"§bFixer Network");

            ItemStack item1 = new ItemStack(Material.CLAY_BALL, 1);

            item1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1000);
            ItemMeta meta = item1.getItemMeta();
            meta.setDisplayName(ChatColor.AQUA + "§9Arena PvP");
            meta.setUnbreakable(true);
            ArrayList<String> lore = new ArrayList<>();
            lore.add(ChatColor.DARK_PURPLE + "Competitive PvP");
            lore.add(ChatColor.DARK_PURPLE + "Join with others " + Bukkit.getOnlinePlayers());
            meta.setLore(lore);
            item1.setItemMeta(meta);

            vault.addItem(item1);

            player.openInventory(vault);

         // In case of need more items on this


         //   vault.setItem(2, item1);

         //   vault.addItem(item1);

         //   vault.clear();

         //   ItemStack item2 = new ItemStack(Material.GOLDEN_APPLE, 1);
         // ItemStack[] items = {item1, item2};

         // vault.setContents(items);

         // ItemStack[] items2 = vault.getContents();

         // player.openInventory(vault);

        }else{
        System.out.println("This command can't be execute from console");
        }
        return true;
    }
}
