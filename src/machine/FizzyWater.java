package machine;

/**
 * Created by Megan on 7/26/2016.
 */
public class FizzyWater extends Beverage {
    String temperature = "Cold";


    public FizzyWater(int quantity, double price){
        this.quantity = quantity;
        this.price = price;
        bodilyBehavior = new BodyThirst();
    }

    public String getDescription(){
        return super.getDescription() + "Fizzy Water";
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
