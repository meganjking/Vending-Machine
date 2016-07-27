package machine;

/**
 * Created by Megan on 7/26/2016.
 */
public abstract class Beverage extends Goods {
    String description = "Beverage: ";
    String temperature;

    public String getTemperature(){
        return temperature;
    }

    public String getDescription(){
        return description;
    }

}
