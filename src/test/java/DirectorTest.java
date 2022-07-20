import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest
{
  private static Director director;

  @Before
  public void before() {
    director = new Director("Ava", "AA 22 33 44 F", 75000.00, "Management", 123456778.00);
  }

  @Test
  public void hasName() {
    assertEquals("Ava", director.getName());
  }

  @Test
  public void hasNiNumber() {
    assertEquals("AA 22 33 44 F", director.getNINumber());
  }

  @Test
  public void hasDeptName() {
    assertEquals("Management", director.getDeptName());
  }

  @Test
  public void hasBudget() {
    assertEquals(123456778.00, director.getBudget(), 0.0);
  }

  @Test
  public void canSetNameValid() {
    director.setName("Ariana");
    assertEquals("Ariana", director.getName());
  }

  @Test
  public void canSetNameInValid() {
    director.setName("");
    assertEquals("Ava", director.getName());
  }

  @Test
  public void canPayBonus() {
    assertEquals(1500.00, director.payBonus(), 0.0);
  }

  @Test
  public void canRaiseSalaryValid() {
    director.raiseSalary(1550.99);
    assertEquals(76550.99, director.getSalary(), 0.0);
  }

  @Test
  public void canRaiseSalaryInValid() {
    director.raiseSalary(-1550.99);
    assertEquals(75000.00, director.getSalary(), 0.0);
  }
}
