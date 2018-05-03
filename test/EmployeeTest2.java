import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest2 {

    @Test
    public void getHighestPaidEmployee() {

        Employee prueba = new Employee(1,"Marina",30000);

        Assert.assertEquals(prueba,Employee.getHighestPaidEmployee());
    }
}