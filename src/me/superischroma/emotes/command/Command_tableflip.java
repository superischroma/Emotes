package me.superischroma.emotes.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_tableflip implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String cmdLabel, String[] args) 
    {
        Player player = (Player) cs;
		if (cmdLabel.equalsIgnoreCase("tableflip")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " flips the table!");
			return true;
		}
        return false;
    }
}
