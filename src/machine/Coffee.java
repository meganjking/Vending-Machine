package machine;

/**
 * Created by Megan on 7/26/2016.
 */
public class Coffee extends Beverage {
    String temperature = "Hot";


    public Coffee(int quantity, double price){
        this.quantity = quantity;
        this.price = price;
        bodilyBehavior = new BodyAlert();
    }

    public String getDescription(){
        return super.getDescription() + "Coffee";
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
