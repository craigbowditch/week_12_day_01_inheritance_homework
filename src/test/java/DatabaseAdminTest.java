import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jeff", "JK4321B", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Jeff", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JK4321B", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000);
        assertEquals(27000, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canPayBonusOfOnePercent() {
        assertEquals(250, databaseAdmin.payBonus(), 0.001);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        databaseAdmin.raiseSalary(-10);
        assertEquals(25000, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Stevie");
        assertEquals("Stevie", databaseAdmin.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        databaseAdmin.setName(null);
        assertEquals("Jeff", databaseAdmin.getName());
    }
}
