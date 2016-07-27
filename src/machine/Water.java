package machine;

/**
 * Created by Megan on 7/26/2016.
 */
public class Water extends Beverage {
    String temperature = "Cold";


    public Water(int quantity, double price){
        this.quantity = quantity;
        this.price = price;
    }

    public String  getDescription(){
        return super.getDescription() + "Water";
    }

    public int getQuantity(){
        return quantity;
    }

    public String getTemperature(){
        return temperature;
    }

    public double getPrice(){
        return price;
    }

}
