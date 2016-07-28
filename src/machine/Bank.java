package machine;

/**
 * Created by Megan on 7/26/2016.
 */
public class Bank {
    private static Bank uniqueInstance;
    double bankFunds = 0;
    double cashInserted;

    private Bank(){}

    public static synchronized Bank getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Bank();
        }
        return uniqueInstance;
    }

    public void acceptMoney(double cash){ // can change to float
        this.cashInserted += cash;
        bankFunds += cash;
    }

    public double getMoney(){
        return cashInserted;
    }

    public void clearTransaction(){
        cashInserted = 0.0;
    }

    public boolean checkMoney(int selection, double cash, Goods[] goods){
        if(cash >= goods[selection-1].getPrice()){
            return true;
        }else {
            System.out.println("Insufficient funds. Please insert more money.");
            return false;
        }
    }

    public double changeCalculator(int selection, double cash, Goods[] goods){
        double refund;
        refund = cash - goods[selection-1].getPrice();
        bankFunds -= refund;

        return refund;

    }

    public void printFunds(){
        System.out.println("The vending machine has collected $" + bankFunds);
    }
}
