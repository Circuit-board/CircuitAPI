package cool.circuit.circuitAPI.tests;

import cool.circuit.circuitAPI.menusystem.MenuUtility;
import cool.circuit.circuitAPI.menusystem.menu;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class MenuTest extends menu {


    public MenuTest(MenuUtility menuUtility) {
        super(menuUtility);
    }

    @Override
    public void setMenuItems() {
        addMenuBorder();
    }

    @Override
    public String getTitle() {
        return "Test";
    }

    @Override
    public int getSlots() {
        return 9*3;
    }

    @Override
    public void handleClicks(InventoryClickEvent e) {
        e.setCancelled(true);
    }


    @Override
    public @NotNull Inventory getInventory() {
        return inv;
    }
}
