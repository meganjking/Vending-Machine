package machine;

/**
 * Created by Megan on 7/28/2016.
 */
public class Cookie extends Goods {

    public Cookie(int quantity, double price){
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return "Cookie";
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
