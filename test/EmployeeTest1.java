import org.junit.Assert;

public class EmployeeTest1 {

    @org.junit.Test
    public void obtengoEmpleado() {

        String empleado = Employee.getEmpNameWithHighestSalary();
        System.out.println(empleado);
        Assert.assertEquals("Marina",empleado);
    }

}