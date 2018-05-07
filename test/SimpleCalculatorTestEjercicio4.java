import org.junit.Assert;
import org.junit.Test;
import com.JUnit.intellij.test.SimpleCalculator;

import static org.junit.Assert.*;

public class SimpleCalculatorTestEjercicio4 {

        private SimpleCalculator calcular;
    @Test
    public void isEvenNumber() {

        this.calcular = new SimpleCalculator();

        int x=4;
        boolean respuesta=calcular.isEvenNumber(x);

        Assert.assertTrue("Es impar",respuesta);

    }
    @Test
    public void isEvenNumber2() {

        this.calcular = new SimpleCalculator();

        int x = 6;
        boolean respuesta = calcular.isEvenNumber(x);

        Assert.assertTrue("Es impar", respuesta);

    }

    @Test
    public void isEvenNumber3() {

        this.calcular = new SimpleCalculator();

        int x = 5;
        boolean respuesta = calcular.isEvenNumber(x);

        Assert.assertTrue("Es impar", respuesta);

    }

    @Test
    public void isEvenNumber4() {

        this.calcular = new SimpleCalculator();

        int x = 7;
        boolean respuesta = calcular.isEvenNumber(x);

        Assert.assertTrue("Es impar", respuesta);

    }
}