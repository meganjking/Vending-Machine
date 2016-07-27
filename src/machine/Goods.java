package machine;

/**
 * Created by Megan on 7/26/2016.
 */
public abstract class Goods {
    String description;
    int quantity = 0;
    double price;

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

}
