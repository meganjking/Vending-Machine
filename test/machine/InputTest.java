package machine;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Megan on 7/27/2016.
 */
public class InputTest {

    @Test
    public void getInputReturnsAnInteger() throws Exception{
        Input input = new Input();
        int actualValue = input.getInput();
        assertTrue(Integer.class.isInstance(actualValue));
    }
}
