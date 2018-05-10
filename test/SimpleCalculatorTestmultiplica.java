import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTestmultiplica {

    private SimpleCalculator calculator;
    @Test
    public void multiply() {
        this.calculator = new SimpleCalculator();
        float n1 = 7;
        float n2 = 6;
        float expected = 42;
        float actual;
        actual = this.calculator.multiply(n1, n2);
        assertEquals(expected, actual, 0.000);
    }
}