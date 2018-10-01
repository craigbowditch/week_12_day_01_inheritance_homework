import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Davy", "JK4321A", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Davy", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JK4321A", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, developer.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2000);
        assertEquals(32000, developer.getSalary(), 0.001);
    }

    @Test
    public void canPayBonusOfOnePercent() {
        assertEquals(300, developer.payBonus(), 0.001);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        developer.raiseSalary(-10);
        assertEquals(30000, developer.getSalary(), 0.001);
    }

    @Test
    public void canChangeName() {
        developer.setName("Stevie");
        assertEquals("Stevie", developer.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        developer.setName(null);
        assertEquals("Davy", developer.getName());
    }
}
