import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Roi.Amir on 30/06/2016.
 */
public class EmployeeTest {
    @Test
    public void salary() throws Exception {
        Employee  emp = new Employee("1", 55.4, 7.5);
        assertEquals(55.4d*7.5d, emp.salary(),0.00001);
    }

    @Test
    public void toStringTest() throws Exception {
        Employee  emp = new Employee("2", 55.4, 7.5);
        assertEquals("Name:2 Rate:55.40 Hours:7.50", emp.toString());
    }

    @Test
    public void bonus() throws Exception {
        Employee  emp = new Employee("3", 16.4, 209.3);
        assertEquals(16.4d*209.3d*0.1d, emp.bonus(),0.00001);

    }

}