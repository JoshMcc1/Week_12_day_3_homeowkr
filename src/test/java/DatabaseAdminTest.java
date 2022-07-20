import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest
{
  private static DatabaseAdmin databaseAdmin;

  @Before
  public void before() {
    databaseAdmin = new DatabaseAdmin("Ken", "AS 44 33 22 L", 50000.00);
  }

  @Test
  public void hasName() {
    assertEquals("Ken", databaseAdmin.getName());
  }

  @Test
  public void hasNiNumber() {
    assertEquals("AS 44 33 22 L", databaseAdmin.getNINumber());
  }

  @Test
  public void canSetNameValid() {
    databaseAdmin.setName("Kenny");
    assertEquals("Kenny", databaseAdmin.getName());
  }

  @Test
  public void canSetNameInValid() {
    databaseAdmin.setName("");
    assertEquals("Ken", databaseAdmin.getName());
  }

  @Test
  public void canPayBonus() {
    assertEquals(500.00, databaseAdmin.payBonus(), 0.0);
  }

  @Test
  public void canRaiseSalaryValid() {
    databaseAdmin.raiseSalary(1550.99);
    assertEquals(51550.99, databaseAdmin.getSalary(), 0.0);
  }

  @Test
  public void canRaiseSalaryInValid() {
    databaseAdmin.raiseSalary(-1550.99);
    assertEquals(50000.00, databaseAdmin.getSalary(), 0.0);
  }
}
