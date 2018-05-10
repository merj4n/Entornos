import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTestSuma {

    private SimpleCalculator calculator;

    @Test
    public void add() {
        this.calculator = new SimpleCalculator();
        float n1 = 7;
        float n2 = 6;
        float expected = 13;
        float actual;
        actual = this.calculator.add(n1, n2);
        assertEquals(expected, actual, 0.000);
    }
}