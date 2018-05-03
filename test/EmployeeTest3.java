import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest3 {

    @Test
    public void getName() {
        Employee Juan = new Employee(2,"Juan",22000);

        Assert.assertEquals("Juan",Juan.getName());
    }

    @Test
    public void getSalary() {
        Employee Manuel = new Employee(3,"Manuel",25000);

        Assert.assertEquals(25000,Manuel.getSalary());
    }
}