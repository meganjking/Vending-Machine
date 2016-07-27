package machine;

import java.util.Scanner;

/**
 * Created by Megan on 7/26/2016.
 */
public class Input {

    public void Input(){}

    public int getInput(){
        int input;
        Scanner in = new Scanner(System.in);

        input = in.nextInt();
        return input;
    }

    public float getInputMoney(){
        float input;
        Scanner in = new Scanner(System.in);

        input = in.nextFloat();
        return input;
    }
}
