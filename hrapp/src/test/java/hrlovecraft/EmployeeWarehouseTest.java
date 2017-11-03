package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeWarehouseTest {

    EmployeeWarehouse eWH= EmployeeWarehouse.getInstance();
    @Test
    public void addTest() throws Exception {
        Employee expected=new Employee(44,"tom","123 st", "newark", "delaware", "2222222222", "zip@zippity.com");
        eWH.add(expected);
        Employee actual =eWH.get(44);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() throws Exception {



    }

}