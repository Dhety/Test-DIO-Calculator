import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testCalculator (){
        Calculator calculator = new Calculator();
        int sum = calculator.sum("1+3");

         Assertions.assertEquals(4, sum);
    }
}
