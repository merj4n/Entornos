import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTestResta {

    private SimpleCalculator calculator;

    @Test
    public void subtract() {
        this.calculator = new SimpleCalculator();
        float n1 = 7;
        float n2 = 6;
        float expected = 1;
        float actual;
        actual = this.calculator.subtract(n1, n2);
        assertEquals(expected, actual, 0.000);

    }
}