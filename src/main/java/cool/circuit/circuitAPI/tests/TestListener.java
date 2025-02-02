package cool.circuit.circuitAPI.tests;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import static cool.circuit.circuitAPI.CircuitAPI.getMenuUtility;

public class TestListener implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        // Check if the event is triggered by a player and whether the inventory is the one from MenuTest
        if(e.getView().getTitle().equals("Test")) {
            MenuTest menu = new MenuTest(getMenuUtility((Player) e.getWhoClicked()));
            menu.handleClicks(e);
        }
    }

}
