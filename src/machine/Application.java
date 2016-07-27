package machine;

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
        //this is what i had
        int selection = 0;
        int vendingMachineSize = 3;
        double refund = 0;
//
        Menu menu = new Menu();
        Input input = new Input();
        Dispenser dispenser = new Dispenser();
        Bank bank = new Bank();
        /*     This doesn't work, gives aArrayList<Goods> goods = new Arrayrray required, but java.util.ArrayList<machine.Goods> found
        List<Goods>();

        goods.add(new Water(3,1.50));
        goods.add(new Coffee(4,2.00));
        goods.add(new FizzyWater(2,1.75));
        */

        Goods[] goods = new Goods[vendingMachineSize];

        goods[0] = new Water(0,1.50);
        goods[1] = new Coffee(4,2.00);
        goods[2] = new FizzyWater(2,1.75);

// Print menu, get selection, and check that selection is valid.
        do{
            menu.printMenu(goods, vendingMachineSize);
            selection = input.getInput();
        }while(!dispenser.dispenseCheck(selection, vendingMachineSize, goods));

// Accept money and check amount
        System.out.println("Insert Money");
        bank.acceptMoney((double) input.getInputMoney());
        while(!bank.checkMoney(selection,bank.getMoney(),goods)){
            bank.acceptMoney(bank.getMoney() + (double) input.getInputMoney());
        }

// Dispense goods
        dispenser.dispense(selection, goods);
        refund = bank.changeCalculator(selection,bank.getMoney(),goods);
        bank.acceptMoney(bank.getMoney() - refund);
        System.out.println("Amount Paid: " + bank.getMoney());
        System.out.println("Amount Refunded: " + refund);

        menu.printMenu(goods, vendingMachineSize);;

    }

}
