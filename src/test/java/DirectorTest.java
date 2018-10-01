import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Dan", "JK12345C", 100000, "Finance", 20000000);
    }

    @Test
    public void hasName() {
        assertEquals("Dan", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JK12345C", director   .getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, director.getSalary(), 0.001);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000);
        assertEquals(110000, director.getSalary(), 0.001);
    }

    @Test
    public void canPayBonusOfTwoPercent() {
        assertEquals(2000, director.payBonus(), 0.001);
    }

    @Test
    public void hasBudget() {
        assertEquals(20000000, director.getBudget(), 0.001);
    }

    @Test
    public void cantRaiseSalaryByNegativeAmount() {
        director.raiseSalary(-10);
        assertEquals(100000, director.getSalary(), 0.001);
    }

    @Test
    public void canChangeName() {
        director.setName("Stevie");
        assertEquals("Stevie", director.getName());
    }

    @Test
    public void nameChangeCantBeNull() {
        director.setName(null);
        assertEquals("Dan", director.getName());
    }
}
