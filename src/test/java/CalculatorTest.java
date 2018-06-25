import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator(2,2);
    }

    @Test
    public void hasInputOne() {
        assertEquals(2, calculator.getInputOne());
    }

    @Test
    public void hasInputTwo(){
        assertEquals(2, calculator.getInputTwo());
    }

    @Test
    public void addNumbers() {
        assertEquals( 4, calculator.addNumbers());
    }

    @Test
    public void subtractNumbers(){
        assertEquals(0, calculator.subtractNumbers());
    }

    @Test
    public void divideNumbers(){
        assertEquals(1, calculator.divideNumbers());
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(4, calculator.multiplyNumbers());
    }
}



