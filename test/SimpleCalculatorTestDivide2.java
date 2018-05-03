import com.JUnit.intellij.test.SimpleCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTestDivide2 {

    private SimpleCalculator calculator;
    @Test
    public void divide() {
        this.calculator = new SimpleCalculator();
        float n1 = 7;
        float n2 = 0;
        float actual;

        try {
            actual = this.calculator.divide(n1, n2);
        }catch (ArithmeticException e){

            assert true;

        }

    }
}