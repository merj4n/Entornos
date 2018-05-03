import com.JUnit.intellij.test.SimpleCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTestDivide {


    private SimpleCalculator calculator;
    @Test
    public void divide() {
        this.calculator = new SimpleCalculator();
        float n1 = 7;
        float n2 = 6;
        float actual;
        actual = this.calculator.divide(n1, n2);
        assertTrue(actual>0);
    }
}