package staff.management;

import staff.Employee;

public class Manager extends Employee
{
  private static String deptName;

  public Manager(String name, String nINumber, double salary, String deptName)
  {
    super(name, nINumber, salary);
    this.deptName = deptName;
  }

  public static String getDeptName()
  {
    return deptName;
  }

  @Override
  public double payBonus()
  {
    return this.getSalary() * 0.01;
  }


}
