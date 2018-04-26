import static org.junit.Assert.*;

public class SumaTest {

    private Suma sumatorio;

    @org.junit.Test
    public void sumar() {

        int n1=2;
        int n2=3;

        this.sumatorio= new Suma(n1,n2);

        float expected = 5;
        int actual;
        actual = this.sumatorio.sumar(n1, n2);
        assertEquals(expected, actual, 0.000);
    }

}