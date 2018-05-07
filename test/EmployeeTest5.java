import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest5 {

    private Employee empleado = new Employee(12,"Juan",2210);



    @Test
    public void getPropValue() {

  String salida=empleado.getPropValue("key3");

        Assert.assertNotNull("WARNING!",salida);

    }

    @Test
    public void getPropValue2() {

        String salida=empleado.getPropValue("key9");

        Assert.assertNull("WARNING!",salida);

    }

    @Test
    public void getPropValue3() {

        String salida=empleado.getPropValue("key2");
        String salida2=empleado.getPropValue("key4");

        Assert.assertEquals(salida,salida2);

    }

    @Test
    public void getPropValue4() {

        String salida=empleado.getPropValue("key1");
        String salida2=empleado.getPropValue("key2");

        Assert.assertNotEquals(salida,salida2);

    }

}