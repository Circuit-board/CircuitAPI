package cool.circuit.circuitAPI.menusystem;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class menu implements InventoryHolder {

    protected String title;

    protected int slots;

    protected Inventory inv;

    protected MenuUtility menuUtility;

    public menu(MenuUtility menuUtility) {
        this.menuUtility = menuUtility;
    }

    public abstract void setMenuItems();

    public abstract String getTitle();

    public abstract int getSlots();

    public abstract void handleClicks(InventoryClickEvent e);



    protected void addMenuBorder() {
        // Set the top and bottom borders
        for (int i = 0; i < 9; i++) {
            if (i == 0 || i == 8) { // First and last positions on top and bottom rows
                inv.setItem(i, new ItemStack(Material.RED_STAINED_GLASS_PANE));
            } else if (i == 1 || i == 7) { // Second and second to last positions
                inv.setItem(i, new ItemStack(Material.ORANGE_STAINED_GLASS_PANE));
            } else { // Middle items in top and bottom rows
                inv.setItem(i, new ItemStack(Material.YELLOW_STAINED_GLASS_PANE));
            }
        }
    }

    public void open() {
        inv = Bukkit.createInventory(this,getSlots(),getTitle());

        this.setMenuItems();

        menuUtility.getPlayer().openInventory(inv);
    }

}
