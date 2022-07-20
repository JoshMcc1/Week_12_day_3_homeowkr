import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest
{
  private Manager manager;

  @Before
  public void before() {
    manager = new Manager("Jim", "AB 11 22 33 C", 35000.00, "Accounting");
  }

  @Test
  public void hasName() {
    assertEquals("Jim", manager.getName());
  }

  @Test
  public void hasNiNumber() {
    assertEquals("AB 11 22 33 C", manager.getNINumber());
  }

  @Test
  public void hasDeptName() {
    assertEquals("Accounting", manager.getDeptName());
  }

  @Test
  public void canSetNameValid() {
    manager.setName("James");
    assertEquals("James", manager.getName());
  }

  @Test
  public void canSetNameInValid() {
    manager.setName("");
    assertEquals("Jim", manager.getName());
  }

  @Test
  public void canPayBonus() {
    assertEquals(350.00, manager.payBonus(), 0.0);
  }

  @Test
  public void canRaiseSalaryValid() {
    manager.raiseSalary(1550.99);
    assertEquals(36550.99, manager.getSalary(), 0.0);
  }

  @Test
  public void canRaiseSalaryInValid() {
    manager.raiseSalary(-1550.99);
    assertEquals(35000.00, manager.getSalary(), 0.0);
  }
}
