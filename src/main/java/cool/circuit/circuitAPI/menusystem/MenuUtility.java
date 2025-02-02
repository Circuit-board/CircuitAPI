package cool.circuit.circuitAPI.menusystem;

import org.bukkit.entity.Player;

public class MenuUtility {

    protected Player player;

    public MenuUtility(Player player){
        this.player = player;
    }

    protected Player getPlayer() {
        return player;
    }
}
