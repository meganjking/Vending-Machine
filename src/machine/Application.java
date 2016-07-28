package machine;

import javax.naming.InvalidNameException;
import java.util.ArrayList;


/**
 * Created by Megan on 7/26/2016.
 */
public class Application {
    //if not a STATIC method for the main
//    Menu menu;
//    Input input;
//    Dispenser dispenser;
//
//    Application() {
//        menu =  new Menu();
//        input = new Input();
//        dispenser = new Dispenser();
//    }


    public static void main(String[] args) {

// Set up the vending machine
        VendingMachineStuff vendingMachineStuff = new VendingMachineStuff();
        vendingMachineStuff.setVendingMachineSize(3);

        // Fill up the vending machine
        Goods[] goods = new Goods[vendingMachineStuff.getVendingMachineSize()];
        goods[0] = new Water(1,1.50);
        goods[1] = new Coffee(1,2.00);
        goods[2] = new FizzyWater(2,1.75);

        // Set inventory
        Inventory inventory = Inventory.getInstance();
        inventory.setInventory(goods);

        do{
            // Print menu, get selection, and check that selection is valid.
            vendingMachineStuff.menuAndSelection(goods,vendingMachineStuff.getVendingMachineSize());
            // Accept money and check amount
            vendingMachineStuff.moneyStuff(goods);
            // Dispense goods
            vendingMachineStuff.dispenseGoods(goods);
        } while (vendingMachineStuff.continueFunctions());



    }

}
