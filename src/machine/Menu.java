package machine;

/**
 * Created by Megan on 7/26/2016.
 */
public class Menu {
    Goods[] goods;
    int vendingMachineSize;

    public void printMenu(Goods[] goods, int vendingMachineSize){
//        this.goods = goods;
//        this.vendingMachineSize = vendingMachineSize;
        for(int i = 0; i < vendingMachineSize; i++){
            System.out.println((i+1) + ": " + goods[i].getDescription() + "    " +
                    "Price: " + goods[i].getPrice() + " Quantity: " + goods[i].getQuantity());
        }
        System.out.println("Please select desired product");
    }

}
