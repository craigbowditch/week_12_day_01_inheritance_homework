import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "JK1234A", 50000, "Finance");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JK1234A", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, manager.getSalary(), 0.001);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(51000, manager.getSalary(), 0.001);
    }

    @Test
    public void canPayBonusOfOnePercent() {
        assertEquals(500, manager.payBonus(), 0.001);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        manager.raiseSalary(-10);
        assertEquals(50000, manager.getSalary(), 0.001);
    }

    @Test
    public void canChangeName() {
        manager.setName("Stevie");
        assertEquals("Stevie", manager.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }
}
