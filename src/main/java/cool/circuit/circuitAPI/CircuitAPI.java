package cool.circuit.circuitAPI;

import cool.circuit.circuitAPI.commands.TestCommand;
import cool.circuit.circuitAPI.menusystem.MenuUtility;
import cool.circuit.circuitAPI.tests.TestListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class CircuitAPI extends JavaPlugin {

    private static final HashMap<Player, MenuUtility> MenuUtilityMap = new HashMap<>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("test").setExecutor(new TestCommand());
        Bukkit.getPluginManager().registerEvents(new TestListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static MenuUtility getMenuUtility(Player p) {
        MenuUtility menuUtility;
        if (!(MenuUtilityMap.containsKey(p))) {
            menuUtility = new MenuUtility(p);
            MenuUtilityMap.put(p, menuUtility);

            return menuUtility;
        } else {
            return MenuUtilityMap.get(p);
        }
    }
}
