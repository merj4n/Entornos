import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest4 {

    @Test
    @Ignore
    public void getName() {
        Employee Juan = new Employee(2,"Juan",22000);

        Assert.assertEquals("Juan",Juan.getName());
    }
}