import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest
{
  private static Developer developer;

  @Before
  public void before() {
    developer = new Developer("Ken", "AS 44 33 22 L", 50000.00);
  }

  @Test
  public void hasName() {
    assertEquals("Ken", developer.getName());
  }

  @Test
  public void hasNiNumber() {
    assertEquals("AS 44 33 22 L", developer.getNINumber());
  }

  @Test
  public void canSetNameValid() {
    developer.setName("Kenny");
    assertEquals("Kenny", developer.getName());
  }

  @Test
  public void canSetNameInValid() {
    developer.setName("");
    assertEquals("Ken", developer.getName());
  }

  @Test
  public void canPayBonus() {
    assertEquals(500.00, developer.payBonus(), 0.0);
  }

  @Test
  public void canRaiseSalaryValid() {
    developer.raiseSalary(1550.99);
    assertEquals(51550.99, developer.getSalary(), 0.0);
  }

  @Test
  public void canRaiseSalaryInValid() {
    developer.raiseSalary(-1550.99);
    assertEquals(50000.00, developer.getSalary(), 0.0);
  }

}
