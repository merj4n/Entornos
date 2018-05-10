import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    private SimpleCalculator calculator;
    @Before
    public void setUp() {
        this.calculator = new SimpleCalculator();
    }
    @Test
    public void testsubtract() {
        float n1 = 1;
        float n2 = 1;
        float expected = 25;
        float actual;
        actual = this.calculator.subtract(n1, n2);
        assertEquals(expected, actual, 0.000);

    }
}
