import org.junit.Test;

import static org.junit.Assert.*;

public class SumaTest2 {

    private Suma prueba2;

    @Test
    public void sumar() {
        int n1=-2;
        int n2=-3;

        prueba2 = new Suma(n1,n2);

        int resultado=this.prueba2.sumar(n1,n2);
        assertTrue(resultado<0);


    }
}