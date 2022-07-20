package staff.techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee
{
  public DatabaseAdmin(String name, String nINumber, double salary)
  {
    super(name, nINumber, salary);
  }

  @Override
  public double payBonus()
  {
    return this.getSalary() * 0.01;
  }
}
