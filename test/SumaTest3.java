import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SumaTest3 {

    private Suma prueba3;

    @Test
    public void sumar() {

        int n1=2;
        int n2=-3;

        this.prueba3 = new Suma(n1,n2);
        int resultado = this.prueba3.sumar(n1,n2);

        assertTrue(n1>n2);



    }
}