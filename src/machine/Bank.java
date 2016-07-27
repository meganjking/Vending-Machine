package machine;

/**
 * Created by Megan on 7/26/2016.
 */
public class Bank {
    boolean flag;
    int selection;
    double cash;
    Goods[] goods;

    public void acceptMoney(double cash){
        this.cash = cash;
    }

    public double getMoney(){
        return cash;
    }

    public boolean checkMoney(int selection, double cash, Goods[] goods){
// Don't need these since we're not updating the bank values here
//        this.selection = selection;
//        this.cash = cash;
//        this.goods = goods;

        if(cash >= goods[selection-1].getPrice()){
            flag = true;
        }else {
            System.out.println("Insufficient money inserted. Please insert more money.");
            flag = false;
        }
        return flag;
    }

    public double changeCalculator(int selection, double cash, Goods[] goods){

        return (cash - goods[selection-1].getPrice());
    }
}
