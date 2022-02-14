package dev.vy.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemCommands implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        
        Player player = (Player) sender;

        ItemStack item = new ItemStack(Material.SUGAR);

        Inventory inv = Bukkit.createInventory(null, 9 * 6, "Test");

        inv.setItem(1, item);

        player.openInventory(inv);



        return true;
    }


    
}
