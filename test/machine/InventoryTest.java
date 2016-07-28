package machine;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Megan on 7/27/2016.
 */
public class InventoryTest {

    @Test
    public void stockCheckShouldReturnTrueWhenThereIsStock() throws Exception {
        Inventory inventory = Inventory.getInstance();
        Goods[] goods = new Goods[3];
        goods[0] = new Water(0,1.50);
        goods[1] = new Coffee(4,2.00);
        goods[2] = new FizzyWater(2,1.75);
        inventory.setInventory(goods);
        assertTrue(inventory.isStockAvailable(2));
    }

    @Test
    public void stockCheckShouldReturnFalseWhenThereIsNoStock() throws Exception {
        Inventory inventory = Inventory.getInstance();
        Goods[] goods = new Goods[0];
        inventory.setInventory(goods);
        assertTrue(!inventory.isStockAvailable(1));
    }
}
