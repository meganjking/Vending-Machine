package machine;

/**
 * Created by Megan on 7/27/2016.
 */
public class Inventory {
    private static Inventory uniqueInstance;
    Goods[] goods;

    private Inventory(){}

    public static synchronized Inventory getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Inventory();
        }
        return uniqueInstance;
    }

    public void setInventory(Goods[] goods){
        this.goods = goods;
    }

    public int getInventory(int selection){
        return goods[selection-1].getQuantity();
    }

    public void removeInventory(int selection){
        goods[selection-1].setQuantity(goods[selection-1].getQuantity()-1);

    }

    public boolean isSelectionValid(int selection, int vendingMachineSize){
        // Check that selection is valid
        if(selection != 0 && selection <= vendingMachineSize){
            // Check that selection is in stock
            if(!uniqueInstance.isStockAvailable(selection)){
                System.out.println("Out of stock");
                return false;
            }
            return uniqueInstance.isStockAvailable(selection);
        }else{
            System.out.println("Invalid selection");
            return false;
        }
    }

    public boolean isStockAvailable(int selection){
        try{
            if(uniqueInstance.getInventory(selection) > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public boolean isInventoryAvailable(int vendingMachineSize){
        boolean flag = false;
        for(int i = 0; i < vendingMachineSize; i++){
            if(isStockAvailable(i+1)){
                flag = true;
            }
        }
        return flag;
    }




}
