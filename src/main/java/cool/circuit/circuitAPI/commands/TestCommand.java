package cool.circuit.circuitAPI.commands;

import cool.circuit.circuitAPI.menusystem.MenuUtility;
import cool.circuit.circuitAPI.tests.MenuTest;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can use this command!");
        }

        assert sender instanceof Player;
        Player player = (Player) sender;

        MenuTest menu = new MenuTest(new MenuUtility(player));
        menu.open();

        return true;
    }
}
