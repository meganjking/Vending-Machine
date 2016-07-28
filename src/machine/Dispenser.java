package machine;

/**
 * Created by Megan on 7/26/2016.
 */
public class Dispenser {
    Inventory inventory;

    public Dispenser(){
        inventory = Inventory.getInstance();
    }

    public void dispense(int selection){
        inventory.removeInventory(selection);

        System.out.println("One " + inventory.goods[selection-1].getDescription() + " Dispensed");

    }

//    public boolean dispenseCheck(int selection, int vendingMachineSize, Goods[] goods){
//        boolean flag;
//        this.selection = selection;
//        this.vendingMachineSize = vendingMachineSize;
//        this.goods = goods;
//
//        //Check that selection is valid
//        if(selection != 0 && selection <= this.vendingMachineSize){
//            flag = true;
//        }else{
//            System.out.println("Invalid Selection");
//            flag = false;
//        }
//        //Check that selection is in stock
//        if(flag){
//            if(goods[selection-1].getQuantity() > 0){
//                goods[selection-1].setQuantity(goods[selection-1].getQuantity()-1);
//                flag = true;
//            }else {
//                System.out.println("Out of Stock");
//                flag = false;}
//        }
//
//        return flag;
//    }
}
