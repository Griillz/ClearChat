package main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandClearChat implements CommandExecutor {
	Player p;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			p = (Player) sender;
		} else {
			p.setDisplayName("Console");
		}
		if (label.equalsIgnoreCase("clearchat")) {
			if (p.hasPermission("ClearChat.clear") || p.getDisplayName().equalsIgnoreCase("Console")) {
				for (int i = 0; i < 100; i++) {
					Bukkit.broadcastMessage("");
				}
				Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.YELLOW + "Voltram" + ChatColor.GRAY + "]"
						+ ChatColor.LIGHT_PURPLE + " The chat has been cleared by " + ChatColor.RED
						+ p.getDisplayName());
			} else {
				p.sendMessage(ChatColor.DARK_RED + "Insufficient Permissions!");
			}
		}
		return true;
	}

}
