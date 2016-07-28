package machine;

/**
 * Created by Megan on 7/27/2016.
 */
public class VendingMachineStuff {
    int vendingMachineSize;
    int selection;
    double refund;
    Menu menu;
    Bank bank;
    Dispenser dispenser;
    Input input;
    Inventory inventory;

    public VendingMachineStuff(){
        menu = new Menu();
        bank = Bank.getInstance();
        dispenser = new Dispenser();
        input = new Input();
        inventory = Inventory.getInstance();
    }

    public void setVendingMachineSize(int vendingMachineSize){
        this.vendingMachineSize = vendingMachineSize;
    }
    public int getVendingMachineSize(){
        return vendingMachineSize;
    }

    public void menuAndSelection(Goods[] goods,int vendingMachineSize){
        do{
            menu.printMenu(goods, vendingMachineSize);
            selection = input.getInput();
        }while(!inventory.isSelectionValid(selection, vendingMachineSize));
    }

    public void moneyStuff(Goods[] goods){
        System.out.println("Insert Money");
        bank.acceptMoney((double) input.getInputMoney());
        while(!bank.checkMoney(selection,bank.getMoney(),goods)){
            bank.acceptMoney((double) input.getInputMoney());
        }
    }

    public void dispenseGoods(Goods[] goods){
        dispenser.dispense(selection);
        refund = bank.changeCalculator(selection,bank.getMoney(),goods);
        System.out.println("Amount Paid: " + bank.getMoney());
        System.out.println("Amount Refunded: " + refund);
        bank.clearTransaction();
    }

    public boolean continueFunctions(){
        if(inventory.isInventoryAvailable(vendingMachineSize)) {
            System.out.println("To begin next transaction, enter 1");
            System.out.println("To check vending machine funds, enter 2");
            System.out.println("To turn off vending machine, enter 3");

            int in = input.getInput();
            if (in == 3) {
                return false;
            } else if (in == 2) {
                bank.printFunds();
                return true;
            } else {
                return true;
            }
        }else{
            System.out.println("Vending machine empty");
            return false;
        }
    }

}
